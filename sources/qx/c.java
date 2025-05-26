package qx;

import com.pinterest.repository.pin.PinService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends com.pinterest.hairball.network.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105314a;

    /* renamed from: b, reason: collision with root package name */
    public final PinService f105315b;

    public c(PinService pinService, int i13) {
        this.f105314a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinService, "pinService");
            this.f105315b = pinService;
        } else {
            Intrinsics.checkNotNullParameter(pinService, "pinService");
            this.f105315b = pinService;
        }
    }

    @Override // com.pinterest.hairball.network.e
    public final com.pinterest.hairball.network.d getBuilder(Object... params) {
        switch (this.f105314a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj = params[0];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
                return new b(this, (String) obj);
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj2 = params[0];
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.String");
                return new b(this, (String) obj2, 0);
        }
    }
}
