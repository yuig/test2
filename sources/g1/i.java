package g1;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f63271a;

    /* renamed from: b, reason: collision with root package name */
    public int f63272b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f63273c;

    /* renamed from: d, reason: collision with root package name */
    public int f63274d;

    public i(int i13) {
        if (i13 != 1) {
            int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
            this.f63274d = highestOneBit - 1;
            this.f63273c = new int[highestOneBit];
        }
    }

    public final void a(int i13) {
        int[] iArr = this.f63273c;
        int i14 = this.f63272b;
        iArr[i14] = i13;
        int i15 = this.f63274d & (i14 + 1);
        this.f63272b = i15;
        int i16 = this.f63271a;
        if (i15 == i16) {
            int length = iArr.length;
            int i17 = length - i16;
            int i18 = length << 1;
            if (i18 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i18];
            kotlin.collections.z.g(0, i16, length, iArr, iArr2);
            kotlin.collections.z.g(i17, 0, this.f63271a, this.f63273c, iArr2);
            this.f63273c = iArr2;
            this.f63271a = 0;
            this.f63272b = length;
            this.f63274d = i18 - 1;
        }
    }

    public final void b(int i13, int i14) {
        if (i13 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i15 = this.f63274d;
        int i16 = i15 * 2;
        int[] iArr = this.f63273c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f63273c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i16 >= iArr.length) {
            int[] iArr3 = new int[i15 * 4];
            this.f63273c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f63273c;
        iArr4[i16] = i13;
        iArr4[i16 + 1] = i14;
        this.f63274d++;
    }

    public final void c(RecyclerView recyclerView, boolean z13) {
        this.f63274d = 0;
        int[] iArr = this.f63273c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        l2 l2Var = recyclerView.f19242n;
        if (recyclerView.f19240m == null || l2Var == null || !l2Var.f19501i) {
            return;
        }
        if (z13) {
            if (!recyclerView.f19224e.i()) {
                l2Var.p(recyclerView.f19240m.e(), this);
            }
        } else if (recyclerView.f19256u && !recyclerView.D && !recyclerView.f19224e.i()) {
            l2Var.o(this.f63271a, this.f63272b, recyclerView.f19231h0, this);
        }
        int i13 = this.f63274d;
        if (i13 > l2Var.f19502j) {
            l2Var.f19502j = i13;
            l2Var.f19503k = z13;
            recyclerView.f19220c.q();
        }
    }
}
