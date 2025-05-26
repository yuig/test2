package lb2;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l f82780i = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 wy0Var = (wy0) obj;
        c60.a aVar = c60.d.f26516d;
        if (aVar != null) {
            a60.a aVar2 = a60.a.f905a;
            String uid = wy0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            aVar2.e(aVar, uid, dl2.b.S2(wy0Var));
        }
        return Unit.f80348a;
    }
}
