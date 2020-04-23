package challenge;

public class CriptografiaCesariana implements Criptografia {



	char[] alfabeto = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};



	@Override
	public String criptografar(String texto) {

		if(texto.toString().isEmpty()) 
			throw new IllegalArgumentException();

		if(texto.toString().equals(null))
			throw new NullPointerException();


		int chave = 3;


		char[] retorno = new char[texto.length()];

		//percorrendo o texto original
		for(int i=0; i<texto.length(); i++) {

			//preservando os espaços
			if(texto.charAt(i)==' ') {
				retorno[i]=texto.charAt(i);

			}else {
				//percorrendo o alfabeto
				for(int j=0; j<alfabeto.length; j++) {

					//caso seja igual
					if(Character.toLowerCase(texto.charAt(i))==alfabeto[j]) {

						if(j<chave) {
							retorno[i]=alfabeto[(j-chave+alfabeto.length)%alfabeto.length];
							j=alfabeto.length;
						}else {
							retorno[i]=alfabeto[(j-chave)%alfabeto.length];
							j=alfabeto.length;
						}

					}else {
						retorno[i]=texto.charAt(i);
					}
				}
			}


		}


		return String.valueOf(retorno);

	}



	@Override
	public String descriptografar(String texto) {
		texto.toLowerCase();

		if(texto.toString().isEmpty()) 
			throw new IllegalArgumentException();

		if(texto.toString().equals(null))
			throw new NullPointerException();


		int chave = -3;

		char[] retorno = new char[texto.length()];

		//percorrendo o texto original
		for(int i=0; i<texto.length(); i++) {

			//preservando os espaços
			if(texto.charAt(i)==' ') {
				retorno[i]=texto.charAt(i);

			}else {
				//percorrendo o alfabeto
				for(int j=0; j<alfabeto.length; j++) {

					//caso seja igual
					if(Character.toLowerCase(texto.charAt(i))==alfabeto[j]) {

						if(j<chave) {
							retorno[i]=alfabeto[(j-chave+alfabeto.length)%alfabeto.length];
							j=alfabeto.length;
						}else {
							retorno[i]=alfabeto[(j-chave)%alfabeto.length];
							j=alfabeto.length;
						}

					}else {
						retorno[i]=texto.charAt(i);
					}
				}
			}


		}


		return String.valueOf(retorno);

	}		
}
