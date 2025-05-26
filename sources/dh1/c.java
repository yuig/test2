package dh1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zv0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54996i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f54997j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f54996i = i13;
        this.f54997j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 G;
        int i13 = this.f54996i;
        e eVar = this.f54997j;
        switch (i13) {
            case 0:
                wy0 wy0Var = (wy0) obj;
                ch1.b bVar = (ch1.b) eVar.getView();
                Intrinsics.f(wy0Var);
                bVar.S5(wy0Var);
                break;
            default:
                ol1.a aVar = (ol1.a) obj;
                zv0 zv0Var = eVar.f55005e;
                if ((zv0Var != null ? zv0Var.G() : null) != null) {
                    zv0 zv0Var2 = eVar.f55005e;
                    if (Intrinsics.d((zv0Var2 == null || (G = zv0Var2.G()) == null) ? null : G.getId(), aVar != null ? aVar.f96440a : null)) {
                        eVar.f55006f = aVar;
                        ((ch1.b) eVar.getView()).getClass();
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
