package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106533a;

    public /* synthetic */ l0(String str) {
        this.f106533a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return Intrinsics.d(this.f106533a, ((l0) obj).f106533a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f106533a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("EffectId(value="), this.f106533a, ")");
    }
}
