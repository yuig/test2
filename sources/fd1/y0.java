package fd1;

import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import com.pinterest.feature.board.permissions.cell.view.BoardPermissionSettingCell;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppListView;
import com.pinterest.gestalt.text.GestaltText;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends LinearLayout implements cd1.f, af2.c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f62016r = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f62017a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f62018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62019c;

    /* renamed from: d, reason: collision with root package name */
    public final jc0.n f62020d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f62021e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f62022f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f62023g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f62024h;

    /* renamed from: i, reason: collision with root package name */
    public final m60.w f62025i;

    /* renamed from: j, reason: collision with root package name */
    public final c2 f62026j;

    /* renamed from: k, reason: collision with root package name */
    public final float f62027k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f62028l;

    /* renamed from: m, reason: collision with root package name */
    public final t0 f62029m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f62030n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f62031o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f62032p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f62033q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y0(android.content.Context r20, com.pinterest.activity.sendapin.model.SendableObject r21, p32.c r22, int r23, jc0.n r24, fd1.z0 r25, fd1.b1 r26, boolean r27, boolean r28, boolean r29, fd1.f1 r30, i91.b r31) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fd1.y0.<init>(android.content.Context, com.pinterest.activity.sendapin.model.SendableObject, p32.c, int, jc0.n, fd1.z0, fd1.b1, boolean, boolean, boolean, fd1.f1, i91.b):void");
    }

    @Override // cd1.f
    public final void C0(String newTitle) {
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        this.f62020d.p(newTitle);
    }

    @Override // cd1.f
    public final com.pinterest.feature.sharesheet.view.previewcarousel.k C6() {
        return null;
    }

    @Override // cd1.f
    public final void E0(String boardId, com.pinterest.feature.board.permissions.d setting, com.pinterest.feature.board.permissions.a aVar) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(setting, "setting");
        Object value = this.f62032p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BoardPermissionSettingCell boardPermissionSettingCell = (BoardPermissionSettingCell) value;
        boardPermissionSettingCell.a(setting.getPermissionTitleResId(), setting.getPermissionSubtitleResId());
        com.pinterest.feature.board.permissions.a aVar2 = com.pinterest.feature.board.permissions.a.OWNER;
        boardPermissionSettingCell.b(rm1.q.ARROW_FORWARD, aVar == aVar2);
        if (aVar == aVar2) {
            boardPermissionSettingCell.setOnClickListener(new e(this, boardId, 2));
        }
        if (aVar == com.pinterest.feature.board.permissions.a.COLLABORATOR) {
            Object value2 = this.f62031o.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            String string = getResources().getString(j70.c.board_permissions_you_can);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pk.a0.p((GestaltText) value2, string);
        }
    }

    @Override // cd1.f
    public final void F2(pg0.z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.f100092a || this.f62021e == z0.CONTACT_LIST_ONLY) {
            a().setVisibility(8);
        } else {
            a().setVisibility(0);
        }
        this.f62020d.requestLayout();
    }

    @Override // cd1.f
    public final void L4(pg0.a0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.f100050a || this.f62021e == z0.CONTACT_LIST_ONLY) {
            a().setVisibility(8);
        } else {
            a().setVisibility(0);
        }
        jc0.n nVar = this.f62020d;
        nVar.getLayoutParams().height = -1;
        nVar.requestLayout();
    }

    @Override // cd1.f
    public final void N5() {
        bs1.c.R1(findViewById(b62.b.app_container_padding), true);
        f1 f1Var = f1.NONE;
        f1 f1Var2 = this.f62024h;
        if (f1Var2 == f1Var || f1Var2 == f1.DOWNLOAD || f1Var2 == f1.SCREENSHOT) {
            bs1.c.R1(this.f62029m, false);
        }
    }

    @Override // cd1.f
    public final t0 S() {
        t0 t0Var = this.f62029m;
        Intrinsics.g(t0Var, "null cannot be cast to non-null type com.pinterest.feature.sharesheet.view.SharesheetModalContactListView");
        return t0Var;
    }

    @Override // cd1.f
    public final f1 S2() {
        return this.f62024h;
    }

    @Override // cd1.f
    public final void U0() {
        z0 z0Var = z0.DEFAULT;
        z0 z0Var2 = this.f62021e;
        if (z0Var2 != z0Var) {
            if (this.f62026j == null) {
                Intrinsics.r("sharesheetUtils");
                throw null;
            }
            if (!c2.A(z0Var2, this.f62024h)) {
                return;
            }
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (this.f62027k * (this.f62019c == y32.f.INAPP_BROWSER.getValue() ? hf0.b.f69003c : hf0.b.d(bs1.c.m0(this))))));
    }

    @Override // cd1.f
    public final SharesheetModalAppListView Z0() {
        return a();
    }

    public final SharesheetModalAppListView a() {
        Object value = this.f62028l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharesheetModalAppListView) value;
    }

    public final SharesheetBoardPreviewContainer b() {
        Object value = this.f62033q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharesheetBoardPreviewContainer) value;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f62017a == null) {
            this.f62017a = new ye2.o(this);
        }
        return this.f62017a;
    }

    @Override // cd1.f
    public final void d6(float f13) {
        b().e(f13);
        b().getParent().requestLayout();
    }

    @Override // cd1.f
    public final void f5() {
        Object value = this.f62030n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        k3.R1((LinearLayout) value, this.f62023g);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f62017a == null) {
            this.f62017a = new ye2.o(this);
        }
        return this.f62017a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hf0.b.k(this);
        super.onDetachedFromWindow();
    }

    @Override // cd1.f
    public final boolean v3() {
        return (this.f62022f || this.f62021e == z0.APP_LIST_ONLY_FOR_CONTEXTUAL_MENU) ? false : true;
    }

    @Override // cd1.f
    public final SharesheetBoardPreviewContainer y0() {
        return b();
    }
}
