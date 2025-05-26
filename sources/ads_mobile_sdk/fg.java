package ads_mobile_sdk;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fg {

    /* renamed from: a, reason: collision with root package name */
    public final eg0 f5141a;

    /* renamed from: b, reason: collision with root package name */
    public final mo2.a f5142b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5143c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f5144d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f5145e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f5146f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f5147g;

    public fg(eg0 flagDataStore) {
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        this.f5141a = flagDataStore;
        this.f5142b = mo2.d.a();
        this.f5143c = new LinkedHashMap();
        this.f5144d = new AtomicInteger(0);
        this.f5145e = new AtomicInteger(0);
        this.f5146f = new AtomicReference("");
        this.f5147g = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.fg r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.wf
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.wf r0 = (ads_mobile_sdk.wf) r0
            int r1 = r0.f13020e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13020e = r1
            goto L18
        L13:
            ads_mobile_sdk.wf r0 = new ads_mobile_sdk.wf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13018c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13020e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r5 = r0.f13017b
            ads_mobile_sdk.fg r0 = r0.f13016a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f5142b
            r0.f13016a = r5
            r0.f13017b = r6
            r0.f13020e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r5 = r6
        L4a:
            java.util.LinkedHashMap r6 = r0.f5143c     // Catch: java.lang.Throwable -> L56
            mo2.c r5 = (mo2.c) r5
            r5.i(r4)
            java.util.Map r5 = kotlin.collections.z0.n(r6)
            return r5
        L56:
            r6 = move-exception
            mo2.c r5 = (mo2.c) r5
            r5.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fg.a(ads_mobile_sdk.fg, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v8, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.fg r5, java.lang.String r6, java.lang.String r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.dg
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.dg r0 = (ads_mobile_sdk.dg) r0
            int r1 = r0.f4275g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4275g = r1
            goto L18
        L13:
            ads_mobile_sdk.dg r0 = new ads_mobile_sdk.dg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4273e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4275g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            mo2.a r5 = r0.f4272d
            java.lang.String r7 = r0.f4271c
            java.lang.String r6 = r0.f4270b
            ads_mobile_sdk.fg r0 = r0.f4269a
            ue.c.H(r8)
            r8 = r5
            r5 = r0
            goto L52
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            ue.c.H(r8)
            mo2.a r8 = r5.f5142b
            r0.f4269a = r5
            r0.f4270b = r6
            r0.f4271c = r7
            r0.f4272d = r8
            r0.f4275g = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            if (r7 == 0) goto L65
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L5b
            goto L65
        L5b:
            java.util.LinkedHashMap r5 = r5.f5143c     // Catch: java.lang.Throwable -> L63
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L63
            kotlin.Unit r5 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L63
            goto L6a
        L63:
            r5 = move-exception
            goto L72
        L65:
            java.util.LinkedHashMap r5 = r5.f5143c     // Catch: java.lang.Throwable -> L63
            r5.remove(r6)     // Catch: java.lang.Throwable -> L63
        L6a:
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L72:
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fg.a(ads_mobile_sdk.fg, java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }
}
