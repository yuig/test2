package pq2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class g0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f101026a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f101027b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f101028c;

    /* renamed from: d, reason: collision with root package name */
    public final Call.Factory f101029d;

    /* renamed from: e, reason: collision with root package name */
    public final p f101030e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f101031f;

    /* renamed from: g, reason: collision with root package name */
    public Call f101032g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f101033h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f101034i;

    public g0(z0 z0Var, Object obj, Object[] objArr, Call.Factory factory, p pVar) {
        this.f101026a = z0Var;
        this.f101027b = obj;
        this.f101028c = objArr;
        this.f101029d = factory;
        this.f101030e = pVar;
    }

    public final Call a() {
        HttpUrl url;
        z0 z0Var = this.f101026a;
        z0Var.getClass();
        Object[] objArr = this.f101028c;
        int length = objArr.length;
        k1[] k1VarArr = z0Var.f101151k;
        if (length != k1VarArr.length) {
            throw new IllegalArgumentException(a.a.n(a.a.s("Argument count (", length, ") doesn't match expected count ("), k1VarArr.length, ")"));
        }
        x0 x0Var = new x0(z0Var.f101144d, z0Var.f101143c, z0Var.f101145e, z0Var.f101146f, z0Var.f101147g, z0Var.f101148h, z0Var.f101149i, z0Var.f101150j);
        if (z0Var.f101152l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i13 = 0; i13 < length; i13++) {
            arrayList.add(objArr[i13]);
            k1VarArr[i13].a(x0Var, objArr[i13]);
        }
        HttpUrl.Builder builder = x0Var.f101104d;
        if (builder != null) {
            url = builder.c();
        } else {
            String str = x0Var.f101103c;
            HttpUrl httpUrl = x0Var.f101102b;
            url = httpUrl.i(str);
            if (url == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + x0Var.f101103c);
            }
        }
        RequestBody requestBody = x0Var.f101111k;
        if (requestBody == null) {
            FormBody.Builder builder2 = x0Var.f101110j;
            if (builder2 != null) {
                requestBody = new FormBody(builder2.f95616b, builder2.f95617c);
            } else {
                MultipartBody.Builder builder3 = x0Var.f101109i;
                if (builder3 != null) {
                    requestBody = builder3.b();
                } else if (x0Var.f101108h) {
                    byte[] content = new byte[0];
                    RequestBody.Companion companion = RequestBody.f95711a;
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(content, "content");
                    requestBody = RequestBody.Companion.d(companion, null, content);
                }
            }
        }
        MediaType mediaType = x0Var.f101107g;
        Headers.Builder builder4 = x0Var.f101106f;
        if (mediaType != null) {
            if (requestBody != null) {
                requestBody = new w0(requestBody, mediaType);
            } else {
                builder4.a("Content-Type", mediaType.f95654a);
            }
        }
        Request.Builder builder5 = x0Var.f101105e;
        builder5.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        builder5.f95706a = url;
        builder5.e(builder4.e());
        builder5.f(x0Var.f101101a, requestBody);
        builder5.i(x.class, new x(z0Var.f101141a, this.f101027b, z0Var.f101142b, arrayList));
        Call newCall = this.f101029d.newCall(builder5.b());
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final Call b() {
        Call call = this.f101032g;
        if (call != null) {
            return call;
        }
        Throwable th3 = this.f101033h;
        if (th3 != null) {
            if (th3 instanceof IOException) {
                throw ((IOException) th3);
            }
            if (th3 instanceof RuntimeException) {
                throw ((RuntimeException) th3);
            }
            throw ((Error) th3);
        }
        try {
            Call a13 = a();
            this.f101032g = a13;
            return a13;
        } catch (IOException | Error | RuntimeException e13) {
            k1.q(e13);
            this.f101033h = e13;
            throw e13;
        }
    }

    public final a1 c(Response response) {
        ResponseBody responseBody = response.f95726g;
        Response.Builder e13 = response.e();
        e13.f95740g = new f0(responseBody.getF95751d(), responseBody.getF95752e());
        Response b13 = e13.b();
        int i13 = b13.f95723d;
        if (i13 < 200 || i13 >= 300) {
            try {
                wo2.j jVar = new wo2.j();
                responseBody.getF95753f().f0(jVar);
                return a1.a(ResponseBody.create(responseBody.getF95751d(), responseBody.getF95752e(), jVar), b13);
            } finally {
                responseBody.close();
            }
        }
        if (i13 == 204 || i13 == 205) {
            responseBody.close();
            return a1.c(null, b13);
        }
        e0 e0Var = new e0(responseBody);
        try {
            return a1.c(this.f101030e.a(e0Var), b13);
        } catch (RuntimeException e14) {
            e0Var.a();
            throw e14;
        }
    }

    @Override // pq2.i
    public final void cancel() {
        Call call;
        this.f101031f = true;
        synchronized (this) {
            call = this.f101032g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new g0(this.f101026a, this.f101027b, this.f101028c, this.f101029d, this.f101030e);
    }

    @Override // pq2.i
    public final synchronized Request d() {
        try {
        } catch (IOException e13) {
            throw new RuntimeException("Unable to create request.", e13);
        }
        return b().getF95898b();
    }

    @Override // pq2.i
    public final a1 e() {
        Call b13;
        synchronized (this) {
            if (this.f101034i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f101034i = true;
            b13 = b();
        }
        if (this.f101031f) {
            b13.cancel();
        }
        return c(b13.e());
    }

    @Override // pq2.i
    public final boolean f() {
        boolean z13 = true;
        if (this.f101031f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f101032g;
                if (call == null || !call.getF95912p()) {
                    z13 = false;
                }
            } finally {
            }
        }
        return z13;
    }

    @Override // pq2.i
    public final void x1(l lVar) {
        Call call;
        Throwable th3;
        Objects.requireNonNull(lVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f101034i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f101034i = true;
                call = this.f101032g;
                th3 = this.f101033h;
                if (call == null && th3 == null) {
                    try {
                        Call a13 = a();
                        this.f101032g = a13;
                        call = a13;
                    } catch (Throwable th4) {
                        th3 = th4;
                        k1.q(th3);
                        this.f101033h = th3;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        if (th3 != null) {
            lVar.e(th3, this);
            return;
        }
        if (this.f101031f) {
            call.cancel();
        }
        call.k1(new c0(this, lVar));
    }

    @Override // pq2.i
    /* renamed from: clone, reason: collision with other method in class */
    public final i mo233clone() {
        return new g0(this.f101026a, this.f101027b, this.f101028c, this.f101029d, this.f101030e);
    }
}
