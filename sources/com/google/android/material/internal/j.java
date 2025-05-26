package com.google.android.material.internal;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class j extends s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i13, LayoutInflater layoutInflater, RecyclerView recyclerView) {
        super(layoutInflater.inflate(fj.i.design_navigation_item_separator, (ViewGroup) recyclerView, false));
        if (i13 != 2) {
        } else {
            super(layoutInflater.inflate(fj.i.design_navigation_item_subheader, (ViewGroup) recyclerView, false));
        }
    }
}
