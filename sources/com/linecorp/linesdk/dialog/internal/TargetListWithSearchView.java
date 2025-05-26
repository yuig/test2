package com.linecorp.linesdk.dialog.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import rn.g;
import rn.h;
import vn.a;

/* loaded from: classes3.dex */
public class TargetListWithSearchView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f34137a;

    /* renamed from: b, reason: collision with root package name */
    public SearchView f34138b;

    public TargetListWithSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        L();
    }

    public final void L() {
        View inflate = View.inflate(getContext(), h.layout_select_target, this);
        this.f34137a = (RecyclerView) inflate.findViewById(g.recyclerView);
        this.f34138b = (SearchView) inflate.findViewById(g.searchView);
        this.f34138b.G = new a(this);
    }

    public TargetListWithSearchView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        L();
    }
}
