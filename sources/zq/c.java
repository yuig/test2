package zq;

import com.pinterest.api.model.wy0;
import dl1.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142634i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f142635j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(1);
        this.f142634i = i13;
        this.f142635j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142634i;
        f fVar = this.f142635j;
        switch (i13) {
            case 0:
                v0 updatedModel = (v0) obj;
                Intrinsics.checkNotNullParameter(updatedModel, "updatedModel");
                return Boolean.valueOf(Intrinsics.d(((wy0) updatedModel.f55290b).getId(), fVar.f142639a));
            default:
                v0 v0Var = (v0) obj;
                wy0 wy0Var = (wy0) v0Var.f55289a;
                wy0 wy0Var2 = (wy0) v0Var.f55290b;
                if (wy0Var2.n3() != null) {
                    if (!Intrinsics.d(wy0Var != null ? wy0Var.n3() : null, wy0Var2.n3())) {
                        fVar.p3(wy0Var2.n3());
                    }
                }
                return Unit.f80348a;
        }
    }
}
