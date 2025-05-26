package fs0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class v implements uj2.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dl1.s f62900b;

    public /* synthetic */ v(int i13, dl1.s sVar) {
        this.f62899a = i13;
        this.f62900b = sVar;
    }

    @Override // uj2.t
    public final void d(uj2.v it) {
        int i13 = this.f62899a;
        dl1.s model = this.f62900b;
        switch (i13) {
            case 0:
                f30 pin = (f30) model;
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(it, "it");
                pin.getClass();
                break;
            case 1:
                f30 pin2 = (f30) model;
                Intrinsics.checkNotNullParameter(pin2, "$pin");
                Intrinsics.checkNotNullParameter(it, "it");
                vy0 f23 = wy0.f2();
                f23.p1(b40.H(pin2));
                f23.a();
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(it, "it");
                it.c(model);
                it.a();
                break;
        }
    }
}
