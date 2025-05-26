package hq2;

import java.math.BigInteger;
import java.util.Random;
import jk.v;
import kh2.j1;

/* loaded from: classes4.dex */
public final class h extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public final BigInteger f69955e;

    /* renamed from: f, reason: collision with root package name */
    public final BigInteger f69956f;

    /* renamed from: g, reason: collision with root package name */
    public final BigInteger f69957g;

    public h(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(2);
        if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("x value invalid in Fp field element");
        }
        this.f69955e = bigInteger;
        this.f69956f = bigInteger2;
        this.f69957g = bigInteger3;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        BigInteger add = this.f69957g.add(dVar.w());
        BigInteger bigInteger = this.f69955e;
        if (add.compareTo(bigInteger) >= 0) {
            add = add.subtract(bigInteger);
        }
        return new h(bigInteger, this.f69956f, add);
    }

    @Override // o6.d
    public final o6.d b() {
        BigInteger add = this.f69957g.add(a.f69934b);
        BigInteger bigInteger = this.f69955e;
        if (add.compareTo(bigInteger) == 0) {
            add = a.f69933a;
        }
        return new h(bigInteger, this.f69956f, add);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        BigInteger w13 = dVar.w();
        BigInteger bigInteger = this.f69955e;
        int bitLength = bigInteger.bitLength();
        int i13 = (bitLength + 31) >> 5;
        int[] a03 = j1.a0(bitLength, bigInteger);
        int[] a04 = j1.a0(bitLength, w13);
        int[] iArr = new int[i13];
        v.Z(a03, a04, iArr);
        return new h(this.f69955e, this.f69956f, x(this.f69957g, j1.D1(iArr, i13)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f69955e.equals(hVar.f69955e) && this.f69957g.equals(hVar.f69957g);
    }

    @Override // o6.d
    public final int h() {
        return this.f69955e.bitLength();
    }

    public final int hashCode() {
        return this.f69955e.hashCode() ^ this.f69957g.hashCode();
    }

    @Override // o6.d
    public final o6.d k() {
        BigInteger bigInteger = this.f69957g;
        BigInteger bigInteger2 = this.f69955e;
        int bitLength = bigInteger2.bitLength();
        int i13 = (bitLength + 31) >> 5;
        int[] a03 = j1.a0(bitLength, bigInteger2);
        int[] a04 = j1.a0(bitLength, bigInteger);
        int[] iArr = new int[i13];
        v.Z(a03, a04, iArr);
        return new h(this.f69955e, this.f69956f, j1.D1(iArr, i13));
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        return new h(this.f69955e, this.f69956f, x(this.f69957g, dVar.w()));
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return new h(this.f69955e, this.f69956f, y(this.f69957g.multiply(dVar.w()).subtract(dVar2.w().multiply(dVar3.w()))));
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return new h(this.f69955e, this.f69956f, y(this.f69957g.multiply(dVar.w()).add(dVar2.w().multiply(dVar3.w()))));
    }

    @Override // o6.d
    public final o6.d q() {
        BigInteger bigInteger = this.f69957g;
        if (bigInteger.signum() == 0) {
            return this;
        }
        BigInteger bigInteger2 = this.f69956f;
        BigInteger bigInteger3 = this.f69955e;
        return new h(bigInteger3, bigInteger2, bigInteger3.subtract(bigInteger));
    }

    @Override // o6.d
    public final o6.d r() {
        BigInteger bigInteger;
        if (m() || l()) {
            return this;
        }
        BigInteger bigInteger2 = this.f69955e;
        if (!bigInteger2.testBit(0)) {
            throw new RuntimeException("not done yet");
        }
        int i13 = 1;
        boolean testBit = bigInteger2.testBit(1);
        BigInteger bigInteger3 = this.f69956f;
        BigInteger bigInteger4 = this.f69957g;
        Object obj = null;
        BigInteger bigInteger5 = a.f69934b;
        if (testBit) {
            h hVar = new h(bigInteger2, bigInteger3, bigInteger4.modPow(bigInteger2.shiftRight(2).add(bigInteger5), bigInteger2));
            if (hVar.s().equals(this)) {
                return hVar;
            }
            return null;
        }
        boolean testBit2 = bigInteger2.testBit(2);
        BigInteger bigInteger6 = a.f69935c;
        if (testBit2) {
            BigInteger modPow = bigInteger4.modPow(bigInteger2.shiftRight(3), bigInteger2);
            BigInteger x13 = x(modPow, bigInteger4);
            if (x(x13, modPow).equals(bigInteger5)) {
                h hVar2 = new h(bigInteger2, bigInteger3, x13);
                if (hVar2.s().equals(this)) {
                    return hVar2;
                }
                return null;
            }
            h hVar3 = new h(bigInteger2, bigInteger3, y(x13.multiply(bigInteger6.modPow(bigInteger2.shiftRight(2), bigInteger2))));
            if (hVar3.s().equals(this)) {
                return hVar3;
            }
            return null;
        }
        BigInteger shiftRight = bigInteger2.shiftRight(1);
        if (!bigInteger4.modPow(shiftRight, bigInteger2).equals(bigInteger5)) {
            return null;
        }
        BigInteger shiftLeft = bigInteger4.shiftLeft(1);
        BigInteger bigInteger7 = this.f69955e;
        if (shiftLeft.compareTo(bigInteger7) >= 0) {
            shiftLeft = shiftLeft.subtract(bigInteger7);
        }
        BigInteger shiftLeft2 = shiftLeft.shiftLeft(1);
        BigInteger bigInteger8 = this.f69955e;
        if (shiftLeft2.compareTo(bigInteger8) >= 0) {
            shiftLeft2 = shiftLeft2.subtract(bigInteger8);
        }
        BigInteger add = shiftRight.add(bigInteger5);
        BigInteger subtract = bigInteger2.subtract(bigInteger5);
        Random random = new Random();
        while (true) {
            BigInteger bigInteger9 = new BigInteger(bigInteger2.bitLength(), random);
            if (bigInteger9.compareTo(bigInteger2) >= 0 || !y(bigInteger9.multiply(bigInteger9).subtract(shiftLeft2)).modPow(shiftRight, bigInteger2).equals(subtract)) {
                obj = obj;
                shiftRight = shiftRight;
            } else {
                int bitLength = add.bitLength();
                int lowestSetBit = add.getLowestSetBit();
                int i14 = bitLength - i13;
                BigInteger bigInteger10 = shiftRight;
                BigInteger bigInteger11 = bigInteger5;
                BigInteger bigInteger12 = bigInteger11;
                BigInteger bigInteger13 = bigInteger12;
                BigInteger bigInteger14 = bigInteger6;
                Random random2 = random;
                BigInteger bigInteger15 = bigInteger9;
                while (true) {
                    bigInteger = subtract;
                    if (i14 < lowestSetBit + 1) {
                        break;
                    }
                    bigInteger11 = x(bigInteger11, bigInteger12);
                    if (add.testBit(i14)) {
                        bigInteger12 = x(bigInteger11, bigInteger4);
                        BigInteger x14 = x(bigInteger13, bigInteger15);
                        bigInteger6 = y(bigInteger15.multiply(bigInteger6).subtract(bigInteger9.multiply(bigInteger11)));
                        bigInteger15 = y(bigInteger15.multiply(bigInteger15).subtract(bigInteger12.shiftLeft(1)));
                        bigInteger13 = x14;
                    } else {
                        BigInteger y13 = y(bigInteger13.multiply(bigInteger6).subtract(bigInteger11));
                        BigInteger y14 = y(bigInteger15.multiply(bigInteger6).subtract(bigInteger9.multiply(bigInteger11)));
                        bigInteger6 = y(bigInteger6.multiply(bigInteger6).subtract(bigInteger11.shiftLeft(1)));
                        bigInteger15 = y14;
                        bigInteger13 = y13;
                        bigInteger12 = bigInteger11;
                    }
                    i14--;
                    subtract = bigInteger;
                }
                BigInteger x15 = x(bigInteger11, bigInteger12);
                BigInteger x16 = x(x15, bigInteger4);
                BigInteger y15 = y(bigInteger13.multiply(bigInteger6).subtract(x15));
                BigInteger y16 = y(bigInteger15.multiply(bigInteger6).subtract(bigInteger9.multiply(x15)));
                BigInteger y17 = y(x15.multiply(x16));
                for (int i15 = 1; i15 <= lowestSetBit; i15++) {
                    y15 = x(y15, y16);
                    y16 = y(y16.multiply(y16).subtract(y17.shiftLeft(1)));
                    y17 = y(y17.multiply(y17));
                }
                BigInteger[] bigIntegerArr = {y15, y16};
                BigInteger bigInteger16 = bigIntegerArr[0];
                BigInteger bigInteger17 = bigIntegerArr[1];
                if (x(bigInteger17, bigInteger17).equals(shiftLeft2)) {
                    if (bigInteger17.testBit(0)) {
                        bigInteger17 = bigInteger2.subtract(bigInteger17);
                    }
                    return new h(bigInteger2, bigInteger3, bigInteger17.shiftRight(1));
                }
                if (bigInteger16.equals(bigInteger5)) {
                    i13 = 1;
                    shiftRight = bigInteger10;
                    bigInteger6 = bigInteger14;
                    random = random2;
                    subtract = bigInteger;
                } else {
                    if (!bigInteger16.equals(bigInteger)) {
                        return null;
                    }
                    subtract = bigInteger;
                    i13 = 1;
                    shiftRight = bigInteger10;
                    bigInteger6 = bigInteger14;
                    random = random2;
                }
                obj = null;
            }
        }
    }

    @Override // o6.d
    public final o6.d s() {
        BigInteger bigInteger = this.f69957g;
        return new h(this.f69955e, this.f69956f, x(bigInteger, bigInteger));
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        BigInteger w13 = dVar.w();
        BigInteger w14 = dVar2.w();
        BigInteger bigInteger = this.f69957g;
        return new h(this.f69955e, this.f69956f, y(bigInteger.multiply(bigInteger).add(w13.multiply(w14))));
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        BigInteger subtract = this.f69957g.subtract(dVar.w());
        int signum = subtract.signum();
        BigInteger bigInteger = this.f69955e;
        if (signum < 0) {
            subtract = subtract.add(bigInteger);
        }
        return new h(bigInteger, this.f69956f, subtract);
    }

    @Override // o6.d
    public final BigInteger w() {
        return this.f69957g;
    }

    public final BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
        return y(bigInteger.multiply(bigInteger2));
    }

    public final BigInteger y(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.f69955e;
        BigInteger bigInteger3 = this.f69956f;
        if (bigInteger3 == null) {
            return bigInteger.mod(bigInteger2);
        }
        boolean z13 = bigInteger.signum() < 0;
        if (z13) {
            bigInteger = bigInteger.abs();
        }
        int bitLength = bigInteger2.bitLength();
        boolean equals = bigInteger3.equals(a.f69934b);
        while (bigInteger.bitLength() > bitLength + 1) {
            BigInteger shiftRight = bigInteger.shiftRight(bitLength);
            BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
            if (!equals) {
                shiftRight = shiftRight.multiply(bigInteger3);
            }
            bigInteger = shiftRight.add(subtract);
        }
        while (bigInteger.compareTo(bigInteger2) >= 0) {
            bigInteger = bigInteger.subtract(bigInteger2);
        }
        return (!z13 || bigInteger.signum() == 0) ? bigInteger : bigInteger2.subtract(bigInteger);
    }
}
