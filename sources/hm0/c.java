package hm0;

import ck2.i;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.permissions.cell.view.BoardPermissionSettingCell;
import gi.m;
import h32.f1;
import i92.k;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.q;
import uk1.d;
import x02.x0;
import y22.f;
import yk1.r;
import yk1.t;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends t {

    /* renamed from: a, reason: collision with root package name */
    public final String f69562a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f69563b;

    /* renamed from: c, reason: collision with root package name */
    public final m f69564c;

    /* renamed from: d, reason: collision with root package name */
    public final k f69565d;

    /* renamed from: e, reason: collision with root package name */
    public final v f69566e;

    /* renamed from: f, reason: collision with root package name */
    public f f69567f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f69568g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f69569h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f69570i;

    /* renamed from: j, reason: collision with root package name */
    public v7 f69571j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String boardId, x0 boardRepository, m boardInviteUtils, k toastUtils, yk1.a viewResources, d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f69562a = boardId;
        this.f69563b = boardRepository;
        this.f69564c = boardInviteUtils;
        this.f69565d = toastUtils;
        this.f69566e = viewResources;
        this.f69567f = f.SAVE_ONLY;
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(gm0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((im0.d) view).f72614r0 = this;
        xj2.c F = this.f69563b.T(this.f69562a).F(new xl0.a(3, new b(this, 0)), new xl0.a(4, new b(this, 1)), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void q3(f newPermissionsSetting) {
        Intrinsics.checkNotNullParameter(newPermissionsSetting, "newPermissionsSetting");
        this.f69567f = newPermissionsSetting;
        int i13 = a.f69559a[newPermissionsSetting.ordinal()];
        com.pinterest.feature.board.permissions.d boardPermissionSetting = i13 != 1 ? i13 != 2 ? com.pinterest.feature.board.permissions.d.SAVE_AND_COMMENT : com.pinterest.feature.board.permissions.d.DO_EVERYTHING : com.pinterest.feature.board.permissions.d.SAVE_AND_COMMENT;
        if (isBound()) {
            im0.d dVar = (im0.d) ((gm0.a) getView());
            dVar.getClass();
            Intrinsics.checkNotNullParameter(boardPermissionSetting, "boardPermissionSetting");
            BoardPermissionSettingCell boardPermissionSettingCell = dVar.f72611o0;
            if (boardPermissionSettingCell == null) {
                Intrinsics.r("doEverythingSettingCell");
                throw null;
            }
            boolean z13 = boardPermissionSetting == com.pinterest.feature.board.permissions.d.DO_EVERYTHING;
            rm1.q qVar = rm1.q.CHECK;
            boardPermissionSettingCell.b(qVar, z13);
            BoardPermissionSettingCell boardPermissionSettingCell2 = dVar.f72610n0;
            if (boardPermissionSettingCell2 == null) {
                Intrinsics.r("saveAndCommentSettingCell");
                throw null;
            }
            boardPermissionSettingCell2.b(qVar, boardPermissionSetting == com.pinterest.feature.board.permissions.d.SAVE_AND_COMMENT);
        }
        d0.v(getPinalytics(), f1.BOARD_PERMISSION_SETTING_UPDATE, this.f69562a, false, 12);
    }

    public final void r3() {
        if (isBound()) {
            ((nl1.d) ((gm0.a) getView())).D5();
            v7 v7Var = this.f69571j;
            if (v7Var != null) {
                u7 G1 = v7Var.G1();
                G1.j(Integer.valueOf(this.f69567f.getValue()));
                G1.h(Boolean.valueOf(this.f69568g));
                G1.k(Boolean.valueOf(this.f69569h));
                v7 a13 = G1.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                this.f69563b.n0(a13).i(new xo.b(18), new xl0.a(5, new b(this, 2)));
            }
        }
    }
}
