package bi1;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import androidx.media3.ui.LegacyPlayerControlView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import ea1.t0;
import ea1.u0;
import h32.d4;
import h32.g0;
import java.util.LinkedHashSet;
import java.util.Set;
import kh2.a1;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.l4;
import x02.i2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbi1/p;", "Lnl1/d;", "Loc2/j;", "<init>", "()V", "videoFeature_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class p extends a implements oc2.j {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f22869l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f22870c0;

    /* renamed from: d0, reason: collision with root package name */
    public i2 f22871d0;

    /* renamed from: e0, reason: collision with root package name */
    public k11.p f22872e0;

    /* renamed from: f0, reason: collision with root package name */
    public e02.a f22873f0;

    /* renamed from: g0, reason: collision with root package name */
    public il1.a f22874g0;

    /* renamed from: h0, reason: collision with root package name */
    public l4 f22875h0;

    /* renamed from: i0, reason: collision with root package name */
    public PinterestVideoView f22876i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f22877j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f22878k0;

    public p() {
        int i13 = 15;
        xk2.k r13 = d7.g.r(19, new t0(this, i13), xk2.n.NONE);
        int i14 = 16;
        this.f22870c0 = a1.s(this, k0.f80436a.b(b0.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        this.f22878k0 = d4.PIN_CLOSEUP_FULL_SCREEN_VIDEO;
    }

    @Override // oc2.j
    public final Set S0() {
        return new LinkedHashSet();
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        PinterestVideoView pinterestVideoView = this.f22876i0;
        if (pinterestVideoView == null) {
            Intrinsics.r("videoView");
            throw null;
        }
        Object parent = pinterestVideoView.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        return (View) parent;
    }

    public final b0 Y7() {
        return (b0) this.f22870c0.getValue();
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public void activate() {
        super.activate();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            k3.O1(E4);
            E4.getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public void deactivate() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            k3.X1(E4);
            E4.getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        super.deactivate();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF35233h() {
        return this.f22878k0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = rc2.b.fragment_sba_video_full_screen;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        GestaltIconButton gestaltIconButton;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_VIDEO_SCREEN_PIN_ID") : null;
        if (v03 == null) {
            throw new IllegalStateException("Must receive a valid Pin id from Navigation");
        }
        Y7().h(v03);
        View findViewById = v13.findViewById(rc2.a.full_screen_sba_video_view);
        PinterestVideoView pinterestVideoView = (PinterestVideoView) findViewById;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        int i13 = 1;
        if (gh0.b.f0(requireActivity)) {
            pinterestVideoView.f18953r = true;
            LegacyPlayerControlView legacyPlayerControlView = pinterestVideoView.f18945j;
            bf.b.w(legacyPlayerControlView);
            pinterestVideoView.f18952q = -1;
            if (legacyPlayerControlView.e()) {
                pinterestVideoView.C(pinterestVideoView.B());
            }
        }
        pinterestVideoView.e0(bc2.m.PIN_FULL_SCREEN);
        pinterestVideoView.C0.b("is_closeup_video", "true");
        pinterestVideoView.D0 = g0.FULL_SCREEN_VIDEO;
        pinterestVideoView.j0();
        GestaltButton gestaltButton = (GestaltButton) pinterestVideoView.findViewById(m60.t0.button_save);
        if (gestaltButton != null) {
            gestaltButton.setOnClickListener(new k(this, 0));
        }
        GestaltButton gestaltButton2 = (GestaltButton) pinterestVideoView.findViewById(m60.t0.button_visit);
        if (gestaltButton2 != null) {
            gestaltButton2.setOnClickListener(new k(this, i13));
        }
        SimplePlayerControlView simplePlayerControlView = pinterestVideoView.F;
        if (simplePlayerControlView != null && (gestaltIconButton = (GestaltIconButton) pinterestVideoView.findViewById(ac2.a1.cc_toggle_button)) != null) {
            gestaltIconButton.u(new la1.k(12, this, simplePlayerControlView));
        }
        FrameLayout frameLayout = (FrameLayout) pinterestVideoView.findViewById(ac2.a1.full_screen_toggle_button);
        int i14 = 2;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new k(this, i14));
            frameLayout.setContentDescription(frameLayout.getContext().getString(androidx.media3.ui.k0.exo_controls_fullscreen_exit_description));
        }
        pinterestVideoView.u0(new pg1.a(2, pinterestVideoView, this));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f22876i0 = pinterestVideoView;
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new o(v13, this, v03, null), 3);
    }
}
