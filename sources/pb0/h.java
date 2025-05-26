package pb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final i f99433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99434b;

    public h(i iVar, int i13) {
        this.f99433a = iVar;
        this.f99434b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(h.class, obj.getClass())) {
            return false;
        }
        h hVar = (h) obj;
        return this.f99433a == hVar.f99433a && this.f99434b == hVar.f99434b;
    }

    public final int hashCode() {
        i iVar = this.f99433a;
        return ((iVar != null ? iVar.hashCode() : 0) * 31) + this.f99434b;
    }
}
