import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TestLambda implements RequestHandler<InputObject, OutputObject> {

	private ProcessingService service;

	TestLambda() {
		this.service = new ProcessingService();
	}

    @Override
    public OutputObject handleRequest(InputObject input, Context context) {
        return service.process(input);
    }
}
