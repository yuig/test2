package ads_mobile_sdk;

import a.q2;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes2.dex */
public abstract class yp0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f14347a;

    /* renamed from: b, reason: collision with root package name */
    public final q2 f14348b;

    /* renamed from: c, reason: collision with root package name */
    public volatile OkHttpClient f14349c;

    public yp0(jp executor, q2 userAgentProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.f14347a = executor;
        this.f14348b = userAgentProvider;
    }

    public static Object a(yp0 yp0Var, URL url, OkHttpClient okHttpClient, bl2.c cVar, int i13) {
        if ((i13 & 4) != 0) {
            okHttpClient = null;
        }
        yp0Var.getClass();
        Request.Builder builder = new Request.Builder();
        builder.k(url);
        return a(yp0Var, builder.b(), (zn2.b) null, okHttpClient, cVar);
    }

    public abstract long a();

    public static Object a(yp0 yp0Var, Request request, zn2.b bVar, bl2.c cVar, int i13) {
        if ((i13 & 2) != 0) {
            bVar = null;
        }
        yp0Var.getClass();
        return a(yp0Var, request, bVar, (OkHttpClient) null, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.yp0 r8, okhttp3.Request r9, zn2.b r10, okhttp3.OkHttpClient r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yp0.a(ads_mobile_sdk.yp0, okhttp3.Request, zn2.b, okhttp3.OkHttpClient, bl2.c):java.lang.Object");
    }
}
