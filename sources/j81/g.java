package j81;

import com.pinterest.feature.search.visual.flashlight.datasource.FlashlightRetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74938i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FlashlightRetrofitPagedRemoteRequest f74939j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(FlashlightRetrofitPagedRemoteRequest flashlightRetrofitPagedRemoteRequest, int i13) {
        super(1);
        this.f74938i = i13;
        this.f74939j = flashlightRetrofitPagedRemoteRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74938i;
        FlashlightRetrofitPagedRemoteRequest flashlightRetrofitPagedRemoteRequest = this.f74939j;
        switch (i13) {
            case 0:
                ConcurrentHashMap concurrentHashMap = FlashlightRetrofitPagedRemoteRequest.f48043b;
                flashlightRetrofitPagedRemoteRequest.getClass();
                break;
            case 1:
                vd0.c it = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ConcurrentHashMap concurrentHashMap2 = FlashlightRetrofitPagedRemoteRequest.f48043b;
                break;
            case 2:
                i0 i0Var = (i0) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.f(i0Var);
                        ConcurrentHashMap concurrentHashMap3 = FlashlightRetrofitPagedRemoteRequest.f48043b;
                        flashlightRetrofitPagedRemoteRequest.postParseResponse(i0Var);
                        break;
                    default:
                        if (!flashlightRetrofitPagedRemoteRequest.f48044a) {
                            Intrinsics.f(i0Var);
                            flashlightRetrofitPagedRemoteRequest.postParseResponse(i0Var);
                            break;
                        }
                        break;
                }
                break;
            default:
                i0 i0Var2 = (i0) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.f(i0Var2);
                        ConcurrentHashMap concurrentHashMap4 = FlashlightRetrofitPagedRemoteRequest.f48043b;
                        flashlightRetrofitPagedRemoteRequest.postParseResponse(i0Var2);
                        break;
                    default:
                        if (!flashlightRetrofitPagedRemoteRequest.f48044a) {
                            Intrinsics.f(i0Var2);
                            flashlightRetrofitPagedRemoteRequest.postParseResponse(i0Var2);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
