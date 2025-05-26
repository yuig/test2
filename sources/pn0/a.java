package pn0;

import com.pinterest.api.model.v7;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l70.d;
import tb0.g;
import tb0.h;
import ym0.c;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100726i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f100727j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f100726i = i13;
        this.f100727j = bVar;
    }

    public final void b(Throwable throwable) {
        int i13 = this.f100726i;
        b bVar = this.f100727j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                bVar.E.m(((yk1.a) bVar.I).f139224a.getString(d.reorder_pins_error_message));
                HashSet hashSet = h.f117076w;
                g.f117075a.o("Could not reorder pin successfully", throwable);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                bVar.E.i(((yk1.a) bVar.I).f139224a.getString(d.bulk_move_pins_error_message));
                HashSet hashSet2 = h.f117076w;
                g.f117075a.o("Couldn't load board object in CreateBoardSectionSelectPinsPresenter", throwable);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f100726i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                b bVar = this.f100727j;
                bVar.L = board;
                bVar.loadData();
                if (bVar.K == null) {
                    bVar.K = new c(bVar.D, board);
                }
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
