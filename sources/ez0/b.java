package ez0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60666b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f60667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wa2.i pinFeatureConfig, dz0.a oneTapPinPresenterListener, int i13) {
        super(oneTapPinPresenterListener);
        this.f60666b = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
            Intrinsics.checkNotNullParameter(oneTapPinPresenterListener, "oneTapPinPresenterListener");
            super(oneTapPinPresenterListener);
            this.f60667c = pinFeatureConfig;
            return;
        }
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(oneTapPinPresenterListener, "oneTapPinPresenterListener");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(oneTapPinPresenterListener, "oneTapPinPresenterListener");
        this.f60667c = new wq0.a(pinFeatureConfig, 0);
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        int i14 = this.f60666b;
        Object obj2 = this.f60667c;
        switch (i14) {
            case 0:
                SingleColumnCarouselPinView view = (SingleColumnCarouselPinView) nVar;
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(pin, "model");
                wq0.a aVar = (wq0.a) obj2;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(pin, "pin");
                view.bindItem(pin, i13, aVar.f130791b);
                break;
            default:
                bz0.c view2 = (bz0.c) nVar;
                f30 model = (f30) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                com.bumptech.glide.c.n((wa2.i) obj2, view2, model, i13);
                break;
        }
    }
}
