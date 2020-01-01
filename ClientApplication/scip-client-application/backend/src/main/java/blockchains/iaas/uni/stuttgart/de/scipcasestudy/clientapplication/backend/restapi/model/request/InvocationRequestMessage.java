package blockchains.iaas.uni.stuttgart.de.scipcasestudy.clientapplication.backend.restapi.model.request;

import java.util.List;

import blockchains.iaas.uni.stuttgart.de.scipcasestudy.clientapplication.backend.scipclient.response.Parameter;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class InvocationRequestMessage extends AsyncScipRequestMessage {
    protected String functionIdentifier;
    protected List<Parameter> inputs;
    protected List<Parameter> outputs;
    protected double requiredConfidence;
    protected long timeout;
    protected String signature;


}
