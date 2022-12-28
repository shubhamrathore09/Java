package shipMent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String packNumber;
    private String content;
    private double weight;
    private String senderAddress;
    private String receiverAddress;
    private LocalDateTime localDateTime;

    public Shipment(int id, String packNumber, String content, double weight, String senderAddress, String receiverAddress, LocalDateTime localDateTime) {
        this.id = id;
        this.packNumber = packNumber;
        this.content = content;
        this.weight = weight;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.localDateTime = localDateTime;
    }

    public Shipment(String packNumber, String content, double weight, String senderAddress, String receiverAddress, LocalDateTime localDateTime) {
        this.packNumber = packNumber;
        this.content = content;
        this.weight = weight;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.localDateTime = localDateTime;
    }

    public Shipment(String packNumber, String content, double weight, String senderAddress, String receiverAddress) {
        this.packNumber = packNumber;
        this.content = content;
        this.weight = weight;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
    }

    public Shipment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPackNumber() {
        return packNumber;
    }

    public void setPackNumber(String packNumber) {
        this.packNumber = packNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "id=" + id +
                ", packNumber='" + packNumber + '\'' +
                ", content='" + content + '\'' +
                ", weight=" + weight +
                ", senderAddress='" + senderAddress + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
