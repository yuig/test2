package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zf {

    /* renamed from: a, reason: collision with root package name */
    public final String f133827a;

    public zf(String str) {
        this.f133827a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zf) && Intrinsics.d(this.f133827a, ((zf) obj).f133827a);
    }

    public final int hashCode() {
        String str = this.f133827a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f133827a, ")");
    }
}
