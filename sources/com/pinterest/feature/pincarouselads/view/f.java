package com.pinterest.feature.pincarouselads.view;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ui.grid.PinterestRecyclerView;

/* loaded from: classes2.dex */
public abstract class f extends PinterestRecyclerView implements af2.c {

    /* renamed from: k, reason: collision with root package name */
    public ye2.o f47375k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f47376l;

    public f(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (this.f47376l) {
            return;
        }
        this.f47376l = true;
        ((n) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47375k == null) {
            this.f47375k = new ye2.o(this);
        }
        return this.f47375k;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47375k == null) {
            this.f47375k = new ye2.o(this);
        }
        return this.f47375k.generatedComponent();
    }
}
