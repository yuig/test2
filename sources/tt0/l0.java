package tt0;

import a.cb;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.LegacyPlayerView;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCameraToggle;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraBottomBarControlsView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinPermissionItemView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import com.pinterest.feature.ideaPinCreation.education.IdeaPinCreationEducationOnboardingView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.kit.view.RoundedMaskView;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import h32.a4;
import h32.d4;
import h32.f1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jk2.l1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import net.quikkly.android.utils.BitmapUtils;
import okhttp3.internal.Util;
import x02.a2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ltt0/l0;", "Ltt0/l;", "Lgg1/b;", "<init>", "()V", "gi2/b", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l0 extends m implements gg1.b {
    public static final /* synthetic */ int Z0 = 0;
    public GestaltSpinner A0;
    public LegacyPlayerView B0;
    public GestaltText C0;
    public ProgressBar D0;
    public IdeaPinCameraToggle E0;
    public FullBleedGestaltSpinner F0;
    public IdeaPinCreationCameraVideoSegmentsView G0;
    public IdeaPinCreationCameraBottomBarControlsView H0;
    public CameraSidebarControlsView I0;
    public z J0;
    public final xk2.v K0;
    public boolean L0;
    public LinearLayout M0;
    public GestaltText N0;
    public IdeaPinPermissionItemView O0;
    public IdeaPinPermissionItemView P0;
    public IdeaPinPermissionItemView Q0;
    public boolean R0;
    public final xk2.v S0;
    public final xk2.v T0;
    public final uk2.f U0;
    public final xk2.v V0;
    public final rt0.d W0;
    public final d4 X0;
    public final a4 Y0;

    /* renamed from: c0, reason: collision with root package name */
    public s1 f119167c0;

    /* renamed from: d0, reason: collision with root package name */
    public nx.f0 f119168d0;

    /* renamed from: e0, reason: collision with root package name */
    public ag1.b f119169e0;

    /* renamed from: f0, reason: collision with root package name */
    public de0.d f119170f0;

    /* renamed from: g0, reason: collision with root package name */
    public i92.k f119171g0;

    /* renamed from: h0, reason: collision with root package name */
    public dl1.t f119172h0;

    /* renamed from: i0, reason: collision with root package name */
    public rg0.s f119173i0;

    /* renamed from: j0, reason: collision with root package name */
    public ny1.w f119174j0;

    /* renamed from: k0, reason: collision with root package name */
    public ag1.h f119175k0;

    /* renamed from: l0, reason: collision with root package name */
    public lb0.r f119176l0;

    /* renamed from: m0, reason: collision with root package name */
    public g70.h f119177m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f119178n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f119179o0;

    /* renamed from: p0, reason: collision with root package name */
    public final rt0.b f119180p0;

    /* renamed from: q0, reason: collision with root package name */
    public final qt0.c f119181q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Handler f119182r0;

    /* renamed from: s0, reason: collision with root package name */
    public GestaltText f119183s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltIconButton f119184t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltIconButton f119185u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltButton f119186v0;

    /* renamed from: w0, reason: collision with root package name */
    public ImageView f119187w0;

    /* renamed from: x0, reason: collision with root package name */
    public RoundedMaskView f119188x0;

    /* renamed from: y0, reason: collision with root package name */
    public fp0.d f119189y0;

    /* renamed from: z0, reason: collision with root package name */
    public View f119190z0;

    public l0() {
        rt0.b bVar = new rt0.b();
        this.f119180p0 = bVar;
        this.f119181q0 = new qt0.c(this, bVar);
        this.f119182r0 = new Handler(Looper.getMainLooper());
        this.K0 = xk2.m.b(new d0(this, 0));
        this.S0 = xk2.m.b(new d0(this, 1));
        this.T0 = xk2.m.b(new d0(this, 10));
        this.U0 = cb.r("create(...)");
        this.V0 = xk2.m.b(new d0(this, 11));
        this.W0 = new rt0.d(null, null, null, new e0(this, 2), null, null, 55);
        this.X0 = d4.STORY_PIN_CAMERA;
        this.Y0 = a4.STORY_PIN_CREATE;
    }

    public static final void Y7(l0 l0Var) {
        View view = l0Var.f119190z0;
        if (view == null) {
            Intrinsics.r("cameraLoadingView");
            throw null;
        }
        view.postDelayed(new dp.a(23, view, l0Var), 300L);
        z zVar = l0Var.J0;
        if (zVar == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        fp0.d dVar = l0Var.f119189y0;
        if (dVar != null) {
            zVar.g(dVar.k());
        } else {
            Intrinsics.r("cameraView");
            throw null;
        }
    }

    public static final void Z7(l0 l0Var) {
        l0Var.R0 = false;
        CameraSidebarControlsView cameraSidebarControlsView = l0Var.I0;
        if (cameraSidebarControlsView == null) {
            Intrinsics.r("cameraSidebarControls");
            throw null;
        }
        bs1.c.U1(cameraSidebarControlsView);
        if (l0Var.l8()) {
            IdeaPinCameraToggle ideaPinCameraToggle = l0Var.E0;
            if (ideaPinCameraToggle == null) {
                Intrinsics.r("toggleView");
                throw null;
            }
            bs1.c.U1(ideaPinCameraToggle);
        }
        GestaltText gestaltText = l0Var.f119183s0;
        if (gestaltText != null) {
            bs1.c.U1(gestaltText);
        } else {
            Intrinsics.r("titleText");
            throw null;
        }
    }

    public static NavigationImpl c8(String str) {
        NavigationImpl z03 = Navigation.z0(d2.b(), str);
        z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        return z03;
    }

    @Override // gg1.b
    public final void E6(hg1.d optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        switch (c0.f119092b[optionType.ordinal()]) {
            case 1:
                u8(c8("https://help.pinterest.com/guide/guide-to-creating-pins"));
                return;
            case 2:
                u8(c8("https://business.pinterest.com/creative-best-practices/"));
                return;
            case 3:
                wy0 f13 = ((b60.d) getActiveUserManager()).f();
                String G2 = f13 != null ? f13.G2() : null;
                gg1.b.f64972so.getClass();
                String str = (String) gg1.a.a().get(G2);
                if (str == null) {
                    str = "768145348882884282";
                }
                g70.h hVar = this.f119177m0;
                if (hVar != null) {
                    g70.h.b(hVar, str, new e0(this, 3));
                    return;
                } else {
                    Intrinsics.r("boardNavigator");
                    throw null;
                }
            case 4:
                u8(c8("https://business.pinterest.com/creators/"));
                return;
            case 5:
                u8(c8("https://business.pinterest.com/creator-code/"));
                return;
            case 6:
                M1(a8(d2.e(), ml1.b.UNSPECIFIED_TRANSITION.getValue()));
                return;
            case 7:
                u8(c8("https://help.pinterest.com/business/article/pinterest-analytics"));
                return;
            default:
                return;
        }
    }

    @Override // gg1.b
    public final void M2(hg1.b optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        int i13 = c0.f119093c[optionType.ordinal()];
        if (i13 == 1) {
            f7().d(new jc0.v(new yf1.b((xf1.a) null, 3), false, 0L, 30));
        } else {
            if (i13 != 2) {
                return;
            }
            u8(c8("https://help.pinterest.com"));
        }
    }

    public final NavigationImpl a8(ScreenLocation screenLocation, int i13) {
        NavigationImpl L = Navigation.L(screenLocation, "", i13);
        Navigation navigation = this.I;
        L.Y1("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", navigation != null ? navigation.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false);
        Navigation navigation2 = this.I;
        L.z(navigation2 != null ? navigation2.J1("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS") : -1, "com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS");
        Navigation navigation3 = this.I;
        Boolean valueOf = navigation3 != null ? Boolean.valueOf(navigation3.S("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", false)) : null;
        if (valueOf != null) {
            L.Y1("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", valueOf.booleanValue());
        }
        Navigation navigation4 = this.I;
        L.m0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null);
        L.z(com.bumptech.glide.d.O(this, "com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS", 0), "com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS");
        Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
        return L;
    }

    public final boolean[] b8() {
        boolean[] d2;
        if (Build.VERSION.SDK_INT >= 34) {
            ny1.b bVar = ny1.b.f92662f;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            boolean[] d13 = bVar.d(requireContext);
            List elements = kotlin.collections.e0.b(Boolean.TRUE);
            Intrinsics.checkNotNullParameter(d13, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int length = d13.length;
            d2 = Arrays.copyOf(d13, elements.size() + length);
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                d2[length] = ((Boolean) it.next()).booleanValue();
                length++;
            }
            Intrinsics.f(d2);
        } else {
            ny1.a aVar = ny1.a.f92661f;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            d2 = aVar.d(requireContext2);
        }
        if (!l8()) {
            d2[1] = true;
        }
        return d2;
    }

    public final boolean d8() {
        return ((((pw0.x) this.S0.getValue()) == pw0.x.IdeaPinAddMediaClip) ^ true) && l8();
    }

    public final s1 e8() {
        s1 s1Var = this.f119167c0;
        if (s1Var != null) {
            return s1Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final ny1.n f8() {
        return !l8() ? Build.VERSION.SDK_INT >= 34 ? ny1.d.f92664f : ny1.c.f92663f : Build.VERSION.SDK_INT >= 34 ? ny1.b.f92662f : ny1.a.f92661f;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        Context context;
        fp0.d dVar = this.f119189y0;
        if (dVar == null) {
            Intrinsics.r("cameraView");
            throw null;
        }
        if (dVar.b()) {
            v8(a.A);
            return true;
        }
        if (!this.f119180p0.j()) {
            nl1.d.J7();
            return false;
        }
        FragmentActivity E4 = E4();
        if (E4 == null || (context = getContext()) == null) {
            return true;
        }
        kh2.a1.s0(E4, (ye2.m) context, new d0(this, 2), new d0(this, 3));
        return true;
    }

    public final st0.c g8() {
        return (st0.c) this.V0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getT1() {
        return this.Y0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF142888j1() {
        return this.X0;
    }

    public final i92.k h8() {
        i92.k kVar = this.f119171g0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    public final void i8() {
        LinearLayout linearLayout = this.M0;
        if (linearLayout == null) {
            Intrinsics.r("missingPermissionContainer");
            throw null;
        }
        bs1.c.X0(linearLayout);
        GestaltText gestaltText = this.f119183s0;
        if (gestaltText == null) {
            Intrinsics.r("titleText");
            throw null;
        }
        pk.a0.w1(gestaltText);
        View view = this.f119190z0;
        if (view == null) {
            Intrinsics.r("cameraLoadingView");
            throw null;
        }
        bs1.c.U1(view);
        LegacyPlayerView legacyPlayerView = this.B0;
        if (legacyPlayerView == null) {
            Intrinsics.r("cameraPlaybackView");
            throw null;
        }
        bs1.c.X0(legacyPlayerView);
        if (l8()) {
            if (!d8() || this.f119180p0.j()) {
                IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.G0;
                if (ideaPinCreationCameraVideoSegmentsView == null) {
                    Intrinsics.r("cameraSegmentsView");
                    throw null;
                }
                bs1.c.U1(ideaPinCreationCameraVideoSegmentsView);
            } else {
                s8();
            }
        }
        z zVar = this.J0;
        if (zVar == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        fp0.d dVar = this.f119189y0;
        if (dVar == null) {
            Intrinsics.r("cameraView");
            throw null;
        }
        zVar.g(dVar.k());
        CameraSidebarControlsView cameraSidebarControlsView = this.I0;
        if (cameraSidebarControlsView != null) {
            bs1.c.U1(cameraSidebarControlsView);
        } else {
            Intrinsics.r("cameraSidebarControls");
            throw null;
        }
    }

    public final void j8() {
        IdeaPinCameraToggle ideaPinCameraToggle = this.E0;
        if (ideaPinCameraToggle == null) {
            Intrinsics.r("toggleView");
            throw null;
        }
        ideaPinCameraToggle.setVisibility(8);
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.G0;
        if (ideaPinCreationCameraVideoSegmentsView != null) {
            ideaPinCreationCameraVideoSegmentsView.setVisibility(0);
        } else {
            Intrinsics.r("cameraSegmentsView");
            throw null;
        }
    }

    public final void k8() {
        if (d8()) {
            j8();
        }
        fp0.d dVar = this.f119189y0;
        if (dVar != null) {
            dVar.j(new e0(this, 0), new e0(this, 1));
        } else {
            Intrinsics.r("cameraView");
            throw null;
        }
    }

    public final boolean l8() {
        return (hf0.b.q() || pw0.j.a((pw0.x) this.S0.getValue())) ? false : true;
    }

    public final void m8(ag1.g gVar, Long l13, Exception exc) {
        nx.d0 s73 = s7();
        f1 f1Var = f1.IDEA_PIN_CREATION_PERFORMANCE;
        HashMap hashMap = new HashMap();
        if (l13 != null) {
        }
        hashMap.put("performance_type", gVar.getType());
        String MODEL = Build.MODEL;
        if (MODEL != null && MODEL.length() != 0) {
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            hashMap.put("device_version", kotlin.text.e0.C(30, MODEL));
        }
        String str = Build.VERSION.RELEASE;
        if (str != null && !kotlin.text.z.j(str)) {
            hashMap.put("os_version", str);
        }
        if (exc != null) {
            hashMap.put("error_message", kotlin.text.e0.C(1024, exc.toString()));
        }
        Unit unit = Unit.f80348a;
        s73.g(f1Var, null, hashMap, false);
    }

    public final void n8() {
        boolean q13 = hf0.b.q();
        xk2.v vVar = this.S0;
        rt0.b bVar = this.f119180p0;
        if (!q13) {
            bVar.e();
            NavigationImpl a83 = a8(d2.m(), ml1.b.NO_TRANSITION.getValue());
            a83.Y1("com.pinterest.EXTRA_IDEA_PIN_CAMERA_FROM_PHOTO_MODE", bVar.m());
            a83.Y1("com.pinterest.EXTRA_IDEA_PIN_CAMERA_PHOTO_MODE_ENABLED", !(((pw0.x) vVar.getValue()) == pw0.x.IdeaPinAddMediaClip));
            a83.Y1("com.pinterest.EXTRA_IDEA_PIN_FROM_CAMERA", true);
            M1(a83);
            return;
        }
        bVar.e();
        ag1.h hVar = this.f119175k0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        hVar.d(a.f119061u, false);
        nx.d0 s73 = s7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ag1.b bVar2 = this.f119169e0;
        if (bVar2 == null) {
            Intrinsics.r("ideaPinComposeDataManager");
            throw null;
        }
        uv0.k.b(s73, requireContext, bVar2.d(), null, 24);
        NavigationImpl a84 = a8(d2.n(), ml1.b.NO_TRANSITION.getValue());
        a84.Y1("com.pinterest.EXTRA_IDEA_PIN_CAMERA_FROM_PHOTO_MODE", bVar.m());
        a84.Y1("com.pinterest.EXTRA_IDEA_PIN_CAMERA_PHOTO_MODE_ENABLED", !(((pw0.x) vVar.getValue()) == pw0.x.IdeaPinAddMediaClip));
        M1(a84);
    }

    public final void o8() {
        rt0.b bVar = this.f119180p0;
        bVar.v(false);
        if (!(!(((pw0.x) this.S0.getValue()) == pw0.x.IdeaPinAddMediaClip))) {
            z zVar = this.J0;
            if (zVar == null) {
                Intrinsics.r("cameraController");
                throw null;
            }
            zVar.w(s.RECORDING_STOPPED);
            IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.G0;
            if (ideaPinCreationCameraVideoSegmentsView == null) {
                Intrinsics.r("cameraSegmentsView");
                throw null;
            }
            bs1.c.U1(ideaPinCreationCameraVideoSegmentsView);
        } else if (bVar.m()) {
            z zVar2 = this.J0;
            if (zVar2 == null) {
                Intrinsics.r("cameraController");
                throw null;
            }
            zVar2.w(s.PHOTO);
            if (d8()) {
                s8();
            }
        } else {
            z zVar3 = this.J0;
            if (zVar3 == null) {
                Intrinsics.r("cameraController");
                throw null;
            }
            zVar3.w(s.RECORDING_STOPPED);
            if (bVar.h().size() == 0) {
                s8();
            } else {
                j8();
            }
        }
        z zVar4 = this.J0;
        if (zVar4 == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        fp0.d dVar = this.f119189y0;
        if (dVar == null) {
            Intrinsics.r("cameraView");
            throw null;
        }
        zVar4.g(dVar.k());
        GestaltText gestaltText = this.C0;
        if (gestaltText == null) {
            Intrinsics.r("countdownTextView");
            throw null;
        }
        pk.a0.k0(gestaltText);
        ProgressBar progressBar = this.D0;
        if (progressBar == null) {
            Intrinsics.r("countdownProgressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        g8().a();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = e8().b() ? aq1.f.idea_pin_creation_camerax_fragment : aq1.f.idea_pin_creation_camera_fragment;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        fp0.d dVar = this.f119189y0;
        if (dVar == null) {
            Intrinsics.r("cameraView");
            throw null;
        }
        dVar.onDestroy();
        g8().b();
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        z zVar = this.J0;
        if (zVar == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        zVar.c();
        this.f119180p0.d();
        this.f119181q0.e();
        z zVar2 = this.J0;
        if (zVar2 == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        zVar2.b();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        rt0.b bVar = this.f119180p0;
        if (bVar.n()) {
            this.f119181q0.d();
            this.f119179o0 = true;
        } else if (bVar.o()) {
            v8(a.A);
        } else if (bVar.k()) {
            o8();
        }
        if (!e8().b()) {
            dl2.b.s2(E4());
        }
        fp0.d dVar = this.f119189y0;
        if (dVar == null) {
            Intrinsics.r("cameraView");
            throw null;
        }
        dVar.onPause();
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f119178n0) {
            return;
        }
        ny1.n f83 = f8();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (f83.a(requireContext)) {
            i8();
            fp0.d dVar = this.f119189y0;
            if (dVar == null) {
                Intrinsics.r("cameraView");
                throw null;
            }
            dVar.onResume();
        } else {
            ny1.n f84 = f8();
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            ny1.w wVar = this.f119174j0;
            if (wVar == null) {
                Intrinsics.r("permissionsManager");
                throw null;
            }
            if (f84.b(requireActivity, wVar, true) || this.L0) {
                r8(null);
            } else {
                this.L0 = true;
                r8(null);
                ny1.w wVar2 = this.f119174j0;
                if (wVar2 == null) {
                    Intrinsics.r("permissionsManager");
                    throw null;
                }
                FragmentActivity requireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                wVar2.c(requireActivity2, f8(), (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : new g0(this, 0), (r23 & 1024) != 0 ? ny1.t.f92703n : j.f119135s);
            }
        }
        FragmentActivity requireActivity3 = requireActivity();
        if (hf0.b.q() && !e8().b()) {
            Intrinsics.f(requireActivity3);
            dl2.b.Z1(requireActivity3);
        }
        Intrinsics.f(requireActivity3);
        pk.a0.D(requireActivity3);
        if (this.f119179o0) {
            this.f119179o0 = false;
            x8();
            this.f119181q0.f();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        fp0.d dVar;
        boolean z13;
        View view;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        long longValue = ((Number) this.T0.getValue()).longValue();
        rt0.b bVar = this.f119180p0;
        bVar.u(longValue);
        View findViewById = v13.findViewById(aq1.d.camera_corners);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f119188x0 = (RoundedMaskView) findViewById;
        View findViewById2 = v13.findViewById(aq1.d.story_pin_back);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById2;
        final int i13 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: tt0.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f119069b;

            {
                this.f119069b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                l0 this$0 = this.f119069b;
                switch (i14) {
                    case 0:
                        int i15 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.s7().X(h32.u0.BACK_BUTTON);
                            this$0.P7();
                            return;
                        }
                        return;
                    case 1:
                        int i16 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            nx.f0 f0Var = this$0.f119168d0;
                            if (f0Var == null) {
                                Intrinsics.r("pinalyticsFactory");
                                throw null;
                            }
                            this$0.f7().d(new jc0.v(new rv0.a(this$0, f0Var), false, 0L, 30));
                            this$0.s7().X(h32.u0.STORY_PIN_QUESTION_BUTTON);
                            return;
                        }
                        return;
                    case 2:
                        int i17 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.U0.c(Unit.f80348a);
                        return;
                    default:
                        int i18 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().X(h32.u0.STORY_PIN_REQUEST_PERMISSIONS_BUTTON);
                        ny1.w wVar = this$0.f119174j0;
                        if (wVar == null) {
                            Intrinsics.r("permissionsManager");
                            throw null;
                        }
                        FragmentActivity requireActivity = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        wVar.c(requireActivity, this$0.f8(), (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : j.f119134r);
                        return;
                }
            }
        });
        gestaltIconButton.t(a.f119062v);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f119184t0 = gestaltIconButton;
        View findViewById3 = v13.findViewById(aq1.d.story_pin_help);
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById3;
        gestaltIconButton2.t(new e0(this, 4));
        final int i14 = 1;
        gestaltIconButton2.u(new gm1.a(this) { // from class: tt0.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f119069b;

            {
                this.f119069b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                l0 this$0 = this.f119069b;
                switch (i142) {
                    case 0:
                        int i15 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.s7().X(h32.u0.BACK_BUTTON);
                            this$0.P7();
                            return;
                        }
                        return;
                    case 1:
                        int i16 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            nx.f0 f0Var = this$0.f119168d0;
                            if (f0Var == null) {
                                Intrinsics.r("pinalyticsFactory");
                                throw null;
                            }
                            this$0.f7().d(new jc0.v(new rv0.a(this$0, f0Var), false, 0L, 30));
                            this$0.s7().X(h32.u0.STORY_PIN_QUESTION_BUTTON);
                            return;
                        }
                        return;
                    case 2:
                        int i17 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.U0.c(Unit.f80348a);
                        return;
                    default:
                        int i18 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().X(h32.u0.STORY_PIN_REQUEST_PERMISSIONS_BUTTON);
                        ny1.w wVar = this$0.f119174j0;
                        if (wVar == null) {
                            Intrinsics.r("permissionsManager");
                            throw null;
                        }
                        FragmentActivity requireActivity = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        wVar.c(requireActivity, this$0.f8(), (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : j.f119134r);
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f119185u0 = gestaltIconButton2;
        View findViewById4 = v13.findViewById(aq1.d.title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f119183s0 = (GestaltText) findViewById4;
        z8();
        GestaltText gestaltText = this.f119183s0;
        if (gestaltText == null) {
            Intrinsics.r("titleText");
            throw null;
        }
        int i15 = 8;
        gestaltText.getViewTreeObserver().addOnGlobalLayoutListener(new n.e(this, i15));
        View findViewById5 = v13.findViewById(aq1.d.next);
        GestaltButton gestaltButton = (GestaltButton) findViewById5;
        gestaltButton.d(a.f119063w);
        final int i16 = 2;
        gestaltButton.e(new gm1.a(this) { // from class: tt0.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f119069b;

            {
                this.f119069b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i16;
                l0 this$0 = this.f119069b;
                switch (i142) {
                    case 0:
                        int i152 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.s7().X(h32.u0.BACK_BUTTON);
                            this$0.P7();
                            return;
                        }
                        return;
                    case 1:
                        int i162 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            nx.f0 f0Var = this$0.f119168d0;
                            if (f0Var == null) {
                                Intrinsics.r("pinalyticsFactory");
                                throw null;
                            }
                            this$0.f7().d(new jc0.v(new rv0.a(this$0, f0Var), false, 0L, 30));
                            this$0.s7().X(h32.u0.STORY_PIN_QUESTION_BUTTON);
                            return;
                        }
                        return;
                    case 2:
                        int i17 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.U0.c(Unit.f80348a);
                        return;
                    default:
                        int i18 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().X(h32.u0.STORY_PIN_REQUEST_PERMISSIONS_BUTTON);
                        ny1.w wVar = this$0.f119174j0;
                        if (wVar == null) {
                            Intrinsics.r("permissionsManager");
                            throw null;
                        }
                        FragmentActivity requireActivity = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        wVar.c(requireActivity, this$0.f8(), (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : j.f119134r);
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f119186v0 = gestaltButton;
        l1 A = this.U0.K(300L, TimeUnit.MILLISECONDS).A(wj2.c.a());
        kt0.x xVar = new kt0.x(10, new e0(this, 5));
        kt0.x xVar2 = new kt0.x(11, a.f119064x);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        xj2.c F = A.F(xVar, xVar2, cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        R6(F);
        View findViewById6 = v13.findViewById(aq1.d.permission_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.M0 = (LinearLayout) findViewById6;
        View findViewById7 = v13.findViewById(aq1.d.missing_permission_text);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.N0 = (GestaltText) findViewById7;
        View findViewById8 = v13.findViewById(aq1.d.camera_permission_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.O0 = (IdeaPinPermissionItemView) findViewById8;
        View findViewById9 = v13.findViewById(aq1.d.audio_permission_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.P0 = (IdeaPinPermissionItemView) findViewById9;
        View findViewById10 = v13.findViewById(aq1.d.gallery_permission_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.Q0 = (IdeaPinPermissionItemView) findViewById10;
        GestaltButton gestaltButton2 = (GestaltButton) v13.findViewById(aq1.d.enable_permission_btn);
        gestaltButton2.d(a.f119065y);
        final int i17 = 3;
        gestaltButton2.e(new gm1.a(this) { // from class: tt0.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f119069b;

            {
                this.f119069b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i17;
                l0 this$0 = this.f119069b;
                switch (i142) {
                    case 0:
                        int i152 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.s7().X(h32.u0.BACK_BUTTON);
                            this$0.P7();
                            return;
                        }
                        return;
                    case 1:
                        int i162 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            nx.f0 f0Var = this$0.f119168d0;
                            if (f0Var == null) {
                                Intrinsics.r("pinalyticsFactory");
                                throw null;
                            }
                            this$0.f7().d(new jc0.v(new rv0.a(this$0, f0Var), false, 0L, 30));
                            this$0.s7().X(h32.u0.STORY_PIN_QUESTION_BUTTON);
                            return;
                        }
                        return;
                    case 2:
                        int i172 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.U0.c(Unit.f80348a);
                        return;
                    default:
                        int i18 = l0.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().X(h32.u0.STORY_PIN_REQUEST_PERMISSIONS_BUTTON);
                        ny1.w wVar = this$0.f119174j0;
                        if (wVar == null) {
                            Intrinsics.r("permissionsManager");
                            throw null;
                        }
                        FragmentActivity requireActivity = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        wVar.c(requireActivity, this$0.f8(), (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : j.f119134r);
                        return;
                }
            }
        });
        View findViewById11 = v13.findViewById(aq1.d.camera_loading);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f119190z0 = findViewById11;
        View findViewById12 = v13.findViewById(aq1.d.camera_loading_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.A0 = (GestaltSpinner) findViewById12;
        if (e8().b()) {
            View findViewById13 = v13.findViewById(aq1.d.camera_preview);
            Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
            PreviewView previewView = (PreviewView) findViewById13;
            tb0.h b63 = b6();
            lb0.r rVar = this.f119176l0;
            if (rVar == null) {
                Intrinsics.r("prefsManagerUser");
                throw null;
            }
            dVar = new fp0.c(this, previewView, b63, rVar);
        } else {
            KeyEvent.Callback findViewById14 = v13.findViewById(aq1.d.camera_preview);
            Intrinsics.f(findViewById14);
            dVar = (fp0.d) findViewById14;
        }
        this.f119189y0 = dVar;
        dVar.f(new m.h(new d0(this, i15), new d0(this, 9), new d0(this, 6), new d0(this, 7)));
        View findViewById15 = v13.findViewById(aq1.d.camera_playback);
        LegacyPlayerView legacyPlayerView = (LegacyPlayerView) findViewById15;
        legacyPlayerView.z(4);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "apply(...)");
        this.B0 = legacyPlayerView;
        View findViewById16 = v13.findViewById(aq1.d.countdown_text);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.C0 = (GestaltText) findViewById16;
        View findViewById17 = v13.findViewById(aq1.d.countdown_progress);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.D0 = (ProgressBar) findViewById17;
        View findViewById18 = v13.findViewById(aq1.d.camera_segments);
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = (IdeaPinCreationCameraVideoSegmentsView) findViewById18;
        ideaPinCreationCameraVideoSegmentsView.c(bVar);
        ideaPinCreationCameraVideoSegmentsView.d(this.f119181q0.b());
        Intrinsics.checkNotNullExpressionValue(findViewById18, "apply(...)");
        this.G0 = ideaPinCreationCameraVideoSegmentsView;
        View findViewById19 = v13.findViewById(aq1.d.camera_bottom_bar_controls);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        this.H0 = (IdeaPinCreationCameraBottomBarControlsView) findViewById19;
        View findViewById20 = v13.findViewById(aq1.d.camera_sidebar_controls);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        CameraSidebarControlsView cameraSidebarControlsView = (CameraSidebarControlsView) findViewById20;
        this.I0 = cameraSidebarControlsView;
        IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView = this.H0;
        if (ideaPinCreationCameraBottomBarControlsView == null) {
            Intrinsics.r("cameraBottomBarControls");
            throw null;
        }
        if (cameraSidebarControlsView == null) {
            Intrinsics.r("cameraSidebarControls");
            throw null;
        }
        s1 e83 = e8();
        de0.d dVar2 = this.f119170f0;
        if (dVar2 == null) {
            Intrinsics.r("draftDataProvider");
            throw null;
        }
        String uid = com.bumptech.glide.d.Q(getActiveUserManager()).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        z zVar = new z(ideaPinCreationCameraBottomBarControlsView, cameraSidebarControlsView, e83, dVar2, uid);
        zVar.u(bVar);
        zVar.v(new t(new h0(zVar, this), new v(this, 3), new g0(this, 1), new v(this, 4), new g0(this, 2), new v(this, 5), new h0(this, zVar), new d0(this, 13), new d0(this, 14)));
        this.J0 = zVar;
        v13.getViewTreeObserver().addOnPreDrawListener(new n5.g(v13, this));
        bVar.a(this.W0);
        q8();
        Context context = v13.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        wf1.b.Companion.getClass();
        if (wf1.a.a() == wf1.b.NEAR_LIMIT) {
            HashMap hashMap = new HashMap();
            Navigation navigation = this.I;
            bs1.c.G1("entry_type", navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null, hashMap);
            de0.d dVar3 = this.f119170f0;
            if (dVar3 == null) {
                Intrinsics.r("draftDataProvider");
                throw null;
            }
            hashMap.put("android_room_database_size", String.valueOf(dVar3.a(context)));
            hashMap.put("idea_pin_adjusted_images_folder_size", String.valueOf(kh2.s0.F(context)));
            s7().g(f1.STORY_PIN_MULTI_DRAFTS_APPROACH_LIMIT, null, hashMap, false);
            z13 = oe.f.f94192b;
            if (!z13 && (view = getView()) != null) {
                view.postDelayed(new b0(this, 2), 300L);
            }
        }
        IdeaPinPermissionItemView ideaPinPermissionItemView = this.O0;
        if (ideaPinPermissionItemView == null) {
            Intrinsics.r("cameraPermissionView");
            throw null;
        }
        ideaPinPermissionItemView.b(1, aq1.h.idea_pin_camera_access);
        if (l8()) {
            IdeaPinPermissionItemView ideaPinPermissionItemView2 = this.P0;
            if (ideaPinPermissionItemView2 == null) {
                Intrinsics.r("audioPermissionView");
                throw null;
            }
            ideaPinPermissionItemView2.b(2, aq1.h.idea_pin_audio_access);
            IdeaPinPermissionItemView ideaPinPermissionItemView3 = this.Q0;
            if (ideaPinPermissionItemView3 == null) {
                Intrinsics.r("galleryPermissionView");
                throw null;
            }
            ideaPinPermissionItemView3.b(3, dq1.f.idea_pin_gallery_access);
        } else {
            IdeaPinPermissionItemView ideaPinPermissionItemView4 = this.P0;
            if (ideaPinPermissionItemView4 == null) {
                Intrinsics.r("audioPermissionView");
                throw null;
            }
            ideaPinPermissionItemView4.setVisibility(8);
            IdeaPinPermissionItemView ideaPinPermissionItemView5 = this.Q0;
            if (ideaPinPermissionItemView5 == null) {
                Intrinsics.r("galleryPermissionView");
                throw null;
            }
            ideaPinPermissionItemView5.b(2, dq1.f.idea_pin_gallery_access);
            GestaltText gestaltText2 = this.N0;
            if (gestaltText2 == null) {
                Intrinsics.r("missingPermissionText");
                throw null;
            }
            pk.a0.o(gestaltText2, aq1.h.idea_pin_camera_missing_permission_text_photo_only, new Object[0]);
        }
        View findViewById21 = v13.findViewById(aq1.d.camera_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.E0 = (IdeaPinCameraToggle) findViewById21;
        if (!l8()) {
            bVar.x(true);
            IdeaPinCameraToggle ideaPinCameraToggle = this.E0;
            if (ideaPinCameraToggle == null) {
                Intrinsics.r("toggleView");
                throw null;
            }
            ideaPinCameraToggle.setVisibility(8);
            IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView2 = this.G0;
            if (ideaPinCreationCameraVideoSegmentsView2 == null) {
                Intrinsics.r("cameraSegmentsView");
                throw null;
            }
            ideaPinCreationCameraVideoSegmentsView2.setVisibility(8);
            z zVar2 = this.J0;
            if (zVar2 == null) {
                Intrinsics.r("cameraController");
                throw null;
            }
            zVar2.w(s.PHOTO);
            z zVar3 = this.J0;
            if (zVar3 == null) {
                Intrinsics.r("cameraController");
                throw null;
            }
            zVar3.y();
            fp0.d dVar4 = this.f119189y0;
            if (dVar4 == null) {
                Intrinsics.r("cameraView");
                throw null;
            }
            dVar4.i(true);
            z8();
        } else if (d8()) {
            s8();
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            IdeaPinCameraToggle ideaPinCameraToggle2 = this.E0;
            if (ideaPinCameraToggle2 == null) {
                Intrinsics.r("toggleView");
                throw null;
            }
            ideaPinCameraToggle2.setOnTouchListener(new cr.a(h0Var, this));
            IdeaPinCameraToggle ideaPinCameraToggle3 = this.E0;
            if (ideaPinCameraToggle3 == null) {
                Intrinsics.r("toggleView");
                throw null;
            }
            xj2.c F2 = ideaPinCameraToggle3.getF45912g().H(tk2.e.f118017c).A(wj2.c.a()).F(new kt0.x(12, new e0(this, 7)), new kt0.x(13, a.f119066z), cVar, a2Var);
            Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
            R6(F2);
        } else {
            j8();
        }
        IdeaPinCreationEducationOnboardingView ideaPinCreationEducationOnboardingView = (IdeaPinCreationEducationOnboardingView) v13.findViewById(aq1.d.education_view);
        FrameLayout frameLayout = (FrameLayout) v13.findViewById(aq1.d.record_button);
        rg0.s sVar = this.f119173i0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        rg0.n b13 = ((dh0.d) sVar).b(i32.y0.ANDROID_IDEA_PIN_CREATION_CAMERA);
        Integer valueOf = b13 != null ? Integer.valueOf(b13.f108060b) : null;
        int value = i32.l.ANDROID_IDEA_PIN_CREATION_CAMERA_ASSET_PICKER_ONBOARDING.getValue();
        if (valueOf != null && valueOf.intValue() == value) {
            Intrinsics.f(ideaPinCreationEducationOnboardingView);
            Intrinsics.f(frameLayout);
            vd0.c json = b13.f108070l;
            Intrinsics.checkNotNullExpressionValue(json, "json");
            kh2.a1.r0(b13, ideaPinCreationEducationOnboardingView, frameLayout, new m.h(json).C());
        }
        View findViewById22 = v13.findViewById(aq1.d.photo_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.f119187w0 = (ImageView) findViewById22;
        View findViewById23 = v13.findViewById(aq1.d.progress_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        FullBleedGestaltSpinner fullBleedGestaltSpinner = (FullBleedGestaltSpinner) findViewById23;
        this.F0 = fullBleedGestaltSpinner;
        if (fullBleedGestaltSpinner != null) {
            fullBleedGestaltSpinner.showLoadingSpinner(false);
        } else {
            Intrinsics.r("progressIndicator");
            throw null;
        }
    }

    public final void p8(d0 d0Var) {
        ArrayList arrayList = this.f119180p0.f109957i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k01 videoItem = ((bo0) it.next()).getVideoItem();
            if (videoItem != null) {
                videoItem.k();
            }
        }
        List A = Util.A(arrayList);
        dl1.t tVar = this.f119172h0;
        if (tVar == null) {
            Intrinsics.r("storyPinLocalDataRepository");
            throw null;
        }
        ag1.b bVar = this.f119169e0;
        if (bVar == null) {
            Intrinsics.r("ideaPinComposeDataManager");
            throw null;
        }
        jk2.e0 M = ((dl1.l) tVar).M(bVar.d());
        hk2.b bVar2 = new hk2.b(new kt0.x(14, new go0.r(this, A, d0Var, 11)), new kt0.x(15, new e0(this, 6)), ck2.i.f27923c);
        M.f(bVar2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
        R6(bVar2);
    }

    public final void q8() {
        View view = this.f119190z0;
        if (view == null) {
            Intrinsics.r("cameraLoadingView");
            throw null;
        }
        view.clearAnimation();
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(300L).setListener(new gq.e(view, 1)).start();
        GestaltSpinner gestaltSpinner = this.A0;
        if (gestaltSpinner == null) {
            Intrinsics.r("cameraLoadingIndicatorView");
            throw null;
        }
        dl2.b.X2(gestaltSpinner, ln1.e.LOADING);
        z zVar = this.J0;
        if (zVar != null) {
            zVar.e(true);
        } else {
            Intrinsics.r("cameraController");
            throw null;
        }
    }

    public final void r8(boolean[] zArr) {
        LinearLayout linearLayout = this.M0;
        if (linearLayout == null) {
            Intrinsics.r("missingPermissionContainer");
            throw null;
        }
        bs1.c.U1(linearLayout);
        GestaltText gestaltText = this.f119183s0;
        if (gestaltText == null) {
            Intrinsics.r("titleText");
            throw null;
        }
        pk.a0.k0(gestaltText);
        View view = this.f119190z0;
        if (view == null) {
            Intrinsics.r("cameraLoadingView");
            throw null;
        }
        bs1.c.X0(view);
        LegacyPlayerView legacyPlayerView = this.B0;
        if (legacyPlayerView == null) {
            Intrinsics.r("cameraPlaybackView");
            throw null;
        }
        bs1.c.X0(legacyPlayerView);
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.G0;
        if (ideaPinCreationCameraVideoSegmentsView == null) {
            Intrinsics.r("cameraSegmentsView");
            throw null;
        }
        bs1.c.X0(ideaPinCreationCameraVideoSegmentsView);
        z zVar = this.J0;
        if (zVar == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        zVar.e(true);
        CameraSidebarControlsView cameraSidebarControlsView = this.I0;
        if (cameraSidebarControlsView == null) {
            Intrinsics.r("cameraSidebarControls");
            throw null;
        }
        bs1.c.X0(cameraSidebarControlsView);
        if (d8()) {
            IdeaPinCameraToggle ideaPinCameraToggle = this.E0;
            if (ideaPinCameraToggle == null) {
                Intrinsics.r("toggleView");
                throw null;
            }
            ideaPinCameraToggle.setVisibility(8);
        }
        if (zArr == null) {
            zArr = b8();
        }
        boolean z13 = zArr[0];
        boolean z14 = zArr[1];
        boolean z15 = zArr[2];
        IdeaPinPermissionItemView ideaPinPermissionItemView = this.O0;
        if (ideaPinPermissionItemView == null) {
            Intrinsics.r("cameraPermissionView");
            throw null;
        }
        ideaPinPermissionItemView.a(z13);
        IdeaPinPermissionItemView ideaPinPermissionItemView2 = this.P0;
        if (ideaPinPermissionItemView2 == null) {
            Intrinsics.r("audioPermissionView");
            throw null;
        }
        ideaPinPermissionItemView2.a(z14);
        IdeaPinPermissionItemView ideaPinPermissionItemView3 = this.Q0;
        if (ideaPinPermissionItemView3 == null) {
            Intrinsics.r("galleryPermissionView");
            throw null;
        }
        ideaPinPermissionItemView3.a(z15);
        nx.d0 s73 = s7();
        f1 f1Var = f1.RENDER;
        h32.g0 g0Var = h32.g0.STORY_PIN_MISSING_PERMISSIONS_VIEW;
        HashMap hashMap = new HashMap();
        hashMap.put("is_camera_permission_granted", String.valueOf(z13));
        hashMap.put("is_audio_permission_granted", String.valueOf(z14));
        hashMap.put("is_gallery_permission_granted", String.valueOf(z15));
        Unit unit = Unit.f80348a;
        nx.d0.B(s73, f1Var, g0Var, null, hashMap, 20);
    }

    public final void s8() {
        IdeaPinCameraToggle ideaPinCameraToggle = this.E0;
        if (ideaPinCameraToggle == null) {
            Intrinsics.r("toggleView");
            throw null;
        }
        ideaPinCameraToggle.setVisibility(0);
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.G0;
        if (ideaPinCreationCameraVideoSegmentsView != null) {
            ideaPinCreationCameraVideoSegmentsView.setVisibility(8);
        } else {
            Intrinsics.r("cameraSegmentsView");
            throw null;
        }
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap hashMap = new HashMap();
        ag1.h hVar = this.f119175k0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        hashMap.put("idea_pin_creation_session_id", hVar.a().c());
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
        if (v03 != null) {
            hashMap.put("entry_type", v03);
        }
        return hashMap;
    }

    public final void t8() {
        z zVar = this.J0;
        if (zVar == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        zVar.w(s.COUNTDOWN);
        this.f119180p0.v(true);
        CameraSidebarControlsView cameraSidebarControlsView = this.I0;
        if (cameraSidebarControlsView == null) {
            Intrinsics.r("cameraSidebarControls");
            throw null;
        }
        cameraSidebarControlsView.g();
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.G0;
        if (ideaPinCreationCameraVideoSegmentsView == null) {
            Intrinsics.r("cameraSegmentsView");
            throw null;
        }
        bs1.c.X0(ideaPinCreationCameraVideoSegmentsView);
        st0.c g83 = g8();
        CameraSidebarControlsView cameraSidebarControlsView2 = this.I0;
        if (cameraSidebarControlsView2 != null) {
            g83.c(cameraSidebarControlsView2.f());
        } else {
            Intrinsics.r("cameraSidebarControls");
            throw null;
        }
    }

    public final void u8(Navigation navigation) {
        lu1.d a73 = a7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intent b13 = a73.b(requireContext, lu1.a.MAIN_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_PENDING_TASK", navigation);
        b13.putExtra("com.pinterest.EXTRA_SKIP_HOME_SCREEN", true);
        b13.putExtra("com.pinterest.EXTRA_NO_BOTTOM_NAV_INFLATION", true);
        requireContext().startActivity(b13);
    }

    public final void v8(Function1 function1) {
        if (this.f119180p0.o()) {
            fp0.d dVar = this.f119189y0;
            if (dVar != null) {
                dVar.l(new d0(this, 15), new ba.u(1, this, function1));
            } else {
                Intrinsics.r("cameraView");
                throw null;
            }
        }
    }

    public final void w8() {
        LegacyPlayerView legacyPlayerView = this.B0;
        if (legacyPlayerView == null) {
            Intrinsics.r("cameraPlaybackView");
            throw null;
        }
        legacyPlayerView.setAlpha(1.0f);
        legacyPlayerView.setVisibility(8);
        z zVar = this.J0;
        if (zVar != null) {
            zVar.d();
        } else {
            Intrinsics.r("cameraController");
            throw null;
        }
    }

    public final void x8() {
        LegacyPlayerView legacyPlayerView = this.B0;
        if (legacyPlayerView == null) {
            Intrinsics.r("cameraPlaybackView");
            throw null;
        }
        legacyPlayerView.setVisibility(0);
        legacyPlayerView.setAlpha(1.0f);
        legacyPlayerView.setScaleX(1.0f);
        ((IdeaPinCreationCameraSpeedControlView) this.K0.getValue()).setVisibility(8);
    }

    public final void y8() {
        long currentTimeMillis = System.currentTimeMillis();
        m8(ag1.g.CAMERA_TAKE_PHOTO_START, null, null);
        int i13 = 1;
        this.R0 = true;
        CameraSidebarControlsView cameraSidebarControlsView = this.I0;
        if (cameraSidebarControlsView == null) {
            Intrinsics.r("cameraSidebarControls");
            throw null;
        }
        bs1.c.X0(cameraSidebarControlsView);
        if (l8()) {
            IdeaPinCameraToggle ideaPinCameraToggle = this.E0;
            if (ideaPinCameraToggle == null) {
                Intrinsics.r("toggleView");
                throw null;
            }
            bs1.c.X0(ideaPinCameraToggle);
        }
        GestaltText gestaltText = this.f119183s0;
        if (gestaltText == null) {
            Intrinsics.r("titleText");
            throw null;
        }
        bs1.c.X0(gestaltText);
        fp0.d dVar = this.f119189y0;
        if (dVar != null) {
            dVar.d(new k0(this, currentTimeMillis, 0), new k0(this, currentTimeMillis, i13));
        } else {
            Intrinsics.r("cameraView");
            throw null;
        }
    }

    public final void z8() {
        String string;
        GestaltText gestaltText = this.f119183s0;
        if (gestaltText == null) {
            Intrinsics.r("titleText");
            throw null;
        }
        rt0.b bVar = this.f119180p0;
        if (bVar.m()) {
            string = gestaltText.getContext().getString(aq1.h.idea_pin_take_photo);
        } else if (bVar.o()) {
            int c13 = ml2.c.c(((bo0) d7.b.j0(bVar.h())).getF36143i() / 1000.0f);
            long j13 = c13 / 60;
            long j14 = c13 % 60;
            Resources resources = gestaltText.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String I = f0.h.I(resources, j13);
            Resources resources2 = gestaltText.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            String I2 = f0.h.I(resources2, j14);
            if (j14 < 10) {
                Resources resources3 = gestaltText.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                I2 = a.a.C(f0.h.I(resources3, 0L), I2);
            }
            string = a.a.D(I, ":", I2);
        } else if (bVar.f()) {
            Resources resources4 = gestaltText.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            string = gestaltText.getResources().getString(aq1.h.idea_pin_camera_title_minutes, f0.h.z(resources4, Math.max(0L, bVar.g()), false, 8));
        } else {
            string = gestaltText.getContext().getString(aq1.h.idea_pin_camera_title_hit_duration_limit_minutes, 5);
        }
        Intrinsics.f(string);
        pk.a0.p(gestaltText, string);
    }
}
