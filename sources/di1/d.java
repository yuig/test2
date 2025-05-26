package di1;

import com.pinterest.video.view.SimplePlayerControlView;
import kotlin.jvm.internal.Intrinsics;
import om1.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimplePlayerControlView f55054b;

    public /* synthetic */ d(SimplePlayerControlView simplePlayerControlView, int i13) {
        this.f55053a = i13;
        this.f55054b = simplePlayerControlView;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        pc2.a aVar;
        pc2.a aVar2;
        int i13 = this.f55053a;
        SimplePlayerControlView playerControls = this.f55054b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(playerControls, "$playerControls");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((it instanceof l) && (aVar = playerControls.f52790m0) != null) {
                    aVar.d();
                    break;
                }
                break;
            default:
                int i14 = SimplePlayerControlView.f52779q0;
                Intrinsics.checkNotNullParameter(playerControls, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((it instanceof l) && (aVar2 = playerControls.f52790m0) != null) {
                    aVar2.d();
                    break;
                }
                break;
        }
    }
}
