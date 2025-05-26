package ho0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import go0.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import rm1.q;
import so.m2;
import so.oa;
import x02.i2;
import yq0.z;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lho0/k;", "Lho0/d;", "Lfo0/b;", "Lnr0/j;", "Ldl1/s;", "Lf11/h;", "<init>", "()V", "repin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends g implements fo0.b {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f69704y1 = 0;

    /* renamed from: g1, reason: collision with root package name */
    public go0.m f69705g1;

    /* renamed from: h1, reason: collision with root package name */
    public hk0.m f69706h1;

    /* renamed from: i1, reason: collision with root package name */
    public ArrayList f69707i1;

    /* renamed from: j1, reason: collision with root package name */
    public String f69708j1 = "";

    /* renamed from: k1, reason: collision with root package name */
    public String f69709k1;

    /* renamed from: l1, reason: collision with root package name */
    public String f69710l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f69711m1;

    /* renamed from: n1, reason: collision with root package name */
    public String f69712n1;

    /* renamed from: o1, reason: collision with root package name */
    public ArrayList f69713o1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f69714p1;

    /* renamed from: q1, reason: collision with root package name */
    public l11.l f69715q1;

    /* renamed from: r1, reason: collision with root package name */
    public i2 f69716r1;

    /* renamed from: s1, reason: collision with root package name */
    public uk1.e f69717s1;

    /* renamed from: t1, reason: collision with root package name */
    public m2 f69718t1;

    /* renamed from: u1, reason: collision with root package name */
    public f0 f69719u1;

    /* renamed from: v1, reason: collision with root package name */
    public i92.k f69720v1;

    /* renamed from: w1, reason: collision with root package name */
    public g11.a f69721w1;

    /* renamed from: x1, reason: collision with root package name */
    public g70.h f69722x1;

    @Override // ho0.d, sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(465542, new jh0.d(this, 24));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation != null) {
            String v03 = navigation.v0("com.pinterest.EXTRA_SOURCE");
            Intrinsics.checkNotNullExpressionValue(v03, "getStringParcelable(...)");
            this.f69706h1 = hk0.m.valueOf(v03);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.f69717s1;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.f69716r1;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        super.i9();
        Navigation navigation = this.I;
        Intrinsics.f(navigation);
        hk0.m mVar = this.f69706h1;
        if (mVar == null) {
            Intrinsics.r("sourceLocation");
            throw null;
        }
        if (mVar != hk0.m.PROFILE) {
            f0 f0Var = this.f69719u1;
            if (f0Var == null) {
                Intrinsics.r("devUtils");
                throw null;
            }
            f0Var.N(this.Q0, "board id must be set", new Object[0]);
        }
        hk0.m mVar2 = this.f69706h1;
        if (mVar2 == null) {
            Intrinsics.r("sourceLocation");
            throw null;
        }
        if (mVar2 == hk0.m.BOARD_SECTION) {
            this.f69710l1 = navigation.v0("com.pinterest.EXTRA_BOARD_SECTION_ID");
        }
        this.f69714p1 = navigation.S("com.pinterest.EXTRA_IS_SELECT_ALL_MODE_ACTIVE", false);
        this.f69711m1 = navigation.S("com.pinterest.EXTRA_FROM_AUTO_SAVE", false);
        this.f69712n1 = navigation.v0("com.pinterest.EXTRA_AUTO_SAVE_ORIGIN_PIN_ID");
        Navigation navigation2 = this.I;
        Intrinsics.f(navigation2);
        this.f69707i1 = navigation2.M("com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST");
        String g23 = navigation2.g2("com.pinterest.EXTRA_BULK_MOVE_ORIGIN_BOARD_ID", "");
        Intrinsics.checkNotNullExpressionValue(g23, "getStringParcelable(...)");
        this.f69708j1 = g23;
        this.f69709k1 = navigation2.v0("com.pinterest.EXTRA_PIN_MOVE_ORIGIN_BOARD_SECTION_ID");
        if (this.f69714p1) {
            ArrayList M = navigation2.M("com.pinterest.EXTRA_SELECT_ALL_EXCLUDE_PINS");
            this.f69713o1 = M;
            f0 f0Var2 = this.f69719u1;
            if (f0Var2 == null) {
                Intrinsics.r("devUtils");
                throw null;
            }
            f0Var2.N(M, "Select-All-Exclude-Pins list can be empty but not null", new Object[0]);
            f0 f0Var3 = this.f69719u1;
            if (f0Var3 == null) {
                Intrinsics.r("devUtils");
                throw null;
            }
            f0Var3.N(this.f69708j1, "Pin-move origin board id cannot be null", new Object[0]);
        }
        String uid = com.bumptech.glide.d.Q(getActiveUserManager()).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String str = this.Q0;
        String str2 = this.f69710l1;
        boolean z13 = this.R0;
        boolean z14 = this.T0;
        hk0.m mVar3 = this.f69706h1;
        if (mVar3 == null) {
            Intrinsics.r("sourceLocation");
            throw null;
        }
        String str3 = this.f69708j1;
        String str4 = this.f69709k1;
        ArrayList arrayList = this.f69707i1;
        boolean z15 = this.f69714p1;
        ArrayList arrayList2 = this.f69713o1;
        boolean z16 = this.f69711m1;
        String str5 = this.f69712n1;
        Navigation navigation3 = this.I;
        go0.e eVar2 = new go0.e(uid, str, str2, z13, z14, mVar3, str3, str4, arrayList, z15, arrayList2, z16, str5, navigation3 != null ? navigation3.S("extra_section_move_pins", false) : false);
        m2 m2Var = this.f69718t1;
        if (m2Var == null) {
            Intrinsics.r("movePinsBoardSectionPickerPresenterFactory");
            throw null;
        }
        String str6 = this.Q0;
        boolean z17 = this.S0;
        Navigation navigation4 = this.I;
        return m2Var.a(str6, a13, eVar2, z17, navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_ENTRY_SOURCE") : null);
    }

    public final void m9(String boardSectionId, int i13, String parentBoardId, String boardSectionTitle, String boardName) {
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        Intrinsics.checkNotNullParameter(parentBoardId, "parentBoardId");
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        String quantityString = getResources().getQuantityString(f02.f.moved_pins_to_board_section, i13, boardSectionTitle);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        NavigationImpl z03 = Navigation.z0(m3.c(), boardSectionId);
        z03.m0("com.pinterest.EXTRA_BOARD_ID", parentBoardId);
        i92.k kVar = this.f69720v1;
        if (kVar != null) {
            kVar.c(new lr.j(z03, quantityString, null));
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    public final void n9(String boardId, int i13, String boardName, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        String quantityString = getResources().getQuantityString(f02.f.moved_pins_to_board, i13, boardName);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        g70.h hVar = this.f69722x1;
        if (hVar != null) {
            g70.h.b(hVar, boardId, new r((Object) this, (Object) quantityString, (Object) str, 1));
        } else {
            Intrinsics.r("boardNavigator");
            throw null;
        }
    }

    @Override // ho0.d, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        HeaderCell h93 = h9();
        hk0.m mVar = this.f69706h1;
        if (mVar == null) {
            Intrinsics.r("sourceLocation");
            throw null;
        }
        if (mVar == hk0.m.BOARD || mVar == hk0.m.BOARD_SECTION) {
            h93.a0(f02.g.move_pins);
        } else {
            h93.a0(f02.g.save_pin_to);
            h93.setContentDescription(getResources().getString(f02.g.save_pin_to));
        }
        h93.X(q.ARROW_BACK);
        return onCreateView;
    }

    @Override // ho0.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f69715q1 = null;
        super.onDestroyView();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        int i13 = 0;
        if (this.f69715q1 == null) {
            uk2.f r13 = cb.r("create(...)");
            Context requireContext = requireContext();
            ArrayList arrayList = this.f69707i1;
            g11.a aVar = this.f69721w1;
            if (aVar == null) {
                Intrinsics.r("boardPickerPinalytics");
                throw null;
            }
            uj2.q p73 = p7();
            i2 i2Var = this.f69716r1;
            if (i2Var == null) {
                Intrinsics.r("pinRepository");
                throw null;
            }
            l11.l lVar = new l11.l(requireContext, arrayList, aVar, p73, r13, i2Var);
            this.f69715q1 = lVar;
            c8(lVar);
            c8(new a(this, i13));
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(f02.a.board_picker_padding);
        a8(new com.pinterest.feature.home.view.f(dimensionPixelSize, dimensionPixelSize, 0, 3));
    }
}
