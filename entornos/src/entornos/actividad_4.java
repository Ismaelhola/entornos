/**
 * 
 */
package entornos;

/**
 * @author Usuario
 *
 */
public class actividad_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nif vminif = new Nif();
		Nif minif= new Nif(5991162,'F');
		
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		minif.setLetra('F');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());


	}

}
