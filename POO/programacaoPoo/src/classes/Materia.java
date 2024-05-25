package classes;

public class Materia {
	private double nota1;
	private String materia1;
	
	private double nota2;
	private String materia2;
	
	private double nota3;
	private String materia3;
	
	private double nota4;
	private String materia4;
	
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public String getMateria1() {
		return materia1;
	}
	public void setMateria1(String materia1) {
		this.materia1 = materia1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String getMateria2() {
		return materia2;
	}
	public void setMateria2(String materia2) {
		this.materia2 = materia2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public String getMateria3() {
		return materia3;
	}
	public void setMateria3(String materia3) {
		this.materia3 = materia3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public String getMateria4() {
		return materia4;
	}
	public void setMateria4(String materia4) {
		this.materia4 = materia4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((materia1 == null) ? 0 : materia1.hashCode());
		result = prime * result + ((materia2 == null) ? 0 : materia2.hashCode());
		result = prime * result + ((materia3 == null) ? 0 : materia3.hashCode());
		result = prime * result + ((materia4 == null) ? 0 : materia4.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Materia other = (Materia) obj;
		if (materia1 == null) {
			if (other.materia1 != null)
				return false;
		} else if (!materia1.equals(other.materia1))
			return false;
		if (materia2 == null) {
			if (other.materia2 != null)
				return false;
		} else if (!materia2.equals(other.materia2))
			return false;
		if (materia3 == null) {
			if (other.materia3 != null)
				return false;
		} else if (!materia3.equals(other.materia3))
			return false;
		if (materia4 == null) {
			if (other.materia4 != null)
				return false;
		} else if (!materia4.equals(other.materia4))
			return false;
		if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
			return false;
		if (Double.doubleToLongBits(nota2) != Double.doubleToLongBits(other.nota2))
			return false;
		if (Double.doubleToLongBits(nota3) != Double.doubleToLongBits(other.nota3))
			return false;
		if (Double.doubleToLongBits(nota4) != Double.doubleToLongBits(other.nota4))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Materias [nota1=" + nota1 + ", materia1=" + materia1 + ", nota2=" + nota2 + ", materia2=" + materia2
				+ ", nota3=" + nota3 + ", materia3=" + materia3 + ", nota4=" + nota4 + ", materia4=" + materia4 + "]";
	}
	
	
}
