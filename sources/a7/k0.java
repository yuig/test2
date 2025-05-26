package a7;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k0 {
    public Integer A;
    public CharSequence B;
    public CharSequence C;
    public CharSequence D;
    public Integer E;
    public Bundle F;
    public pk.c1 G;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f1091a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f1092b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1093c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1094d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1095e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1096f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f1097g;

    /* renamed from: h, reason: collision with root package name */
    public Long f1098h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f1099i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f1100j;

    /* renamed from: k, reason: collision with root package name */
    public Uri f1101k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f1102l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f1103m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f1104n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f1105o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f1106p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f1107q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f1108r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f1109s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f1110t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f1111u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f1112v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1113w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1114x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1115y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f1116z;

    public final void a(int i13, byte[] bArr) {
        if (this.f1099i == null || i13 == 3 || !Objects.equals(this.f1100j, 3)) {
            this.f1099i = (byte[]) bArr.clone();
            this.f1100j = Integer.valueOf(i13);
        }
    }

    public final void b(CharSequence charSequence) {
        this.f1094d = charSequence;
    }

    public final void c(CharSequence charSequence) {
        this.f1093c = charSequence;
    }

    public final void d(CharSequence charSequence) {
        this.f1092b = charSequence;
    }

    public final void e(byte[] bArr, Integer num) {
        this.f1099i = bArr == null ? null : (byte[]) bArr.clone();
        this.f1100j = num;
    }

    public final void f(CharSequence charSequence) {
        this.f1114x = charSequence;
    }

    public final void g(CharSequence charSequence) {
        this.f1115y = charSequence;
    }

    public final void h(Long l13) {
        bf.b.i(l13 == null || l13.longValue() >= 0);
        this.f1098h = l13;
    }

    public final void i(CharSequence charSequence) {
        this.B = charSequence;
    }

    public final void j(Integer num) {
        this.f1109s = num;
    }

    public final void k(Integer num) {
        this.f1108r = num;
    }

    public final void l(Integer num) {
        this.f1107q = num;
    }

    public final void m(Integer num) {
        this.f1112v = num;
    }

    public final void n(Integer num) {
        this.f1111u = num;
    }

    public final void o(Integer num) {
        this.f1110t = num;
    }

    public final void p(pk.c1 c1Var) {
        this.G = pk.c1.r(c1Var);
    }

    public final void q(CharSequence charSequence) {
        this.f1091a = charSequence;
    }

    public final void r(Integer num) {
        this.f1103m = num;
    }

    public final void s(Integer num) {
        this.f1102l = num;
    }

    public final void t(CharSequence charSequence) {
        this.f1113w = charSequence;
    }
}
