package software.kloud.sc;

import java.io.Serializable;
import java.util.zip.CRC32;

public class TransferDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String payload;
    // CRC32
    private Long checksum;
    private String clazz;

    public TransferDTO() {

    }

    public TransferDTO(String payload, Long checksum, Class<? extends SilverCommunication> clazz) {
        this.payload = payload;
        this.checksum = checksum;
        this.clazz = clazz.getCanonicalName();
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
        var checksumGen = new CRC32();
        checksumGen.update(this.payload.getBytes());
        this.checksum = checksumGen.getValue();
    }

    public Long getChecksum() {
        return checksum;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

}
