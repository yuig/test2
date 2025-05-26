package lo;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f84161b;

    public /* synthetic */ g(i iVar, int i13) {
        this.f84160a = i13;
        this.f84161b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f84160a;
        i this$0 = this.f84161b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (mo.b bVar : ((WebViewYouTubePlayer) this$0.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer = (WebViewYouTubePlayer) this$0.f84162a;
                    webViewYouTubePlayer.getClass();
                    bVar.d(webViewYouTubePlayer);
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (mo.b bVar2 : ((WebViewYouTubePlayer) this$0.f84162a).c()) {
                    WebViewYouTubePlayer webViewYouTubePlayer2 = (WebViewYouTubePlayer) this$0.f84162a;
                    webViewYouTubePlayer2.getClass();
                    bVar2.b(webViewYouTubePlayer2);
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WebViewYouTubePlayer webViewYouTubePlayer3 = (WebViewYouTubePlayer) this$0.f84162a;
                Function1 function1 = webViewYouTubePlayer3.f34785a;
                if (function1 != null) {
                    function1.invoke(webViewYouTubePlayer3);
                    return;
                } else {
                    Intrinsics.r("youTubePlayerInitListener");
                    throw null;
                }
        }
    }
}
