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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		builder.append(parkName);
		builder.append(" / 개원일:");
		builder.append(openingDate);
		builder.append(" / 주요 식물:");
		builder.append(principalSpecies);
		builder.append(" / 오시는 길:");
		builder.append(directions);
		builder.append(" / 지역:");
		builder.append(location);
		builder.append(" / 전화번호:");
		builder.append(officeNumber);
		builder.append(" / 주요 시설:");
		builder.append(keyFacilities);
		builder.append("]");
		return builder.toString();
	}

}


