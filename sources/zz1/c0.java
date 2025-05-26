package zz1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements gm1.a, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f143169b;

    public /* synthetic */ c0(d0 d0Var, int i13) {
        this.f143168a = i13;
        this.f143169b = d0Var;
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        switch (this.f143168a) {
        }
        return new kotlin.jvm.internal.p(1, this.f143169b, d0.class, "handleGestaltEvent", "handleGestaltEvent(Lcom/pinterest/gestalt/component/GestaltEvent;)V", 0);
    }

    public final boolean equals(Object obj) {
        switch (this.f143168a) {
            case 0:
                if ((obj instanceof gm1.a) && (obj instanceof kotlin.jvm.internal.m)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof gm1.a) && (obj instanceof kotlin.jvm.internal.m)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(c(), ((kotlin.jvm.internal.m) obj).c());
    }

    @Override // gm1.a
    public final void h3(gm1.c p03) {
        int i13 = this.f143168a;
        d0 d0Var = this.f143169b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                d0Var.Y7(p03);
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                d0Var.Y7(p03);
                break;
        }
    }

    public final int hashCode() {
        switch (this.f143168a) {
        }
        return c().hashCode();
    }
}
