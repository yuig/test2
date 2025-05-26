package a41;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.p implements Function1 {
    public p(Object obj) {
        super(1, obj, r.class, "onFollowClicked", "onFollowClicked(Lcom/pinterest/api/model/User;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 p03 = (wy0) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        l0 l0Var = ((r) this.receiver).f668t1;
        if (l0Var != null) {
            ((d0) l0Var).G3(p03);
        }
        return Unit.f80348a;
    }
}
