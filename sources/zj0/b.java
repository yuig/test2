package zj0;

import b60.d;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.create.collaboratorview.view.BoardCreateAddCollaboratorsView;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import jc0.v;
import jv0.g;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import m60.w;
import n00.c;
import nx.d0;
import qz.f0;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f142050a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f142051b;

    /* renamed from: c, reason: collision with root package name */
    public final w f142052c;

    /* renamed from: d, reason: collision with root package name */
    public final h91.a f142053d;

    /* renamed from: e, reason: collision with root package name */
    public final qz.a f142054e;

    /* renamed from: f, reason: collision with root package name */
    public final a f142055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d0 pinalytics, b60.b activeUserManager, w eventManager, h91.a selectedContacts, qz.a cache) {
        super(0);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f142050a = pinalytics;
        this.f142051b = activeUserManager;
        this.f142052c = eventManager;
        this.f142053d = selectedContacts;
        this.f142054e = cache;
        this.f142055f = new a(this);
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        yj0.a view = (yj0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        BoardCreateAddCollaboratorsView boardCreateAddCollaboratorsView = (BoardCreateAddCollaboratorsView) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        boardCreateAddCollaboratorsView.f45146a = this;
        this.f142052c.h(this.f142055f);
        wy0 user = ((d) this.f142051b).f();
        if (user != null) {
            f0 f0Var = new f0();
            f0Var.c(15, "page_size");
            f0Var.e("add_fields", n00.b.a(c.SEND_SHARE_CONTACT));
            f0Var.e("hide_group_conversations", "false");
            vd0.c a13 = this.f142054e.a(f0Var);
            ArrayList contacts = CollectionsKt.H0(r.e0(a13 != null ? a13.c("data") : null));
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(contacts, "contacts");
            h91.a selectedContacts = this.f142053d;
            Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
            vs.b bVar = new vs.b(CollectionsKt.y0(contacts, 3), selectedContacts);
            Object value = boardCreateAddCollaboratorsView.f45149d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((PinterestRecyclerView) value).j(bVar);
            boardCreateAddCollaboratorsView.f45150e = bVar;
            boardCreateAddCollaboratorsView.a();
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f142052c.j(this.f142055f);
        super.onUnbind();
    }

    public final void p3() {
        this.f142052c.d(new v(new g(new SendableObject("", 1), g91.c.COLLABORATOR), false, 0L, 30));
        u0 u0Var = u0.BOARD_ADD_COLLABORATOR_BUTTON;
        this.f142050a.F(g0.MODAL_CREATE_BOARD, u0Var);
    }
}
