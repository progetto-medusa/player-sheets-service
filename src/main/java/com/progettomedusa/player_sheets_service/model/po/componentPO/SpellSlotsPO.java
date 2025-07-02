package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SpellSlotsPO {

    @Column(name="spell_slots1")
    private Integer spellSlots1;
    @Column(name="spell_slots1_used")
    private boolean spellSlots1Used;
    @Column(name="spell_slots2")
    private Integer spellSlots2;
    @Column(name="spell_slots2_used")
    private boolean spellSlots2Used;
    @Column(name="spell_slots3")
    private Integer spellSlots3;
    @Column(name="spell_slots3_used")
    private boolean spellSlots3Used;
    @Column(name="spell_slots4")
    private Integer spellSlots4;
    @Column(name="spell_slots4_used")
    private boolean spellSlots4Used;
    @Column(name="spell_slots5")
    private Integer spellSlots5;
    @Column(name="spell_slots5_used")
    private boolean spellSlots5Used;
    @Column(name="spell_slots6")
    private Integer spellSlots6;
    @Column(name="spell_slots6_used")
    private boolean spellSlots6Used;
    @Column(name="spell_slots7")
    private Integer spellSlots7;
    @Column(name="spell_slots7_used")
    private boolean spellSlots7Used;
    @Column(name="spell_slots8")
    private Integer spellSlots8;
    @Column(name="spell_slots8_used")
    private boolean spellSlots8Used;
    @Column(name="spell_slots9")
    private Integer spellSlots9;
    @Column(name="spell_slots9_used")
    private boolean spellSlots9Used;

}
