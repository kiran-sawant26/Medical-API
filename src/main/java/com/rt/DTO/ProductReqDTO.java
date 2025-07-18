package com.rt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductReqDTO {

	private int id;
    private String name;
    private String brand;
    private String category;
    private String batchNo;
    private String mfgDate;       
    private String expDate;
    private String purchaseRate;
    private String sellingRate;
    private String quantity;
    private String gst;
    private String rackNo;
}
