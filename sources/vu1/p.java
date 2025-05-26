package vu1;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import ao2.k2;
import ao2.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.BridgeInterceptor;
import org.chromium.net.UrlRequest;
import tu1.y0;

/* loaded from: classes4.dex */
public final class p implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final v f126692a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f126693b;

    /* renamed from: c, reason: collision with root package name */
    public f f126694c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f126695d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f126696e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f126697f;

    /* renamed from: g, reason: collision with root package name */
    public final n f126698g;

    /* renamed from: h, reason: collision with root package name */
    public final ho2.c f126699h;

    /* renamed from: i, reason: collision with root package name */
    public k2 f126700i;

    public p(v cronetClient, Request request) {
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f126692a = cronetClient;
        this.f126693b = request;
        this.f126695d = cronetClient.f126727h ? ((EventListener.Factory) cronetClient.f126730k.getValue()).a(this) : EventListener.f95611a;
        this.f126696e = new AtomicBoolean();
        this.f126697f = new AtomicBoolean();
        n nVar = new n();
        nVar.g(cronetClient.f126729j, TimeUnit.MILLISECONDS);
        this.f126698g = nVar;
        ko2.f fVar = v0.f20219a;
        this.f126699h = dl2.b.b(ko2.e.f80326c);
    }

    public final void a() {
        UrlRequest urlRequest;
        if (this.f126697f.get()) {
            throw new IOException("Can't execute canceled requests");
        }
        if (!(!this.f126696e.getAndSet(true))) {
            throw new IllegalStateException("Already Executed".toString());
        }
        f fVar = this.f126694c;
        if (fVar != null && (urlRequest = fVar.f126672b) != null && !(!urlRequest.isDone())) {
            throw new IllegalStateException("The request was successfully started and is now finished (completed, canceled, or failed)".toString());
        }
    }

    public final Response b() {
        ArrayList arrayList = new ArrayList();
        v vVar = this.f126692a;
        k0.u((List) vVar.f126731l.getValue(), arrayList);
        OkHttpClient okHttpClient = vVar.f126720a;
        arrayList.add(new y0(okHttpClient));
        arrayList.add(new BridgeInterceptor(okHttpClient.cookieJar()));
        f fVar = new f(vVar);
        arrayList.add(fVar);
        this.f126694c = fVar;
        Response b13 = new x(this, arrayList, 0, this.f126693b, okHttpClient.connectTimeoutMillis(), okHttpClient.readTimeoutMillis(), okHttpClient.writeTimeoutMillis()).b(this.f126693b);
        this.f126695d.y(this, b13);
        return b13;
    }

    public final void c(Callback callback) {
        n nVar = this.f126698g;
        try {
            callback.onResponse(this, g(b()));
        } catch (IOException e13) {
            callback.onFailure(this, e13);
            nVar.k();
        } catch (ExecutionException e14) {
            e = e14;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            callback.onFailure(this, new IOException(e));
            nVar.k();
        } catch (Throwable th3) {
            callback.onFailure(this, new IOException(th3));
            nVar.k();
        }
    }

    @Override // okhttp3.Call
    public final void cancel() {
        UrlRequest urlRequest;
        if (this.f126697f.getAndSet(true)) {
            return;
        }
        f fVar = this.f126694c;
        if (fVar != null && (urlRequest = fVar.f126672b) != null) {
            urlRequest.cancel();
        }
        this.f126695d.g(this);
        k2 k2Var = this.f126700i;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
    }

    public final Object clone() {
        return this.f126692a.newCall(this.f126693b);
    }

    @Override // okhttp3.Call
    /* renamed from: d */
    public final Request getF95898b() {
        return this.f126693b;
    }

    @Override // okhttp3.Call
    public final Response e() {
        n nVar = this.f126698g;
        a();
        try {
            nVar.j();
            this.f126695d.f(this);
            if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                return g(b());
            }
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.q(new NetworkOnMainThreadException(), "CronetCallUnifiedV2 : Network blocking calls should not be performed on the UI thread, request: " + this.f126693b.f95700a, tb0.p.PERFORMANCE);
            return (Response) kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new m(this, null));
        } catch (IOException e13) {
            nVar.k();
            throw e13;
        } catch (RuntimeException e14) {
            nVar.k();
            throw e14;
        }
    }

    @Override // okhttp3.Call
    /* renamed from: f */
    public final boolean getF95912p() {
        return this.f126697f.get();
    }

    public final Response g(Response response) {
        ResponseBody responseBody = response.f95726g;
        if (responseBody == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Response.Builder e13 = response.e();
        e13.f95740g = new o(responseBody, this, !this.f126692a.f126726g.isEmpty());
        return e13.b();
    }

    @Override // okhttp3.Call
    public final void k1(Callback responseCallback) {
        n nVar = this.f126698g;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        try {
            a();
            nVar.j();
            this.f126695d.f(this);
            if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                c(responseCallback);
            } else {
                this.f126700i = kotlin.jvm.internal.j.z(this.f126699h, null, null, new j(this, responseCallback, null), 3);
            }
        } catch (Throwable th3) {
            responseCallback.onFailure(this, new IOException(th3));
            nVar.k();
        }
    }
}
