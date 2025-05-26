package uc;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import tc.d;
import tc.g;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f121750a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f121751b;

    public a(g wrappedWriter) {
        Intrinsics.checkNotNullParameter(wrappedWriter, "wrappedWriter");
        this.f121750a = wrappedWriter;
        this.f121751b = new LinkedHashMap();
    }

    @Override // tc.g
    public final g C(long j13) {
        this.f121750a.C(j13);
        return this;
    }

    @Override // tc.g
    public final g D(int i13) {
        this.f121750a.D(i13);
        return this;
    }

    @Override // tc.g
    public final g H(double d2) {
        this.f121750a.H(d2);
        return this;
    }

    @Override // tc.g
    public final g M0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f121750a.M0(name);
        return this;
    }

    @Override // tc.g
    public final g a2() {
        this.f121750a.a2();
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f121750a.close();
    }

    @Override // tc.g
    public final g h0(boolean z13) {
        this.f121750a.h0(z13);
        return this;
    }

    @Override // tc.g
    public final g n1(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f121750a.n1(value);
        return this;
    }

    @Override // tc.g
    public final g s() {
        this.f121750a.s();
        return this;
    }

    @Override // tc.g
    public final g t() {
        this.f121750a.t();
        return this;
    }

    @Override // tc.g
    public final g u() {
        this.f121750a.u();
        return this;
    }

    @Override // tc.g
    public final g v() {
        this.f121750a.v();
        return this;
    }

    @Override // tc.g
    public final g y(d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f121750a.y(value);
        return this;
    }
}
