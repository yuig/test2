package po;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.widget.FrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import nc2.h;
import oq.a1;
import oq.z0;
import rq.v4;

/* loaded from: classes3.dex */
public final class a extends mo.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f100863b;

    public a(FrameLayout frameLayout, int i13) {
        this.f100862a = i13;
        this.f100863b = frameLayout;
    }

    @Override // mo.a, mo.b
    public final void b(WebViewYouTubePlayer youTubePlayer) {
        int i13 = this.f100862a;
        FrameLayout frameLayout = this.f100863b;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                LegacyYouTubePlayerView legacyYouTubePlayerView = (LegacyYouTubePlayerView) frameLayout;
                legacyYouTubePlayerView.f34780d = true;
                HashSet hashSet = legacyYouTubePlayerView.f34782f;
                Iterator it = hashSet.iterator();
                if (it.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                    throw null;
                }
                hashSet.clear();
                Intrinsics.checkNotNullParameter(this, "listener");
                youTubePlayer.f34786b.remove(this);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                super.b(youTubePlayer);
                a1 a1Var = (a1) frameLayout;
                a1Var.f96949e = youTubePlayer;
                youTubePlayer.a(new z0(a1Var));
                String videoId = a1Var.f96947c;
                if (videoId != null) {
                    h hVar = h.f90405a;
                    float f13 = h.a(a1Var.f96948d).f90410b;
                    lo.e eVar = a1Var.f96949e;
                    if (eVar != null) {
                        if (!a1Var.f96950f) {
                            ((WebViewYouTubePlayer) eVar).b(videoId, f13);
                            return;
                        }
                        WebViewYouTubePlayer webViewYouTubePlayer = (WebViewYouTubePlayer) eVar;
                        Intrinsics.checkNotNullParameter(videoId, "videoId");
                        webViewYouTubePlayer.f34787c.post(new c(webViewYouTubePlayer, videoId, f13, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.b(youTubePlayer);
                return;
        }
    }

    @Override // mo.a, mo.b
    public final void f(WebViewYouTubePlayer youTubePlayer, lo.c error) {
        switch (this.f100862a) {
            case 2:
                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                Intrinsics.checkNotNullParameter(error, "error");
                super.f(youTubePlayer, error);
                v4 v4Var = ((a1) this.f100863b).f96952h;
                if (v4Var != null) {
                    v4Var.f109605a.i();
                    break;
                }
                break;
            default:
                super.f(youTubePlayer, error);
                break;
        }
    }

    @Override // mo.a, mo.b
    public final void h(WebViewYouTubePlayer youTubePlayer, lo.d state) {
        switch (this.f100862a) {
            case 0:
                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                Intrinsics.checkNotNullParameter(state, "state");
                if (state == lo.d.PLAYING) {
                    LegacyYouTubePlayerView legacyYouTubePlayerView = (LegacyYouTubePlayerView) this.f100863b;
                    if (!legacyYouTubePlayerView.f34783g) {
                        legacyYouTubePlayerView.f34777a.getClass();
                        youTubePlayer.f34787c.post(new d(youTubePlayer, 0));
                        break;
                    }
                }
                break;
            default:
                super.h(youTubePlayer, state);
                break;
        }
    }
}
