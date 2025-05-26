package rn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f108880b;

    /* renamed from: c, reason: collision with root package name */
    public final String f108881c;

    public g(int i13, String str) {
        super(i13);
        this.f108880b = i13;
        this.f108881c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f108880b == gVar.f108880b && Intrinsics.d(this.f108881c, gVar.f108881c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f108880b) * 31;
        String str = this.f108881c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f108880b;
    }

    public final String toString() {
        return "LinkClick(id=" + this.f108880b + ", url=" + this.f108881c + ")";
    }
}
