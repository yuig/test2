package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f32571b;

    public /* synthetic */ t(w wVar, int i13) {
        this.f32570a = i13;
        this.f32571b = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f32570a;
        w wVar = this.f32571b;
        switch (i13) {
            case 0:
                kg.n.a(view);
                Iterator it = wVar.f32580q.iterator();
                while (it.hasNext()) {
                    p11.j jVar = (p11.j) it.next();
                    Object X1 = wVar.U6().X1();
                    jVar.getClass();
                    int i14 = p11.l.f98658y0;
                    Function1 tmp0 = jVar.f98656a;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(X1);
                }
                wVar.N6(false, false);
                break;
            default:
                kg.n.a(view);
                Iterator it2 = wVar.f32581r.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                wVar.N6(false, false);
                break;
        }
    }
}
