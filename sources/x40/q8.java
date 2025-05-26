package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133111a;

    public q8(String str) {
        this.f133111a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8) && Intrinsics.d(this.f133111a, ((q8) obj).f133111a);
    }

    public final int hashCode() {
        String str = this.f133111a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f133111a, ")");
    }
}
