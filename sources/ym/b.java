package ym;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f139395a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f139396b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f139395a = aVar;
        int length = iArr.length;
        int i13 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f139396b = iArr;
            return;
        }
        while (i13 < length && iArr[i13] == 0) {
            i13++;
        }
        if (i13 == length) {
            this.f139396b = new int[]{0};
            return;
        }
        int i14 = length - i13;
        int[] iArr2 = new int[i14];
        this.f139396b = iArr2;
        System.arraycopy(iArr, i13, iArr2, 0, i14);
    }

    public final b a(b bVar) {
        a aVar = bVar.f139395a;
        a aVar2 = this.f139395a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.f139396b;
        if (iArr[0] == 0) {
            return bVar;
        }
        int[] iArr2 = bVar.f139396b;
        if (iArr2[0] == 0) {
            return this;
        }
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i13 = length; i13 < iArr.length; i13++) {
            iArr3[i13] = iArr2[i13 - length] ^ iArr[i13];
        }
        return new b(aVar2, iArr3);
    }

    public final int b() {
        return this.f139396b.length - 1;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(b() * 8);
        for (int b13 = b(); b13 >= 0; b13--) {
            int[] iArr = this.f139396b;
            int i13 = iArr[(iArr.length - 1) - b13];
            if (i13 != 0) {
                if (i13 < 0) {
                    sb3.append(" - ");
                    i13 = -i13;
                } else if (sb3.length() > 0) {
                    sb3.append(" + ");
                }
                if (b13 == 0 || i13 != 1) {
                    a aVar = this.f139395a;
                    if (i13 == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i14 = aVar.f139390b[i13];
                    if (i14 == 0) {
                        sb3.append('1');
                    } else if (i14 == 1) {
                        sb3.append('a');
                    } else {
                        sb3.append("a^");
                        sb3.append(i14);
                    }
                }
                if (b13 != 0) {
                    if (b13 == 1) {
                        sb3.append('x');
                    } else {
                        sb3.append("x^");
                        sb3.append(b13);
                    }
                }
            }
        }
        return sb3.toString();
    }
}
