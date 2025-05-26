package qi1;

import com.google.firebase.messaging.a0;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pincarouselads.view.o;
import i2.j2;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import ni1.c0;
import ni1.d0;
import ni1.t2;
import ni1.y2;
import so.ba;
import ti1.f;
import uk1.d;
import vq0.h;
import wa2.i;
import wt1.e;
import xk2.m;
import xk2.v;
import yk1.n;

/* loaded from: classes2.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final i f104001a;

    /* renamed from: b, reason: collision with root package name */
    public final v f104002b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f104003c;

    public b(i pinFeatureConfig, d presenterPinalytics, d0 pinModelToVMStateConverterFactory, t2 pinRepViewModelFactory) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinModelToVMStateConverterFactory, "pinModelToVMStateConverterFactory");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        this.f104001a = pinFeatureConfig;
        this.f104002b = m.b(new j2(8, this, pinRepViewModelFactory));
        this.f104003c = ((ba) pinModelToVMStateConverterFactory).a(f0.i0(pinFeatureConfig), new o(presenterPinalytics, 1), new a0(presenterPinalytics, 19));
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        f view = (f) nVar;
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        a aVar = (a) this.f104002b.getValue();
        y2 a13 = this.f104003c.a(i13, model);
        aVar.getClass();
        wt1.f.j(view, a13);
    }

    @Override // vq0.h
    public final yk1.m f() {
        a aVar = (a) this.f104002b.getValue();
        aVar.getClass();
        return new e(aVar);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
