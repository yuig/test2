package ka2;

import com.pinterest.api.model.v7;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kh2.u2;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f78952a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f78953b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f78954c;

    public c(d0 pinalytics, g0 componentType, Function1 function1) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        this.f78952a = pinalytics;
        this.f78953b = componentType;
        this.f78954c = function1;
    }

    @Override // ka2.b
    public final void A2(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f78952a.f0(u0.BOARD_CREATOR_AVATAR, this.f78953b, board.getUid(), a(i13, board), false);
    }

    @Override // ka2.b
    public final void B(String boardId, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
    }

    @Override // ka2.b
    public final void D2(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f78952a.f0(u0.BOARD_CREATOR_NAME, this.f78953b, board.getUid(), a(i13, board), false);
    }

    @Override // ka2.b
    public final void K2(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f78952a.f0(u0.BOARD_COVER, this.f78953b, board.getUid(), a(i13, board), false);
    }

    public final HashMap a(int i13, v7 v7Var) {
        HashMap S = u2.S(v7Var);
        Function1 function1 = this.f78954c;
        if (function1 != null) {
            String uid = v7Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            HashMap hashMap = (HashMap) function1.invoke(uid);
            if (hashMap != null) {
                S.putAll(hashMap);
            }
        }
        S.put("grid_index", String.valueOf(i13));
        return S;
    }

    @Override // ka2.b
    public final void r0(int i13, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        d0.B(this.f78952a, f1.LONG_PRESS, g0.CONTEXTUAL_MENU, null, bs1.c.o(new Pair("board_id", board.getUid()), new Pair("board_pin_count", String.valueOf(board.l1().intValue())), new Pair("grid_index", String.valueOf(i13))), 20);
    }

    public /* synthetic */ c(d0 d0Var, gx0.b bVar, int i13) {
        this(d0Var, g0.FLOWED_BOARD, (i13 & 4) != 0 ? null : bVar);
    }
}
