package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import e5.n;
import fj.c;
import fj.l;
import va.o;
import va.p;
import xj.d;
import xj.f;
import xj.h;

/* loaded from: classes3.dex */
public class CircularProgressIndicator extends a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f32918n = l.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.circularProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.a
    public final xj.c b(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, f32918n);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f32928a;
        d dVar = new d(circularProgressIndicatorSpec);
        Context context2 = getContext();
        xj.l lVar = new xj.l(context2, circularProgressIndicatorSpec, dVar, new f(circularProgressIndicatorSpec));
        Resources resources = context2.getResources();
        int i14 = fj.f.indeterminate_static;
        p pVar = new p();
        ThreadLocal threadLocal = n.f57243a;
        pVar.f125036a = resources.getDrawable(i14, null);
        new o(pVar.f125036a.getConstantState());
        lVar.f135126n = pVar;
        setIndeterminateDrawable(lVar);
        setProgressDrawable(new h(getContext(), circularProgressIndicatorSpec, dVar));
    }
}
