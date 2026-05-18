public Account(String requestedName){
    String saved = requestedName;

    for(int i = 1; !isAvailable(saved); i++){
      saved = requestedName + i;
    }

    this.username = saved;
}
