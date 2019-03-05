package software.kloud.sc;

import java.io.Serializable;

public class StatusResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private ResponseStatus responseStatus;
    private String errorMsg;
    private String payload;

    public StatusResponseDTO() {
    }

    public StatusResponseDTO(ResponseStatus responseStatus, String errorMsg) {
        this.responseStatus = responseStatus;
        this.errorMsg = errorMsg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public StatusResponseDTO(String payload) {
        this.errorMsg = "";
        this.responseStatus = ResponseStatus.SUCCESS;
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
