package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public boolean cheeseSelected = false;
    public boolean toppingsSelected = false;
    public boolean carryBagSelected = false;

    public int billAmount = 0;


    public Pizza( Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
    }

    public Pizza(int price, Boolean isVeg, String bill) {
        this.price = price;
        this.isVeg = isVeg;
        this.bill = bill;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;

    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (cheeseSelected == false) {
            billAmount += + 80;
            cheeseSelected = true;
            //System.out.println("Extra Cheese Added: 80");


        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsSelected==false && isVeg==true)
        {
            billAmount +=  70;
            toppingsSelected=true;
            //System.out.println("Extra Toppings Added: 70");
        }
        else if(toppingsSelected==false && isVeg==false)
        {
            billAmount += 120;
            toppingsSelected=true;
            //System.out.println("Extra Toppings Added: 70");
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(carryBagSelected==false)
        {
            billAmount +=  + 20;
            carryBagSelected=true;
            //System.out.println("Paperbag Added: 20");
        }

        }


    public String getBill(){
        // your code goes here
        //bill = Integer.toString(billAmount);
        //System.out.println("Total Price: "+bill);
        if(isVeg == true)
        {
            billAmount += 300;
            System.out.println("Base Price Of The Pizza: 300");
        }
        else {
            billAmount += 400;
            System.out.println("Base Price Of The Pizza: 400");
        }

        if(cheeseSelected==true)
        {
            System.out.println("Extra Cheese Added: 80");
        }

        if(toppingsSelected==true && isVeg==true)
        {
            System.out.println("Extra Toppings Added: 70");
        }
        else if(toppingsSelected==true && isVeg==false)
        {
            System.out.println("Extra Toppings Added: 120");
        }

        if(carryBagSelected==true)
        {
            System.out.println("Paperbag Added: 20");
        }

        bill = Integer.toString(billAmount);

        System.out.print("Total Bill: ");

        return this.bill;
    }
}
