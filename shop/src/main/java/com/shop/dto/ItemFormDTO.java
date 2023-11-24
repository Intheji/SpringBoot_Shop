package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class ItemFormDTO {
    private Long id;

    @NotBlank(message = "상품명은 필수입력입니다.") //null도 안되고 빈칸도 안됨
    private String itemName;

    @NotNull(message = "가격은 필수입력입니다.")
    private Integer price;

    @NotBlank(message = "이름은 필수입력입니다")
    private String itemDetail;

    @NotBlank(message = "재고는 필수입력입니다.")
    private Integer stockNumber;

    private ItemSellStatus itemSellStatus;

    private List<ItemImgDTO> itemImgDTOList = new ArrayList<>();

    private List<Long> itemImgIds = new ArrayList<>();

    private static ModelMapper modelMapper = new ModelMapper();

    //ModelMapper를 이용하여 ItemFormDTO를 Item엔티티로 매핑하는 메서드
    public Item createItem(){
        return modelMapper.map(this, Item.class);
    }

    //ModelMapper를 이용하여 Item엔티티를 itemFormDTO로 매핑하는 메서드
    public static ItemFormDTO of(Item item){
        return modelMapper.map(item, ItemFormDTO.class);
    }
}