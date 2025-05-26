package je;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class l2 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f75685a;

    /* renamed from: b, reason: collision with root package name */
    public float f75686b;

    /* renamed from: c, reason: collision with root package name */
    public float f75687c;

    /* renamed from: d, reason: collision with root package name */
    public m2 f75688d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f75689e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f75690f;

    /* renamed from: g, reason: collision with root package name */
    public int f75691g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f75692h;

    public l2(t2 t2Var, g.i iVar) {
        ArrayList arrayList = new ArrayList();
        this.f75685a = arrayList;
        this.f75688d = null;
        this.f75689e = false;
        this.f75690f = true;
        this.f75691g = -1;
        if (iVar == null) {
            return;
        }
        iVar.t(this);
        if (this.f75692h) {
            this.f75688d.b((m2) arrayList.get(this.f75691g));
            arrayList.set(this.f75691g, this.f75688d);
            this.f75692h = false;
        }
        m2 m2Var = this.f75688d;
        if (m2Var != null) {
            arrayList.add(m2Var);
        }
    }

    @Override // je.t0
    public final void a(float f13, float f14, float f15, float f16) {
        this.f75688d.a(f13, f14);
        this.f75685a.add(this.f75688d);
        this.f75688d = new m2(f15, f16, f15 - f13, f16 - f14);
        this.f75692h = false;
    }

    @Override // je.t0
    public final void b(float f13, float f14) {
        boolean z13 = this.f75692h;
        ArrayList arrayList = this.f75685a;
        if (z13) {
            this.f75688d.b((m2) arrayList.get(this.f75691g));
            arrayList.set(this.f75691g, this.f75688d);
            this.f75692h = false;
        }
        m2 m2Var = this.f75688d;
        if (m2Var != null) {
            arrayList.add(m2Var);
        }
        this.f75686b = f13;
        this.f75687c = f14;
        this.f75688d = new m2(f13, f14, 0.0f, 0.0f);
        this.f75691g = arrayList.size();
    }

    @Override // je.t0
    public final void c(float f13, float f14, float f15, float f16, float f17, float f18) {
        if (this.f75690f || this.f75689e) {
            this.f75688d.a(f13, f14);
            this.f75685a.add(this.f75688d);
            this.f75689e = false;
        }
        this.f75688d = new m2(f17, f18, f17 - f15, f18 - f16);
        this.f75692h = false;
    }

    @Override // je.t0
    public final void close() {
        this.f75685a.add(this.f75688d);
        f(this.f75686b, this.f75687c);
        this.f75692h = true;
    }

    @Override // je.t0
    public final void d(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
        this.f75689e = true;
        this.f75690f = false;
        m2 m2Var = this.f75688d;
        t2.a(m2Var.f75701a, m2Var.f75702b, f13, f14, f15, z13, z14, f16, f17, this);
        this.f75690f = true;
        this.f75692h = false;
    }

    @Override // je.t0
    public final void f(float f13, float f14) {
        this.f75688d.a(f13, f14);
        this.f75685a.add(this.f75688d);
        m2 m2Var = this.f75688d;
        this.f75688d = new m2(f13, f14, f13 - m2Var.f75701a, f14 - m2Var.f75702b);
        this.f75692h = false;
    }
}
