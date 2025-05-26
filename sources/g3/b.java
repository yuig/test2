package g3;

import a3.f;
import b3.i;
import b3.p;
import d3.h;
import kotlin.jvm.internal.Intrinsics;
import n4.k;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public i f63409a;

    /* renamed from: b, reason: collision with root package name */
    public p f63410b;

    /* renamed from: c, reason: collision with root package name */
    public float f63411c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public k f63412d = k.Ltr;

    public abstract void a(float f13);

    public abstract void b(p pVar);

    public final void c(h hVar, long j13, float f13, p pVar) {
        if (this.f63411c != f13) {
            a(f13);
            this.f63411c = f13;
        }
        if (!Intrinsics.d(this.f63410b, pVar)) {
            b(pVar);
            this.f63410b = pVar;
        }
        k layoutDirection = hVar.getLayoutDirection();
        if (this.f63412d != layoutDirection) {
            this.f63412d = layoutDirection;
        }
        float d2 = f.d(hVar.g()) - f.d(j13);
        float b13 = f.b(hVar.g()) - f.b(j13);
        hVar.p0().f53648a.b(0.0f, 0.0f, d2, b13);
        if (f13 > 0.0f) {
            try {
                if (f.d(j13) > 0.0f && f.b(j13) > 0.0f) {
                    e(hVar);
                }
            } finally {
                hVar.p0().f53648a.b(-0.0f, -0.0f, -d2, -b13);
            }
        }
    }

    public abstract long d();

    public abstract void e(h hVar);
}
