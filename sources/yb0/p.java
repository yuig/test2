package yb0;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.gestalt.modalAlert.GestaltModalAlert;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import t80.r;
import u50.i0;

/* loaded from: classes5.dex */
public final class p extends FrameLayout implements q, gm1.b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f138529f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f138530a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138532c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltModalAlert f138533d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.q f138534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, o initialDisplayState) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f138530a = 17;
        this.f138531b = -1;
        this.f138532c = -2;
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(this, initialDisplayState);
        this.f138534e = qVar;
        getLayoutParams();
        int G0 = dl2.b.G0(this, eo1.a.comp_modalalert_wrapper_margin);
        setPaddingRelative(G0, getPaddingTop(), G0, getPaddingBottom());
        o oVar = (o) ((u50.o) qVar.f33803a);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltModalAlert gestaltModalAlert = new GestaltModalAlert(context2, new xm1.e(oVar.f138519a, oVar.f138520b, oVar.f138521c, oVar.f138522d, oVar.f138523e, oVar.f138524f, oVar.f138525g, oVar.f138526h, oVar.f138527i, oVar.f138528j));
        this.f138533d = gestaltModalAlert;
        addView(gestaltModalAlert);
        r nextState = new r(22, this, (o) ((u50.o) qVar.f33803a));
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    @Override // yb0.q
    public final int a() {
        return this.f138530a;
    }

    @Override // yb0.q
    public final void b(d dismissReason) {
        Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
        gm1.a aVar = (gm1.a) this.f138534e.f33804b;
        if (aVar != null) {
            aVar.h3(new xm1.o(this.f138533d.getId()));
        }
    }

    @Override // yb0.q
    public final CharSequence c() {
        i0 i0Var = this.f138533d.T().f135364b;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return i0Var.a(context);
    }

    @Override // yb0.q
    public final boolean d() {
        return this.f138533d.T().f135369g;
    }

    @Override // yb0.q
    public final int e() {
        return this.f138531b;
    }

    public final p f(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (p) this.f138534e.c(eventHandler, new r(21, this, eventHandler));
    }

    @Override // yb0.q
    public final int getLayoutHeight() {
        return this.f138532c;
    }

    @Override // yb0.q
    public final CharSequence getTitle() {
        i0 i0Var = this.f138533d.T().f135363a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return i0Var.a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm1.a aVar = (gm1.a) this.f138534e.f33804b;
        if (aVar != null) {
            aVar.h3(new xm1.q(this.f138533d.getId()));
        }
        postDelayed(new c2(this, 8), 500L);
    }
}
