package hq2;

import java.math.BigInteger;
import kv0.p;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final mq2.a f69944a;

    /* renamed from: b, reason: collision with root package name */
    public o6.d f69945b;

    /* renamed from: c, reason: collision with root package name */
    public o6.d f69946c;

    /* renamed from: d, reason: collision with root package name */
    public BigInteger f69947d;

    /* renamed from: e, reason: collision with root package name */
    public BigInteger f69948e;

    /* renamed from: f, reason: collision with root package name */
    public int f69949f = 0;

    /* renamed from: g, reason: collision with root package name */
    public p f69950g = null;

    public f(mq2.a aVar) {
        this.f69944a = aVar;
    }

    public abstract f a();

    public final synchronized k0.a b() {
        k0.a aVar;
        int i13 = this.f69949f;
        p pVar = this.f69950g;
        aVar = new k0.a();
        aVar.f77780d = this;
        aVar.f77777a = i13;
        aVar.f77778b = pVar;
        aVar.f77779c = null;
        return aVar;
    }

    public l c(BigInteger bigInteger, BigInteger bigInteger2, boolean z13) {
        return d(h(bigInteger), h(bigInteger2), z13);
    }

    public abstract l d(o6.d dVar, o6.d dVar2, boolean z13);

    public final l e(byte[] bArr) {
        l j13;
        int i13 = (i() + 7) / 8;
        byte b13 = bArr[0];
        if (b13 != 0) {
            if (b13 == 2 || b13 == 3) {
                if (bArr.length != i13 + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                j13 = f(b13 & 1, nq2.a.a(bArr, 1, i13));
                if (!j13.l()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b13 != 4) {
                if (b13 != 6 && b13 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b13, 16));
                }
                if (bArr.length != (i13 * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger a13 = nq2.a.a(bArr, 1, i13);
                BigInteger a14 = nq2.a.a(bArr, i13 + 1, i13);
                if (a14.testBit(0) != (b13 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                j13 = c(a13, a14, false);
                if (!j13.h()) {
                    throw new IllegalArgumentException("Invalid point coordinates");
                }
            } else {
                if (bArr.length != (i13 * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                j13 = c(nq2.a.a(bArr, 1, i13), nq2.a.a(bArr, i13 + 1, i13), false);
                if (!j13.h()) {
                    throw new IllegalArgumentException("Invalid point coordinates");
                }
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            j13 = j();
        }
        if (b13 == 0 || !j13.f()) {
            return j13;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof f) && g((f) obj));
    }

    public abstract l f(int i13, BigInteger bigInteger);

    public final boolean g(f fVar) {
        if (this != fVar) {
            if (fVar != null) {
                if (!this.f69944a.equals(fVar.f69944a) || !this.f69945b.w().equals(fVar.f69945b.w()) || !this.f69946c.w().equals(fVar.f69946c.w())) {
                }
            }
            return false;
        }
        return true;
    }

    public abstract o6.d h(BigInteger bigInteger);

    public final int hashCode() {
        return (this.f69944a.hashCode() ^ Integer.rotateLeft(this.f69945b.w().hashCode(), 8)) ^ Integer.rotateLeft(this.f69946c.w().hashCode(), 16);
    }

    public abstract int i();

    public abstract l j();

    public l k(l lVar) {
        if (this == lVar.f69962a) {
            return lVar;
        }
        if (lVar.f()) {
            return j();
        }
        l j13 = lVar.j();
        l c13 = c(j13.f69963b.w(), j13.d().w(), j13.f69966e);
        if (c13.h()) {
            return c13;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public abstract boolean l(int i13);
}
