package oa2;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93921i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f93922j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(1);
        this.f93921i = i13;
        this.f93922j = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f93921i;
        o oVar = this.f93922j;
        switch (i13) {
            case 0:
                String userId = (String) obj;
                Intrinsics.checkNotNullParameter(userId, "userId");
                if ((!z.j(userId)) && !oVar.f93934l) {
                    oVar.f93932j.invoke(null);
                    oVar.f93940r.d(userId, r41.b.LegoUserRep);
                }
                break;
            default:
                wy0 wy0Var = (wy0) obj;
                wy0 wy0Var2 = oVar.f93942t;
                if (wy0Var2 != null) {
                    wy0Var = wy0Var2.G4(wy0Var);
                }
                Intrinsics.f(wy0Var);
                oVar.t3(wy0Var);
                break;
        }
        return Unit.f80348a;
    }
}
