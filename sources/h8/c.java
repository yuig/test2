package h8;

import d7.u;
import g8.a1;
import q8.k0;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f68005a;

    /* renamed from: b, reason: collision with root package name */
    public final a1[] f68006b;

    public c(int[] iArr, a1[] a1VarArr) {
        this.f68005a = iArr;
        this.f68006b = a1VarArr;
    }

    public final k0 a(int i13) {
        int i14 = 0;
        while (true) {
            int[] iArr = this.f68005a;
            if (i14 >= iArr.length) {
                u.c("BaseMediaChunkOutput", "Unmatched track of type: " + i13);
                return new q8.r();
            }
            if (i13 == iArr[i14]) {
                return this.f68006b[i14];
            }
            i14++;
        }
    }
}
