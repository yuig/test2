package vu1;

import ao2.k2;
import ao2.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
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

/* loaded from: classes2.dex */
public final class d implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final s f126660a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f126661b;

    /* renamed from: c, reason: collision with root package name */
    public e f126662c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f126663d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f126664e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f126665f;

    /* renamed from: g, reason: collision with root package name */
    public final b f126666g;

    /* renamed from: h, reason: collision with root package name */
    public final ho2.c f126667h;

    /* renamed from: i, reason: collision with root package name */
    public k2 f126668i;

    public d(s cronetClient, Request request) {
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f126660a = cronetClient;
        this.f126661b = request;
        this.f126663d = cronetClient.f126712i ? cronetClient.g().a(this) : EventListener.f95611a;
        this.f126664e = new AtomicBoolean();
        this.f126665f = new AtomicBoolean();
        b bVar = new b();
        bVar.g(cronetClient.f126713j, TimeUnit.MILLISECONDS);
        this.f126666g = bVar;
        ko2.f fVar = v0.f20219a;
        this.f126667h = dl2.b.b(ko2.e.f80326c);
    }

    public final void a() {
        UrlRequest a13;
        if (this.f126665f.get()) {
            throw new IOException("Can't execute canceled requests");
        }
        if (!(!this.f126664e.getAndSet(true))) {
            throw new IllegalStateException("Already Executed".toString());
        }
        e eVar = this.f126662c;
        if (eVar != null && (a13 = eVar.a()) != null && !(!a13.isDone())) {
            throw new IllegalStateException("The request was successfully started and is now finished (completed, canceled, or failed)".toString());
        }
    }

    public final Response b() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f126660a;
        k0.u((List) sVar.f126715l.getValue(), arrayList);
        OkHttpClient okHttpClient = sVar.f126704a;
        arrayList.add(new y0(okHttpClient));
        arrayList.add(new BridgeInterceptor(okHttpClient.cookieJar()));
        k0.u((List) sVar.f126716m.getValue(), arrayList);
        e eVar = new e(sVar);
        arrayList.add(eVar);
        this.f126662c = eVar;
        Response b13 = new w(this, arrayList, 0, this.f126661b, okHttpClient.connectTimeoutMillis(), okHttpClient.readTimeoutMillis(), okHttpClient.writeTimeoutMillis()).b(this.f126661b);
        this.f126663d.y(this, b13);
        return b13;
    }

    public final Response c(Response response) {
        ResponseBody responseBody = response.f95726g;
        if (responseBody == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Response.Builder e13 = response.e();
        e13.f95740g = new c(responseBody, this, !this.f126660a.f126710g.isEmpty(), 0);
        return e13.b();
    }

    @Override // okhttp3.Call
    public final void cancel() {
        UrlRequest urlRequest;
        if (this.f126665f.getAndSet(true)) {
            return;
        }
        e eVar = this.f126662c;
        if (eVar != null && (urlRequest = eVar.f126670b) != null) {
            urlRequest.cancel();
        }
        this.f126663d.g(this);
        k2 k2Var = this.f126668i;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
    }

    public final Object clone() {
        return this.f126660a.newCall(this.f126661b);
    }

    @Override // okhttp3.Call
    /* renamed from: d */
    public final Request getF95898b() {
        return this.f126661b;
    }

    @Override // okhttp3.Call
    public final Response e() {
        b bVar = this.f126666g;
        a();
        try {
            bVar.j();
            this.f126663d.f(this);
            return c(b());
        } catch (IOException e13) {
            bVar.k();
            throw e13;
        } catch (RuntimeException e14) {
            bVar.k();
            throw e14;
        }
    }

    @Override // okhttp3.Call
    /* renamed from: f */
    public final boolean getF95912p() {
        return this.f126665f.get();
    }

    @Override // okhttp3.Call
    public final void k1(Callback responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        try {
            a();
            this.f126666g.j();
            this.f126663d.f(this);
        } catch (Throwable th3) {
            responseCallback.onFailure(this, new IOException(th3));
        }
        this.f126668i = kotlin.jvm.internal.j.z(this.f126667h, null, null, new a(this, responseCallback, null), 3);
    }
}
