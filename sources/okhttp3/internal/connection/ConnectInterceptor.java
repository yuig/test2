package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final ConnectInterceptor f95864a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain chain2 = (RealInterceptorChain) chain;
        RealCall realCall = chain2.f95970a;
        realCall.getClass();
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (realCall) {
            if (!realCall.f95911o) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!realCall.f95910n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!realCall.f95909m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.f80348a;
        }
        ExchangeFinder exchangeFinder = realCall.f95905i;
        Intrinsics.f(exchangeFinder);
        OkHttpClient client = realCall.f95897a;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            Exchange exchange = new Exchange(realCall, realCall.f95901e, exchangeFinder, exchangeFinder.a(chain2.f95975f, chain2.f95976g, chain2.f95977h, client.pingIntervalMillis(), client.retryOnConnectionFailure(), !Intrinsics.d(chain2.f95974e.f95701b, "GET")).j(client, chain2));
            realCall.f95908l = exchange;
            realCall.f95913q = exchange;
            synchronized (realCall) {
                realCall.f95909m = true;
                realCall.f95910n = true;
            }
            if (realCall.f95912p) {
                throw new IOException("Canceled");
            }
            return RealInterceptorChain.f(chain2, 0, exchange, null, 61).b(chain2.f95974e);
        } catch (IOException e13) {
            exchangeFinder.c(e13);
            throw new RouteException(e13);
        } catch (RouteException e14) {
            exchangeFinder.c(e14.getF95950b());
            throw e14;
        }
    }
}
