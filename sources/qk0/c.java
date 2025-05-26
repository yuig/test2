package qk0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import jk2.h0;
import jk2.j1;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import so.o4;
import tk2.e;
import uj2.q;
import uk1.d;

/* loaded from: classes5.dex */
public final class c extends xk1.c implements j {

    /* renamed from: k, reason: collision with root package name */
    public final String f104049k;

    /* renamed from: l, reason: collision with root package name */
    public final m f104050l;

    /* renamed from: m, reason: collision with root package name */
    public String f104051m;

    /* renamed from: n, reason: collision with root package name */
    public String f104052n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String excludeBoardId, m userService, d presenterAnalytics, o4 boardMoreBoardsPresenterFactory) {
        super(null);
        Intrinsics.checkNotNullParameter(excludeBoardId, "excludeBoardId");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(presenterAnalytics, "presenterAnalytics");
        Intrinsics.checkNotNullParameter(boardMoreBoardsPresenterFactory, "boardMoreBoardsPresenterFactory");
        this.f104049k = excludeBoardId;
        this.f104050l = userService;
        o(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS, new yi0.a(presenterAnalytics, boardMoreBoardsPresenterFactory));
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS;
    }

    @Override // wt1.b
    public final boolean i() {
        return this.f104051m != null;
    }

    @Override // xk1.c
    public final q k() {
        String str = this.f104051m;
        if (str == null) {
            h0 h0Var = h0.f76488a;
            Intrinsics.checkNotNullExpressionValue(h0Var, "empty(...)");
            return h0Var;
        }
        j1 j1Var = new j1(this.f104050l.H(str, "last_pinned_to", "public", true, false, true, true, true, n00.b.a(n00.c.MORE_BOARDS_FIELDS), "11").l(wj2.c.a()).r(e.f118017c).u(), new b(0, new hh0.a(this, 25)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
