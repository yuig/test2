package qc2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.IntRange;
import m60.f0;
import tb0.p;
import vb0.j;

/* loaded from: classes2.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f103529j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f103530k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f103531l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f103532m = new e(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103533i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f103533i = i13;
    }

    public final c b(Number number) {
        f0 f0Var = j.f125466a;
        switch (this.f103533i) {
            case 0:
                Intrinsics.checkNotNullParameter(number, "$this$null");
                int intValue = number.intValue();
                c cVar = c.Below50;
                IntRange range = cVar.getRange();
                int i13 = range.f80453a;
                if (intValue <= range.f80454b && i13 <= intValue) {
                    return cVar;
                }
                c cVar2 = c.Between50And80;
                IntRange range2 = cVar2.getRange();
                int i14 = range2.f80453a;
                if (intValue <= range2.f80454b && i14 <= intValue) {
                    return cVar2;
                }
                c cVar3 = c.Between80And100;
                IntRange range3 = cVar3.getRange();
                int i15 = range3.f80453a;
                if (intValue <= range3.f80454b && i15 <= intValue) {
                    return cVar3;
                }
                c cVar4 = c.FullyVisible;
                IntRange range4 = cVar4.getRange();
                int i16 = range4.f80453a;
                if (intValue <= range4.f80454b && i16 <= intValue) {
                    return cVar4;
                }
                f0Var.F("Percent must be between 0 and 100: " + number, p.VIDEO_PLAYER, new Object[0]);
                return c.InvalidVisibility;
            case 1:
                Intrinsics.checkNotNullParameter(number, "$this$null");
                int intValue2 = number.intValue();
                c cVar5 = c.NotVisible;
                IntRange range5 = cVar5.getRange();
                int i17 = range5.f80453a;
                if (intValue2 <= range5.f80454b && i17 <= intValue2) {
                    return cVar5;
                }
                c cVar6 = c.Below25;
                IntRange range6 = cVar6.getRange();
                int i18 = range6.f80453a;
                if (intValue2 <= range6.f80454b && i18 <= intValue2) {
                    return cVar6;
                }
                c cVar7 = c.Between25And50;
                IntRange range7 = cVar7.getRange();
                int i19 = range7.f80453a;
                if (intValue2 <= range7.f80454b && i19 <= intValue2) {
                    return cVar7;
                }
                c cVar8 = c.Between50And80;
                IntRange range8 = cVar8.getRange();
                int i23 = range8.f80453a;
                if (intValue2 <= range8.f80454b && i23 <= intValue2) {
                    return cVar8;
                }
                c cVar9 = c.Between80And100;
                IntRange range9 = cVar9.getRange();
                int i24 = range9.f80453a;
                if (intValue2 <= range9.f80454b && i24 <= intValue2) {
                    return cVar9;
                }
                c cVar10 = c.FullyVisible;
                IntRange range10 = cVar10.getRange();
                int i25 = range10.f80453a;
                if (intValue2 <= range10.f80454b && i25 <= intValue2) {
                    return cVar10;
                }
                f0Var.F("Percent must be between 0 and 100: " + number, p.VIDEO_PLAYER, new Object[0]);
                return c.InvalidVisibility;
            case 2:
                Intrinsics.checkNotNullParameter(number, "$this$null");
                int intValue3 = number.intValue();
                c cVar11 = c.Below80;
                IntRange range11 = cVar11.getRange();
                int i26 = range11.f80453a;
                if (intValue3 <= range11.f80454b && i26 <= intValue3) {
                    return cVar11;
                }
                c cVar12 = c.Between80And100;
                IntRange range12 = cVar12.getRange();
                int i27 = range12.f80453a;
                if (intValue3 <= range12.f80454b && i27 <= intValue3) {
                    return cVar12;
                }
                c cVar13 = c.FullyVisible;
                IntRange range13 = cVar13.getRange();
                int i28 = range13.f80453a;
                if (intValue3 <= range13.f80454b && i28 <= intValue3) {
                    return cVar13;
                }
                f0Var.F("Percent must be between 0 and 100: " + number, p.VIDEO_PLAYER, new Object[0]);
                return c.InvalidVisibility;
            default:
                Intrinsics.checkNotNullParameter(number, "$this$null");
                return c.NotVisible;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f103533i) {
        }
        return b((Number) obj);
    }
}
