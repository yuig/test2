package ni0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90567i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f90568j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(0);
        this.f90567i = i13;
        this.f90568j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f90567i;
        d dVar = this.f90568j;
        switch (i13) {
            case 0:
                if (hf0.b.q() && !((Boolean) dVar.f90580g.getValue()).booleanValue()) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 1:
                lh0.f fVar = dVar.f90576c;
                fVar.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) fVar.f83340a;
                if (!g1Var.o("closeup_redesign_letterboxing_and_visit_cta_android", "enabled", z3Var) && !g1Var.l("closeup_redesign_letterboxing_and_visit_cta_android")) {
                    lh0.f fVar2 = dVar.f90576c;
                    fVar2.getClass();
                    g1 g1Var2 = (g1) fVar2.f83340a;
                    if (!g1Var2.o("closeup_redesign_tablet_android", "enabled", z3Var) && !g1Var2.l("closeup_redesign_tablet_android")) {
                        r2 = false;
                    }
                }
                return Boolean.valueOf(r2);
            case 2:
            default:
                lh0.f fVar3 = dVar.f90576c;
                z3 z3Var2 = z3.ACTIVATE_EXPERIMENT;
                if (!fVar3.a("enabled_attribution_below", z3Var2) && !dVar.f90576c.a("enabled_all_treatments", z3Var2)) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 3:
                lh0.f fVar4 = dVar.f90576c;
                z3 z3Var3 = z3.ACTIVATE_EXPERIMENT;
                if (!fVar4.a("enabled_remove_ratings", z3Var3) && !dVar.f90576c.a("enabled_all_treatments", z3Var3)) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 4:
                lh0.f fVar5 = dVar.f90576c;
                z3 z3Var4 = z3.ACTIVATE_EXPERIMENT;
                return Boolean.valueOf((fVar5.a("enabled_remove_prime", z3Var4) || dVar.f90576c.a("enabled_all_treatments", z3Var4)) ? false : true);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13;
        switch (this.f90567i) {
            case 2:
                lh0.f fVar = this.f90568j.f90576c;
                fVar.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) fVar.f83340a;
                if (!g1Var.o("android_sponsored_label_modules", "enabled", z3Var) && !g1Var.l("android_sponsored_label_modules")) {
                    i13 = pv.c.promoted;
                } else {
                    i13 = pv.c.sponsored;
                }
                break;
        }
        return invoke();
    }
}
