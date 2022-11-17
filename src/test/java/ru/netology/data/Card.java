package ru.netology.data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String numberCard;
    private String month;
    private String year;
    private String holderCard;
    private String cvc;
}
