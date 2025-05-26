package a2;

import b4.q0;
import kotlin.jvm.internal.r;
import rl2.g0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static b f378h;

    /* renamed from: a, reason: collision with root package name */
    public final n4.k f379a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f380b;

    /* renamed from: c, reason: collision with root package name */
    public final n4.b f381c;

    /* renamed from: d, reason: collision with root package name */
    public final g4.d f382d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f383e;

    /* renamed from: f, reason: collision with root package name */
    public float f384f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f385g = Float.NaN;

    public b(n4.k kVar, q0 q0Var, n4.c cVar, g4.d dVar) {
        this.f379a = kVar;
        this.f380b = q0Var;
        this.f381c = cVar;
        this.f382d = dVar;
        this.f383e = g0.f0(q0Var, kVar);
    }

    public final long a(int i13, long j13) {
        int i14;
        float f13 = this.f385g;
        float f14 = this.f384f;
        if (Float.isNaN(f13) || Float.isNaN(f14)) {
            float b13 = r.b(c.f386a, this.f383e, bs1.c.b(0, 0, 15), this.f381c, this.f382d, null, 1, 96).b();
            float b14 = r.b(c.f387b, this.f383e, bs1.c.b(0, 0, 15), this.f381c, this.f382d, null, 2, 96).b() - b13;
            this.f385g = b13;
            this.f384f = b14;
            f14 = b14;
            f13 = b13;
        }
        if (i13 != 1) {
            int round = Math.round((f14 * (i13 - 1)) + f13);
            i14 = round >= 0 ? round : 0;
            int g13 = n4.a.g(j13);
            if (i14 > g13) {
                i14 = g13;
            }
        } else {
            i14 = n4.a.i(j13);
        }
        return bs1.c.a(n4.a.j(j13), n4.a.h(j13), i14, n4.a.g(j13));
    }
}
