package ek0;

import com.pinterest.feature.board.create.namingview.view.BoardCreateBoardNamingView;
import fk0.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.p;
import lh0.z3;
import yk1.m;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f59203i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f59204j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ bk0.a f59205k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f59206l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, h hVar, BoardCreateBoardNamingView boardCreateBoardNamingView, List list) {
        super(1);
        this.f59203i = mVar;
        this.f59204j = hVar;
        this.f59205k = boardCreateBoardNamingView;
        this.f59206l = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        if (this.f59203i.isBound()) {
            h hVar = this.f59204j;
            hVar.H = list;
            if (hVar.getViewIfBound() != null) {
                p pVar = hVar.C;
                pVar.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) pVar.f83454a;
                if (g1Var.o("android_curation_brv_move_first_board_title_suggestion", "enabled", z3Var) || g1Var.l("android_curation_brv_move_first_board_title_suggestion")) {
                    BoardCreateBoardNamingView c83 = ((k) ((com.pinterest.feature.board.create.c) hVar.getViewIfBound())).c8();
                    bk0.c name = (bk0.c) list.get(0);
                    Intrinsics.checkNotNullParameter(name, "name");
                    c83.f45159a.X(new hh0.a(name, 20));
                    c83.f45161c.setVisibility(8);
                } else {
                    ((k) ((com.pinterest.feature.board.create.c) hVar.getViewIfBound())).c8().b(list);
                }
            }
        } else {
            ((BoardCreateBoardNamingView) this.f59205k).b(this.f59206l);
        }
        return Unit.f80348a;
    }
}
