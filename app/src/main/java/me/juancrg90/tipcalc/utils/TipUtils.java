package me.juancrg90.tipcalc.utils;

import java.text.SimpleDateFormat;


import me.juancrg90.tipcalc.entity.TipRecord;

/**
 * Created by JuanCrg90 on 11/3/16.
 */

public class TipUtils {
    public static double getTip(TipRecord tipRecord) {
        return tipRecord.getBill() * (tipRecord.getTipPercentage()/100d);
    }

    public static String getDateFormated(TipRecord tipRecord) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm");
        return simpleDateFormat.format(tipRecord.getTimestamp());
    }
}
