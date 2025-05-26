package kv;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.z0;
import lh0.z3;
import xk2.v;

/* loaded from: classes.dex */
public abstract class b extends jz1.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f80922h = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String experimentName, z0 experimentsActivator, kz1.a powerscoreCalculator) {
        super(experimentName, experimentsActivator, powerscoreCalculator);
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        Intrinsics.checkNotNullParameter(powerscoreCalculator, "powerscoreCalculator");
    }

    public final boolean f() {
        String b13 = b(z3.DO_NOT_ACTIVATE_EXPERIMENT);
        return b13 != null && z.p(b13, "control_range", false);
    }

    public final boolean g() {
        String b13 = b(z3.DO_NOT_ACTIVATE_EXPERIMENT);
        return b13 != null && z.p(b13, "enabled_range", false);
    }

    public final boolean h(z3 activate) {
        boolean z13;
        Intrinsics.checkNotNullParameter(activate, "activate");
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        String b13 = b(z3Var);
        v vVar = this.f77774f;
        if (b13 == null || !z.p(b13, "enabled_block", false)) {
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (Intrinsics.d(b(z3Var), "enabled")) {
                d(activate);
                return false;
            }
            if (Intrinsics.d(b(z3Var), "control") || Intrinsics.d(b(z3Var), "control_powerscore")) {
                d(activate);
            } else {
                double doubleValue = ((Number) vVar.getValue()).doubleValue();
                Boolean bool = null;
                jz1.b c13 = c(null);
                if (c13 != null) {
                    Intrinsics.checkNotNullParameter(c13, "<this>");
                    Intrinsics.checkNotNullParameter(c13, "<this>");
                    Integer num = (Integer) CollectionsKt.U(0, c13.a("range"));
                    if (num != null) {
                        int intValue = num.intValue();
                        Intrinsics.checkNotNullParameter(c13, "<this>");
                        Integer num2 = (Integer) CollectionsKt.U(1, c13.a("range"));
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (doubleValue >= intValue && doubleValue < intValue2) {
                                z13 = true;
                                bool = Boolean.valueOf(z13);
                            }
                        }
                    }
                    z13 = false;
                    bool = Boolean.valueOf(z13);
                }
                if (bool != null && bool.booleanValue()) {
                    if (f()) {
                        d(activate);
                    } else if (g()) {
                        d(activate);
                        return false;
                    }
                }
            }
        } else {
            jz1.b c14 = c(activate);
            if (c14 != null) {
                Intrinsics.checkNotNullParameter(c14, "<this>");
                if (((Integer) CollectionsKt.U(0, c14.a("block"))) != null) {
                    if (((Number) vVar.getValue()).doubleValue() > r10.intValue()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
