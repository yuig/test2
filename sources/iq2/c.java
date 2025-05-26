package iq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import he2.k;
import java.math.BigInteger;
import jk.v;
import kh2.j1;
import kotlin.jvm.internal.r;
import o6.d;

/* loaded from: classes4.dex */
public final class c extends d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f73440f = a.f73436i;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f73441g = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* renamed from: e, reason: collision with root package name */
    public int[] f73442e;

    public c(int[] iArr) {
        super(2);
        this.f73442e = iArr;
    }

    @Override // o6.d
    public final d a(d dVar) {
        int[] iArr = new int[8];
        k.b(this.f73442e, ((c) dVar).f73442e, iArr);
        if (k.o(iArr, b.f73438a)) {
            b.f(iArr);
        }
        return new c(iArr);
    }

    @Override // o6.d
    public final d b() {
        int[] iArr = new int[8];
        j1.n0(8, this.f73442e, iArr);
        if (k.o(iArr, b.f73438a)) {
            b.f(iArr);
        }
        return new c(iArr);
    }

    @Override // o6.d
    public final d d(d dVar) {
        int[] iArr = new int[8];
        v.Z(b.f73438a, ((c) dVar).f73442e, iArr);
        b.a(iArr, this.f73442e, iArr);
        return new c(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return k.g(this.f73442e, ((c) obj).f73442e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f73440f.bitLength();
    }

    public final int hashCode() {
        return f73440f.hashCode() ^ r.v(8, this.f73442e);
    }

    @Override // o6.d
    public final d k() {
        int[] iArr = new int[8];
        v.Z(b.f73438a, this.f73442e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return k.p(this.f73442e);
    }

    @Override // o6.d
    public final boolean m() {
        return k.r(this.f73442e);
    }

    @Override // o6.d
    public final d n(d dVar) {
        int[] iArr = new int[8];
        b.a(this.f73442e, ((c) dVar).f73442e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final d q() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f73442e;
        if (k.r(iArr2)) {
            k.J(iArr);
        } else {
            k.z(b.f73438a, iArr2, iArr);
        }
        return new c(iArr);
    }

    @Override // o6.d
    public final d r() {
        int[] iArr = this.f73442e;
        if (k.r(iArr) || k.p(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        b.d(iArr, iArr2);
        b.a(iArr2, iArr, iArr2);
        b.d(iArr2, iArr2);
        b.a(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        b.d(iArr2, iArr3);
        b.a(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        b.e(3, iArr3, iArr4);
        b.a(iArr4, iArr2, iArr4);
        b.e(4, iArr4, iArr2);
        b.a(iArr2, iArr3, iArr2);
        b.e(4, iArr2, iArr4);
        b.a(iArr4, iArr3, iArr4);
        b.e(15, iArr4, iArr3);
        b.a(iArr3, iArr4, iArr3);
        b.e(30, iArr3, iArr4);
        b.a(iArr4, iArr3, iArr4);
        b.e(60, iArr4, iArr3);
        b.a(iArr3, iArr4, iArr3);
        b.e(11, iArr3, iArr4);
        b.a(iArr4, iArr2, iArr4);
        b.e(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, iArr4, iArr2);
        b.a(iArr2, iArr3, iArr2);
        b.d(iArr2, iArr2);
        b.d(iArr2, iArr3);
        if (k.g(iArr, iArr3)) {
            return new c(iArr2);
        }
        b.a(iArr2, f73441g, iArr2);
        b.d(iArr2, iArr3);
        if (k.g(iArr, iArr3)) {
            return new c(iArr2);
        }
        return null;
    }

    @Override // o6.d
    public final d s() {
        int[] iArr = new int[8];
        b.d(this.f73442e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final d u(d dVar) {
        int[] iArr = new int[8];
        b.g(this.f73442e, ((c) dVar).f73442e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return k.k(this.f73442e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return k.C(this.f73442e);
    }
}
