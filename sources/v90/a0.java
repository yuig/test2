package v90;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f124865j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(i0 i0Var, int i13) {
        super(1);
        this.f124864i = i13;
        this.f124865j = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0 i0Var = this.f124865j;
        int i13 = this.f124864i;
        switch (i13) {
            case 0:
                MaskModel maskModel = (MaskModel) obj;
                switch (i13) {
                    case 0:
                        p pVar = new p(maskModel);
                        IntRange intRange = i0.f124904q0;
                        i0Var.b8(pVar);
                        break;
                    default:
                        x xVar = new x(maskModel);
                        IntRange intRange2 = i0.f124904q0;
                        i0Var.b8(xVar);
                        break;
                }
                break;
            default:
                MaskModel maskModel2 = (MaskModel) obj;
                switch (i13) {
                    case 0:
                        p pVar2 = new p(maskModel2);
                        IntRange intRange3 = i0.f124904q0;
                        i0Var.b8(pVar2);
                        break;
                    default:
                        x xVar2 = new x(maskModel2);
                        IntRange intRange4 = i0.f124904q0;
                        i0Var.b8(xVar2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
