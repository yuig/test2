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
public final class i implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final v f126675a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f126676b;

    /* renamed from: c, reason: collision with root package name */
    public f f126677c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f126678d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f126679e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f126680f;

    /* renamed from: g, reason: collision with root package name */
    public final h f126681g;

    /* renamed from: h, reason: collision with root package name */
    public final ho2.c f126682h;

    /* renamed from: i, reason: collision with root package name */
    public k2 f126683i;

    public i(v cronetClient, Request request) {
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f126675a = cronetClient;
        this.f126676b = request;
        this.f126678d = cronetClient.f126727h ? ((EventListener.Factory) cronetClient.f126730k.getValue()).a(this) : EventListener.f95611a;
        this.f126679e = new AtomicBoolean();
        this.f126680f = new AtomicBoolean();
        h hVar = new h();
        hVar.g(cronetClient.f126729j, TimeUnit.MILLISECONDS);
        this.f126681g = hVar;
        ko2.f fVar = v0.f20219a;
        this.f126682h = dl2.b.b(ko2.e.f80326c);
    }

    public final void a() {
        UrlRequest urlRequest;
        if (this.f126680f.get()) {
            throw new IOException("Can't execute canceled requests");
        }
        if (!(!this.f126679e.getAndSet(true))) {
            throw new IllegalStateException("Already Executed".toString());
        }
        f fVar = this.f126677c;
        if (fVar != null && (urlRequest = fVar.f126672b) != null && !(!urlRequest.isDone())) {
            throw new IllegalStateException("The request was successfully started and is now finished (completed, canceled, or failed)".toString());
        }
    }

    public final Response b() {
        ArrayList arrayList = new ArrayList();
        v vVar = this.f126675a;
        k0.u((List) vVar.f126731l.getValue(), arrayList);
        OkHttpClient okHttpClient = vVar.f126720a;
        arrayList.add(new y0(okHttpClient));
        arrayList.add(new BridgeInterceptor(okHttpClient.cookieJar()));
        k0.u((List) vVar.f126732m.getValue(), arrayList);
        f fVar = new f(vVar);
        arrayList.add(fVar);
        this.f126677c = fVar;
        Response b13 = new x(this, arrayList, 0, this.f126676b, okHttpClient.connectTimeoutMillis(), okHttpClient.readTimeoutMillis(), okHttpClient.writeTimeoutMillis()).b(this.f126676b);
        this.f126678d.y(this, b13);
        return b13;
    }

    public final Response c(Response response) {
        ResponseBody responseBody = response.f95726g;
        if (responseBody == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Response.Builder e13 = response.e();
        e13.f95740g = new c(responseBody, this, !this.f126675a.f126726g.isEmpty(), 1);
        return e13.b();
    }

    @Override // okhttp3.Call
    public final void cancel() {
        UrlRequest urlRequest;
        if (this.f126680f.getAndSet(true)) {
            return;
        }
        f fVar = this.f126677c;
        if (fVar != null && (urlRequest = fVar.f126672b) != null) {
            urlRequest.cancel();
        }
        this.f126678d.g(this);
        k2 k2Var = this.f126683i;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
    }

    public final Object clone() {
        return this.f126675a.newCall(this.f126676b);
    }

    @Override // okhttp3.Call
    /* renamed from: d */
    public final Request getF95898b() {
        return this.f126676b;
    }

    @Override // okhttp3.Call
    public final Response e() {
        h hVar = this.f126681g;
        a();
        try {
            hVar.j();
            this.f126678d.f(this);
            return c(b());
        } catch (IOException e13) {
            hVar.k();
            throw e13;
        } catch (RuntimeException e14) {
            hVar.k();
            throw e14;
        }
    }

    @Override // okhttp3.Call
    /* renamed from: f */
    public final boolean getF95912p() {
        return this.f126680f.get();
    }

    @Override // okhttp3.Call
    public final void k1(Callback responseCallback) {
        h hVar = this.f126681g;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        try {
            a();
            hVar.j();
            this.f126678d.f(this);
            this.f126683i = kotlin.jvm.internal.j.z(this.f126682h, null, null, new g(this, responseCallback, null), 3);
        } catch (Throwable th3) {
            hVar.k();
            responseCallback.onFailure(this, new IOException(th3));
        }
    }
}
