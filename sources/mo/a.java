package mo;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import kotlin.jvm.internal.Intrinsics;
import lo.c;
import lo.d;

/* loaded from: classes3.dex */
public abstract class a implements b {
    @Override // mo.b
    public void a(WebViewYouTubePlayer youTubePlayer, String videoId) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
    }

    @Override // mo.b
    public void b(WebViewYouTubePlayer youTubePlayer) {
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
    public void f(WebViewYouTubePlayer youTubePlayer, c error) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // mo.b
    public void g(WebViewYouTubePlayer youTubePlayer, float f13) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
    }

    @Override // mo.b
    public void h(WebViewYouTubePlayer youTubePlayer, d state) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(state, "state");
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
