package zu0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RowsWithVariableColumnsLayoutManager;
import androidx.recyclerview.widget.v0;
import cn1.q;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import i92.k;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.e0;
import nx.f0;
import om1.l;
import so.i8;
import yb0.n;
import yk1.m;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzu0/g;", "Lyq0/b0;", "Lyq0/a0;", "Lvu0/a;", "<init>", "()V", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends a<a0> implements vu0.a {
    public static final /* synthetic */ int T0 = 0;
    public m20.b A0;
    public k B0;
    public ag1.h C0;
    public GestaltIconButton D0;
    public GestaltButton E0;
    public GestaltSearchField F0;
    public GestaltText G0;
    public HorizontalScrollView H0;
    public LinearLayout I0;
    public GestaltText J0;
    public GestaltText K0;
    public xu0.b L0;
    public xu0.b M0;
    public xu0.b N0;
    public xu0.b O0;
    public xu0.b P0;
    public String Q0 = "";
    public final d4 R0 = d4.PIN_INTEREST_TAGGING;
    public final a4 S0 = a4.STORY_PIN_CREATE;

    /* renamed from: z0, reason: collision with root package name */
    public i8 f142827z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new au0.a(this, 6));
    }

    public final void U8() {
        GestaltSearchField gestaltSearchField = this.F0;
        if (gestaltSearchField == null) {
            Intrinsics.r("searchEditText");
            throw null;
        }
        hf0.b.k(gestaltSearchField);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        n nVar = new n(requireContext);
        String string = nVar.getResources().getString(aq1.h.story_pin_metadata_leave_page_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.w(string);
        nVar.u(nVar.getResources().getString(aq1.h.story_pin_metadata_leave_page_subtitle));
        String string2 = nVar.getResources().getString(aq1.h.story_pin_metadata_leave_page_confirm);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        nVar.q(string2);
        String string3 = nVar.getResources().getString(aq1.h.story_pin_metadata_leave_page_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        nVar.m(string3);
        final int i13 = 0;
        nVar.p(new View.OnClickListener(this) { // from class: zu0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142820b;

            {
                this.f142820b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xu0.b bVar;
                int i14 = i13;
                g this$0 = this.f142820b;
                switch (i14) {
                    case 0:
                        int i15 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                        this$0.D5();
                        Navigation navigation = this$0.I;
                        if (navigation != null && navigation.S("com.pinterest.EXTRA_IS_EDITABLE_PIN", false) && (bVar = this$0.O0) != null) {
                            bVar.v3();
                            break;
                        }
                        break;
                    default:
                        int i16 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f7().d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                        xu0.b bVar2 = this$0.N0;
                        if (bVar2 != null) {
                            bVar2.u3();
                        }
                        this$0.D5();
                        break;
                }
            }
        });
        final int i14 = 1;
        nVar.l(new View.OnClickListener(this) { // from class: zu0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142820b;

            {
                this.f142820b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xu0.b bVar;
                int i142 = i14;
                g this$0 = this.f142820b;
                switch (i142) {
                    case 0:
                        int i15 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                        this$0.D5();
                        Navigation navigation = this$0.I;
                        if (navigation != null && navigation.S("com.pinterest.EXTRA_IS_EDITABLE_PIN", false) && (bVar = this$0.O0) != null) {
                            bVar.v3();
                            break;
                        }
                        break;
                    default:
                        int i16 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f7().d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                        xu0.b bVar2 = this$0.N0;
                        if (bVar2 != null) {
                            bVar2.u3();
                        }
                        this$0.D5();
                        break;
                }
            }
        });
        cb.x(nVar, f7());
    }

    @Override // yk1.k
    public final m V7() {
        i8 i8Var = this.f142827z0;
        if (i8Var == null) {
            Intrinsics.r("pinInterestTaggingPagePresenterFactory");
            throw null;
        }
        f0 b73 = b7();
        ag1.h hVar = this.C0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
        Navigation navigation2 = this.I;
        du0.b bVar = new du0.b(b73, hVar, this.R0, v03, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false);
        m20.b bVar2 = this.A0;
        if (bVar2 == null) {
            Intrinsics.r("interestTaggingService");
            throw null;
        }
        String b13 = e0.b();
        if (Intrinsics.d(b13, "zh")) {
            String locale = Locale.getDefault().toString();
            Intrinsics.checkNotNullExpressionValue(locale, "toString(...)");
            String lowerCase = locale.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            b13 = kotlin.text.z.n(lowerCase, "_", "-");
        }
        Navigation navigation3 = this.I;
        String v04 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_INTEREST_IDS") : null;
        if (v04 == null) {
            v04 = "";
        }
        Navigation navigation4 = this.I;
        String v05 = navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_INTEREST_LABELS") : null;
        if (v05 == null) {
            v05 = "";
        }
        Navigation navigation5 = this.I;
        String v06 = navigation5 != null ? navigation5.v0("com.pinterest.EXTRA_FREEFORM_TAGS") : null;
        String str = v06 == null ? "" : v06;
        Navigation navigation6 = this.I;
        return i8Var.a(bVar, bVar2, b13, v04, v05, str, navigation6 != null ? navigation6.S("com.pinterest.EXTRA_IS_EDITABLE_PIN", false) : false);
    }

    public final void V8(boolean z13) {
        GestaltText gestaltText = this.G0;
        if (gestaltText != null) {
            gestaltText.i(new rn0.d(z13, 27));
        } else {
            Intrinsics.r("promptText");
            throw null;
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        xu0.b bVar = this.P0;
        if (bVar == null || !bVar.z3()) {
            nl1.d.J7();
            return false;
        }
        U8();
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF119340x0() {
        return this.S0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140085y0() {
        return this.R0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(aq1.f.pin_interest_tagging, aq1.d.p_recycler_view);
    }

    @Override // yq0.t
    public final v0 n8() {
        return new v0(new RowsWithVariableColumnsLayoutManager(new cp.b(this, 20)));
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.back_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.D0 = (GestaltIconButton) findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.next_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.E0 = (GestaltButton) findViewById2;
        View findViewById3 = onCreateView.findViewById(aq1.d.search_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.F0 = (GestaltSearchField) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.tag_prompt);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.G0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(aq1.d.selected_tags_scroll_view);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.H0 = (HorizontalScrollView) findViewById5;
        View findViewById6 = onCreateView.findViewById(aq1.d.selected_tags);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.I0 = (LinearLayout) findViewById6;
        View findViewById7 = onCreateView.findViewById(aq1.d.selected_header);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.J0 = (GestaltText) findViewById7;
        View findViewById8 = onCreateView.findViewById(aq1.d.interest_tagging_query_length_reached);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.K0 = (GestaltText) findViewById8;
        GestaltIconButton gestaltIconButton = this.D0;
        if (gestaltIconButton == null) {
            Intrinsics.r("backButton");
            throw null;
        }
        final int i13 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: zu0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142818b;

            {
                this.f142818b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xu0.b bVar;
                xu0.b bVar2;
                int i14 = i13;
                g this$0 = this.f142818b;
                switch (i14) {
                    case 0:
                        int i15 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!(it instanceof l) || (bVar = this$0.P0) == null) {
                            return;
                        }
                        if (bVar.z3()) {
                            this$0.U8();
                            return;
                        } else {
                            this$0.D5();
                            return;
                        }
                    case 1:
                        int i16 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        hf0.b.l(this$0.requireActivity());
                        Navigation navigation = this$0.I;
                        if (navigation != null && navigation.S("com.pinterest.EXTRA_IS_EDITABLE_PIN", false) && (bVar2 = this$0.O0) != null) {
                            bVar2.v3();
                        }
                        this$0.D5();
                        return;
                    default:
                        int i17 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof q) {
                            String query = ((q) it).f28232c;
                            if (query == null) {
                                query = "";
                            }
                            GestaltText gestaltText = this$0.K0;
                            if (gestaltText == null) {
                                Intrinsics.r("queryLengthLimitText");
                                throw null;
                            }
                            gestaltText.i(new r0(6, query, this$0));
                            if (Intrinsics.d(query, this$0.Q0)) {
                                return;
                            }
                            if (Intrinsics.d(this$0.Q0, "")) {
                                this$0.s7().N(f1.START_TYPING, u0.PIN_INTEREST_TAG_SEARCH_BOX, null, null, false);
                            }
                            xu0.b bVar3 = this$0.L0;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(query, "query");
                                if (query.length() == 0 && bVar3.f135936i.isEmpty()) {
                                    ((g) ((vu0.a) bVar3.getView())).V8(true);
                                }
                                uk2.d dVar = bVar3.f135940m;
                                if (dVar != null) {
                                    dVar.c(query);
                                }
                                bVar3.f135939l = query;
                            }
                            this$0.Q0 = query;
                            return;
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton = this.E0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        gestaltButton.d(b.f142813k);
        final int i14 = 1;
        gestaltButton.e(new gm1.a(this) { // from class: zu0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142818b;

            {
                this.f142818b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xu0.b bVar;
                xu0.b bVar2;
                int i142 = i14;
                g this$0 = this.f142818b;
                switch (i142) {
                    case 0:
                        int i15 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!(it instanceof l) || (bVar = this$0.P0) == null) {
                            return;
                        }
                        if (bVar.z3()) {
                            this$0.U8();
                            return;
                        } else {
                            this$0.D5();
                            return;
                        }
                    case 1:
                        int i16 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        hf0.b.l(this$0.requireActivity());
                        Navigation navigation = this$0.I;
                        if (navigation != null && navigation.S("com.pinterest.EXTRA_IS_EDITABLE_PIN", false) && (bVar2 = this$0.O0) != null) {
                            bVar2.v3();
                        }
                        this$0.D5();
                        return;
                    default:
                        int i17 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof q) {
                            String query = ((q) it).f28232c;
                            if (query == null) {
                                query = "";
                            }
                            GestaltText gestaltText = this$0.K0;
                            if (gestaltText == null) {
                                Intrinsics.r("queryLengthLimitText");
                                throw null;
                            }
                            gestaltText.i(new r0(6, query, this$0));
                            if (Intrinsics.d(query, this$0.Q0)) {
                                return;
                            }
                            if (Intrinsics.d(this$0.Q0, "")) {
                                this$0.s7().N(f1.START_TYPING, u0.PIN_INTEREST_TAG_SEARCH_BOX, null, null, false);
                            }
                            xu0.b bVar3 = this$0.L0;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(query, "query");
                                if (query.length() == 0 && bVar3.f135936i.isEmpty()) {
                                    ((g) ((vu0.a) bVar3.getView())).V8(true);
                                }
                                uk2.d dVar = bVar3.f135940m;
                                if (dVar != null) {
                                    dVar.c(query);
                                }
                                bVar3.f135939l = query;
                            }
                            this$0.Q0 = query;
                            return;
                        }
                        return;
                }
            }
        });
        GestaltSearchField gestaltSearchField = this.F0;
        if (gestaltSearchField == null) {
            Intrinsics.r("searchEditText");
            throw null;
        }
        final int i15 = 2;
        gestaltSearchField.g0(new gm1.a(this) { // from class: zu0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f142818b;

            {
                this.f142818b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xu0.b bVar;
                xu0.b bVar2;
                int i142 = i15;
                g this$0 = this.f142818b;
                switch (i142) {
                    case 0:
                        int i152 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!(it instanceof l) || (bVar = this$0.P0) == null) {
                            return;
                        }
                        if (bVar.z3()) {
                            this$0.U8();
                            return;
                        } else {
                            this$0.D5();
                            return;
                        }
                    case 1:
                        int i16 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        hf0.b.l(this$0.requireActivity());
                        Navigation navigation = this$0.I;
                        if (navigation != null && navigation.S("com.pinterest.EXTRA_IS_EDITABLE_PIN", false) && (bVar2 = this$0.O0) != null) {
                            bVar2.v3();
                        }
                        this$0.D5();
                        return;
                    default:
                        int i17 = g.T0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof q) {
                            String query = ((q) it).f28232c;
                            if (query == null) {
                                query = "";
                            }
                            GestaltText gestaltText = this$0.K0;
                            if (gestaltText == null) {
                                Intrinsics.r("queryLengthLimitText");
                                throw null;
                            }
                            gestaltText.i(new r0(6, query, this$0));
                            if (Intrinsics.d(query, this$0.Q0)) {
                                return;
                            }
                            if (Intrinsics.d(this$0.Q0, "")) {
                                this$0.s7().N(f1.START_TYPING, u0.PIN_INTEREST_TAG_SEARCH_BOX, null, null, false);
                            }
                            xu0.b bVar3 = this$0.L0;
                            if (bVar3 != null) {
                                Intrinsics.checkNotNullParameter(query, "query");
                                if (query.length() == 0 && bVar3.f135936i.isEmpty()) {
                                    ((g) ((vu0.a) bVar3.getView())).V8(true);
                                }
                                uk2.d dVar = bVar3.f135940m;
                                if (dVar != null) {
                                    dVar.c(query);
                                }
                                bVar3.f135939l = query;
                            }
                            this$0.Q0 = query;
                            return;
                        }
                        return;
                }
            }
        });
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        GestaltSearchField gestaltSearchField = this.F0;
        if (gestaltSearchField == null) {
            Intrinsics.r("searchEditText");
            throw null;
        }
        hf0.b.k(gestaltSearchField);
        super.onPause();
    }
}
