package tt0;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraBottomBarControlsView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarButtonView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import h32.f1;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;

/* loaded from: classes5.dex */
public final class z implements ut0.e, o {

    /* renamed from: a, reason: collision with root package name */
    public final IdeaPinCreationCameraBottomBarControlsView f119236a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraSidebarControlsView f119237b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f119238c;

    /* renamed from: d, reason: collision with root package name */
    public final xj2.b f119239d;

    /* renamed from: e, reason: collision with root package name */
    public t f119240e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f119241f;

    /* renamed from: g, reason: collision with root package name */
    public r f119242g;

    /* renamed from: h, reason: collision with root package name */
    public s f119243h;

    /* renamed from: i, reason: collision with root package name */
    public rt0.b f119244i;

    /* renamed from: j, reason: collision with root package name */
    public ObjectAnimator f119245j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f119246k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f119247l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f119248m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f119249n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f119250o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f119251p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f119252q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f119253r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f119254s;

    /* renamed from: t, reason: collision with root package name */
    public final xk2.v f119255t;

    /* renamed from: u, reason: collision with root package name */
    public final rt0.d f119256u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.v f119257v;

    public z(IdeaPinCreationCameraBottomBarControlsView bottomBar, CameraSidebarControlsView sidebar, s1 experiments, de0.d draftDataProvider, String userId) {
        Intrinsics.checkNotNullParameter(bottomBar, "bottomBar");
        Intrinsics.checkNotNullParameter(sidebar, "sidebar");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(draftDataProvider, "draftDataProvider");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f119236a = bottomBar;
        this.f119237b = sidebar;
        this.f119238c = sh.f.a();
        xj2.b bVar = new xj2.b();
        this.f119239d = bVar;
        this.f119240e = new t(j.f119127k, a.f119056p, j.f119128l, a.f119057q, j.f119129m, a.f119058r, j.f119130n, j.f119131o, j.f119132p);
        this.f119241f = experiments.f();
        this.f119242g = r.UNDECIDED;
        this.f119243h = s.RECORDING_STOPPED;
        final int i13 = 2;
        this.f119246k = xk2.m.b(new y(this, i13));
        int i14 = 4;
        this.f119247l = xk2.m.b(new y(this, i14));
        this.f119248m = xk2.m.b(new y(this, 6));
        this.f119249n = xk2.m.b(new y(this, 8));
        this.f119250o = xk2.m.b(new y(this, 7));
        final int i15 = 0;
        this.f119251p = xk2.m.b(new y(this, i15));
        int i16 = 5;
        this.f119252q = xk2.m.b(new y(this, i16));
        this.f119253r = xk2.m.b(new y(this, 9));
        final int i17 = 3;
        this.f119254s = xk2.m.b(new y(this, i17));
        final int i18 = 1;
        this.f119255t = xk2.m.b(new y(this, i18));
        x xVar = new x(this, i15);
        this.f119256u = new rt0.d(null, new x(this, i18), new x(this, i13), new x(this, i17), new x(this, i14), new x(this, i16), 1);
        this.f119257v = xk2.m.b(j.f119133q);
        k().setOnClickListener(new View.OnClickListener(this) { // from class: tt0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f119200b;

            {
                this.f119200b = listener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i19 = i15;
                z this$0 = this.f119200b;
                switch (i19) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                }
            }
        });
        m().setOnClickListener(new View.OnClickListener(this) { // from class: tt0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f119200b;

            {
                this.f119200b = listener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i19 = i18;
                z this$0 = this.f119200b;
                switch (i19) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                }
            }
        });
        o().setOnClickListener(new View.OnClickListener(this) { // from class: tt0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f119200b;

            {
                this.f119200b = listener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i19 = i13;
                z this$0 = this.f119200b;
                switch (i19) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                }
            }
        });
        r().setOnClickListener(new View.OnClickListener(this) { // from class: tt0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f119200b;

            {
                this.f119200b = listener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i19 = i17;
                z this$0 = this.f119200b;
                switch (i19) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                }
            }
        });
        final int i19 = 4;
        n().setOnClickListener(new View.OnClickListener(this) { // from class: tt0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f119200b;

            {
                this.f119200b = listener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i192 = i19;
                z this$0 = this.f119200b;
                switch (i192) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h().c(view);
                        break;
                }
            }
        });
        bVar.a(h().K(300L, TimeUnit.MILLISECONDS).A(wj2.c.a()).F(new kt0.x(8, xVar), new kt0.x(9, a.f119055o), ck2.i.f27923c, ck2.i.f27924d));
        Intrinsics.checkNotNullParameter(this, "listener");
        sidebar.f45957g = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        bottomBar.f45921g = this;
        x();
    }

    public static final void a(z zVar, rt0.b bVar) {
        zVar.getClass();
        r rVar = bVar.f109955g ? bVar.f109954f ? r.COUNTDOWN : r.PHOTO : bVar.f109951c ? r.NONE : bVar.f109952d ? r.ACTIVE_RECORDING : bVar.f109953e ? r.NONE : bVar.f109954f ? r.COUNTDOWN : bVar.j() ? r.CAMERA : r.UNDECIDED;
        if (rVar == zVar.f119242g) {
            return;
        }
        zVar.f119242g = rVar;
        zVar.x();
    }

    public static void s(z zVar, h32.u0 u0Var) {
        zVar.getClass();
        f1 f1Var = f1.TAP;
        h32.i0 i0Var = new h32.i0(d4.STORY_PIN_CAMERA, a4.STORY_PIN_CREATE, null, null, null, u0Var);
        nx.d0 d0Var = zVar.f119238c;
        Intrinsics.f(d0Var);
        d0Var.U(i0Var, f1Var, null, null, null, false);
    }

    public final void b() {
        ObjectAnimator objectAnimator = this.f119245j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f119245j = null;
    }

    public final void c() {
        this.f119239d.d();
    }

    public final void d() {
        m().setSelected(false);
    }

    public final void e(boolean z13) {
        k().setEnabled(!z13);
        m().setEnabled(false);
        o().setEnabled(false);
        p().setEnabled(false);
        q().setEnabled(false);
        CameraSidebarControlsView cameraSidebarControlsView = this.f119237b;
        CameraSidebarButtonView e13 = cameraSidebarControlsView.e();
        int i13 = CameraSidebarButtonView.f45946d;
        e13.L(true);
        cameraSidebarControlsView.d().L(true);
        cameraSidebarControlsView.c().L(true);
        cameraSidebarControlsView.b().L(true);
    }

    public final void g(boolean z13) {
        k().setEnabled(true);
        m().setEnabled(true);
        o().setEnabled(true);
        p().setEnabled(true);
        q().setEnabled(true);
        CameraSidebarControlsView cameraSidebarControlsView = this.f119237b;
        cameraSidebarControlsView.e().T();
        cameraSidebarControlsView.d().T();
        if (z13) {
            cameraSidebarControlsView.c().L(false);
        } else {
            cameraSidebarControlsView.c().T();
        }
        cameraSidebarControlsView.b().T();
    }

    public final uk2.f h() {
        return (uk2.f) this.f119257v.getValue();
    }

    public final GestaltText i() {
        return (GestaltText) this.f119251p.getValue();
    }

    public final CameraSidebarButtonView j() {
        return (CameraSidebarButtonView) this.f119255t.getValue();
    }

    public final ImageView k() {
        return (ImageView) this.f119246k.getValue();
    }

    public final CameraSidebarButtonView l() {
        return (CameraSidebarButtonView) this.f119254s.getValue();
    }

    public final ImageView m() {
        return (ImageView) this.f119247l.getValue();
    }

    public final CameraSidebarButtonView n() {
        return (CameraSidebarButtonView) this.f119252q.getValue();
    }

    public final FrameLayout o() {
        return (FrameLayout) this.f119248m.getValue();
    }

    public final ImageView p() {
        return (ImageView) this.f119250o.getValue();
    }

    public final View q() {
        return (View) this.f119249n.getValue();
    }

    public final CameraSidebarButtonView r() {
        return (CameraSidebarButtonView) this.f119253r.getValue();
    }

    public final void t() {
        m().setSelected(true);
    }

    public final void u(rt0.b bVar) {
        rt0.b bVar2 = this.f119244i;
        rt0.d listener = this.f119256u;
        if (bVar2 != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            bVar2.f109949a.remove(listener);
        }
        this.f119244i = bVar;
        if (bVar != null) {
            bVar.a(listener);
        }
    }

    public final void v(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f119240e = tVar;
    }

    public final void w(s value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119243h = value;
        int i13 = u.f119220b[value.ordinal()];
        if (i13 == 1) {
            pk.a0.k0(i());
            o().setVisibility(0);
            q();
            ObjectAnimator objectAnimator = this.f119245j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(q(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.95f, 1.05f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.95f, 1.05f));
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(500L);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.start();
            this.f119245j = ofPropertyValuesHolder;
            p().setImageDrawable(bs1.c.f0(p(), aq1.c.ic_story_creation_record_is_recording_nonpds, null, null, 6));
            return;
        }
        if (i13 == 2) {
            q();
            ObjectAnimator objectAnimator2 = this.f119245j;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(q(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f));
            ofPropertyValuesHolder2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder2.setDuration(100L);
            ofPropertyValuesHolder2.start();
            this.f119245j = ofPropertyValuesHolder2;
            p().setEnabled(false);
            p().setImageDrawable(bs1.c.f0(p(), aq1.c.ic_story_creation_record_not_recording_nonpds, null, null, 6));
            return;
        }
        if (i13 == 3) {
            p().setEnabled(true);
            pk.a0.k0(i());
            o().setVisibility(0);
        } else if (i13 == 4) {
            o().setVisibility(8);
            pk.a0.w1(i());
        } else {
            if (i13 != 5) {
                return;
            }
            p().setImageDrawable(bs1.c.f0(p(), aq1.c.ic_idea_pin_creation_photo_button_nonpds, null, null, 6));
        }
    }

    public final void x() {
        int i13 = u.f119219a[this.f119242g.ordinal()];
        boolean z13 = this.f119241f;
        switch (i13) {
            case 1:
                k().setVisibility(0);
                m().setVisibility(0);
                pk.a0.k0(i());
                o().setVisibility(0);
                if (z13) {
                    r().setVisibility(0);
                }
                l().setVisibility(0);
                j().setVisibility(0);
                n().setVisibility(0);
                return;
            case 2:
                k().setVisibility(8);
                m().setVisibility(8);
                pk.a0.k0(i());
                o().setVisibility(0);
                if (z13) {
                    r().setVisibility(8);
                }
                n().setVisibility(8);
                l().setVisibility(8);
                j().setVisibility(8);
                return;
            case 3:
                k().setVisibility(8);
                m().setVisibility(8);
                pk.a0.k0(i());
                o().setVisibility(0);
                if (z13) {
                    r().setVisibility(0);
                }
                l().setVisibility(0);
                j().setVisibility(0);
                n().setVisibility(0);
                return;
            case 4:
                k().setVisibility(8);
                m().setVisibility(8);
                pk.a0.k0(i());
                o().setVisibility(8);
                r().setVisibility(8);
                n().setVisibility(8);
                l().setVisibility(8);
                j().setVisibility(8);
                return;
            case 5:
                k().setVisibility(8);
                m().setVisibility(8);
                if (z13) {
                    r().setVisibility(8);
                }
                n().setVisibility(8);
                l().setVisibility(8);
                j().setVisibility(8);
                return;
            case 6:
                k().setVisibility(8);
                m().setVisibility(8);
                pk.a0.k0(i());
                o().setVisibility(0);
                if (z13) {
                    r().setVisibility(8);
                }
                l().setVisibility(0);
                j().setVisibility(0);
                n().setVisibility(0);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void y() {
        o().setContentDescription(this.f119243h == s.PHOTO ? bs1.c.b2(m60.x0.accessibility_camera_capture) : bs1.c.b2(m60.x0.accessibility_video_record));
    }
}
