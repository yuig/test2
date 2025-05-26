package t1;

import kotlin.jvm.internal.Intrinsics;
import u2.p;

/* loaded from: classes2.dex */
public final class e extends p {

    /* renamed from: n, reason: collision with root package name */
    public b f115744n;

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // u2.p
    public final void D0() {
        b bVar = this.f115744n;
        if (bVar instanceof d) {
            Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((d) bVar).f115743a.n(this);
        }
        if (bVar instanceof d) {
            ((d) bVar).f115743a.b(this);
        }
        this.f115744n = bVar;
    }

    @Override // u2.p
    public final void E0() {
        b bVar = this.f115744n;
        if (bVar instanceof d) {
            Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((d) bVar).f115743a.n(this);
        }
    }
}
