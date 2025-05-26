package cj0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import z32.f2;

/* loaded from: classes5.dex */
public final class f0 extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final tj0.w f27822a;

    public f0(wa2.m pinFeatureConfig, n onClickAction) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        this.f27822a = new tj0.w(pinFeatureConfig.e(), (mj0.g) new u60.a(onClickAction, 1), false, (f2) null, 28);
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        tj0.z view = (tj0.z) nVar;
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f27822a.h(view, model, i13);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        switch (this.f27822a.f117900a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return null;
    }
}
