package h4;

import a.cb;

/* loaded from: classes3.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f67566a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67567b;

    public i(int i13, int i14) {
        this.f67566a = i13;
        this.f67567b = i14;
        if (i13 < 0 || i14 < 0) {
            throw new IllegalArgumentException(cb.j("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i13, " and ", i14, " respectively.").toString());
        }
    }

    @Override // h4.j
    public final void a(l lVar) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 < this.f67566a) {
                int i16 = i15 + 1;
                int i17 = lVar.f67587b;
                if (i17 <= i16) {
                    i15 = i17;
                    break;
                } else {
                    i15 = (Character.isHighSurrogate(lVar.b((i17 - i16) + (-1))) && Character.isLowSurrogate(lVar.b(lVar.f67587b - i16))) ? i15 + 2 : i16;
                    i14++;
                }
            } else {
                break;
            }
        }
        int i18 = 0;
        while (true) {
            if (i13 >= this.f67567b) {
                break;
            }
            int i19 = i18 + 1;
            int i23 = lVar.f67588c + i19;
            z zVar = lVar.f67586a;
            if (i23 >= zVar.a()) {
                i18 = zVar.a() - lVar.f67588c;
                break;
            } else {
                i18 = (Character.isHighSurrogate(lVar.b((lVar.f67588c + i19) + (-1))) && Character.isLowSurrogate(lVar.b(lVar.f67588c + i19))) ? i18 + 2 : i19;
                i13++;
            }
        }
        int i24 = lVar.f67588c;
        lVar.a(i24, i18 + i24);
        int i25 = lVar.f67587b;
        lVar.a(i25 - i15, i25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f67566a == iVar.f67566a && this.f67567b == iVar.f67567b;
    }

    public final int hashCode() {
        return (this.f67566a * 31) + this.f67567b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb3.append(this.f67566a);
        sb3.append(", lengthAfterCursor=");
        return cb.l(sb3, this.f67567b, ')');
    }
}
