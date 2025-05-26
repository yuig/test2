package h4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final b4.g f67595a;

    /* renamed from: b, reason: collision with root package name */
    public final y f67596b;

    public n0(b4.g gVar, y yVar) {
        this.f67595a = gVar;
        this.f67596b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f67595a, n0Var.f67595a) && Intrinsics.d(this.f67596b, n0Var.f67596b);
    }

    public final int hashCode() {
        return this.f67596b.hashCode() + (this.f67595a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f67595a) + ", offsetMapping=" + this.f67596b + ')';
    }
}
