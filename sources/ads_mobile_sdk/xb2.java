package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class xb2 extends il {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f13594i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: d, reason: collision with root package name */
    public final int f13595d;

    /* renamed from: e, reason: collision with root package name */
    public final il f13596e;

    /* renamed from: f, reason: collision with root package name */
    public final il f13597f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13598g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13599h;

    public xb2(il ilVar, il ilVar2) {
        this.f13596e = ilVar;
        this.f13597f = ilVar2;
        int size = ilVar.size();
        this.f13598g = size;
        this.f13595d = ilVar2.size() + size;
        this.f13599h = Math.max(ilVar.b(), ilVar2.b()) + 1;
    }

    public static int d(int i13) {
        int[] iArr = f13594i;
        if (i13 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i13];
    }

    @Override // ads_mobile_sdk.il
    public final ByteBuffer a() {
        return ByteBuffer.wrap(e()).asReadOnlyBuffer();
    }

    @Override // ads_mobile_sdk.il
    public final byte b(int i13) {
        il.a(i13, this.f13595d);
        return c(i13);
    }

    @Override // ads_mobile_sdk.il
    public final byte c(int i13) {
        int i14 = this.f13598g;
        return i13 < i14 ? this.f13596e.c(i13) : this.f13597f.c(i13 - i14);
    }

    @Override // ads_mobile_sdk.il
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof il)) {
            return false;
        }
        il ilVar = (il) obj;
        if (this.f13595d != ilVar.size()) {
            return false;
        }
        if (this.f13595d == 0) {
            return true;
        }
        int i13 = this.f6433a;
        int i14 = ilVar.f6433a;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        wb2 wb2Var = new wb2(this);
        a.g3 next = wb2Var.next();
        wb2 wb2Var2 = new wb2(ilVar);
        a.g3 next2 = wb2Var2.next();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int size = next.size() - i15;
            int size2 = next2.size() - i16;
            int min = Math.min(size, size2);
            if (!(i15 == 0 ? next.a(next2, i16, min) : next2.a(next, i15, min))) {
                return false;
            }
            i17 += min;
            int i18 = this.f13595d;
            if (i17 >= i18) {
                if (i17 == i18) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i15 = 0;
                next = wb2Var.next();
            } else {
                i15 += min;
                next = next;
            }
            if (min == size2) {
                next2 = wb2Var2.next();
                i16 = 0;
            } else {
                i16 += min;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ub2(this);
    }

    @Override // ads_mobile_sdk.il
    public final int size() {
        return this.f13595d;
    }

    public static il a(il ilVar, il ilVar2) {
        if (ilVar2.size() == 0) {
            return ilVar;
        }
        if (ilVar.size() == 0) {
            return ilVar2;
        }
        int size = ilVar2.size() + ilVar.size();
        if (size < 128) {
            int size2 = ilVar.size();
            int size3 = ilVar2.size();
            int i13 = size2 + size3;
            byte[] bArr = new byte[i13];
            il.a(0, size2, ilVar.size());
            il.a(0, size2, i13);
            if (size2 > 0) {
                ilVar.a(0, 0, size2, bArr);
            }
            il.a(0, size3, ilVar2.size());
            il.a(size2, i13, i13);
            if (size3 > 0) {
                ilVar2.a(0, size2, size3, bArr);
            }
            return new gl(bArr);
        }
        if (ilVar instanceof xb2) {
            xb2 xb2Var = (xb2) ilVar;
            if (ilVar2.size() + xb2Var.f13597f.size() < 128) {
                il ilVar3 = xb2Var.f13597f;
                int size4 = ilVar3.size();
                int size5 = ilVar2.size();
                int i14 = size4 + size5;
                byte[] bArr2 = new byte[i14];
                il.a(0, size4, ilVar3.size());
                il.a(0, size4, i14);
                if (size4 > 0) {
                    ilVar3.a(0, 0, size4, bArr2);
                }
                il.a(0, size5, ilVar2.size());
                il.a(size4, i14, i14);
                if (size5 > 0) {
                    ilVar2.a(0, size4, size5, bArr2);
                }
                return new xb2(xb2Var.f13596e, new gl(bArr2));
            }
            if (xb2Var.f13596e.b() > xb2Var.f13597f.b() && xb2Var.f13599h > ilVar2.b()) {
                return new xb2(xb2Var.f13596e, new xb2(xb2Var.f13597f, ilVar2));
            }
        }
        if (size >= d(Math.max(ilVar.b(), ilVar2.b()) + 1)) {
            return new xb2(ilVar, ilVar2);
        }
        return new vb2().a(ilVar, ilVar2);
    }

    @Override // ads_mobile_sdk.il
    public final int b() {
        return this.f13599h;
    }

    @Override // ads_mobile_sdk.il
    public final io d() {
        ArrayList arrayList = new ArrayList();
        wb2 wb2Var = new wb2(this);
        while (wb2Var.hasNext()) {
            arrayList.add(wb2Var.next().a());
        }
        Iterator it = arrayList.iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i14 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i13 |= 1;
            } else {
                i13 = byteBuffer.isDirect() ? i13 | 2 : i13 | 4;
            }
        }
        if (i13 == 2) {
            return new go(arrayList, i14);
        }
        return io.a(new f21(arrayList));
    }

    @Override // ads_mobile_sdk.il
    public final int b(int i13, int i14, int i15) {
        int i16 = i14 + i15;
        int i17 = this.f13598g;
        if (i16 <= i17) {
            return this.f13596e.b(i13, i14, i15);
        }
        if (i14 >= i17) {
            return this.f13597f.b(i13, i14 - i17, i15);
        }
        int i18 = i17 - i14;
        return this.f13597f.b(this.f13596e.b(i13, i14, i18), 0, i15 - i18);
    }

    @Override // ads_mobile_sdk.il
    public final boolean c() {
        return this.f13595d >= d(this.f13599h);
    }

    @Override // ads_mobile_sdk.il
    public final il b(int i13, int i14) {
        int a13 = il.a(i13, i14, this.f13595d);
        if (a13 == 0) {
            return il.f6431b;
        }
        if (a13 == this.f13595d) {
            return this;
        }
        int i15 = this.f13598g;
        if (i14 <= i15) {
            return this.f13596e.b(i13, i14);
        }
        if (i13 >= i15) {
            return this.f13597f.b(i13 - i15, i14 - i15);
        }
        il ilVar = this.f13596e;
        return new xb2(ilVar.b(i13, ilVar.size()), this.f13597f.b(0, i14 - this.f13598g));
    }

    @Override // ads_mobile_sdk.il
    public final void a(int i13, int i14, int i15, byte[] bArr) {
        int i16 = i13 + i15;
        int i17 = this.f13598g;
        if (i16 <= i17) {
            this.f13596e.a(i13, i14, i15, bArr);
        } else {
            if (i13 >= i17) {
                this.f13597f.a(i13 - i17, i14, i15, bArr);
                return;
            }
            int i18 = i17 - i13;
            this.f13596e.a(i13, i14, i18, bArr);
            this.f13597f.a(0, i14 + i18, i15 - i18, bArr);
        }
    }

    @Override // ads_mobile_sdk.il
    public final void a(a.lg lgVar) {
        this.f13596e.a(lgVar);
        this.f13597f.a(lgVar);
    }
}
