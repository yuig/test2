package sf1;

import androidx.media3.common.PlaybackException;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.video.core.view.PinterestVideoView;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public final PinterestVideoView f112749c;

    /* renamed from: d, reason: collision with root package name */
    public final bc2.q f112750d;

    /* renamed from: e, reason: collision with root package name */
    public r1 f112751e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f112752f;

    /* renamed from: g, reason: collision with root package name */
    public final String f112753g;

    /* renamed from: h, reason: collision with root package name */
    public final String f112754h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f112755i;

    /* renamed from: j, reason: collision with root package name */
    public final nx.d0 f112756j;

    /* renamed from: k, reason: collision with root package name */
    public final nx.d1 f112757k;

    /* renamed from: l, reason: collision with root package name */
    public final long f112758l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f112759m;

    public u(PinterestVideoView videoView, bc2.q videoTracks, r1 r1Var, m60.w eventManager, String pinId, String pageIndex, boolean z13, nx.d0 d0Var, nx.d1 trackingParamAttacher, lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f112749c = videoView;
        this.f112750d = videoTracks;
        this.f112751e = r1Var;
        this.f112752f = eventManager;
        this.f112753g = pinId;
        this.f112754h = pageIndex;
        this.f112755i = z13;
        this.f112756j = d0Var;
        this.f112757k = trackingParamAttacher;
        this.f112758l = System.currentTimeMillis();
    }

    @Override // n7.c
    public final void F(n7.b eventTime, PlaybackException error) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(error, "error");
        String str = this.f112753g;
        new oy.g0(str).i();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder D = ep.b.D(str, "-");
        D.append(this.f112754h);
        new oy.o0(D.toString(), currentTimeMillis - this.f112758l).i();
        this.f112752f.d(new g(str));
    }

    @Override // n7.c
    public final void O(n7.b eventTime, a7.i1 tracks) {
        r1 r1Var;
        k1 x33;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        if (tracks.f1079a.isEmpty() || (r1Var = this.f112751e) == null) {
            return;
        }
        boolean a13 = tracks.a();
        s1 s1Var = r1Var.f112694a;
        s1Var.f112739q = a13;
        j1 j1Var = s1Var.f112746x.f112788a.G;
        if (j1Var == null || (x33 = ((rf1.p0) j1Var).x3()) == null) {
            return;
        }
        boolean z13 = true;
        e1 e1Var = (e1) x33;
        boolean z14 = (a13 ^ true) || e1Var.z0();
        if (!z14 && !nc2.h.f90406b) {
            z13 = false;
        }
        h0 h0Var = e1Var.f112559r;
        h0Var.a0(z13);
        GestaltIconButton gestaltIconButton = h0Var.f112592q;
        if (z14) {
            gestaltIconButton.setAlpha(0.5f);
        } else {
            gestaltIconButton.setAlpha(1.0f);
        }
    }

    @Override // ic2.d
    public final void X(long j13) {
        n7.m0 c03 = this.f112749c.J0.c0();
        long j14 = c03 != null ? c03.N[3] : 0L;
        r1 r1Var = this.f112751e;
        if (r1Var != null) {
            r1Var.a(j13 / this.f112750d.f22674c, j14);
        }
    }

    @Override // ic2.d
    public final void j(n7.b eventTime, boolean z13, int i13) {
        j1 j1Var;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        r1 r1Var = this.f112751e;
        if (r1Var != null) {
            s1 s1Var = r1Var.f112694a;
            s1Var.getClass();
            if (z13 && i13 == 4 && (j1Var = s1Var.f112746x.f112788a.G) != null) {
                j1.e1(j1Var);
            }
        }
        if (i13 == 3) {
            long currentTimeMillis = System.currentTimeMillis();
            String str = this.f112753g;
            h32.v0 v0Var = null;
            new oy.f0(str, null, 12).i();
            new oy.p0(str + "-" + this.f112754h, currentTimeMillis - this.f112758l).i();
            this.f112752f.d(new g(str));
            if (!z13 || this.f112759m) {
                return;
            }
            nx.d0 d0Var = this.f112756j;
            if (d0Var != null) {
                h32.g0 g0Var = h32.g0.MODAL_PIN;
                String c13 = this.f112757k.c(str);
                if (c13 != null) {
                    v0Var = new h32.v0();
                    v0Var.G = c13;
                }
                c3.g0(d0Var, str, this.f112755i, g0Var, v0Var);
            }
            this.f112759m = true;
        }
    }
}
