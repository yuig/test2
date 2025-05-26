package t81;

import com.pinterest.feature.search.visual.lens.remoterequest.LensFirstRetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import vd0.c;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116750i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LensFirstRetrofitPagedRemoteRequest f116751j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(LensFirstRetrofitPagedRemoteRequest lensFirstRetrofitPagedRemoteRequest, int i13) {
        super(1);
        this.f116750i = i13;
        this.f116751j = lensFirstRetrofitPagedRemoteRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f116750i;
        LensFirstRetrofitPagedRemoteRequest lensFirstRetrofitPagedRemoteRequest = this.f116751j;
        switch (i13) {
            case 0:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return lensFirstRetrofitPagedRemoteRequest.parseResponse(it);
            default:
                i0 i0Var = (i0) obj;
                Intrinsics.f(i0Var);
                lensFirstRetrofitPagedRemoteRequest.postParseResponse(i0Var);
                return Unit.f80348a;
        }
    }
}
