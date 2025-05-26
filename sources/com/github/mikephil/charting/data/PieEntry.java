package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.util.Log;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public class PieEntry extends Entry {
    @Override // com.github.mikephil.charting.data.Entry
    public final float b() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return this.f30176c;
    }
}
