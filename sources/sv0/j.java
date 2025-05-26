package sv0;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import okhttp3.OkHttpClient;
import so.oa;

/* loaded from: classes5.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final j f115346i = new j(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = kb0.a.f79058b;
        OkHttpClient.Builder newBuilder = ((OkHttpClient) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113974w0.get()).newBuilder();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        newBuilder.c(5L, timeUnit);
        newBuilder.e(30L, timeUnit);
        newBuilder.f(30L, timeUnit);
        return new OkHttpClient(newBuilder);
    }
}
