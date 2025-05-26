package i11;

import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.error.NoConnectionErrorWithUrls;
import h32.f1;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class l extends rk2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f70988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f70989c;

    public l(m mVar, int i13) {
        this.f70988b = mVar;
        this.f70989c = i13;
    }

    @Override // uj2.v
    public final void a() {
    }

    @Override // uj2.v
    public final void c(Object obj) {
        ba j63;
        v7 board = (v7) obj;
        Intrinsics.checkNotNullParameter(board, "board");
        m mVar = this.f70988b;
        BoardFeed boardFeed = mVar.R;
        if (boardFeed != null) {
            uk1.d presenterPinalytics = mVar.getPresenterPinalytics();
            Intrinsics.g(presenterPinalytics, "null cannot be cast to non-null type com.pinterest.feature.pin.create.analytics.BoardPickerPinalytics");
            g11.a aVar = (g11.a) presenterPinalytics;
            f1 f1Var = f1.TAP;
            f30 f30Var = mVar.K;
            aVar.n(f1Var, this.f70989c, boardFeed, board, mVar.f71013n, f30Var != null ? f30Var.z4() : null);
        }
        if (mVar.f71017r) {
            String repinPreviewImageUrl = mVar.getRepinPreviewImageUrl();
            f30 f30Var2 = mVar.K;
            String uid = (f30Var2 == null || (j63 = f30Var2.j6()) == null) ? null : j63.getUid();
            String str = mVar.f71013n;
            if (str != null) {
                List b13 = e0.b(str);
                c0.d.n(mVar.f70995d, b13, mVar.f71020u, board.getUid(), null, mVar.f71018s).j(new k(mVar, uid, str, board, repinPreviewImageUrl, b13));
                return;
            }
            return;
        }
        q0 q0Var = q0.f80391a;
        String uid2 = board.getUid();
        String boardName = board.j1();
        Intrinsics.checkNotNullExpressionValue(boardName, "getName(...)");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        String repinPreviewImageUrl2 = mVar.getRepinPreviewImageUrl();
        String q13 = b40.q(mVar.K);
        if (boardName != null) {
            mVar.U3(new h11.d(uid2, boardName, repinPreviewImageUrl2, q13, true, false, this.f70989c, null, q0Var));
        } else {
            Intrinsics.r("boardName");
            throw null;
        }
    }

    @Override // uj2.v
    public final void onError(Throwable e13) {
        f11.d dVar;
        Intrinsics.checkNotNullParameter(e13, "e");
        boolean z13 = e13 instanceof NoConnectionErrorWithUrls;
        m mVar = this.f70988b;
        if (!z13) {
            String message = e13.getMessage();
            if (message == null || (dVar = (f11.d) mVar.getView()) == null) {
                return;
            }
            ((l11.j) dVar).w3(message);
            return;
        }
        f11.d dVar2 = (f11.d) mVar.getView();
        if (dVar2 != null) {
            l11.j jVar = (l11.j) dVar2;
            jVar.w3(((yk1.a) mVar.f71003h).f139224a.getString(x0.create_new_board_fail));
        }
    }
}
