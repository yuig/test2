package l0;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.google.common.util.concurrent.c0;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements g0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f81258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f81259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0.h f81261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.h f81262e;

    public /* synthetic */ q(s sVar, r rVar, int i13, c0.h hVar, c0.h hVar2) {
        this.f81258a = sVar;
        this.f81259b = rVar;
        this.f81260c = i13;
        this.f81261d = hVar;
        this.f81262e = hVar2;
    }

    @Override // g0.a
    public final c0 apply(Object obj) {
        r rVar = this.f81259b;
        Surface surface = (Surface) obj;
        s sVar = this.f81258a;
        sVar.getClass();
        surface.getClass();
        try {
            rVar.d();
            t tVar = new t(surface, this.f81260c, sVar.f81273g.f16893a, this.f81261d, this.f81262e);
            tVar.f81291j.f106128b.d(new o(rVar, 2), l3.c.s());
            com.bumptech.glide.d.v("Consumer can only be linked once.", rVar.f81266r == null);
            rVar.f81266r = tVar;
            return g0.m.e(tVar);
        } catch (DeferrableSurface$SurfaceClosedException e13) {
            return new g0.n(e13);
        }
    }
}
