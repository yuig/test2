package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f19454a;

    /* renamed from: b, reason: collision with root package name */
    public List f19455b;

    public final void a(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        if (this.f19455b == null) {
            this.f19455b = new ArrayList();
        }
        int size = this.f19455b.size();
        for (int i13 = 0; i13 < size; i13++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f19455b.get(i13);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f19299a == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a) {
                this.f19455b.remove(i13);
            }
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f19299a >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a) {
                this.f19455b.add(i13, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
        }
        this.f19455b.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
    }

    public final void b() {
        int[] iArr = this.f19454a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f19455b = null;
    }

    public final void c(int i13) {
        int[] iArr = this.f19454a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i13, 10) + 1];
            this.f19454a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int length = iArr.length;
            while (length <= i13) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f19454a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f19454a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void d(int i13) {
        List list = this.f19455b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f19455b.get(size)).f19299a >= i13) {
                    this.f19455b.remove(size);
                }
            }
        }
        g(i13);
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e(int i13, int i14, int i15) {
        List list = this.f19455b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f19455b.get(i16);
            int i17 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a;
            if (i17 >= i14) {
                return null;
            }
            if (i17 >= i13 && (i15 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19300b == i15 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19302d)) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f(int i13) {
        List list = this.f19455b;
        if (list == null) {
            return null;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f19455b.get(size);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a == i13) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.f19454a
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.length
            if (r5 < r0) goto La
            return r1
        La:
            java.util.List r0 = r4.f19455b
            if (r0 != 0) goto L10
        Le:
            r0 = r1
            goto L46
        L10:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.f(r5)
            if (r0 == 0) goto L1b
            java.util.List r2 = r4.f19455b
            r2.remove(r0)
        L1b:
            java.util.List r0 = r4.f19455b
            int r0 = r0.size()
            r2 = 0
        L22:
            if (r2 >= r0) goto L34
            java.util.List r3 = r4.f19455b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r3 = r3.f19299a
            if (r3 < r5) goto L31
            goto L35
        L31:
            int r2 = r2 + 1
            goto L22
        L34:
            r2 = r1
        L35:
            if (r2 == r1) goto Le
            java.util.List r0 = r4.f19455b
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r0
            java.util.List r3 = r4.f19455b
            r3.remove(r2)
            int r0 = r0.f19299a
        L46:
            if (r0 != r1) goto L52
            int[] r0 = r4.f19454a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.f19454a
            int r5 = r5.length
            return r5
        L52:
            int r0 = r0 + 1
            int[] r2 = r4.f19454a
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r4.f19454a
            java.util.Arrays.fill(r2, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i3.g(int):int");
    }

    public final void h(int i13, int i14) {
        int[] iArr = this.f19454a;
        if (iArr == null || i13 >= iArr.length) {
            return;
        }
        int i15 = i13 + i14;
        c(i15);
        int[] iArr2 = this.f19454a;
        System.arraycopy(iArr2, i13, iArr2, i15, (iArr2.length - i13) - i14);
        Arrays.fill(this.f19454a, i13, i15, -1);
        List list = this.f19455b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f19455b.get(size);
            int i16 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a;
            if (i16 >= i13) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a = i16 + i14;
            }
        }
    }

    public final void i(int i13, int i14) {
        int[] iArr = this.f19454a;
        if (iArr == null || i13 >= iArr.length) {
            return;
        }
        int i15 = i13 + i14;
        c(i15);
        int[] iArr2 = this.f19454a;
        System.arraycopy(iArr2, i15, iArr2, i13, (iArr2.length - i13) - i14);
        int[] iArr3 = this.f19454a;
        Arrays.fill(iArr3, iArr3.length - i14, iArr3.length, -1);
        List list = this.f19455b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f19455b.get(size);
            int i16 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a;
            if (i16 >= i13) {
                if (i16 < i15) {
                    this.f19455b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f19299a = i16 - i14;
                }
            }
        }
    }
}
