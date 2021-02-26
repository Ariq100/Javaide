package com.company;

public class Main {

    static float rechargeAmount(float amount, float a)
    {
        return amount + a;
    }

    static float callSomeone(float timeDuration)
    {
        float pmc = 0.71f;

        return pmc - timeDuration;
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile("Someone", "0124534545656756", 15, "Color os", true);

        if (m1.isLock() == true)
        {
            m1.showInfo();

            System.out.println("\n");
        }

        Mobile m2 = new Mobile("Someone Else","345036056587768", 100,"ios", false);

        if (m2.isLock() == true)
        {
            float a = m2.getMobileBalance();

            float amount = 5;

            m2.setMobileBalance(rechargeAmount(5, a));

            m2.showInfo();

            System.out.println("\n");
        }

        Mobile m3 = new Mobile("someone else's wife","021534565", 10000000, "bigsur",true);

        if (m3.isLock() == true)
        {
            float a = m3.getMobileBalance();

            float timeDuration = 7.05f;

            m3.showInfo();
        }
    }
}