package zz1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class y implements gm1.a, kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f143256b;

    public /* synthetic */ y(z zVar, int i13) {
        this.f143255a = i13;
        this.f143256b = zVar;
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        switch (this.f143255a) {
        }
        return new kotlin.jvm.internal.p(1, this.f143256b, z.class, "handleGestaltEvent", "handleGestaltEvent(Lcom/pinterest/gestalt/component/GestaltEvent;)V", 0);
    }

    public final boolean equals(Object obj) {
        switch (this.f143255a) {
            case 0:
                if ((obj instanceof gm1.a) && (obj instanceof kotlin.jvm.internal.m)) {
                    break;
                }
                break;
            case 1:
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
        int i13 = this.f143255a;
        z zVar = this.f143256b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                zVar.Y7(p03);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p03, "p0");
                zVar.Y7(p03);
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                zVar.Y7(p03);
                break;
        }
    }

    public final int hashCode() {
        switch (this.f143255a) {
        }
        return c().hashCode();
    }
}
