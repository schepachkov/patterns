package ru.schepachkov.hospital.infrastructure.treatment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface InjectTreatments {
    Class[] value();
}
