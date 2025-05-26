package zz1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements gm1.a, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f143171b;

    public /* synthetic */ d(e eVar, int i13) {
        this.f143170a = i13;
        this.f143171b = eVar;
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        switch (this.f143170a) {
        }
        return new kotlin.jvm.internal.p(1, this.f143171b, e.class, "handleGestaltEvent", "handleGestaltEvent(Lcom/pinterest/gestalt/component/GestaltEvent;)V", 0);
    }

    public final boolean equals(Object obj) {
        switch (this.f143170a) {
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
        int i13 = this.f143170a;
        e eVar = this.f143171b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                eVar.Y7(p03);
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                eVar.Y7(p03);
                break;
        }
    }

    public final int hashCode() {
        switch (this.f143170a) {
        }
        return c().hashCode();
    }
}
