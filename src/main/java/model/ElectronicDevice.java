package model;

public class ElectronicDevice {
	
	String name;
	public ElectronicDevice(String name, Long conso) {
		super();
		this.name = name;
		this.conso = conso;
	}
	Long conso;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getConso() {
		return conso;
	}
	public void setConso(Long conso) {
		this.conso = conso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conso == null) ? 0 : conso.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicDevice other = (ElectronicDevice) obj;
		if (conso == null) {
			if (other.conso != null)
				return false;
		} else if (!conso.equals(other.conso))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ElectronicDevice [name=" + name + ", conso=" + conso + "]";
	}
	

}
