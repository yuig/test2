package zm2;

import androidx.datastore.preferences.protobuf.a2;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d0 extends g {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f142184h;

    /* renamed from: b, reason: collision with root package name */
    public final int f142185b;

    /* renamed from: c, reason: collision with root package name */
    public final g f142186c;

    /* renamed from: d, reason: collision with root package name */
    public final g f142187d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142188e;

    /* renamed from: f, reason: collision with root package name */
    public final int f142189f;

    /* renamed from: g, reason: collision with root package name */
    public int f142190g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        int i14 = 1;
        while (i13 > 0) {
            arrayList.add(Integer.valueOf(i13));
            int i15 = i14 + i13;
            i14 = i13;
            i13 = i15;
        }
        arrayList.add(Integer.MAX_VALUE);
        f142184h = new int[arrayList.size()];
        int i16 = 0;
        while (true) {
            int[] iArr = f142184h;
            if (i16 >= iArr.length) {
                return;
            }
            iArr[i16] = ((Integer) arrayList.get(i16)).intValue();
            i16++;
        }
    }

    public d0(g gVar, g gVar2) {
        this.f142186c = gVar;
        this.f142187d = gVar2;
        int size = gVar.size();
        this.f142188e = size;
        this.f142185b = gVar2.size() + size;
        this.f142189f = Math.max(gVar.f(), gVar2.f()) + 1;
    }

    public static z w(g gVar, g gVar2) {
        int size = gVar.size();
        int size2 = gVar2.size();
        byte[] bArr = new byte[size + size2];
        gVar.d(0, 0, size, bArr);
        gVar2.d(0, size, size2, bArr);
        return new z(bArr);
    }

    @Override // zm2.g
    public final void e(int i13, int i14, int i15, byte[] bArr) {
        int i16 = i13 + i15;
        g gVar = this.f142186c;
        int i17 = this.f142188e;
        if (i16 <= i17) {
            gVar.e(i13, i14, i15, bArr);
            return;
        }
        g gVar2 = this.f142187d;
        if (i13 >= i17) {
            gVar2.e(i13 - i17, i14, i15, bArr);
            return;
        }
        int i18 = i17 - i13;
        gVar.e(i13, i14, i18, bArr);
        gVar2.e(0, i14 + i18, i15 - i18, bArr);
    }

    public final boolean equals(Object obj) {
        int r13;
        if (obj == this) {
            return true;
        }
        int i13 = 0;
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        int size = gVar.size();
        int i14 = this.f142185b;
        if (i14 != size) {
            return false;
        }
        if (i14 == 0) {
            return true;
        }
        if (this.f142190g != 0 && (r13 = gVar.r()) != 0 && this.f142190g != r13) {
            return false;
        }
        a2 a2Var = new a2(this, i13);
        z zVar = (z) a2Var.next();
        a2 a2Var2 = new a2(gVar, i13);
        z zVar2 = (z) a2Var2.next();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int length = zVar.f142259b.length - i15;
            int length2 = zVar2.f142259b.length - i16;
            int min = Math.min(length, length2);
            if (!(i15 == 0 ? zVar.w(zVar2, i16, min) : zVar2.w(zVar, i15, min))) {
                return false;
            }
            i17 += min;
            if (i17 >= i14) {
                if (i17 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == length) {
                zVar = (z) a2Var.next();
                i15 = 0;
            } else {
                i15 += min;
            }
            if (min == length2) {
                zVar2 = (z) a2Var2.next();
                i16 = 0;
            } else {
                i16 += min;
            }
        }
    }

    @Override // zm2.g
    public final int f() {
        return this.f142189f;
    }

    public final int hashCode() {
        int i13 = this.f142190g;
        if (i13 == 0) {
            int i14 = this.f142185b;
            i13 = n(i14, 0, i14);
            if (i13 == 0) {
                i13 = 1;
            }
            this.f142190g = i13;
        }
        return i13;
    }

    @Override // zm2.g
    public final boolean i() {
        return this.f142185b >= f142184h[this.f142189f];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c0(this);
    }

    @Override // zm2.g
    public final boolean j() {
        int p13 = this.f142186c.p(0, 0, this.f142188e);
        g gVar = this.f142187d;
        return gVar.p(p13, 0, gVar.size()) == 0;
    }

    @Override // zm2.g
    public final int n(int i13, int i14, int i15) {
        int i16 = i14 + i15;
        g gVar = this.f142186c;
        int i17 = this.f142188e;
        if (i16 <= i17) {
            return gVar.n(i13, i14, i15);
        }
        g gVar2 = this.f142187d;
        if (i14 >= i17) {
            return gVar2.n(i13, i14 - i17, i15);
        }
        int i18 = i17 - i14;
        return gVar2.n(gVar.n(i13, i14, i18), 0, i15 - i18);
    }

    @Override // zm2.g
    public final int p(int i13, int i14, int i15) {
        int i16 = i14 + i15;
        g gVar = this.f142186c;
        int i17 = this.f142188e;
        if (i16 <= i17) {
            return gVar.p(i13, i14, i15);
        }
        g gVar2 = this.f142187d;
        if (i14 >= i17) {
            return gVar2.p(i13, i14 - i17, i15);
        }
        int i18 = i17 - i14;
        return gVar2.p(gVar.p(i13, i14, i18), 0, i15 - i18);
    }

    @Override // zm2.g
    public final int r() {
        return this.f142190g;
    }

    @Override // zm2.g
    public final String s() {
        byte[] bArr;
        int i13 = this.f142185b;
        if (i13 == 0) {
            bArr = w.f142256a;
        } else {
            byte[] bArr2 = new byte[i13];
            e(0, 0, i13, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // zm2.g
    public final int size() {
        return this.f142185b;
    }

    @Override // zm2.g
    public final void v(OutputStream outputStream, int i13, int i14) {
        int i15 = i13 + i14;
        g gVar = this.f142186c;
        int i16 = this.f142188e;
        if (i15 <= i16) {
            gVar.v(outputStream, i13, i14);
            return;
        }
        g gVar2 = this.f142187d;
        if (i13 >= i16) {
            gVar2.v(outputStream, i13 - i16, i14);
            return;
        }
        int i17 = i16 - i13;
        gVar.v(outputStream, i13, i17);
        gVar2.v(outputStream, 0, i14 - i17);
    }
}
