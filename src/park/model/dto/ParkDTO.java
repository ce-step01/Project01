package park.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ParkDTO {
	private int num;
	private String parkName;
	private String openingDate;
	private String principalSpecies;
	private String directions;
	private String location;
	private String officeNumber;
	private String keyFacilities;

}
