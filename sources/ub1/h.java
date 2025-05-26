package ub1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f121720a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f121720a, ((h) obj).f121720a);
    }

    public final int hashCode() {
        String str = this.f121720a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowError(errorMessage="), this.f121720a, ")");
    }
}
