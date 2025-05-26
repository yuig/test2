package sf2;

import java.util.concurrent.atomic.AtomicBoolean;
import kh2.j2;
import kh2.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f112839e;

    /* renamed from: a, reason: collision with root package name */
    public final p f112840a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f112841b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f112842c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f112843d;

    static {
        d0 d0Var = new d0(i.class, "sessionIdTracker", "getSessionIdTracker()Lio/embrace/android/embracesdk/internal/session/id/SessionIdTracker;", 0);
        l0 l0Var = k0.f80436a;
        f112839e = new u[]{l0Var.g(d0Var), a.c.l(i.class, "preferencesService", "getPreferencesService()Lio/embrace/android/embracesdk/internal/prefs/PreferencesService;", 0, l0Var), a.c.l(i.class, "crashVerifier", "getCrashVerifier()Lio/embrace/android/embracesdk/internal/crash/LastRunCrashVerifier;", 0, l0Var)};
    }

    public i(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f112840a = sdkCallChecker;
        this.f112841b = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 19));
        this.f112842c = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 18));
        this.f112843d = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 17));
    }

    public final boolean a() {
        return ((AtomicBoolean) this.f112840a.f80996c).get();
    }
}
