package wa2;

import android.graphics.Bitmap;
import lb.l0;

/* loaded from: classes4.dex */
public final class r extends l0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f128897c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f128898d;

    public r(ul0.a aVar, s sVar) {
        this.f128897c = aVar;
        this.f128898d = sVar;
    }

    @Override // lb.l0
    public final void O0() {
        this.f128897c.O0();
    }

    @Override // lb.l0
    public final void P0(Bitmap bitmap, hs1.x xVar) {
        this.f128897c.P0(bitmap, xVar);
        this.f128898d.f128915l.invalidate();
    }
}
