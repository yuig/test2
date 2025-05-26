package lq0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.mv;
import com.pinterest.component.avatarpairs.AvatarPair;
import com.pinterest.component.avatarpairs.AvatarPairUpdate;
import com.pinterest.feature.conversation.view.ContactRequestPreviewWarningView;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import com.pinterest.feature.conversation.view.ConversationMessageThreadAnchorHeroView;
import com.pinterest.feature.conversation.view.ConversationQuickRepliesContainer;
import com.pinterest.feature.conversation.view.ConversationSharedBoardsHeaderView;
import com.pinterest.feature.conversation.view.GifReactionTrayView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import so.d7;
import so.e7;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Llq0/o0;", "Lyq0/b0;", "", "Laq0/i;", "Lar0/r;", "<init>", "()V", "lp2/b", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o0 extends m1<Object> implements aq0.i, ar0.r {
    public static final /* synthetic */ int R1 = 0;
    public yk1.j A0;
    public ImageView A1;
    public d7 B0;
    public GestaltIconButton B1;
    public e7 C0;
    public ConversationQuickRepliesContainer C1;
    public q12.b D0;
    public HorizontalScrollView D1;
    public ny1.w E0;
    public LinearLayout E1;
    public no1.e F0;
    public GestaltIconButton F1;
    public e12.d G0;
    public WebImageView G1;
    public lb0.q H0;
    public GestaltText H1;
    public lh0.p0 I0;
    public GestaltText I1;
    public cp.a0 J0;
    public LinearLayout J1;
    public g70.h K0;
    public ViewGroup K1;
    public r12.a L0;
    public ContactRequestPreviewWarningView L1;
    public aq0.e M0;
    public GifReactionTrayView M1;
    public aq0.j N0;
    public boolean N1;
    public aq0.f O0;
    public final j0 O1;
    public aq0.h P0;
    public final c2 P1;
    public final d4 Q1;
    public int S0;
    public boolean T0;
    public String U0;
    public z40.n V0;
    public b1 W0;
    public Boolean X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f84378a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f84379b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f84380c1;

    /* renamed from: d1, reason: collision with root package name */
    public String f84381d1;

    /* renamed from: f1, reason: collision with root package name */
    public String f84383f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f84384g1;

    /* renamed from: h1, reason: collision with root package name */
    public List f84385h1;

    /* renamed from: i1, reason: collision with root package name */
    public String f84386i1;

    /* renamed from: j1, reason: collision with root package name */
    public mv f84387j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f84388k1;

    /* renamed from: l1, reason: collision with root package name */
    public String f84389l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f84390m1;

    /* renamed from: n1, reason: collision with root package name */
    public String f84391n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f84392o1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f84393p1;

    /* renamed from: q1, reason: collision with root package name */
    public String f84394q1;

    /* renamed from: r1, reason: collision with root package name */
    public ViewGroup f84395r1;

    /* renamed from: s1, reason: collision with root package name */
    public GestaltTextField f84396s1;

    /* renamed from: t1, reason: collision with root package name */
    public GestaltTextComposer f84397t1;

    /* renamed from: u1, reason: collision with root package name */
    public View f84398u1;

    /* renamed from: v1, reason: collision with root package name */
    public GestaltIconButton f84399v1;

    /* renamed from: w1, reason: collision with root package name */
    public ConversationSharedBoardsHeaderView f84400w1;

    /* renamed from: x1, reason: collision with root package name */
    public GestaltIconButton f84401x1;

    /* renamed from: y1, reason: collision with root package name */
    public h1 f84402y1;

    /* renamed from: z0, reason: collision with root package name */
    public i2 f84403z0;

    /* renamed from: z1, reason: collision with root package name */
    public ImageView f84404z1;
    public final xj2.b Q0 = new xj2.b();
    public final Handler R0 = new Handler();

    /* renamed from: e1, reason: collision with root package name */
    public int f84382e1 = -1;

    public o0() {
        List emptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(emptyList, "emptyList(...)");
        this.f84385h1 = emptyList;
        this.f84386i1 = "";
        this.O1 = new j0(this);
        this.P1 = new c2(this, 27);
        this.Q1 = d4.CONVERSATION;
    }

    @Override // nl1.d
    public final void I7() {
        nx.d0 s73 = s7();
        h32.f1 f1Var = h32.f1.CONVERSATION_VIEWED;
        String str = this.U0;
        if (str == null) {
            Intrinsics.r("conversationId");
            throw null;
        }
        nx.d0.v(s73, f1Var, str, false, 12);
        super.I7();
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new m0(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, new m0(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        if (W8().e() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fc, code lost:
    
        r1 = lq0.u1.f84445a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ff, code lost:
    
        r1 = lq0.e1.f84307a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0205, code lost:
    
        vb0.j.f125466a.M(r4, "Thread Anchor Message is NULL when navigating to closeup!", tb0.p.MESSAGING, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ac, code lost:
    
        r4 = r8.X0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        if ((r4 instanceof com.pinterest.api.model.mv) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b4, code lost:
    
        r4 = (com.pinterest.api.model.mv) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b8, code lost:
    
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ba, code lost:
    
        r4 = com.pinterest.api.model.fw.f37821a;
        r5 = r8.v0("com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID");
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c5, code lost:
    
        if (r5 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c7, code lost:
    
        r4 = com.pinterest.api.model.ew.f37357a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d2, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ca, code lost:
    
        r2 = (com.pinterest.api.model.mv) com.pinterest.api.model.ew.f37368l.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b7, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0195, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0183, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0173, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0160, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0148, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0211, code lost:
    
        r3 = lq0.c1.f84267a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0213, code lost:
    
        r7.W0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0215, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0126, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
    
        if (r0.booleanValue() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8.getF49939a(), com.pinterest.screens.a1.b()) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        r0 = r8.i0("com.pinterest.EXTRA_POP_KEYBOARD_FOR_REPLY");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0143, code lost:
    
        if ((r0 instanceof java.lang.Boolean) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        r0 = (java.lang.Boolean) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
    
        r5 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, r5) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0151, code lost:
    
        r7.Y0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0153, code lost:
    
        r0 = r8.i0("com.pinterest.EXTRA_BOARD_TREAD_CONVERSATION_SOURCE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        if ((r0 instanceof java.lang.Boolean) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015d, code lost:
    
        r0 = (java.lang.Boolean) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0165, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, r5) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        if (W8().d() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0171, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
    
        r7.Z0 = r0;
        r0 = r8.i0("com.pinterest.EXTRA_CONVO_NEW_PIN_IT_REPLY_THREAD");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017e, code lost:
    
        if ((r0 instanceof java.lang.Boolean) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0180, code lost:
    
        r0 = (java.lang.Boolean) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0188, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, r5) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0192, code lost:
    
        if (W8().e() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0196, code lost:
    
        r7.f84378a1 = r4;
        r0 = r8.X0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019e, code lost:
    
        if ((r0 instanceof com.pinterest.api.model.cf) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a0, code lost:
    
        r0 = (com.pinterest.api.model.cf) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a4, code lost:
    
        if (r0 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        r4 = r0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
    
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
    
        if (r4 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d5, code lost:
    
        r8 = r8.v0("com.pinterest.EXTRA_CONVO_THREAD_ID");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01df, code lost:
    
        if (r7.Z0 == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e9, code lost:
    
        if (W8().d() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01eb, code lost:
    
        r1 = lq0.a.f84245a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0201, code lost:
    
        r3 = new lq0.v1(r8, r0, r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        if (r7.f84378a1 == false) goto L137;
     */
    @Override // nl1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R7(com.pinterest.navigation.Navigation r8) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lq0.o0.R7(com.pinterest.navigation.Navigation):void");
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        CharSequence d2;
        int i13;
        int dimensionPixelSize;
        rl1.g h10;
        List j13;
        int drawableRes;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.u().setTint(getResources().getColor(eo1.b.color_themed_text_default, requireContext().getTheme()));
        b1 b1Var = this.W0;
        if (b1Var == null) {
            Intrinsics.r("conversationThreadViewState");
            throw null;
        }
        boolean z13 = false;
        if (b1Var instanceof v1) {
            if (this.Z0 || this.f84378a1) {
                rm1.q qVar = rm1.q.CANCEL;
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                Context requireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
            } else {
                rm1.q qVar2 = rm1.q.ARROW_BACK;
                Context requireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                Context requireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                drawableRes = qVar2.drawableRes(requireContext3, dl2.b.f1(requireContext4));
            }
            Context requireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
            ConversationMessageThreadAnchorHeroView conversationMessageThreadAnchorHeroView = new ConversationMessageThreadAnchorHeroView(requireContext5);
            b1 b1Var2 = this.W0;
            if (b1Var2 == null) {
                Intrinsics.r("conversationThreadViewState");
                throw null;
            }
            v1 v1Var = (v1) b1Var2;
            boolean z14 = this.Z0 || this.f84378a1;
            String str = this.U0;
            if (str == null) {
                Intrinsics.r("conversationId");
                throw null;
            }
            conversationMessageThreadAnchorHeroView.a(v1Var, gestaltToolbarImpl, z14, str);
            gestaltToolbarImpl.d(conversationMessageThreadAnchorHeroView);
            gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, m60.x0.back);
        } else {
            z40.n nVar = this.V0;
            if (nVar != null) {
                String string = getResources().getString(m60.x0.separator);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                d2 = oo1.j.d(nVar, string, com.bumptech.glide.d.E());
                gestaltToolbarImpl.b0(d2);
                gestaltToolbarImpl.N(1);
                int i14 = rl1.j0.lego_avatar_size_medium;
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_200) / 2;
                List J2 = kh2.d.J(nVar, ((b60.d) getActiveUserManager()).g());
                List h13 = nVar.h();
                int size = J2.size() + (h13 != null ? h13.size() : 0);
                Context requireContext6 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                AvatarPair avatarPair = new AvatarPair(requireContext6);
                AvatarPairUpdate avatarPairUpdate = new AvatarPairUpdate(requireContext6);
                if (size > 0) {
                    int i15 = 8;
                    if (size > 2) {
                        gestaltToolbarImpl.W(getResources().getString(m60.x0.conversation_member_header, Integer.valueOf(size + 1)));
                        gestaltToolbarImpl.N(1);
                        avatarPair.setVisibility(8);
                        avatarPairUpdate.setVisibility(0);
                        kh2.b0.b2(avatarPairUpdate, J2);
                        avatarPairUpdate.X(rl1.n.h(requireContext6), rl1.n.d(requireContext6));
                        gestaltToolbarImpl.d(avatarPairUpdate);
                        ViewGroup.LayoutParams layoutParams = avatarPairUpdate.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize2;
                            avatarPairUpdate.setLayoutParams(layoutParams);
                        }
                        ViewGroup.LayoutParams layoutParams2 = gestaltToolbarImpl.z().getLayoutParams();
                        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                            ((RelativeLayout.LayoutParams) layoutParams2).setMarginStart(bs1.c.V(requireContext6, eo1.c.space_300) + bs1.c.V(requireContext6, i14));
                            gestaltToolbarImpl.z().setLayoutParams(layoutParams2);
                            gestaltToolbarImpl.z().getGravity();
                        }
                    } else {
                        if (size > 1) {
                            i13 = rl1.j0.lego_avatar_size_medium;
                            dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_200) / 2;
                            h10 = rl1.n.f(requireContext6);
                        } else {
                            i13 = rl1.j0.lego_avatar_size_small;
                            dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_200) * 2;
                            h10 = rl1.n.h(requireContext6);
                        }
                        if (h13 == null) {
                            h13 = kotlin.collections.q0.f80391a;
                        }
                        pp2.a.T0(avatarPair, J2, h13);
                        avatarPair.Z(h10, rl1.n.h(requireContext6));
                        gestaltToolbarImpl.d(avatarPair);
                        ViewGroup.LayoutParams layoutParams3 = avatarPair.getLayoutParams();
                        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = dimensionPixelSize;
                            avatarPair.setLayoutParams(layoutParams3);
                        }
                        ViewGroup.LayoutParams layoutParams4 = gestaltToolbarImpl.z().getLayoutParams();
                        if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                            ((RelativeLayout.LayoutParams) layoutParams4).setMarginStart(bs1.c.V(requireContext6, eo1.c.space_200) + bs1.c.V(requireContext6, i13));
                            gestaltToolbarImpl.z().setLayoutParams(layoutParams4);
                        }
                    }
                    ArrayList k13 = kh2.d.k1(nVar, ((b60.d) getActiveUserManager()).g());
                    this.f84385h1 = k13;
                    if (k13.size() == 1) {
                        int i16 = 7;
                        k0 k0Var = new k0(this, i16);
                        avatarPair.setOnClickListener(new w80.e0(6, k0Var));
                        gestaltToolbarImpl.z().setOnClickListener(new w80.e0(i16, k0Var));
                    }
                    this.f84385h1 = kh2.d.k1(nVar, ((b60.d) getActiveUserManager()).g());
                    kl0.t tVar = new kl0.t(nVar, 29);
                    if (this.f84401x1 == null) {
                        gestaltToolbarImpl.b(yc0.d.view_settings_ellipsis);
                        GestaltIconButton gestaltIconButton = (GestaltIconButton) requireView().findViewById(yc0.c.settings_btn);
                        this.f84401x1 = gestaltIconButton;
                        if (gestaltIconButton != null) {
                            gestaltIconButton.setOnClickListener(new w80.e0(i15, tVar));
                        }
                    }
                }
                rm1.q qVar3 = rm1.q.ARROW_BACK;
                Context requireContext7 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext7, "requireContext(...)");
                Context requireContext8 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext8, "requireContext(...)");
                gestaltToolbarImpl.Q(qVar3.drawableRes(requireContext7, dl2.b.f1(requireContext8)), eo1.b.color_themed_text_default, m60.x0.back);
            }
        }
        if (this.f84379b1) {
            s9(le0.d.bar_overflow, false);
            s9(xc0.e.menu_hide_conversation, false);
            s9(xc0.e.menu_report_conversation, false);
            s9(xc0.e.menu_block_conversation_users, false);
            s9(xc0.e.menu_contact_request_report, true);
            return;
        }
        s9(le0.d.bar_overflow, false);
        s9(xc0.e.menu_contact_request_report, false);
        s9(xc0.e.menu_hide_conversation, true);
        z40.n nVar2 = this.V0;
        if (nVar2 == null || ((j13 = kh2.d.j1(nVar2)) != null && j13.size() == 1)) {
            z13 = true;
        }
        boolean z15 = !z13;
        s9(xc0.e.menu_block_conversation_users, z15);
        s9(xc0.e.menu_report_conversation, z15);
    }

    public final void U8() {
        k3.R1(d9(), false);
        if (W8().b()) {
            f9().X(d.f84284y);
            this.f84392o1 = false;
        } else {
            b9().X(d.f84285z);
            this.f84392o1 = false;
            q9();
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        d7 d7Var = this.B0;
        if (d7Var == null) {
            Intrinsics.r("conversationMessagesPresenterFactory");
            throw null;
        }
        String str = this.U0;
        if (str == null) {
            Intrinsics.r("conversationId");
            throw null;
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        b1 b1Var = this.W0;
        if (b1Var == null) {
            Intrinsics.r("conversationThreadViewState");
            throw null;
        }
        q12.b bVar = this.D0;
        if (bVar == null) {
            Intrinsics.r("conversationService");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        r12.a aVar = this.L0;
        if (aVar != null) {
            return d7Var.a(str, resources, b1Var, bVar, requireContext, aVar);
        }
        Intrinsics.r("conversationMessageRetrofitRemoteDataSource");
        throw null;
    }

    public final ImageView V8() {
        ImageView imageView = this.A1;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("addPinToConvoButton");
        throw null;
    }

    public final lh0.p0 W8() {
        lh0.p0 p0Var = this.I0;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final GifReactionTrayView X8() {
        GifReactionTrayView gifReactionTrayView = this.M1;
        if (gifReactionTrayView != null) {
            return gifReactionTrayView;
        }
        Intrinsics.r("gifReactionTray");
        throw null;
    }

    public final ViewGroup Y8() {
        ViewGroup viewGroup = this.f84395r1;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.r("groupBoardUpsell");
        throw null;
    }

    @Override // nl1.d, fo1.i
    public final boolean Z3(int i13) {
        String str;
        List list;
        List list2;
        d4 d4Var;
        if (i13 == xc0.e.menu_hide_conversation) {
            z40.n nVar = this.V0;
            if (nVar != null) {
                String a13 = nVar.a();
                no1.e eVar = this.F0;
                if (eVar == null) {
                    Intrinsics.r("conversationDataSource");
                    throw null;
                }
                new cp.c0(a13, eVar).b();
            }
            return true;
        }
        if (i13 == xc0.e.menu_report_conversation) {
            z40.n nVar2 = this.V0;
            if (nVar2 != null) {
                NavigationImpl w13 = Navigation.w1(com.pinterest.screens.a1.c());
                h32.i0 p13 = s7().p();
                String a14 = nVar2.a();
                if (p13 != null && (d4Var = p13.f67081a) != null) {
                    r1 = d4Var.name();
                }
                w13.w0(new ReportData.ConversationReportData(a14, r1 != null ? r1 : "", "REPORT_CONVERSATION"), "com.pinterest.EXTRA_REPORT_DATA");
                f7().d(w13);
            }
            return true;
        }
        if (i13 == xc0.e.menu_block_conversation_users) {
            vq.e eVar2 = new vq.e();
            z40.n nVar3 = this.V0;
            r1 = nVar3 != null ? nVar3.a() : null;
            str = r1 != null ? r1 : "";
            z40.n nVar4 = this.V0;
            if (nVar4 == null || (list2 = kh2.d.J(nVar4, ((b60.d) getActiveUserManager()).g())) == null) {
                list2 = kotlin.collections.q0.f80391a;
            }
            eVar2.p7(str, "message", list2);
            f7().d(new of0.a(eVar2));
            return true;
        }
        if (i13 != xc0.e.menu_contact_request_report) {
            return false;
        }
        vq.j jVar = new vq.j();
        z40.n nVar5 = this.V0;
        String a15 = nVar5 != null ? nVar5.a() : null;
        str = a15 != null ? a15 : "";
        z40.n nVar6 = this.V0;
        if (nVar6 == null || (list = kh2.d.J(nVar6, ((b60.d) getActiveUserManager()).g())) == null) {
            list = kotlin.collections.q0.f80391a;
        }
        String str2 = this.f84381d1;
        if (str2 == null) {
            Intrinsics.r("contactRequestId");
            throw null;
        }
        jVar.p7(str2, str, list);
        f7().d(new of0.a(jVar));
        return true;
    }

    public final cp.a0 Z8() {
        cp.a0 a0Var = this.J0;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.r("groupBoardUpsellManager");
        throw null;
    }

    public final ImageView a9() {
        ImageView imageView = this.f84404z1;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("heartEmojiReplyButton");
        throw null;
    }

    public final GestaltTextField b9() {
        GestaltTextField gestaltTextField = this.f84396s1;
        if (gestaltTextField != null) {
            return gestaltTextField;
        }
        Intrinsics.r("messageEditText");
        throw null;
    }

    public final ConversationQuickRepliesContainer c9() {
        ConversationQuickRepliesContainer conversationQuickRepliesContainer = this.C1;
        if (conversationQuickRepliesContainer != null) {
            return conversationQuickRepliesContainer;
        }
        Intrinsics.r("quickRepliesContainer");
        throw null;
    }

    public final LinearLayout d9() {
        LinearLayout linearLayout = this.E1;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("repliesContainer");
        throw null;
    }

    public final View e9() {
        View view = this.f84398u1;
        if (view != null) {
            return view;
        }
        Intrinsics.r("sendButton");
        throw null;
    }

    public final GestaltTextComposer f9() {
        GestaltTextComposer gestaltTextComposer = this.f84397t1;
        if (gestaltTextComposer != null) {
            return gestaltTextComposer;
        }
        Intrinsics.r("updatedMessageEditText");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        if (X8().getVisibility() == 0) {
            j9(false);
        }
        e0.t.R0(-1);
        nl1.d.J7();
        return false;
    }

    public final GestaltIconButton g9() {
        GestaltIconButton gestaltIconButton = this.f84399v1;
        if (gestaltIconButton != null) {
            return gestaltIconButton;
        }
        Intrinsics.r("updatedSendButton");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getP0() {
        b1 b1Var = this.W0;
        if (b1Var != null) {
            if (b1Var == null) {
                Intrinsics.r("conversationThreadViewState");
                throw null;
            }
            if (b1Var instanceof v1) {
                return a4.CONVERSATION_THREAD_CLOSEUP;
            }
        }
        return a4.CONVERSATION_THREAD;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF47101y() {
        return this.Q1;
    }

    public final void h9(boolean z13) {
        if (k3.v1(Y8()) && u9()) {
            Z8().f();
            k9();
        }
        if (z13) {
            if (!W8().b()) {
                b9().X(d.C);
                return;
            }
            f9().X(d.A);
            g9().t(d.B);
            this.f84394q1 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
    
        if (r0.length() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r0.length() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i9(boolean r6) {
        /*
            r5 = this;
            lh0.p0 r0 = r5.W8()
            boolean r0 = r0.b()
            java.lang.String r1 = "requireContext(...)"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L34
            com.pinterest.gestalt.textcomposer.GestaltTextComposer r0 = r5.f9()
            wn1.d r0 = r0.k0()
            u50.i0 r0 = r0.f()
            if (r0 == 0) goto L32
            android.content.Context r4 = r5.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            java.lang.CharSequence r0 = r0.a(r4)
            if (r0 == 0) goto L32
            int r0 = r0.length()
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0 = r2
            goto L54
        L32:
            r0 = r3
            goto L54
        L34:
            com.pinterest.gestalt.textfield.view.GestaltTextField r0 = r5.b9()
            ao1.b r0 = r0.k0()
            u50.i0 r0 = r0.f20030a
            if (r0 == 0) goto L32
            android.content.Context r4 = r5.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            java.lang.CharSequence r0 = r0.a(r4)
            if (r0 == 0) goto L32
            int r0 = r0.length()
            if (r0 != 0) goto L30
            goto L32
        L54:
            lh0.p0 r1 = r5.W8()
            boolean r1 = r1.b()
            if (r1 == 0) goto L63
            com.pinterest.gestalt.iconbutton.GestaltIconButton r1 = r5.g9()
            goto L67
        L63:
            android.view.View r1 = r5.e9()
        L67:
            if (r6 == 0) goto L6d
            if (r0 != 0) goto L6d
            r0 = r3
            goto L6e
        L6d:
            r0 = r2
        L6e:
            kh2.k3.R1(r1, r0)
            if (r6 != 0) goto L77
            r5.l9()
            goto L7a
        L77:
            r5.j9(r3)
        L7a:
            androidx.recyclerview.widget.RecyclerView r0 = r5.g8()
            if (r0 == 0) goto L9c
            int r1 = r5.S0
            if (r1 <= 0) goto L9c
            if (r6 == 0) goto L87
            r1 = r2
        L87:
            int r4 = r0.getPaddingTop()
            r0.setPaddingRelative(r2, r4, r2, r1)
            boolean r0 = r5.u9()
            if (r0 == 0) goto L9c
            android.view.ViewGroup r0 = r5.Y8()
            r6 = r6 ^ r3
            kh2.k3.R1(r0, r6)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq0.o0.i9(boolean):void");
    }

    public final void j9(boolean z13) {
        X8().animate().alpha(0.0f).setDuration(100L).translationY(X8().getY()).setListener(new androidx.recyclerview.widget.d0(this, z13, 3));
    }

    @Override // yq0.t, ml1.q
    public final void k5() {
        super.k5();
        if (this.Y0) {
            i9(true);
            if (W8().b()) {
                f9().g0();
            } else {
                b9().d0();
            }
            this.f84390m1 = true;
            this.Y0 = false;
        }
    }

    public final void k9() {
        cp.a0 Z8 = Z8();
        String str = this.U0;
        if (str == null) {
            Intrinsics.r("conversationId");
            throw null;
        }
        Z8.e(str);
        this.S0 = 0;
        k3.R1(Y8(), false);
        t9();
    }

    public final void l9() {
        if (W8().b()) {
            hf0.b.k(f9());
        } else {
            hf0.b.k(b9());
        }
        this.f84390m1 = false;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return W8().a() ? new a7.e(xc0.f.updated_fragment_conversation_lego, m60.t0.p_recycler_view) : new a7.e(xc0.f.fragment_conversation_lego, m60.t0.p_recycler_view);
    }

    public final void m9(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (W8().b()) {
            g9().t(new zp.c0(4, text.length() > 0, f9().k0().f130523j != null));
            return;
        }
        boolean z13 = b9().hasFocus() && text.length() > 0;
        k3.R1(e9(), z13 || this.f84392o1);
        ImageView a93 = a9();
        if (!z13 && !this.f84392o1) {
            r1 = true;
        }
        k3.R1(a93, r1);
        if (z13) {
            e9().setBackgroundResource(xc0.d.ic_send_nonpds);
            e9().getLayoutParams().height = getResources().getDimensionPixelSize(xc0.c.conversation_quick_reply_image_size_large);
            e9().getLayoutParams().width = getResources().getDimensionPixelSize(xc0.c.conversation_quick_reply_image_size_large);
        }
    }

    @Override // yq0.t
    public final androidx.recyclerview.widget.v0 n8() {
        cp.b bVar = new cp.b(this, 12);
        getContext();
        return new androidx.recyclerview.widget.v0(new PinterestLinearLayoutManager(bVar, 1, true));
    }

    public final void n9(boolean z13) {
        this.f84388k1 = z13;
        boolean z14 = !this.f84379b1 && z13;
        this.T0 = z14;
        if (!z14 || this.f84386i1.length() <= 0) {
            k3.R1(c9(), false);
            HorizontalScrollView horizontalScrollView = this.D1;
            if (horizontalScrollView != null) {
                k3.R1(horizontalScrollView, false);
                return;
            } else {
                Intrinsics.r("quickReplyHScrollView");
                throw null;
            }
        }
        HashMap hashMap = new HashMap();
        String str = this.U0;
        if (str == null) {
            Intrinsics.r("conversationId");
            throw null;
        }
        hashMap.put("conversation_id", str);
        hashMap.put("pin_id", this.f84386i1);
        nx.d0 s73 = s7();
        h32.f1 f1Var = h32.f1.CONVERSATION_PIN_QUICK_REPLIES_VIEWED;
        String str2 = this.U0;
        if (str2 == null) {
            Intrinsics.r("conversationId");
            throw null;
        }
        s73.g(f1Var, str2, hashMap, false);
        i2 i2Var = this.f84403z0;
        if (i2Var != null) {
            this.Q0.a(i2Var.P(this.f84386i1).F(new dq0.i(18, new k0(this, 2)), new dq0.i(19, d.F), ck2.i.f27923c, ck2.i.f27924d));
        } else {
            Intrinsics.r("pinRepository");
            throw null;
        }
    }

    public final void o9(h32.l1 l1Var) {
        z40.n nVar = this.V0;
        if (nVar != null) {
            List J2 = kh2.d.J(nVar, ((b60.d) getActiveUserManager()).g());
            sz1.i cVar = l1Var == h32.l1.MESSAGE_SENT ? new sz1.c(J2) : new sz1.b(J2);
            ny1.w wVar = this.E0;
            if (wVar == null) {
                Intrinsics.r("permissionsManager");
                throw null;
            }
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            l0 l0Var = new l0(this);
            lb0.q qVar = this.H0;
            if (qVar != null) {
                com.bumptech.glide.c.K0(wVar, requireActivity, cVar, l0Var, qVar, getActiveUserManager());
            } else {
                Intrinsics.r("prefsManagerPersisted");
                throw null;
            }
        }
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.Q0.d();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        f7().j(this.O1);
        this.R0.removeCallbacks(this.P1);
        l9();
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        if (this.f84393p1) {
            b1 b1Var = this.W0;
            if (b1Var == null) {
                Intrinsics.r("conversationThreadViewState");
                throw null;
            }
            if (b1Var instanceof c1) {
                aq0.h hVar = this.P0;
                if (hVar != null) {
                    ((dq0.p) hVar).N3();
                }
                this.f84393p1 = false;
            }
        }
        this.R0.postDelayed(this.P1, 1000L);
        f7().h(this.O1);
    }

    @Override // yq0.t, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (this.f84379b1) {
            outState.putBoolean("IS_CONTACT_REQUEST", true);
            outState.putBoolean("CONTACT_REQUEST_PREVIEW", this.f84380c1);
            String str = this.U0;
            if (str == null) {
                Intrinsics.r("conversationId");
                throw null;
            }
            outState.putString("CONTACT_REQUEST_CONVERSATION_ID", str);
            String str2 = this.f84381d1;
            if (str2 == null) {
                Intrinsics.r("contactRequestId");
                throw null;
            }
            outState.putString("CONTACT_REQUEST_ID", str2);
            String str3 = this.f84383f1;
            if (str3 == null) {
                Intrinsics.r("contactRequestSenderName");
                throw null;
            }
            outState.putString("CONTACT_REQUEST_SENDER_NAME", str3);
            outState.putInt("CONTACT_REQUEST_POSITION", this.f84382e1);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // ar0.r
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((view instanceof ConversationMessageItemView) && ((ConversationMessageItemView) view).getF45558h0() == 1) {
            D8();
        }
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(xc0.e.conversation_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        Intrinsics.checkNotNullParameter((LinearLayout) findViewById, "<set-?>");
        View findViewById2 = v13.findViewById(xc0.e.group_board_upsell);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
        this.f84395r1 = viewGroup;
        if (W8().b()) {
            View findViewById3 = v13.findViewById(xc0.e.updated_message_edit_text);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            GestaltTextComposer gestaltTextComposer = (GestaltTextComposer) findViewById3;
            Intrinsics.checkNotNullParameter(gestaltTextComposer, "<set-?>");
            this.f84397t1 = gestaltTextComposer;
            View findViewById4 = f9().findViewById(wn1.c0.primary_button);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById4;
            Intrinsics.checkNotNullParameter(gestaltIconButton, "<set-?>");
            this.f84399v1 = gestaltIconButton;
        } else {
            View findViewById5 = v13.findViewById(xc0.e.message_edit_text);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            GestaltTextField gestaltTextField = (GestaltTextField) findViewById5;
            Intrinsics.checkNotNullParameter(gestaltTextField, "<set-?>");
            this.f84396s1 = gestaltTextField;
            View findViewById6 = v13.findViewById(xc0.e.send_button);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
            Intrinsics.checkNotNullParameter(findViewById6, "<set-?>");
            this.f84398u1 = findViewById6;
            View findViewById7 = v13.findViewById(xc0.e.send_button);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
            Intrinsics.checkNotNullParameter((ImageView) findViewById7, "<set-?>");
            View findViewById8 = v13.findViewById(xc0.e.heart_emoji_reply_button);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
            ImageView imageView = (ImageView) findViewById8;
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.f84404z1 = imageView;
        }
        View findViewById9 = v13.findViewById(xc0.e.add_pin_to_convo);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById9;
        Intrinsics.checkNotNullParameter(imageView2, "<set-?>");
        this.A1 = imageView2;
        View findViewById10 = v13.findViewById(xc0.e.add_gif_reaction_to_convo);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById10;
        Intrinsics.checkNotNullParameter(gestaltIconButton2, "<set-?>");
        this.B1 = gestaltIconButton2;
        View findViewById11 = v13.findViewById(xc0.e.quick_replies_container);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        ConversationQuickRepliesContainer conversationQuickRepliesContainer = (ConversationQuickRepliesContainer) findViewById11;
        Intrinsics.checkNotNullParameter(conversationQuickRepliesContainer, "<set-?>");
        this.C1 = conversationQuickRepliesContainer;
        View findViewById12 = v13.findViewById(xc0.e.quick_replies_container_hscroll_view);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById12;
        Intrinsics.checkNotNullParameter(horizontalScrollView, "<set-?>");
        this.D1 = horizontalScrollView;
        View findViewById13 = v13.findViewById(xc0.e.reply_container);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById13;
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.E1 = linearLayout;
        View findViewById14 = v13.findViewById(xc0.e.reply_container_view);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        Intrinsics.checkNotNullParameter((LinearLayout) findViewById14, "<set-?>");
        View findViewById15 = v13.findViewById(xc0.e.reply_container_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        GestaltIconButton gestaltIconButton3 = (GestaltIconButton) findViewById15;
        Intrinsics.checkNotNullParameter(gestaltIconButton3, "<set-?>");
        this.F1 = gestaltIconButton3;
        View findViewById16 = v13.findViewById(xc0.e.reply_container_pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById16;
        Intrinsics.checkNotNullParameter(webImageView, "<set-?>");
        this.G1 = webImageView;
        View findViewById17 = v13.findViewById(xc0.e.reply_container_pin_text);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById17;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.H1 = gestaltText;
        View findViewById18 = v13.findViewById(xc0.e.reply_container_info_text);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById18;
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.I1 = gestaltText2;
        View findViewById19 = v13.findViewById(xc0.e.message_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById19;
        Intrinsics.checkNotNullParameter(linearLayout2, "<set-?>");
        this.J1 = linearLayout2;
        View findViewById20 = v13.findViewById(xc0.e.input_container);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById20;
        Intrinsics.checkNotNullParameter(viewGroup2, "<set-?>");
        this.K1 = viewGroup2;
        View findViewById21 = v13.findViewById(xc0.e.preview_warning_view);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        ContactRequestPreviewWarningView contactRequestPreviewWarningView = (ContactRequestPreviewWarningView) findViewById21;
        Intrinsics.checkNotNullParameter(contactRequestPreviewWarningView, "<set-?>");
        this.L1 = contactRequestPreviewWarningView;
        View findViewById22 = v13.findViewById(xc0.e.conversation_gif_reaction_tray);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        GifReactionTrayView gifReactionTrayView = (GifReactionTrayView) findViewById22;
        Intrinsics.checkNotNullParameter(gifReactionTrayView, "<set-?>");
        this.M1 = gifReactionTrayView;
        View findViewById23 = v13.findViewById(xc0.e.conversation_shared_boards_header);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        ConversationSharedBoardsHeaderView conversationSharedBoardsHeaderView = (ConversationSharedBoardsHeaderView) findViewById23;
        Intrinsics.checkNotNullParameter(conversationSharedBoardsHeaderView, "<set-?>");
        this.f84400w1 = conversationSharedBoardsHeaderView;
        z40.n nVar = this.V0;
        if (nVar != null) {
            this.f84385h1 = kh2.d.k1(nVar, ((b60.d) getActiveUserManager()).g());
        }
        final int i13 = 0;
        final int i14 = 1;
        if (bundle != null) {
            boolean z13 = bundle.getBoolean("IS_CONTACT_REQUEST", false);
            String string = bundle.getString("CONTACT_REQUEST_CONVERSATION_ID", "");
            if (!this.f84379b1 && z13) {
                String str = this.U0;
                if (str == null) {
                    Intrinsics.r("conversationId");
                    throw null;
                }
                if (Intrinsics.d(string, str)) {
                    this.f84379b1 = true;
                    this.f84380c1 = bundle.getBoolean("CONTACT_REQUEST_PREVIEW", false);
                    String string2 = bundle.getString("CONTACT_REQUEST_ID", "");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    this.f84381d1 = string2;
                    this.f84382e1 = bundle.getInt("CONTACT_REQUEST_POSITION", -1);
                    String string3 = bundle.getString("CONTACT_REQUEST_SENDER_NAME", "");
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    this.f84383f1 = string3;
                }
            }
            fo1.a i73 = i7();
            if (i73 != null) {
                S7(i73);
            }
        }
        v13.setBackgroundResource(eo1.d.drawable_themed_background_default);
        final int i15 = 2;
        if (this.f84380c1) {
            String str2 = this.f84383f1;
            if (str2 == null) {
                Intrinsics.r("contactRequestSenderName");
                throw null;
            }
            if (str2.length() > 0) {
                ContactRequestPreviewWarningView contactRequestPreviewWarningView2 = this.L1;
                if (contactRequestPreviewWarningView2 == null) {
                    Intrinsics.r("previewWarningView");
                    throw null;
                }
                k3.R1(contactRequestPreviewWarningView2, this.f84380c1);
                e7 e7Var = this.C0;
                if (e7Var == null) {
                    Intrinsics.r("warningViewPresenterFactory");
                    throw null;
                }
                String str3 = this.f84383f1;
                if (str3 == null) {
                    Intrinsics.r("contactRequestSenderName");
                    throw null;
                }
                String str4 = this.f84381d1;
                if (str4 == null) {
                    Intrinsics.r("contactRequestId");
                    throw null;
                }
                dq0.b a13 = e7Var.a(str3, this.f84382e1, str4, new m0(this, i15));
                yk1.j jVar = this.A0;
                if (jVar == null) {
                    Intrinsics.r("mvpBinder");
                    throw null;
                }
                ContactRequestPreviewWarningView contactRequestPreviewWarningView3 = this.L1;
                if (contactRequestPreviewWarningView3 == null) {
                    Intrinsics.r("previewWarningView");
                    throw null;
                }
                jVar.d(contactRequestPreviewWarningView3, a13);
            }
        }
        LinearLayout linearLayout3 = this.J1;
        if (linearLayout3 == null) {
            Intrinsics.r("messageBar");
            throw null;
        }
        k3.R1(linearLayout3, !this.f84380c1);
        Context context = getContext();
        if (context != null && !hf0.b.q()) {
            ViewGroup viewGroup3 = this.K1;
            if (viewGroup3 == null) {
                Intrinsics.r("inputContainer");
                throw null;
            }
            viewGroup3.setPaddingRelative(viewGroup3.getPaddingStart(), viewGroup3.getPaddingTop(), bs1.c.V(context, eo1.c.space_200), viewGroup3.getPaddingBottom());
        }
        if (W8().b()) {
            V8().setImageResource(xc0.d.ic_pin_drawer_button_gray_nonpds);
        } else {
            V8().setImageResource(xc0.d.ic_pin_drawer_button_nonpds);
        }
        V8().getLayoutParams().height = getResources().getDimensionPixelSize(xc0.c.conversation_quick_reply_image_size_large);
        V8().getLayoutParams().width = getResources().getDimensionPixelSize(xc0.c.conversation_quick_reply_image_size_large);
        if (!W8().b()) {
            a9().getLayoutParams().height = getResources().getDimensionPixelSize(xc0.c.conversation_quick_reply_image_size_large);
            a9().getLayoutParams().width = getResources().getDimensionPixelSize(xc0.c.conversation_quick_reply_image_size_large);
            a9().setImageResource(xc0.d.ic_heart_nonpds);
            if (this.f84392o1) {
                q9();
            }
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ar0.n q83 = q8();
        Intrinsics.checkNotNullParameter(this, "attachStateListener");
        q83.f20399c.add(this);
        fo1.a i74 = i7();
        final int i16 = 5;
        if (i74 != null) {
            ((GestaltToolbarImpl) i74).U(new View.OnClickListener(this) { // from class: lq0.g0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o0 f84312b;

                {
                    this.f84312b = attachStateListener;
                }

                /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
                
                    if (r8 != null) goto L36;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.view.View r8) {
                    /*
                        Method dump skipped, instructions count: 494
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: lq0.g0.onClick(android.view.View):void");
                }
            });
        }
        t9();
        if (!W8().b()) {
            a9().setOnClickListener(new View.OnClickListener(this) { // from class: lq0.g0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o0 f84312b;

                {
                    this.f84312b = attachStateListener;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    /*
                        Method dump skipped, instructions count: 494
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: lq0.g0.onClick(android.view.View):void");
                }
            });
        }
        V8().setOnClickListener(new View.OnClickListener(this) { // from class: lq0.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f84312b;

            {
                this.f84312b = attachStateListener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                /*
                    Method dump skipped, instructions count: 494
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: lq0.g0.onClick(android.view.View):void");
            }
        });
        GestaltIconButton gestaltIconButton4 = this.B1;
        if (gestaltIconButton4 == null) {
            Intrinsics.r("addGifReactionToConvoButton");
            throw null;
        }
        gestaltIconButton4.u(new h0(this, i13));
        final int i17 = 3;
        if (W8().b()) {
            f9().Z(new h0(this, i14));
        } else {
            b9().setOnFocusChangeListener(new com.google.android.material.datepicker.h(this, i17));
            b9().L(new k0(this, i16));
        }
        if (!W8().b()) {
            e9().setOnClickListener(new View.OnClickListener(this) { // from class: lq0.g0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o0 f84312b;

                {
                    this.f84312b = attachStateListener;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    /*
                        Method dump skipped, instructions count: 494
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: lq0.g0.onClick(android.view.View):void");
                }
            });
        }
        Button button = (Button) Y8().findViewById(xc0.e.decline_upsell_btn);
        Button button2 = (Button) Y8().findViewById(xc0.e.accept_upsell_btn);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: lq0.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f84312b;

            {
                this.f84312b = attachStateListener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                /*
                    Method dump skipped, instructions count: 494
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: lq0.g0.onClick(android.view.View):void");
            }
        });
        final int i18 = 4;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: lq0.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f84312b;

            {
                this.f84312b = attachStateListener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                /*
                    Method dump skipped, instructions count: 494
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: lq0.g0.onClick(android.view.View):void");
            }
        });
        if (W8().b()) {
            View view = getView();
            View rootView = view != null ? view.getRootView() : null;
            if (rootView != null && (viewTreeObserver = rootView.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new i0(i13, rootView, this));
            }
        }
        ve.h.d0(this.I, new k0(this, i14));
    }

    @Override // ar0.r
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void p9() {
        if (!this.f84392o1) {
            k3.R1(d9(), false);
            return;
        }
        i2 i2Var = this.f84403z0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        String str = this.f84391n1;
        Intrinsics.f(str);
        this.Q0.a(i2Var.P(str).F(new dq0.i(20, new k0(this, 4)), new dq0.i(21, d.K), ck2.i.f27923c, ck2.i.f27924d));
        i9(true);
        if (W8().b()) {
            f9().requestFocus();
            hf0.b.s(f9());
        } else {
            b9().requestFocus();
            hf0.b.s(b9());
        }
        this.f84390m1 = true;
    }

    public final void q9() {
        k3.R1(e9(), this.f84392o1);
        k3.R1(a9(), !this.f84392o1);
        if (this.f84392o1) {
            e9().setBackgroundResource(xc0.d.ic_send_nonpds);
            e9().getLayoutParams().height = getResources().getDimensionPixelSize(xc0.c.conversation_quick_reply_image_size_large);
            e9().getLayoutParams().width = getResources().getDimensionPixelSize(xc0.c.conversation_quick_reply_image_size_large);
            b9().requestFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r9() {
        /*
            r4 = this;
            lh0.p0 r0 = r4.W8()
            boolean r0 = r0.b()
            java.lang.String r1 = ""
            java.lang.String r2 = "requireContext(...)"
            if (r0 == 0) goto L37
            com.pinterest.gestalt.textcomposer.GestaltTextComposer r0 = r4.f9()
            wn1.d r0 = r0.k0()
            u50.i0 r0 = r0.f()
            if (r0 == 0) goto L5d
            android.content.Context r3 = r4.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.lang.CharSequence r0 = r0.a(r3)
            if (r0 == 0) goto L5d
            java.lang.CharSequence r0 = kotlin.text.StringsKt.i0(r0)
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L5d
        L35:
            r1 = r0
            goto L5d
        L37:
            com.pinterest.gestalt.textfield.view.GestaltTextField r0 = r4.b9()
            ao1.b r0 = r0.k0()
            u50.i0 r0 = r0.f20030a
            if (r0 == 0) goto L5d
            android.content.Context r3 = r4.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.lang.CharSequence r0 = r0.a(r3)
            if (r0 == 0) goto L5d
            java.lang.CharSequence r0 = kotlin.text.StringsKt.i0(r0)
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L5d
            goto L35
        L5d:
            java.lang.String r0 = r4.f84391n1
            if (r0 == 0) goto L6d
            aq0.e r2 = r4.M0
            if (r2 == 0) goto L6a
            dq0.p r2 = (dq0.p) r2
            r2.S3(r1, r0)
        L6a:
            r4.U8()
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq0.o0.r9():void");
    }

    public final void s9(int i13, boolean z13) {
        fo1.a i73 = i7();
        if (i73 != null) {
            ((GestaltToolbarImpl) i73).O(i13, z13);
        }
    }

    public final void t9() {
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.setPaddingRelative(0, g83.getResources().getDimensionPixelSize(xc0.c.message_action_bar_height), 0, this.S0);
            g83.setClipToPadding(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u9() {
        /*
            r5 = this;
            boolean r0 = r5.f84384g1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1d
            r5.Z8()
            com.pinterest.api.model.mv r0 = r5.f84387j1
            boolean r0 = cp.a0.c(r0)
            if (r0 == 0) goto L1d
            oo1.j r0 = oo1.j.f96854a
            java.lang.String r0 = r5.f84386i1
            boolean r0 = oo1.j.m(r0)
            if (r0 == 0) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            boolean r3 = r5.f84379b1
            if (r3 != 0) goto L4d
            cp.a0 r3 = r5.Z8()
            boolean r3 = r3.d()
            if (r3 != 0) goto L4d
            cp.a0 r3 = r5.Z8()
            java.lang.String r4 = r5.U0
            if (r4 == 0) goto L46
            boolean r3 = r3.a(r4)
            if (r3 != 0) goto L4d
            cp.a0 r3 = r5.Z8()
            boolean r3 = r3.b()
            if (r3 != 0) goto L4d
            r3 = r2
            goto L4e
        L46:
            java.lang.String r0 = "conversationId"
            kotlin.jvm.internal.Intrinsics.r(r0)
            r0 = 0
            throw r0
        L4d:
            r3 = r1
        L4e:
            if (r0 == 0) goto L53
            if (r3 == 0) goto L53
            r1 = r2
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lq0.o0.u9():boolean");
    }

    @Override // nl1.d
    public final int y7() {
        return xc0.g.menu_conversation;
    }
}
