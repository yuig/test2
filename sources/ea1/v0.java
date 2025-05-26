package ea1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lea1/v0;", "Lnl1/d;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class v0 extends r1 {
    public static final /* synthetic */ int F0 = 0;
    public GestaltButton A0;
    public GestaltListAction B0;
    public String C0;
    public final j0 D0;
    public final d4 E0;

    /* renamed from: c0, reason: collision with root package name */
    public final androidx.lifecycle.m1 f58143c0;

    /* renamed from: d0, reason: collision with root package name */
    public SettingsRoundHeaderView f58144d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltText f58145e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltText f58146f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltButton f58147g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltSpinner f58148h0;

    /* renamed from: i0, reason: collision with root package name */
    public ConstraintLayout f58149i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltListAction f58150j0;

    /* renamed from: k0, reason: collision with root package name */
    public ScrollView f58151k0;

    /* renamed from: l0, reason: collision with root package name */
    public ConstraintLayout f58152l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f58153m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltButton f58154n0;

    /* renamed from: o0, reason: collision with root package name */
    public ConstraintLayout f58155o0;

    /* renamed from: p0, reason: collision with root package name */
    public ViewGroup f58156p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltListAction f58157q0;

    /* renamed from: r0, reason: collision with root package name */
    public ViewGroup f58158r0;

    /* renamed from: s0, reason: collision with root package name */
    public GestaltListAction f58159s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltListAction f58160t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltText f58161u0;

    /* renamed from: v0, reason: collision with root package name */
    public LinearLayout f58162v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltIconButton f58163w0;

    /* renamed from: x0, reason: collision with root package name */
    public ConstraintLayout f58164x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltIcon f58165y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltText f58166z0;

    public v0() {
        int i13 = 0;
        xk2.k r13 = d7.g.r(4, new t0(this, i13), xk2.n.NONE);
        int i14 = 1;
        this.f58143c0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(q1.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        this.D0 = new j0(this);
        this.E0 = d4.SETTINGS;
    }

    public static final CardView Y7(v0 v0Var, int i13) {
        v0Var.getClass();
        CardView cardView = new CardView(v0Var.requireContext(), null);
        ImageView imageView = new ImageView(cardView.getContext());
        int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(eo1.c.space_300);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(dl2.b.G0(imageView, eo1.a.comp_listaction_startitem_image_size), dl2.b.G0(imageView, eo1.a.comp_listaction_startitem_image_size));
        imageView.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        imageView.setLayoutParams(layoutParams);
        Context context = imageView.getContext();
        Object obj = d5.a.f53679a;
        imageView.setImageDrawable(context.getDrawable(i13));
        imageView.setBackgroundColor(v0Var.requireContext().getColor(eo1.b.color_gray_200));
        cardView.addView(imageView);
        cardView.t(dl2.b.E0(cardView, eo1.a.comp_listaction_startitem_image_border_radius));
        cardView.setLayoutParams(new ConstraintLayout.LayoutParams(dl2.b.G0(cardView, eo1.a.comp_listaction_startitem_image_size), dl2.b.G0(cardView, eo1.a.comp_listaction_startitem_image_size)));
        return cardView;
    }

    public static final String Z7(v0 v0Var, boolean z13, ba baVar, v7 v7Var) {
        v0Var.getClass();
        if (z13) {
            String string = v0Var.getString(m60.x0.profile);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if ((baVar != null ? baVar.A() : null) != null) {
            String A = baVar.A();
            Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
            return A;
        }
        if ((v7Var != null ? v7Var.j1() : null) != null) {
            String j13 = v7Var.j1();
            Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
            return j13;
        }
        String string2 = v0Var.getString(c52.e.social_board);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final e82.w a8() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE") : null;
        e82.w wVar = e82.w.INSTAGRAM;
        return Intrinsics.d(v03, wVar.getApiParam()) ? wVar : e82.w.NONE;
    }

    public final q1 b8() {
        return (q1) this.f58143c0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF88232k0() {
        return this.E0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(b8().c(), 23);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_claim_redesign;
        f7().h(this.D0);
        b8().h(a8());
        Navigation navigation = this.I;
        if (navigation == null || !navigation.S("com.pinterest.EXTRA_IS_RECONNECT_FLOW", false)) {
            return;
        }
        Navigation navigation2 = this.I;
        if (navigation2 != null) {
            navigation2.Y1("com.pinterest.EXTRA_IS_RECONNECT_FLOW", false);
        }
        q1 b83 = b8();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        kh2.j.x2(b83, new x(bs1.c.m(requireActivity)));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f7().j(this.D0);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String str = this.C0;
        if (str != null) {
            kh2.j.x2(b8(), new r(str));
            this.C0 = null;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(b52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f58144d0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = v13.findViewById(b52.a.title_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f58145e0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(b52.a.description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f58146f0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(b52.a.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f58147g0 = (GestaltButton) findViewById4;
        View findViewById5 = v13.findViewById(b52.a.progress_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f58148h0 = (GestaltSpinner) findViewById5;
        View findViewById6 = v13.findViewById(b52.a.unclaimed_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f58149i0 = (ConstraintLayout) findViewById6;
        View findViewById7 = v13.findViewById(b52.a.unclaim_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f58150j0 = (GestaltListAction) findViewById7;
        View findViewById8 = v13.findViewById(b52.a.claimed_container);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f58151k0 = (ScrollView) findViewById8;
        View findViewById9 = v13.findViewById(b52.a.error_container);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f58152l0 = (ConstraintLayout) findViewById9;
        View findViewById10 = v13.findViewById(b52.a.error_text);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f58153m0 = (GestaltText) findViewById10;
        View findViewById11 = v13.findViewById(b52.a.reconnect_button);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f58154n0 = (GestaltButton) findViewById11;
        View findViewById12 = v13.findViewById(b52.a.board_container);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f58155o0 = (ConstraintLayout) findViewById12;
        View findViewById13 = v13.findViewById(b52.a.pause_container);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById13;
        this.f58156p0 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.r("pauseContainer");
            throw null;
        }
        View findViewById14 = viewGroup.findViewById(b52.a.pause_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f58157q0 = (GestaltListAction) findViewById14;
        View findViewById15 = v13.findViewById(b52.a.auto_controls_container);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById15;
        this.f58158r0 = viewGroup2;
        if (viewGroup2 == null) {
            Intrinsics.r("autoControlsContainer");
            throw null;
        }
        View findViewById16 = viewGroup2.findViewById(b52.a.auto_publish_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.f58159s0 = (GestaltListAction) findViewById16;
        ViewGroup viewGroup3 = this.f58158r0;
        if (viewGroup3 == null) {
            Intrinsics.r("autoControlsContainer");
            throw null;
        }
        View findViewById17 = viewGroup3.findViewById(b52.a.auto_org_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.f58160t0 = (GestaltListAction) findViewById17;
        ViewGroup viewGroup4 = this.f58158r0;
        if (viewGroup4 == null) {
            Intrinsics.r("autoControlsContainer");
            throw null;
        }
        View findViewById18 = viewGroup4.findViewById(b52.a.learn_more_text);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        this.f58161u0 = (GestaltText) findViewById18;
        View findViewById19 = v13.findViewById(b52.a.private_board_cancel_button);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        this.f58163w0 = (GestaltIconButton) findViewById19;
        View findViewById20 = v13.findViewById(b52.a.private_board_container);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        this.f58162v0 = (LinearLayout) findViewById20;
        View findViewById21 = v13.findViewById(b52.a.api_migration_error_container);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.f58164x0 = (ConstraintLayout) findViewById21;
        View findViewById22 = v13.findViewById(b52.a.api_migration_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.f58165y0 = (GestaltIcon) findViewById22;
        View findViewById23 = v13.findViewById(b52.a.api_migration_error_text);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        this.f58166z0 = (GestaltText) findViewById23;
        View findViewById24 = v13.findViewById(b52.a.api_migration_action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        this.A0 = (GestaltButton) findViewById24;
        View findViewById25 = v13.findViewById(b52.a.board_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById25, "findViewById(...)");
        this.B0 = (GestaltListAction) findViewById25;
        SettingsRoundHeaderView settingsRoundHeaderView = this.f58144d0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        final int i13 = 2;
        settingsRoundHeaderView.f51780e = new View.OnClickListener(this) { // from class: ea1.f0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f58050b;

            {
                this.f58050b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                v0 this$0 = this.f58050b;
                switch (i14) {
                    case 0:
                        int i15 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.b8(), k.f58069a);
                        break;
                    case 1:
                        int i16 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.b8(), t.f58136a);
                        break;
                    default:
                        int i17 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                }
            }
        };
        settingsRoundHeaderView.k0(b52.c.claimed_accounts);
        settingsRoundHeaderView.setElevation(0.0f);
        final int i14 = 1;
        Integer valueOf = i0.f58063a[a8().ordinal()] == 1 ? Integer.valueOf(c52.e.settings_claimed_accounts_instagram_title) : null;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            GestaltText gestaltText = this.f58145e0;
            if (gestaltText == null) {
                Intrinsics.r("title");
                throw null;
            }
            gestaltText.i(new zx0.d(intValue, 18));
        }
        GestaltText gestaltText2 = this.f58146f0;
        if (gestaltText2 == null) {
            Intrinsics.r("description");
            throw null;
        }
        gestaltText2.i(new y71.b(12, gestaltText2, this));
        GestaltButton gestaltButton = this.f58147g0;
        if (gestaltButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        final int i15 = 0;
        gestaltButton.e(new e0(this, i15));
        GestaltButton gestaltButton2 = this.f58154n0;
        if (gestaltButton2 == null) {
            Intrinsics.r("reconnectButton");
            throw null;
        }
        gestaltButton2.e(new e0(this, i14));
        ConstraintLayout constraintLayout = this.f58155o0;
        if (constraintLayout == null) {
            Intrinsics.r("boardContainer");
            throw null;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ea1.f0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f58050b;

            {
                this.f58050b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i15;
                v0 this$0 = this.f58050b;
                switch (i142) {
                    case 0:
                        int i152 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.b8(), k.f58069a);
                        break;
                    case 1:
                        int i16 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.b8(), t.f58136a);
                        break;
                    default:
                        int i17 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                }
            }
        });
        GestaltListAction gestaltListAction = this.f58157q0;
        if (gestaltListAction == null) {
            Intrinsics.r("pauseToggle");
            throw null;
        }
        gestaltListAction.X(new CompoundButton.OnCheckedChangeListener(this) { // from class: ea1.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f58054b;

            {
                this.f58054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                int i16 = i15;
                v0 this$0 = this.f58054b;
                switch (i16) {
                    case 0:
                        int i17 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new g(true));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new g(false));
                            break;
                        }
                    case 1:
                        int i18 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new g(false));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new g(true));
                            break;
                        }
                    default:
                        int i19 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new e(false));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new e(true));
                            break;
                        }
                }
            }
        });
        GestaltIconButton gestaltIconButton = this.f58163w0;
        if (gestaltIconButton == null) {
            Intrinsics.r("privateBoardCancelButton");
            throw null;
        }
        com.bumptech.glide.c.m(gestaltIconButton, new p0(this, i15));
        GestaltButton gestaltButton3 = this.A0;
        if (gestaltButton3 == null) {
            Intrinsics.r("instagramApiBannerActionButton");
            throw null;
        }
        gestaltButton3.e(new e0(this, i13));
        GestaltListAction gestaltListAction2 = this.f58159s0;
        if (gestaltListAction2 == null) {
            Intrinsics.r("autoPublishToggle");
            throw null;
        }
        gestaltListAction2.X(new CompoundButton.OnCheckedChangeListener(this) { // from class: ea1.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f58054b;

            {
                this.f58054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                int i16 = i14;
                v0 this$0 = this.f58054b;
                switch (i16) {
                    case 0:
                        int i17 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new g(true));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new g(false));
                            break;
                        }
                    case 1:
                        int i18 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new g(false));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new g(true));
                            break;
                        }
                    default:
                        int i19 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new e(false));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new e(true));
                            break;
                        }
                }
            }
        });
        GestaltListAction gestaltListAction3 = this.f58160t0;
        if (gestaltListAction3 == null) {
            Intrinsics.r("autoOrgToggle");
            throw null;
        }
        gestaltListAction3.X(new CompoundButton.OnCheckedChangeListener(this) { // from class: ea1.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f58054b;

            {
                this.f58054b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                int i16 = i13;
                v0 this$0 = this.f58054b;
                switch (i16) {
                    case 0:
                        int i17 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new g(true));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new g(false));
                            break;
                        }
                    case 1:
                        int i18 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new g(false));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new g(true));
                            break;
                        }
                    default:
                        int i19 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z13) {
                            kh2.j.x2(this$0.b8(), new e(false));
                            break;
                        } else {
                            kh2.j.x2(this$0.b8(), new e(true));
                            break;
                        }
                }
            }
        });
        GestaltText gestaltText3 = this.f58161u0;
        if (gestaltText3 == null) {
            Intrinsics.r("learnMoreText");
            throw null;
        }
        gestaltText3.k(new View.OnClickListener(this) { // from class: ea1.f0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f58050b;

            {
                this.f58050b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                v0 this$0 = this.f58050b;
                switch (i142) {
                    case 0:
                        int i152 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.b8(), k.f58069a);
                        break;
                    case 1:
                        int i16 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.b8(), t.f58136a);
                        break;
                    default:
                        int i17 = v0.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                }
            }
        });
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new n0(this, null), 3);
    }
}
