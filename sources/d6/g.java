package d6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f53734a;

    public g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f53734a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return Intrinsics.d(this.f53734a, ((g) obj).f53734a);
    }

    public final int hashCode() {
        return this.f53734a.hashCode();
    }

    public final String toString() {
        return this.f53734a;
    }
}
