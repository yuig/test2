package lo;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f84158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f84159c;

    public /* synthetic */ f(i iVar, float f13, int i13) {
        this.f84157a = i13;
        this.f84158b = iVar;
        this.f84159c = f13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f84157a;
        float f13 = this.f84159c;
        i this$0 = this.f84158b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (mo.b bVar : ((WebViewYouTubePlayer) this$0.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer = (WebViewYouTubePlayer) this$0.f84162a;
                    webViewYouTubePlayer.getClass();
                    bVar.g(webViewYouTubePlayer, f13);
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (mo.b bVar2 : ((WebViewYouTubePlayer) this$0.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer2 = (WebViewYouTubePlayer) this$0.f84162a;
                    webViewYouTubePlayer2.getClass();
                    bVar2.e(webViewYouTubePlayer2, f13);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (mo.b bVar3 : ((WebViewYouTubePlayer) this$0.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer3 = (WebViewYouTubePlayer) this$0.f84162a;
                    webViewYouTubePlayer3.getClass();
                    bVar3.c(webViewYouTubePlayer3, f13);
                }
                break;
        }
    }
}
