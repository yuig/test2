package oi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class p4 {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public String H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public long f95010J;
    public long K;

    /* renamed from: a, reason: collision with root package name */
    public final u4 f95011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95012b;

    /* renamed from: c, reason: collision with root package name */
    public String f95013c;

    /* renamed from: d, reason: collision with root package name */
    public String f95014d;

    /* renamed from: e, reason: collision with root package name */
    public String f95015e;

    /* renamed from: f, reason: collision with root package name */
    public String f95016f;

    /* renamed from: g, reason: collision with root package name */
    public long f95017g;

    /* renamed from: h, reason: collision with root package name */
    public long f95018h;

    /* renamed from: i, reason: collision with root package name */
    public long f95019i;

    /* renamed from: j, reason: collision with root package name */
    public String f95020j;

    /* renamed from: k, reason: collision with root package name */
    public long f95021k;

    /* renamed from: l, reason: collision with root package name */
    public String f95022l;

    /* renamed from: m, reason: collision with root package name */
    public long f95023m;

    /* renamed from: n, reason: collision with root package name */
    public long f95024n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95025o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95026p;

    /* renamed from: q, reason: collision with root package name */
    public String f95027q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f95028r;

    /* renamed from: s, reason: collision with root package name */
    public long f95029s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f95030t;

    /* renamed from: u, reason: collision with root package name */
    public String f95031u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f95032v;

    /* renamed from: w, reason: collision with root package name */
    public long f95033w;

    /* renamed from: x, reason: collision with root package name */
    public long f95034x;

    /* renamed from: y, reason: collision with root package name */
    public int f95035y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f95036z;

    public p4(u4 u4Var, String str) {
        com.bumptech.glide.d.t(u4Var);
        com.bumptech.glide.d.o(str);
        this.f95011a = u4Var;
        this.f95012b = str;
        o4 o4Var = u4Var.f95206j;
        u4.d(o4Var);
        o4Var.p();
    }

    public final void A(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95029s != j13;
        this.f95029s = j13;
    }

    public final void B(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.K != j13;
        this.K = j13;
    }

    public final long C() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95029s;
    }

    public final void D(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95023m != j13;
        this.f95023m = j13;
    }

    public final void E(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95019i != j13;
        this.f95019i = j13;
    }

    public final void F(long j13) {
        com.bumptech.glide.d.j(j13 >= 0);
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95017g != j13;
        this.f95017g = j13;
    }

    public final void G(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95018h != j13;
        this.f95018h = j13;
    }

    public final void H(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95034x != j13;
        this.f95034x = j13;
    }

    public final void I(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95033w != j13;
        this.f95033w = j13;
    }

    public final Boolean J() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95028r;
    }

    public final String K() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95027q;
    }

    public final String L() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        String str = this.H;
        v(null);
        return str;
    }

    public final String M() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95012b;
    }

    public final String N() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95013c;
    }

    public final void a(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95021k != j13;
        this.f95021k = j13;
    }

    public final void b(String str) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !kh2.b0.f2(this.f95027q, str);
        this.f95027q = str;
    }

    public final void c(List list) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        if (kh2.b0.f2(this.f95030t, list)) {
            return;
        }
        this.I = true;
        this.f95030t = list != null ? new ArrayList(list) : null;
    }

    public final String d() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95020j;
    }

    public final String e() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95016f;
    }

    public final String f() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95014d;
    }

    public final boolean g() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95026p;
    }

    public final boolean h() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95032v;
    }

    public final void i(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.A != j13;
        this.A = j13;
    }

    public final void j(String str) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= !kh2.b0.f2(this.f95013c, str);
        this.f95013c = str;
    }

    public final void k(boolean z13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95025o != z13;
        this.f95025o = z13;
    }

    public final long l() {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        return this.f95021k;
    }

    public final void m(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95010J != j13;
        this.f95010J = j13;
    }

    public final void n(String str) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= !kh2.b0.f2(this.f95022l, str);
        this.f95022l = str;
    }

    public final void o(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.E != j13;
        this.E = j13;
    }

    public final void p(String str) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= !kh2.b0.f2(this.f95020j, str);
        this.f95020j = str;
    }

    public final void q(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.F != j13;
        this.F = j13;
    }

    public final void r(String str) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= !kh2.b0.f2(this.f95016f, str);
        this.f95016f = str;
    }

    public final void s(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.D != j13;
        this.D = j13;
    }

    public final void t(String str) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !kh2.b0.f2(this.f95014d, str);
        this.f95014d = str;
    }

    public final void u(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.C != j13;
        this.C = j13;
    }

    public final void v(String str) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= !kh2.b0.f2(this.H, str);
        this.H = str;
    }

    public final void w(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.G != j13;
        this.G = j13;
    }

    public final void x(String str) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= !kh2.b0.f2(this.f95015e, str);
        this.f95015e = str;
    }

    public final void y(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.B != j13;
        this.B = j13;
    }

    public final void z(long j13) {
        o4 o4Var = this.f95011a.f95206j;
        u4.d(o4Var);
        o4Var.p();
        this.I |= this.f95024n != j13;
        this.f95024n = j13;
    }
}
