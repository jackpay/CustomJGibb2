package runner;

import jgibblda.Estimator;
import jgibblda.LDACmdOption;

public class Runner {

	
	public void run() {
		int iters = 1000;
		LDACmdOption ldaOption = new LDACmdOption(); 
		ldaOption.alpha = 0.00001;
		ldaOption.beta =  0.00000000000000000000000001;
		ldaOption.dir = "/Volumes/BackupHD/Phd-LDA/JGibbOutput";
		ldaOption.inf = false;
		ldaOption.savestep = iters;
		//"300-rand-web-dataset.txt";
		ldaOption.dfile =  "normalised-5000-random-tfidf-dataset.txt";
		ldaOption.est = true;
		ldaOption.K = 20;
		ldaOption.niters = iters;
		ldaOption.modelName = "";
		Estimator est = new Estimator();
		est.init(ldaOption);
		est.estimate();
	}
	
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.run();
	}
}
