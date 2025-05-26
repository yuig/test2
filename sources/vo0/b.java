package vo0;

import java.util.Map;
import jk2.h0;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import tk2.e;
import uj2.b0;
import uj2.q;

/* loaded from: classes5.dex */
public final class b extends or0.b {

    /* renamed from: f, reason: collision with root package name */
    public final no0.a f126387f;

    /* renamed from: g, reason: collision with root package name */
    public final a f126388g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(no0.a bubbleContentRequest, a nextPageInteractor, rr0.a nextPageUrlFactory) {
        super(nextPageUrlFactory, false);
        Intrinsics.checkNotNullParameter(bubbleContentRequest, "bubbleContentRequest");
        Intrinsics.checkNotNullParameter(nextPageInteractor, "nextPageInteractor");
        Intrinsics.checkNotNullParameter(nextPageUrlFactory, "nextPageUrlFactory");
        this.f126387f = bubbleContentRequest;
        this.f126388g = nextPageInteractor;
    }

    @Override // or0.b
    public final q a(Map firstPageRequestParams) {
        Intrinsics.checkNotNullParameter(firstPageRequestParams, "firstPageRequestParams");
        Object obj = firstPageRequestParams.get("request_params");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = firstPageRequestParams.get("request_params");
        q u13 = ((b0) this.f126387f.b(new c(String.valueOf(firstPageRequestParams.get("KEY_BUBBLE_ID")), str, obj2 instanceof String ? (String) obj2 : null)).buildRequest()).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // or0.b
    public final q b(String params) {
        Intrinsics.checkNotNullParameter(params, "nextUrl");
        if (z.j(params)) {
            return h0.f76488a;
        }
        a aVar = this.f126388g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        t l13 = aVar.f126386e.a(params).r(e.f118017c).l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        return l13.u();
    }
}
