package okhttp3.logging;

import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final Logger f96340a;

    /* renamed from: b, reason: collision with root package name */
    public volatile s0 f96341b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Level f96342c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
    public interface Logger {
        public static final Logger Mo;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f96343a = 0;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0})
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void a(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Platform.f96214a.getClass();
                    Platform.j(Platform.f96215b, message, 0, 6);
                }
            }

            static {
                new Companion();
            }

            private Companion() {
            }
        }

        static {
            int i13 = Companion.f96343a;
            Mo = new Companion.DefaultLogger();
        }

        void a(String str);
    }

    public HttpLoggingInterceptor(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f96340a = logger;
        this.f96341b = s0.f80394a;
        this.f96342c = Level.NONE;
    }

    public final void a(Headers headers, int i13) {
        this.f96341b.contains(headers.d(i13));
        String j13 = headers.j(i13);
        this.f96340a.a(headers.d(i13) + ": " + j13);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe A[LOOP:0: B:35:0x00fc->B:36:0x00fe, LOOP_END] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r24) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public HttpLoggingInterceptor() {
        this(Logger.Mo);
    }
}
