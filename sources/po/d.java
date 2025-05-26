package po;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewYouTubePlayer f100870b;

    public /* synthetic */ d(WebViewYouTubePlayer webViewYouTubePlayer, int i13) {
        this.f100869a = i13;
        this.f100870b = webViewYouTubePlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f100869a;
        WebViewYouTubePlayer this$0 = this.f100870b;
        switch (i13) {
            case 0:
                int i14 = WebViewYouTubePlayer.f34784d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.loadUrl("javascript:pauseVideo()");
                break;
            default:
                int i15 = WebViewYouTubePlayer.f34784d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.loadUrl("javascript:playVideo()");
                break;
        }
    }
}
