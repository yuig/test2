package h4;

import a.cb;

/* loaded from: classes3.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f67564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67565b;

    public h(int i13, int i14) {
        this.f67564a = i13;
        this.f67565b = i14;
        if (i13 < 0 || i14 < 0) {
            throw new IllegalArgumentException(cb.j("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i13, " and ", i14, " respectively.").toString());
        }
    }

    @Override // h4.j
    public final void a(l lVar) {
        int i13 = lVar.f67588c;
        int i14 = this.f67565b;
        int i15 = i13 + i14;
        int i16 = (i13 ^ i15) & (i14 ^ i15);
        z zVar = lVar.f67586a;
        if (i16 < 0) {
            i15 = zVar.a();
        }
        lVar.a(lVar.f67588c, Math.min(i15, zVar.a()));
        int i17 = lVar.f67587b;
        int i18 = this.f67564a;
        int i19 = i17 - i18;
        if (((i17 ^ i19) & (i18 ^ i17)) < 0) {
            i19 = 0;
        }
        lVar.a(Math.max(0, i19), lVar.f67587b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f67564a == hVar.f67564a && this.f67565b == hVar.f67565b;
    }

    public final int hashCode() {
        return (this.f67564a * 31) + this.f67565b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb3.append(this.f67564a);
        sb3.append(", lengthAfterCursor=");
        return cb.l(sb3, this.f67565b, ')');
    }
}
