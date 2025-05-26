package nu0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.pinterest.feature.ideaPinCreation.drafts.view.StorageStateView;
import com.pinterest.feature.video.view.IdeaPinVideoExportLoadingView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import nx.f0;
import pk.a0;
import so.b8;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnu0/i;", "Lyq0/b0;", "", "Liu0/a;", "Liu0/e;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends a<Object> implements iu0.a, iu0.e {
    public static final /* synthetic */ int M0 = 0;
    public b8 A0;
    public i92.k B0;
    public ag1.h C0;
    public mu0.j D0;
    public StorageStateView E0;
    public GestaltText F0;
    public GestaltText G0;
    public GestaltIconButton H0;
    public GestaltIconButton I0;
    public IdeaPinVideoExportLoadingView J0;
    public GestaltText K0;
    public final d4 L0;

    /* renamed from: z0, reason: collision with root package name */
    public de0.d f92330z0;

    public i() {
        this.E = aq1.f.fragment_idea_pin_drafts;
        this.L0 = d4.STORY_PIN_MULTI_DRAFTS;
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(0, new xo0.i(requireContext, 7));
    }

    public final NavigationImpl U8(ScreenLocation screenLocation, int i13) {
        NavigationImpl L = Navigation.L(screenLocation, "", i13);
        Navigation navigation = this.I;
        L.z(navigation != null ? navigation.J1("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS") : -1, "com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS");
        Navigation navigation2 = this.I;
        Boolean valueOf = navigation2 != null ? Boolean.valueOf(navigation2.S("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", false)) : null;
        if (valueOf != null) {
            L.Y1("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", valueOf.booleanValue());
        }
        Navigation navigation3 = this.I;
        L.m0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null);
        L.Y1("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", true);
        Navigation navigation4 = this.I;
        L.z(navigation4 != null ? navigation4.J1("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS") : 0, "com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS");
        Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
        return L;
    }

    @Override // yk1.k
    public final m V7() {
        b8 b8Var = this.A0;
        if (b8Var == null) {
            Intrinsics.r("ideaPinDraftsPresenterFactory");
            throw null;
        }
        f0 b73 = b7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        de0.d dVar = this.f92330z0;
        if (dVar == null) {
            Intrinsics.r("draftDataProvider");
            throw null;
        }
        ag1.h hVar = this.C0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        String c13 = hVar.a().c();
        Navigation navigation = this.I;
        lu0.a aVar = new lu0.a(b73, requireContext, dVar, c13, navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null);
        wf1.b.Companion.getClass();
        mu0.j a13 = b8Var.a(aVar, this, wf1.a.a());
        this.D0 = a13;
        return a13;
    }

    public final void V8(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        lu1.d a73 = a7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intent b13 = a73.b(requireContext, lu1.a.MAIN_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_PENDING_TASK", navigation);
        b13.putExtra("com.pinterest.EXTRA_SKIP_HOME_SCREEN", true);
        b13.putExtra("com.pinterest.EXTRA_NO_BOTTOM_NAV_INFLATION", true);
        requireContext().startActivity(b13);
    }

    public final void W8(boolean z13) {
        IdeaPinVideoExportLoadingView ideaPinVideoExportLoadingView = this.J0;
        if (ideaPinVideoExportLoadingView != null) {
            bs1.c.R1(ideaPinVideoExportLoadingView, z13);
        } else {
            Intrinsics.r("videoExportLoadingView");
            throw null;
        }
    }

    public final void X8(int i13, int i14) {
        GestaltText gestaltText = this.F0;
        if (gestaltText == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        String string = getString(i13 == 1 ? aq1.h.idea_pin_drafts_title_singular : i13 > 1 ? aq1.h.idea_pin_drafts_title : aq1.h.idea_pin_drafts_title_empty, Integer.valueOf(i13));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(gestaltText, string);
        if (i14 != 0) {
            GestaltText gestaltText2 = this.F0;
            if (gestaltText2 == null) {
                Intrinsics.r("titleView");
                throw null;
            }
            SpannableString spannableString = new SpannableString(a.a.D(a0.R(gestaltText2), " ", getString(aq1.h.idea_pin_drafts_title_expiring, Integer.valueOf(i14))));
            GestaltText gestaltText3 = this.F0;
            if (gestaltText3 == null) {
                Intrinsics.r("titleView");
                throw null;
            }
            int length = a0.R(gestaltText3).length();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            spannableString.setSpan(new ForegroundColorSpan(dl2.b.x0(requireContext, vn1.c.ERROR.getColorRes())), length + 2, spannableString.length(), 33);
            GestaltText gestaltText4 = this.F0;
            if (gestaltText4 == null) {
                Intrinsics.r("titleView");
                throw null;
            }
            a0.q(gestaltText4, bs1.c.h2(spannableString));
        }
        GestaltText gestaltText5 = this.G0;
        if (gestaltText5 == null) {
            Intrinsics.r("subtitleView");
            throw null;
        }
        a0.o(gestaltText5, i13 > 0 ? aq1.h.idea_pin_drafts_populated_state_subtitle : aq1.h.idea_pin_drafts_empty_state_subtitle, new Object[0]);
        GestaltText gestaltText6 = this.G0;
        if (gestaltText6 != null) {
            a0.w1(gestaltText6);
        } else {
            Intrinsics.r("subtitleView");
            throw null;
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getY0() {
        return this.L0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(this.E, aq1.d.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        final int i13 = 2;
        J8(new StaggeredGridLayoutManager(2));
        View findViewById = onCreateView.findViewById(aq1.d.storage_state_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.E0 = (StorageStateView) findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.F0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(t0.idea_pin_drafts_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.G0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.menu_bar_dismiss_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.H0 = (GestaltIconButton) findViewById4;
        View findViewById5 = onCreateView.findViewById(aq1.d.menu_bar_help_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.I0 = (GestaltIconButton) findViewById5;
        View findViewById6 = onCreateView.findViewById(aq1.d.video_export_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.J0 = (IdeaPinVideoExportLoadingView) findViewById6;
        View findViewById7 = onCreateView.findViewById(t0.story_pin_user_feedback_prompt_right_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.K0 = (GestaltText) findViewById7;
        View findViewById8 = onCreateView.findViewById(aq1.d.delete_all_drafts_button);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltIconButton gestaltIconButton = this.H0;
        if (gestaltIconButton == null) {
            Intrinsics.r("dismissButton");
            throw null;
        }
        final int i14 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: nu0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f92328b;

            {
                this.f92328b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                i this$0 = this.f92328b;
                switch (i15) {
                    case 0:
                        int i16 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mu0.j jVar = this$0.D0;
                            if (jVar != null) {
                                jVar.v3(iu0.b.f73686b);
                                return;
                            } else {
                                Intrinsics.r("listener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i17 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mu0.j jVar2 = this$0.D0;
                            if (jVar2 != null) {
                                jVar2.v3(iu0.c.f73687b);
                                return;
                            } else {
                                Intrinsics.r("listener");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i18 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        mu0.j jVar3 = this$0.D0;
                        if (jVar3 != null) {
                            jVar3.v3(iu0.d.f73688b);
                            return;
                        } else {
                            Intrinsics.r("listener");
                            throw null;
                        }
                }
            }
        });
        GestaltIconButton gestaltIconButton2 = this.I0;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("helpButton");
            throw null;
        }
        final int i15 = 1;
        gestaltIconButton2.u(new gm1.a(this) { // from class: nu0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f92328b;

            {
                this.f92328b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                i this$0 = this.f92328b;
                switch (i152) {
                    case 0:
                        int i16 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mu0.j jVar = this$0.D0;
                            if (jVar != null) {
                                jVar.v3(iu0.b.f73686b);
                                return;
                            } else {
                                Intrinsics.r("listener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i17 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mu0.j jVar2 = this$0.D0;
                            if (jVar2 != null) {
                                jVar2.v3(iu0.c.f73687b);
                                return;
                            } else {
                                Intrinsics.r("listener");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i18 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        mu0.j jVar3 = this$0.D0;
                        if (jVar3 != null) {
                            jVar3.v3(iu0.d.f73688b);
                            return;
                        } else {
                            Intrinsics.r("listener");
                            throw null;
                        }
                }
            }
        });
        GestaltText gestaltText = this.K0;
        if (gestaltText == null) {
            Intrinsics.r("userFeedbackLink");
            throw null;
        }
        Spanned fromHtml = Html.fromHtml("<b>" + ((Object) gestaltText.getText()) + "</b>");
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        a0.q(gestaltText, bs1.c.p2(fromHtml));
        gestaltText.j(new gm1.a(this) { // from class: nu0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f92328b;

            {
                this.f92328b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i13;
                i this$0 = this.f92328b;
                switch (i152) {
                    case 0:
                        int i16 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mu0.j jVar = this$0.D0;
                            if (jVar != null) {
                                jVar.v3(iu0.b.f73686b);
                                return;
                            } else {
                                Intrinsics.r("listener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i17 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mu0.j jVar2 = this$0.D0;
                            if (jVar2 != null) {
                                jVar2.v3(iu0.c.f73687b);
                                return;
                            } else {
                                Intrinsics.r("listener");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i18 = i.M0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        mu0.j jVar3 = this$0.D0;
                        if (jVar3 != null) {
                            jVar3.v3(iu0.d.f73688b);
                            return;
                        } else {
                            Intrinsics.r("listener");
                            throw null;
                        }
                }
            }
        });
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }
}
