package h3;

import b3.z0;
import java.util.ArrayList;
import java.util.List;
import k1.s2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f66596b;

    /* renamed from: h, reason: collision with root package name */
    public b3.k f66602h;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f66603i;

    /* renamed from: l, reason: collision with root package name */
    public float f66606l;

    /* renamed from: m, reason: collision with root package name */
    public float f66607m;

    /* renamed from: n, reason: collision with root package name */
    public float f66608n;

    /* renamed from: q, reason: collision with root package name */
    public float f66611q;

    /* renamed from: r, reason: collision with root package name */
    public float f66612r;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f66597c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f66598d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f66599e = b3.w.f21390n;

    /* renamed from: f, reason: collision with root package name */
    public List f66600f = h0.f66696a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f66601g = true;

    /* renamed from: j, reason: collision with root package name */
    public final s2 f66604j = new s2(this, 12);

    /* renamed from: k, reason: collision with root package name */
    public String f66605k = "";

    /* renamed from: o, reason: collision with root package name */
    public float f66609o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f66610p = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public boolean f66613s = true;

    @Override // h3.c0
    public final void a(d3.h hVar) {
        if (this.f66613s) {
            float[] fArr = this.f66596b;
            if (fArr == null) {
                fArr = b3.i0.a();
                this.f66596b = fArr;
            } else {
                b3.i0.d(fArr);
            }
            b3.i0.h(fArr, this.f66611q + this.f66607m, this.f66612r + this.f66608n, 0.0f);
            b3.i0.e(this.f66606l, fArr);
            b3.i0.f(fArr, this.f66609o, this.f66610p, 1.0f);
            b3.i0.h(fArr, -this.f66607m, -this.f66608n, 0.0f);
            this.f66613s = false;
        }
        if (this.f66601g) {
            if (!this.f66600f.isEmpty()) {
                b3.k kVar = this.f66602h;
                if (kVar == null) {
                    kVar = androidx.compose.ui.graphics.a.h();
                    this.f66602h = kVar;
                }
                b.b(this.f66600f, kVar);
            }
            this.f66601g = false;
        }
        d3.b p03 = hVar.p0();
        long e13 = p03.e();
        p03.a().j();
        try {
            d3.d dVar = p03.f53648a;
            float[] fArr2 = this.f66596b;
            if (fArr2 != null) {
                dVar.f53655a.a().l(fArr2);
            }
            b3.k kVar2 = this.f66602h;
            if ((!this.f66600f.isEmpty()) && kVar2 != null) {
                dVar.a(kVar2, 1);
            }
            ArrayList arrayList = this.f66597c;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((c0) arrayList.get(i13)).a(hVar);
            }
        } finally {
            ep.b.z(p03, e13);
        }
    }

    @Override // h3.c0
    public final Function1 b() {
        return this.f66603i;
    }

    @Override // h3.c0
    public final void d(s2 s2Var) {
        this.f66603i = s2Var;
    }

    public final void e(int i13, c0 c0Var) {
        ArrayList arrayList = this.f66597c;
        if (i13 < arrayList.size()) {
            arrayList.set(i13, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        h(c0Var);
        c0Var.d(this.f66604j);
        c();
    }

    public final void f() {
        this.f66598d = false;
        int i13 = b3.w.f21391o;
        this.f66599e = b3.w.f21390n;
    }

    public final void g(long j13) {
        if (this.f66598d && j13 != 16) {
            long j14 = this.f66599e;
            if (j14 == 16) {
                this.f66599e = j13;
            } else {
                if (h0.a(j14, j13)) {
                    return;
                }
                f();
            }
        }
    }

    public final void h(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof c) {
                c cVar = (c) c0Var;
                if (cVar.f66598d && this.f66598d) {
                    g(cVar.f66599e);
                    return;
                } else {
                    f();
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        b3.s sVar = hVar.f66677b;
        if (this.f66598d && sVar != null) {
            if (sVar instanceof z0) {
                g(((z0) sVar).f21414a);
            } else {
                f();
            }
        }
        b3.s sVar2 = hVar.f66682g;
        if (this.f66598d && sVar2 != null) {
            if (sVar2 instanceof z0) {
                g(((z0) sVar2).f21414a);
            } else {
                f();
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VGroup: ");
        sb3.append(this.f66605k);
        ArrayList arrayList = this.f66597c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c0 c0Var = (c0) arrayList.get(i13);
            sb3.append("\t");
            sb3.append(c0Var.toString());
            sb3.append("\n");
        }
        return sb3.toString();
    }
}
