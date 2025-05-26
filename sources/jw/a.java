package jw;

import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.i;
import lh0.z3;
import yn2.c0;

/* loaded from: classes.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77645i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f77646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f77645i = i13;
        this.f77646j = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f77645i;
        b bVar = this.f77646j;
        switch (i13) {
            case 0:
                i iVar = bVar.f77648a;
                iVar.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) iVar.f83385a;
                return Double.valueOf((g1Var.o("android_pwt_powerscore", "enabled", z3Var) || g1Var.l("android_pwt_powerscore")) ? bVar.f77651d.a() : bVar.f77650c.a());
            default:
                z3 shouldActivate = z3.ACTIVATE_EXPERIMENT;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(shouldActivate, "shouldActivate");
                try {
                    String g13 = ((g1) bVar.f77649b).g("android_ad_gma_ps", shouldActivate);
                    if (g13 == null || !z.p(g13, "enabled", false)) {
                        g13 = null;
                    }
                    if (g13 != null) {
                        return new c(z0.o(c0.p(Regex.c(b.f77647g, g13), new wt.c(bVar, 16))));
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
