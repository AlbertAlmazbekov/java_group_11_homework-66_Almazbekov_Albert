package com.example.homework66.dto;

import com.example.homework66.entity.Gadget;
import com.example.homework66.entity.GadgetType;
import lombok.*;

@Getter
@Setter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GadgetDTO {
    private int id;
    private String name;
    private String image;
    private GadgetTypeDTO type;
    private float price;

    public static GadgetDTO from(Gadget gadget) {
        GadgetTypeDTO typeDTO = GadgetTypeDTO.from(gadget.getGadgetType());
        return builder()
                .id(gadget.getId())
                .name(gadget.getName())
                .type(typeDTO)
                .image(gadget.getImage())
                .price(gadget.getPrice())
                .build();
    }
}
