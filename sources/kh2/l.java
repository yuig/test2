package kh2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final l f79584i = new l(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            c0.d.M2("okhttp-client-init");
            OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
            newBuilder.d(kotlin.collections.f0.j(Protocol.HTTP_2, Protocol.HTTP_1_1));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            newBuilder.c(10L, timeUnit);
            newBuilder.e(60L, timeUnit);
            return new OkHttpClient(newBuilder);
        } finally {
        }
    }
}
