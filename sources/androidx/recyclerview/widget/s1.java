package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f19630a;

    /* renamed from: b, reason: collision with root package name */
    public List f19631b;

    public final void a(PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem fullSpanItem) {
        Intrinsics.checkNotNullParameter(fullSpanItem, "fullSpanItem");
        if (this.f19631b == null) {
            this.f19631b = new ArrayList();
        }
        List list = this.f19631b;
        Intrinsics.f(list);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            List list2 = this.f19631b;
            Intrinsics.f(list2);
            PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem = (PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem) list2.get(i13);
            Intrinsics.f(pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem);
            if (pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a == fullSpanItem.f19200a) {
                List list3 = this.f19631b;
                Intrinsics.f(list3);
                list3.remove(i13);
            }
            if (pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a >= fullSpanItem.f19200a) {
                List list4 = this.f19631b;
                Intrinsics.f(list4);
                list4.add(i13, fullSpanItem);
                return;
            }
        }
        List list5 = this.f19631b;
        Intrinsics.f(list5);
        list5.add(fullSpanItem);
    }

    public final void b(int i13) {
        int[] iArr = this.f19630a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i13, 10) + 1];
            this.f19630a = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        Intrinsics.f(iArr);
        if (i13 >= iArr.length) {
            int[] iArr3 = this.f19630a;
            Intrinsics.f(iArr3);
            int[] iArr4 = this.f19630a;
            Intrinsics.f(iArr4);
            int length = iArr4.length;
            while (length <= i13) {
                length *= 2;
            }
            int[] iArr5 = new int[length];
            this.f19630a = iArr5;
            System.arraycopy(iArr3, 0, iArr5, 0, iArr3.length);
            int[] iArr6 = this.f19630a;
            int length2 = iArr3.length;
            Intrinsics.f(iArr6);
            Arrays.fill(iArr6, length2, iArr6.length, -1);
        }
    }

    public final void c(int i13) {
        int size;
        if (this.f19631b != null && r0.size() - 1 >= 0) {
            while (true) {
                int i14 = size - 1;
                List list = this.f19631b;
                Intrinsics.f(list);
                PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem = (PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem) list.get(size);
                Intrinsics.f(pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem);
                if (pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a >= i13) {
                    List list2 = this.f19631b;
                    Intrinsics.f(list2);
                    list2.remove(size);
                }
                if (i14 < 0) {
                    break;
                } else {
                    size = i14;
                }
            }
        }
        g(i13);
    }

    public final PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem d(int i13, int i14, int i15) {
        List list = this.f19631b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            List list2 = this.f19631b;
            Intrinsics.f(list2);
            PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem = (PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem) list2.get(i16);
            Intrinsics.f(pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem);
            int i17 = pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a;
            if (i17 >= i14) {
                return null;
            }
            if (i17 >= i13 && (i15 == 0 || pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19201b == i15 || pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19203d)) {
                return pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem;
            }
        }
        return null;
    }

    public final PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem e(int i13) {
        List list = this.f19631b;
        if (list == null) {
            return null;
        }
        Intrinsics.f(list);
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i14 = size - 1;
                List list2 = this.f19631b;
                Intrinsics.f(list2);
                PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem = (PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem) list2.get(size);
                Intrinsics.f(pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem);
                if (pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a == i13) {
                    return pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem;
                }
                if (i14 < 0) {
                    break;
                }
                size = i14;
            }
        }
        return null;
    }

    public final int f(int i13) {
        int[] iArr = this.f19630a;
        if (iArr != null) {
            Intrinsics.f(iArr);
            if (i13 < iArr.length) {
                int[] iArr2 = this.f19630a;
                Intrinsics.f(iArr2);
                return iArr2[i13];
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.f19630a
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r0 = r0.length
            if (r5 < r0) goto Ld
            return r1
        Ld:
            java.util.List r0 = r4.f19631b
            if (r0 != 0) goto L13
        L11:
            r0 = r1
            goto L5e
        L13:
            androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem r0 = r4.e(r5)
            if (r0 == 0) goto L21
            java.util.List r2 = r4.f19631b
            kotlin.jvm.internal.Intrinsics.f(r2)
            r2.remove(r0)
        L21:
            java.util.List r0 = r4.f19631b
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r0 = r0.size()
            r2 = 0
        L2b:
            if (r2 >= r0) goto L43
            java.util.List r3 = r4.f19631b
            kotlin.jvm.internal.Intrinsics.f(r3)
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem r3 = (androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem) r3
            kotlin.jvm.internal.Intrinsics.f(r3)
            int r3 = r3.f19200a
            if (r3 < r5) goto L40
            goto L44
        L40:
            int r2 = r2 + 1
            goto L2b
        L43:
            r2 = r1
        L44:
            if (r2 == r1) goto L11
            java.util.List r0 = r4.f19631b
            kotlin.jvm.internal.Intrinsics.f(r0)
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem r0 = (androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem) r0
            java.util.List r3 = r4.f19631b
            kotlin.jvm.internal.Intrinsics.f(r3)
            r3.remove(r2)
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r0 = r0.f19200a
        L5e:
            if (r0 != r1) goto L70
            int[] r0 = r4.f19630a
            kotlin.jvm.internal.Intrinsics.f(r0)
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.f19630a
            kotlin.jvm.internal.Intrinsics.f(r5)
            int r5 = r5.length
            goto L82
        L70:
            int r0 = r0 + 1
            int[] r2 = r4.f19630a
            kotlin.jvm.internal.Intrinsics.f(r2)
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r4.f19630a
            java.util.Arrays.fill(r2, r5, r0, r1)
            r5 = r0
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.s1.g(int):int");
    }

    public final void h(int i13, int i14) {
        int size;
        int[] iArr = this.f19630a;
        if (iArr == null) {
            return;
        }
        Intrinsics.f(iArr);
        if (i13 >= iArr.length) {
            return;
        }
        int i15 = i13 + i14;
        b(i15);
        int[] iArr2 = this.f19630a;
        Intrinsics.f(iArr2);
        System.arraycopy(iArr2, i13, iArr2, i15, (iArr2.length - i13) - i14);
        Arrays.fill(this.f19630a, i13, i15, -1);
        if (this.f19631b == null || r0.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i16 = size - 1;
            List list = this.f19631b;
            Intrinsics.f(list);
            PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem = (PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem) list.get(size);
            Intrinsics.f(pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem);
            int i17 = pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a;
            if (i17 >= i13) {
                pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a = i17 + i14;
            }
            if (i16 < 0) {
                return;
            } else {
                size = i16;
            }
        }
    }

    public final void i(int i13, int i14) {
        int size;
        int[] iArr = this.f19630a;
        if (iArr == null) {
            return;
        }
        Intrinsics.f(iArr);
        if (i13 >= iArr.length) {
            return;
        }
        int i15 = i13 + i14;
        b(i15);
        int[] iArr2 = this.f19630a;
        Intrinsics.f(iArr2);
        System.arraycopy(iArr2, i15, iArr2, i13, (iArr2.length - i13) - i14);
        int[] iArr3 = this.f19630a;
        Intrinsics.f(iArr3);
        int length = iArr3.length - i14;
        int[] iArr4 = this.f19630a;
        Intrinsics.f(iArr4);
        Arrays.fill(iArr3, length, iArr4.length, -1);
        if (this.f19631b == null || r1.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i16 = size - 1;
            List list = this.f19631b;
            Intrinsics.f(list);
            PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem = (PinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem) list.get(size);
            Intrinsics.f(pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem);
            int i17 = pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a;
            if (i17 >= i13) {
                if (i17 < i15) {
                    List list2 = this.f19631b;
                    Intrinsics.f(list2);
                    list2.remove(size);
                } else {
                    pinterestStaggeredGridLayoutManagerImpl$LazySpanLookup$MultiSpanItem.f19200a = i17 - i14;
                }
            }
            if (i16 < 0) {
                return;
            } else {
                size = i16;
            }
        }
    }

    public final void j(int i13, u1 u1Var) {
        b(i13);
        int[] iArr = this.f19630a;
        Intrinsics.f(iArr);
        Intrinsics.f(u1Var);
        iArr[i13] = u1Var.f19641a;
    }
}
