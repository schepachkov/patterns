import new_api.NewApi;
import new_api.NewApiImpl;
import old_api.OldApiAdapter;
import old_api.OldApiImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<NewApi> apis = new ArrayList<>();
        apis.add(new NewApiImpl());
        apis.add(new OldApiAdapter(new OldApiImpl()));
        apis.forEach(NewApi::execute);
    }
}
