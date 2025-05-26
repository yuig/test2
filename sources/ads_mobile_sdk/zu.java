package ads_mobile_sdk;

import android.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.chromium.net.UrlRequest;

/* loaded from: classes2.dex */
public final class zu implements Interceptor, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final y82 f14933a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14934b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14935c;

    public zu(y82 y82Var) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.f14935c = scheduledThreadPoolExecutor;
        y82Var.getClass();
        this.f14933a = y82Var;
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new a.ig(this, 1), 500L, 500L, TimeUnit.MILLISECONDS);
    }

    public final /* synthetic */ void a() {
        Iterator it = this.f14934b.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Call) entry.getKey()).getF95912p()) {
                    it.remove();
                    ((UrlRequest) entry.getValue()).cancel();
                }
            } catch (RuntimeException e13) {
                Log.w("CronetInterceptor", "Unable to propagate cancellation status", e13);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f14935c.shutdown();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        if (chain.call().getF95912p()) {
            throw new IOException("Canceled");
        }
        Request d2 = chain.d();
        y82 y82Var = this.f14933a;
        int a13 = chain.a();
        int c13 = chain.c();
        y82Var.getClass();
        bq1 bq1Var = new bq1(a13, y82Var.f14149e);
        UrlRequest.Builder allowDirectExecutor = y82Var.f14145a.newUrlRequestBuilder(d2.f95700a.f95639i, bq1Var, com.google.common.util.concurrent.r.INSTANCE).allowDirectExecutor();
        allowDirectExecutor.setHttpMethod(d2.f95701b);
        int i13 = 0;
        while (true) {
            Headers headers = d2.f95702c;
            if (i13 >= headers.size()) {
                break;
            }
            allowDirectExecutor.addHeader(headers.d(i13), headers.j(i13));
            i13++;
        }
        RequestBody requestBody = d2.f95703d;
        if (requestBody != null) {
            if (d2.a("Content-Length") == null && requestBody.a() != -1) {
                allowDirectExecutor.addHeader("Content-Length", String.valueOf(requestBody.a()));
            }
            if (requestBody.a() != 0) {
                if (requestBody.getF95665d() != null) {
                    allowDirectExecutor.addHeader("Content-Type", requestBody.getF95665d().f95654a);
                } else if (d2.a("Content-Type") == null) {
                    allowDirectExecutor.addHeader("Content-Type", "application/octet-stream");
                }
                allowDirectExecutor.setUploadDataProvider(y82Var.f14148d.a(requestBody, c13), y82Var.f14146b);
            }
        }
        UrlRequest build = allowDirectExecutor.build();
        w82 w82Var = new w82(build, new v82(y82Var, d2, bq1Var));
        this.f14934b.put(chain.call(), build);
        try {
            build.start();
            return a(chain.call(), w82Var.a());
        } catch (IOException | RuntimeException e13) {
            this.f14934b.remove(chain.call());
            throw e13;
        }
    }

    public final Response a(Call call, Response response) {
        response.f95726g.getClass();
        ResponseBody responseBody = response.f95726g;
        if (responseBody instanceof yu) {
            return response;
        }
        Response.Builder e13 = response.e();
        e13.f95740g = new yu(this, responseBody, call);
        return e13.b();
    }
}
