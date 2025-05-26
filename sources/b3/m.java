package b3;

import android.graphics.PathMeasure;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f21342a;

    public m(PathMeasure pathMeasure) {
        this.f21342a = pathMeasure;
    }

    public final float a() {
        return this.f21342a.getLength();
    }

    public final void b(float f13, float f14, o0 o0Var) {
        if (!(o0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f21342a.getSegment(f13, f14, ((k) o0Var).f21334a, true);
    }

    public final void c(k kVar) {
        this.f21342a.setPath(kVar != null ? kVar.f21334a : null, false);
    }
}
