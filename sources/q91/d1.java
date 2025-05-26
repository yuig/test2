package q91;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.d4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kh2.k3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq91/d1;", "Lnl1/d;", "<init>", "()V", "personalInformation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d1 extends f0 {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f103082m0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public PinterestRecyclerView f103084d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltText f103085e0;

    /* renamed from: f0, reason: collision with root package name */
    public FrameLayout f103086f0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f103090j0;

    /* renamed from: k0, reason: collision with root package name */
    public mr1.a f103091k0;

    /* renamed from: l0, reason: collision with root package name */
    public i92.k f103092l0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f103083c0 = d4.SETTINGS;

    /* renamed from: g0, reason: collision with root package name */
    public final ArrayList f103087g0 = new ArrayList();

    /* renamed from: h0, reason: collision with root package name */
    public final ArrayList f103088h0 = new ArrayList();

    /* renamed from: i0, reason: collision with root package name */
    public String f103089i0 = "en-US";

    public static final void Y7(d1 d1Var, Throwable th3) {
        qz.d M;
        d1Var.getClass();
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        v.f1 f1Var = networkResponseError != null ? networkResponseError.f45043a : null;
        if (f1Var == null || f1Var.f123449b != 409 || (M = k3.M(f1Var)) == null || M.f105387g != 117) {
            FragmentActivity E4 = d1Var.E4();
            if (E4 != null) {
                hf0.b.l(E4);
                return;
            }
            return;
        }
        FragmentActivity E42 = d1Var.E4();
        if (E42 != null) {
            hf0.b.l(E42);
            d1Var.f7().d(new yb0.f((u50.i0) new u50.k0(vb2.c.deleted_account_error_title), (u50.i0) new u50.k0(vb2.c.deleted_account_error_detail), new u50.k0(m60.x0.got_it_simple), (u50.i0) null, (yb0.h) new mp0.b(1, d1Var, E42), false));
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        Drawable e03 = bs1.c.e0(this, qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), Integer.valueOf(eo1.b.color_themed_text_default), Integer.valueOf(eo1.c.space_600));
        String string = getString(m60.x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.T(e03, string);
        gestaltToolbarImpl.b0(getString(h52.c.title_default_language));
        gestaltToolbarImpl.E();
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.U(new x61.e(this, 29));
    }

    public final void Z7(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList2.add(str2);
        }
        Map g13 = kotlin.collections.z0.g(new Pair("source_site", "p"), new Pair("surface_tag", "settings"), new Pair("additional_locales_to_add", CollectionsKt.Z(arrayList, ",", null, null, 0, null, null, 62)), new Pair("additional_locales_to_remove", CollectionsKt.Z(arrayList2, ",", null, null, 0, null, null, 62)));
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 != null) {
            A7().j0(f13, g13).i(new g51.h(this, 3), new p91.y(6, new c1(this, 0)));
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getW0() {
        return this.f103083c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = h52.b.fragment_language_selection;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        String h23;
        List<String> split$default;
        Object i03;
        Object i04;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(h52.a.recycler_languages);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f103084d0 = (PinterestRecyclerView) findViewById;
        View findViewById2 = v13.findViewById(h52.a.language_default_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f103085e0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(h52.a.default_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f103086f0 = (FrameLayout) findViewById3;
        Navigation navigation = this.I;
        if (navigation != null && (i04 = navigation.i0("com.pinterest.EXTRA_SETTINGS_LANGUAGE")) != null && (i04 instanceof String)) {
            String str = (String) i04;
            this.f103089i0 = str;
            GestaltText gestaltText = this.f103085e0;
            if (gestaltText == null) {
                Intrinsics.r("languageDefaultTitle");
                throw null;
            }
            pk.a0.p(gestaltText, str);
        }
        Navigation navigation2 = this.I;
        if (navigation2 != null && (i03 = navigation2.i0("com.pinterest.EXTRA_SETTINGS_ADDITIONAL_LANGUAGE")) != null && (i03 instanceof Boolean)) {
            this.f103090j0 = ((Boolean) i03).booleanValue();
        }
        bd1.e.a();
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        ArrayList arrayList = this.f103087g0;
        if (f13 != null && (h23 = f13.h2()) != null) {
            split$default = StringsKt__StringsKt.split$default(h23, new String[]{","}, false, 0, 6, null);
            for (String str2 : split$default) {
                if (!kotlin.text.z.j(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        boolean z13 = this.f103090j0;
        ArrayList arrayList2 = this.f103088h0;
        if (z13) {
            fo1.a i73 = i7();
            if (i73 != null) {
                ((GestaltToolbarImpl) i73).b0(getString(h52.c.additional_language));
            }
            GestaltText gestaltText2 = this.f103085e0;
            if (gestaltText2 == null) {
                Intrinsics.r("languageDefaultTitle");
                throw null;
            }
            pk.a0.w1(gestaltText2);
            FrameLayout frameLayout = this.f103086f0;
            if (frameLayout == null) {
                Intrinsics.r("defaultButton");
                throw null;
            }
            frameLayout.setVisibility(0);
            for (Map.Entry entry : bd1.e.b().entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (!Intrinsics.d(this.f103089i0, str4)) {
                    if (arrayList.contains(str3)) {
                        arrayList2.add(new m91.n(str3, str4, true));
                    } else {
                        arrayList2.add(new m91.n(str3, str4, false));
                    }
                }
            }
            p91.o oVar = new p91.o(arrayList2, this, 0);
            PinterestRecyclerView pinterestRecyclerView = this.f103084d0;
            if (pinterestRecyclerView == null) {
                Intrinsics.r("recyclerLanguages");
                throw null;
            }
            pinterestRecyclerView.j(oVar);
        } else {
            GestaltText gestaltText3 = this.f103085e0;
            if (gestaltText3 == null) {
                Intrinsics.r("languageDefaultTitle");
                throw null;
            }
            pk.a0.k0(gestaltText3);
            FrameLayout frameLayout2 = this.f103086f0;
            if (frameLayout2 == null) {
                Intrinsics.r("defaultButton");
                throw null;
            }
            frameLayout2.setVisibility(8);
            for (Map.Entry entry2 : bd1.e.b().entrySet()) {
                String str5 = (String) entry2.getKey();
                String str6 = (String) entry2.getValue();
                if (Intrinsics.d(str6, this.f103089i0)) {
                    arrayList2.add(new m91.n(str5, str6, true));
                } else {
                    arrayList2.add(new m91.n(str5, str6, false));
                }
            }
            p91.o oVar2 = new p91.o(arrayList2, this, 1);
            PinterestRecyclerView pinterestRecyclerView2 = this.f103084d0;
            if (pinterestRecyclerView2 == null) {
                Intrinsics.r("recyclerLanguages");
                throw null;
            }
            pinterestRecyclerView2.j(oVar2);
        }
        if (arrayList2.size() > 1) {
            kotlin.collections.j0.t(arrayList2, new sw0.u(7));
        }
    }
}
