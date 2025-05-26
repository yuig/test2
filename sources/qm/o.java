package qm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends um.c {

    /* renamed from: r, reason: collision with root package name */
    public static final n f104205r = new n();

    /* renamed from: s, reason: collision with root package name */
    public static final nm.v f104206s = new nm.v("closed");

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f104207o;

    /* renamed from: p, reason: collision with root package name */
    public String f104208p;

    /* renamed from: q, reason: collision with root package name */
    public nm.s f104209q;

    public o() {
        super(f104205r);
        this.f104207o = new ArrayList();
        this.f104209q = nm.t.f91365a;
    }

    @Override // um.c
    public final void A(double d2) {
        if (this.f122676h == nm.b0.LENIENT || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            U(new nm.v(Double.valueOf(d2)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
        }
    }

    @Override // um.c
    public final void J(long j13) {
        U(new nm.v(Long.valueOf(j13)));
    }

    @Override // um.c
    public final void K(Boolean bool) {
        if (bool == null) {
            U(nm.t.f91365a);
        } else {
            U(new nm.v(bool));
        }
    }

    @Override // um.c
    public final void L(Number number) {
        if (number == null) {
            U(nm.t.f91365a);
            return;
        }
        if (this.f122676h != nm.b0.LENIENT) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        U(new nm.v(number));
    }

    @Override // um.c
    public final void M(String str) {
        if (str == null) {
            U(nm.t.f91365a);
        } else {
            U(new nm.v(str));
        }
    }

    @Override // um.c
    public final void O(boolean z13) {
        U(new nm.v(Boolean.valueOf(z13)));
    }

    public final nm.s Q() {
        ArrayList arrayList = this.f104207o;
        if (arrayList.isEmpty()) {
            return this.f104209q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final nm.s S() {
        return (nm.s) ep.b.h(this.f104207o, 1);
    }

    public final void U(nm.s sVar) {
        if (this.f104208p != null) {
            if (!(sVar instanceof nm.t) || this.f122679k) {
                ((nm.u) S()).r(this.f104208p, sVar);
            }
            this.f104208p = null;
            return;
        }
        if (this.f104207o.isEmpty()) {
            this.f104209q = sVar;
            return;
        }
        nm.s S = S();
        if (!(S instanceof nm.q)) {
            throw new IllegalStateException();
        }
        ((nm.q) S).t(sVar);
    }

    @Override // um.c
    public final void c() {
        nm.q qVar = new nm.q();
        U(qVar);
        this.f104207o.add(qVar);
    }

    @Override // um.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f104207o;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f104206s);
    }

    @Override // um.c
    public final void d() {
        nm.u uVar = new nm.u();
        U(uVar);
        this.f104207o.add(uVar);
    }

    @Override // um.c
    public final void f() {
        ArrayList arrayList = this.f104207o;
        if (arrayList.isEmpty() || this.f104208p != null) {
            throw new IllegalStateException();
        }
        if (!(S() instanceof nm.q)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // um.c, java.io.Flushable
    public final void flush() {
    }

    @Override // um.c
    public final void g() {
        ArrayList arrayList = this.f104207o;
        if (arrayList.isEmpty() || this.f104208p != null) {
            throw new IllegalStateException();
        }
        if (!(S() instanceof nm.u)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // um.c
    public final um.c h(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f104207o.isEmpty() || this.f104208p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(S() instanceof nm.u)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f104208p = str;
        return this;
    }

    @Override // um.c
    public final um.c m() {
        U(nm.t.f91365a);
        return this;
    }
}
