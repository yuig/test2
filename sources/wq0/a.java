package wq0;

import com.bumptech.glide.c;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import kotlin.jvm.internal.Intrinsics;
import qa2.f0;
import vq0.h;
import wa2.i;
import yk1.n;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130790a;

    /* renamed from: b, reason: collision with root package name */
    public final i f130791b;

    public a(i pinFeatureConfig, int i13) {
        this.f130790a = i13;
        if (i13 == 1) {
            this.f130791b = pinFeatureConfig;
        } else {
            Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
            this.f130791b = pinFeatureConfig;
        }
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        int i14 = this.f130790a;
        i iVar = this.f130791b;
        switch (i14) {
            case 0:
                SingleColumnCarouselPinView view = (SingleColumnCarouselPinView) nVar;
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(pin, "pin");
                view.bindItem(pin, i13, iVar);
                break;
            default:
                c.n(iVar, (f0) nVar, (f30) obj, i13);
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f130790a;
        switch (i14) {
            case 0:
                f30 model = (f30) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                    default:
                        return null;
                }
            default:
                f30 model2 = (f30) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model2, "model");
                    default:
                        return null;
                }
        }
        return null;
    }
}
