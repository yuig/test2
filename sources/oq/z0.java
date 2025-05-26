package oq;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import kotlin.jvm.internal.Intrinsics;
import rq.v4;

/* loaded from: classes3.dex */
public final class z0 implements mo.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f97212a;

    public z0(a1 a1Var) {
        this.f97212a = a1Var;
    }

    @Override // mo.b
    public final void a(WebViewYouTubePlayer youTubePlayer, String videoId) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
    }

    @Override // mo.b
    public final void b(WebViewYouTubePlayer youTubePlayer) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
    }

    @Override // mo.b
    public final void c(WebViewYouTubePlayer youTubePlayer, float f13) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
    }

    @Override // mo.b
    public final void d(WebViewYouTubePlayer youTubePlayer) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
    }

    @Override // mo.b
    public final void e(WebViewYouTubePlayer youTubePlayer, float f13) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
    }

    @Override // mo.b
    public final void f(WebViewYouTubePlayer youTubePlayer, lo.c error) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(error, "error");
        v4 v4Var = this.f97212a.f96952h;
        if (v4Var != null) {
            v4Var.f109605a.i();
        }
    }

    @Override // mo.b
    public final void g(WebViewYouTubePlayer youTubePlayer, float f13) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        nc2.h hVar = nc2.h.f90405a;
        com.bumptech.glide.d.E0(this.f97212a.f96948d, new p1.v0(7, f13));
    }

    @Override // mo.b
    public final void h(WebViewYouTubePlayer youTubePlayer, lo.d state) {
        lo.e eVar;
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(state, "state");
        lo.d dVar = lo.d.VIDEO_CUED;
        a1 a1Var = this.f97212a;
        if (state == dVar || state == lo.d.PLAYING) {
            a1Var.f96951g = true;
        }
        if (state == dVar && a1Var.f96950f && (eVar = a1Var.f96949e) != null) {
            WebViewYouTubePlayer webViewYouTubePlayer = (WebViewYouTubePlayer) eVar;
            webViewYouTubePlayer.f34787c.post(new po.d(webViewYouTubePlayer, 1));
        }
        if (state == lo.d.PLAYING) {
            m60.w wVar = a1Var.f96954j;
            if (wVar != null) {
                wVar.d(new ls1.i(a1Var.f96948d, System.currentTimeMillis() * 1000000));
            } else {
                Intrinsics.r("eventManager");
                throw null;
            }
        }
    }

    @Override // mo.b
    public final void i(WebViewYouTubePlayer youTubePlayer, lo.b playbackRate) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(playbackRate, "playbackRate");
    }

    @Override // mo.b
    public final void j(WebViewYouTubePlayer youTubePlayer, lo.a playbackQuality) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(playbackQuality, "playbackQuality");
    }
}
