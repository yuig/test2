package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CloseGuard {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f96235d = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Method f96236a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f96237b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f96238c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.f96236a = method;
        this.f96237b = method2;
        this.f96238c = method3;
    }
}
