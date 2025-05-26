package gx0;

import com.pinterest.api.model.v7;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66279i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f66280j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(1);
        this.f66279i = i13;
        this.f66280j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e eVar = this.f66280j;
        int i13 = this.f66279i;
        switch (i13) {
            case 0:
                v7 board = (v7) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(board, "board");
                        eVar.S.invoke(board);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(board, "board");
                        eVar.S.invoke(board);
                        break;
                }
                return Unit.f80348a;
            case 1:
                v7 board2 = (v7) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(board2, "board");
                        eVar.S.invoke(board2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(board2, "board");
                        eVar.S.invoke(board2);
                        break;
                }
                return Unit.f80348a;
            default:
                Intrinsics.checkNotNullParameter((String) obj, "<anonymous parameter 0>");
                return bs1.c.o(new Pair("news_id", eVar.Q));
        }
    }
}
