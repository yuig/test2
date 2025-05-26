package kq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kh2.j1;

/* loaded from: classes4.dex */
public final class v extends o6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f80748f = u.f80746i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f80749e;

    public v(int[] iArr) {
        super(2);
        this.f80749e = iArr;
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        int[] iArr = new int[12];
        if (j1.B(12, this.f80749e, ((v) dVar).f80749e, iArr) != 0 || (iArr[11] == -1 && j1.j0(12, iArr, b.A))) {
            b.m(iArr);
        }
        return new v(iArr);
    }

    @Override // o6.d
    public final o6.d b() {
        int[] iArr = new int[12];
        if (j1.n0(12, this.f80749e, iArr) != 0 || (iArr[11] == -1 && j1.j0(12, iArr, b.A))) {
            b.m(iArr);
        }
        return new v(iArr);
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        int[] iArr = new int[12];
        jk.v.Z(b.A, ((v) dVar).f80749e, iArr);
        b.O(iArr, this.f80749e, iArr);
        return new v(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return j1.Y(12, this.f80749e, ((v) obj).f80749e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f80748f.bitLength();
    }

    public final int hashCode() {
        return f80748f.hashCode() ^ kotlin.jvm.internal.r.v(12, this.f80749e);
    }

    @Override // o6.d
    public final o6.d k() {
        int[] iArr = new int[12];
        jk.v.Z(b.A, this.f80749e, iArr);
        return new v(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return j1.d1(this.f80749e, 12);
    }

    @Override // o6.d
    public final boolean m() {
        return j1.h1(this.f80749e, 12);
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int[] iArr = new int[12];
        b.O(this.f80749e, ((v) dVar).f80749e, iArr);
        return new v(iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        int[] iArr = new int[12];
        int[] iArr2 = this.f80749e;
        if (j1.h1(iArr2, 12)) {
            for (int i13 = 0; i13 < 12; i13++) {
                iArr[i13] = 0;
            }
        } else {
            j1.x1(12, b.A, iArr2, iArr);
        }
        return new v(iArr);
    }

    @Override // o6.d
    public final o6.d r() {
        int[] iArr = this.f80749e;
        if (j1.h1(iArr, 12) || j1.d1(iArr, 12)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        b.G0(iArr, iArr2);
        b.O(iArr2, iArr, iArr2);
        b.T0(2, iArr2, iArr3);
        b.O(iArr3, iArr2, iArr3);
        b.G0(iArr3, iArr3);
        b.O(iArr3, iArr, iArr3);
        b.T0(5, iArr3, iArr4);
        b.O(iArr4, iArr3, iArr4);
        b.T0(5, iArr4, iArr5);
        b.O(iArr5, iArr3, iArr5);
        b.T0(15, iArr5, iArr3);
        b.O(iArr3, iArr5, iArr3);
        b.T0(2, iArr3, iArr4);
        b.O(iArr2, iArr4, iArr2);
        b.T0(28, iArr4, iArr4);
        b.O(iArr3, iArr4, iArr3);
        b.T0(60, iArr3, iArr4);
        b.O(iArr4, iArr3, iArr4);
        b.T0(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, iArr4, iArr3);
        b.O(iArr3, iArr4, iArr3);
        b.T0(15, iArr3, iArr3);
        b.O(iArr3, iArr5, iArr3);
        b.T0(33, iArr3, iArr3);
        b.O(iArr3, iArr2, iArr3);
        b.T0(64, iArr3, iArr3);
        b.O(iArr3, iArr, iArr3);
        b.T0(30, iArr3, iArr2);
        b.G0(iArr2, iArr3);
        if (j1.Y(12, iArr, iArr3)) {
            return new v(iArr2);
        }
        return null;
    }

    @Override // o6.d
    public final o6.d s() {
        int[] iArr = new int[12];
        b.G0(this.f80749e, iArr);
        return new v(iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        int[] iArr = new int[12];
        b.e1(this.f80749e, ((v) dVar).f80749e, iArr);
        return new v(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return j1.e0(this.f80749e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return j1.D1(this.f80749e, 12);
    }
}
