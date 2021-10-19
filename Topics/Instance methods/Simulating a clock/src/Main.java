class Clock {

    int hours = 12;
    int minutes = 0;

//    public Clock(){
//        this.hours = 12;
//        this.minutes = 0;
//    }

    public void next() {
        // implement me
        if(this.minutes != 59){
            this.minutes++;
        }else{
            this.minutes =0;
            if(this.hours == 12){
                this.hours = 1;
            }else {
                this.hours++;
            }
        }
    }
}