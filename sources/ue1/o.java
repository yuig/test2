package ue1;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f122047a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122048b;

    public o(int i13, int i14) {
        this.f122047a = i13;
        this.f122048b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f122047a == oVar.f122047a && this.f122048b == oVar.f122048b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122048b) + (Integer.hashCode(this.f122047a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ItemPaddingSpec(verticalPadding=");
        sb3.append(this.f122047a);
        sb3.append(", horizontalPadding=");
        return a.a.n(sb3, this.f122048b, ")");
    }
}
