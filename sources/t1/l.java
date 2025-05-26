package t1;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s3.m;
import s3.q1;
import u2.p;

/* loaded from: classes2.dex */
public final class l implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f115763a;

    public l(p pVar) {
        this.f115763a = pVar;
    }

    @Override // t1.a
    public final Object j(q1 q1Var, Function0 function0, bl2.c cVar) {
        View G = bp1.h.G(this.f115763a);
        long c03 = q1Var.c0(0L);
        a3.d dVar = (a3.d) function0.invoke();
        a3.d h10 = dVar != null ? dVar.h(c03) : null;
        if (h10 != null) {
            G.requestRectangleOnScreen(new Rect((int) h10.f484a, (int) h10.f485b, (int) h10.f486c, (int) h10.f487d), false);
        }
        return Unit.f80348a;
    }
}
