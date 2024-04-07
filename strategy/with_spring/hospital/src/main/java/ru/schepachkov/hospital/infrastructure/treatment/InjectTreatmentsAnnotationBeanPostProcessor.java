package ru.schepachkov.hospital.infrastructure.treatment;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.beans.Introspector;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class InjectTreatmentsAnnotationBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Set<Field> fields = ReflectionUtils.getAllFields(bean.getClass(), field -> field.isAnnotationPresent(InjectTreatments.class));
        for (Field field : fields) {
            InjectTreatments annotation = field.getAnnotation(InjectTreatments.class);
            List<Object> treatments = Arrays.stream(annotation.value())
                .map(clazz -> Introspector.decapitalize(clazz.getSimpleName()))
                .map(name -> applicationContext.getBean(name))
                .collect(Collectors.toList());
            field.setAccessible(true);
            field.set(bean, treatments);
        }
        return bean;
    }
}
