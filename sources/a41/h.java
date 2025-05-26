package a41;

import com.pinterest.api.model.wy0;
import h32.u0;
import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.g1;
import lh0.u2;
import lh0.z3;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f599j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(r rVar, int i13) {
        super(0);
        this.f598i = i13;
        this.f599j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13;
        int i13 = this.f598i;
        r rVar = this.f599j;
        switch (i13) {
            case 10:
                int i14 = r.P1;
                return Boolean.valueOf(rVar.m8());
            case 14:
                int i15 = r.P1;
                if (ve.h.l0(rVar.s8(), rVar.r8(), rVar.getActiveUserManager()) && !rVar.p8().isPublic()) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                int i16 = r.P1;
                if (!rVar.r8()) {
                    return Boolean.FALSE;
                }
                u2 k83 = rVar.k8();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) k83.f83487a;
                boolean z14 = g1Var.o("android_business_profile_header_update", "enabled", z3Var) || g1Var.l("android_business_profile_header_update");
                if (!rVar.s8()) {
                    u2 k84 = rVar.k8();
                    z3 z3Var2 = z3.DO_NOT_ACTIVATE_EXPERIMENT;
                    boolean b13 = k84.b("enabled", z3Var2);
                    boolean b14 = k84.b("enabled_header_update_created_tab_deprecation", z3Var2);
                    if (b13 || b14) {
                        z13 = true;
                        return Boolean.valueOf(!z14 || z13);
                    }
                }
                z13 = false;
                return Boolean.valueOf(!z14 || z13);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0201 A[ADDED_TO_REGION] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a41.h.invoke():java.lang.Object");
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1invoke() {
        wy0 wy0Var;
        int i13 = this.f598i;
        r rVar = this.f599j;
        switch (i13) {
            case 6:
                l0 l0Var = rVar.f668t1;
                if (l0Var != null) {
                    ((d0) l0Var).M3();
                    break;
                }
                break;
            case 7:
                l0 l0Var2 = rVar.f668t1;
                if (l0Var2 != null) {
                    d0 d0Var = (d0) l0Var2;
                    d0Var.getPinalytics().X(u0.BACK_BUTTON);
                    r rVar2 = (r) ((p0) d0Var.getView());
                    rVar2.getClass();
                    if (com.bumptech.glide.d.G(rVar2, "PROFILE_SHOULD_DISMISS_AS_OVERLAY", false)) {
                        rVar2.P7();
                        break;
                    } else {
                        rVar2.D5();
                        break;
                    }
                }
                break;
            case 8:
                l0 l0Var3 = rVar.f668t1;
                if (l0Var3 != null) {
                    ((d0) l0Var3).J3();
                    break;
                }
                break;
            case 9:
                l0 l0Var4 = rVar.f668t1;
                if (l0Var4 != null) {
                    ((d0) l0Var4).L3();
                    break;
                }
                break;
            default:
                l0 l0Var5 = rVar.f668t1;
                if (l0Var5 != null) {
                    d0 d0Var2 = (d0) l0Var5;
                    if (d0Var2.isBound() && (wy0Var = d0Var2.C) != null) {
                        d0Var2.addDisposable(oe.f.f1((ok1.f) d0Var2.f555J.getValue(), wy0Var, null, null, 14));
                        break;
                    }
                }
                break;
        }
    }
}
