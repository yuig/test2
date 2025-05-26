package ads_mobile_sdk;

import a.o3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import r4.i;

/* loaded from: classes2.dex */
public final class xp0 {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f13752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13753b;

    public xp0(long j13, String str, ExecutorService executorService) {
        this.f13753b = str;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Dispatcher dispatcher = new Dispatcher(executorService);
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        builder.f95674a = dispatcher;
        builder.b(j13, TimeUnit.MILLISECONDS);
        this.f13752a = new OkHttpClient(builder);
    }

    public final /* synthetic */ Object a(Request request, i iVar) {
        this.f13752a.newCall(request).k1(new vp0(iVar));
        return "";
    }

    public final com.google.common.util.concurrent.c0 a(Request request) {
        Request.Builder b13 = request.b();
        b13.a("User-Agent", this.f13753b);
        return com.bumptech.glide.d.L(new o3(2, this, b13.b()));
    }
}
