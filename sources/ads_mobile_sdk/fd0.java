package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kh2.c3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class fd0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5105a;

    /* renamed from: b, reason: collision with root package name */
    public final a.j3 f5106b;

    /* renamed from: c, reason: collision with root package name */
    public final sb2 f5107c;

    /* renamed from: d, reason: collision with root package name */
    public final oh0 f5108d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.k f5109e;

    /* renamed from: f, reason: collision with root package name */
    public final mo2.a f5110f;

    /* renamed from: g, reason: collision with root package name */
    public String f5111g;

    public fd0(Context applicationContext, a.j3 traceLogger, sb2 rootTraceCreator, oh0 flags) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f5105a = applicationContext;
        this.f5106b = traceLogger;
        this.f5107c = rootTraceCreator;
        this.f5108d = flags;
        this.f5109e = xk2.m.b(new dd0(this));
        this.f5110f = mo2.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x004a, B:17:0x004f, B:19:0x0057, B:20:0x005f), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v4, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.fd0 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ed0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ed0 r0 = (ads_mobile_sdk.ed0) r0
            int r1 = r0.f4816e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4816e = r1
            goto L18
        L13:
            ads_mobile_sdk.ed0 r0 = new ads_mobile_sdk.ed0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4814c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4816e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo2.a r5 = r0.f4813b
            ads_mobile_sdk.fd0 r0 = r0.f4812a
            ue.c.H(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r6)
            mo2.a r6 = r5.f5110f
            r0.f4812a = r5
            r0.f4813b = r6
            r0.f4816e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r0 = r5.f5111g     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L4f
            goto L61
        L4f:
            java.lang.String r0 = "getGmpAppId"
            java.lang.Object r0 = r5.a(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5c
            goto L5f
        L5c:
            r5 = move-exception
            goto L67
        L5e:
            r0 = r4
        L5f:
            r5.f5111g = r0     // Catch: java.lang.Throwable -> L5c
        L61:
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            return r0
        L67:
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fd0.a(ads_mobile_sdk.fd0, bl2.c):java.lang.Object");
    }

    public final Object a(String str) {
        try {
            if (this.f5109e.getValue() != null) {
                return Class.forName(this.f5108d.F()).getMethod(str, new Class[0]).invoke(this.f5109e.getValue(), new Object[0]);
            }
            return null;
        } catch (Exception e13) {
            ft2.a("Exception while calling Firebase Analytics SDK method", e13);
            ((ks2) this.f5106b).a(a.a.j("FirebaseAnalyticsAdapter.invokeMethod ", str), e13);
            return null;
        }
    }

    public static Unit a(fd0 fd0Var, cd0 cd0Var, Bundle bundle, String str) {
        sb2 sb2Var = fd0Var.f5107c;
        il0 il0Var = il0.CUI_NAME_LOG_EVENT_TO_FIREBASE_ANALYTICS;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        ss2 d2 = c3.d();
        if (qs2.c() == null) {
            p12 a13 = sb2.a(sb2Var, il0Var, q0Var, d2);
            try {
                try {
                    if (fd0Var.f5109e.getValue() != null) {
                        Method method = Class.forName(fd0Var.f5108d.F()).getMethod("logEvent", String.class, String.class, Bundle.class);
                        Bundle bundle2 = bundle.getBundle(cd0Var.a());
                        if (bundle2 != null) {
                            bundle2.putLong("_aeid", Long.parseLong(str));
                        }
                        String str2 = cd0Var.f3869a;
                        cd0 cd0Var2 = cd0.f3865b;
                        if (Intrinsics.d(str2, "_ac") && bundle2 != null) {
                            bundle2.putInt("_r", 1);
                        }
                        method.invoke(fd0Var.f5109e.getValue(), "am", cd0Var.a(), bundle2);
                    }
                } catch (Exception e13) {
                    ft2.a("Exception while calling Firebase Analytics SDK logEvent method", e13);
                    ((ks2) fd0Var.f5106b).a("FirebaseAnalyticsAdapter.invokeMethod logEvent for " + cd0Var, e13);
                }
                Object obj = Unit.f80348a;
                if (obj instanceof jk0) {
                    ft2.a((jk0) obj);
                }
                dl2.b.J(a13, null);
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (!(th3 instanceof a.jf)) {
                        a13.a(th3);
                        if (!(th3 instanceof TimeoutCancellationException)) {
                            if (!(th3 instanceof CancellationException)) {
                                if (th3 instanceof uk0) {
                                    throw th3;
                                }
                                throw new dk0(th3);
                            }
                            throw new yj0(th3);
                        }
                        throw new xl0(th3);
                    }
                    throw th3;
                } finally {
                }
            }
        } else {
            cs2 a14 = qs2.a(il0Var, q0Var, true);
            try {
                try {
                    if (fd0Var.f5109e.getValue() != null) {
                        Method method2 = Class.forName(fd0Var.f5108d.F()).getMethod("logEvent", String.class, String.class, Bundle.class);
                        Bundle bundle3 = bundle.getBundle(cd0Var.a());
                        if (bundle3 != null) {
                            bundle3.putLong("_aeid", Long.parseLong(str));
                        }
                        String str3 = cd0Var.f3869a;
                        cd0 cd0Var3 = cd0.f3865b;
                        if (Intrinsics.d(str3, "_ac") && bundle3 != null) {
                            bundle3.putInt("_r", 1);
                        }
                        method2.invoke(fd0Var.f5109e.getValue(), "am", cd0Var.a(), bundle3);
                    }
                } catch (Exception e14) {
                    ft2.a("Exception while calling Firebase Analytics SDK logEvent method", e14);
                    ((ks2) fd0Var.f5106b).a("FirebaseAnalyticsAdapter.invokeMethod logEvent for " + cd0Var, e14);
                }
                Object obj2 = Unit.f80348a;
                if (obj2 instanceof jk0) {
                    ft2.a((jk0) obj2);
                }
                dl2.b.J(a14, null);
            } catch (Throwable th4) {
                try {
                    a14.b(th4);
                    if (!(th4 instanceof a.jf)) {
                        a14.a(th4);
                        if (!(th4 instanceof TimeoutCancellationException)) {
                            if (!(th4 instanceof CancellationException)) {
                                if (th4 instanceof uk0) {
                                    throw th4;
                                }
                                throw new dk0(th4);
                            }
                            throw new yj0(th4);
                        }
                        throw new xl0(th4);
                    }
                    throw th4;
                } finally {
                }
            }
        }
        return Unit.f80348a;
    }
}
