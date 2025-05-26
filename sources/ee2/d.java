package ee2;

import eu.m;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.x;
import rl2.u;
import t72.j;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ u[] f58814i = {k0.f80436a.e(new x(d.class, "kernelEffect", "getKernelEffect()Lcom/pinterest/xrenderer/legacy/effects/motion_effects/LegacyKernelEffect;", 0))};

    /* renamed from: j, reason: collision with root package name */
    public static int f58815j;

    /* renamed from: a, reason: collision with root package name */
    public boolean f58816a;

    /* renamed from: b, reason: collision with root package name */
    public j f58817b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58818c;

    /* renamed from: d, reason: collision with root package name */
    public float f58819d;

    /* renamed from: e, reason: collision with root package name */
    public final gd2.c f58820e;

    /* renamed from: f, reason: collision with root package name */
    public final gd2.c f58821f;

    /* renamed from: g, reason: collision with root package name */
    public final gd2.c f58822g;

    /* renamed from: h, reason: collision with root package name */
    public final m f58823h;

    public d() {
        int i13 = f58815j;
        f58815j = i13 + 1;
        this.f58818c = i13;
        this.f58819d = 1.0f;
        this.f58820e = new gd2.c(b.f58809l, new c(this, 2), 1);
        this.f58821f = new gd2.c(b.f58808k, new c(this, 1), 1);
        this.f58822g = new gd2.c(b.f58807j, new c(this, 0), 1);
        this.f58823h = new m(5, null, this);
    }

    public final void a(float f13) {
        float f14 = this.f58819d;
        if (0.0f <= f14 && f14 <= 1.0f) {
            this.f58819d = f13;
        } else {
            throw new IllegalArgumentException(("Renderable opacity should be in range [0.0, 1.0], got " + this.f58819d).toString());
        }
    }
}
