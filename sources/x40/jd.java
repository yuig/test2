package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jd {

    /* renamed from: a, reason: collision with root package name */
    public final id f132615a;

    public jd(id idVar) {
        this.f132615a = idVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd) && Intrinsics.d(this.f132615a, ((jd) obj).f132615a);
    }

    public final int hashCode() {
        id idVar = this.f132615a;
        if (idVar == null) {
            return 0;
        }
        return idVar.hashCode();
    }

    public final String toString() {
        return "Data(users=" + this.f132615a + ")";
    }
}
