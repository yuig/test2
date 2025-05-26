package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f92167a;

    public s(String str) {
        this.f92167a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f92167a, ((s) obj).f92167a);
    }

    public final int hashCode() {
        String str = this.f92167a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OpenDisclosure(url="), this.f92167a, ")");
    }
}
