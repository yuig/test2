package go0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i01.e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 f30Var = (f30) obj;
        s sVar = (s) this.receiver;
        f30 f30Var2 = sVar.N;
        if (f30Var2 != null) {
            e1.a(sVar.f65918w, f30Var2, f30Var, sVar.f65904i, 0, false, null, sVar.f65907l, null, RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP);
        }
        return Unit.f80348a;
    }
}
