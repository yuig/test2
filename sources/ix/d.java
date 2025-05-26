package ix;

import ao2.j0;
import ao2.k2;
import ao2.v0;
import com.pinterest.api.model.xs0;
import java.util.concurrent.CancellationException;
import ko2.e;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import pb0.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f73785a;

    /* renamed from: b, reason: collision with root package name */
    public final kx.b f73786b;

    /* renamed from: c, reason: collision with root package name */
    public final jx.a f73787c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f73788d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f73789e;

    /* renamed from: f, reason: collision with root package name */
    public xs0 f73790f;

    /* renamed from: g, reason: collision with root package name */
    public k2 f73791g;

    public d(pb0.a clock, kx.b adsConfigRepository, jx.a adsConfigAnalytics, j0 applicationScope) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(adsConfigRepository, "adsConfigRepository");
        Intrinsics.checkNotNullParameter(adsConfigAnalytics, "adsConfigAnalytics");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        this.f73785a = clock;
        this.f73786b = adsConfigRepository;
        this.f73787c = adsConfigAnalytics;
        this.f73788d = applicationScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ix.a
            if (r0 == 0) goto L13
            r0 = r8
            ix.a r0 = (ix.a) r0
            int r1 = r0.f73776v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73776v = r1
            goto L18
        L13:
            ix.a r0 = new ix.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f73774t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f73776v
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ix.d r1 = r0.f73773s
            ix.d r0 = r0.f73772r
            ue.c.H(r8)
            goto L6f
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            ue.c.H(r8)
            boolean r8 = r7.f73789e
            r2 = 0
            if (r8 != 0) goto L3c
            return r2
        L3c:
            com.pinterest.api.model.xs0 r8 = r7.f73790f
            if (r8 == 0) goto L47
            boolean r4 = r7.c()
            if (r4 != 0) goto L47
            return r8
        L47:
            r7.f73790f = r2
            kx.b r8 = r7.f73786b
            lb0.g r2 = r8.f81051c
            r2.getClass()
            java.lang.String r2 = "THIRD_PARTY_AD_CONFIG"
            lb0.g.a(r2)
            lb0.o r2 = r8.f81053e
            lb0.b r2 = (lb0.b) r2
            java.lang.String r4 = "PREF_THIRD_PARTY_AD_CONFIG_EXPIRY_MS"
            r5 = 0
            r2.m(r4, r5)
            r0.f73772r = r7
            r0.f73773s = r7
            r0.f73776v = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r0 = r7
            r1 = r0
        L6f:
            com.pinterest.api.model.xs0 r8 = (com.pinterest.api.model.xs0) r8
            r1.f73790f = r8
            com.pinterest.api.model.xs0 r8 = r0.f73790f
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ix.d.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ix.b
            if (r0 == 0) goto L13
            r0 = r12
            ix.b r0 = (ix.b) r0
            int r1 = r0.f73781v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73781v = r1
            goto L18
        L13:
            ix.b r0 = new ix.b
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f73779t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f73781v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ix.d r1 = r0.f73778s
            ix.d r0 = r0.f73777r
            ue.c.H(r12)
            goto La8
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            ue.c.H(r12)
            kx.b r12 = r11.f73786b
            lb0.o r2 = r12.f81053e
            lb0.b r2 = (lb0.b) r2
            java.lang.String r4 = "PREF_THIRD_PARTY_AD_CONFIG_LAST_APP_VERSION"
            r5 = 0
            int r2 = r2.f(r4, r5)
            m60.e r4 = r12.f81049a
            m60.d r4 = (m60.d) r4
            r4.b()
            r4 = 13198010(0xc962ba, float:1.8494351E-38)
            r5 = 0
            java.lang.String r7 = "PREF_THIRD_PARTY_AD_CONFIG_EXPIRY_MS"
            r8 = 0
            java.lang.String r9 = "THIRD_PARTY_AD_CONFIG"
            lb0.g r10 = r12.f81051c
            if (r4 == r2) goto L68
            r10.getClass()
            lb0.g.a(r9)
            lb0.o r2 = r12.f81053e
            lb0.b r2 = (lb0.b) r2
            r2.m(r7, r5)
        L66:
            r2 = r8
            goto L79
        L68:
            r10.getClass()     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = lb0.g.g(r9)     // Catch: java.lang.Exception -> L66
            nm.o r4 = r12.f81055g     // Catch: java.lang.Exception -> L66
            java.lang.Class<com.pinterest.api.model.xs0> r10 = com.pinterest.api.model.xs0.class
            java.lang.Object r2 = r4.b(r10, r2)     // Catch: java.lang.Exception -> L66
            com.pinterest.api.model.xs0 r2 = (com.pinterest.api.model.xs0) r2     // Catch: java.lang.Exception -> L66
        L79:
            if (r2 == 0) goto L99
            boolean r4 = r11.c()
            if (r4 != 0) goto L88
            r11.f73790f = r2
            r11.f73789e = r3
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        L88:
            r11.f73790f = r8
            lb0.g r2 = r12.f81051c
            r2.getClass()
            lb0.g.a(r9)
            lb0.o r2 = r12.f81053e
            lb0.b r2 = (lb0.b) r2
            r2.m(r7, r5)
        L99:
            r0.f73777r = r11
            r0.f73778s = r11
            r0.f73781v = r3
            java.lang.Object r12 = r12.a(r0)
            if (r12 != r1) goto La6
            return r1
        La6:
            r0 = r11
            r1 = r0
        La8:
            com.pinterest.api.model.xs0 r12 = (com.pinterest.api.model.xs0) r12
            r1.f73790f = r12
            r0.f73789e = r3
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ix.d.b(bl2.c):java.lang.Object");
    }

    public final boolean c() {
        ((g) this.f73785a).getClass();
        return System.currentTimeMillis() > ((lb0.b) this.f73786b.f81053e).g("PREF_THIRD_PARTY_AD_CONFIG_EXPIRY_MS", 0L);
    }

    public final void d() {
        k2 k2Var = this.f73791g;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        this.f73790f = null;
        kx.b bVar = this.f73786b;
        bVar.f81051c.getClass();
        lb0.g.a("THIRD_PARTY_AD_CONFIG");
        ((lb0.b) bVar.f81053e).m("PREF_THIRD_PARTY_AD_CONFIG_EXPIRY_MS", 0L);
        f fVar = v0.f20219a;
        this.f73791g = j.z(this.f73788d, e.f80326c, null, new c(this, null), 2);
    }
}
