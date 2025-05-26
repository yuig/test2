package fr1;

import com.pinterest.error.NetworkResponseError;
import cr1.f;
import java.util.ArrayList;
import java.util.HashMap;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import qz.d;
import v.f1;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f62822a;

    /* renamed from: b, reason: collision with root package name */
    public final f f62823b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f62824c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62825d;

    public c(d0 pinalytics, f complianceService) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(complianceService, "complianceService");
        this.f62822a = pinalytics;
        this.f62823b = complianceService;
        this.f62824c = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof fr1.a
            if (r0 == 0) goto L13
            r0 = r7
            fr1.a r0 = (fr1.a) r0
            int r1 = r0.f62818u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62818u = r1
            goto L18
        L13:
            fr1.a r0 = new fr1.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f62816s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f62818u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            fr1.c r0 = r0.f62815r
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L2a
            goto L5d
        L2a:
            r7 = move-exception
            goto L4b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            ue.c.H(r7)
            fr1.b r7 = new fr1.b     // Catch: java.lang.Throwable -> L49
            r7.<init>(r6, r3)     // Catch: java.lang.Throwable -> L49
            r0.f62815r = r6     // Catch: java.lang.Throwable -> L49
            r0.f62818u = r4     // Catch: java.lang.Throwable -> L49
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = bs1.c.w2(r4, r7, r0)     // Catch: java.lang.Throwable -> L49
            if (r7 != r1) goto L5d
            return r1
        L49:
            r7 = move-exception
            r0 = r6
        L4b:
            boolean r1 = r7 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r1 == 0) goto L5a
            nx.d0 r7 = r0.f62822a
            h32.f1 r0 = h32.f1.COMPLIANCE_REQUIREMENTS_TIMEOUT
            r1 = 12
            r2 = 0
            nx.d0.v(r7, r0, r3, r2, r1)
            goto L5d
        L5a:
            r0.c(r7, r3)
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fr1.c.b(bl2.c):java.lang.Object");
    }

    public final void c(Throwable th3, Long l13) {
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        f1 f1Var = networkResponseError != null ? networkResponseError.f45043a : null;
        d M = f1Var != null ? k3.M(f1Var) : null;
        h32.f1 f1Var2 = h32.f1.COMPLIANCE_REQUIREMENTS_FAILURE;
        HashMap hashMap = new HashMap();
        if (l13 != null) {
            hashMap.put("time_in_ms", String.valueOf(l13.longValue()));
        }
        hashMap.put("status_code", String.valueOf(f1Var != null ? f1Var.f123449b : -1));
        hashMap.put("api_error_code", String.valueOf(M != null ? M.f105387g : -1));
        Unit unit = Unit.f80348a;
        this.f62822a.g(f1Var2, null, hashMap, false);
    }

    public final boolean d(t92.c requirement) {
        Intrinsics.checkNotNullParameter(requirement, "requirement");
        if (!this.f62825d) {
            h32.f1 f1Var = h32.f1.COMPLIANCE_FEATURE_CHECK_NOT_LOADED;
            HashMap hashMap = new HashMap();
            hashMap.put("feature_key", requirement.toString());
            Unit unit = Unit.f80348a;
            this.f62822a.g(f1Var, null, hashMap, false);
        }
        return this.f62824c.contains(requirement);
    }
}
