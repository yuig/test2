package okhttp3.internal.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f95970a;

    /* renamed from: b, reason: collision with root package name */
    public final List f95971b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95972c;

    /* renamed from: d, reason: collision with root package name */
    public final Exchange f95973d;

    /* renamed from: e, reason: collision with root package name */
    public final Request f95974e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95975f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95976g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95977h;

    /* renamed from: i, reason: collision with root package name */
    public int f95978i;

    public RealInterceptorChain(RealCall call, List interceptors, int i13, Exchange exchange, Request request, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f95970a = call;
        this.f95971b = interceptors;
        this.f95972c = i13;
        this.f95973d = exchange;
        this.f95974e = request;
        this.f95975f = i14;
        this.f95976g = i15;
        this.f95977h = i16;
    }

    public static RealInterceptorChain f(RealInterceptorChain realInterceptorChain, int i13, Exchange exchange, Request request, int i14) {
        if ((i14 & 1) != 0) {
            i13 = realInterceptorChain.f95972c;
        }
        int i15 = i13;
        if ((i14 & 2) != 0) {
            exchange = realInterceptorChain.f95973d;
        }
        Exchange exchange2 = exchange;
        if ((i14 & 4) != 0) {
            request = realInterceptorChain.f95974e;
        }
        Request request2 = request;
        int i16 = realInterceptorChain.f95975f;
        int i17 = realInterceptorChain.f95976g;
        int i18 = realInterceptorChain.f95977h;
        realInterceptorChain.getClass();
        Intrinsics.checkNotNullParameter(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f95970a, realInterceptorChain.f95971b, i15, exchange2, request2, i16, i17, i18);
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: a, reason: from getter */
    public final int getF95976g() {
        return this.f95976g;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response b(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        List list = this.f95971b;
        int size = list.size();
        int i13 = this.f95972c;
        if (i13 >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f95978i++;
        Exchange exchange = this.f95973d;
        if (exchange != null) {
            if (!exchange.f95871c.b(request.f95700a)) {
                throw new IllegalStateException(("network interceptor " + list.get(i13 - 1) + " must retain the same host and port").toString());
            }
            if (this.f95978i != 1) {
                throw new IllegalStateException(("network interceptor " + list.get(i13 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i14 = i13 + 1;
        RealInterceptorChain f13 = f(this, i14, null, request, 58);
        Interceptor interceptor = (Interceptor) list.get(i13);
        Response intercept = interceptor.intercept(f13);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange != null && i14 < list.size() && f13.f95978i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (intercept.f95726g != null) {
            return intercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: c, reason: from getter */
    public final int getF95977h() {
        return this.f95977h;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Call call() {
        return this.f95970a;
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: d, reason: from getter */
    public final Request getF95974e() {
        return this.f95974e;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Connection e() {
        Exchange exchange = this.f95973d;
        if (exchange != null) {
            return exchange.f95875g;
        }
        return null;
    }
}
