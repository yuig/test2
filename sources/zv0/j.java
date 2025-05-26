package zv0;

import a7.v0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.q0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import com.pinterest.feature.ideaPinCreation.closeup.view.e1;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingDragger;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingTimeScale;
import com.pinterest.feature.pin.creation.view.ThumbnailScrubberPreview;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import h32.d4;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import nx.d0;
import nx.f0;
import om1.l;
import pk.a0;
import so.n;
import tb0.p;
import xk2.m;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzv0/j;", "Lyq0/b0;", "", "Lvv0/c;", "Lvv0/b;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes.dex */
public final class j extends a<Object> implements vv0.c, vv0.b {

    /* renamed from: k1, reason: collision with root package name */
    public static final /* synthetic */ int f142878k1 = 0;
    public s1 A0;
    public ag1.h B0;
    public GestaltButton C0;
    public GestaltText D0;
    public GestaltButton E0;
    public RoundedCornersLayout F0;
    public IdeaPinEditablePageLite G0;
    public ImageView H0;
    public IdeaPinCreationCameraSpeedControlView I0;
    public ConstraintLayout J0;
    public GestaltText K0;
    public GestaltIconButton L0;
    public GestaltText M0;
    public ThumbnailScrubberPreview N0;
    public ImageView O0;
    public IdeaPinVideoTrimmingDragger P0;
    public FrameLayout Q0;
    public IdeaPinVideoTrimmingTimeScale R0;
    public PinterestRecyclerView S0;
    public du0.b T0;
    public final xk2.k U0;
    public final xk2.k V0;
    public final xk2.k W0;
    public List X0;
    public int Y0;
    public long Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f142879a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f142880b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f142881c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f142882d1;

    /* renamed from: e1, reason: collision with root package name */
    public final LinkedHashMap f142883e1;

    /* renamed from: f1, reason: collision with root package name */
    public vv0.e f142884f1;

    /* renamed from: g1, reason: collision with root package name */
    public final ar0.c f142885g1;

    /* renamed from: h1, reason: collision with root package name */
    public final q0 f142886h1;

    /* renamed from: i1, reason: collision with root package name */
    public final v f142887i1;

    /* renamed from: j1, reason: collision with root package name */
    public final d4 f142888j1;

    /* renamed from: z0, reason: collision with root package name */
    public n f142889z0;

    public j() {
        xk2.n nVar = xk2.n.NONE;
        this.U0 = m.a(nVar, new h(this, 3));
        this.V0 = m.a(nVar, new h(this, 0));
        this.W0 = m.a(nVar, new h(this, 2));
        this.f142883e1 = new LinkedHashMap();
        ar0.c cVar = new ar0.c();
        this.f142885g1 = cVar;
        this.f142886h1 = new q0(cVar);
        this.f142887i1 = m.b(new h(this, 1));
        this.f142888j1 = d4.STORY_PIN_PAGE_TRIMMER_TOOL;
    }

    public static final boolean U8(j jVar, int i13, long j13) {
        int i14 = jVar.Y0;
        boolean z13 = i13 < i14 || (i13 == i14 && j13 < jVar.Z0);
        int i15 = jVar.f142879a1;
        return z13 || (i13 > i15 || (i13 == i15 && (j13 > jVar.f142880b1 ? 1 : (j13 == jVar.f142880b1 ? 0 : -1)) > 0));
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        super.L7();
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(0, new xo0.i(requireContext, 22));
        adapter.G(1, new xo0.i(requireContext, 23));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        f0 b73 = b7();
        ag1.h hVar = this.B0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
        Navigation navigation2 = this.I;
        this.T0 = new du0.b(b73, hVar, this.f142888j1, v03, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false);
        n nVar = this.f142889z0;
        if (nVar == null) {
            Intrinsics.r("storyPinVideoTrimmingPresenterFactory");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        du0.b bVar = this.T0;
        if (bVar != null) {
            return nVar.a(this, aVar, bVar);
        }
        Intrinsics.r("presenterPinalytics");
        throw null;
    }

    public final float V8() {
        return ((Number) this.V0.getValue()).floatValue();
    }

    public final void W8(int i13, long j13) {
        try {
            IdeaPinEditablePageLite ideaPinEditablePageLite = this.G0;
            if (ideaPinEditablePageLite != null) {
                ideaPinEditablePageLite.L0(i13, j13);
            } else {
                Intrinsics.r("pageView");
                throw null;
            }
        } catch (IllegalSeekPositionException e13) {
            b6().q(e13, "StoryPinVideoTrimmingFragment: Failed to seek to mediaIndex=" + i13 + ", timeMs=" + j13, p.IDEA_PINS_CREATION);
        }
    }

    public final void X8(int i13) {
        ImageView imageView = this.O0;
        if (imageView == null) {
            Intrinsics.r("scrubber");
            throw null;
        }
        int width = i13 - (imageView.getWidth() / 2);
        ImageView imageView2 = this.O0;
        if (imageView2 != null) {
            k3.Z1(imageView2, 1, width);
        } else {
            Intrinsics.r("scrubber");
            throw null;
        }
    }

    public final void Y8(int i13, Bitmap bitmap) {
        ThumbnailScrubberPreview thumbnailScrubberPreview = this.N0;
        if (thumbnailScrubberPreview != null) {
            thumbnailScrubberPreview.g(i13, bitmap);
        } else {
            Intrinsics.r("thumbnailScrubberPreview");
            throw null;
        }
    }

    public final void Z8(int i13) {
        int dimensionPixelSize = ((i13 + 1) * getResources().getDimensionPixelSize(eo1.c.space_200)) + (bs1.c.X(this, aq1.b.idea_pin_video_clip_cell_size) * i13);
        if (dimensionPixelSize < hf0.b.f69002b) {
            PinterestRecyclerView pinterestRecyclerView = this.S0;
            if (pinterestRecyclerView == null) {
                Intrinsics.r("clipRecyclerView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = pinterestRecyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = dimensionPixelSize;
            pinterestRecyclerView.setLayoutParams(layoutParams2);
            return;
        }
        PinterestRecyclerView pinterestRecyclerView2 = this.S0;
        if (pinterestRecyclerView2 == null) {
            Intrinsics.r("clipRecyclerView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = pinterestRecyclerView2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = -1;
        pinterestRecyclerView2.setLayoutParams(layoutParams4);
    }

    public final void a9(float f13, float f14) {
        IdeaPinVideoTrimmingDragger ideaPinVideoTrimmingDragger = this.P0;
        if (ideaPinVideoTrimmingDragger == null) {
            Intrinsics.r("scrubberDragger");
            throw null;
        }
        ideaPinVideoTrimmingDragger.h(f13);
        IdeaPinVideoTrimmingDragger ideaPinVideoTrimmingDragger2 = this.P0;
        if (ideaPinVideoTrimmingDragger2 != null) {
            ideaPinVideoTrimmingDragger2.i(f14);
        } else {
            Intrinsics.r("scrubberDragger");
            throw null;
        }
    }

    public final void b9(long j13) {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String z13 = f0.h.z(resources, j13, false, 12);
        GestaltText gestaltText = this.K0;
        if (gestaltText != null) {
            gestaltText.i(new r0(24, this, z13));
        } else {
            Intrinsics.r("durationTv");
            throw null;
        }
    }

    public final void c9(boolean z13) {
        GestaltIconButton gestaltIconButton = this.L0;
        if (gestaltIconButton == null) {
            Intrinsics.r("deleteClipButton");
            throw null;
        }
        gestaltIconButton.t(new dv0.n(z13, 6));
        if (((Boolean) this.f142887i1.getValue()).booleanValue()) {
            ImageView imageView = this.H0;
            if (imageView == null) {
                Intrinsics.r("speedButton");
                throw null;
            }
            imageView.setVisibility(z13 ? 0 : 8);
            imageView.setSelected(false);
            IdeaPinCreationCameraSpeedControlView ideaPinCreationCameraSpeedControlView = this.I0;
            if (ideaPinCreationCameraSpeedControlView != null) {
                ideaPinCreationCameraSpeedControlView.setVisibility(8);
            } else {
                Intrinsics.r("speedControls");
                throw null;
            }
        }
    }

    public final void d9(long j13, boolean z13) {
        this.f142881c1 = j13;
        IdeaPinVideoTrimmingTimeScale ideaPinVideoTrimmingTimeScale = this.R0;
        if (ideaPinVideoTrimmingTimeScale == null) {
            Intrinsics.r("timeScale");
            throw null;
        }
        ideaPinVideoTrimmingTimeScale.T(j13);
        if (j13 != 0) {
            float f13 = j13;
            float min = (Math.min(1000L, j13) * 1.0f) / f13;
            if (z13) {
                j13 = Math.min(pp2.a.u(), j13);
            }
            float f14 = (j13 * 1.0f) / f13;
            IdeaPinVideoTrimmingDragger ideaPinVideoTrimmingDragger = this.P0;
            if (ideaPinVideoTrimmingDragger != null) {
                ideaPinVideoTrimmingDragger.f(min, f14);
            } else {
                Intrinsics.r("scrubberDragger");
                throw null;
            }
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getS1() {
        return this.f142888j1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(aq1.f.fragment_idea_pin_video_trimming, aq1.d.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.cancel_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.C0 = (GestaltButton) findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.header);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.D0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(aq1.d.done_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.E0 = (GestaltButton) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.rounded_corner_video_view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.F0 = (RoundedCornersLayout) findViewById4;
        View findViewById5 = onCreateView.findViewById(aq1.d.editable_page_lite);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.G0 = (IdeaPinEditablePageLite) findViewById5;
        View findViewById6 = onCreateView.findViewById(aq1.d.speed_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.H0 = (ImageView) findViewById6;
        View findViewById7 = onCreateView.findViewById(aq1.d.speed_controls);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.I0 = (IdeaPinCreationCameraSpeedControlView) findViewById7;
        View findViewById8 = onCreateView.findViewById(aq1.d.image_to_clip_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.M0 = (GestaltText) findViewById8;
        View findViewById9 = onCreateView.findViewById(aq1.d.duration_section_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.J0 = (ConstraintLayout) findViewById9;
        View findViewById10 = onCreateView.findViewById(aq1.d.duration_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.K0 = (GestaltText) findViewById10;
        View findViewById11 = onCreateView.findViewById(aq1.d.delete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.L0 = (GestaltIconButton) findViewById11;
        View findViewById12 = onCreateView.findViewById(aq1.d.scrubber_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.N0 = (ThumbnailScrubberPreview) findViewById12;
        View findViewById13 = onCreateView.findViewById(aq1.d.scrubber);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.O0 = (ImageView) findViewById13;
        View findViewById14 = onCreateView.findViewById(aq1.d.scrubber_dragger);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.P0 = (IdeaPinVideoTrimmingDragger) findViewById14;
        View findViewById15 = onCreateView.findViewById(aq1.d.trimmer_view);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.Q0 = (FrameLayout) findViewById15;
        View findViewById16 = onCreateView.findViewById(aq1.d.time_scale);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.R0 = (IdeaPinVideoTrimmingTimeScale) findViewById16;
        View findViewById17 = onCreateView.findViewById(aq1.d.p_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.S0 = (PinterestRecyclerView) findViewById17;
        GestaltText gestaltText = this.D0;
        if (gestaltText == null) {
            Intrinsics.r("header");
            throw null;
        }
        String string = onCreateView.getContext().getString(aq1.h.idea_pin_trimming_header_minutes, 5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(gestaltText, string);
        GestaltButton gestaltButton = this.C0;
        if (gestaltButton == null) {
            Intrinsics.r("cancelButton");
            throw null;
        }
        gestaltButton.d(c.f142852l);
        final int i13 = 0;
        gestaltButton.e(new gm1.a(this) { // from class: zv0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f142871b;

            {
                this.f142871b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                vv0.e eVar;
                int i14 = i13;
                j this$0 = this.f142871b;
                switch (i14) {
                    case 0:
                        int i15 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        vv0.e eVar2 = this$0.f142884f1;
                        if (eVar2 != null) {
                            ((yv0.c) eVar2).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i16 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        vv0.e eVar3 = this$0.f142884f1;
                        if (eVar3 != null) {
                            ((yv0.c) eVar3).F3();
                            break;
                        }
                        break;
                    default:
                        int i17 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (eVar = this$0.f142884f1) != null) {
                            ((yv0.c) eVar).D3();
                            break;
                        }
                        break;
                }
            }
        });
        GestaltButton gestaltButton2 = this.E0;
        if (gestaltButton2 == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        gestaltButton2.d(c.f142853m);
        final int i14 = 1;
        gestaltButton2.e(new gm1.a(this) { // from class: zv0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f142871b;

            {
                this.f142871b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                vv0.e eVar;
                int i142 = i14;
                j this$0 = this.f142871b;
                switch (i142) {
                    case 0:
                        int i15 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        vv0.e eVar2 = this$0.f142884f1;
                        if (eVar2 != null) {
                            ((yv0.c) eVar2).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i16 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        vv0.e eVar3 = this$0.f142884f1;
                        if (eVar3 != null) {
                            ((yv0.c) eVar3).F3();
                            break;
                        }
                        break;
                    default:
                        int i17 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (eVar = this$0.f142884f1) != null) {
                            ((yv0.c) eVar).D3();
                            break;
                        }
                        break;
                }
            }
        });
        if (((Boolean) this.f142887i1.getValue()).booleanValue()) {
            ImageView imageView = this.H0;
            if (imageView == null) {
                Intrinsics.r("speedButton");
                throw null;
            }
            k3.Z1(imageView, 1, (int) V8());
            imageView.setOnClickListener(new g(this, i13));
            IdeaPinCreationCameraSpeedControlView ideaPinCreationCameraSpeedControlView = this.I0;
            if (ideaPinCreationCameraSpeedControlView == null) {
                Intrinsics.r("speedControls");
                throw null;
            }
            ideaPinCreationCameraSpeedControlView.g0(new i(this, i13));
        }
        GestaltIconButton gestaltIconButton = this.L0;
        if (gestaltIconButton == null) {
            Intrinsics.r("deleteClipButton");
            throw null;
        }
        final int i15 = 2;
        k3.Z1(gestaltIconButton, 2, (int) (V8() - gestaltIconButton.getResources().getDimension(eo1.c.space_200)));
        gestaltIconButton.u(new gm1.a(this) { // from class: zv0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f142871b;

            {
                this.f142871b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                vv0.e eVar;
                int i142 = i15;
                j this$0 = this.f142871b;
                switch (i142) {
                    case 0:
                        int i152 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        vv0.e eVar2 = this$0.f142884f1;
                        if (eVar2 != null) {
                            ((yv0.c) eVar2).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i16 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        vv0.e eVar3 = this$0.f142884f1;
                        if (eVar3 != null) {
                            ((yv0.c) eVar3).F3();
                            break;
                        }
                        break;
                    default:
                        int i17 = j.f142878k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (eVar = this$0.f142884f1) != null) {
                            ((yv0.c) eVar).D3();
                            break;
                        }
                        break;
                }
            }
        });
        IdeaPinEditablePageLite ideaPinEditablePageLite = this.G0;
        if (ideaPinEditablePageLite == null) {
            Intrinsics.r("pageView");
            throw null;
        }
        du0.b bVar = this.T0;
        if (bVar == null) {
            Intrinsics.r("presenterPinalytics");
            throw null;
        }
        d0 d0Var = bVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        ideaPinEditablePageLite.setPinalytics(d0Var);
        IdeaPinEditablePageLite ideaPinEditablePageLite2 = this.G0;
        if (ideaPinEditablePageLite2 == null) {
            Intrinsics.r("pageView");
            throw null;
        }
        ideaPinEditablePageLite2.t0(new e1(this, 2));
        ThumbnailScrubberPreview thumbnailScrubberPreview = this.N0;
        if (thumbnailScrubberPreview == null) {
            Intrinsics.r("thumbnailScrubberPreview");
            throw null;
        }
        thumbnailScrubberPreview.e();
        thumbnailScrubberPreview.b();
        ImageView imageView2 = this.O0;
        if (imageView2 == null) {
            Intrinsics.r("scrubber");
            throw null;
        }
        X8((int) V8());
        imageView2.setOnTouchListener((View.OnTouchListener) this.W0.getValue());
        cp.b bVar2 = new cp.b(this, 24);
        getContext();
        J8(new PinterestLinearLayoutManager(bVar2, 0, false));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        a8(new pw0.d(j1.Y0(requireContext)));
        this.f142886h1.i(g8());
        Navigation navigation = this.I;
        if (navigation != null && navigation.S("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false)) {
            GestaltText gestaltText2 = this.D0;
            if (gestaltText2 == null) {
                Intrinsics.r("header");
                throw null;
            }
            a0.w1(gestaltText2);
            GestaltButton gestaltButton3 = this.C0;
            if (gestaltButton3 == null) {
                Intrinsics.r("cancelButton");
                throw null;
            }
            Intrinsics.checkNotNullParameter(gestaltButton3, "<this>");
            gestaltButton3.d(yl1.k.f139345j);
            GestaltButton gestaltButton4 = this.E0;
            if (gestaltButton4 == null) {
                Intrinsics.r("doneButton");
                throw null;
            }
            gestaltButton4.d(c.f142854n);
        }
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IdeaPinEditablePageLite ideaPinEditablePageLite = this.G0;
        if (ideaPinEditablePageLite == null) {
            Intrinsics.r("pageView");
            throw null;
        }
        v0 T = ideaPinEditablePageLite.T();
        if (T != null) {
            T.pause();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
        IdeaPinEditablePageLite ideaPinEditablePageLite = this.G0;
        if (ideaPinEditablePageLite == null) {
            Intrinsics.r("pageView");
            throw null;
        }
        v0 T = ideaPinEditablePageLite.T();
        if (T != null) {
            T.play();
        }
    }
}
