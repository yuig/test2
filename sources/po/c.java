package po;

import android.content.res.Resources;
import android.view.View;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f100866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f100867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f100868d;

    public /* synthetic */ c(WebViewYouTubePlayer webViewYouTubePlayer, String str, float f13, int i13) {
        this.f100865a = i13;
        this.f100866b = webViewYouTubePlayer;
        this.f100867c = str;
        this.f100868d = f13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f100865a;
        float f13 = this.f100868d;
        View button = this.f100866b;
        Object obj = this.f100867c;
        switch (i13) {
            case 0:
                WebViewYouTubePlayer this$0 = (WebViewYouTubePlayer) button;
                String videoId = (String) obj;
                int i14 = WebViewYouTubePlayer.f34784d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(videoId, "$videoId");
                this$0.loadUrl("javascript:loadVideo('" + videoId + "', " + f13 + ')');
                break;
            case 1:
                WebViewYouTubePlayer this$02 = (WebViewYouTubePlayer) button;
                String videoId2 = (String) obj;
                int i15 = WebViewYouTubePlayer.f34784d;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(videoId2, "$videoId");
                this$02.loadUrl("javascript:cueVideo('" + videoId2 + "', " + f13 + ')');
                break;
            default:
                Resources resources = (Resources) obj;
                Intrinsics.checkNotNullParameter(button, "$button");
                Intrinsics.checkNotNullParameter(resources, "$resources");
                button.setY(f13 - (resources.getDimension(r0.margin) + button.getHeight()));
                break;
        }
    }

    public /* synthetic */ c(GestaltIconButton gestaltIconButton, float f13, Resources resources) {
        this.f100865a = 2;
        this.f100866b = gestaltIconButton;
        this.f100868d = f13;
        this.f100867c = resources;
    }
}
