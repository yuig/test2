package l11;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.feature.pin.RepinAnimationData;
import com.pinterest.feature.pin.create.view.CreateBoardCell;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.recyclerview.FastScrollerView;
import df.j1;
import h32.a4;
import h32.d4;
import h32.g0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.f0;
import m60.x0;
import pk.a0;
import rg0.s;
import so.o2;
import so.p2;
import so.q2;
import so.r2;
import so.s2;
import so.t2;
import u50.k0;
import xk2.v;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ll11/j;", "Lyq0/b0;", "", "Lf11/d;", "Lf11/h;", "Ll11/r;", "Landroidx/lifecycle/z;", "<init>", "()V", "bp1/h", "repin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends q<Object> implements f11.d, f11.h, r {
    public static final /* synthetic */ int W1 = 0;
    public lu1.b A0;
    public HeaderCell A1;
    public f0 B0;
    public PinterestRecyclerView B1;
    public jl0.b C0;
    public GestaltText C1;
    public i92.k D0;
    public FrameLayout D1;
    public o2 E0;
    public String E1;
    public p2 F0;
    public GestaltSearchField F1;
    public q2 G0;
    public LinearLayout G1;
    public r2 H0;
    public s2 I0;
    public int I1;
    public t2 J0;
    public boolean J1;
    public z70.m K0;
    public boolean K1;
    public il1.a L0;
    public String L1;
    public wk2.a M0;
    public boolean M1;
    public zf0.f N0;
    public RepinAnimationData N1;
    public s O0;
    public String O1;
    public k11.k P0;
    public String P1;
    public g70.h Q0;
    public boolean Q1;
    public FrameLayout R0;
    public int R1;
    public boolean S0;
    public String T0;
    public FrameLayout U0;
    public View V0;
    public FastScrollerView W0;
    public CreateBoardCell X0;
    public mf.i Y0;
    public eb2.f Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f81422a1;

    /* renamed from: b1, reason: collision with root package name */
    public List f81423b1;

    /* renamed from: c1, reason: collision with root package name */
    public Date f81424c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f81425d1;

    /* renamed from: e1, reason: collision with root package name */
    public String f81426e1;

    /* renamed from: f1, reason: collision with root package name */
    public String f81427f1;

    /* renamed from: h1, reason: collision with root package name */
    public String f81429h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f81430i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f81431j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f81432k1;

    /* renamed from: l1, reason: collision with root package name */
    public String f81433l1;

    /* renamed from: m1, reason: collision with root package name */
    public String f81434m1;

    /* renamed from: n1, reason: collision with root package name */
    public Boolean f81435n1;

    /* renamed from: o1, reason: collision with root package name */
    public String f81436o1;

    /* renamed from: p1, reason: collision with root package name */
    public String f81437p1;

    /* renamed from: q1, reason: collision with root package name */
    public String f81438q1;

    /* renamed from: r1, reason: collision with root package name */
    public boolean f81439r1;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f81440s1;

    /* renamed from: t1, reason: collision with root package name */
    public boolean f81441t1;

    /* renamed from: u1, reason: collision with root package name */
    public f11.c f81442u1;

    /* renamed from: v1, reason: collision with root package name */
    public com.pinterest.feature.search.results.view.j f81443v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f81444w1;

    /* renamed from: x1, reason: collision with root package name */
    public BottomSheetBehavior f81445x1;

    /* renamed from: y1, reason: collision with root package name */
    public i f81446y1;

    /* renamed from: z1, reason: collision with root package name */
    public View f81448z1;

    /* renamed from: z0, reason: collision with root package name */
    public final int f81447z0 = 4;

    /* renamed from: g1, reason: collision with root package name */
    public String f81428g1 = "other";
    public String H1 = "";
    public final v S1 = xk2.m.b(h.f81417j);
    public final f T1 = new f(this);
    public final xk2.k U1 = xk2.m.a(xk2.n.NONE, new g(this, 0));
    public final kj.f V1 = new kj.f(this, 3);

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
        if (this.K1) {
            this.K1 = false;
            dismiss();
        }
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        V6();
        s92.o oVar = s92.o.ABORTED;
        String str = this.f81428g1;
        new gy.a(getK0(), getJ0(), oVar, str).i();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        super.L7();
    }

    @Override // k11.e
    public final String N3(Uri uri, Bitmap bitmap, boolean z13) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String c13 = qb0.b.c(requireContext(), uri, bitmap, null, null, z13);
        Intrinsics.checkNotNullExpressionValue(c13, "decodeImageUri(...)");
        return c13;
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        String str = this.f81434m1;
        if (str != null && !z.j(str) && Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_CREATE_RESULT_CODE")) {
            dismiss();
            return;
        }
        if (V8() && Intrinsics.d(code, "com.pinterest.EXTRA_SIMPLE_BOARD_SECTION_PICKER_RESULT_CODE")) {
            String string = result.getString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_ID");
            String string2 = result.getString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_NAME");
            if (string == null || string2 == null) {
                return;
            }
            Z8(string, string2, result.getString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_SECTION_ID"), result.getString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_IMAGE_URL"));
        }
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(f11.g.TYPE_BOARD.getValue(), new g(this, 1));
        adapter.G(f11.g.TYPE_SUGGESTED_BOARD_NAME.getValue(), new g(this, 2));
        adapter.G(f11.g.TYPE_BOARDLESS_SAVE.getValue(), new g(this, 3));
        adapter.G(f11.g.ADD_TO_COLLAGE.getValue(), new g(this, 4));
    }

    @Override // nl1.d
    public final boolean U7() {
        return true;
    }

    public final z70.m U8() {
        z70.m mVar = this.K0;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("chromeTabHelper");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02f6  */
    @Override // yk1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yk1.m V7() {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l11.j.V7():yk1.m");
    }

    public final boolean V8() {
        Navigation navigation = this.I;
        return Intrinsics.d(navigation != null ? navigation.g2("com.pinterest.EXTRA_BOARD_PICKER_TYPE", "") : null, "com.pinterest.EXTRA_BOARD_PICKER_TYPE_SIMPLE");
    }

    public final void W8() {
        new gy.h(3).i();
        s92.o oVar = s92.o.COMPLETE;
        String str = this.f81428g1;
        new gy.a(getK0(), getJ0(), oVar, str).i();
    }

    @Override // k11.e
    public final String X1() {
        Intent intent;
        FragmentActivity E4 = E4();
        Bundle extras = (E4 == null || (intent = E4.getIntent()) == null) ? null : intent.getExtras();
        if (extras != null) {
            return extras.getString("com.pinterest.EXTRA_PARTNER_ID");
        }
        return null;
    }

    public final void X8() {
        s92.o oVar = s92.o.ERROR;
        String str = this.f81428g1;
        new gy.a(getK0(), getJ0(), oVar, str).i();
    }

    public final void Y8(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.setArguments(bundle);
    }

    public final void Z8(String boardId, String boardName, String str, String str2) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_ID", boardId);
        bundle.putString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_NAME", boardName);
        if (str != null) {
            bundle.putString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_SECTION_ID", str);
        }
        if (str2 != null) {
            bundle.putString("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_IMAGE_URL", str2);
        }
        P6("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_CODE", bundle);
        D5();
    }

    public final void a9(String boardId, String boardName, String str, String str2, boolean z13) {
        d4 d4Var;
        do1.b bVar;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Navigation navigation = this.I;
        if (navigation == null || (d4Var = navigation.getF49944f()) == null) {
            d4Var = d4.UNKNOWN_VIEW;
        }
        Intrinsics.f(d4Var);
        if (U8().e() && U8().d()) {
            b9(boardName);
            return;
        }
        if (!yb2.a.b(((b60.d) getActiveUserManager()).f()) || d4Var == d4.CONVERSATION) {
            if (z13) {
                int i13 = x0.edit;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                bVar = new do1.b(new k0(i13, new ArrayList(0)), new b01.c(6, this, boardId));
            } else {
                bVar = null;
            }
            g70.h hVar = this.Q0;
            if (hVar == null) {
                Intrinsics.r("boardNavigator");
                throw null;
            }
            lr.l lVar = new lr.l(boardId, boardName, str, str2, bVar, hVar);
            i92.k kVar = this.D0;
            if (kVar != null) {
                i92.k.d(kVar, lVar);
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
    }

    public final void b9(String str) {
        String string = str.length() == 0 ? getString(x0.pinned) : getString(f02.g.saved_onto_board, str);
        Intrinsics.f(string);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        kg.o.M(1, requireContext, string);
    }

    @Override // nl1.d
    public final void dismiss() {
        hf0.b.k(requireActivity().getCurrentFocus());
        FragmentActivity E4 = E4();
        Navigation navigation = this.I;
        if (navigation != null && navigation.S("com.pinterest.IS_EDIT", false)) {
            if (this.f81432k1 && this.f81425d1) {
                D5();
                return;
            } else {
                P7();
                return;
            }
        }
        if (U6()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.pinterest.EXTRA_BOARD_PICKER_RESULT_KEY_REPINNED", true);
            P6("com.pinterest.EXTRA_BOARD_PICKER_RESULT_CODE", bundle);
            D5();
            return;
        }
        com.pinterest.framework.screens.a f34938d = E4 instanceof cp1.p ? ((cp1.p) E4).getF34938d() : null;
        if (!(f34938d instanceof qp.b) || ((qp.k) ((qp.b) f34938d)).e8()) {
            P7();
            return;
        }
        if (E4 != null) {
            E4.setResult(-1);
        }
        if (E4 != null) {
            E4.finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.S("com.pinterest.IS_EDIT", false) == true) goto L8;
     */
    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getF103154e0() {
        /*
            r9 = this;
            com.pinterest.navigation.Navigation r0 = r9.I
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r2 = "com.pinterest.IS_EDIT"
            boolean r0 = r0.S(r2, r1)
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L32
            boolean r0 = r9.f81432k1
            if (r0 == 0) goto L1a
            nl1.d.J7()
            return r1
        L1a:
            m60.w r0 = r9.f7()
            jc0.v r8 = new jc0.v
            zp.e0 r3 = new zp.e0
            r2 = 0
            r3.<init>(r2)
            r4 = 1
            r5 = 0
            r7 = 28
            r2 = r8
            r2.<init>(r3, r4, r5, r7)
            r0.d(r8)
        L32:
            nl1.d.J7()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l11.j.getF103154e0():boolean");
    }

    @Override // k11.e
    public final void g0(int i13) {
        i92.k kVar = this.D0;
        if (kVar != null) {
            kVar.i(getString(i13));
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // k11.e
    /* renamed from: g3, reason: from getter */
    public final String getF81427f1() {
        return this.f81427f1;
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final g0 getF68304o1() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("IDEA_STREAM_EXTRAS_KEY_COMPONENT_TYPE") : null;
        if (v03 == null || v03.length() <= 0) {
            return null;
        }
        return g0.valueOf(v03);
    }

    @Override // jl1.a, androidx.fragment.app.Fragment, androidx.lifecycle.z
    public final androidx.lifecycle.s getLifecycle() {
        return super.getLifecycle();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getK0() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("IDEA_STREAM_EXTRAS_KEY_VIEW_PARAMETER_TYPE") : null;
        return (v03 == null || v03.length() <= 0) ? this.f81430i1 ? a4.STORY_PIN_CREATE : a4.PIN_OTHER : a4.valueOf(v03);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getJ0() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_ID") : null;
        if (v03 == null || v03.length() <= 0) {
            Navigation navigation2 = this.I;
            return Intrinsics.d(navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_PIN_CREATE_TYPE") : null, "share_extension_android") ? d4.SHARE_EXTENSION_SELECT_BOARD : d4.PIN_CREATE;
        }
        Navigation navigation3 = this.I;
        return (navigation3 == null || !navigation3.S("com.pinterest.IS_EDIT", false)) ? d4.PIN_CREATE_REPIN : d4.PIN_EDIT;
    }

    @Override // k11.e
    public final void h4(String str, String boardName, String str2, String str3) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        FragmentActivity E4 = E4();
        if (!this.f91282J || E4 == null) {
            return;
        }
        String stringExtra = E4.getIntent().getStringExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE");
        if (stringExtra == null) {
            stringExtra = z1();
        }
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_CREATE_TYPE") : null;
        boolean z13 = Intrinsics.d(v03, "android_shuffles_composer") || Intrinsics.d(stringExtra, "android_shuffles_composer");
        boolean d2 = Intrinsics.d(v03, "com.pinterest.EXTRA_PIN_OR_SPIN");
        boolean d13 = Intrinsics.d(stringExtra, "share_extension_android");
        if (z13 || d2) {
            dismiss();
            return;
        }
        if (E4 instanceof cp1.p) {
            cp1.p pVar = (cp1.p) E4;
            if ((pVar.getF34938d() instanceof qp.b) && !yb2.a.b(((b60.d) getActiveUserManager()).f())) {
                qp.b bVar = (qp.b) pVar.getF34938d();
                int size = bVar != null ? ((qp.k) bVar).f104711t0.size() : 0;
                if (size > 1) {
                    if (U8().d() && U8().e()) {
                        String quantityString = boardName.length() == 0 ? getResources().getQuantityString(f02.f.pinned_multiple, size, Integer.valueOf(size)) : getResources().getQuantityString(f02.f.moved_pins_to_board, size, Integer.valueOf(size), boardName);
                        Intrinsics.f(quantityString);
                        kg.o.M(1, E4, quantityString);
                    } else {
                        g70.h hVar = this.Q0;
                        if (hVar == null) {
                            Intrinsics.r("boardNavigator");
                            throw null;
                        }
                        f7().f(new i92.h(new lr.l(str, boardName, str3, size, (String) null, hVar)));
                    }
                    pVar.setResult(-1);
                    pVar.finish();
                    return;
                }
                if (U8().d() && U8().e()) {
                    String string = boardName.length() == 0 ? requireContext().getString(x0.pinned) : requireContext().getString(f02.g.saved_onto_board, boardName);
                    Intrinsics.f(string);
                    Context requireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    kg.o.M(1, requireContext, string);
                }
                if (bVar != null && ((qp.k) bVar).e8()) {
                    String string2 = boardName.length() == 0 ? getString(x0.pinned) : getString(f02.g.saved_onto_board, j1.Y("<b>%s</b>", new Object[]{boardName}, null, 6));
                    Intrinsics.f(string2);
                    List list = this.f81423b1;
                    PinnableImage pinnableImage = list != null ? (PinnableImage) CollectionsKt.firstOrNull(list) : null;
                    if (pinnableImage != null) {
                        pinnableImage.v(Html.fromHtml(string2));
                        pinnableImage.x(str);
                    }
                    P7();
                    return;
                }
                if (d13) {
                    String string3 = boardName.length() == 0 ? getString(x0.pinned) : getString(f02.g.saved_onto_board, boardName);
                    Intrinsics.f(string3);
                    Context requireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    kg.o.M(0, requireContext2, string3);
                }
            }
        }
        Intent intent = E4.getIntent();
        List list2 = this.f81423b1;
        PinnableImage pinnableImage2 = list2 != null ? (PinnableImage) CollectionsKt.firstOrNull(list2) : null;
        if (pinnableImage2 != null) {
            intent.putExtra("pin_id", pinnableImage2.getUid());
            intent.putExtra("pin_is_video", pinnableImage2.k());
        }
        if (d13) {
            lu1.b bVar2 = this.A0;
            if (bVar2 == null) {
                Intrinsics.r("baseActivityHelper");
                throw null;
            }
            ((lu1.c) bVar2).k(E4, false);
        }
        E4.setResult(-1, intent);
        E4.finish();
    }

    @Override // k11.e
    public final boolean isBound() {
        return this.f91282J;
    }

    @Override // nl1.d
    public final View k7() {
        HeaderCell headerCell = this.A1;
        if (headerCell != null) {
            return headerCell;
        }
        Intrinsics.r("headerView");
        throw null;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(e02.c.fragment_board_picker_bottom_sheet, e02.b.p_recycler_view);
        eVar.b(e02.b.loading_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (E4() != null) {
            requireActivity().getWindow().setSoftInputMode(20);
        }
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(e02.b.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.A1 = (HeaderCell) findViewById;
        View findViewById2 = onCreateView.findViewById(e02.b.board_picker_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.U0 = (FrameLayout) findViewById2;
        View findViewById3 = onCreateView.findViewById(e02.b.bottom_sheet_background);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.V0 = findViewById3;
        View findViewById4 = onCreateView.findViewById(e02.b.fastscroller);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        FastScrollerView fastScrollerView = (FastScrollerView) findViewById4;
        this.W0 = fastScrollerView;
        if (fastScrollerView == null) {
            Intrinsics.r("fastScrollerView");
            throw null;
        }
        fastScrollerView.d(g8());
        this.f81422a1 = getResources().getDimensionPixelOffset(f02.a.lego_create_board_cell_height);
        View findViewById5 = onCreateView.findViewById(e02.b.p_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.B1 = (PinterestRecyclerView) findViewById5;
        View findViewById6 = onCreateView.findViewById(e02.b.board_picker_search_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.F1 = (GestaltSearchField) findViewById6;
        View findViewById7 = onCreateView.findViewById(e02.b.empty_state_footer_text);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.C1 = (GestaltText) findViewById7;
        View findViewById8 = onCreateView.findViewById(f02.c.search_container);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.G1 = (LinearLayout) findViewById8;
        View findViewById9 = onCreateView.findViewById(e02.b.fl_empty_state_footer_text);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.D1 = (FrameLayout) findViewById9;
        if (bundle != null) {
            this.f81423b1 = bundle.getParcelableArrayList("com.pinterest.EXTRA_PINNABLE_IMAGE");
            this.E1 = bundle.getString("com.pinterest.EXTRA_PIN_IMAGE_SIZE");
        }
        this.R0 = (FrameLayout) onCreateView.findViewById(e02.b.tablet_center_container);
        FrameLayout frameLayout = this.U0;
        if (frameLayout == null) {
            Intrinsics.r("rootContainer");
            throw null;
        }
        frameLayout.setOnClickListener(new com.pinterest.feature.home.view.c(this, 17));
        View findViewById10 = onCreateView.findViewById(e02.b.board_picker_bottom_sheet_view);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById10;
        BottomSheetBehavior J2 = BottomSheetBehavior.J(frameLayout2);
        J2.V((hf0.b.f69003c / 2) + this.f81422a1);
        Navigation navigation = this.I;
        if (navigation == null || !navigation.S("com.pinterest.EXTRA_FULL_SCREEN", false)) {
            J2.T(true);
            J2.X(5);
        } else {
            J2.X(3);
        }
        J2.C(this.V1);
        frameLayout2.requestLayout();
        Intrinsics.checkNotNullExpressionValue(J2, "also(...)");
        this.f81445x1 = J2;
        i iVar = new i(this, 1);
        this.f81446y1 = iVar;
        b8(iVar);
        Navigation navigation2 = this.I;
        if (navigation2 != null && navigation2.S("com.pinterest.EXTRA_IS_MOVING_PINS_FROM_CLUSTER", false)) {
            LinearLayout linearLayout = this.G1;
            if (linearLayout == null) {
                Intrinsics.r("searchBarContainer");
                throw null;
            }
            linearLayout.setVisibility(0);
            GestaltSearchField gestaltSearchField = this.F1;
            if (gestaltSearchField == null) {
                Intrinsics.r("searchBarView");
                throw null;
            }
            c0.d.j(gestaltSearchField, d.f81403o);
            gestaltSearchField.g0(new np0.h(this, 29));
            View view = this.V0;
            if (view == null) {
                Intrinsics.r("backgroundOverlay");
                throw null;
            }
            view.setAlpha(1.0f);
            HeaderCell headerCell = this.A1;
            if (headerCell == null) {
                Intrinsics.r("headerView");
                throw null;
            }
            this.I1 = getResources().getDimensionPixelOffset(f02.a.header_view_height);
            headerCell.getLayoutParams().height = this.I1;
        }
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        s92.o oVar = s92.o.ABORTED;
        String str = this.f81428g1;
        new gy.a(getK0(), getJ0(), oVar, str).i();
        ig1.b.W0();
        super.onDestroy();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.Z0 = null;
        i iVar = this.f81446y1;
        if (iVar == null) {
            Intrinsics.r("shadowListener");
            throw null;
        }
        A8(iVar);
        f7().d(new fd1.a());
        hf0.b.l(requireActivity());
        k11.k kVar = this.P0;
        if (kVar == null) {
            Intrinsics.r("repinSessionDataManager");
            throw null;
        }
        kVar.a();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BottomSheetBehavior bottomSheetBehavior = this.f81445x1;
        if (bottomSheetBehavior == null) {
            Intrinsics.r("bottomSheetBehavior");
            throw null;
        }
        if (bottomSheetBehavior.M() == 5) {
            View view = this.V0;
            if (view == null) {
                Intrinsics.r("backgroundOverlay");
                throw null;
            }
            view.post(new vs0.b(this, 16));
        }
        Q7(true);
    }

    @Override // yq0.t, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        List list = this.f81423b1;
        if (list != null) {
            outState.putParcelableArrayList("com.pinterest.EXTRA_PINNABLE_IMAGE", new ArrayList<>(list));
        }
        String str = this.E1;
        if (str != null) {
            outState.putString("com.pinterest.EXTRA_PIN_IMAGE_SIZE", str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ig1.b.W0();
        super.onStop();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Z7(new pi0.b(1));
        Navigation navigation = this.I;
        if (navigation != null) {
            String v03 = navigation.v0("com.pinterest.EXTRA_BOARD_ID");
            String v04 = navigation.v0("com.pinterest.EXTRA_BOARD_NAME");
            if (v03 != null && v04 != null) {
                List list = this.f81423b1;
                PinnableImage pinnableImage = list != null ? (PinnableImage) CollectionsKt.firstOrNull(list) : null;
                if (pinnableImage != null) {
                    pinnableImage.u();
                }
                f11.c cVar = this.f81442u1;
                if (cVar != null) {
                    ((i11.m) cVar).R3(v03, v04);
                }
                requireActivity().finish();
            }
        }
        Navigation navigation2 = this.I;
        if (navigation2 != null && navigation2.S("com.pinterest.EXTRA_IS_ADD_COLLABORATORS_FLOW", false)) {
            string = getResources().getString(e02.e.choose_a_board);
        } else {
            Navigation navigation3 = this.I;
            string = (navigation3 == null || !navigation3.S("com.pinterest.EXTRA_IS_MOVING_PINS_FROM_CLUSTER", false)) ? null : this.R1 > 0 ? getResources().getString(e02.e.board_picker_title_move_pins, Integer.valueOf(this.R1)) : getResources().getString(e02.e.board_picker_title_move);
        }
        if (string != null) {
            HeaderCell headerCell = this.A1;
            if (headerCell == null) {
                Intrinsics.r("headerView");
                throw null;
            }
            headerCell.p(string);
        }
        addRecyclerViewEventListener((pr0.g) this.U1.getValue());
    }

    @Override // k11.e
    public final String s2() {
        Intent intent;
        FragmentActivity E4 = E4();
        Bundle extras = (E4 == null || (intent = E4.getIntent()) == null) ? null : intent.getExtras();
        if (extras != null) {
            return extras.getString("com.pinterest.EXTRA_VIRTUAL_TRY_ON_TAGGED_IDS");
        }
        return null;
    }

    @Override // yq0.t, yk1.n
    public final void setLoadState(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        N8(state == yk1.i.LOADING);
    }

    @Override // k11.e
    public final void w3(String str) {
        i92.k kVar = this.D0;
        if (kVar != null) {
            kVar.i(str);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // k11.e
    public final String z1() {
        Intent intent;
        FragmentActivity E4 = E4();
        Bundle extras = (E4 == null || (intent = E4.getIntent()) == null) ? null : intent.getExtras();
        if (extras != null) {
            return extras.getString("com.pinterest.EXTRA_PIN_CREATE_TYPE");
        }
        return null;
    }
}
