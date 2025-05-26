package gi;

import java.io.ByteArrayInputStream;

/* loaded from: classes3.dex */
public class k1 extends j1 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f65082c;

    public k1(byte[] bArr) {
        this.f65078a = 0;
        bArr.getClass();
        this.f65082c = bArr;
    }

    @Override // gi.j1
    public byte d(int i13) {
        return this.f65082c[i13];
    }

    @Override // gi.j1
    public byte e(int i13) {
        return this.f65082c[i13];
    }

    @Override // gi.j1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j1) || f() != ((j1) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return obj.equals(this);
        }
        k1 k1Var = (k1) obj;
        int i13 = this.f65078a;
        int i14 = k1Var.f65078a;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int f13 = f();
        if (f13 > k1Var.f()) {
            throw new IllegalArgumentException("Length too large: " + f13 + f());
        }
        if (f13 > k1Var.f()) {
            throw new IllegalArgumentException(a.a.f("Ran off end of other: 0, ", f13, ", ", k1Var.f()));
        }
        int p13 = p() + f13;
        int p14 = p();
        int p15 = k1Var.p();
        while (p14 < p13) {
            if (this.f65082c[p14] != k1Var.f65082c[p15]) {
                return false;
            }
            p14++;
            p15++;
        }
        return true;
    }

    @Override // gi.j1
    public int f() {
        return this.f65082c.length;
    }

    @Override // gi.j1
    public void i(byte[] bArr, int i13) {
        System.arraycopy(this.f65082c, 0, bArr, 0, i13);
    }

    public int p() {
        return 0;
    }

    public final ByteArrayInputStream r() {
        return new ByteArrayInputStream(this.f65082c, p(), f());
    }
}
