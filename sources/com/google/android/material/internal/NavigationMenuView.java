package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements n.c0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // n.c0
    public final void a(n.o oVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        R2(new LinearLayoutManager(1, false));
    }
}
