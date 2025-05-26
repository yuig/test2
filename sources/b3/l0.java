package b3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final a3.e f21340a;

    /* renamed from: b, reason: collision with root package name */
    public final k f21341b;

    public l0(a3.e eVar) {
        k kVar;
        this.f21340a = eVar;
        if (bf.b.V(eVar)) {
            kVar = null;
        } else {
            kVar = androidx.compose.ui.graphics.a.h();
            o0.b(kVar, eVar);
        }
        this.f21341b = kVar;
    }

    @Override // b3.m0
    public final a3.d a() {
        a3.e eVar = this.f21340a;
        return new a3.d(eVar.f488a, eVar.f489b, eVar.f490c, eVar.f491d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return Intrinsics.d(this.f21340a, ((l0) obj).f21340a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21340a.hashCode();
    }
}
