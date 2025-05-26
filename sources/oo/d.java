package oo;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends mo.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f96796a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f96797b;

    /* renamed from: c, reason: collision with root package name */
    public lo.c f96798c;

    /* renamed from: d, reason: collision with root package name */
    public String f96799d;

    /* renamed from: e, reason: collision with root package name */
    public float f96800e;

    @Override // mo.a, mo.b
    public final void a(WebViewYouTubePlayer youTubePlayer, String videoId) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        this.f96799d = videoId;
    }

    @Override // mo.a, mo.b
    public final void f(WebViewYouTubePlayer youTubePlayer, lo.c error) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(error, "error");
        if (error == lo.c.HTML_5_PLAYER) {
            this.f96798c = error;
        }
    }

    @Override // mo.a, mo.b
    public final void g(WebViewYouTubePlayer youTubePlayer, float f13) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        this.f96800e = f13;
    }

    @Override // mo.a, mo.b
    public final void h(WebViewYouTubePlayer youTubePlayer, lo.d state) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = c.f96795a[state.ordinal()];
        if (i13 == 1) {
            this.f96797b = false;
        } else if (i13 == 2) {
            this.f96797b = false;
        } else {
            if (i13 != 3) {
                return;
            }
            this.f96797b = true;
        }
    }
}
