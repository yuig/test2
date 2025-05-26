package em0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.q0;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import g70.h;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import wk1.i;
import x02.x0;
import x02.y;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lem0/d;", "Lyq0/b0;", "", "Lcom/pinterest/feature/board/organize/c;", "<init>", "()V", "gi2/b", "organize_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends f<Object> implements com.pinterest.feature.board.organize.c {
    public static final /* synthetic */ int K0 = 0;
    public x0 A0;
    public uk1.e B0;
    public cm0.b C0;
    public h D0;
    public com.pinterest.feature.board.organize.b E0;
    public com.pinterest.feature.board.organize.f F0 = com.pinterest.feature.board.organize.f.BOARD_ORGANIZE_MODE_REORDER;
    public String G0;
    public final ar0.c H0;
    public final q0 I0;
    public GestaltButton J0;

    /* renamed from: z0, reason: collision with root package name */
    public y f59588z0;

    public d() {
        ar0.c cVar = new ar0.c();
        this.H0 = cVar;
        this.I0 = new q0(cVar);
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(51, new jh0.d(this, 17));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i13 = le0.c.ic_header_cancel_nonpds;
        int i14 = eo1.b.color_gray_500;
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context.getDrawable(i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable2 != null) {
            drawable = sh.f.d(i14 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i14), context, drawable2);
        } else {
            drawable = null;
        }
        gestaltToolbarImpl.S(drawable);
        IconView w13 = gestaltToolbarImpl.w();
        int p13 = kh2.d.p(16);
        w13.setPadding(p13, p13, p13, p13);
    }

    @Override // yk1.k
    public final m V7() {
        uk1.e eVar = this.B0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        String str = this.G0;
        if (str == null) {
            Intrinsics.r("boardUid");
            throw null;
        }
        uk1.d d2 = ((uk1.a) eVar).d(str);
        q p73 = p7();
        String str2 = this.G0;
        if (str2 == null) {
            Intrinsics.r("boardUid");
            throw null;
        }
        com.pinterest.feature.board.organize.f fVar = this.F0;
        y yVar = this.f59588z0;
        if (yVar == null) {
            Intrinsics.r("boardFeedRepository");
            throw null;
        }
        x0 x0Var = this.A0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        b60.b activeUserManager = getActiveUserManager();
        bq.c a13 = bq.c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        cm0.b bVar = this.C0;
        if (bVar != null) {
            return new dm0.d(d2, p73, str2, fVar, yVar, x0Var, activeUserManager, a13, bVar, f7());
        }
        Intrinsics.r("retrofitBoardListRearrangeInteractor");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getT0() {
        return b.f59584a[this.F0.ordinal()] == 1 ? a4.REORDER_BOARDS : a4.BOARD_MERGE;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF68107l0() {
        return this.F0 == com.pinterest.feature.board.organize.f.BOARD_ORGANIZE_MODE_REORDER ? d4.REORDER : d4.BOARD;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(h70.b.fragment_board_organize, h70.a.p_recycler_view);
        eVar.b(h70.a.loading_container);
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r0 == null) goto L12;
     */
    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            com.pinterest.navigation.Navigation r0 = r2.I
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getF49940b()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            java.lang.String r0 = ""
        Le:
            r2.G0 = r0
            com.pinterest.navigation.Navigation r0 = r2.I
            if (r0 == 0) goto L22
            java.lang.String r1 = "com.pinterest.EXTRA_BOARD_ORGANIZE_MODE"
            int r0 = r0.J1(r1)
            com.pinterest.feature.board.organize.f[] r1 = com.pinterest.feature.board.organize.f.values()
            r0 = r1[r0]
            if (r0 != 0) goto L24
        L22:
            com.pinterest.feature.board.organize.f r0 = com.pinterest.feature.board.organize.f.BOARD_ORGANIZE_MODE_REORDER
        L24:
            r2.F0 = r0
            super.onCreate(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: em0.d.onCreate(android.os.Bundle):void");
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.I0.i(g8());
    }

    @Override // yq0.t
    public final void y8(yq0.m mVar, i dataSourceProvider) {
        z adapter = (z) mVar;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        adapter.f139766l = new gi2.b();
    }
}
