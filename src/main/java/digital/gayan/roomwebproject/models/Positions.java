package digital.gayan.roomwebproject.models;

public enum Positions{
    HOUSEKEEPING, SECURITY, FRONT_DESK, CONCIERGE;

    public String toString(){
        switch(this){
            case HOUSEKEEPING:
                return "Housekeeping";
            case SECURITY:
                return "Security";
            case FRONT_DESK:
                return "Front Desk";
            case CONCIERGE:
                return "Concierge";
        }
        return "";
    }
}
