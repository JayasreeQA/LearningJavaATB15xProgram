package ex_05_TypeCasting;

public class Lab059_TypeCastingNarrowing {

    public static void main() {

        int val =300;

        //  0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
        //byte b2= val;  // Implicit Narrowing - Not possible

        byte b2= (byte) val; // Explicit Narrowing - data loss will be there as we are changing larger to smaller data type

        System.out.println(b2);
        // 0 0 1 0 1 1 0 0         // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = **44.**
        //**(00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀**

    }
}
