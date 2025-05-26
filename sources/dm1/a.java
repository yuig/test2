package dm1;

import com.pinterest.gestalt.callout.GestaltCallout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55350a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gm1.a f55351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GestaltCallout f55352c;

    public /* synthetic */ a(GestaltCallout gestaltCallout, gm1.a aVar) {
        this.f55352c = gestaltCallout;
        this.f55351b = aVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f55350a;
        GestaltCallout this$0 = this.f55352c;
        gm1.a eventHandler = this.f55351b;
        switch (i13) {
            case 0:
                d dVar = GestaltCallout.f49346g;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(eventHandler, "$eventHandler");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    int j13 = it.j();
                    if (j13 != this$0.L().f55357c.f28012a.f139308i) {
                        if (j13 == this$0.L().f55357c.f28013b.f139308i) {
                            eventHandler.h3(new m(this$0.L().f55357c.f28013b.f139308i));
                            break;
                        }
                    } else {
                        eventHandler.h3(new l(this$0.L().f55357c.f28012a.f139308i));
                        break;
                    }
                }
                break;
            default:
                d dVar2 = GestaltCallout.f49346g;
                Intrinsics.checkNotNullParameter(eventHandler, "$eventHandler");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    eventHandler.h3(new k(this$0.L().f55359e.f96647i));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(gm1.a aVar, GestaltCallout gestaltCallout) {
        this.f55351b = aVar;
        this.f55352c = gestaltCallout;
    }
}
