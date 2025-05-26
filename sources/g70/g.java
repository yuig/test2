package g70;

import com.pinterest.api.model.v7;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63877i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f63878j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f63877i = i13;
        this.f63878j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h hVar = this.f63878j;
        int i13 = this.f63877i;
        switch (i13) {
            case 0:
                Navigation navigation = (Navigation) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(navigation, "navigation");
                        hVar.f63879a.d(navigation);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(navigation, "navigation");
                        hVar.f63879a.d(navigation);
                        break;
                }
                break;
            case 1:
                Navigation navigation2 = (Navigation) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(navigation2, "navigation");
                        hVar.f63879a.d(navigation2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(navigation2, "navigation");
                        hVar.f63879a.d(navigation2);
                        break;
                }
                break;
            default:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                h.f(hVar, board, null, 6);
                break;
        }
        return Unit.f80348a;
    }
}
