package old_api;

import new_api.NewApi;

public class OldApiAdapter implements NewApi {

    private final OldApi oldApi;

    public OldApiAdapter(OldApi oldApi) {
        this.oldApi = oldApi;
    }

    @Override
    public void execute() {
        oldApi.oldExecute();
    }
}
