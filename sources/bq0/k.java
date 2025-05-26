package bq0;

import com.pinterest.feature.conversation.datasource.ThreadMessagesRetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23694i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ThreadMessagesRetrofitPagedRemoteRequest f23695j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ThreadMessagesRetrofitPagedRemoteRequest threadMessagesRetrofitPagedRemoteRequest, int i13) {
        super(1);
        this.f23694i = i13;
        this.f23695j = threadMessagesRetrofitPagedRemoteRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f23694i;
        ThreadMessagesRetrofitPagedRemoteRequest threadMessagesRetrofitPagedRemoteRequest = this.f23695j;
        switch (i13) {
            case 0:
                vd0.c it = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return threadMessagesRetrofitPagedRemoteRequest.parseResponse(it);
            default:
                i0 i0Var = (i0) obj;
                Intrinsics.f(i0Var);
                threadMessagesRetrofitPagedRemoteRequest.postParseResponse(i0Var);
                return Unit.f80348a;
        }
    }
}
