public int moreHistoryThanMathAbsences(){
    int num = 0;
  
    for(int i = 0; i < historyList.size(); i++){
        CourseRecord curH = historyList.get(i);
        
        for(int j = 0; j < mathList.size(); j++){
            CourseRecord curM = historyList.get(i);
          
            if(curH.getStudentID().equals( curM.getStudentID() )){
              if(curH.getAbsences() > curM.getAbsences()) num++;
            }
        }
    }

    return num;
}
