package s62;

import kg.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends q {

    /* renamed from: e, reason: collision with root package name */
    public final String f111254e;

    public g(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f111254e = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f111254e, ((g) obj).f111254e);
    }

    public final int hashCode() {
        return this.f111254e.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Plain(text="), this.f111254e, ")");
    }
}
