package dto;

import lombok.Data;

@Data
public class VirementRquestDto {
	
	public Long codeSource;
	private  Long  codeDestination;
	private Double  montant;

}
