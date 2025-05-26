package oc2;

import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.BaseVideoView;
import ek1.a2;
import hc2.m;
import ni1.m2;

/* loaded from: classes2.dex */
public interface i {
    static void a(i iVar) {
        m mVar = ((BaseVideoView) iVar).Q;
        ((BaseVideoView) iVar).a0(mVar != null ? mVar.a() : 0L);
    }

    static void b(i iVar, long j13, int i13) {
        if ((i13 & 1) != 0) {
            m mVar = ((BaseVideoView) iVar).Q;
            j13 = mVar != null ? mVar.a() : 0L;
        }
        bc2.k kVar = ((BaseVideoView) iVar).L;
        String str = kVar != null ? kVar.f22657a : null;
        ((BaseVideoView) iVar).getClass();
        nc2.h hVar = nc2.h.f90405a;
        if (str == null) {
            return;
        }
        com.bumptech.glide.d.E0(str, new a2(j13, 3));
    }

    static void d(i iVar, boolean z13) {
        bc2.k kVar = ((BaseVideoView) iVar).L;
        String str = kVar != null ? kVar.f22657a : null;
        ((BaseVideoView) iVar).getClass();
        nc2.h hVar = nc2.h.f90405a;
        if (str == null) {
            return;
        }
        com.bumptech.glide.d.E0(str, new m2(z13, 6));
    }

    static /* synthetic */ void g(PinterestVideoView pinterestVideoView, bc2.k kVar, ec2.g gVar, int i13) {
        if ((i13 & 2) != 0) {
            gVar = null;
        }
        pinterestVideoView.b0(kVar, gVar, h.f94085i);
    }

    void c(m mVar);

    default boolean f() {
        m mVar = ((BaseVideoView) this).Q;
        return mVar != null && ((a7.h) ((dc2.g) mVar).f54407a).f();
    }

    void h(float f13, qc2.c cVar, boolean z13, long j13, boolean z14, boolean z15);

    void j(long j13, boolean z13);

    void play();
}
