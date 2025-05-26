package zk0;

import com.pinterest.api.model.ke;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import jk2.l1;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qp.g;
import sk0.x;
import vc.f;
import x02.x2;
import x40.ec;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142082i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f142083j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, int i13) {
        super(1);
        this.f142082i = i13;
        this.f142083j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String userId;
        int i13 = this.f142082i;
        e presenter = this.f142083j;
        switch (i13) {
            case 0:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                presenter.p3();
                break;
            default:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                presenter.f142098k = board;
                Intrinsics.checkNotNullParameter(board, "board");
                ke E1 = board.E1();
                wy0 c13 = E1 != null ? E1.c() : null;
                if (c13 != null) {
                    String contactRequestSenderId = c13.getUid();
                    Intrinsics.checkNotNullExpressionValue(contactRequestSenderId, "getUid(...)");
                    Intrinsics.checkNotNullParameter(contactRequestSenderId, "contactRequestSenderId");
                    x2 x2Var = presenter.f142091d;
                    wy0 wy0Var = (wy0) x2Var.O(contactRequestSenderId);
                    if (wy0Var != null) {
                        presenter.q3(wy0Var);
                    } else {
                        l1 A = x2Var.L(contactRequestSenderId).H(tk2.e.f118017c).A(wj2.c.a());
                        g gVar = new g(presenter, 2);
                        A.d(gVar);
                        Intrinsics.checkNotNullExpressionValue(gVar, "subscribeWith(...)");
                        presenter.addDisposable(gVar);
                    }
                } else {
                    String boardId = board.getUid();
                    Intrinsics.checkNotNullExpressionValue(boardId, "getUid(...)");
                    wy0 f13 = ((b60.d) presenter.f142097j).f();
                    if (f13 == null || (userId = f13.getUid()) == null) {
                        userId = "";
                    }
                    Intrinsics.checkNotNullParameter(userId, "userId");
                    Intrinsics.checkNotNullParameter(boardId, "boardId");
                    oc.c apolloClient = presenter.f142089b;
                    Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
                    Intrinsics.checkNotNullParameter(presenter, "presenter");
                    oc.a c14 = apolloClient.c(new ec(boardId, userId));
                    d7.b.E(c14, f.NetworkFirst);
                    t l13 = com.bumptech.glide.d.u0(c14).l(wj2.c.a());
                    Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
                    presenter.addDisposable(nl.b.q(l13, new x(4, presenter, boardId), new a(presenter, 0)));
                }
                break;
        }
        return Unit.f80348a;
    }
}
