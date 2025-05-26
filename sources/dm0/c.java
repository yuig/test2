package dm0;

import a.cb;
import android.content.Context;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.organize.f;
import d70.g;
import f0.h;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import nx.d0;
import xa0.m;
import yb0.n;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f55337j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f55336i = i13;
        this.f55337j = dVar;
    }

    public final void b(v7 destinationBoard) {
        int i13 = this.f55336i;
        d dVar = this.f55337j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(destinationBoard, "it");
                dVar.getClass();
                Intrinsics.checkNotNullParameter(destinationBoard, "selectedBoard");
                if (dVar.f55339b == f.BOARD_ORGANIZE_MODE_MERGE) {
                    d0.v(dVar.getPinalytics(), f1.BOARD_MERGE, dVar.f55338a, false, 12);
                    v7 currentBoard = dVar.f55347j;
                    if (currentBoard != null) {
                        em0.d dVar2 = (em0.d) ((com.pinterest.feature.board.organize.c) dVar.getView());
                        dVar2.getClass();
                        Intrinsics.checkNotNullParameter(currentBoard, "currentBoard");
                        Intrinsics.checkNotNullParameter(destinationBoard, "destinationBoard");
                        Context context = dVar2.getContext();
                        if (context != null) {
                            n nVar = new n(context);
                            String string = dVar2.getString(h70.c.merge_board_confirmation_title);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            nVar.w(string);
                            String string2 = dVar2.getString(h70.c.merge_board_confirmation_message);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            String j13 = currentBoard.j1();
                            Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                            String j14 = destinationBoard.j1();
                            Intrinsics.checkNotNullExpressionValue(j14, "getName(...)");
                            String j15 = currentBoard.j1();
                            Intrinsics.checkNotNullExpressionValue(j15, "getName(...)");
                            nVar.u(h.C(context, string2, new String[]{"%1$s", "%2$s", "%3$s"}, new String[]{j13, j14, j15}, null, eo1.b.color_themed_text_default));
                            String string3 = dVar2.getString(g.merge_into);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            nVar.q(string3);
                            String string4 = dVar2.getString(x0.cancel);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            nVar.m(string4);
                            nVar.f138513j = new m(10, dVar2, destinationBoard);
                            cb.x(nVar, dVar2.f7());
                            break;
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(destinationBoard, "currentBoard");
                dVar.f55347j = destinationBoard;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f55336i) {
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
