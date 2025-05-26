package com.pinterest.navigation.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import l0.k;
import q5.d1;
import q5.v0;
import q6.c;
import qu1.a;
import r70.b;

/* loaded from: classes2.dex */
public final class BottomNavigationBehavior<V extends View> extends VerticalScrollingBehavior<V> {

    /* renamed from: h, reason: collision with root package name */
    public static final c f49946h = new c();

    /* renamed from: d, reason: collision with root package name */
    public final b f49947d;

    /* renamed from: e, reason: collision with root package name */
    public d1 f49948e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f49949f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49950g;

    public BottomNavigationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49947d = b.c();
        this.f49949f = false;
        this.f49950g = false;
    }

    @Override // com.pinterest.navigation.view.behavior.VerticalScrollingBehavior
    public final void C(View view, int i13, a aVar) {
        if ((aVar != a.SCROLL_DIRECTION_UP || i13 <= 100) && (aVar != a.SCROLL_DIRECTION_DOWN || i13 >= -100)) {
            return;
        }
        F(view, aVar);
    }

    @Override // com.pinterest.navigation.view.behavior.VerticalScrollingBehavior
    public final void D(View view, a aVar) {
        F(view, aVar);
    }

    public final void E(View view, int i13) {
        d1 d1Var = this.f49948e;
        if (d1Var == null) {
            d1 b13 = v0.b(view);
            b13.c(200L);
            b13.d(f49946h);
            this.f49948e = b13;
        } else {
            d1Var.b();
        }
        d1 d1Var2 = this.f49948e;
        if (d1Var2 != null) {
            d1Var2.h(i13);
            d1Var2.f(new yq1.d1(this, 3));
            d1Var2.e(new k(this, i13, 14));
            d1Var2.g();
        }
    }

    public final void F(View view, a aVar) {
        b bVar = this.f49947d;
        if (bVar.f106354d) {
            boolean z13 = view.getTranslationY() != 0.0f;
            if (aVar == a.SCROLL_DIRECTION_DOWN) {
                bVar.f106353c = true;
                if (!z13 || this.f49949f) {
                    return;
                }
                E(view, 0);
                return;
            }
            if (aVar == a.SCROLL_DIRECTION_UP) {
                bVar.f106353c = false;
                if (z13 || this.f49950g) {
                    return;
                }
                E(view, view.getHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin);
            }
        }
    }
}
