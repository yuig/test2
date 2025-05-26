package h3;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public b3.s f66677b;

    /* renamed from: f, reason: collision with root package name */
    public float f66681f;

    /* renamed from: g, reason: collision with root package name */
    public b3.s f66682g;

    /* renamed from: k, reason: collision with root package name */
    public float f66686k;

    /* renamed from: m, reason: collision with root package name */
    public float f66688m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f66691p;

    /* renamed from: q, reason: collision with root package name */
    public d3.l f66692q;

    /* renamed from: r, reason: collision with root package name */
    public final b3.k f66693r;

    /* renamed from: s, reason: collision with root package name */
    public b3.k f66694s;

    /* renamed from: t, reason: collision with root package name */
    public final xk2.k f66695t;

    /* renamed from: c, reason: collision with root package name */
    public float f66678c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f66679d = h0.f66696a;

    /* renamed from: e, reason: collision with root package name */
    public float f66680e = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f66683h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f66684i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f66685j = 4.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f66687l = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f66689n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f66690o = true;

    public h() {
        b3.k h10 = androidx.compose.ui.graphics.a.h();
        this.f66693r = h10;
        this.f66694s = h10;
        this.f66695t = xk2.m.a(xk2.n.NONE, g.f66664j);
    }

    @Override // h3.c0
    public final void a(d3.h hVar) {
        if (this.f66689n) {
            b.b(this.f66679d, this.f66693r);
            e();
        } else if (this.f66691p) {
            e();
        }
        this.f66689n = false;
        this.f66691p = false;
        b3.s sVar = this.f66677b;
        if (sVar != null) {
            d3.h.k0(hVar, this.f66694s, sVar, this.f66678c, null, 56);
        }
        b3.s sVar2 = this.f66682g;
        if (sVar2 != null) {
            d3.l lVar = this.f66692q;
            if (this.f66690o || lVar == null) {
                lVar = new d3.l(this.f66681f, this.f66685j, this.f66683h, this.f66684i, null, 16);
                this.f66692q = lVar;
                this.f66690o = false;
            }
            d3.h.k0(hVar, this.f66694s, sVar2, this.f66680e, lVar, 48);
        }
    }

    public final void e() {
        float f13 = this.f66686k;
        b3.k kVar = this.f66693r;
        if (f13 == 0.0f && this.f66687l == 1.0f) {
            this.f66694s = kVar;
            return;
        }
        if (Intrinsics.d(this.f66694s, kVar)) {
            this.f66694s = androidx.compose.ui.graphics.a.h();
        } else {
            int i13 = this.f66694s.f21334a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f66694s.f21334a.rewind();
            this.f66694s.i(i13);
        }
        xk2.k kVar2 = this.f66695t;
        ((b3.m) kVar2.getValue()).c(kVar);
        float a13 = ((b3.m) kVar2.getValue()).a();
        float f14 = this.f66686k;
        float f15 = this.f66688m;
        float f16 = ((f14 + f15) % 1.0f) * a13;
        float f17 = ((this.f66687l + f15) % 1.0f) * a13;
        if (f16 <= f17) {
            ((b3.m) kVar2.getValue()).b(f16, f17, this.f66694s);
        } else {
            ((b3.m) kVar2.getValue()).b(f16, a13, this.f66694s);
            ((b3.m) kVar2.getValue()).b(0.0f, f17, this.f66694s);
        }
    }

    public final String toString() {
        return this.f66693r.toString();
    }
}
