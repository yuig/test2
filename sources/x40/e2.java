package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132299a;

    public e2(String str) {
        this.f132299a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && Intrinsics.d(this.f132299a, ((e2) obj).f132299a);
    }

    public final int hashCode() {
        String str = this.f132299a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Image(url="), this.f132299a, ")");
    }
}
