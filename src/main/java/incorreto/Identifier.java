package incorreto;

// Fonte: https://edisciplinas.usp.br/pluginfile.php/2266784/mod_resource/content/1/relatorio_teste.pdf
// Figura 1: Programa exemplo: identifier (contém ao menos um erro).

/****************************************************************************************
Identifier.java
ESPECIFICACAO: O programa deve determinar se um identificador eh ou nao valido em 'Silly Pascal'
(uma estranha variante do Pascal). Um identificador valido deve comecar com uma letra e conter
apenas letras ou digitos. Alem disso, deve ter no minimo 1 caractere e no maximo 6 caracteres de
comprimento
 ****************************************************************************************/
public class Identifier {
			public boolean validateIdentifier(String s) {
/* 1 */ 		char achar;
/* 1 */ 		boolean valid_id = false;
/* 1 */ 		achar = s.charAt(0);
/* 1 */ 		valid_id = valid_s(achar);
/* 1 */ 		if (s.length() > 1) {
/* 2 */ 			achar = s.charAt(1);
/* 2 */ 			int i = 1;
/* 3 */ 			while (i < s.length() - 1) {
/* 4 */ 				achar = s.charAt(i);
/* 4 */ 				if (!valid_f(achar)){
/* 5 */ 					valid_id = false;}
/* 6 */ 				i++;
/* 6 */ 			}
/* 6 */ 		}
/* 7 */ 		if (valid_id && (s.length() >= 1) & (s.length() < 6))
/* 8 */ 			return true;
/* 9 */ 		else
/* 9 */ 			return false;
/* 10 */ 	}
			public boolean valid_s(char ch) {
/* 1 */ 		if (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')))
/* 2 */ 			return true;
/* 3 */ 		else
/* 4 */ 			return false;
/* 5 */ 	}
			public boolean valid_f(char ch) {
/* 1 */ 		if (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')) || ((ch >= '0') && (ch <= '9')))
/* 2 */ 			return true;
/* 3 */ 		else
/* 4 */ 			return false;
/* 5 */ 	}
/* 10 */}