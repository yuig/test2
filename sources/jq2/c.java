package jq2;

import he2.k;
import java.math.BigInteger;
import jk.v;
import kh2.j1;
import kotlin.jvm.internal.r;
import o6.d;

/* loaded from: classes4.dex */
public final class c extends d {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f77524f = a.f77520i;

    /* renamed from: e, reason: collision with root package name */
    public int[] f77525e;

    public c(int[] iArr) {
        super(2);
        this.f77525e = iArr;
    }

    @Override // o6.d
    public final d a(d dVar) {
        int[] iArr = new int[8];
        b.a(this.f77525e, ((c) dVar).f77525e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final d b() {
        int[] iArr = new int[8];
        if (j1.n0(8, this.f77525e, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && k.o(iArr, b.f77522a))) {
            b.b(iArr);
        }
        return new c(iArr);
    }

    @Override // o6.d
    public final d d(d dVar) {
        int[] iArr = new int[8];
        v.Z(b.f77522a, ((c) dVar).f77525e, iArr);
        b.c(iArr, this.f77525e, iArr);
        return new c(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return k.g(this.f77525e, ((c) obj).f77525e);
        }
        return false;
    }

    @Override // o6.d
    public final int h() {
        return f77524f.bitLength();
    }

    public final int hashCode() {
        return f77524f.hashCode() ^ r.v(8, this.f77525e);
    }

    @Override // o6.d
    public final d k() {
        int[] iArr = new int[8];
        v.Z(b.f77522a, this.f77525e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return k.p(this.f77525e);
    }

    @Override // o6.d
    public final boolean m() {
        return k.r(this.f77525e);
    }

    @Override // o6.d
    public final d n(d dVar) {
        int[] iArr = new int[8];
        b.c(this.f77525e, ((c) dVar).f77525e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final d q() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f77525e;
        if (k.r(iArr2)) {
            k.J(iArr);
        } else {
            k.z(b.f77522a, iArr2, iArr);
        }
        return new c(iArr);
    }

    @Override // o6.d
    public final d r() {
        int[] iArr = this.f77525e;
        if (k.r(iArr) || k.p(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        b.f(iArr, iArr2);
        b.c(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        b.g(2, iArr2, iArr3);
        b.c(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        b.g(2, iArr3, iArr4);
        b.c(iArr4, iArr2, iArr4);
        b.g(6, iArr4, iArr2);
        b.c(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        b.g(12, iArr2, iArr5);
        b.c(iArr5, iArr2, iArr5);
        b.g(6, iArr5, iArr2);
        b.c(iArr2, iArr4, iArr2);
        b.f(iArr2, iArr4);
        b.c(iArr4, iArr, iArr4);
        b.g(31, iArr4, iArr5);
        b.c(iArr5, iArr4, iArr2);
        b.g(32, iArr5, iArr5);
        b.c(iArr5, iArr2, iArr5);
        b.g(62, iArr5, iArr5);
        b.c(iArr5, iArr2, iArr5);
        b.g(4, iArr5, iArr5);
        b.c(iArr5, iArr3, iArr5);
        b.g(32, iArr5, iArr5);
        b.c(iArr5, iArr, iArr5);
        b.g(62, iArr5, iArr5);
        b.f(iArr5, iArr3);
        if (k.g(iArr, iArr3)) {
            return new c(iArr5);
        }
        return null;
    }

    @Override // o6.d
    public final d s() {
        int[] iArr = new int[8];
        b.f(this.f77525e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final d u(d dVar) {
        int[] iArr = new int[8];
        b.h(this.f77525e, ((c) dVar).f77525e, iArr);
        return new c(iArr);
    }

    @Override // o6.d
    public final boolean v() {
        return k.k(this.f77525e) == 1;
    }

    @Override // o6.d
    public final BigInteger w() {
        return k.C(this.f77525e);
    }
}
