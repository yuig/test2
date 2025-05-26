package pg2;

import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import kh2.a1;
import kotlin.Unit;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xk2.v;

/* loaded from: classes4.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final a f100132a;

    /* renamed from: b, reason: collision with root package name */
    public final xh2.d f100133b;

    /* renamed from: c, reason: collision with root package name */
    public final ki2.e f100134c;

    /* renamed from: d, reason: collision with root package name */
    public final qg2.j f100135d;

    /* renamed from: e, reason: collision with root package name */
    public final v f100136e;

    /* renamed from: f, reason: collision with root package name */
    public qg2.k f100137f;

    public n(a apiClient, xh2.d serializer, ki2.e priorityWorker, qg2.j pendingApiCallsSender, v lazyDeviceId, String appId, k urlBuilder) {
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(priorityWorker, "priorityWorker");
        Intrinsics.checkNotNullParameter(pendingApiCallsSender, "pendingApiCallsSender");
        Intrinsics.checkNotNullParameter(lazyDeviceId, "lazyDeviceId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(urlBuilder, "urlBuilder");
        this.f100132a = apiClient;
        this.f100133b = serializer;
        this.f100134c = priorityWorker;
        this.f100135d = pendingApiCallsSender;
        this.f100136e = xk2.m.b(new jg2.h(urlBuilder, lazyDeviceId, appId, 1));
        this.f100137f = qg2.k.UNKNOWN;
        try {
            c0.d.M2("api-service-init-block");
            l sendMethod = new l(2, this, n.class, "executePost", "executePost(Lio/embrace/android/embracesdk/internal/comms/api/ApiRequest;Lkotlin/jvm/functions/Function1;)Lio/embrace/android/embracesdk/internal/comms/api/ApiResponse;", 0);
            pendingApiCallsSender.getClass();
            Intrinsics.checkNotNullParameter(sendMethod, "sendMethod");
            pendingApiCallsSender.f103877g.set(sendMethod);
            pendingApiCallsSender.f103871a.b(new s81.g(pendingApiCallsSender, 28));
            Unit unit = Unit.f80348a;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [io.embrace.android.embracesdk.internal.comms.api.ApiRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [pg2.i] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final i a(ApiRequest request, Function1 action) {
        InputStream inputStream;
        this.f100132a.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(action, "action");
        q qVar = null;
        try {
            try {
                q F0 = a1.F0(request);
                HttpURLConnection httpURLConnection = F0.f100146a;
                try {
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(60000);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            action.invoke(outputStream);
                            dl2.b.J(outputStream, null);
                        } finally {
                        }
                    }
                    httpURLConnection.connect();
                    i a13 = a.a(F0);
                    xk2.q qVar2 = xk2.s.f135225b;
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    request = a13;
                    if (inputStream2 != null) {
                        inputStream2.close();
                        Unit unit = Unit.f80348a;
                        request = a13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    qVar = F0;
                    try {
                        String localizedMessage = th.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "";
                        }
                        d dVar = new d(new IllegalStateException(localizedMessage, th));
                        xk2.q qVar3 = xk2.s.f135225b;
                        request = dVar;
                        if (qVar != null) {
                            InputStream inputStream3 = qVar.f100146a.getInputStream();
                            request = dVar;
                            if (inputStream3 != null) {
                                inputStream3.close();
                                Unit unit2 = Unit.f80348a;
                                request = dVar;
                            }
                        }
                        return request;
                    } catch (Throwable th4) {
                        try {
                            xk2.q qVar4 = xk2.s.f135225b;
                            if (qVar != null && (inputStream = qVar.f100146a.getInputStream()) != null) {
                                inputStream.close();
                                Unit unit3 = Unit.f80348a;
                            }
                        } catch (Throwable th5) {
                            xk2.q qVar5 = xk2.s.f135225b;
                            ue.c.m(th5);
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            xk2.q qVar6 = xk2.s.f135225b;
            ue.c.m(th7);
        }
        return request;
    }

    public final i b(ApiRequest apiRequest, Function1 function1) {
        String url = apiRequest.f72930h.f72939a;
        Intrinsics.checkNotNullParameter(url, "url");
        URL url2 = new URL(url);
        Intrinsics.checkNotNullParameter(url2, "url");
        s[] values = s.values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (s sVar : values) {
            linkedHashMap.put(sVar.getPath(), sVar);
        }
        String path = url2.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "url.path");
        s sVar2 = (s) linkedHashMap.get(StringsKt.c0(path, "/"));
        if (sVar2 == null) {
            sVar2 = s.UNKNOWN;
        }
        if (!this.f100137f.isReachable() || t.a(sVar2).f100151b) {
            this.f100135d.b(apiRequest, function1, false);
            return e.f100124a;
        }
        i response = a(apiRequest, function1);
        if (response.a()) {
            this.f100135d.b(apiRequest, function1, false);
            qg2.j jVar = this.f100135d;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(response, "response");
            if (response instanceof d) {
                jVar.c(120L);
            } else if (response instanceof h) {
                h hVar = (h) response;
                u a14 = t.a(hVar.f100129a);
                synchronized (a14) {
                    a14.f100151b = true;
                    a14.f100150a.incrementAndGet();
                }
                a14.a(jVar.f103871a, hVar.f100130b, new qa2.v(jVar, 2));
            }
        }
        return response;
    }

    @Override // bg2.b
    public final void d(qg2.k status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f100137f = status;
    }
}
