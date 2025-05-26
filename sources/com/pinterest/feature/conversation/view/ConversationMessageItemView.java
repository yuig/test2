package com.pinterest.feature.conversation.view;

import a.m2;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import ao2.j0;
import aq0.g;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.e40;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.view.RoundedCornersImageView;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.imageview.GlideWebImageView;
import com.pinterest.ui.imageview.ProportionalImageView;
import dq0.i;
import g70.h;
import gg0.n0;
import il1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kh2.j1;
import kh2.k3;
import kh2.m0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.h1;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lh0.p0;
import lq0.b1;
import lq0.c1;
import lq0.d1;
import lq0.k;
import lq0.n;
import lq0.o;
import lq0.p;
import lq0.q;
import lq0.r;
import lq0.r0;
import lq0.s;
import lq0.s0;
import lq0.t;
import lq0.t1;
import lq0.u;
import m60.w;
import m60.x0;
import mq0.d;
import nx.d0;
import oc.c;
import oo1.j;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rl2.g0;
import rq.y;
import sk0.x;
import x02.a2;
import x02.e1;
import x02.i2;
import x02.x2;
import xc0.e;
import xc0.f;
import xj2.b;
import xk2.v;
import ye2.m;
import zp.c0;
import zp.y0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/conversation/view/ConversationMessageItemView;", "Landroid/widget/RelativeLayout;", "Laq0/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lq0/p", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConversationMessageItemView extends n0 implements g {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f45540e1 = 0;
    public GestaltText A;
    public d A0;
    public ConversationDidItemView B;
    public boolean B0;
    public ViewGroup C;
    public boolean C0;
    public GestaltText D;
    public boolean D0;
    public LinearLayout E;
    public boolean E0;
    public LinearLayout F;
    public boolean F0;
    public ImageView G;
    public boolean G0;
    public ImageView H;
    public p H0;
    public ConversationMessageReactionCountListDisplay I;
    public b1 I0;

    /* renamed from: J, reason: collision with root package name */
    public ConversationMessageReactionCountListDisplay f45541J;
    public final ArrayList J0;
    public ImageView K;
    public final b K0;
    public ViewGroup L;
    public List L0;
    public View M;
    public a M0;
    public View N;
    public x2 N0;
    public ViewGroup O;
    public i2 O0;
    public GestaltAvatar P;
    public w P0;
    public FrameLayout Q;
    public p0 Q0;
    public View R;
    public e02.a R0;
    public ConversationPinGifItemImageView S;
    public b60.b S0;
    public ViewGroup T;
    public c T0;
    public UpdatedConversationBoardItemView U;
    public e1 U0;
    public ViewGroup V;
    public r0 V0;
    public GestaltText W;
    public c2 W0;
    public h X0;
    public final int Y0;
    public final int Z0;

    /* renamed from: a0, reason: collision with root package name */
    public wy0 f45542a0;

    /* renamed from: a1, reason: collision with root package name */
    public final int f45543a1;

    /* renamed from: b0, reason: collision with root package name */
    public GestaltText f45544b0;

    /* renamed from: b1, reason: collision with root package name */
    public final float f45545b1;

    /* renamed from: c0, reason: collision with root package name */
    public mv f45546c0;

    /* renamed from: c1, reason: collision with root package name */
    public final v f45547c1;

    /* renamed from: d, reason: collision with root package name */
    public ViewGroup f45548d;

    /* renamed from: d0, reason: collision with root package name */
    public d0 f45549d0;

    /* renamed from: d1, reason: collision with root package name */
    public final r f45550d1;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f45551e;

    /* renamed from: e0, reason: collision with root package name */
    public String f45552e0;

    /* renamed from: f, reason: collision with root package name */
    public GestaltText f45553f;

    /* renamed from: f0, reason: collision with root package name */
    public f30 f45554f0;

    /* renamed from: g, reason: collision with root package name */
    public GestaltAvatar f45555g;

    /* renamed from: g0, reason: collision with root package name */
    public v7 f45556g0;

    /* renamed from: h, reason: collision with root package name */
    public GestaltText f45557h;

    /* renamed from: h0, reason: collision with root package name */
    public int f45558h0;

    /* renamed from: i, reason: collision with root package name */
    public GestaltText f45559i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f45560i0;

    /* renamed from: j, reason: collision with root package name */
    public FrameLayout f45561j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f45562j0;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f45563k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f45564k0;

    /* renamed from: l, reason: collision with root package name */
    public View f45565l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f45566l0;

    /* renamed from: m, reason: collision with root package name */
    public FrameLayout f45567m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f45568m0;

    /* renamed from: n, reason: collision with root package name */
    public ConversationPinGifItemImageView f45569n;

    /* renamed from: n0, reason: collision with root package name */
    public String f45570n0;

    /* renamed from: o, reason: collision with root package name */
    public UpdatedConversationBoardItemView f45571o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f45572o0;

    /* renamed from: p, reason: collision with root package name */
    public ViewGroup f45573p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f45574p0;

    /* renamed from: q, reason: collision with root package name */
    public GestaltAvatar f45575q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f45576q0;

    /* renamed from: r, reason: collision with root package name */
    public GestaltText f45577r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f45578r0;

    /* renamed from: s, reason: collision with root package name */
    public GestaltText f45579s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f45580s0;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f45581t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f45582t0;

    /* renamed from: u, reason: collision with root package name */
    public GlideWebImageView f45583u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f45584u0;

    /* renamed from: v, reason: collision with root package name */
    public GlideWebImageView f45585v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f45586v0;

    /* renamed from: w, reason: collision with root package name */
    public ViewGroup f45587w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f45588w0;

    /* renamed from: x, reason: collision with root package name */
    public GestaltAvatar f45589x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f45590x0;

    /* renamed from: y, reason: collision with root package name */
    public GestaltText f45591y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f45592y0;

    /* renamed from: z, reason: collision with root package name */
    public PinterestRecyclerView f45593z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f45594z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageItemView(m context) {
        super(context, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45558h0 = -1;
        this.f45594z0 = true;
        this.A0 = d.NONE;
        this.H0 = p.NONE;
        this.I0 = d1.f84292a;
        this.J0 = new ArrayList();
        this.K0 = new b();
        this.L0 = q0.f80391a;
        this.Y0 = RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM;
        this.Z0 = 80;
        this.f45543a1 = 16;
        this.f45545b1 = bs1.c.W(this, eo1.c.lego_corner_radius_medium_border);
        this.f45547c1 = xk2.m.b(new s(this, 0));
        this.f45550d1 = new r(this);
        G0();
    }

    public static boolean H0(mv mvVar) {
        return mvVar.H() == mv.c.BOARD_INVITE_ACCEPTED_SYSTEM_MESSAGE || mvVar.H() == mv.c.BOARD_INVITE_SENT_SYSTEM_MESSAGE || mvVar.H() == mv.c.BOARD_NEW_PINS_SYSTEM_MESSAGE;
    }

    public static /* synthetic */ void T0(ConversationMessageItemView conversationMessageItemView, GestaltAvatar gestaltAvatar, wy0 wy0Var, int i13) {
        conversationMessageItemView.S0(gestaltAvatar, wy0Var, (i13 & 4) != 0, true);
    }

    public static final SpannableString i(ConversationMessageItemView conversationMessageItemView, String str) {
        String str2;
        String j13;
        conversationMessageItemView.getClass();
        SpannableString spannableString = new SpannableString(str);
        mv mvVar = conversationMessageItemView.f45546c0;
        if (mvVar == null) {
            Intrinsics.r("message");
            throw null;
        }
        v7 D = mvVar.D();
        String str3 = "";
        if (D == null || (str2 = D.j1()) == null) {
            str2 = "";
        }
        conversationMessageItemView.j(spannableString, str, str2, eo1.b.base_color_blue_300);
        mv mvVar2 = conversationMessageItemView.f45546c0;
        if (mvVar2 == null) {
            Intrinsics.r("message");
            throw null;
        }
        v7 D2 = mvVar2.D();
        if (D2 != null && (j13 = D2.j1()) != null) {
            str3 = j13;
        }
        k(spannableString, str, str3);
        return spannableString;
    }

    public static void k(SpannableString spannableString, String str, String str2) {
        spannableString.setSpan(new StyleSpan(1), StringsKt.L(str, str2, 0, false, 6), str2.length() + StringsKt.L(str, str2, 0, false, 6), 34);
    }

    public final x2 B0() {
        x2 x2Var = this.N0;
        if (x2Var != null) {
            return x2Var;
        }
        Intrinsics.r("userRepository");
        throw null;
    }

    public final FrameLayout C() {
        FrameLayout frameLayout = this.f45561j;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("messageTextContainer");
        throw null;
    }

    public final GestaltText D() {
        GestaltText gestaltText = this.f45557h;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("messageTextView");
        throw null;
    }

    public final void F0() {
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            Intrinsics.r("inlineActionsContainerSelf");
            throw null;
        }
        bs1.c.R1(linearLayout, false);
        bs1.c.R1(linearLayout.findViewById(e.save_icon), false);
        bs1.c.R1(linearLayout.findViewById(e.send_icon), false);
        bs1.c.R1(linearLayout.findViewById(e.thread_reply_icon), false);
        LinearLayout linearLayout2 = this.F;
        if (linearLayout2 == null) {
            Intrinsics.r("inlineActionsContainerOther");
            throw null;
        }
        bs1.c.R1(linearLayout2, false);
        bs1.c.R1(linearLayout2.findViewById(e.save_icon), false);
        bs1.c.R1(linearLayout2.findViewById(e.send_icon), false);
        bs1.c.R1(linearLayout2.findViewById(e.thread_reply_icon), false);
    }

    public final void G0() {
        View.inflate(getContext(), f.list_cell_conversation_lego, this);
        View findViewById = findViewById(e.message_cell);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
        this.f45548d = viewGroup;
        View findViewById2 = findViewById(e.timestamp_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f45551e = gestaltText;
        View findViewById3 = findViewById(e.name_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.f45553f = gestaltText2;
        View findViewById4 = findViewById(e.sender_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById4;
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<set-?>");
        this.f45555g = gestaltAvatar;
        View findViewById5 = findViewById(e.message_text_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById5;
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.f45561j = frameLayout;
        View findViewById6 = findViewById(e.message_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        GestaltText gestaltText3 = (GestaltText) findViewById6;
        Intrinsics.checkNotNullParameter(gestaltText3, "<set-?>");
        this.f45557h = gestaltText3;
        View findViewById7 = findViewById(e.message_deleted_container);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById7;
        Intrinsics.checkNotNullParameter(frameLayout2, "<set-?>");
        this.f45563k = frameLayout2;
        View findViewById8 = findViewById(e.message_deleted_text);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltText gestaltText4 = (GestaltText) findViewById8;
        Intrinsics.checkNotNullParameter(gestaltText4, "<set-?>");
        this.f45559i = gestaltText4;
        View findViewById9 = findViewById(e.pin_view_container);
        FrameLayout frameLayout3 = (FrameLayout) findViewById9;
        r0 r0Var = this.V0;
        if (r0Var == null) {
            Intrinsics.r("conversationPinItemViewFactory");
            throw null;
        }
        Context context = frameLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        z r13 = b7.c.r(this);
        j0 scope = r13 != null ? bf.b.S(r13) : dl2.b.e();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        s0 s0Var = new s0(context, scope, false, r0Var.f84412a, r0Var.f84413b, r0Var.f84414c);
        Intrinsics.checkNotNullParameter(s0Var, "<set-?>");
        this.f45565l = s0Var;
        frameLayout3.addView(s0Var);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "apply(...)");
        Intrinsics.checkNotNullParameter(frameLayout3, "<set-?>");
        this.f45567m = frameLayout3;
        View findViewById10 = findViewById(e.conversation_lego_pin_gif_imageview);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        ConversationPinGifItemImageView conversationPinGifItemImageView = (ConversationPinGifItemImageView) findViewById10;
        Intrinsics.checkNotNullParameter(conversationPinGifItemImageView, "<set-?>");
        this.f45569n = conversationPinGifItemImageView;
        View findViewById11 = findViewById(e.updated_board_view);
        UpdatedConversationBoardItemView updatedConversationBoardItemView = (UpdatedConversationBoardItemView) findViewById11;
        k3.R1(updatedConversationBoardItemView, true);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        Intrinsics.checkNotNullParameter(updatedConversationBoardItemView, "<set-?>");
        this.f45571o = updatedConversationBoardItemView;
        View findViewById12 = findViewById(e.updated_pinner_view);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById12;
        Intrinsics.checkNotNullParameter(viewGroup2, "<set-?>");
        this.f45573p = viewGroup2;
        View findViewById13 = T().findViewById(e.updated_pinner_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        GestaltAvatar gestaltAvatar2 = (GestaltAvatar) findViewById13;
        Intrinsics.checkNotNullParameter(gestaltAvatar2, "<set-?>");
        this.f45575q = gestaltAvatar2;
        View findViewById14 = T().findViewById(e.updated_pinner_fullname);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        GestaltText gestaltText5 = (GestaltText) findViewById14;
        Intrinsics.checkNotNullParameter(gestaltText5, "<set-?>");
        this.f45577r = gestaltText5;
        View findViewById15 = T().findViewById(e.pinner_followers);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        GestaltText gestaltText6 = (GestaltText) findViewById15;
        Intrinsics.checkNotNullParameter(gestaltText6, "<set-?>");
        this.f45579s = gestaltText6;
        View findViewById16 = T().findViewById(e.pinner_verified_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById16;
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.f45581t = imageView;
        View findViewById17 = T().findViewById(e.pinner_preview_image_one);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        GlideWebImageView glideWebImageView = (GlideWebImageView) findViewById17;
        Intrinsics.checkNotNullParameter(glideWebImageView, "<set-?>");
        this.f45583u = glideWebImageView;
        View findViewById18 = T().findViewById(e.pinner_preview_image_two);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        GlideWebImageView glideWebImageView2 = (GlideWebImageView) findViewById18;
        Intrinsics.checkNotNullParameter(glideWebImageView2, "<set-?>");
        this.f45585v = glideWebImageView2;
        View findViewById19 = findViewById(e.system_message_view);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        ViewGroup viewGroup3 = (ViewGroup) findViewById19;
        Intrinsics.checkNotNullParameter(viewGroup3, "<set-?>");
        this.f45587w = viewGroup3;
        View findViewById20 = d0().findViewById(e.user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        GestaltAvatar gestaltAvatar3 = (GestaltAvatar) findViewById20;
        Intrinsics.checkNotNullParameter(gestaltAvatar3, "<set-?>");
        this.f45589x = gestaltAvatar3;
        View findViewById21 = d0().findViewById(e.system_message_text);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        GestaltText gestaltText7 = (GestaltText) findViewById21;
        Intrinsics.checkNotNullParameter(gestaltText7, "<set-?>");
        this.f45591y = gestaltText7;
        View findViewById22 = findViewById(e.message_content_system_message_text);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        GestaltText gestaltText8 = (GestaltText) findViewById22;
        Intrinsics.checkNotNullParameter(gestaltText8, "<set-?>");
        this.A = gestaltText8;
        View findViewById23 = d0().findViewById(e.conversation_system_message_board_pins_recycler);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById23;
        Intrinsics.checkNotNullParameter(pinterestRecyclerView, "<set-?>");
        this.f45593z = pinterestRecyclerView;
        View findViewById24 = findViewById(e.did_it_view);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        ConversationDidItemView conversationDidItemView = (ConversationDidItemView) findViewById24;
        Intrinsics.checkNotNullParameter(conversationDidItemView, "<set-?>");
        this.B = conversationDidItemView;
        View findViewById25 = findViewById(e.content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById25, "findViewById(...)");
        ViewGroup viewGroup4 = (ViewGroup) findViewById25;
        Intrinsics.checkNotNullParameter(viewGroup4, "<set-?>");
        this.C = viewGroup4;
        View findViewById26 = findViewById(e.seen_text);
        Intrinsics.checkNotNullExpressionValue(findViewById26, "findViewById(...)");
        GestaltText gestaltText9 = (GestaltText) findViewById26;
        Intrinsics.checkNotNullParameter(gestaltText9, "<set-?>");
        this.D = gestaltText9;
        View findViewById27 = findViewById(e.inline_actions_container_self);
        Intrinsics.checkNotNullExpressionValue(findViewById27, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById27;
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.E = linearLayout;
        View findViewById28 = findViewById(e.inline_actions_container_other);
        Intrinsics.checkNotNullExpressionValue(findViewById28, "findViewById(...)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById28;
        Intrinsics.checkNotNullParameter(linearLayout2, "<set-?>");
        this.F = linearLayout2;
        View findViewById29 = findViewById(e.reaction_indicator_bubble_me);
        Intrinsics.checkNotNullExpressionValue(findViewById29, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById29;
        Intrinsics.checkNotNullParameter(imageView2, "<set-?>");
        this.G = imageView2;
        View findViewById30 = findViewById(e.reaction_indicator_bubble_other_user_ux);
        Intrinsics.checkNotNullExpressionValue(findViewById30, "findViewById(...)");
        ImageView imageView3 = (ImageView) findViewById30;
        Intrinsics.checkNotNullParameter(imageView3, "<set-?>");
        this.H = imageView3;
        View findViewById31 = findViewById(e.reaction_count_display_bubble_me_container);
        Intrinsics.checkNotNullExpressionValue(findViewById31, "findViewById(...)");
        ConversationMessageReactionCountListDisplay conversationMessageReactionCountListDisplay = (ConversationMessageReactionCountListDisplay) findViewById31;
        Intrinsics.checkNotNullParameter(conversationMessageReactionCountListDisplay, "<set-?>");
        this.f45541J = conversationMessageReactionCountListDisplay;
        View findViewById32 = findViewById(e.reaction_count_display_bubble_other_user_container);
        Intrinsics.checkNotNullExpressionValue(findViewById32, "findViewById(...)");
        ConversationMessageReactionCountListDisplay conversationMessageReactionCountListDisplay2 = (ConversationMessageReactionCountListDisplay) findViewById32;
        Intrinsics.checkNotNullParameter(conversationMessageReactionCountListDisplay2, "<set-?>");
        this.I = conversationMessageReactionCountListDisplay2;
        View findViewById33 = findViewById(e.conversation_message_content);
        Intrinsics.checkNotNullExpressionValue(findViewById33, "findViewById(...)");
        Intrinsics.checkNotNullParameter((LinearLayout) findViewById33, "<set-?>");
        View findViewById34 = findViewById(e.reaction_permanent_entry_point_ux);
        Intrinsics.checkNotNullExpressionValue(findViewById34, "findViewById(...)");
        ImageView imageView4 = (ImageView) findViewById34;
        Intrinsics.checkNotNullParameter(imageView4, "<set-?>");
        this.K = imageView4;
        View findViewById35 = findViewById(e.thread_info_container);
        Intrinsics.checkNotNullExpressionValue(findViewById35, "findViewById(...)");
        ViewGroup viewGroup5 = (ViewGroup) findViewById35;
        Intrinsics.checkNotNullParameter(viewGroup5, "<set-?>");
        this.L = viewGroup5;
        View findViewById36 = findViewById(e.thread_chain_connector_start);
        Intrinsics.checkNotNullExpressionValue(findViewById36, "findViewById(...)");
        Intrinsics.checkNotNullParameter(findViewById36, "<set-?>");
        this.M = findViewById36;
        View findViewById37 = findViewById(e.thread_chain_connector_end);
        Intrinsics.checkNotNullExpressionValue(findViewById37, "findViewById(...)");
        Intrinsics.checkNotNullParameter(findViewById37, "<set-?>");
        this.N = findViewById37;
        View findViewById38 = findViewById(e.thread_anchor_and_avatar_container);
        Intrinsics.checkNotNullExpressionValue(findViewById38, "findViewById(...)");
        ViewGroup viewGroup6 = (ViewGroup) findViewById38;
        Intrinsics.checkNotNullParameter(viewGroup6, "<set-?>");
        this.O = viewGroup6;
        View findViewById39 = findViewById(e.thread_anchor_avatar_start);
        Intrinsics.checkNotNullExpressionValue(findViewById39, "findViewById(...)");
        GestaltAvatar gestaltAvatar4 = (GestaltAvatar) findViewById39;
        Intrinsics.checkNotNullParameter(gestaltAvatar4, "<set-?>");
        this.P = gestaltAvatar4;
        View findViewById40 = findViewById(e.thread_anchor_pin_container);
        FrameLayout frameLayout4 = (FrameLayout) findViewById40;
        r0 r0Var2 = this.V0;
        if (r0Var2 == null) {
            Intrinsics.r("conversationPinItemViewFactory");
            throw null;
        }
        Context context2 = frameLayout4.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        z r14 = b7.c.r(this);
        j0 scope2 = r14 != null ? bf.b.S(r14) : dl2.b.e();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(scope2, "scope");
        s0 s0Var2 = new s0(context2, scope2, true, r0Var2.f84412a, r0Var2.f84413b, r0Var2.f84414c);
        Intrinsics.checkNotNullParameter(s0Var2, "<set-?>");
        this.R = s0Var2;
        frameLayout4.addView(s0Var2);
        Intrinsics.checkNotNullExpressionValue(findViewById40, "apply(...)");
        Intrinsics.checkNotNullParameter(frameLayout4, "<set-?>");
        this.Q = frameLayout4;
        View findViewById41 = findViewById(e.thread_anchor_gif_imageview);
        Intrinsics.checkNotNullExpressionValue(findViewById41, "findViewById(...)");
        ConversationPinGifItemImageView conversationPinGifItemImageView2 = (ConversationPinGifItemImageView) findViewById41;
        Intrinsics.checkNotNullParameter(conversationPinGifItemImageView2, "<set-?>");
        this.S = conversationPinGifItemImageView2;
        View findViewById42 = findViewById(e.updated_thread_anchor_pinner);
        Intrinsics.checkNotNullExpressionValue(findViewById42, "findViewById(...)");
        ViewGroup viewGroup7 = (ViewGroup) findViewById42;
        Intrinsics.checkNotNullParameter(viewGroup7, "<set-?>");
        this.T = viewGroup7;
        View findViewById43 = findViewById(e.updated_thread_anchor_board);
        UpdatedConversationBoardItemView updatedConversationBoardItemView2 = (UpdatedConversationBoardItemView) findViewById43;
        k3.R1(updatedConversationBoardItemView2, true);
        Intrinsics.checkNotNullExpressionValue(findViewById43, "apply(...)");
        Intrinsics.checkNotNullParameter(updatedConversationBoardItemView2, "<set-?>");
        this.U = updatedConversationBoardItemView2;
        UpdatedConversationBoardItemView t03 = t0();
        View findViewById44 = findViewById(e.thread_anchor_text_container);
        Intrinsics.checkNotNullExpressionValue(findViewById44, "findViewById(...)");
        ViewGroup viewGroup8 = (ViewGroup) findViewById44;
        Intrinsics.checkNotNullParameter(viewGroup8, "<set-?>");
        this.V = viewGroup8;
        View findViewById45 = findViewById(e.thread_anchor_text);
        Intrinsics.checkNotNullExpressionValue(findViewById45, "findViewById(...)");
        GestaltText gestaltText10 = (GestaltText) findViewById45;
        Intrinsics.checkNotNullParameter(gestaltText10, "<set-?>");
        this.W = gestaltText10;
        View findViewById46 = findViewById(e.thread_replies_count_text);
        Intrinsics.checkNotNullExpressionValue(findViewById46, "findViewById(...)");
        GestaltText gestaltText11 = (GestaltText) findViewById46;
        Intrinsics.checkNotNullParameter(gestaltText11, "<set-?>");
        this.f45544b0 = gestaltText11;
        View view = this.R;
        if (view == null) {
            Intrinsics.r("threadAnchorPinView");
            throw null;
        }
        this.J0.addAll(h1.f(view, g0(), k0(), t03, o0()));
        b60.b bVar = this.S0;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 Q = com.bumptech.glide.d.Q(bVar);
        Intrinsics.checkNotNullParameter(Q, "<set-?>");
        this.f45542a0 = Q;
    }

    public final void I0(LinearLayout linearLayout) {
        GestaltIconButton gestaltIconButton = (GestaltIconButton) linearLayout.findViewById(e.thread_reply_icon);
        int i13 = 0;
        gestaltIconButton.setVisibility(this.I0 instanceof c1 ? 0 : 8);
        gestaltIconButton.u(new lq0.m(this, i13));
    }

    public final void K0(v7 v7Var) {
        h hVar = this.X0;
        if (hVar != null) {
            h.f(hVar, v7Var, null, 6);
        } else {
            Intrinsics.r("boardNavigator");
            throw null;
        }
    }

    public final i2 L() {
        i2 i2Var = this.O0;
        if (i2Var != null) {
            return i2Var;
        }
        Intrinsics.r("pinRepository");
        throw null;
    }

    public final void L0(String str, boolean z13) {
        String str2;
        if (this.B0 || !(this.I0 instanceof c1) || (str2 = this.f45552e0) == null) {
            return;
        }
        j jVar = j.f96854a;
        mv mvVar = this.f45546c0;
        if (mvVar != null) {
            j.p(str2, mvVar, str, z13);
        } else {
            Intrinsics.r("message");
            throw null;
        }
    }

    public final void P0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = this.f45560i0 ? 8388613 : 8388611;
        view.setLayoutParams(layoutParams2);
    }

    public final void S0(GestaltAvatar gestaltAvatar, wy0 wy0Var, boolean z13, boolean z14) {
        if (wy0Var != null) {
            if (z13) {
                gestaltAvatar.H2(lq0.d.f84270k);
            }
            gestaltAvatar.H2(new y(2, wy0Var));
            if (z14) {
                gestaltAvatar.M2(new o(1, this, wy0Var));
            }
        }
    }

    public final ViewGroup T() {
        ViewGroup viewGroup = this.f45573p;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.r("pinnerView");
        throw null;
    }

    /* renamed from: X, reason: from getter */
    public final int getF45558h0() {
        return this.f45558h0;
    }

    public final ImageView Y() {
        ImageView imageView = this.H;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("reactionIndicatorBubbleIsOtherUser");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
    
        if (r2.l("sg_android_pin_share_land_system_message") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x011c, code lost:
    
        if (r2.l("sg_android_non_pin_share_land_system_message") == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b5e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0b92  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y0(mq0.a r24) {
        /*
            Method dump skipped, instructions count: 3172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.conversation.view.ConversationMessageItemView.Y0(mq0.a):void");
    }

    public final ConversationMessageReactionCountListDisplay Z() {
        ConversationMessageReactionCountListDisplay conversationMessageReactionCountListDisplay = this.I;
        if (conversationMessageReactionCountListDisplay != null) {
            return conversationMessageReactionCountListDisplay;
        }
        Intrinsics.r("reactionsCountDisplayIsOtherUser");
        throw null;
    }

    public final c2 a0() {
        c2 c2Var = this.W0;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.r("sharesheetUtils");
        throw null;
    }

    public final void b1(String str, GlideWebImageView glideWebImageView) {
        if (true ^ (str == null || str.length() == 0)) {
            glideWebImageView.loadUrl(str);
            return;
        }
        glideWebImageView.setImageDrawable(null);
        Context context = getContext();
        int i13 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        glideWebImageView.setBackgroundColor(context.getColor(i13));
    }

    public final ViewGroup d0() {
        ViewGroup viewGroup = this.f45587w;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.r("systemMessageView");
        throw null;
    }

    public final ConversationPinGifItemImageView g0() {
        ConversationPinGifItemImageView conversationPinGifItemImageView = this.S;
        if (conversationPinGifItemImageView != null) {
            return conversationPinGifItemImageView;
        }
        Intrinsics.r("threadAnchorGifView");
        throw null;
    }

    public final void j(SpannableString spannableString, String str, String str2, int i13) {
        Context context = getContext();
        Object obj = d5.a.f53679a;
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i13)), StringsKt.L(str, str2, 0, false, 6), str2.length() + StringsKt.L(str, str2, 0, false, 6), 34);
    }

    public final ViewGroup k0() {
        ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.r("threadAnchorPinnerView");
        throw null;
    }

    public final wy0 l() {
        wy0 wy0Var = this.f45542a0;
        if (wy0Var != null) {
            return wy0Var;
        }
        Intrinsics.r("activeUser");
        throw null;
    }

    public final e02.a m() {
        e02.a aVar = this.R0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("boardRouter");
        throw null;
    }

    public final View n() {
        if (!this.E0) {
            return (this.D0 && !this.f45560i0 && Y().getId() == e.reaction_indicator_bubble_other_user_ux) ? Y() : (!this.D0 || this.f45560i0) ? q() : Z();
        }
        ImageView imageView = this.K;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("reactionPermanentEntryPoint");
        throw null;
    }

    public final void n1(wy0 wy0Var, ViewGroup viewGroup, GestaltText gestaltText, GestaltAvatar gestaltAvatar, GestaltText gestaltText2, ImageView imageView, GlideWebImageView glideWebImageView, GlideWebImageView glideWebImageView2) {
        x2 B0 = B0();
        String uid = wy0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.K0.a(B0.L(uid).F(new i(9, new x(28, this, gestaltAvatar)), new i(10, lq0.d.f84277r), ck2.i.f27923c, ck2.i.f27924d));
        List Z0 = dl2.b.Z0(wy0Var);
        this.L0 = Z0;
        b1((String) CollectionsKt.U(0, Z0), glideWebImageView);
        b1((String) CollectionsKt.U(1, this.L0), glideWebImageView2);
        float f13 = this.f45545b1;
        glideWebImageView.g2(f13, 0.0f, 0.0f, 0.0f);
        glideWebImageView2.g2(0.0f, f13, 0.0f, 0.0f);
        String Z2 = wy0Var.Z2();
        if (Z2 == null) {
            Z2 = "";
        }
        a0.q(gestaltText, bs1.c.h2(Z2));
        bs1.c.R1(imageView, false);
        j jVar = j.f96854a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        a0.q(gestaltText2, bs1.c.h2(j.g(context, wy0Var.V2())));
        viewGroup.setOnClickListener(new xa0.m(17, this, wy0Var));
        P0(viewGroup);
        r1(viewGroup);
    }

    public final int o() {
        return getResources().getDimensionPixelSize((!this.f45590x0 || !this.f45594z0 || this.f45580s0 || this.D0) ? this.D0 ? xc0.c.message_padding_large : xc0.c.message_padding_large_half : eo1.c.ignore);
    }

    public final ViewGroup o0() {
        ViewGroup viewGroup = this.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.r("threadAnchorTextContainer");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x().h(this.f45550d1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        x().j(this.f45550d1);
        this.K0.dispose();
        super.onDetachedFromWindow();
    }

    public final void p1(LinearLayout linearLayout, final String str, final int i13, final dl1.s sVar) {
        final GestaltIconButton gestaltIconButton = (GestaltIconButton) linearLayout.findViewById(e.send_icon);
        bs1.c.R1(gestaltIconButton, true);
        gestaltIconButton.u(new gm1.a() { // from class: lq0.l
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = ConversationMessageItemView.f45540e1;
                ConversationMessageItemView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String shareObjectId = str;
                Intrinsics.checkNotNullParameter(shareObjectId, "$shareObjectId");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    hf0.b.k(GestaltIconButton.this);
                    this$0.a0().s(shareObjectId, i13, y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue(), sVar);
                }
            }
        });
    }

    public final ViewGroup q() {
        ViewGroup viewGroup = this.C;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.r("contentContainer");
        throw null;
    }

    public final UpdatedConversationBoardItemView r0() {
        UpdatedConversationBoardItemView updatedConversationBoardItemView = this.f45571o;
        if (updatedConversationBoardItemView != null) {
            return updatedConversationBoardItemView;
        }
        Intrinsics.r("updatedBoardView");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r1(View view) {
        int i13 = 0;
        int i14 = 1;
        if (view instanceof GestaltText) {
            GestaltText gestaltText = (GestaltText) view;
            gestaltText.setTextIsSelectable(false);
            gestaltText.j(new lq0.m(this, i14));
        } else {
            if (view instanceof lq0.q0) {
                s customShowContextualMenuFunction = new s(this, i14);
                Intrinsics.checkNotNullParameter(customShowContextualMenuFunction, "customShowContextualMenuFunction");
                ((s0) ((lq0.q0) view)).f84426g = customShowContextualMenuFunction;
            }
            view.setOnLongClickListener(new rq.n0(this, 5));
        }
        ImageView imageView = this.K;
        if (imageView != null && this.E0) {
            if (imageView == null) {
                Intrinsics.r("reactionPermanentEntryPoint");
                throw null;
            }
            imageView.setOnClickListener(new k(this, i13));
        }
        if (this.f45546c0 == null) {
            Intrinsics.r("message");
            throw null;
        }
        if (!H0(r6)) {
            ConversationMessageReactionCountListDisplay Z = Z();
            Z.setClickable(bs1.c.o1(Z));
            Z.setOnClickListener(new k(this, 3));
            ConversationMessageReactionCountListDisplay conversationMessageReactionCountListDisplay = this.f45541J;
            if (conversationMessageReactionCountListDisplay == null) {
                Intrinsics.r("reactionsCountDisplayIsMe");
                throw null;
            }
            conversationMessageReactionCountListDisplay.setClickable(bs1.c.o1(conversationMessageReactionCountListDisplay));
            conversationMessageReactionCountListDisplay.setOnClickListener(new k(this, 4));
        }
    }

    public final e1 s() {
        e1 e1Var = this.U0;
        if (e1Var != null) {
            return e1Var;
        }
        Intrinsics.r("conversationMessageRepository");
        throw null;
    }

    public final void s1() {
        gw gwVar = fw.f37821a;
        String str = this.f45570n0;
        gwVar.getClass();
        wy0 e13 = str == null ? null : ew.e(str);
        mv mvVar = this.f45546c0;
        if (mvVar == null) {
            Intrinsics.r("message");
            throw null;
        }
        wy0 L = mvVar.L();
        boolean d2 = Intrinsics.d(L != null ? L.getUid() : null, l().getUid());
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        b bVar = this.K0;
        if (!d2) {
            if (e13 != null) {
                x2 B0 = B0();
                String uid = e13.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                bVar.a(B0.L(uid).F(new i(13, new t(this, 5)), new i(14, lq0.d.f84282w), cVar, a2Var));
                return;
            }
            return;
        }
        mv mvVar2 = this.f45546c0;
        if (mvVar2 == null) {
            Intrinsics.r("message");
            throw null;
        }
        String V = kh2.j.V(mvVar2);
        if (V == null) {
            return;
        }
        bVar.a(B0().L(V).F(new i(11, new t(this, 4)), new i(12, lq0.d.f84281v), cVar, a2Var));
    }

    public final ConversationDidItemView t() {
        ConversationDidItemView conversationDidItemView = this.B;
        if (conversationDidItemView != null) {
            return conversationDidItemView;
        }
        Intrinsics.r("didItView");
        throw null;
    }

    public final UpdatedConversationBoardItemView t0() {
        UpdatedConversationBoardItemView updatedConversationBoardItemView = this.U;
        if (updatedConversationBoardItemView != null) {
            return updatedConversationBoardItemView;
        }
        Intrinsics.r("updatedThreadAnchorBoardView");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [cf0.b, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v19 */
    public final void t1() {
        String string;
        String string2;
        String str;
        String str2;
        az0 az0Var;
        String str3;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        ?? r63;
        wy0 I5;
        String uid;
        LinearLayout linearLayout;
        String uid2;
        LinearLayout linearLayout2;
        f30 f30Var;
        String uid3;
        LinearLayout linearLayout3;
        String string3;
        String string4;
        ArrayList arrayList;
        String str4;
        String str5;
        String z43;
        String string5;
        int i14 = 1;
        int i15 = 0;
        if (this.G0) {
            mv mvVar = this.f45546c0;
            if (mvVar == null) {
                Intrinsics.r("message");
                throw null;
            }
            wy0 L = mvVar.L();
            if (Intrinsics.d(L != null ? L.getUid() : null, l().getUid())) {
                string5 = getContext().getResources().getString(xc0.i.you_deleted_a_message);
            } else {
                Resources resources = getContext().getResources();
                int i16 = xc0.i.user_deleted_a_message;
                Object[] objArr = new Object[1];
                mv mvVar2 = this.f45546c0;
                if (mvVar2 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                wy0 L2 = mvVar2.L();
                if (L2 == null || (z43 = L2.U2()) == null) {
                    mv mvVar3 = this.f45546c0;
                    if (mvVar3 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    wy0 L3 = mvVar3.L();
                    z43 = L3 != null ? L3.z4() : null;
                }
                objArr[0] = z43;
                string5 = resources.getString(i16, objArr);
            }
            Intrinsics.f(string5);
            GestaltText gestaltText = this.f45559i;
            if (gestaltText == null) {
                Intrinsics.r("messageDeletedView");
                throw null;
            }
            a0.p(gestaltText, string5);
            bs1.c.R1(C(), false);
            FrameLayout frameLayout = this.f45563k;
            if (frameLayout == null) {
                Intrinsics.r("messageDeletedContainer");
                throw null;
            }
            P0(frameLayout);
            if (this.f45566l0) {
                mv mvVar4 = this.f45546c0;
                if (mvVar4 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                if (mvVar4.D() != null && this.f45556g0 != null) {
                    bs1.c.R1(r0(), false);
                }
            }
            if (this.f45568m0) {
                bs1.c.R1(T(), false);
            }
        }
        FrameLayout frameLayout2 = this.f45563k;
        if (frameLayout2 == null) {
            Intrinsics.r("messageDeletedContainer");
            throw null;
        }
        bs1.c.R1(frameLayout2, this.G0);
        if (this.G0) {
            return;
        }
        PinterestRecyclerView pinterestRecyclerView = this.f45593z;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("systemMessageBoardPinsRecyclerView");
            throw null;
        }
        bs1.c.R1(pinterestRecyclerView, false);
        GestaltText gestaltText2 = this.A;
        if (gestaltText2 == null) {
            Intrinsics.r("systemMessageShareOffText");
            throw null;
        }
        gestaltText2.i(lq0.d.f84280u);
        mv mvVar5 = this.f45546c0;
        if (mvVar5 == null) {
            Intrinsics.r("message");
            throw null;
        }
        boolean z13 = mvVar5.D() != null;
        mv mvVar6 = this.f45546c0;
        if (mvVar6 == null) {
            Intrinsics.r("message");
            throw null;
        }
        mv.c H = mvVar6.H();
        int i17 = H == null ? -1 : q.f84406a[H.ordinal()];
        int i18 = 2;
        if (i17 == 1) {
            mv mvVar7 = this.f45546c0;
            if (mvVar7 == null) {
                Intrinsics.r("message");
                throw null;
            }
            if (kh2.j.V(mvVar7) != null && z13) {
                s1();
                gw gwVar = fw.f37821a;
                String str6 = this.f45570n0;
                gwVar.getClass();
                wy0 e13 = str6 == null ? null : ew.e(str6);
                mv mvVar8 = this.f45546c0;
                if (mvVar8 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                wy0 L4 = mvVar8.L();
                if (Intrinsics.d(L4 != null ? L4.getUid() : null, l().getUid())) {
                    Resources resources2 = getContext().getResources();
                    int i19 = xc0.i.you_invited_user_to_board;
                    Object[] objArr2 = new Object[2];
                    if (e13 == null || (string2 = e13.Z2()) == null) {
                        string2 = getContext().getResources().getString(x0.signup_username_title);
                    }
                    objArr2[0] = string2;
                    mv mvVar9 = this.f45546c0;
                    if (mvVar9 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    v7 D = mvVar9.D();
                    objArr2[1] = D != null ? D.j1() : null;
                    string = resources2.getString(i19, objArr2);
                } else {
                    Resources resources3 = getContext().getResources();
                    int i23 = xc0.i.user_invited_you_to_board;
                    Object[] objArr3 = new Object[2];
                    mv mvVar10 = this.f45546c0;
                    if (mvVar10 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    wy0 L5 = mvVar10.L();
                    objArr3[0] = L5 != null ? L5.Z2() : null;
                    mv mvVar11 = this.f45546c0;
                    if (mvVar11 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    v7 D2 = mvVar11.D();
                    objArr3[1] = D2 != null ? D2.j1() : null;
                    string = resources3.getString(i23, objArr3);
                }
                Intrinsics.f(string);
                GestaltText gestaltText3 = this.f45591y;
                if (gestaltText3 == null) {
                    Intrinsics.r("systemMessageInfoTextView");
                    throw null;
                }
                gestaltText3.i(new u(this, string, i15));
                d0().setOnClickListener(new k(this, i14));
            }
        } else if (i17 != 2) {
            if (i17 != 3) {
                if (i17 == 4 && this.f45578r0 && this.f45562j0) {
                    List b13 = e0.b(this.f45560i0 ? vn1.b.END : vn1.b.START);
                    GestaltText gestaltText4 = this.A;
                    if (gestaltText4 == null) {
                        Intrinsics.r("systemMessageShareOffText");
                        throw null;
                    }
                    gestaltText4.i(new x(29, this, b13));
                }
            } else if (z13) {
                mv mvVar12 = this.f45546c0;
                if (mvVar12 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                List J2 = mvVar12.J();
                if (J2 != null && !J2.isEmpty()) {
                    mv mvVar13 = this.f45546c0;
                    if (mvVar13 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    List<f30> J3 = mvVar13.J();
                    if (J3 != null) {
                        arrayList = new ArrayList();
                        for (f30 f30Var2 : J3) {
                            Intrinsics.f(f30Var2);
                            e40 e40Var = (e40) CollectionsKt.T(b40.G(f30Var2).values());
                            if (e40Var != null) {
                                arrayList.add(e40Var);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    s1();
                    mv mvVar14 = this.f45546c0;
                    if (mvVar14 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    wy0 L6 = mvVar14.L();
                    if (L6 == null || (str4 = L6.Z2()) == null) {
                        str4 = "";
                    }
                    mv mvVar15 = this.f45546c0;
                    if (mvVar15 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    v7 D3 = mvVar15.D();
                    if (D3 == null || (str5 = D3.j1()) == null) {
                        str5 = "";
                    }
                    Context context = getContext();
                    int i24 = xc0.i.conversation_system_message_pins_added;
                    Object[] objArr4 = new Object[1];
                    objArr4[0] = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
                    String D4 = a.a.D(str4, context.getString(i24, objArr4), str5);
                    GestaltText gestaltText5 = this.f45591y;
                    if (gestaltText5 == null) {
                        Intrinsics.r("systemMessageInfoTextView");
                        throw null;
                    }
                    gestaltText5.setOnClickListener(new k(this, 7));
                    GestaltText gestaltText6 = this.f45591y;
                    if (gestaltText6 == null) {
                        Intrinsics.r("systemMessageInfoTextView");
                        throw null;
                    }
                    SpannableString spannableString = new SpannableString(D4);
                    Context context2 = getContext();
                    int i25 = eo1.b.base_color_blue_300;
                    Object obj = d5.a.f53679a;
                    spannableString.setSpan(new ForegroundColorSpan(context2.getColor(i25)), StringsKt.L(D4, str5, 0, false, 6), str5.length() + StringsKt.L(D4, str5, 0, false, 6), 34);
                    j(spannableString, D4, str5, eo1.b.base_color_blue_300);
                    k(spannableString, D4, str5);
                    k(spannableString, D4, str4);
                    gestaltText6.setText(spannableString);
                    ev.c cVar = arrayList != null ? new ev.c(arrayList, new s(this, i18), 1) : null;
                    if (cVar != null) {
                        PinterestRecyclerView pinterestRecyclerView2 = this.f45593z;
                        if (pinterestRecyclerView2 == null) {
                            Intrinsics.r("systemMessageBoardPinsRecyclerView");
                            throw null;
                        }
                        pinterestRecyclerView2.j(cVar);
                    }
                    PinterestRecyclerView pinterestRecyclerView3 = this.f45593z;
                    if (pinterestRecyclerView3 == null) {
                        Intrinsics.r("systemMessageBoardPinsRecyclerView");
                        throw null;
                    }
                    getContext();
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
                    setGravity(14);
                    pinterestRecyclerView3.l(linearLayoutManager);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        PinterestRecyclerView pinterestRecyclerView4 = this.f45593z;
                        if (pinterestRecyclerView4 == null) {
                            Intrinsics.r("systemMessageBoardPinsRecyclerView");
                            throw null;
                        }
                        bs1.c.R1(pinterestRecyclerView4, true);
                    }
                }
            }
        } else if (z13) {
            s1();
            gw gwVar2 = fw.f37821a;
            String str7 = this.f45570n0;
            gwVar2.getClass();
            wy0 e14 = str7 == null ? null : ew.e(str7);
            mv mvVar16 = this.f45546c0;
            if (mvVar16 == null) {
                Intrinsics.r("message");
                throw null;
            }
            wy0 L7 = mvVar16.L();
            if (Intrinsics.d(L7 != null ? L7.getUid() : null, l().getUid())) {
                Resources resources4 = getContext().getResources();
                int i26 = xc0.i.you_joined_board;
                Object[] objArr5 = new Object[1];
                mv mvVar17 = this.f45546c0;
                if (mvVar17 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                v7 D5 = mvVar17.D();
                objArr5[0] = D5 != null ? D5.j1() : null;
                string4 = resources4.getString(i26, objArr5);
            } else {
                Resources resources5 = getContext().getResources();
                int i27 = xc0.i.user_joined;
                Object[] objArr6 = new Object[2];
                if (e14 == null || (string3 = e14.Z2()) == null) {
                    string3 = getContext().getResources().getString(x0.signup_username_title);
                }
                objArr6[0] = string3;
                mv mvVar18 = this.f45546c0;
                if (mvVar18 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                v7 D6 = mvVar18.D();
                objArr6[1] = D6 != null ? D6.j1() : null;
                string4 = resources5.getString(i27, objArr6);
            }
            Intrinsics.f(string4);
            GestaltText gestaltText7 = this.f45591y;
            if (gestaltText7 == null) {
                Intrinsics.r("systemMessageInfoTextView");
                throw null;
            }
            gestaltText7.i(new u(this, string4, i14));
            d0().setOnClickListener(new k(this, i18));
        }
        if (this.f45562j0 && !this.f45578r0) {
            mv mvVar19 = this.f45546c0;
            if (mvVar19 == null) {
                Intrinsics.r("message");
                throw null;
            }
            String M = mvVar19.M();
            if (M == null) {
                M = "";
            }
            a0.p(D(), M);
            j jVar = j.f96854a;
            Pattern pattern = oo1.k.f96858a;
            if (new Regex(pattern).a(M)) {
                GestaltText gestaltText8 = D();
                Intrinsics.checkNotNullParameter(gestaltText8, "gestaltText");
                Linkify.addLinks(gestaltText8, pattern, "https://");
                D().setMovementMethod((t1) t1.f84437c.getValue());
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.message_bubble_padding_vertical);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.message_bubble_radius);
            boolean e15 = j1.e1(M);
            if (e15) {
                D().i(lq0.d.f84271l);
                C().setBackgroundResource(eo1.d.drawable_themed_background_default);
                boolean z14 = this.f45560i0;
                int i28 = z14 ? dimensionPixelSize2 : 0;
                if (z14) {
                    dimensionPixelSize2 = 0;
                }
                D().setPaddingRelative(i28, 0, dimensionPixelSize2, 0);
            } else {
                FrameLayout C = C();
                GestaltText D7 = D();
                if (this.f45560i0) {
                    D7.i(lq0.d.f84273n);
                    C.setBackgroundResource(xc0.d.is_me_send_bubble);
                } else {
                    D7.i(lq0.d.f84274o);
                    C.setBackgroundResource(xc0.d.is_receive_bubble);
                }
                D().i(lq0.d.f84272m);
                D().setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
            }
            D().i(new yb0.m((e15 && this.f45560i0) ? vn1.b.END : vn1.b.START, 5));
            GestaltText D8 = D();
            Resources resources6 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
            D8.setMaxWidth(a0.K(this.Y0, resources6));
            int dimensionPixelSize3 = (this.f45564k0 || this.f45566l0 || this.f45568m0 || this.f45588w0) ? getResources().getDimensionPixelSize(xc0.c.message_padding_small) : 0;
            ViewGroup.LayoutParams layoutParams = C().getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            com.bumptech.glide.c.a1(layoutParams2, 0, 0, 0, dimensionPixelSize3);
            C().setLayoutParams(layoutParams2);
            P0(C());
            mv mvVar20 = this.f45546c0;
            if (mvVar20 == null) {
                Intrinsics.r("message");
                throw null;
            }
            if (mvVar20.N() == null) {
                D().setOnClickListener(new oq.m(i14));
            }
            r1(D());
        }
        if (this.f45564k0 && (f30Var = this.f45554f0) != null) {
            if (this.C0) {
                ConversationPinGifItemImageView conversationPinGifItemImageView = this.f45569n;
                if (conversationPinGifItemImageView == null) {
                    Intrinsics.r("gifPinItemView");
                    throw null;
                }
                conversationPinGifItemImageView.f2(f30Var);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                y92.c cVar2 = new y92.c(context3, new qi0.b(this, 2));
                ConversationPinGifItemImageView conversationPinGifItemImageView2 = this.f45569n;
                if (conversationPinGifItemImageView2 == null) {
                    Intrinsics.r("gifPinItemView");
                    throw null;
                }
                conversationPinGifItemImageView2.setOnTouchListener(new n(cVar2, i15));
                ConversationPinGifItemImageView conversationPinGifItemImageView3 = this.f45569n;
                if (conversationPinGifItemImageView3 == null) {
                    Intrinsics.r("gifPinItemView");
                    throw null;
                }
                r1(conversationPinGifItemImageView3);
            } else {
                KeyEvent.Callback callback = this.f45565l;
                if (callback == null) {
                    Intrinsics.r("pinItemView");
                    throw null;
                }
                lq0.q0 q0Var = callback instanceof lq0.q0 ? (lq0.q0) callback : null;
                if (q0Var != null) {
                    s0 s0Var = (s0) q0Var;
                    s0Var.g(this.f45558h0, f30Var);
                    s0Var.f84427h = this.B0;
                }
                FrameLayout frameLayout3 = this.f45567m;
                if (frameLayout3 == null) {
                    Intrinsics.r("pinItemViewContainer");
                    throw null;
                }
                P0(frameLayout3);
                View view = this.f45565l;
                if (view == null) {
                    Intrinsics.r("pinItemView");
                    throw null;
                }
                r1(view);
            }
            dl0 v63 = f30Var.v6();
            boolean d2 = v63 != null ? Intrinsics.d(v63.o(), Boolean.TRUE) : false;
            if (this.B0 || d2) {
                F0();
            } else {
                f30 f30Var3 = this.f45554f0;
                if (f30Var3 != null) {
                    mv mvVar21 = this.f45546c0;
                    if (mvVar21 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    f30 I = mvVar21.I();
                    if (I != null && (uid3 = I.getUid()) != null) {
                        if (this.f45560i0) {
                            linearLayout3 = this.E;
                            if (linearLayout3 == null) {
                                Intrinsics.r("inlineActionsContainerSelf");
                                throw null;
                            }
                        } else {
                            linearLayout3 = this.F;
                            if (linearLayout3 == null) {
                                Intrinsics.r("inlineActionsContainerOther");
                                throw null;
                            }
                        }
                        bs1.c.R1(linearLayout3, true);
                        GestaltIconButton gestaltIconButton = (GestaltIconButton) linearLayout3.findViewById(e.save_icon);
                        bs1.c.R1(gestaltIconButton, true);
                        if (g0.U(f30Var3)) {
                            gestaltIconButton.t(lq0.d.f84278s);
                        } else {
                            gestaltIconButton.t(lq0.d.f84279t);
                        }
                        gestaltIconButton.u(new o(0, this, uid3));
                        mv mvVar22 = this.f45546c0;
                        if (mvVar22 == null) {
                            Intrinsics.r("message");
                            throw null;
                        }
                        p1(linearLayout3, uid3, 0, mvVar22.I());
                        I0(linearLayout3);
                    }
                }
            }
        }
        if (this.f45566l0) {
            mv mvVar23 = this.f45546c0;
            if (mvVar23 == null) {
                Intrinsics.r("message");
                throw null;
            }
            if (mvVar23.D() != null) {
                v7 board = this.f45556g0;
                if (board != null) {
                    r0().L(board, false);
                    UpdatedConversationBoardItemView r03 = r0();
                    Intrinsics.checkNotNullParameter(board, "board");
                    r03.setOnClickListener(new xa0.m(18, board, r03));
                    P0(r0());
                    r1(r0());
                    if (this.B0) {
                        F0();
                    } else if (!(this.I0 instanceof d1) && this.f45556g0 != null) {
                        mv mvVar24 = this.f45546c0;
                        if (mvVar24 == null) {
                            Intrinsics.r("message");
                            throw null;
                        }
                        v7 D9 = mvVar24.D();
                        if (D9 != null && (uid2 = D9.getUid()) != null) {
                            if (this.f45560i0) {
                                linearLayout2 = this.E;
                                if (linearLayout2 == null) {
                                    Intrinsics.r("inlineActionsContainerSelf");
                                    throw null;
                                }
                            } else {
                                linearLayout2 = this.F;
                                if (linearLayout2 == null) {
                                    Intrinsics.r("inlineActionsContainerOther");
                                    throw null;
                                }
                            }
                            bs1.c.R1(linearLayout2, true);
                            mv mvVar25 = this.f45546c0;
                            if (mvVar25 == null) {
                                Intrinsics.r("message");
                                throw null;
                            }
                            p1(linearLayout2, uid2, 1, mvVar25.D());
                            I0(linearLayout2);
                        }
                    }
                }
            }
        }
        if (this.f45568m0) {
            mv mvVar26 = this.f45546c0;
            if (mvVar26 == null) {
                Intrinsics.r("message");
                throw null;
            }
            wy0 O = mvVar26.O();
            if (O != null) {
                ViewGroup T = T();
                GestaltText gestaltText9 = this.f45577r;
                if (gestaltText9 == null) {
                    Intrinsics.r("pinnerNameTextView");
                    throw null;
                }
                GestaltAvatar gestaltAvatar = this.f45575q;
                if (gestaltAvatar == null) {
                    Intrinsics.r("pinnerAvatar");
                    throw null;
                }
                GestaltText gestaltText10 = this.f45579s;
                if (gestaltText10 == null) {
                    Intrinsics.r("pinnerFollowersTextView");
                    throw null;
                }
                ImageView imageView = this.f45581t;
                if (imageView == null) {
                    Intrinsics.r("pinnerVerifiedIcon");
                    throw null;
                }
                GlideWebImageView glideWebImageView = this.f45583u;
                if (glideWebImageView == null) {
                    Intrinsics.r("pinnerPreviewImageOne");
                    throw null;
                }
                GlideWebImageView glideWebImageView2 = this.f45585v;
                if (glideWebImageView2 == null) {
                    Intrinsics.r("pinnerPreviewImageTwo");
                    throw null;
                }
                str = "getContext(...)";
                n1(O, T, gestaltText9, gestaltAvatar, gestaltText10, imageView, glideWebImageView, glideWebImageView2);
            } else {
                str = "getContext(...)";
            }
            if (!(this.I0 instanceof d1)) {
                mv mvVar27 = this.f45546c0;
                if (mvVar27 == null) {
                    Intrinsics.r("message");
                    throw null;
                }
                wy0 O2 = mvVar27.O();
                if (O2 != null && (uid = O2.getUid()) != null) {
                    if (this.f45560i0) {
                        linearLayout = this.E;
                        if (linearLayout == null) {
                            Intrinsics.r("inlineActionsContainerSelf");
                            throw null;
                        }
                    } else {
                        linearLayout = this.F;
                        if (linearLayout == null) {
                            Intrinsics.r("inlineActionsContainerOther");
                            throw null;
                        }
                    }
                    bs1.c.R1(linearLayout, true);
                    mv mvVar28 = this.f45546c0;
                    if (mvVar28 == null) {
                        Intrinsics.r("message");
                        throw null;
                    }
                    p1(linearLayout, uid, 2, mvVar28.O());
                    I0(linearLayout);
                }
            }
        } else {
            str = "getContext(...)";
        }
        if (this.f45588w0) {
            t().f45536k = this.B0;
            ConversationDidItemView t13 = t();
            mv mvVar29 = this.f45546c0;
            if (mvVar29 == null) {
                Intrinsics.r("message");
                throw null;
            }
            az0 P = mvVar29.P();
            t13.setVisibility(8);
            if (P != null && P.U() != null && P.O() != null) {
                t13.f45535j = P.getUid();
                f30 O3 = P.O();
                t13.f45534i = O3 != null ? O3.getUid() : null;
                f30 O4 = P.O();
                wy0 U = P.U();
                f30 O5 = P.O();
                String Z2 = (O5 == null || (I5 = O5.I5()) == null) ? null : I5.Z2();
                if (Z2 == null) {
                    Z2 = "";
                }
                List list = n10.c.f88919a;
                Intrinsics.checkNotNullParameter(P, "<this>");
                Intrinsics.checkNotNullParameter(P, "<this>");
                List resolutions = n10.c.f88919a;
                Intrinsics.checkNotNullParameter(resolutions, "resolutions");
                Iterator it = resolutions.iterator();
                while (true) {
                    if (it.hasNext()) {
                        str2 = n10.c.c(P, (String) it.next());
                        if (str2.length() > 0) {
                            break;
                        }
                    } else {
                        str2 = "";
                        break;
                    }
                }
                boolean z15 = str2.length() > 0;
                String H2 = P.H();
                if (H2 == null) {
                    H2 = "";
                }
                boolean z16 = H2.length() > 0;
                Context context4 = t13.getContext();
                Resources resources7 = t13.getResources();
                ProportionalImageView proportionalImageView = t13.f45529d;
                if (proportionalImageView == null) {
                    Intrinsics.r("doneImageView");
                    throw null;
                }
                k3.R1(proportionalImageView, z15);
                ProportionalImageView proportionalImageView2 = t13.f45529d;
                if (proportionalImageView2 == null) {
                    Intrinsics.r("doneImageView");
                    throw null;
                }
                if (!z15) {
                    str2 = null;
                }
                proportionalImageView2.loadUrl(str2);
                GestaltText gestaltText11 = t13.f45530e;
                if (gestaltText11 == null) {
                    Intrinsics.r("details");
                    throw null;
                }
                gestaltText11.i(new c0(3, z16, z15));
                if (z16) {
                    int i29 = xc0.i.tried_it_module_note_quote;
                    Object[] objArr7 = new Object[1];
                    String H3 = P.H();
                    Intrinsics.f(H3);
                    int length = H3.length() - 1;
                    int i33 = 0;
                    boolean z17 = false;
                    while (true) {
                        if (i33 > length) {
                            az0Var = P;
                            break;
                        }
                        az0Var = P;
                        boolean z18 = Intrinsics.i(H3.charAt(!z17 ? i33 : length), 32) <= 0;
                        if (z17) {
                            if (!z18) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z18) {
                            i33++;
                        } else {
                            z17 = true;
                        }
                        P = az0Var;
                    }
                    objArr7[0] = H3.subSequence(i33, length + 1).toString();
                    String string6 = resources7.getString(i29, objArr7);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    Intrinsics.f(context4);
                    GestaltText gestaltText12 = t13.f45530e;
                    if (gestaltText12 == null) {
                        Intrinsics.r("details");
                        throw null;
                    }
                    f0.h.n(context4, gestaltText12, string6, string6);
                } else {
                    az0Var = P;
                }
                if (O4 != null) {
                    if (U != null) {
                        GestaltAvatar gestaltAvatar2 = t13.f45532g;
                        if (gestaltAvatar2 == null) {
                            Intrinsics.r("pinnerIv");
                            throw null;
                        }
                        m0.V0(gestaltAvatar2, U);
                        String uid4 = U.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                        boolean K0 = b40.K0(O4);
                        String S = b40.S(O4);
                        String str8 = S != null ? S : "";
                        Resources resources8 = t13.getResources();
                        b60.b bVar = t13.f45539n;
                        if (bVar == null) {
                            Intrinsics.r("activeUserManager");
                            throw null;
                        }
                        String string7 = resources8.getString(dl2.b.S1(com.bumptech.glide.d.Q(bVar), uid4) ? K0 ? xc0.i.you_tried_recipe : rf0.c.you_tried_default : K0 ? xc0.i.user_tried_recipe : rf0.c.user_tried_default);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        Resources resources9 = t13.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources9, "getResources(...)");
                        Context context5 = t13.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, str);
                        if (str8.length() == 0) {
                            str3 = resources9.getString(rf0.c.this_idea);
                            Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
                        } else {
                            str3 = str8;
                        }
                        b60.b bVar2 = t13.f45539n;
                        if (bVar2 == null) {
                            Intrinsics.r("activeUserManager");
                            throw null;
                        }
                        boolean S1 = dl2.b.S1(com.bumptech.glide.d.Q(bVar2), uid4);
                        if (S1) {
                            i13 = 6;
                            spannableStringBuilder = new SpannableStringBuilder(df.j1.Y(string7, new Object[]{str3}, null, 6));
                        } else {
                            i13 = 6;
                            spannableStringBuilder = new SpannableStringBuilder(df.j1.Y(string7, new Object[]{Z2, str3}, null, 6));
                        }
                        int L8 = StringsKt.L(string7, S1 ? "%1$s" : "%2$s", 0, false, i13);
                        if (S1) {
                            r63 = 0;
                        } else {
                            int L9 = StringsKt.L(string7, "%1$s", 0, false, i13);
                            if (L9 < L8) {
                                L8 = (Z2.length() + L8) - 4;
                            }
                            r63 = 0;
                            f0.h.m(context5, spannableStringBuilder, L9, Z2.length() + L9, null);
                        }
                        f0.h.m(context5, spannableStringBuilder, L8, str3.length() + L8, r63);
                        GestaltText gestaltText13 = t13.f45533h;
                        if (gestaltText13 == null) {
                            Intrinsics.r("pinnerActionTv");
                            throw r63;
                        }
                        a0.q(gestaltText13, bs1.c.h2(spannableStringBuilder));
                    }
                    String uid5 = O4.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                    String uid6 = az0Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
                    if (!t13.f45536k) {
                        t13.setOnClickListener(new y0(t13, uid5, uid6, 8));
                        t13.setOnTouchListener(new m2(t13, 9));
                    }
                    RoundedCornersImageView roundedCornersImageView = t13.f45531f;
                    if (roundedCornersImageView == null) {
                        Intrinsics.r("pinImageView");
                        throw null;
                    }
                    roundedCornersImageView.loadUrl(O4.y4());
                }
                t13.setVisibility(0);
            }
            P0(t());
            r1(t());
        }
    }

    public final void w1(int i13) {
        GestaltText gestaltText = this.f45544b0;
        if (gestaltText == null) {
            Intrinsics.r("threadRepliesCountView");
            throw null;
        }
        gestaltText.setText(getResources().getQuantityString(xc0.h.thread_replies_count, i13, Integer.valueOf(i13)));
        GestaltText gestaltText2 = this.f45544b0;
        if (gestaltText2 == null) {
            Intrinsics.r("threadRepliesCountView");
            throw null;
        }
        gestaltText2.setOnClickListener(new k(this, 5));
        GestaltText gestaltText3 = this.f45544b0;
        if (gestaltText3 != null) {
            P0(gestaltText3);
        } else {
            Intrinsics.r("threadRepliesCountView");
            throw null;
        }
    }

    public final w x() {
        w wVar = this.P0;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final a z() {
        a aVar = this.M0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("fragmentFactory");
        throw null;
    }

    public final GestaltAvatar z0() {
        GestaltAvatar gestaltAvatar = this.f45555g;
        if (gestaltAvatar != null) {
            return gestaltAvatar;
        }
        Intrinsics.r("userAvatar");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageItemView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45558h0 = -1;
        this.f45594z0 = true;
        this.A0 = d.NONE;
        this.H0 = p.NONE;
        this.I0 = d1.f84292a;
        this.J0 = new ArrayList();
        this.K0 = new b();
        this.L0 = q0.f80391a;
        this.Y0 = RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM;
        this.Z0 = 80;
        this.f45543a1 = 16;
        this.f45545b1 = bs1.c.W(this, eo1.c.lego_corner_radius_medium_border);
        this.f45547c1 = xk2.m.b(new s(this, 0));
        this.f45550d1 = new r(this);
        G0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45558h0 = -1;
        this.f45594z0 = true;
        this.A0 = d.NONE;
        this.H0 = p.NONE;
        this.I0 = d1.f84292a;
        this.J0 = new ArrayList();
        this.K0 = new b();
        this.L0 = q0.f80391a;
        this.Y0 = RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM;
        this.Z0 = 80;
        this.f45543a1 = 16;
        this.f45545b1 = bs1.c.W(this, eo1.c.lego_corner_radius_medium_border);
        this.f45547c1 = xk2.m.b(new s(this, 0));
        this.f45550d1 = new r(this);
        G0();
    }
}
