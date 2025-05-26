package ec;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    public final float[] f58286a;

    /* renamed from: b */
    public final int[] f58287b;

    public c(float[] fArr, int[] iArr) {
        this.f58286a = fArr;
        this.f58287b = iArr;
    }

    public final void a(c cVar) {
        int i13 = 0;
        while (true) {
            int[] iArr = cVar.f58287b;
            if (i13 >= iArr.length) {
                return;
            }
            this.f58286a[i13] = cVar.f58286a[i13];
            this.f58287b[i13] = iArr[i13];
            i13++;
        }
    }

    public final c b(float[] fArr) {
        int p13;
        int[] iArr = new int[fArr.length];
        for (int i13 = 0; i13 < fArr.length; i13++) {
            float f13 = fArr[i13];
            float[] fArr2 = this.f58286a;
            int binarySearch = Arrays.binarySearch(fArr2, f13);
            int[] iArr2 = this.f58287b;
            if (binarySearch >= 0) {
                p13 = iArr2[binarySearch];
            } else {
                int i14 = -(binarySearch + 1);
                if (i14 == 0) {
                    p13 = iArr2[0];
                } else if (i14 == iArr2.length - 1) {
                    p13 = iArr2[iArr2.length - 1];
                } else {
                    int i15 = i14 - 1;
                    float f14 = fArr2[i15];
                    p13 = b7.c.p(iArr2[i15], (f13 - f14) / (fArr2[i14] - f14), iArr2[i14]);
                }
            }
            iArr[i13] = p13;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f58286a, cVar.f58286a) && Arrays.equals(this.f58287b, cVar.f58287b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f58287b) + (Arrays.hashCode(this.f58286a) * 31);
    }
}
