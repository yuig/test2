package xo;

import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135494i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f135495j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, int i13) {
        super(1);
        this.f135494i = i13;
        this.f135495j = iVar;
    }

    public final void b(v7 board) {
        q qVar;
        int i13 = this.f135494i;
        i iVar = this.f135495j;
        switch (i13) {
            case 0:
                iVar.f135513c.b0();
                q qVar2 = (q) iVar.f135522l;
                if (qVar2 != null) {
                    qVar2.V1();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(board, "board");
                if (Intrinsics.d(board, iVar.f135512b) && (qVar = (q) iVar.f135522l) != null) {
                    qVar.V1();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f135494i) {
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
