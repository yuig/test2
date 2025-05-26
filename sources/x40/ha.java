package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ha {

    /* renamed from: a, reason: collision with root package name */
    public final String f132497a;

    public ha(String str) {
        this.f132497a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha) && Intrinsics.d(this.f132497a, ((ha) obj).f132497a);
    }

    public final int hashCode() {
        String str = this.f132497a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f132497a, ")");
    }
}
