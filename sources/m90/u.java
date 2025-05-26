package m90;

import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86702i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f86703j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, int i13) {
        super(1);
        this.f86702i = i13;
        this.f86703j = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f86702i;
        w wVar = this.f86703j;
        switch (i13) {
            case 0:
                e eVar = new e(((Number) obj).intValue());
                int i14 = w.X0;
                wVar.m9(eVar);
                break;
            default:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                d dVar = new d(board);
                int i15 = w.X0;
                wVar.m9(dVar);
                break;
        }
        return Unit.f80348a;
    }
}
