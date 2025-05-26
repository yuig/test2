package po;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends mo.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f100871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ YouTubePlayerView f100872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f100873c;

    public f(String str, YouTubePlayerView youTubePlayerView, boolean z13) {
        this.f100871a = str;
        this.f100872b = youTubePlayerView;
        this.f100873c = z13;
    }

    @Override // mo.a, mo.b
    public final void b(WebViewYouTubePlayer youTubePlayer) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        String videoId = this.f100871a;
        if (videoId != null) {
            int i13 = 0;
            boolean z13 = this.f100872b.f34788a.f34783g && this.f100873c;
            Intrinsics.checkNotNullParameter(youTubePlayer, "<this>");
            Intrinsics.checkNotNullParameter(videoId, "videoId");
            float f13 = 0.0f;
            if (z13) {
                Intrinsics.checkNotNullParameter(videoId, "videoId");
                youTubePlayer.f34787c.post(new c(youTubePlayer, videoId, f13, i13));
            } else {
                youTubePlayer.b(videoId, 0.0f);
            }
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        youTubePlayer.f34786b.remove(this);
    }
}
