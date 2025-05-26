package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f19456a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public final SparseIntArray f19457b = new SparseIntArray();

    public final int a(int i13, int i14) {
        int c13 = c(i13);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            int c14 = c(i17);
            i15 += c14;
            if (i15 == i14) {
                i16++;
                i15 = 0;
            } else if (i15 > i14) {
                i16++;
                i15 = c14;
            }
        }
        return i15 + c13 > i14 ? i16 + 1 : i16;
    }

    public int b(int i13, int i14) {
        int c13 = c(i13);
        if (c13 == i14) {
            return 0;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            int c14 = c(i16);
            i15 += c14;
            if (i15 == i14) {
                i15 = 0;
            } else if (i15 > i14) {
                i15 = c14;
            }
        }
        if (c13 + i15 <= i14) {
            return i15;
        }
        return 0;
    }

    public abstract int c(int i13);

    public final void d() {
        this.f19457b.clear();
    }

    public final void e() {
        this.f19456a.clear();
    }
}
