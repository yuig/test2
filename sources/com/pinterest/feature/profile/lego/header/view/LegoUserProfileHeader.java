package com.pinterest.feature.profile.lego.header.view;

import a41.m;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view.InspirationalBadgeCarousel;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import h32.f1;
import h32.g0;
import h32.u0;
import h41.e;
import h41.f;
import h41.i;
import j41.g;
import j41.h;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import ll.j;
import lu1.b;
import nx.d0;
import nz1.c;
import nz1.d;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pw0.x;
import se2.a;
import uq.w;
import xk2.k;
import xk2.n;
import xk2.v;
import y31.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/profile/lego/header/view/LegoUserProfileHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lh41/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegoUserProfileHeader extends w implements e {
    public static final /* synthetic */ int T = 0;
    public final InspirationalBadgeCarousel A;
    public final LinearLayout B;
    public final LinearLayout C;
    public final GestaltText D;
    public final GestaltButton E;
    public a F;
    public a G;
    public b H;
    public j I;

    /* renamed from: J, reason: collision with root package name */
    public final v f47537J;
    public f K;
    public final k L;
    public i M;
    public boolean N;
    public String O;
    public boolean P;
    public boolean Q;
    public m R;
    public ImageSpan S;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f47538d;

    /* renamed from: e, reason: collision with root package name */
    public final View f47539e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f47540f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton f47541g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltAvatar f47542h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f47543i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f47544j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f47545k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f47546l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltIcon f47547m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f47548n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltIcon f47549o;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltText f47550p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltText f47551q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltText f47552r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltText f47553s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltText f47554t;

    /* renamed from: u, reason: collision with root package name */
    public final GestaltPreviewTextView f47555u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f47556v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f47557w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f47558x;

    /* renamed from: y, reason: collision with root package name */
    public final GestaltText f47559y;

    /* renamed from: z, reason: collision with root package name */
    public final GestaltButtonGroup f47560z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoUserProfileHeader(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 22);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 0;
        this.f47537J = xk2.m.b(new h(this, 0));
        this.L = xk2.m.a(n.NONE, new h(this, 5));
        View.inflate(getContext(), d.view_lego_user_profile_header, this);
        View findViewById = findViewById(c.cover_media_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47538d = (ViewGroup) findViewById;
        View findViewById2 = findViewById(c.cover_media_overlay_gradient);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47539e = findViewById2;
        View findViewById3 = findViewById(c.cover_media_guideline);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47540f = (Guideline) findViewById3;
        View findViewById4 = findViewById(c.cover_media_add_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        this.f47541g = gestaltButton;
        View findViewById5 = findViewById(c.user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47542h = (GestaltAvatar) findViewById5;
        View findViewById6 = findViewById(c.full_name);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47543i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(c.user_pronouns);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f47544j = (GestaltText) findViewById7;
        View findViewById8 = findViewById(c.profile_top_row_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f47545k = (LinearLayout) findViewById8;
        View findViewById9 = findViewById(c.inline_verified_merchant_badge);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById9;
        this.f47546l = gestaltText;
        View findViewById10 = findViewById(c.pinterest_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f47547m = (GestaltIcon) findViewById10;
        View findViewById11 = findViewById(c.username_view);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f47548n = (GestaltText) findViewById11;
        View findViewById12 = findViewById(c.instagram_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f47549o = (GestaltIcon) findViewById12;
        View findViewById13 = findViewById(c.instagram_username_view);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f47550p = (GestaltText) findViewById13;
        View findViewById14 = findViewById(c.instagram_separator);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f47552r = (GestaltText) findViewById14;
        View findViewById15 = findViewById(c.pronoun_view);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f47551q = (GestaltText) findViewById15;
        View findViewById16 = findViewById(c.pronoun_separator);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.f47553s = (GestaltText) findViewById16;
        View findViewById17 = findViewById(c.profile_monthly_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.f47554t = (GestaltText) findViewById17;
        View findViewById18 = findViewById(c.url_and_description);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) findViewById18;
        this.f47555u = gestaltPreviewTextView;
        View findViewById19 = findViewById(c.metadata_container);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById19;
        this.f47556v = viewGroup;
        View findViewById20 = findViewById(c.metadata_left);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        this.f47557w = a0.v((GestaltText) findViewById20);
        View findViewById21 = findViewById(c.metadata_right);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.f47558x = a0.v((GestaltText) findViewById21);
        View findViewById22 = findViewById(c.metadata_separator);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.f47559y = a0.v((GestaltText) findViewById22);
        View findViewById23 = findViewById(c.profile_gestalt_button_group);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById23;
        this.f47560z = gestaltButtonGroup;
        View findViewById24 = findViewById(c.inspirational_badges);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        InspirationalBadgeCarousel inspirationalBadgeCarousel = (InspirationalBadgeCarousel) findViewById24;
        this.A = inspirationalBadgeCarousel;
        View findViewById25 = findViewById(c.username_container);
        Intrinsics.checkNotNullExpressionValue(findViewById25, "findViewById(...)");
        this.B = (LinearLayout) findViewById25;
        View findViewById26 = findViewById(c.pronoun_container);
        Intrinsics.checkNotNullExpressionValue(findViewById26, "findViewById(...)");
        this.C = (LinearLayout) findViewById26;
        View findViewById27 = findViewById(c.pronoun_view_new_line);
        Intrinsics.checkNotNullExpressionValue(findViewById27, "findViewById(...)");
        this.D = (GestaltText) findViewById27;
        this.E = ((GestaltButton) findViewById(c.profile_follow_button)).d(j41.f.f74647j).e(new gm1.a(this) { // from class: j41.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74642b;

            {
                this.f74642b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                LegoUserProfileHeader this$0 = this.f74642b;
                switch (i14) {
                    case 0:
                        int i15 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 1:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 2:
                        int i16 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 3:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 4:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 5:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 6:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    default:
                        int i23 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                }
            }
        });
        final int i14 = 1;
        gestaltPreviewTextView.i(new g(this, i13)).j(new gm1.a(this) { // from class: j41.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74642b;

            {
                this.f74642b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                LegoUserProfileHeader this$0 = this.f74642b;
                switch (i142) {
                    case 0:
                        int i15 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 1:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 2:
                        int i16 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 3:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 4:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 5:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 6:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    default:
                        int i23 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                }
            }
        });
        bs1.c.X0(viewGroup);
        gestaltText.setOnClickListener(new View.OnClickListener(this) { // from class: j41.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74644b;

            {
                this.f74644b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                LegoUserProfileHeader this$0 = this.f74644b;
                switch (i15) {
                    case 0:
                        int i16 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar = this$0.K;
                        if (fVar != null) {
                            ((i41.d) fVar).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar2 = this$0.K;
                        if (fVar2 != null) {
                            ((i41.d) fVar2).z3();
                            break;
                        }
                        break;
                    case 2:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar3 = this$0.K;
                        if (fVar3 != null) {
                            ((i41.d) fVar3).z3();
                            break;
                        }
                        break;
                    default:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar4 = this$0.K;
                        if (fVar4 != null) {
                            ((i41.d) fVar4).z3();
                            break;
                        }
                        break;
                }
            }
        });
        a0.l0(gestaltButton);
        final int i15 = 2;
        gestaltButton.e(new gm1.a(this) { // from class: j41.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74642b;

            {
                this.f74642b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                LegoUserProfileHeader this$0 = this.f74642b;
                switch (i142) {
                    case 0:
                        int i152 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 1:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 2:
                        int i16 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 3:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 4:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 5:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 6:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    default:
                        int i23 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                }
            }
        });
        final int i16 = 3;
        gestaltButtonGroup.b(new gm1.a(this) { // from class: j41.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74642b;

            {
                this.f74642b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i16;
                LegoUserProfileHeader this$0 = this.f74642b;
                switch (i142) {
                    case 0:
                        int i152 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 1:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 2:
                        int i162 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 3:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 4:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 5:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 6:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    default:
                        int i23 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                }
            }
        });
        gestaltButtonGroup.a(j41.f.f74648k);
        View.OnClickListener listener = new View.OnClickListener(this) { // from class: j41.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74644b;

            {
                this.f74644b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i14;
                LegoUserProfileHeader this$0 = this.f74644b;
                switch (i152) {
                    case 0:
                        int i162 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar = this$0.K;
                        if (fVar != null) {
                            ((i41.d) fVar).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar2 = this$0.K;
                        if (fVar2 != null) {
                            ((i41.d) fVar2).z3();
                            break;
                        }
                        break;
                    case 2:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar3 = this$0.K;
                        if (fVar3 != null) {
                            ((i41.d) fVar3).z3();
                            break;
                        }
                        break;
                    default:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar4 = this$0.K;
                        if (fVar4 != null) {
                            ((i41.d) fVar4).z3();
                            break;
                        }
                        break;
                }
            }
        };
        inspirationalBadgeCarousel.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        inspirationalBadgeCarousel.f48532b = listener;
        setId(c.user_profile_header);
    }

    public static void L(LegoUserProfileHeader this$0, gm1.c event) {
        f fVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event instanceof rn1.f) && (fVar = this$0.K) != null) {
            i41.d dVar = (i41.d) fVar;
            d0.B((d0) dVar.f71534q.getValue(), f1.TAP, g0.ABOUT_DRAWER, null, null, 28);
            NavigationImpl w13 = Navigation.w1(i3.a());
            w13.m0("com.pinterest.EXTRA_USER_ID", dVar.f71518a);
            w13.y0(dVar.f71519b, "com.pinterest.EXTRAS_PROFILE_DISPLAY");
            dVar.f71526i.d(w13);
        }
    }

    public static void t0(ViewGroup viewGroup, boolean z13) {
        if (z13 && viewGroup.getVisibility() != 0) {
            bs1.c.U1(viewGroup);
        } else {
            if (z13 || viewGroup.getVisibility() != 0) {
                return;
            }
            bs1.c.X0(viewGroup);
        }
    }

    public final SpannableStringBuilder T(Context context, SpannableStringBuilder spannableStringBuilder, boolean z13, boolean z14, String str, String str2) {
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
        }
        y31.j jVar = (str2 == null || str2.length() <= 0) ? null : new y31.j(this, str2, 1);
        if (z13) {
            if (z14) {
                spannableStringBuilder.append(" · ");
            }
            int length = spannableStringBuilder.length();
            int length2 = str != null ? str.length() : 0;
            spannableStringBuilder.append((CharSequence) str);
            f0.h.m(context, spannableStringBuilder, length, length2 + length, jVar);
        }
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder X(i iVar) {
        if (iVar == null) {
            return null;
        }
        h41.h hVar = iVar.f67639b;
        String str = hVar != null ? hVar.f67636a : null;
        String str2 = hVar != null ? hVar.f67637b : null;
        h41.h hVar2 = iVar.f67638a;
        String str3 = hVar2 != null ? hVar2.f67636a : null;
        String str4 = hVar2 != null ? hVar2.f67637b : null;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SpannableStringBuilder T2 = T(context, null, !(str == null || str.length() == 0), false, str2, str);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SpannableStringBuilder T3 = T(context2, T2, !(str3 == null || str3.length() == 0), !(str == null || str.length() == 0), str4, str3);
        ImageSpan imageSpan = this.S;
        if (imageSpan == null) {
            return T3;
        }
        SpannableStringBuilder insert = T3.insert(0, "  ");
        insert.setSpan(imageSpan, 0, 1, 33);
        Intrinsics.checkNotNullExpressionValue(insert, "let(...)");
        return insert;
    }

    public final y31.k Z() {
        return (y31.k) this.f47537J.getValue();
    }

    public final void a0(gm1.c cVar) {
        f fVar;
        i41.d dVar;
        wy0 wy0Var;
        if (a0.t0(this.f47541g, cVar)) {
            f fVar2 = this.K;
            if (fVar2 != null) {
                i41.d dVar2 = (i41.d) fVar2;
                dVar2.getPinalytics().F(g0.TILTED_PINS_HEADER, u0.TILTED_PINS_SOURCE_EDIT_BUTTON);
                LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) ((e) dVar2.getView());
                a aVar = legoUserProfileHeader.G;
                if (aVar == null) {
                    Intrinsics.r("galleryRouter");
                    throw null;
                }
                Object obj = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Context context = legoUserProfileHeader.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                zp.j.b((zp.j) obj, context, x.ProfileCover, 0, null, null, null, 508);
                return;
            }
            return;
        }
        if (a0.t0(this.E, cVar)) {
            f fVar3 = this.K;
            if (fVar3 == null || (wy0Var = (dVar = (i41.d) fVar3).f71533p) == null) {
                return;
            }
            dVar.f71523f.invoke(wy0Var);
            return;
        }
        GestaltButtonGroup gestaltButtonGroup = this.f47560z;
        if (!r.Z0(cVar, gestaltButtonGroup)) {
            if (!r.a1(cVar, gestaltButtonGroup) || (fVar = this.K) == null) {
                return;
            }
            i41.d dVar3 = (i41.d) fVar;
            NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.f50992z.getValue());
            w13.Y1("EXTRAS_KEY_SHOW_PROFILE_LAYOUT_OPTION", dVar3.f71520c.isPublic());
            dVar3.f71526i.d(w13);
            return;
        }
        f fVar4 = this.K;
        if (fVar4 != null) {
            i41.d dVar4 = (i41.d) fVar4;
            dVar4.getPinalytics().X(u0.CREATOR_HUB_ENTRY_POINT);
            LegoUserProfileHeader legoUserProfileHeader2 = (LegoUserProfileHeader) ((e) dVar4.getView());
            legoUserProfileHeader2.getClass();
            legoUserProfileHeader2.d0((ScreenLocation) i3.f50975i.getValue(), j41.f.f74649l);
        }
    }

    public final void d0(ScreenLocation screenLocation, Function1 function1) {
        a aVar = this.F;
        if (aVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        m60.w wVar = (m60.w) ((bf2.b) aVar).get();
        NavigationImpl w13 = Navigation.w1(screenLocation);
        function1.invoke(w13);
        wVar.d(w13);
    }

    public final void g0(c92.n media) {
        Intrinsics.checkNotNullParameter(media, "media");
        y31.k Z = Z();
        ((q) Z).c(this.f47538d, media, this.f47539e, this.f47540f, this.f47541g, this.R);
        h41.a aVar = h41.a.f67627b;
        if (!Intrinsics.d(media, aVar) && this.f47538d.getMeasuredWidth() == 0) {
            requestLayout();
        }
        if (!Intrinsics.d(media, aVar)) {
            setPaddingRelative(getPaddingStart(), 0, getPaddingEnd(), getPaddingBottom());
        } else {
            setPaddingRelative(getPaddingStart(), getResources().getDimensionPixelOffset(eo1.c.space_500), getPaddingEnd(), getPaddingBottom());
        }
    }

    public final void k0(GestaltText gestaltText, h41.g gVar) {
        gestaltText.j(new j41.e(gVar, 1));
        String str = gVar.f67632a;
        boolean z13 = str.length() == 0;
        String str2 = gVar.f67633b;
        boolean z14 = gVar.f67635d;
        gestaltText.i(new u1.c(str, str2, z14, !z13, 2));
        gestaltText.setEnabled(z14);
        this.f47559y.i(new g(this, 2));
    }

    public final void o0() {
        fm1.c cVar = this.f47546l.l().f108855m;
        fm1.c cVar2 = fm1.c.VISIBLE;
        boolean z13 = cVar == cVar2;
        boolean z14 = this.f47548n.l().f108855m == cVar2;
        LinearLayout linearLayout = this.f47545k;
        if (z13 || z14) {
            bs1.c.U1(linearLayout);
        } else {
            bs1.c.X0(linearLayout);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.R = null;
        this.K = null;
        super.onDetachedFromWindow();
    }

    public final void r0() {
        f fVar;
        h41.h hVar;
        h41.h hVar2;
        String str;
        String str2;
        i iVar = this.M;
        boolean z13 = this.N;
        String str3 = this.O;
        boolean z14 = this.P;
        boolean z15 = (iVar == null || (((hVar = iVar.f67638a) == null || (str2 = hVar.f67636a) == null || str2.length() == 0) && ((hVar2 = iVar.f67639b) == null || (str = hVar2.f67636a) == null || str.length() == 0))) ? false : true;
        boolean z16 = !(str3 == null || z.j(str3));
        if (z16 && z14) {
            if (!this.Q && (fVar = this.K) != null) {
                d0.B((d0) ((i41.d) fVar).f71534q.getValue(), f1.VIEW, g0.ABOUT_DRAWER, null, null, 28);
            }
            this.Q = true;
        }
        GestaltPreviewTextView gestaltPreviewTextView = this.f47555u;
        if (!z13 && !z14) {
            gestaltPreviewTextView.i(j41.f.f74650m);
            return;
        }
        if (!z15 && !z16) {
            gestaltPreviewTextView.i(j41.f.f74651n);
            return;
        }
        if (!z13 || !z15) {
            gestaltPreviewTextView.i(new b31.f(str3, 5));
        } else if (z14 && z16) {
            gestaltPreviewTextView.i(new rx0.f(this, iVar, str3, 11));
        } else {
            gestaltPreviewTextView.i(new y11.c(12, this, iVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoUserProfileHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 22, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47537J = xk2.m.b(new h(this, 0));
        final int i14 = 5;
        this.L = xk2.m.a(n.NONE, new h(this, 5));
        View.inflate(getContext(), d.view_lego_user_profile_header, this);
        View findViewById = findViewById(c.cover_media_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47538d = (ViewGroup) findViewById;
        View findViewById2 = findViewById(c.cover_media_overlay_gradient);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47539e = findViewById2;
        View findViewById3 = findViewById(c.cover_media_guideline);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47540f = (Guideline) findViewById3;
        View findViewById4 = findViewById(c.cover_media_add_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        this.f47541g = gestaltButton;
        View findViewById5 = findViewById(c.user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47542h = (GestaltAvatar) findViewById5;
        View findViewById6 = findViewById(c.full_name);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47543i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(c.user_pronouns);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f47544j = (GestaltText) findViewById7;
        View findViewById8 = findViewById(c.profile_top_row_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f47545k = (LinearLayout) findViewById8;
        View findViewById9 = findViewById(c.inline_verified_merchant_badge);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById9;
        this.f47546l = gestaltText;
        View findViewById10 = findViewById(c.pinterest_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f47547m = (GestaltIcon) findViewById10;
        View findViewById11 = findViewById(c.username_view);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f47548n = (GestaltText) findViewById11;
        View findViewById12 = findViewById(c.instagram_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f47549o = (GestaltIcon) findViewById12;
        View findViewById13 = findViewById(c.instagram_username_view);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f47550p = (GestaltText) findViewById13;
        View findViewById14 = findViewById(c.instagram_separator);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f47552r = (GestaltText) findViewById14;
        View findViewById15 = findViewById(c.pronoun_view);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f47551q = (GestaltText) findViewById15;
        View findViewById16 = findViewById(c.pronoun_separator);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.f47553s = (GestaltText) findViewById16;
        View findViewById17 = findViewById(c.profile_monthly_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.f47554t = (GestaltText) findViewById17;
        View findViewById18 = findViewById(c.url_and_description);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) findViewById18;
        this.f47555u = gestaltPreviewTextView;
        View findViewById19 = findViewById(c.metadata_container);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById19;
        this.f47556v = viewGroup;
        View findViewById20 = findViewById(c.metadata_left);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        this.f47557w = a0.v((GestaltText) findViewById20);
        View findViewById21 = findViewById(c.metadata_right);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.f47558x = a0.v((GestaltText) findViewById21);
        View findViewById22 = findViewById(c.metadata_separator);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.f47559y = a0.v((GestaltText) findViewById22);
        View findViewById23 = findViewById(c.profile_gestalt_button_group);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById23;
        this.f47560z = gestaltButtonGroup;
        View findViewById24 = findViewById(c.inspirational_badges);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        InspirationalBadgeCarousel inspirationalBadgeCarousel = (InspirationalBadgeCarousel) findViewById24;
        this.A = inspirationalBadgeCarousel;
        View findViewById25 = findViewById(c.username_container);
        Intrinsics.checkNotNullExpressionValue(findViewById25, "findViewById(...)");
        this.B = (LinearLayout) findViewById25;
        View findViewById26 = findViewById(c.pronoun_container);
        Intrinsics.checkNotNullExpressionValue(findViewById26, "findViewById(...)");
        this.C = (LinearLayout) findViewById26;
        View findViewById27 = findViewById(c.pronoun_view_new_line);
        Intrinsics.checkNotNullExpressionValue(findViewById27, "findViewById(...)");
        this.D = (GestaltText) findViewById27;
        final int i15 = 4;
        this.E = ((GestaltButton) findViewById(c.profile_follow_button)).d(j41.f.f74647j).e(new gm1.a(this) { // from class: j41.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74642b;

            {
                this.f74642b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                LegoUserProfileHeader this$0 = this.f74642b;
                switch (i142) {
                    case 0:
                        int i152 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 1:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 2:
                        int i162 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 3:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 4:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 5:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 6:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    default:
                        int i23 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                }
            }
        });
        gestaltPreviewTextView.i(new g(this, 0)).j(new gm1.a(this) { // from class: j41.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74642b;

            {
                this.f74642b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                LegoUserProfileHeader this$0 = this.f74642b;
                switch (i142) {
                    case 0:
                        int i152 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 1:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 2:
                        int i162 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 3:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 4:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 5:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 6:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    default:
                        int i23 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                }
            }
        });
        bs1.c.X0(viewGroup);
        final int i16 = 2;
        gestaltText.setOnClickListener(new View.OnClickListener(this) { // from class: j41.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74644b;

            {
                this.f74644b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i16;
                LegoUserProfileHeader this$0 = this.f74644b;
                switch (i152) {
                    case 0:
                        int i162 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar = this$0.K;
                        if (fVar != null) {
                            ((i41.d) fVar).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i17 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar2 = this$0.K;
                        if (fVar2 != null) {
                            ((i41.d) fVar2).z3();
                            break;
                        }
                        break;
                    case 2:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar3 = this$0.K;
                        if (fVar3 != null) {
                            ((i41.d) fVar3).z3();
                            break;
                        }
                        break;
                    default:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar4 = this$0.K;
                        if (fVar4 != null) {
                            ((i41.d) fVar4).z3();
                            break;
                        }
                        break;
                }
            }
        });
        a0.l0(gestaltButton);
        final int i17 = 6;
        gestaltButton.e(new gm1.a(this) { // from class: j41.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74642b;

            {
                this.f74642b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i17;
                LegoUserProfileHeader this$0 = this.f74642b;
                switch (i142) {
                    case 0:
                        int i152 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 1:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 2:
                        int i162 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 3:
                        int i172 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 4:
                        int i18 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 5:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 6:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    default:
                        int i23 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                }
            }
        });
        final int i18 = 7;
        gestaltButtonGroup.b(new gm1.a(this) { // from class: j41.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74642b;

            {
                this.f74642b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i18;
                LegoUserProfileHeader this$0 = this.f74642b;
                switch (i142) {
                    case 0:
                        int i152 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 1:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 2:
                        int i162 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 3:
                        int i172 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 4:
                        int i182 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    case 5:
                        LegoUserProfileHeader.L(this$0, it);
                        break;
                    case 6:
                        int i19 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                    default:
                        int i23 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a0(it);
                        break;
                }
            }
        });
        gestaltButtonGroup.a(j41.f.f74648k);
        final int i19 = 3;
        View.OnClickListener listener = new View.OnClickListener(this) { // from class: j41.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegoUserProfileHeader f74644b;

            {
                this.f74644b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i19;
                LegoUserProfileHeader this$0 = this.f74644b;
                switch (i152) {
                    case 0:
                        int i162 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar = this$0.K;
                        if (fVar != null) {
                            ((i41.d) fVar).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i172 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar2 = this$0.K;
                        if (fVar2 != null) {
                            ((i41.d) fVar2).z3();
                            break;
                        }
                        break;
                    case 2:
                        int i182 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar3 = this$0.K;
                        if (fVar3 != null) {
                            ((i41.d) fVar3).z3();
                            break;
                        }
                        break;
                    default:
                        int i192 = LegoUserProfileHeader.T;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        h41.f fVar4 = this$0.K;
                        if (fVar4 != null) {
                            ((i41.d) fVar4).z3();
                            break;
                        }
                        break;
                }
            }
        };
        inspirationalBadgeCarousel.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        inspirationalBadgeCarousel.f48532b = listener;
        setId(c.user_profile_header);
    }
}
