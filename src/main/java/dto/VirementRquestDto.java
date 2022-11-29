package dto;


public class VirementRquestDto {
	
	public Long codeSource;
	private  Long  codeDestination;
	private Double  montant;
	public Long getCodeSource() {
		return codeSource;
	}
	public void setCodeSource(Long codeSource) {
		this.codeSource = codeSource;
	}
	public Long getCodeDestination() {
		return codeDestination;
	}
	public void setCodeDestination(Long codeDestination) {
		this.codeDestination = codeDestination;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public VirementRquestDto(Long codeSource, Long codeDestination, Double montant) {
		
		this.codeSource = codeSource;
		this.codeDestination = codeDestination;
		this.montant = montant;
	}
	
	public VirementRquestDto() {
	
		}
	
	
	
	

}
