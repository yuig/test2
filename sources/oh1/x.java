package oh1;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import jk2.e0;
import k1.b0;
import kotlin.jvm.internal.Intrinsics;
import x02.i2;

/* loaded from: classes5.dex */
public final class x implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f94597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f94598b;

    public x(y yVar, i2 i2Var) {
        this.f94597a = yVar;
        this.f94598b = i2Var;
    }

    @Override // oh1.r
    public final void a(rp0.d comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        rh1.k kVar = (rh1.k) ((com.pinterest.feature.unifiedcomments.d) this.f94597a.getView());
        kVar.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        kVar.Y8().B0(comment);
    }

    @Override // oh1.r
    public final void b(rp0.d comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        y yVar = this.f94597a;
        yVar.F.d(new pg0.g(yVar.G, comment));
    }

    @Override // oh1.r
    public final void c(rp0.d comment, boolean z13) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        y yVar = this.f94597a;
        if (yVar.isBound()) {
            e0 M = this.f94598b.M(yVar.f94536r);
            hk2.b bVar = new hk2.b(new a(11, new b0(comment, z13, this.f94597a, this.f94598b, 16)), new a(12, l.f94517q), ck2.i.f27923c);
            M.f(bVar);
            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
            yVar.addDisposable(bVar);
        }
    }

    @Override // oh1.r
    public final void e(wy0 user, rp0.d comment, boolean z13) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(comment, "comment");
        y yVar = this.f94597a;
        if (z13) {
            Intrinsics.checkNotNullParameter(comment, "comment");
            yVar.F.d(new pg0.f(comment, yVar.G, yVar.f94536r));
            yVar.w3();
            yVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.COMMENT_BLOCK_USER_TOAST_UNDO_TAP, (r18 & 2) != 0 ? null : u0.USER_UNBLOCK_BUTTON, (r18 & 4) != 0 ? null : g0.PIN_CLOSEUP_COMMENTS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        } else {
            String uid = user.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            yVar.T3(uid);
            yVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.COMMENT_OVERFLOW_BLOCK_USER_TAP, (r18 & 2) != 0 ? null : u0.USER_BLOCK_BUTTON, (r18 & 4) != 0 ? null : g0.PIN_CLOSEUP_COMMENTS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        yVar.onRecyclerRefresh();
    }
}
