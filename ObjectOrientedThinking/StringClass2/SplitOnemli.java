package StringClass2;

public class SplitOnemli {
	public static void main(String[] args) {
		String[] tokens = "JAVA#HTML#Perl".split("#");
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + " ");
		}
		String s = "The earliest surviving English poetry may have been composed in the 7th century. It is written in Old English or Anglo-Saxon, the direct predecessor of modern English. The highest poetic achievement in Old English literature is Beowulf, a 3182 line epic by an unknown author. Following the Norman conquest of England in the 11th century, Anglo-Saxon rapidly diminished as a written literary language and it was not until the 14th century that major works of English literature began to appear once again. The poet Geoffrey Chaucer (1343 – 1400) is credited with legitimizing the literary use of the Middle English vernacular at a time when the dominant literary languages in England were French and Latin. Due to this, Chaucer is referred to as the Father of English literature. With the discovery of the New World and the rise of Great Britain as an international superpower, English spread to other parts of the world. Hence, many of the best known English poems are written by authors who don’t belong to England. Here are the 10 most famous English poems of all time.";
		String[] kelimeler = s.split(" ");
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.println(kelimeler[i] + " ");
		}
	}
}
