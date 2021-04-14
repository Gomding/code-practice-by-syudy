package spring_handler_methods_20210415;

public class Pet {

    private int petId;
    private int ownerId;

    public Pet(int petId) {
        this.petId = petId;
        this.ownerId = 1;
    }

    public Pet(int petId, int ownerId) {
        this.petId = petId;
        this.ownerId = ownerId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
}
