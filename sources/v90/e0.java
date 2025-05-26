package v90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124882a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Object obj, int i13) {
        super(1, obj, i0.class, "handleSelectMaskViewEvent", "handleSelectMaskViewEvent(Lcom/pinterest/shuffles/cutout/editor/ui/select/SelectMaskUiEvent;)V", 0);
        this.f124882a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, i0.class, "handleRefineMaskViewEvent", "handleRefineMaskViewEvent(Lcom/pinterest/shuffles/cutout/editor/ui/refine/RefineMaskUiEvent;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f124882a) {
            case 0:
                y62.k p03 = (y62.k) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                i0 i0Var = (i0) this.receiver;
                IntRange intRange = i0.f124904q0;
                i0Var.getClass();
                i0Var.b8(new o(p03));
                break;
            default:
                x62.s p04 = (x62.s) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                i0 i0Var2 = (i0) this.receiver;
                IntRange intRange2 = i0.f124904q0;
                i0Var2.getClass();
                i0Var2.b8(new n(p04));
                break;
        }
        return Unit.f80348a;
    }
}
