class ResistorColor {
String[] resistorColor={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    int colorCode(String color) {
        for(int i=0;i<resistorColor.length;i++){
            if(resistorColor[i].equals(color)){
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
      return resistorColor;
    }
}
