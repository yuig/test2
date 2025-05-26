package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f86061a;

    public v0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f86061a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && Intrinsics.d(this.f86061a, ((v0) obj).f86061a);
    }

    public final int hashCode() {
        return this.f86061a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("TextChanged(text="), this.f86061a, ")");
    }
}
