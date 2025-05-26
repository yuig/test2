package kt0;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f80806i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var) {
        super(2);
        this.f80806i = e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v7 board = (v7) obj;
        wy0 user = (wy0) obj2;
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(user, "user");
        return new lr.f(user, board, this.f80806i.f80814h);
    }
}
