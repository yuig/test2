package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46129c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46130d;

    public e1(Object obj, int i13) {
        this.f46129c = i13;
        this.f46130d = obj;
    }

    @Override // n7.c
    public final void E(n7.b eventTime, a7.i0 i0Var, int i13) {
        int i14 = this.f46129c;
        Object obj = this.f46130d;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                IdeaPinInteractiveVideoView.O((IdeaPinInteractiveVideoView) obj);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                ((fu0.d) obj).Y7().z0();
                return;
            case 2:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                IdeaPinEditablePageLite ideaPinEditablePageLite = ((zv0.j) obj).G0;
                if (ideaPinEditablePageLite != null) {
                    ideaPinEditablePageLite.z0();
                    return;
                } else {
                    Intrinsics.r("pageView");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // ic2.d, n7.c
    public final void P(n7.b eventTime, int i13) {
        ug1.k kVar;
        ug1.m mVar;
        int i14 = this.f46129c;
        Object obj = this.f46130d;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.P(eventTime, i13);
                if (i13 == 3) {
                    ((fu0.d) obj).z2();
                    return;
                }
                return;
            case 2:
            default:
                super.P(eventTime, i13);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.P(eventTime, i13);
                if (i13 == 4) {
                    PinterestVideoView pinterestVideoView = (PinterestVideoView) obj;
                    a7.v0 v0Var = pinterestVideoView.f18946k;
                    if (v0Var != null) {
                        v0Var.s();
                    }
                    oc2.i.a(pinterestVideoView);
                    return;
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.P(eventTime, i13);
                if (i13 != 4 || (kVar = ((wg1.z) obj).A) == null) {
                    return;
                }
                kVar.f122198b.d(new tg1.a(false));
                return;
            case 5:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.P(eventTime, i13);
                if (i13 != 4 || (mVar = ((wg1.b0) obj).f129731r) == null) {
                    return;
                }
                mVar.f122224b.d(new tg1.a(false));
                return;
            case 6:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.P(eventTime, i13);
                ji1.c cVar = (ji1.c) obj;
                cVar.f76295l.setForeground(i13 == 2 ? cVar.f76286c : null);
                ab2.p pVar = cVar.f76294k;
                if (pVar == null) {
                    Intrinsics.r("endFrame");
                    throw null;
                }
                if (!pVar.isEnabled() || i13 != 4) {
                    ab2.p pVar2 = cVar.f76294k;
                    if (pVar2 != null) {
                        bs1.c.X0(pVar2);
                        return;
                    } else {
                        Intrinsics.r("endFrame");
                        throw null;
                    }
                }
                if (cVar.f76293j) {
                    ab2.p pVar3 = cVar.f76294k;
                    if (pVar3 == null) {
                        Intrinsics.r("endFrame");
                        throw null;
                    }
                    PinterestVideoView pinterestVideoView2 = cVar.f76295l;
                    pVar3.setLayoutParams(new FrameLayout.LayoutParams(pinterestVideoView2.getWidth(), pinterestVideoView2.getHeight()));
                    ab2.p pVar4 = cVar.f76294k;
                    if (pVar4 == null) {
                        Intrinsics.r("endFrame");
                        throw null;
                    }
                    pVar4.setVisibility(4);
                    ab2.p pVar5 = cVar.f76294k;
                    if (pVar5 != null) {
                        kg.a.s(pVar5, 0L, null, 6);
                        return;
                    } else {
                        Intrinsics.r("endFrame");
                        throw null;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ee A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b9  */
    @Override // ic2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(long r19) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.e1.X(long):void");
    }

    @Override // ic2.d, n7.c
    public final void b0(n7.b eventTime, boolean z13, int i13) {
        switch (this.f46129c) {
            case 4:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.b0(eventTime, z13, i13);
                wg1.z zVar = (wg1.z) this.f46130d;
                if (zVar.f129884r.l().f108855m == fm1.c.GONE) {
                    zVar.L();
                    break;
                }
                break;
            default:
                super.b0(eventTime, z13, i13);
                break;
        }
    }

    @Override // ic2.d
    public final void e0(float f13, qc2.c viewability, boolean z13, boolean z14, long j13) {
        ug1.k kVar;
        int i13 = this.f46129c;
        Object obj = this.f46130d;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(viewability, "viewability");
                super.e0(f13, viewability, z13, z14, j13);
                if (f13 >= 85.0f && (kVar = ((wg1.z) obj).A) != null) {
                    kVar.f122198b.d(new tg1.b());
                    break;
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(viewability, "viewability");
                super.e0(f13, viewability, z13, z14, j13);
                if (f13 == 0.0f) {
                    PinterestVideoView pinterestVideoView = ((wg1.b0) obj).f129725l;
                    if (!pinterestVideoView.f()) {
                        pinterestVideoView.q0().o(pinterestVideoView);
                        pinterestVideoView.j(0L, false);
                        pinterestVideoView.play();
                        break;
                    }
                }
                break;
            default:
                super.e0(f13, viewability, z13, z14, j13);
                break;
        }
    }

    @Override // ic2.d
    public final void j(n7.b eventTime, boolean z13, int i13) {
        switch (this.f46129c) {
            case 7:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.j(eventTime, z13, i13);
                boolean z14 = z13 && (i13 == 3 || i13 == 2);
                ab2.n nVar = (ab2.n) this.f46130d;
                kh2.s0.b1(nVar.f1769c, z14);
                if (z14) {
                    nVar.f1769c.a(new ni1.e1(true, true));
                    break;
                }
                break;
            default:
                super.j(eventTime, z13, i13);
                break;
        }
    }

    @Override // ic2.d
    public final void o(boolean z13, long j13) {
        Object obj;
        ExoPlayer exoPlayer;
        int i13 = this.f46129c;
        Object obj2 = this.f46130d;
        switch (i13) {
            case 4:
                int i14 = wg1.z.C;
                ((wg1.z) obj2).Y(!z13);
                break;
            case 7:
                ab2.n nVar = (ab2.n) obj2;
                u50.r rVar = nVar.f1769c;
                PinterestVideoView pinterestVideoView = nVar.f1768b;
                rVar.a(new ni1.x1(new gk1.o(pinterestVideoView.getB())));
                if (z13 && !pinterestVideoView.V()) {
                    pinterestVideoView.R = true;
                    hc2.m mVar = pinterestVideoView.Q;
                    if (mVar == null || (exoPlayer = ((dc2.g) mVar).f54407a) == null) {
                        obj = null;
                    } else {
                        m7.l0 l0Var = (m7.l0) exoPlayer;
                        l0Var.L0();
                        obj = l0Var.f86269j;
                    }
                    k8.q qVar = obj instanceof k8.q ? (k8.q) obj : null;
                    if (qVar != null) {
                        dl2.b.W2(qVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // n7.c
    public final void w(n7.b eventTime, a7.o1 videoSize) {
        int i13 = this.f46129c;
        Object obj = this.f46130d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                Intrinsics.checkNotNullParameter(videoSize, "videoSize");
                IdeaPinInteractiveVideoView ideaPinInteractiveVideoView = (IdeaPinInteractiveVideoView) obj;
                ideaPinInteractiveVideoView.post(new vs0.b(ideaPinInteractiveVideoView, 2));
                return;
            case 1:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                Intrinsics.checkNotNullParameter(videoSize, "videoSize");
                fu0.d dVar = (fu0.d) obj;
                dVar.Y7().post(new vs0.b(dVar, 3));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                Intrinsics.checkNotNullParameter(videoSize, "videoSize");
                zv0.j jVar = (zv0.j) obj;
                IdeaPinEditablePageLite ideaPinEditablePageLite = jVar.G0;
                if (ideaPinEditablePageLite == null) {
                    Intrinsics.r("pageView");
                    throw null;
                }
                a7.v0 v0Var = ideaPinEditablePageLite.f46450n.f18946k;
                if (v0Var != null && zv0.j.U8(jVar, v0Var.N(), v0Var.X())) {
                    int i14 = jVar.Y0;
                    long j13 = jVar.Z0;
                    jVar.Y0 = i14;
                    jVar.Z0 = j13;
                    jVar.W8(i14, j13);
                }
                IdeaPinEditablePageLite ideaPinEditablePageLite2 = jVar.G0;
                if (ideaPinEditablePageLite2 != null) {
                    ideaPinEditablePageLite2.post(new vs0.b(jVar, 9));
                    return;
                } else {
                    Intrinsics.r("pageView");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // ic2.d, n7.c
    public final void x(n7.b eventTime, a7.u0 oldPosition, a7.u0 newPosition, int i13) {
        int i14 = this.f46129c;
        Object obj = this.f46130d;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
                Intrinsics.checkNotNullParameter(newPosition, "newPosition");
                super.x(eventTime, oldPosition, newPosition, i13);
                if (i13 == 1) {
                    fu0.d dVar = (fu0.d) obj;
                    a7.v0 v0Var = dVar.Y7().f46450n.f18946k;
                    if (v0Var != null) {
                        dVar.Z7(ig1.b.R(v0Var.l(), dVar.f62979q0) + v0Var.X());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
                Intrinsics.checkNotNullParameter(newPosition, "newPosition");
                super.x(eventTime, oldPosition, newPosition, i13);
                if (i13 == 1) {
                    zv0.j jVar = (zv0.j) obj;
                    IdeaPinEditablePageLite ideaPinEditablePageLite = jVar.G0;
                    if (ideaPinEditablePageLite == null) {
                        Intrinsics.r("pageView");
                        throw null;
                    }
                    a7.v0 v0Var2 = ideaPinEditablePageLite.f46450n.f18946k;
                    if (v0Var2 != null) {
                        int N = v0Var2.N();
                        long X = v0Var2.X();
                        jVar.X8((int) (jVar.V8() + (((((jVar.X0 != null ? ig1.b.R(N, r7) : 0L) + X) * 1.0f) / jVar.f142881c1) * ((Number) jVar.U0.getValue()).intValue())));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.x(eventTime, oldPosition, newPosition, i13);
                return;
        }
    }
}
