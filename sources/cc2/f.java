package cc2;

import kotlin.ranges.IntRange;
import m60.f0;

/* loaded from: classes2.dex */
public final class f {
    public static g a(double d2) {
        int i13 = (int) d2;
        g gVar = g.Q0;
        IntRange range = gVar.getRange();
        int i14 = range.f80453a;
        if (i13 <= range.f80454b && i14 <= i13) {
            return gVar;
        }
        g gVar2 = g.Q1;
        IntRange range2 = gVar2.getRange();
        int i15 = range2.f80453a;
        if (i13 <= range2.f80454b && i15 <= i13) {
            return gVar2;
        }
        g gVar3 = g.Q2;
        IntRange range3 = gVar3.getRange();
        int i16 = range3.f80453a;
        if (i13 <= range3.f80454b && i16 <= i13) {
            return gVar3;
        }
        g gVar4 = g.Q3;
        IntRange range4 = gVar4.getRange();
        int i17 = range4.f80453a;
        if (i13 <= range4.f80454b && i17 <= i13) {
            return gVar4;
        }
        g gVar5 = g.Q3_P95;
        IntRange range5 = gVar5.getRange();
        int i18 = range5.f80453a;
        if (i13 <= range5.f80454b && i18 <= i13) {
            return gVar5;
        }
        g gVar6 = g.Q3_P97;
        IntRange range6 = gVar6.getRange();
        int i19 = range6.f80453a;
        if (i13 <= range6.f80454b && i19 <= i13) {
            return gVar6;
        }
        g gVar7 = g.Q4;
        IntRange range7 = gVar7.getRange();
        int i23 = range7.f80453a;
        if (i13 <= range7.f80454b && i23 <= i13) {
            return gVar7;
        }
        f0 f0Var = vb0.j.f125466a;
        if (i13 < 0 || i13 >= 101) {
            f0Var.F("Percent watched must be between 0 and 100: " + d2, tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
        } else {
            f0Var.F("Check that you included all enum cases in the when statement.", tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
        }
        return g.INVALID_QUARTILE;
    }
}
