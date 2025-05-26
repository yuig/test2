package j81;

import com.pinterest.feature.search.visual.flashlight.datasource.FlashlightRetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tb0.p;
import uk2.l;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74941i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FlashlightRetrofitPagedRemoteRequest f74942j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f74943k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(FlashlightRetrofitPagedRemoteRequest flashlightRetrofitPagedRemoteRequest, l lVar, int i13) {
        super(1);
        this.f74941i = i13;
        this.f74942j = flashlightRetrofitPagedRemoteRequest;
        this.f74943k = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74941i;
        l lVar = this.f74943k;
        FlashlightRetrofitPagedRemoteRequest flashlightRetrofitPagedRemoteRequest = this.f74942j;
        switch (i13) {
            case 0:
                vd0.c it = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!flashlightRetrofitPagedRemoteRequest.f48044a) {
                    return flashlightRetrofitPagedRemoteRequest.parseResponse(it);
                }
                if (lVar != null) {
                    lVar.c(it);
                }
                if (lVar != null) {
                    lVar.a();
                }
                return new i0("", null, q0.f80391a);
            default:
                Throwable th3 = (Throwable) obj;
                if (flashlightRetrofitPagedRemoteRequest.f48044a) {
                    if (lVar != null) {
                        lVar.onError(th3);
                    }
                    if (lVar != null) {
                        lVar.a();
                    }
                } else {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.h hVar = tb0.g.f117075a;
                    hVar.h("RetrofitPagedRemoteRequest error: " + th3 + ". This has also been logged as a non-fatal exception.");
                    hVar.q(th3, "RetrofitPagedRemoteRequest error", p.PLATFORM);
                }
                return Unit.f80348a;
        }
    }
}
