package pg1;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import bi1.p;
import com.pinterest.video.core.view.PinterestVideoView;
import di1.g;
import gk1.a0;
import gk1.o;
import hc2.m;
import k8.q;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.l4;
import lh0.z3;
import m7.l0;
import ni1.e1;
import ni1.x1;
import u50.r;
import x21.f;

/* loaded from: classes5.dex */
public final class a extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f100093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f100094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f100095e;

    public a(int i13, FrameLayout frameLayout, Object obj) {
        this.f100093c = i13;
        this.f100095e = obj;
        this.f100094d = frameLayout;
    }

    @Override // ic2.d, n7.c
    public final void P(n7.b eventTime, int i13) {
        f fVar;
        int i14 = this.f100093c;
        FrameLayout frameLayout = this.f100094d;
        Object obj = this.f100095e;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.P(eventTime, i13);
                if (i13 != 4 || (fVar = ((c) frameLayout).f100115y) == null) {
                    return;
                }
                PinterestVideoView videoView = (PinterestVideoView) obj;
                Intrinsics.checkNotNullParameter(videoView, "videoView");
                fVar.a(videoView);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.P(eventTime, i13);
                boolean z13 = i13 == 4;
                if (z13) {
                    p pVar = (p) obj;
                    l4 l4Var = pVar.f22875h0;
                    if (l4Var == null) {
                        Intrinsics.r("myExperiments");
                        throw null;
                    }
                    z3 z3Var = a4.f83297a;
                    g1 g1Var = (g1) l4Var.f83419a;
                    if (!g1Var.o("android_video_block_video_pin_loop_vps_log", "enabled", z3Var) && !g1Var.l("android_video_block_video_pin_loop_vps_log")) {
                        int i15 = pVar.f22877j0 + 1;
                        pVar.f22877j0 = i15;
                        if (i15 == 50) {
                            pVar.f22877j0 = 0;
                            return;
                        }
                        PinterestVideoView pinterestVideoView = pVar.f22876i0;
                        if (pinterestVideoView == null) {
                            Intrinsics.r("videoView");
                            throw null;
                        }
                        pinterestVideoView.j(0L, false);
                        PinterestVideoView pinterestVideoView2 = pVar.f22876i0;
                        if (pinterestVideoView2 != null) {
                            pinterestVideoView2.play();
                            return;
                        } else {
                            Intrinsics.r("videoView");
                            throw null;
                        }
                    }
                }
                PinterestVideoView pinterestVideoView3 = (PinterestVideoView) frameLayout;
                bf.b.w(pinterestVideoView3.f18945j);
                pinterestVideoView3.f18955t = z13;
                pinterestVideoView3.G();
                pinterestVideoView3.f18953r = z13;
                return;
            case 3:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.P(eventTime, i13);
                boolean z14 = i13 == 4;
                if (z14) {
                    g gVar = (g) obj;
                    l4 l4Var2 = gVar.f55069r0;
                    if (l4Var2 == null) {
                        Intrinsics.r("myExperiments");
                        throw null;
                    }
                    z3 z3Var2 = a4.f83297a;
                    g1 g1Var2 = (g1) l4Var2.f83419a;
                    if (!g1Var2.o("android_video_block_video_pin_loop_vps_log", "enabled", z3Var2) && !g1Var2.l("android_video_block_video_pin_loop_vps_log")) {
                        int i16 = gVar.f55062k0 + 1;
                        gVar.f55062k0 = i16;
                        if (i16 == 50) {
                            gVar.f55062k0 = 0;
                            return;
                        } else {
                            gVar.b8().j(0L, false);
                            gVar.b8().play();
                            return;
                        }
                    }
                }
                PinterestVideoView pinterestVideoView4 = (PinterestVideoView) frameLayout;
                bf.b.w(pinterestVideoView4.f18945j);
                pinterestVideoView4.f18955t = z14;
                pinterestVideoView4.G();
                pinterestVideoView4.f18953r = z14;
                return;
            default:
                super.P(eventTime, i13);
                return;
        }
    }

    @Override // ic2.d
    public final void X(long j13) {
        switch (this.f100093c) {
            case 1:
                f fVar = ((c) this.f100094d).f100115y;
                if (fVar != null) {
                    PinterestVideoView videoView = (PinterestVideoView) this.f100095e;
                    Intrinsics.checkNotNullParameter(videoView, "videoView");
                    Long l13 = fVar.f131588a.f131592d;
                    if (l13 != null) {
                        long longValue = l13.longValue();
                        if (longValue > 0 && j13 >= longValue) {
                            fVar.a(videoView);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // ic2.d
    public final void j(n7.b eventTime, boolean z13, int i13) {
        switch (this.f100093c) {
            case 0:
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                super.j(eventTime, z13, i13);
                boolean z14 = z13 && i13 == 3;
                r rVar = (r) this.f100095e;
                if (rVar != null) {
                    rVar.a(new x1(new a0(z14)));
                }
                if (z14 && rVar != null) {
                    rVar.a(new e1(true, true));
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
        switch (this.f100093c) {
            case 0:
                r rVar = (r) this.f100095e;
                FrameLayout frameLayout = this.f100094d;
                if (rVar != null) {
                    rVar.a(new x1(new o(((c) frameLayout).f100116z.getB())));
                }
                if (z13) {
                    c cVar = (c) frameLayout;
                    if (!cVar.f100116z.V()) {
                        PinterestVideoView pinterestVideoView = cVar.f100116z;
                        pinterestVideoView.R = true;
                        m mVar = pinterestVideoView.Q;
                        if (mVar == null || (exoPlayer = ((dc2.g) mVar).f54407a) == null) {
                            obj = null;
                        } else {
                            l0 l0Var = (l0) exoPlayer;
                            l0Var.L0();
                            obj = l0Var.f86269j;
                        }
                        q qVar = obj instanceof q ? (q) obj : null;
                        if (qVar != null) {
                            dl2.b.W2(qVar, true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public a(c cVar, PinterestVideoView pinterestVideoView) {
        this.f100093c = 1;
        this.f100094d = cVar;
        this.f100095e = pinterestVideoView;
    }
}
