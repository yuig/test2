package rq;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentsImagesView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.comment.reactions.view.CommentReactionIndicator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
import com.pinterest.feature.unifiedcomments.view.PinCommentReactionHeaderView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class j4 extends PinCloseupBaseModule implements i01.r, zp0.h, nx.v {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f109300w = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f109301a;

    /* renamed from: b, reason: collision with root package name */
    public lh0.a0 f109302b;

    /* renamed from: c, reason: collision with root package name */
    public up0.l f109303c;

    /* renamed from: d, reason: collision with root package name */
    public x02.u f109304d;

    /* renamed from: e, reason: collision with root package name */
    public x02.p1 f109305e;

    /* renamed from: f, reason: collision with root package name */
    public qh1.e f109306f;

    /* renamed from: g, reason: collision with root package name */
    public nx.d1 f109307g;

    /* renamed from: h, reason: collision with root package name */
    public hs.d f109308h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f109309i;

    /* renamed from: j, reason: collision with root package name */
    public final PinCommentReactionHeaderView f109310j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f109311k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f109312l;

    /* renamed from: m, reason: collision with root package name */
    public final CommentsImagesView f109313m;

    /* renamed from: n, reason: collision with root package name */
    public final CommentPreviewView f109314n;

    /* renamed from: o, reason: collision with root package name */
    public final CommentPreviewView f109315o;

    /* renamed from: p, reason: collision with root package name */
    public final CommentComposerView f109316p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltButton f109317q;

    /* renamed from: r, reason: collision with root package name */
    public final LinearLayout f109318r;

    /* renamed from: s, reason: collision with root package name */
    public i01.q f109319s;

    /* renamed from: t, reason: collision with root package name */
    public final xj2.b f109320t;

    /* renamed from: u, reason: collision with root package name */
    public int f109321u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f109322v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f109320t = new xj2.b();
        boolean shouldRenderLandscapeConfiguration = shouldRenderLandscapeConfiguration();
        View.inflate(context, n80.d.pin_closeup_unified_comments_module, this);
        View findViewById = findViewById(n80.c.unified_comments_module_container);
        LinearLayout linearLayout = (LinearLayout) findViewById;
        hs.d dVar = this.f109308h;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        Integer valueOf = dVar.b() ? null : Integer.valueOf(r80.b.pin_closeup_redesign_module_background);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            Intrinsics.f(linearLayout);
            linearLayout.setBackground(bs1.c.f0(linearLayout, intValue, null, null, 6));
        }
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        byte b16 = 0;
        byte b17 = 0;
        linearLayout.setOnClickListener(new z3(this, 0));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f109309i = linearLayout;
        maybeUpdateLayoutForTabletPortrait(linearLayout);
        View findViewById2 = findViewById(n80.c.comment_reaction_header);
        PinCommentReactionHeaderView pinCommentReactionHeaderView = (PinCommentReactionHeaderView) findViewById2;
        pinCommentReactionHeaderView.f48955m = false;
        GestaltText gestaltText = pinCommentReactionHeaderView.f48947e;
        int W = shouldRenderLandscapeConfiguration ? bs1.c.W(gestaltText, eo1.c.space_600) : bs1.c.W(gestaltText, eo1.c.space_400);
        gestaltText.setPaddingRelative(W, gestaltText.getPaddingTop(), W, gestaltText.getPaddingBottom());
        PinReactionIconButton pinReactionIconButton = pinCommentReactionHeaderView.f48949g;
        int W2 = shouldRenderLandscapeConfiguration ? bs1.c.W(pinReactionIconButton, eo1.c.space_600) : bs1.c.W(pinReactionIconButton, eo1.c.space_200);
        ViewGroup.LayoutParams layoutParams = pinReactionIconButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(W2);
        pinReactionIconButton.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = pinCommentReactionHeaderView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = bs1.c.W(pinCommentReactionHeaderView, eo1.c.space_200);
        pinCommentReactionHeaderView.setLayoutParams(marginLayoutParams2);
        int W3 = bs1.c.W(pinReactionIconButton, eo1.c.space_300);
        pinReactionIconButton.setPadding(W3, W3, W3, W3);
        int i13 = 1;
        bs1.c.R1(pinCommentReactionHeaderView, true);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f109310j = pinCommentReactionHeaderView;
        View findViewById3 = findViewById(n80.c.module_title);
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Intrinsics.f(gestaltText2);
        ViewGroup.LayoutParams layoutParams3 = gestaltText2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.topMargin = bs1.c.W(gestaltText2, eo1.c.space_300);
        marginLayoutParams3.setMarginStart(bs1.c.W(gestaltText2, eo1.c.space_400));
        marginLayoutParams3.setMarginEnd(bs1.c.W(gestaltText2, eo1.c.space_200));
        marginLayoutParams3.bottomMargin = 0;
        gestaltText2.setLayoutParams(marginLayoutParams3);
        gestaltText2.i(f2.F);
        if (shouldRenderLandscapeConfiguration) {
            g(gestaltText2);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f109311k = gestaltText2;
        View findViewById4 = findViewById(n80.c.module_subtitle);
        GestaltText gestaltText3 = (GestaltText) findViewById4;
        Intrinsics.f(gestaltText3);
        ViewGroup.LayoutParams layoutParams4 = gestaltText3.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams4.topMargin = bs1.c.W(gestaltText3, eo1.c.space_200);
        marginLayoutParams4.setMarginStart(bs1.c.W(gestaltText3, eo1.c.space_400));
        marginLayoutParams4.setMarginEnd(bs1.c.W(gestaltText3, eo1.c.space_200));
        gestaltText3.setLayoutParams(marginLayoutParams4);
        gestaltText3.i(f2.G);
        if (shouldRenderLandscapeConfiguration) {
            g(gestaltText3);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f109312l = gestaltText3;
        View findViewById5 = findViewById(n80.c.try_preview_images);
        CommentsImagesView commentsImagesView = (CommentsImagesView) findViewById5;
        b4 onClick = new b4(1, this, j4.class, "notifyOnClickTryImage", "notifyOnClickTryImage(I)V", 0);
        commentsImagesView.getClass();
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f109313m = commentsImagesView;
        View findViewById6 = findViewById(n80.c.comment_preview);
        CommentPreviewView commentPreviewView = (CommentPreviewView) findViewById6;
        c4 onClick2 = new c4(this, b17 == true ? 1 : 0);
        commentPreviewView.getClass();
        Intrinsics.checkNotNullParameter(onClick2, "onClick");
        commentPreviewView.f35106o = onClick2;
        commentPreviewView.setPaddingRelative(shouldRenderLandscapeConfiguration ? 0 : commentPreviewView.getPaddingStart(), bs1.c.W(commentPreviewView, eo1.c.lego_spacing_vertical_small_half), shouldRenderLandscapeConfiguration ? 0 : commentPreviewView.getPaddingEnd(), bs1.c.W(commentPreviewView, eo1.c.lego_spacing_vertical_small));
        rl1.r size = rl1.r.MD;
        Intrinsics.checkNotNullParameter(size, "size");
        commentPreviewView.f35097f.H2(new uq.s(size, b16 == true ? 1 : 0));
        pk.a0.k0(commentPreviewView.f35100i);
        bs1.c.X0(commentPreviewView.f35102k);
        d4 onClick3 = new d4(this, b15 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(onClick3, "onClick");
        commentPreviewView.f35104m = onClick3;
        bs1.c.R1(commentPreviewView, true);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f109314n = commentPreviewView;
        View findViewById7 = findViewById(n80.c.reply_preview);
        CommentPreviewView commentPreviewView2 = (CommentPreviewView) findViewById7;
        ViewGroup.LayoutParams layoutParams5 = commentPreviewView2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMarginStart(commentPreviewView2.getResources().getDimensionPixelSize(m60.r0.pin_comment_feed_reply_offset));
        commentPreviewView2.setLayoutParams(marginLayoutParams5);
        Intrinsics.checkNotNullParameter(size, "size");
        commentPreviewView2.f35097f.H2(new uq.s(size, b14 == true ? 1 : 0));
        commentPreviewView2.setPaddingRelative(shouldRenderLandscapeConfiguration ? 0 : commentPreviewView2.getPaddingStart(), commentPreviewView2.getPaddingTop(), shouldRenderLandscapeConfiguration ? 0 : commentPreviewView2.getPaddingEnd(), commentPreviewView2.getPaddingBottom());
        d4 onClick4 = new d4(this, i13);
        Intrinsics.checkNotNullParameter(onClick4, "onClick");
        commentPreviewView2.f35104m = onClick4;
        c4 onClick5 = new c4(this, i13);
        Intrinsics.checkNotNullParameter(onClick5, "onClick");
        commentPreviewView2.f35106o = onClick5;
        c4 onClick6 = new c4(this, 2);
        Intrinsics.checkNotNullParameter(onClick6, "onClick");
        commentPreviewView2.f35105n = onClick6;
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.f109315o = commentPreviewView2;
        View findViewById8 = findViewById(n80.c.comment_composer);
        CommentComposerView commentComposerView = (CommentComposerView) findViewById8;
        commentComposerView.f35070J = true;
        GestaltTextComposer gestaltTextComposer = commentComposerView.f35086s;
        hf0.b.k(gestaltTextComposer);
        if (z13) {
            commentComposerView.f35087t.requestFocus();
        }
        commentComposerView.L0(new e4(6, this, j4.class, "notifyOnClickSendComment", "notifyOnClickSendComment(Landroid/text/Editable;Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Ljava/util/List;)V", 0));
        commentComposerView.t0(h32.g0.PIN_CLOSEUP_COMMENTS);
        ViewGroup.LayoutParams layoutParams6 = commentComposerView.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
        marginLayoutParams6.topMargin = bs1.c.W(commentComposerView, eo1.c.lego_spacing_vertical_small);
        marginLayoutParams6.bottomMargin = bs1.c.W(commentComposerView, eo1.c.lego_spacing_vertical_small);
        commentComposerView.setLayoutParams(marginLayoutParams6);
        commentComposerView.setPaddingRelative(shouldRenderLandscapeConfiguration ? 0 : commentComposerView.getPaddingStart(), commentComposerView.getPaddingTop(), shouldRenderLandscapeConfiguration ? 0 : commentComposerView.getPaddingEnd(), commentComposerView.getPaddingBottom());
        commentComposerView.f35085r.H2(new cp.t(b13 == true ? 1 : 0, 7));
        gestaltTextComposer.X(uq.d.f122991o);
        commentComposerView.f35083p = new f4(this);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        this.f109316p = commentComposerView;
        View findViewById9 = findViewById(n80.c.more_comments_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById9;
        gestaltButton.e(new xo.k(this, 13));
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        this.f109317q = gestaltButton;
        View findViewById10 = findViewById(n80.c.unified_comments_content_layout);
        LinearLayout linearLayout2 = (LinearLayout) findViewById10;
        if (shouldRenderLandscapeConfiguration) {
            Intrinsics.f(linearLayout2);
            linearLayout2.setPaddingRelative(bs1.c.W(linearLayout2, eo1.c.space_600), 0, bs1.c.W(linearLayout2, eo1.c.space_600), linearLayout2.getPaddingBottom());
        }
        Intrinsics.checkNotNullExpressionValue(findViewById10, "apply(...)");
        this.f109318r = linearLayout2;
    }

    public static final void b(j4 j4Var, uq.p pVar, c viewType) {
        h32.v0 v0Var;
        String str;
        h32.v0 v0Var2;
        wy0 w13;
        String userId;
        String f39332b;
        qh1.f fVar;
        j4Var.getClass();
        switch (g4.f109217c[pVar.ordinal()]) {
            case 1:
            case 2:
                i01.q qVar = j4Var.f109319s;
                if (qVar != null) {
                    ((w01.m0) qVar).w3(viewType);
                }
                f30 pin = j4Var.getPin();
                if (pin != null) {
                    nx.d1 d1Var = j4Var.f109307g;
                    if (d1Var == null) {
                        Intrinsics.r("trackingParamAttacher");
                        throw null;
                    }
                    String b13 = d1Var.b(pin);
                    if (b13 != null) {
                        v0Var2 = new h32.v0();
                        v0Var2.G = b13;
                    } else {
                        v0Var2 = null;
                    }
                    v0Var = v0Var2;
                } else {
                    v0Var = null;
                }
                nx.d0 viewPinalytics = j4Var.getViewPinalytics();
                if (viewPinalytics != null) {
                    h32.f1 f1Var = h32.f1.COMMUNITY_VIEW_INTENT;
                    h32.u0 u0Var = h32.u0.CLOSEUP_COMMENT;
                    h32.g0 g0Var = h32.g0.PIN_CLOSEUP_COMMENTS;
                    f30 pin2 = j4Var.getPin();
                    String f39332b2 = pin2 != null ? pin2.getF39332b() : null;
                    HashMap hashMap = new HashMap();
                    f30 pin3 = j4Var.getPin();
                    if (pin3 == null || (str = pin3.getF39332b()) == null) {
                        str = "";
                    }
                    hashMap.put("pin_id", str);
                    Unit unit = Unit.f80348a;
                    viewPinalytics.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : f39332b2, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    return;
                }
                return;
            case 3:
            case 4:
                i01.q qVar2 = j4Var.f109319s;
                if (qVar2 != null) {
                    w01.m0 m0Var = (w01.m0) qVar2;
                    Intrinsics.checkNotNullParameter(viewType, "viewType");
                    rp0.d r33 = m0Var.r3(viewType);
                    if (r33 == null || (w13 = r33.w()) == null || (userId = w13.getF39332b()) == null) {
                        return;
                    }
                    qh1.f fVar2 = m0Var.f127082v;
                    if (fVar2 != null) {
                        Intrinsics.checkNotNullParameter(userId, "userId");
                        fVar2.b("on_user_tap", null);
                    }
                    r41.k.f106176a.d(userId, r41.b.PinCloseupUnifiedCommentsModule);
                    return;
                }
                return;
            case 5:
                i01.q qVar3 = j4Var.f109319s;
                if (qVar3 != null) {
                    ((w01.m0) qVar3).x3(true, viewType);
                    return;
                }
                return;
            case 6:
                i01.q qVar4 = j4Var.f109319s;
                if (qVar4 != null) {
                    ((w01.m0) qVar4).x3(false, viewType);
                    return;
                }
                return;
            case 7:
                i01.q qVar5 = j4Var.f109319s;
                if (qVar5 != null) {
                    w01.m0 m0Var2 = (w01.m0) qVar5;
                    Intrinsics.checkNotNullParameter(viewType, "viewType");
                    rp0.d r34 = m0Var2.r3(viewType);
                    if (r34 != null && (fVar = m0Var2.f127082v) != null) {
                        fVar.b("on_reply_tap", r34);
                    }
                    f30 f30Var = m0Var2.f127062b;
                    if (f30Var == null || (f39332b = f30Var.getF39332b()) == null) {
                        return;
                    }
                    m0Var2.f127073m.n(m0Var2.f127081u.f122379a, f39332b, (r36 & 4) != 0 ? "" : null, (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : m0Var2.f127079s, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, (r36 & 1024) != 0 ? false : false, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : null, (r36 & 8192) != 0 ? Boolean.FALSE : Boolean.TRUE, (r36 & 16384) != 0 ? false : false, (r36 & 32768) != 0 ? false : false, m0Var2.f127075o.u());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final void e(j4 j4Var, rp0.d dVar, CommentPreviewView commentPreviewView) {
        i01.q qVar;
        j4Var.getClass();
        if (Intrinsics.d(dVar.y(), Boolean.TRUE) && (qVar = j4Var.f109319s) != null) {
            String commentId = dVar.v();
            String originalText = dVar.r();
            i4 translationStatusChangeCallback = new i4(3, commentPreviewView, CommentPreviewView.class, "updateTranslation", "updateTranslation(Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/feature/unifiedcomments/view/CommentRep$TranslationStatus;)V", 0);
            w01.m0 m0Var = (w01.m0) qVar;
            Intrinsics.checkNotNullParameter(commentId, "commentId");
            Intrinsics.checkNotNullParameter(originalText, "originalText");
            Intrinsics.checkNotNullParameter(translationStatusChangeCallback, "translationStatusChangeCallback");
            m0Var.f127084x.b(commentId, originalText, translationStatusChangeCallback, new w01.l0(2, m0Var, w01.m0.class, "loadTranslation", "loadTranslation(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", 0));
        }
    }

    @Override // zp0.h
    public final void Y(SpannableStringBuilder updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        this.f109316p.F0(updated);
    }

    public final void g(GestaltText gestaltText) {
        int W = bs1.c.W(this, eo1.c.space_600);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(W);
        marginLayoutParams.setMarginEnd(W);
        gestaltText.setLayoutParams(marginLayoutParams);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        CommentPreviewView[] elements = {this.f109314n, this.f109315o};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List[] elements2 = {kotlin.collections.c0.A(elements), this.f109313m.f35112f};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return kotlin.collections.g0.r(kotlin.collections.c0.A(elements2));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_COMMENTS;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    public final void i(f30 pin, wy0 user) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(user, "user");
        Boolean Q3 = pin.Q3();
        Intrinsics.checkNotNullExpressionValue(Q3, "getCommentsDisabled(...)");
        if (Q3.booleanValue()) {
            n();
            return;
        }
        if (b40.f0(pin) == 0) {
            o(pin, user);
            return;
        }
        k();
        this.f109311k.i(new zp.v0(pin, false));
        this.f109316p.T0(user);
        q(b40.f0(pin));
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109301a) {
            return;
        }
        this.f109301a = true;
        jb jbVar = (jb) ((k4) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109302b = s8Var.j5();
        this.f109303c = (up0.l) oaVar.Rc.get();
        this.f109304d = (x02.u) oaVar.f113635ce.get();
        this.f109305e = (x02.p1) oaVar.f113670ee.get();
        this.f109306f = (qh1.e) s8Var.P1.get();
        this.f109307g = (nx.d1) oaVar.f113730i2.get();
        this.f109308h = s8Var.a6();
    }

    public final boolean j() {
        return this.f109322v;
    }

    public final void k() {
        pk.a0.k0(this.f109312l);
        z3 listener = new z3(this, 1);
        PinCommentReactionHeaderView pinCommentReactionHeaderView = this.f109310j;
        pinCommentReactionHeaderView.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        pinCommentReactionHeaderView.f48947e.setOnClickListener(listener);
        CommentComposerView commentComposerView = this.f109316p;
        commentComposerView.getClass();
        commentComposerView.f35085r.H2(new cp.t(false, 7));
    }

    public final void l(f30 f30Var) {
        qh1.e eVar = this.f109306f;
        if (eVar == null) {
            Intrinsics.r("commentUtils");
            throw null;
        }
        nx.d0 viewPinalytics = getViewPinalytics();
        String f39332b = f30Var.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        String g13 = b40.g(f30Var);
        h32.u0 u0Var = h32.u0.PIN_COMMENT_BUTTON;
        h32.g0 g0Var = h32.g0.PIN_CLOSEUP_COMMENTS;
        Boolean bool = Boolean.TRUE;
        lh0.a0 a0Var = this.f109302b;
        if (a0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        boolean u13 = a0Var.u();
        lh0.a0 a0Var2 = this.f109302b;
        if (a0Var2 == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        eVar.n(viewPinalytics, f39332b, (r36 & 4) != 0 ? "" : g13, (r36 & 8) != 0 ? null : u0Var, (r36 & 16) != 0 ? null : g0Var, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, (r36 & 1024) != 0 ? false : false, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : null, (r36 & 8192) != 0 ? Boolean.FALSE : bool, (r36 & 16384) != 0 ? false : true, (r36 & 32768) != 0 ? false : u13, a0Var2.u());
        this.f109322v = true;
    }

    public final void m() {
        this.f109322v = false;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionStart() {
        return null;
    }

    public final void n() {
        h4 h4Var = h4.f109258u;
        GestaltText gestaltText = this.f109312l;
        gestaltText.i(h4Var);
        gestaltText.setTextAlignment(5);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = bs1.c.W(gestaltText, eo1.c.space_600);
        gestaltText.setLayoutParams(marginLayoutParams);
        pk.a0.k0(this.f109311k);
        bs1.c.X0(this.f109318r);
    }

    @Override // zp0.h
    public final void n6() {
        this.f109316p.H0();
    }

    public final void o(f30 pin, wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (b40.f0(pin) == 0) {
            this.f109309i.setOnClickListener(new co.a(14, this, pin));
        }
        boolean z13 = true;
        this.f109311k.i(new zp.v0(pin, true));
        pk.a0.k0(this.f109312l);
        CommentComposerView commentComposerView = this.f109316p;
        commentComposerView.T0(user);
        ViewGroup.LayoutParams layoutParams = commentComposerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = bs1.c.W(commentComposerView, eo1.c.lego_spacing_vertical_small_half);
        commentComposerView.setLayoutParams(marginLayoutParams);
        commentComposerView.f35085r.H2(new cp.t(z13, 7));
        bs1.c.U1(commentComposerView);
        bs1.c.X0(this.f109313m);
        bs1.c.X0(this.f109314n);
        bs1.c.X0(this.f109315o);
        pk.a0.l0(this.f109317q);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f109320t.dispose();
    }

    public final void q(int i13) {
        this.f109321u = i13;
        this.f109313m.getClass();
        CommentPreviewView commentPreviewView = this.f109314n;
        String text = getResources().getString(this.f109321u - ((commentPreviewView.getVisibility() == 0 ? 1 : 0) + (this.f109315o.getVisibility() == 0 ? 1 : 0)) > 0 ? n80.f.unified_comments_preview_expand_view_all : n80.f.unified_comments_preview_expand_view);
        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
        Intrinsics.checkNotNullParameter(text, "text");
        commentPreviewView.f35098g.i(new l2(text, 7));
        pk.a0.l0(this.f109317q);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void renderLandscapeConfiguration() {
        this.f109311k.i(h4.f109257t);
    }

    public final void s(f30 pin, final rp0.d commentPreview, c viewType) {
        final CommentPreviewView commentPreviewView;
        nx.d0 d0Var;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        int i13 = g4.f109216b[viewType.ordinal()];
        if (i13 == 1) {
            commentPreviewView = this.f109314n;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            commentPreviewView = this.f109315o;
        }
        if (commentPreview == null || viewType == c.Reply) {
            bs1.c.X0(commentPreviewView);
        } else {
            wy0 w13 = commentPreview.w();
            up0.l typeaheadTextUtility = this.f109303c;
            if (typeaheadTextUtility == null) {
                Intrinsics.r("typeaheadTextUtility");
                throw null;
            }
            commentPreviewView.getClass();
            Intrinsics.checkNotNullParameter(commentPreview, "commentPreview");
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(typeaheadTextUtility, "typeaheadTextUtility");
            commentPreviewView.f35108q = commentPreview;
            commentPreviewView.f35110s = pin;
            commentPreviewView.f35109r = w13;
            if (w13 != null) {
                kh2.m0.V0(commentPreviewView.f35097f, w13);
            }
            String U2 = w13 != null ? w13.U2() : null;
            if (U2 == null) {
                U2 = "";
            }
            commentPreviewView.setContentDescription(commentPreviewView.getResources().getString(ob2.f.content_description_comment_by_user, U2));
            String r13 = commentPreview.r();
            if (commentPreview.g().length() > 0 && commentPreview.r().length() == 0) {
                r13 = bs1.c.f2(commentPreviewView, commentPreview.c() ? ob2.f.added_a_sticker_comment : ob2.f.added_a_photo_comment);
            }
            commentPreview.g();
            bs1.c.R1(commentPreviewView.f35099h, false);
            Context context = commentPreviewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            commentPreviewView.f35098g.i(new zp.s0(up0.l.d(typeaheadTextUtility, context, r13, commentPreview.q(), pin.getF39332b(), 24), 11));
            final boolean d2 = Intrinsics.d(commentPreview.y(), Boolean.TRUE);
            if (d2 && (d0Var = commentPreviewView.f35107p) != null) {
                nx.d0.v(d0Var, h32.f1.SEE_TRANSLATION_VIEWED, commentPreview.v(), false, 12);
            }
            cp.t tVar = new cp.t(d2, 8);
            GestaltText gestaltText = commentPreviewView.f35101j;
            gestaltText.i(tVar);
            gestaltText.j(new gm1.a() { // from class: uq.o
                @Override // gm1.a
                public final void h3(gm1.c event) {
                    int i14 = CommentPreviewView.f35094u;
                    CommentPreviewView this$0 = commentPreviewView;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    rp0.d commentPreview2 = commentPreview;
                    Intrinsics.checkNotNullParameter(commentPreview2, "$commentPreview");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if ((event instanceof rn1.f) && d2) {
                        this$0.f35106o.invoke(commentPreview2, this$0);
                    }
                }
            });
            ba.s sVar = new ba.s(25, commentPreviewView, commentPreview);
            CommentReactionIndicator commentReactionIndicator = commentPreviewView.f35102k;
            commentReactionIndicator.T(sVar);
            commentReactionIndicator.X(new e.f(commentPreviewView, commentPreview, commentReactionIndicator, 21));
            bs1.c.R1(commentPreviewView, true);
        }
        q(b40.f0(pin));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        f30 pin;
        return getIsFullPinLoaded() && (pin = getPin()) != null && Intrinsics.d(pin.G4(), Boolean.TRUE);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return getIsFullPinLoaded();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        if (this.f109306f == null) {
            Intrinsics.r("commentUtils");
            throw null;
        }
        boolean h10 = qh1.e.h(pin);
        PinCommentReactionHeaderView pinCommentReactionHeaderView = this.f109310j;
        if (h10) {
            pinCommentReactionHeaderView.T(pin);
            pinCommentReactionHeaderView.X(h32.d4.PIN);
            bs1.c.U1(pinCommentReactionHeaderView);
            pk.a0.k0(this.f109311k);
        } else {
            bs1.c.X0(pinCommentReactionHeaderView);
        }
        if (!pin.Q3().booleanValue()) {
            q(b40.f0(pin));
        }
        CommentComposerView commentComposerView = this.f109316p;
        commentComposerView.P0(pin);
        zp.j0 action = new zp.j0(7, this, pin);
        Intrinsics.checkNotNullParameter(action, "action");
        commentComposerView.f35086s.o0().setFocusableInTouchMode(false);
        commentComposerView.f35093z = action;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePinalytics(nx.d0 pinalytics) {
        super.updatePinalytics(pinalytics);
        if (pinalytics != null) {
            PinCommentReactionHeaderView pinCommentReactionHeaderView = this.f109310j;
            pinCommentReactionHeaderView.getClass();
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            pinCommentReactionHeaderView.f48953k = pinalytics;
            CommentPreviewView commentPreviewView = this.f109314n;
            commentPreviewView.getClass();
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            commentPreviewView.f35107p = pinalytics;
        }
    }
}
