package digital.gayan.roomwebproject.services;

import digital.gayan.roomwebproject.models.Positions;
import digital.gayan.roomwebproject.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static final List<Staff> staff = new ArrayList<>();
    static{
        staff.add(new Staff(UUID.randomUUID().toString(), "Gayan", "Kalinga", Positions.CONCIERGE));
        staff.add(new Staff(UUID.randomUUID().toString(), "Dulashi", "Madushika", Positions.FRONT_DESK));
        staff.add(new Staff(UUID.randomUUID().toString(), "Miheli", "Chenaya", Positions.SECURITY));
        staff.add(new Staff(UUID.randomUUID().toString(), "Gihan", "Chinthaka", Positions.HOUSEKEEPING));
        staff.add(new Staff(UUID.randomUUID().toString(), "Maheshi", "Samarasinghe", Positions.HOUSEKEEPING));
    }

    public List<Staff> getAllStaff() {return staff;}
}
