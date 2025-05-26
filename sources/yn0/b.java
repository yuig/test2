package yn0;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yk1.i;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139517i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f139518j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f139517i = i13;
        this.f139518j = dVar;
    }

    public final void b(Throwable throwable) {
        int i13 = this.f139517i;
        d dVar = this.f139518j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (dVar.isBound()) {
                    ((zn0.d) ((xn0.a) dVar.getView())).setLoadState(i.LOADED);
                }
                dVar.f139528g.i(throwable.getMessage());
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (dVar.isBound()) {
                    ((zn0.d) ((xn0.a) dVar.getView())).setLoadState(i.LOADED);
                }
                dVar.f139528g.i(throwable.getMessage());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f139517i;
        d dVar = this.f139518j;
        switch (i13) {
            case 0:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                dVar.f139529h = board;
                dVar.v3();
                return Unit.f80348a;
            case 1:
                ba boardSection = (ba) obj;
                Intrinsics.checkNotNullParameter(boardSection, "boardSection");
                dVar.f139530i = boardSection;
                dVar.f139531j = boardSection.A();
                xn0.a aVar = (xn0.a) dVar.getView();
                String boardSectionName = dVar.f139531j;
                Intrinsics.f(boardSectionName);
                zn0.d dVar2 = (zn0.d) aVar;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(boardSectionName, "boardSectionName");
                GestaltTextField gestaltTextField = dVar2.f142272k0;
                if (gestaltTextField == null) {
                    Intrinsics.r("boardSectionNameEditField");
                    throw null;
                }
                gestaltTextField.X(new kl0.c(boardSectionName, 9));
                dVar.v3();
                return Unit.f80348a;
            case 2:
                b((Throwable) obj);
                return Unit.f80348a;
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
