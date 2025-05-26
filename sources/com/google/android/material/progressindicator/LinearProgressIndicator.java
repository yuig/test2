package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import fj.c;
import fj.l;
import java.util.WeakHashMap;
import q5.v0;
import xj.h;
import xj.m;
import xj.n;
import xj.p;

/* loaded from: classes3.dex */
public class LinearProgressIndicator extends a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f32922n = l.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.linearProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.a
    public final xj.c b(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.a
    public final void e(int... iArr) {
        super.e(iArr);
        ((LinearProgressIndicatorSpec) this.f32928a).a();
    }

    @Override // com.google.android.material.progressindicator.a
    public final void f(int i13, boolean z13) {
        xj.c cVar = this.f32928a;
        if (cVar != null && ((LinearProgressIndicatorSpec) cVar).f32923h == 0 && isIndeterminate()) {
            return;
        }
        super.f(i13, z13);
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        xj.c cVar = this.f32928a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) cVar;
        boolean z14 = true;
        if (((LinearProgressIndicatorSpec) cVar).f32924i != 1) {
            WeakHashMap weakHashMap = v0.f102521a;
            if ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) cVar).f32924i != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) cVar).f32924i != 3)) {
                z14 = false;
            }
        }
        linearProgressIndicatorSpec.f32925j = z14;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        int paddingRight = i13 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i14 - (getPaddingBottom() + getPaddingTop());
        xj.l c13 = c();
        if (c13 != null) {
            c13.setBounds(0, 0, paddingRight, paddingBottom);
        }
        h d2 = d();
        if (d2 != null) {
            d2.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, f32922n);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f32928a;
        m mVar = new m(linearProgressIndicatorSpec);
        mVar.f135127b = 300.0f;
        Context context2 = getContext();
        setIndeterminateDrawable(new xj.l(context2, linearProgressIndicatorSpec, mVar, linearProgressIndicatorSpec.f32923h == 0 ? new n(linearProgressIndicatorSpec) : new p(context2, linearProgressIndicatorSpec)));
        setProgressDrawable(new h(getContext(), linearProgressIndicatorSpec, mVar));
    }
}
