package mv0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.c0;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kg0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import zp.e0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmv0/y;", "Lyq0/b0;", "Lyq0/a0;", "Ljv0/j;", "Ljv0/p;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class y extends f<yq0.a0> implements jv0.j, jv0.p {
    public static final /* synthetic */ int U0 = 0;
    public dv0.q A0;
    public kv0.p B0;
    public bh.b C0;
    public i92.k D0;
    public ag1.b E0;
    public jv0.o F0;
    public RoundedCornersLayout G0;
    public WebImageView H0;
    public GestaltText I0;
    public FrameLayout J0;
    public PinterestRecyclerView K0;
    public GestaltIconButton L0;
    public GestaltIconButtonFloating M0;
    public GestaltText N0;
    public GestaltButton O0;
    public View P0;
    public final d4 Q0;
    public final a4 R0;
    public AnimatorSet S0;
    public AnimatorSet T0;

    /* renamed from: z0, reason: collision with root package name */
    public so.c f88417z0;

    public y() {
        this.E = aq1.f.fragment_idea_pin_creation_tag_products;
        this.Q0 = d4.STORY_PIN_METADATA;
        this.R0 = a4.STORY_PIN_PRODUCT_TAGS_LIST;
    }

    public static AnimatorSet V8(TextView textView, boolean z13) {
        AnimatorSet A = kg.a.A(textView.getAlpha(), z13 ? 1.0f : 0.0f, 300L, textView);
        A.setStartDelay(z13 ? 300L : 0L);
        A.start();
        return A;
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_ADDED_PRODUCTS")) {
            String string = result.getString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID");
            if (string == null) {
                string = "";
            }
            jv0.o oVar = this.F0;
            if (oVar != null) {
                oVar.a(new jv0.l(string));
            } else {
                Intrinsics.r("actionListener");
                throw null;
            }
        }
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new w(this, 0));
    }

    public final void U8() {
        com.pinterest.framework.screens.s sVar = this.f91293r;
        List i13 = sVar != null ? sVar.i() : null;
        if (i13 == null) {
            i13 = q0.f80391a;
        }
        List list = i13;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(((ScreenDescription) it.next()).getScreenClass(), IdeaPinCreationLocation.STORY_PIN_CREATION_METADATA_LIST.getF35454a())) {
                    z(g.f88358u);
                    return;
                }
            }
        }
        Navigation navigation = this.I;
        if (!Intrinsics.d(navigation != null ? Boolean.valueOf(navigation.S("com.pinterest.EXTRA_IS_FROM_PIN_EDIT_FLOW", false)) : null, Boolean.TRUE)) {
            D5();
        } else {
            Y6(g.f88359v);
            f7().d(new jc0.v(new e0(null), true, 0L, 28));
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        aq.j h10;
        String str;
        Navigation navigation = this.I;
        if ((navigation != null ? navigation.v0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_PIN_ID_TO_EDIT") : null) != null) {
            Navigation navigation2 = this.I;
            f30 c13 = ew.c(navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_PIN_ID_TO_EDIT") : null);
            if (c13 != null) {
                bh.b bVar = this.C0;
                if (bVar == null) {
                    Intrinsics.r("editablePinWrapperProvider");
                    throw null;
                }
                h10 = bVar.g(c13, z7());
            }
            h10 = null;
        } else {
            Navigation navigation3 = this.I;
            if ((navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_SCHEDULED_PIN_ID_TO_EDIT") : null) != null) {
                Navigation navigation4 = this.I;
                kg0 d2 = ew.d(navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_SCHEDULED_PIN_ID_TO_EDIT") : null);
                if (d2 != null) {
                    bh.b bVar2 = this.C0;
                    if (bVar2 == null) {
                        Intrinsics.r("editablePinWrapperProvider");
                        throw null;
                    }
                    h10 = bVar2.h(d2);
                }
            }
            h10 = null;
        }
        dv0.q qVar = this.A0;
        if (qVar == null) {
            Intrinsics.r("ideaPinProductTagItemsProviderFactory");
            throw null;
        }
        jv0.i b13 = qVar.b(h10);
        kv0.p pVar = this.B0;
        if (pVar == null) {
            Intrinsics.r("ideaPinProductTagViewListenerFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        f0 b73 = b7();
        Navigation navigation5 = this.I;
        n70.o oVar = new n70.o(b73, ew.c(navigation5 != null ? navigation5.v0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_PIN_ID_TO_EDIT") : null));
        Navigation navigation6 = this.I;
        this.F0 = pVar.f(requireContext, this, oVar, b13, navigation6 != null ? navigation6.v0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_ADDED_PRODUCTS") : null, h10);
        so.c cVar = this.f88417z0;
        if (cVar == null) {
            Intrinsics.r("ideaPinProductTagsPresenterFactory");
            throw null;
        }
        f0 b74 = b7();
        Navigation navigation7 = this.I;
        n70.o oVar2 = new n70.o(b74, ew.c(navigation7 != null ? navigation7.v0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_PIN_ID_TO_EDIT") : null));
        jv0.o oVar3 = this.F0;
        if (oVar3 == null) {
            Intrinsics.r("actionListener");
            throw null;
        }
        Navigation navigation8 = this.I;
        if ((navigation8 != null ? navigation8.v0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_PIN_ID_TO_EDIT") : null) == null) {
            ag1.b bVar3 = this.E0;
            if (bVar3 == null) {
                Intrinsics.r("dataManager");
                throw null;
            }
            str = bVar3.d();
        } else {
            str = null;
        }
        return cVar.a(oVar2, b13, oVar3, str, h10 != null ? h10.y() : null);
    }

    public final void W8(boolean z13) {
        GestaltIconButton gestaltIconButton = this.L0;
        if (gestaltIconButton != null) {
            gestaltIconButton.t(new dv0.n(z13, 4));
        } else {
            Intrinsics.r("backButton");
            throw null;
        }
    }

    public final void X8(boolean z13) {
        GestaltButton gestaltButton = this.O0;
        if (gestaltButton != null) {
            gestaltButton.d(new dv0.n(z13, 5));
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    public final void Y8(Uri uri) {
        if (uri != null) {
            WebImageView webImageView = this.H0;
            if (webImageView == null) {
                Intrinsics.r("pagePreview");
                throw null;
            }
            webImageView.Y(new x(this));
            WebImageView webImageView2 = this.H0;
            if (webImageView2 != null) {
                webImageView2.w2(uri);
            } else {
                Intrinsics.r("pagePreview");
                throw null;
            }
        }
    }

    public final void Z8(String str) {
        GestaltText gestaltText = this.I0;
        if (gestaltText == null) {
            Intrinsics.r("pagePreviewLabel");
            throw null;
        }
        pk.a0.p(gestaltText, str == null ? "" : str);
        FrameLayout frameLayout = this.J0;
        if (frameLayout != null) {
            frameLayout.setVisibility(str != null ? 0 : 8);
        } else {
            Intrinsics.r("pagePreviewLabelBackground");
            throw null;
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        Navigation navigation = this.I;
        if (Intrinsics.d(navigation != null ? Boolean.valueOf(navigation.S("com.pinterest.EXTRA_IS_FROM_PIN_EDIT_FLOW", false)) : null, Boolean.TRUE)) {
            f7().d(new jc0.v(new e0(null), true, 0L, 28));
        }
        nl1.d.J7();
        return false;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF112299o0() {
        return this.R0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF112298n0() {
        return this.Q0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(this.E, aq1.d.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateView.findViewById(aq1.d.header), "findViewById(...)");
        View findViewById = onCreateView.findViewById(aq1.d.cover_image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.G0 = (RoundedCornersLayout) findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.cover_page_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.H0 = (WebImageView) findViewById2;
        View findViewById3 = onCreateView.findViewById(aq1.d.idea_pin_page_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.I0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.idea_pin_page_label_background);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.J0 = (FrameLayout) findViewById4;
        View findViewById5 = onCreateView.findViewById(aq1.d.recycler_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.P0 = findViewById5;
        View findViewById6 = onCreateView.findViewById(aq1.d.p_recycler_view);
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById6;
        final int i13 = 1;
        pinterestRecyclerView.a(new yh0.a(pinterestRecyclerView, 1));
        b8(new c0(this, 14));
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.K0 = pinterestRecyclerView;
        View findViewById7 = onCreateView.findViewById(aq1.d.add_hint);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.N0 = (GestaltText) findViewById7;
        View findViewById8 = onCreateView.findViewById(aq1.d.back_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById8;
        final int i14 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: mv0.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f88413b;

            {
                this.f88413b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                y this$0 = this.f88413b;
                switch (i15) {
                    case 0:
                        int i16 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            jv0.o oVar = this$0.F0;
                            if (oVar != null) {
                                oVar.a(jv0.k.f77635b);
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i17 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        jv0.o oVar2 = this$0.F0;
                        if (oVar2 != null) {
                            oVar2.a(jv0.k.f77634a);
                            return;
                        } else {
                            Intrinsics.r("actionListener");
                            throw null;
                        }
                    default:
                        int i18 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        jv0.o oVar3 = this$0.F0;
                        if (oVar3 != null) {
                            oVar3.a(jv0.k.f77636c);
                            return;
                        } else {
                            Intrinsics.r("actionListener");
                            throw null;
                        }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        this.L0 = gestaltIconButton;
        View findViewById9 = onCreateView.findViewById(aq1.d.add_button);
        GestaltIconButtonFloating gestaltIconButtonFloating = (GestaltIconButtonFloating) findViewById9;
        gestaltIconButtonFloating.c(new gm1.a(this) { // from class: mv0.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f88413b;

            {
                this.f88413b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                y this$0 = this.f88413b;
                switch (i15) {
                    case 0:
                        int i16 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            jv0.o oVar = this$0.F0;
                            if (oVar != null) {
                                oVar.a(jv0.k.f77635b);
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i17 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        jv0.o oVar2 = this$0.F0;
                        if (oVar2 != null) {
                            oVar2.a(jv0.k.f77634a);
                            return;
                        } else {
                            Intrinsics.r("actionListener");
                            throw null;
                        }
                    default:
                        int i18 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        jv0.o oVar3 = this$0.F0;
                        if (oVar3 != null) {
                            oVar3.a(jv0.k.f77636c);
                            return;
                        } else {
                            Intrinsics.r("actionListener");
                            throw null;
                        }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        this.M0 = gestaltIconButtonFloating;
        View findViewById10 = onCreateView.findViewById(aq1.d.done_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById10;
        gestaltButton.d(g.f88360w);
        final int i15 = 2;
        gestaltButton.e(new gm1.a(this) { // from class: mv0.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f88413b;

            {
                this.f88413b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                y this$0 = this.f88413b;
                switch (i152) {
                    case 0:
                        int i16 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            jv0.o oVar = this$0.F0;
                            if (oVar != null) {
                                oVar.a(jv0.k.f77635b);
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i17 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        jv0.o oVar2 = this$0.F0;
                        if (oVar2 != null) {
                            oVar2.a(jv0.k.f77634a);
                            return;
                        } else {
                            Intrinsics.r("actionListener");
                            throw null;
                        }
                    default:
                        int i18 = y.U0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        jv0.o oVar3 = this$0.F0;
                        if (oVar3 != null) {
                            oVar3.a(jv0.k.f77636c);
                            return;
                        } else {
                            Intrinsics.r("actionListener");
                            throw null;
                        }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById10, "apply(...)");
        this.O0 = gestaltButton;
        return onCreateView;
    }
}
