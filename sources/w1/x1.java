package w1;

import java.util.List;

/* loaded from: classes2.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final b4.g f127567a;

    /* renamed from: b, reason: collision with root package name */
    public final b4.q0 f127568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f127569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f127570d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f127571e;

    /* renamed from: f, reason: collision with root package name */
    public final int f127572f;

    /* renamed from: g, reason: collision with root package name */
    public final n4.b f127573g;

    /* renamed from: h, reason: collision with root package name */
    public final g4.d f127574h;

    /* renamed from: i, reason: collision with root package name */
    public final List f127575i;

    /* renamed from: j, reason: collision with root package name */
    public b4.q f127576j;

    /* renamed from: k, reason: collision with root package name */
    public n4.k f127577k;

    public x1(b4.g gVar, b4.q0 q0Var, boolean z13, n4.b bVar, g4.d dVar) {
        this(gVar, q0Var, Integer.MAX_VALUE, 1, z13, 1, bVar, dVar, kotlin.collections.q0.f80391a);
    }

    public final void a(n4.k kVar) {
        b4.q qVar = this.f127576j;
        if (qVar == null || kVar != this.f127577k || qVar.a()) {
            this.f127577k = kVar;
            qVar = new b4.q(this.f127567a, rl2.g0.f0(this.f127568b, kVar), this.f127575i, this.f127573g, this.f127574h);
        }
        this.f127576j = qVar;
    }

    public x1(b4.g gVar, b4.q0 q0Var, int i13, int i14, boolean z13, int i15, n4.b bVar, g4.d dVar, List list) {
        this.f127567a = gVar;
        this.f127568b = q0Var;
        this.f127569c = i13;
        this.f127570d = i14;
        this.f127571e = z13;
        this.f127572f = i15;
        this.f127573g = bVar;
        this.f127574h = dVar;
        this.f127575i = list;
        if (i13 <= 0) {
            throw new IllegalArgumentException("no maxLines".toString());
        }
        if (i14 <= 0) {
            throw new IllegalArgumentException("no minLines".toString());
        }
        if (i14 > i13) {
            throw new IllegalArgumentException("minLines greater than maxLines".toString());
        }
    }
}
