package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final l f108027a;

    /* renamed from: b, reason: collision with root package name */
    public final h f108028b;

    public i(l lVar, h hVar) {
        this.f108027a = lVar;
        this.f108028b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f108027a, iVar.f108027a) && Intrinsics.d(this.f108028b, iVar.f108028b);
    }

    public final int hashCode() {
        l lVar = this.f108027a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        h hVar = this.f108028b;
        return hashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "Information(text=" + this.f108027a + ", icon=" + this.f108028b + ")";
    }
}
