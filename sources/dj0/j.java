package dj0;

import com.pinterest.api.model.v7;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.j0;

/* loaded from: classes5.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55143i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v7 f55144j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f55145k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(v7 v7Var, k kVar, int i13) {
        super(0);
        this.f55143i = i13;
        this.f55144j = v7Var;
        this.f55145k = kVar;
    }

    public final j0 b() {
        int i13 = this.f55143i;
        k kVar = this.f55145k;
        v7 v7Var = this.f55144j;
        switch (i13) {
            case 0:
                int i14 = d70.f.plural_pins_string;
                Integer l13 = v7Var.l1();
                Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
                int intValue = l13.intValue();
                qb0.f fVar = kVar.f55147b;
                Integer l14 = v7Var.l1();
                Intrinsics.checkNotNullExpressionValue(l14, "getPinCount(...)");
                int intValue2 = l14.intValue();
                ((qb0.a) fVar).getClass();
                return new j0(i14, intValue, e0.b(qb0.j.b(intValue2)));
            default:
                int i15 = d70.f.plural_sections_string;
                Integer q13 = v7Var.q1();
                Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                int intValue3 = q13.intValue();
                qb0.f fVar2 = kVar.f55147b;
                Integer q14 = v7Var.q1();
                Intrinsics.checkNotNullExpressionValue(q14, "getSectionCount(...)");
                int intValue4 = q14.intValue();
                ((qb0.a) fVar2).getClass();
                return new j0(i15, intValue3, e0.b(qb0.j.b(intValue4)));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f55143i) {
        }
        return b();
    }
}
