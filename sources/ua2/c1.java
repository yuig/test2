package ua2;

import a.cb;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.r2;
import lh0.z3;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f121452a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f121453b;

    /* renamed from: c, reason: collision with root package name */
    public final f30 f121454c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121455d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f121456e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f121457f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f121458g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f121459h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f121460i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f121461j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f121462k;

    /* renamed from: l, reason: collision with root package name */
    public final es.a f121463l;

    /* renamed from: m, reason: collision with root package name */
    public final es.h f121464m;

    /* renamed from: n, reason: collision with root package name */
    public final qa2.a f121465n;

    /* renamed from: o, reason: collision with root package name */
    public final String f121466o;

    /* renamed from: p, reason: collision with root package name */
    public final String f121467p;

    /* renamed from: q, reason: collision with root package name */
    public final wy0 f121468q;

    /* renamed from: r, reason: collision with root package name */
    public final wy0 f121469r;

    /* renamed from: s, reason: collision with root package name */
    public final String f121470s;

    /* renamed from: t, reason: collision with root package name */
    public final String f121471t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f121472u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f121473v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f121474w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f121475x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f121476y;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0130, code lost:
    
        if (r15 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0133, code lost:
    
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0141, code lost:
    
        r16.f121471t = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013f, code lost:
    
        if (r15 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c1(qa2.a r17, lh0.r2 r18, boolean r19, boolean r20, com.pinterest.api.model.f30 r21, boolean r22, boolean r23, yk1.a r24, boolean r25, java.lang.Integer r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, es.a r35, es.h r36) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua2.c1.<init>(qa2.a, lh0.r2, boolean, boolean, com.pinterest.api.model.f30, boolean, boolean, yk1.a, boolean, java.lang.Integer, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, es.a, es.h):void");
    }

    public final int a() {
        Integer num = this.f121457f;
        if (num != null) {
            return num.intValue();
        }
        if (!this.f121473v) {
            if (this.f121472u) {
                return 3;
            }
            Boolean M4 = this.f121454c.M4();
            Intrinsics.checkNotNullExpressionValue(M4, "getIsEligibleForPdp(...)");
            if (M4.booleanValue()) {
                return 1;
            }
        }
        return 2;
    }

    public final boolean b() {
        r2 experiments = this.f121452a;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        wy0 wy0Var = this.f121468q;
        if (wy0Var == null) {
            return false;
        }
        z3 z3Var = a4.f83297a;
        boolean R = experiments.R("enabled_show_trusted_and_verified_with_checkmark", z3Var);
        boolean R2 = experiments.R("enabled_show_verified_with_checkmark", z3Var);
        boolean y13 = cb.y(wy0Var, "getIsVerifiedMerchant(...)");
        if (!dl2.b.V1(wy0Var) || y13) {
            return false;
        }
        return R2 || R;
    }

    public final boolean c() {
        return (!this.f121472u || this.f121462k) && d() && (kotlin.text.z.j(this.f121467p) ^ true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r6 = this;
            boolean r0 = r6.f121472u
            java.lang.String r1 = r6.f121466o
            if (r0 == 0) goto Ld
            boolean r0 = kotlin.text.z.j(r1)
        La:
            r0 = r0 ^ 1
            goto L4c
        Ld:
            boolean r0 = r6.f121455d
            r2 = 0
            if (r0 == 0) goto L14
        L12:
            r0 = r2
            goto L4c
        L14:
            com.pinterest.api.model.f30 r0 = r6.f121454c
            boolean r0 = com.pinterest.api.model.b40.r0(r0)
            if (r0 != 0) goto L47
            boolean r0 = r6.f121456e
            if (r0 != 0) goto L47
            boolean r0 = r6.f121475x
            if (r0 == 0) goto L25
            goto L47
        L25:
            boolean r0 = r6.e()
            if (r0 == 0) goto L3d
            lh0.r2 r0 = r6.f121452a
            boolean r3 = r0.W()
            java.lang.String r4 = "enabled_pwt"
            lh0.z3 r5 = lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT
            boolean r0 = r0.R(r4, r5)
            if (r3 == 0) goto L12
            if (r0 != 0) goto L12
        L3d:
            boolean r0 = r6.f121460i
            if (r0 == 0) goto L42
            goto L12
        L42:
            boolean r0 = kotlin.text.z.j(r1)
            goto La
        L47:
            boolean r0 = kotlin.text.z.j(r1)
            goto La
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua2.c1.d():boolean");
    }

    public final boolean e() {
        r2 r2Var = this.f121452a;
        boolean c13 = me.o.c(r2Var.W(), r2Var.R("enabled_pwt", z3.DO_NOT_ACTIVATE_EXPERIMENT));
        f30 f30Var = this.f121454c;
        return c13 ? me.o.g(r2Var, f30Var) : this.f121472u || (!this.f121455d && ((this.f121453b && this.f121468q != null && ((kotlin.text.z.j(this.f121470s) ^ true) || (kotlin.text.z.j(this.f121471t) ^ true))) || b40.b1(f30Var) || b40.s0(f30Var)));
    }

    public final String f(boolean z13) {
        String z63;
        if (this.f121458g && !z13) {
            return g();
        }
        es.v vVar = (es.v) this.f121464m;
        lh0.d dVar = vVar.f60008a;
        dVar.getClass();
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) dVar.f83323a;
        boolean z14 = g1Var.o("ads_amazon_native_video_new_chin", "enabled", z3Var) || g1Var.l("ads_amazon_native_video_new_chin");
        es.s sVar = new es.s(dVar);
        f30 f30Var = this.f121454c;
        if (!vVar.C(f30Var, z14, sVar)) {
            String r43 = f30Var.r4();
            if (r43 != null && r43.length() != 0) {
                String r44 = f30Var.r4();
                if (r44 != null) {
                    return r44;
                }
            } else if (b40.l0(f30Var)) {
                String S = b40.S(f30Var);
                if (S != null) {
                    return S;
                }
            } else {
                String z64 = f30Var.z6();
                if (z64 != null && z64.length() != 0 && (z63 = f30Var.z6()) != null) {
                    return z63;
                }
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g() {
        /*
            r4 = this;
            com.pinterest.api.model.f30 r0 = r4.f121454c
            com.pinterest.api.model.se0 r1 = r0.g6()
            r2 = 0
            if (r1 == 0) goto L2c
            java.util.List r1 = r1.y()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            com.pinterest.api.model.we0 r1 = (com.pinterest.api.model.we0) r1
            if (r1 == 0) goto L2c
            com.pinterest.api.model.cb r1 = r1.o()
            if (r1 == 0) goto L2c
            java.lang.String r1 = r1.g()
            if (r1 == 0) goto L2c
            boolean r3 = kotlin.text.z.j(r1)
            r3 = r3 ^ 1
            if (r3 == 0) goto L2c
            r2 = r1
        L2c:
            java.lang.String r0 = bs1.c.P0(r0)
            boolean r1 = r4.f121459h
            java.lang.String r3 = ""
            if (r1 == 0) goto L3c
            if (r0 != 0) goto L41
            if (r2 != 0) goto L42
        L3a:
            r2 = r3
            goto L42
        L3c:
            if (r2 != 0) goto L42
            if (r0 != 0) goto L41
            goto L3a
        L41:
            r2 = r0
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ua2.c1.g():java.lang.String");
    }
}
