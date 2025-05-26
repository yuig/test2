package wl1;

import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130174a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gm1.a f130175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GestaltBannerOverlay f130176c;

    public /* synthetic */ a(GestaltBannerOverlay gestaltBannerOverlay, gm1.a aVar) {
        this.f130176c = gestaltBannerOverlay;
        this.f130175b = aVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f130174a;
        GestaltBannerOverlay this$0 = this.f130176c;
        gm1.a eventHandler = this.f130175b;
        switch (i13) {
            case 0:
                al1.n nVar = GestaltBannerOverlay.f49304m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(eventHandler, "$eventHandler");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    int j13 = it.j();
                    if (j13 != this$0.L().f130181c.f28012a.f139308i) {
                        if (j13 == this$0.L().f130181c.f28013b.f139308i) {
                            eventHandler.h3(new p(this$0.L().f130181c.f28013b.f139308i));
                            break;
                        }
                    } else {
                        eventHandler.h3(new o(this$0.L().f130181c.f28012a.f139308i));
                        break;
                    }
                }
                break;
            default:
                al1.n nVar2 = GestaltBannerOverlay.f49304m;
                Intrinsics.checkNotNullParameter(eventHandler, "$eventHandler");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    eventHandler.h3(new n(this$0.L().f130183e.f96647i));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(gm1.a aVar, GestaltBannerOverlay gestaltBannerOverlay) {
        this.f130175b = aVar;
        this.f130176c = gestaltBannerOverlay;
    }
}
