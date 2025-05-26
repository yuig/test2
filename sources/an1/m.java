package an1;

import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.b0;
import u50.i0;

/* loaded from: classes5.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15751i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f15752j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltRadioGroup f15753k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(GestaltRadioGroup gestaltRadioGroup, i0 i0Var) {
        super(1);
        this.f15751i = 2;
        this.f15753k = gestaltRadioGroup;
        this.f15752j = i0Var;
    }

    public final rn1.a b(rn1.a state) {
        int i13 = this.f15751i;
        i0 i0Var = this.f15752j;
        GestaltRadioGroup gestaltRadioGroup = this.f15753k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullExpressionValue(gestaltRadioGroup.getContext(), "getContext(...)");
                return rn1.a.y(state, this.f15752j, vn1.c.ERROR, null, null, null, 0, d7.b.Z(!bs1.c.e1(i0Var, r2)), null, null, new rm1.d(new rm1.e(rm1.n.WORKFLOW_STATUS_PROBLEM, gestaltRadioGroup.f49498w ? rm1.h.XS : rm1.h.SM), rm1.c.ERROR, null, 0, null, 28), false, 0, null, null, null, new b0(eo1.c.space_100), null, false, null, null, 2063804);
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullExpressionValue(gestaltRadioGroup.getContext(), "getContext(...)");
                return rn1.a.y(state, i0Var, null, null, null, null, 0, d7.b.Z(!bs1.c.e1(i0Var, r2)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                vn1.g gVar = gestaltRadioGroup.f49496u ? vn1.g.UI_100 : vn1.g.BODY_100;
                vn1.c cVar = gestaltRadioGroup.f49497v ? vn1.c.SUBTLE : vn1.c.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(gestaltRadioGroup.getContext(), "getContext(...)");
                return rn1.a.y(state, this.f15752j, cVar, null, null, gVar, 0, d7.b.Z(!bs1.c.e1(i0Var, r2)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097068);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f15751i) {
        }
        return b((rn1.a) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(i0 i0Var, GestaltRadioGroup gestaltRadioGroup, int i13) {
        super(1);
        this.f15751i = i13;
        this.f15752j = i0Var;
        this.f15753k = gestaltRadioGroup;
    }
}
