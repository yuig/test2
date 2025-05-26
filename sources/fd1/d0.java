package fd1;

import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import com.pinterest.feature.board.permissions.cell.view.BoardPermissionSettingCell;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppListView;
import com.pinterest.gestalt.text.GestaltText;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import lh0.w3;

/* loaded from: classes5.dex */
public final class d0 extends LinearLayout implements cd1.f, af2.c {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f61884t = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f61885a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61886b;

    /* renamed from: c, reason: collision with root package name */
    public final jc0.n f61887c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f61888d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f61889e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f61890f;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f61891g;

    /* renamed from: h, reason: collision with root package name */
    public final m60.w f61892h;

    /* renamed from: i, reason: collision with root package name */
    public final w3 f61893i;

    /* renamed from: j, reason: collision with root package name */
    public final c2 f61894j;

    /* renamed from: k, reason: collision with root package name */
    public final float f61895k;

    /* renamed from: l, reason: collision with root package name */
    public final int f61896l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f61897m;

    /* renamed from: n, reason: collision with root package name */
    public final t0 f61898n;

    /* renamed from: o, reason: collision with root package name */
    public final com.pinterest.feature.sharesheet.view.previewcarousel.k f61899o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f61900p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f61901q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f61902r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f61903s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x021d, code lost:
    
        if (r1.a("enabled_no_preview", lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0234, code lost:
    
        r1 = r19.f61899o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0236, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0238, code lost:
    
        r1.setVisibility(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x023c, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("previewCarouselView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x023f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0232, code lost:
    
        if (r1.b("enabled_no_preview", lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT) != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(android.content.Context r20, com.pinterest.activity.sendapin.model.SendableObject r21, p32.c r22, int r23, jc0.n r24, fd1.z0 r25, fd1.b1 r26, boolean r27, boolean r28, boolean r29, fd1.f1 r30, i91.b r31) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fd1.d0.<init>(android.content.Context, com.pinterest.activity.sendapin.model.SendableObject, p32.c, int, jc0.n, fd1.z0, fd1.b1, boolean, boolean, boolean, fd1.f1, i91.b):void");
    }

    @Override // cd1.f
    public final void C0(String newTitle) {
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        this.f61887c.p(newTitle);
    }

    @Override // cd1.f
    public final com.pinterest.feature.sharesheet.view.previewcarousel.k C6() {
        com.pinterest.feature.sharesheet.view.previewcarousel.k kVar = this.f61899o;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("previewCarouselView");
        throw null;
    }

    @Override // cd1.f
    public final void E0(String boardId, com.pinterest.feature.board.permissions.d setting, com.pinterest.feature.board.permissions.a aVar) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(setting, "setting");
        Object value = this.f61902r.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BoardPermissionSettingCell boardPermissionSettingCell = (BoardPermissionSettingCell) value;
        boardPermissionSettingCell.a(setting.getPermissionTitleResId(), setting.getPermissionSubtitleResId());
        com.pinterest.feature.board.permissions.a aVar2 = com.pinterest.feature.board.permissions.a.OWNER;
        boardPermissionSettingCell.b(rm1.q.ARROW_FORWARD, aVar == aVar2);
        if (aVar == aVar2) {
            boardPermissionSettingCell.setOnClickListener(new e(this, boardId, 1));
        }
        if (aVar == com.pinterest.feature.board.permissions.a.COLLABORATOR) {
            Object value2 = this.f61901q.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            String string = getResources().getString(j70.c.board_permissions_you_can);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pk.a0.p((GestaltText) value2, string);
        }
    }

    @Override // cd1.f
    public final void F2(pg0.z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.f100092a || this.f61888d == z0.CONTACT_LIST_ONLY) {
            a().setVisibility(8);
        } else {
            a().setVisibility(0);
        }
        this.f61887c.requestLayout();
    }

    @Override // cd1.f
    public final void L4(pg0.a0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        t0 t0Var = this.f61898n;
        if (event.f100050a) {
            if (t0Var != null) {
                t0Var.setVisibility(0);
            }
        } else if (t0Var != null) {
            t0Var.setVisibility(8);
        }
        if (event.f100051b) {
            U0();
        }
    }

    @Override // cd1.f
    public final void N5() {
        bs1.c.R1(findViewById(b62.b.app_container_padding), true);
        f1 f1Var = f1.NONE;
        f1 f1Var2 = this.f61891g;
        if (f1Var2 == f1Var || f1Var2 == f1.DOWNLOAD || f1Var2 == f1.SCREENSHOT) {
            bs1.c.R1(this.f61898n, false);
        }
    }

    @Override // cd1.f
    public final t0 S() {
        t0 t0Var = this.f61898n;
        Intrinsics.g(t0Var, "null cannot be cast to non-null type com.pinterest.feature.sharesheet.view.SharesheetModalContactListView");
        return t0Var;
    }

    @Override // cd1.f
    public final f1 S2() {
        return this.f61891g;
    }

    @Override // cd1.f
    public final void U0() {
        z0 z0Var = z0.DEFAULT;
        z0 z0Var2 = this.f61888d;
        if (z0Var2 != z0Var) {
            if (this.f61894j == null) {
                Intrinsics.r("sharesheetUtils");
                throw null;
            }
            if (!c2.A(z0Var2, this.f61891g)) {
                return;
            }
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (this.f61895k * this.f61896l)));
    }

    @Override // cd1.f
    public final SharesheetModalAppListView Z0() {
        return a();
    }

    public final SharesheetModalAppListView a() {
        Object value = this.f61897m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharesheetModalAppListView) value;
    }

    public final SharesheetBoardPreviewContainer b() {
        Object value = this.f61903s.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharesheetBoardPreviewContainer) value;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f61885a == null) {
            this.f61885a = new ye2.o(this);
        }
        return this.f61885a;
    }

    @Override // cd1.f
    public final void d6(float f13) {
        b().e(f13);
        b().getParent().requestLayout();
    }

    @Override // cd1.f
    public final void f5() {
        Object value = this.f61900p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        k3.R1((LinearLayout) value, this.f61890f);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f61885a == null) {
            this.f61885a = new ye2.o(this);
        }
        return this.f61885a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hf0.b.k(this);
        super.onDetachedFromWindow();
    }

    @Override // cd1.f
    public final boolean v3() {
        return (this.f61889e || this.f61888d == z0.APP_LIST_ONLY_FOR_CONTEXTUAL_MENU) ? false : true;
    }

    @Override // cd1.f
    public final SharesheetBoardPreviewContainer y0() {
        return b();
    }
}
