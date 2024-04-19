class RnaTranscription {

    String transcribe(String dnaStrand) {
        String temp="";
        for (char c : dnaStrand.toCharArray()) { 
            switch(c){
                case 'G':
                    temp=temp+'C';
                    break;
                case 'C':
                    temp=temp+'G';
                    break;
                case 'T':
                    temp=temp+'A';
                    break;
                case 'A':
                    temp=temp+'U';
                    break;
            }
        }
        return temp;
       
    }

}
