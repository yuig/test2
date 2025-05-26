package p30;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes2.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f98733a;

    public f(e eVar) {
        this.f98733a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f98733a, ((f) obj).f98733a);
    }

    public final int hashCode() {
        e eVar = this.f98733a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "Data(v3EmailClickMutation=" + this.f98733a + ")";
    }
}
