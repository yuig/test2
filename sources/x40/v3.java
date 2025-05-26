package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133536a;

    public v3(String str) {
        this.f133536a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3) && Intrinsics.d(this.f133536a, ((v3) obj).f133536a);
    }

    public final int hashCode() {
        String str = this.f133536a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f133536a, ")");
    }
}
