package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import n.c0;
import n.n;
import n.o;
import n.q;
import x92.b;

/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements n, c0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16175b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public o f16176a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // n.c0
    public final void a(o oVar) {
        this.f16176a = oVar;
    }

    @Override // n.n
    public final boolean b(q qVar) {
        return this.f16176a.r(qVar, null, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        b((q) getAdapter().getItem(i13));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b N = b.N(context, attributeSet, f16175b, i13, 0);
        if (N.G(0)) {
            setBackgroundDrawable(N.x(0));
        }
        if (N.G(1)) {
            setDivider(N.x(1));
        }
        N.O();
    }
}
