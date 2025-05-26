package rh1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ge;
import com.pinterest.api.model.hx0;
import com.pinterest.feature.comment.reactions.view.CommentReactionIndicator;
import com.pinterest.feature.unifiedcomments.view.AttachedPinCommentView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;
import ni1.t2;

/* loaded from: classes5.dex */
public final class k0 extends uq.w implements z, nx.v, qa2.f0 {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f108203k0 = 0;
    public final GestaltText A;
    public final GestaltText B;
    public final GestaltText C;
    public final GestaltText D;
    public final ImageView E;
    public final GestaltIconButton F;
    public final ImageView G;
    public final WebImageView H;
    public final AttachedPinCommentView I;

    /* renamed from: J, reason: collision with root package name */
    public final GestaltText f108204J;
    public final FrameLayout K;
    public final GestaltIconButton L;
    public final GestaltText M;
    public final GestaltText N;
    public final GestaltText O;
    public final Group P;
    public final GestaltText Q;
    public final LinearLayout R;
    public final CommentReactionIndicator S;
    public final int T;
    public final int U;
    public final int V;
    public y92.c W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f108205a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f108206b0;

    /* renamed from: c0, reason: collision with root package name */
    public rp0.d f108207c0;

    /* renamed from: d, reason: collision with root package name */
    public final ao2.j0 f108208d;

    /* renamed from: d0, reason: collision with root package name */
    public h32.c0 f108209d0;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f108210e;

    /* renamed from: e0, reason: collision with root package name */
    public Integer f108211e0;

    /* renamed from: f, reason: collision with root package name */
    public final pb0.d f108212f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f108213f0;

    /* renamed from: g, reason: collision with root package name */
    public final up0.l f108214g;

    /* renamed from: g0, reason: collision with root package name */
    public final SbaPinRep f108215g0;

    /* renamed from: h, reason: collision with root package name */
    public final f30 f108216h;

    /* renamed from: h0, reason: collision with root package name */
    public final o2 f108217h0;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f108218i;

    /* renamed from: i0, reason: collision with root package name */
    public final wa2.m f108219i0;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f108220j;

    /* renamed from: j0, reason: collision with root package name */
    public final xk2.v f108221j0;

    /* renamed from: k, reason: collision with root package name */
    public final Function2 f108222k;

    /* renamed from: l, reason: collision with root package name */
    public final Function2 f108223l;

    /* renamed from: m, reason: collision with root package name */
    public final kl2.l f108224m;

    /* renamed from: n, reason: collision with root package name */
    public final Function2 f108225n;

    /* renamed from: o, reason: collision with root package name */
    public final Function1 f108226o;

    /* renamed from: p, reason: collision with root package name */
    public final lh0.m0 f108227p;

    /* renamed from: q, reason: collision with root package name */
    public final nx.d0 f108228q;

    /* renamed from: r, reason: collision with root package name */
    public final qh1.e f108229r;

    /* renamed from: s, reason: collision with root package name */
    public final x02.i2 f108230s;

    /* renamed from: t, reason: collision with root package name */
    public qa2.j0 f108231t;

    /* renamed from: u, reason: collision with root package name */
    public t2 f108232u;

    /* renamed from: v, reason: collision with root package name */
    public ni1.d0 f108233v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltAvatar f108234w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f108235x;

    /* renamed from: y, reason: collision with root package name */
    public final GestaltText f108236y;

    /* renamed from: z, reason: collision with root package name */
    public final GestaltIcon f108237z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, ao2.j0 scope, b60.b activeUserManager, pb0.d fuzzyDateFormatter, up0.l typeaheadTextUtility, f30 pin, Function1 onClickUser, Function1 onClickAttachedPin, Function2 onClickAction, Function2 onLongClickReactionButton, kl2.l onClickReactionIndicator, Function2 onClickTranslation, Function1 translationLookup, lh0.m0 experiments, nx.d0 pinalytics, qh1.e commentUtils, x02.i2 pinRepository, String previewCommentUid) {
        super(context, 29);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(typeaheadTextUtility, "typeaheadTextUtility");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(onClickUser, "onClickUser");
        Intrinsics.checkNotNullParameter(onClickAttachedPin, "onClickAttachedPin");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        Intrinsics.checkNotNullParameter(onLongClickReactionButton, "onLongClickReactionButton");
        Intrinsics.checkNotNullParameter(onClickReactionIndicator, "onClickReactionIndicator");
        Intrinsics.checkNotNullParameter(onClickTranslation, "onClickTranslation");
        Intrinsics.checkNotNullParameter(translationLookup, "translationLookup");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(commentUtils, "commentUtils");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(previewCommentUid, "previewCommentUid");
        this.f108208d = scope;
        this.f108210e = activeUserManager;
        this.f108212f = fuzzyDateFormatter;
        this.f108214g = typeaheadTextUtility;
        this.f108216h = pin;
        this.f108218i = onClickUser;
        this.f108220j = onClickAttachedPin;
        this.f108222k = onClickAction;
        this.f108223l = onLongClickReactionButton;
        this.f108224m = onClickReactionIndicator;
        this.f108225n = onClickTranslation;
        this.f108226o = translationLookup;
        this.f108227p = experiments;
        this.f108228q = pinalytics;
        this.f108229r = commentUtils;
        this.f108230s = pinRepository;
        this.T = getResources().getDimensionPixelSize(m60.r0.pin_comment_feed_reply_offset);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        this.U = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_300);
        this.V = dimensionPixelSize2;
        wa2.m mVar = new wa2.m(-1048577, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.f108219i0 = mVar;
        this.f108221j0 = xk2.m.b(new ee1.d(this, 18));
        View.inflate(context, fb0.d.pin_closeup_unified_comment_feed_comment, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        View findViewById = findViewById(fb0.c.user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f108234w = (GestaltAvatar) findViewById;
        View findViewById2 = findViewById(fb0.c.user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f108235x = (GestaltText) findViewById2;
        View findViewById3 = findViewById(fb0.c.question_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f108236y = (GestaltText) findViewById3;
        View findViewById4 = findViewById(fb0.c.top_comment_label);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = findViewById(fb0.c.top_comment_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f108237z = (GestaltIcon) findViewById5;
        View findViewById6 = findViewById(fb0.c.top_comment_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.A = (GestaltText) findViewById6;
        View findViewById7 = findViewById(fb0.c.period_label);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.B = (GestaltText) findViewById7;
        View findViewById8 = findViewById(fb0.c.creator_action_label);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.C = (GestaltText) findViewById8;
        View findViewById9 = findViewById(fb0.c.highlight_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.D = (GestaltText) findViewById9;
        View findViewById10 = findViewById(fb0.c.highlight_indicator_background);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.E = (ImageView) findViewById10;
        View findViewById11 = findViewById(fb0.c.unread_red_dot);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.G = (ImageView) findViewById11;
        this.M = ((GestaltText) findViewById(fb0.c.comment_text)).i(j.f108176n);
        View findViewById12 = findViewById(fb0.c.comment_image);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.H = (WebImageView) findViewById12;
        View findViewById13 = findViewById(fb0.c.attached_pin_comment);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.I = (AttachedPinCommentView) findViewById13;
        View findViewById14 = findViewById(fb0.c.comment_translate);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f108204J = (GestaltText) findViewById14;
        qa2.j0 j0Var = this.f108231t;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        t2 t2Var = this.f108232u;
        if (t2Var == null) {
            Intrinsics.r("pinRepViewModelFactory");
            throw null;
        }
        Pair q13 = l3.c.q(context, mVar, pinalytics, scope, j0Var, t2Var);
        SbaPinRep sbaPinRep = (SbaPinRep) q13.f80346a;
        o2 o2Var = (o2) q13.f80347b;
        this.f108215g0 = sbaPinRep;
        this.f108217h0 = o2Var;
        View findViewById15 = findViewById(fb0.c.comment_pin);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById15;
        this.K = frameLayout;
        frameLayout.addView(sbaPinRep);
        View findViewById16 = findViewById(fb0.c.comment_pin_action_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById16;
        this.L = gestaltIconButton;
        gestaltIconButton.t(j.f108177o);
        View findViewById17 = findViewById(fb0.c.timestamp_action_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.N = (GestaltText) findViewById17;
        View findViewById18 = findViewById(fb0.c.comment_reply);
        GestaltText gestaltText = (GestaltText) findViewById18;
        Intrinsics.f(gestaltText);
        kh2.b0.c0(gestaltText);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "apply(...)");
        this.O = gestaltText;
        View findViewById19 = findViewById(fb0.c.comment_reaction_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        this.S = (CommentReactionIndicator) findViewById19;
        View findViewById20 = findViewById(fb0.c.overflow_icon);
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById20;
        Intrinsics.f(gestaltIconButton2);
        kh2.b0.c0(gestaltIconButton2);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "apply(...)");
        this.F = gestaltIconButton2;
        View findViewById21 = findViewById(fb0.c.replies_header);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.P = (Group) findViewById21;
        Intrinsics.checkNotNullExpressionValue(findViewById(fb0.c.replies_header_border), "findViewById(...)");
        View findViewById22 = findViewById(fb0.c.replies_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.Q = (GestaltText) findViewById22;
        View findViewById23 = findViewById(fb0.c.reply_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        this.R = (LinearLayout) findViewById23;
    }

    @Override // rh1.z
    public final void J2(boolean z13) {
        this.f108213f0 = z13;
    }

    @Override // rh1.z
    public final void K(hx0 commentsCountHeaderItem) {
        Intrinsics.checkNotNullParameter(commentsCountHeaderItem, "commentsCountHeaderItem");
    }

    public final void L() {
        this.f108234w.H2(j.f108178p);
        boolean z13 = this.f108205a0;
        int i13 = this.U;
        int i14 = this.V;
        if (z13) {
            setPaddingRelative(this.T, i14, i13, i14);
        } else {
            setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
            setPaddingRelative(i13, i14, i13, i14);
        }
    }

    @Override // rh1.z
    public final void Q(ge communityInsightHeaderItem) {
        Intrinsics.checkNotNullParameter(communityInsightHeaderItem, "communityInsightHeaderItem");
    }

    public final void T() {
        int dimensionPixelSize = this.f108206b0 ? getResources().getDimensionPixelSize(eo1.c.space_200) : getResources().getDimensionPixelSize(m60.r0.margin_three_eighth);
        GestaltText gestaltText = this.Q;
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        gestaltText.setLayoutParams(marginLayoutParams);
    }

    @Override // rh1.z
    public final void a5(boolean z13) {
        if ((getVisibility() == 0) != z13) {
            if (!z13) {
                setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
                bs1.c.X0(this);
            } else {
                setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                L();
                bs1.c.U1(this);
            }
        }
    }

    @Override // qa2.f0
    public final qa2.h0 getInternalCell() {
        return this.f108215g0;
    }

    @Override // rh1.z
    public final void h6(String str, String commentId, y translationStatus) {
        int i13;
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(translationStatus, "translationStatus");
        rp0.d dVar = this.f108207c0;
        if (Intrinsics.d(dVar != null ? dVar.v() : null, commentId)) {
            int i14 = h0.f108154a[translationStatus.ordinal()];
            if (i14 == 1) {
                i13 = fb0.f.translation_pending_title;
            } else if (i14 == 2) {
                i13 = fb0.f.show_original_text_title;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = fb0.f.show_translated_text_title;
            }
            this.f108204J.i(new zx0.d(i13, 24));
            if (str != null) {
                pk.a0.p(this.M, str);
            }
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        h32.c0 c0Var;
        h32.c0 source = this.f108209d0;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            c0Var = new h32.c0(source.f66887a, source.f66888b, jq.b.c(TimeUnit.MILLISECONDS), source.f66890d, source.f66891e, source.f66892f, source.f66893g, source.f66894h, source.f66895i, source.f66896j);
        } else {
            c0Var = null;
        }
        this.f108209d0 = null;
        return c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // nx.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object markImpressionStart() {
        /*
            r18 = this;
            r0 = r18
            h32.c0 r1 = r0.f108209d0
            if (r1 == 0) goto L8
            goto La6
        L8:
            rp0.d r1 = r0.f108207c0
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.String r1 = r1.k()
            goto L13
        L12:
            r1 = r2
        L13:
            java.lang.String r3 = "aggregatedcomment"
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            java.lang.String r5 = "didIt"
            java.lang.String r6 = "aggregatedComment"
            if (r4 == 0) goto L22
            r17 = r6
            goto L31
        L22:
            java.lang.String r4 = "userdiditdata"
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r4)
            if (r1 == 0) goto L2d
            r17 = r5
            goto L31
        L2d:
            java.lang.String r1 = ""
            r17 = r1
        L31:
            rp0.d r1 = r0.f108207c0
            java.lang.String r4 = "pin"
            com.pinterest.api.model.f30 r7 = r0.f108216h
            if (r1 == 0) goto L5c
            boolean r1 = r1.x()
            r8 = 1
            if (r1 != r8) goto L5c
            rp0.d r1 = r0.f108207c0
            if (r1 == 0) goto L58
            kotlin.Pair r1 = r1.t()
            if (r1 == 0) goto L58
            java.lang.Object r8 = r1.f80347b
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r8, r3)
            if (r3 == 0) goto L53
            r5 = r6
        L53:
            java.lang.Object r1 = r1.f80346a
            r16 = r5
            goto L62
        L58:
            r1 = r2
            r16 = r1
            goto L62
        L5c:
            java.lang.String r1 = r7.getF39332b()
            r16 = r4
        L62:
            java.lang.String r3 = r7.w6()
            if (r3 == 0) goto L6c
            java.lang.String r3 = "story"
        L6a:
            r14 = r3
            goto L76
        L6c:
            boolean r3 = com.pinterest.api.model.b40.X0(r7)
            if (r3 == 0) goto L75
            java.lang.String r3 = "video"
            goto L6a
        L75:
            r14 = r4
        L76:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Long r9 = jq.b.c(r3)
            java.lang.Integer r3 = r0.f108211e0
            if (r3 == 0) goto L8b
            int r3 = r3.intValue()
            short r3 = (short) r3
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            r11 = r3
            goto L8c
        L8b:
            r11 = r2
        L8c:
            rp0.d r3 = r0.f108207c0
            if (r3 == 0) goto L94
            java.lang.String r2 = r3.v()
        L94:
            r8 = r2
            r15 = r1
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r12 = r7.getF39332b()
            h32.c0 r1 = new h32.c0
            r13 = 0
            r7 = r1
            r10 = r13
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.f108209d0 = r1
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rh1.k0.markImpressionStart():java.lang.Object");
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        ni1.c0 c0Var = (ni1.c0) this.f108221j0.getValue();
        l3.c.X0(pin, i13, this.f108215g0, this.f108217h0, c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04b3  */
    @Override // rh1.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v6(final rp0.d r47, int r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53, rp0.d r54) {
        /*
            Method dump skipped, instructions count: 1671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rh1.k0.v6(rp0.d, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, rp0.d):void");
    }
}
