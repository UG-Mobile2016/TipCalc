package me.juancrg90.tipcalc.fragments;

import me.juancrg90.tipcalc.models.TipRecord;

/**
 * Created by JuanCrg90 on 10/10/16.
 */

public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
