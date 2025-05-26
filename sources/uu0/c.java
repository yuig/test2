package uu0;

import a7.t0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.LegacyPlayerView;
import aq1.f;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import g70.h;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import m7.x;
import so.h8;
import tu0.j;
import uk1.e;
import yk1.k;
import yk1.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luu0/c;", "Lyk1/k;", "Ltu0/j;", "La7/t0;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends k implements j, t0 {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f123130p0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public h8 f123131e0;

    /* renamed from: f0, reason: collision with root package name */
    public e f123132f0;

    /* renamed from: g0, reason: collision with root package name */
    public h f123133g0;

    /* renamed from: h0, reason: collision with root package name */
    public d f123134h0;

    /* renamed from: i0, reason: collision with root package name */
    public l0 f123135i0;

    /* renamed from: j0, reason: collision with root package name */
    public LegacyPlayerView f123136j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltText f123137k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f123138l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltButton f123139m0;

    /* renamed from: n0, reason: collision with root package name */
    public final d4 f123140n0;

    /* renamed from: o0, reason: collision with root package name */
    public final a4 f123141o0;

    public c() {
        this.E = f.idea_pin_education_slide_view;
        this.f123140n0 = d4.IDEA_PIN_EDUCATION;
        this.f123141o0 = a4.STORY_PIN_CREATE;
    }

    @Override // yk1.k
    public final m V7() {
        h8 h8Var = this.f123131e0;
        if (h8Var == null) {
            Intrinsics.r("ideaPinEducationSlidePresenterFactory");
            throw null;
        }
        e eVar = this.f123132f0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        g13.d(this.f123140n0, this.f123141o0, null, null, null);
        return h8Var.a(g13);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getD0() {
        return this.f123141o0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF78828p0() {
        return this.f123140n0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        l0 l0Var = this.f123135i0;
        if (l0Var != null) {
            l0Var.stop();
        }
        l0 l0Var2 = this.f123135i0;
        if (l0Var2 != null) {
            l0Var2.a();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        l0 l0Var = this.f123135i0;
        if (l0Var != null) {
            l0Var.pause();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        l0 l0Var = this.f123135i0;
        if (l0Var != null) {
            l0Var.play();
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Bundle bundle2;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(aq1.d.idea_pin_education_video);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f123136j0 = (LegacyPlayerView) findViewById;
        View findViewById2 = v13.findViewById(aq1.d.idea_pin_education_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f123137k0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(aq1.d.idea_pin_education_description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f123138l0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(aq1.d.idea_pin_education_action_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        gestaltButton.d(b.f123129i);
        gestaltButton.e(new np0.h(this, 9));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f123139m0 = gestaltButton;
        Context context = getContext();
        l0 a13 = context != null ? new x(context).a() : null;
        this.f123135i0 = a13;
        LegacyPlayerView legacyPlayerView = this.f123136j0;
        if (legacyPlayerView == null) {
            Intrinsics.r("playerView");
            throw null;
        }
        legacyPlayerView.y(a13);
        l0 l0Var = this.f123135i0;
        if (l0Var != null) {
            l0Var.f86277n.a(this);
        }
        l0 l0Var2 = this.f123135i0;
        if (l0Var2 != null) {
            l0Var2.O(2);
        }
        LegacyPlayerView legacyPlayerView2 = this.f123136j0;
        if (legacyPlayerView2 == null) {
            Intrinsics.r("playerView");
            throw null;
        }
        legacyPlayerView2.A(false);
        d dVar = this.f123134h0;
        if (dVar != null) {
            ScreenDescription screenDescription = this.f76937a;
            if (screenDescription == null || (bundle2 = screenDescription.getF49207c()) == null) {
                bundle2 = new Bundle();
            }
            dVar.p3(bundle2);
        }
        int g13 = hf0.b.g(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(aq1.b.idea_pin_education_text_view_height_and_margin);
        LegacyPlayerView legacyPlayerView3 = this.f123136j0;
        if (legacyPlayerView3 == null) {
            Intrinsics.r("playerView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = legacyPlayerView3.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).height = g13 - dimensionPixelSize;
    }
}
