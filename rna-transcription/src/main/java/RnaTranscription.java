import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder(dnaStrand);
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='C')
                rnaStrand.setCharAt(i,'G');
            else if(dnaStrand.charAt(i)=='G')
                rnaStrand.setCharAt(i, 'C');
            else if(dnaStrand.charAt(i)=='T')
                rnaStrand.setCharAt(i, 'A');
            else if(dnaStrand.charAt(i)=='A')

                rnaStrand.setCharAt(i, 'U');
        }
        return rnaStrand.toString();
    }

}