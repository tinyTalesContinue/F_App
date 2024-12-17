package pr;

public class PrimesSpawner {
	//Easyの場合
	private int[] initPrimesEasy = {2, 3, 5, 7};
	
	//Normalの場合
	private int[] initPrimesNomal = {2, 3, 5, 7, 11, 13};
	
	//入力エラー
	private int[] error = {-1};
	
	//使いたい素因数を配列として返す関数
	public int[] init(char difficulty) {
		
		//難易度Eの場合
		if (difficulty == 'E') {
			return initPrimesEasy;
		}
		
		//難易度Nの場合
		if (difficulty == 'N') {
			return initPrimesNomal;
		}
		
		//それ以外の入力は現状取り決めなし
		return error;
	}
}
