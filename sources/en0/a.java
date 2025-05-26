package en0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f59643a;

    public a(b dimension) {
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        this.f59643a = dimension;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f59643a == ((a) obj).f59643a;
    }

    public final int hashCode() {
        return this.f59643a.hashCode();
    }

    public final String toString() {
        return "Key(dimension=" + this.f59643a + ")";
    }
}
