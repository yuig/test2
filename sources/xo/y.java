package xo;

import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135571i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f135572j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(i iVar, int i13) {
        super(1);
        this.f135571i = i13;
        this.f135572j = iVar;
    }

    public final void b(v7 board) {
        d0 d0Var;
        int i13 = this.f135571i;
        i iVar = this.f135572j;
        switch (i13) {
            case 0:
                iVar.f135513c.b0();
                d0 d0Var2 = (d0) iVar.f135522l;
                if (d0Var2 != null) {
                    d0Var2.V1();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(board, "board");
                if (Intrinsics.d(board, iVar.f135512b) && (d0Var = (d0) iVar.f135522l) != null) {
                    d0Var.V1();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f135571i) {
            case 0:
                b((v7) obj);
                break;
            default:
                b((v7) obj);
                break;
        }
        return Unit.f80348a;
    }
}
