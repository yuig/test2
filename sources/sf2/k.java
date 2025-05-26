package sf2;

import kh2.j2;
import kh2.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f112848c = {k0.f80436a.g(new d0(k.class, "userService", "getUserService()Lio/embrace/android/embracesdk/internal/capture/user/UserService;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final p f112849a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f112850b;

    public k(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f112849a = sdkCallChecker;
        this.f112850b = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 22));
    }

    public final mg2.b a() {
        return (mg2.b) this.f112850b.a(this, f112848c[0]);
    }
}
