package Part1;

import Part2.Key;

public class PurchaseRecord {
    private Key id_num;
    private int[] item_id_nums;
    private int[] item_quantities;
    private String means_of_payment;

    public PurchaseRecord(Key id, int[] it_id, int[] it_q, String m) {
        this.id_num = id;
        this.item_id_nums = it_id;
        this.item_quantities = it_q;
        this.means_of_payment = m;
    }

    public Key getKey() {
        return this.id_num;
    }

    public int[] getItemIdNums() {
        return this.item_id_nums;
    }

    public int[] getItemQuantities() {
        return this.item_quantities;
    }

    public String getMeansOfPayment() {
        return this.means_of_payment;
    }
}