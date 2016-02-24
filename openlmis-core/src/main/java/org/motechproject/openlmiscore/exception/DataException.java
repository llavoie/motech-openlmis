package org.motechproject.openlmiscore.exception;

public class DataException extends RuntimeException {

    // In OpenLMIS source, this is a special type for i8n. Omitting that functionality for now and using String.
    private String openLmisMessage;

    public DataException(String code) {
        openLmisMessage = code;
    }

    public String getOpenLmisMessage() {
        return openLmisMessage;
    }

    @Override
    public String toString() {
        return openLmisMessage.toString();
    }

    @Deprecated
    @Override
    public String getMessage() {
        return openLmisMessage.toString();
    }

}
