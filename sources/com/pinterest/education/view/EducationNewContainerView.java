package com.pinterest.education.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.pinterest.education.ActionPromptView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l1;
import cp1.p;
import d7.b;
import dh0.d;
import eg0.a;
import eg0.c;
import ek2.j;
import gg0.l0;
import gg0.n0;
import gg0.r;
import gg0.t;
import gg0.u;
import gg0.v;
import i32.l;
import i32.w0;
import i32.y0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m.h;
import m60.t0;
import m60.w;
import org.jetbrains.annotations.NotNull;
import qa2.u1;
import rg0.n;
import rg0.y;
import vb0.e;
import yn2.c0;
import zf0.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/pinterest/education/view/EducationNewContainerView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gg0/i", "g4/u", "gg0/j", "gg0/k", "gg0/l", "gg0/m", "gg0/n", "gg0/o", "gg0/p", "gg0/q", "educationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EducationNewContainerView extends n0 {
    public static final HashSet A;
    public static final HashSet B;
    public static final LinkedHashSet C;
    public static final l[] D;
    public static final l[] E;

    /* renamed from: d, reason: collision with root package name */
    public final f f44988d;

    /* renamed from: e, reason: collision with root package name */
    public final w f44989e;

    /* renamed from: f, reason: collision with root package name */
    public ku1.l f44990f;

    /* renamed from: g, reason: collision with root package name */
    public List f44991g;

    /* renamed from: h, reason: collision with root package name */
    public h f44992h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44993i;

    /* renamed from: j, reason: collision with root package name */
    public a f44994j;

    /* renamed from: k, reason: collision with root package name */
    public c f44995k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f44996l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f44997m;

    /* renamed from: n, reason: collision with root package name */
    public final EducationPulsarView f44998n;

    /* renamed from: o, reason: collision with root package name */
    public final EducationToolTipView f44999o;

    /* renamed from: p, reason: collision with root package name */
    public final EducationPromptView f45000p;

    /* renamed from: q, reason: collision with root package name */
    public ActionPromptView f45001q;

    /* renamed from: r, reason: collision with root package name */
    public View f45002r;

    /* renamed from: s, reason: collision with root package name */
    public GestaltBannerOverlay f45003s;

    /* renamed from: t, reason: collision with root package name */
    public j f45004t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f45005u;

    /* renamed from: v, reason: collision with root package name */
    public final t f45006v;

    /* renamed from: w, reason: collision with root package name */
    public final int f45007w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f45008x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f45009y;

    /* renamed from: z, reason: collision with root package name */
    public final u f45010z;

    static {
        i32.c cVar = i32.c.PIN_IT_BUTTON;
        Integer valueOf = Integer.valueOf(cVar.getValue());
        Integer valueOf2 = Integer.valueOf(i32.c.CLOSEUP_SEND_BUTTON.getValue());
        i32.c cVar2 = i32.c.CLICKTHROUGH_BUTTON;
        Integer valueOf3 = Integer.valueOf(cVar2.getValue());
        Integer valueOf4 = Integer.valueOf(i32.c.LIBRARY_ALL_PINS.getValue());
        Integer valueOf5 = Integer.valueOf(i32.c.CLOSEUP_ATTRIBUTION_NAME.getValue());
        Integer valueOf6 = Integer.valueOf(i32.c.RICH_ACTION_BUTTON.getValue());
        Integer valueOf7 = Integer.valueOf(i32.c.CHECKOUT_ADD_CREDIT_CARD_BUTTON.getValue());
        Integer valueOf8 = Integer.valueOf(i32.c.HOMEFEED_FIRST_PIN.getValue());
        Integer valueOf9 = Integer.valueOf(i32.c.GUIDED_SEARCH_THIRD_TOKEN.getValue());
        Integer valueOf10 = Integer.valueOf(i32.c.CLOSEUP_DID_IT_BUTTON.getValue());
        Integer valueOf11 = Integer.valueOf(i32.c.FOLLOWING_TUNER_ENTRY_BUTTON.getValue());
        i32.c cVar3 = i32.c.HOMEFEED_BOARD_MORE_IDEAS_TAB;
        HashSet hashSet = new HashSet(f0.j(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, Integer.valueOf(cVar3.getValue())));
        A = hashSet;
        HashSet hashSet2 = new HashSet(f0.j(Integer.valueOf(cVar3.getValue()), Integer.valueOf(i32.c.CLOSEUP_SOURCE_FOLLOW_BUTTON.getValue()), Integer.valueOf(i32.c.PIN_REACTION_BUTTON.getValue()), Integer.valueOf(i32.c.HOMEFEED_TODAY_TAB.getValue()), Integer.valueOf(cVar.getValue()), Integer.valueOf(i32.c.CLOSEUP_OVERFLOW_MENU.getValue()), Integer.valueOf(i32.c.BOARD_PLUS_BUTTON.getValue()), Integer.valueOf(i32.c.BOARD_NOTE_COMPONENT_ACTION_BAR.getValue()), Integer.valueOf(i32.c.BOARD_ORGANIZE_BUTTON.getValue()), Integer.valueOf(i32.c.BOARD_NOTE_TOOL.getValue()), Integer.valueOf(i32.c.BOARD_AVATAR.getValue()), Integer.valueOf(i32.c.BOARD_SHARE_BUTTON.getValue()), Integer.valueOf(i32.c.PIN_CLOSEUP_PIN_NOTE.getValue()), Integer.valueOf(i32.c.BOARD_FILTER_ICON.getValue()), Integer.valueOf(i32.c.USER_PROFILE_NAVIGATION_ICON.getValue()), Integer.valueOf(i32.c.PROFILE_PLUS_BUTTON.getValue()), Integer.valueOf(i32.c.PROFILE_HIGHLIGHT_CREATE_BUTTON.getValue()), Integer.valueOf(i32.c.PROFILE_CREATED_TAB.getValue()), Integer.valueOf(i32.c.PROFILE_SETTINGS_ICON.getValue()), Integer.valueOf(cVar2.getValue()), Integer.valueOf(i32.c.IDEA_PIN_MUSIC_BROWSER_FILTER.getValue()), Integer.valueOf(i32.c.IDEA_PIN_ASSET_PICKER_VIDEO_TAB.getValue()), Integer.valueOf(i32.c.BOARD_BOARDLESS_PIN_AUTO_ORGANIZE_BUTTON.getValue()), Integer.valueOf(i32.c.ANDROID_OWN_PROFILE_AVATAR.getValue()), Integer.valueOf(i32.c.PROFILE_AVATAR.getValue())));
        B = hashSet2;
        C = CollectionsKt.K0(hashSet, hashSet2);
        D = new l[]{l.ANDROID_WARM_SEO_NUX_HOMEFEED_INTRO, l.ANDROID_FIRST_TRIED_SCROLL_PROMPT, l.ANDROID_AFFINITY_CIRCLE_EDUCATION, l.ANDROID_IAB_RATE_WEBSITE_TOOLTIP};
        l lVar = l.ANDROID_CLOSEUP_REACTION_TOOLTIP;
        l lVar2 = l.ANDROID_CLOSEUP_REACTION_TOOLTIP_3;
        l lVar3 = l.ANDROID_BOARD_NOTE_CREATE_TOOLTIP;
        l lVar4 = l.ANDROID_BOARD_NOTE_COMPONENTS_TOOLTIP;
        l lVar5 = l.ANDROID_ORGANIZE_BOARD_PINS_TOOLTIP;
        l lVar6 = l.ANDROID_BOARD_PERMISSIONS_TOOLTIP;
        l lVar7 = l.ANDROID_BOARD_NOTE_TOOL_TOOLTIP;
        l lVar8 = l.ANDROID_BOARD_NOTE_ACTIONS_BY_VERTICAL_TOOLTIP;
        l lVar9 = l.ANDROID_PROFILE_BUSINESS_HUB_ICON_TOOLTIP;
        E = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, l.ANDROID_HIDE_BOARD_FOLLOW, lVar6, l.ANDROID_PIN_CLOSEUP_NOTE_TOOLTIP, l.ANDROID_PIN_CLOSEUP_GROUP_BOARD_COMMENTS_MIGRATION_TOOLTIP, l.ANDROID_PIN_NOTE_FILTER_TOOLTIP, lVar9, l.ANDROID_NEWS_HUB_UPSELL_HF_TOOLTIP, l.ANDROID_PROFILE_PRONOUNS_TOOLTIP, l.ANDROID_ABOUT_DRAWER_TOOLTIP, l.ANDROID_ACCOUNT_LEVEL_COMMENT_CONTROL, l.ANDROID_DEPRECATE_VIDEO_PROFILE_COVER_TOOLTIP, l.ANDROID_DEPRECATE_TILTED_PINS_PROFILE_COVER_TOOLTIP, l.ANDROID_TV_HOME_ICON_TOOLTIP, l.ANDROID_IDEA_PIN_POST_SHARE_UPSELL_TOOLTIP, l.ANDROID_CREATOR_HUB_UPSELL_TOOLTIP, l.ANDROID_BOARD_PREVIEW_SHARE_BOARD_TOOLTIP, l.ANDROID_CLOSEUP_REDESIGN_SAVE_EDUCATION, l.ANDROID_CLOSEUP_REDESIGN_VISIT_EDUCATION, l.ANDROID_CLOSEUP_REDESIGN_DOWNLOAD_EDUCATION, l.ANDROID_CLOSEUP_REDESIGN_SAVE_AFTER_REACTION_EDUCATION, l.ANDROID_CLOSEUP_REDESIGN_SAVE_AFTER_SHARE_EDUCATION, l.ANDROID_CLOSEUP_REDESIGN_DOWNLOAD_AFTER_SCREENSHOT_EDUCATION};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EducationNewContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0240, code lost:
    
        if (r2.f58892k == i32.w1.PULSER_ONLY.getValue()) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (java.lang.Integer.parseInt(r5) == i32.y0.ANDROID_STORY_PIN_CLOSEUP.getValue()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0231, code lost:
    
        if (r2.f58892k == i32.w1.PULSER.getValue()) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0242, code lost:
    
        r2 = r17.f44995k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0244, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0246, code lost:
    
        i32.c.Companion.getClass();
        r2 = i32.a.a(r2.f58891j);
        r17.f45009y = true;
        r7 = r17.f45002r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0255, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0258, code lost:
    
        if (r2 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x025a, code lost:
    
        r7 = r17.n(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x025f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0260, code lost:
    
        r10 = r17.f44998n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0262, code lost:
    
        if (r10 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0264, code lost:
    
        r10.b(r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0267, code lost:
    
        r2 = r17.f44998n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0269, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026b, code lost:
    
        r4 = r4 == true ? 1 : 0;
        r2.setOnClickListener(new gg0.h(r17, r4, r8));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(final com.pinterest.education.view.EducationNewContainerView r17, m.h r18, android.graphics.Rect r19) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.education.view.EducationNewContainerView.i(com.pinterest.education.view.EducationNewContainerView, m.h, android.graphics.Rect):void");
    }

    public final void C(boolean z13) {
        LinkedHashMap linkedHashMap = this.f45005u;
        if (!z13) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                ((View) entry.getKey()).setImportantForAccessibility(((Number) entry.getValue()).intValue());
            }
            linkedHashMap.clear();
            return;
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            yn2.h hVar = new yn2.h(c0.j(b.O(viewGroup), new v(this, 1)));
            while (hVar.hasNext()) {
                View view = (View) hVar.next();
                linkedHashMap.put(view, Integer.valueOf(view.getImportantForAccessibility()));
                view.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r2.f108060b == i32.l.ANDROID_DSA_HOMEFEED.getValue()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r3.d(com.pinterest.navigation.Navigation.w1((com.pinterest.framework.screens.ScreenLocation) com.pinterest.screens.l1.f51062h.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r2.f108060b == i32.l.ANDROID_DSA_PROFILE.getValue()) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r12) {
        /*
            r11 = this;
            r11.m()
            m.h r0 = r11.f44992h
            r1 = 0
            if (r0 == 0) goto La7
            java.lang.Object r0 = r0.f85198c
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto La7
            i32.w0 r2 = i32.y0.Companion
            int r0 = java.lang.Integer.parseInt(r0)
            r2.getClass()
            i32.y0 r0 = i32.w0.a(r0)
            if (r0 != 0) goto L1e
            return
        L1e:
            rg0.s r2 = rg0.y.a()
            dh0.d r2 = (dh0.d) r2
            rg0.n r2 = r2.b(r0)
            if (r2 == 0) goto L4c
            i32.l r3 = i32.l.ANDROID_CLICKTHROUGH_BTN_TOOLTIP
            int r3 = r3.getValue()
            int r4 = r2.f108060b
            if (r4 != r3) goto L4c
            i32.y0 r3 = r2.f108067i
            i32.y0 r4 = i32.y0.ANDROID_PIN_CLOSEUP_TAKEOVER
            if (r3 != r4) goto L4c
            nx.d0 r3 = sh.f.a()
            java.lang.String r4 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            h32.f1 r4 = h32.f1.FPE_END
            r5 = 12
            r6 = 0
            nx.d0.v(r3, r4, r1, r6, r5)
            goto L98
        L4c:
            m60.w r3 = r11.f44989e
            if (r2 == 0) goto L70
            i32.l r4 = i32.l.ANDROID_CURATED_CONTENT_REMOVAL
            int r4 = r4.getValue()
            int r5 = r2.f108060b
            if (r5 != r4) goto L70
            i32.y0 r4 = r2.f108067i
            i32.y0 r5 = i32.y0.ANDROID_BUSINESS_HUB_AFTER_LOAD
            if (r4 != r5) goto L70
            xk2.v r4 = com.pinterest.screens.l1.f51058d
            java.lang.Object r4 = r4.getValue()
            com.pinterest.framework.screens.ScreenLocation r4 = (com.pinterest.framework.screens.ScreenLocation) r4
            com.pinterest.navigation.NavigationImpl r4 = com.pinterest.navigation.Navigation.w1(r4)
            r3.d(r4)
            goto L98
        L70:
            if (r2 == 0) goto L7d
            i32.l r4 = i32.l.ANDROID_DSA_HOMEFEED
            int r4 = r4.getValue()
            int r5 = r2.f108060b
            if (r5 != r4) goto L7d
            goto L89
        L7d:
            if (r2 == 0) goto L98
            i32.l r4 = i32.l.ANDROID_DSA_PROFILE
            int r4 = r4.getValue()
            int r5 = r2.f108060b
            if (r5 != r4) goto L98
        L89:
            xk2.v r4 = com.pinterest.screens.l1.f51062h
            java.lang.Object r4 = r4.getValue()
            com.pinterest.framework.screens.ScreenLocation r4 = (com.pinterest.framework.screens.ScreenLocation) r4
            com.pinterest.navigation.NavigationImpl r4 = com.pinterest.navigation.Navigation.w1(r4)
            r3.d(r4)
        L98:
            if (r2 == 0) goto L9e
            r2.a(r1, r1)
            goto La7
        L9e:
            rg0.s r2 = rg0.y.a()
            dh0.d r2 = (dh0.d) r2
            r2.j(r0)
        La7:
            r11.f44992h = r1
            zf0.f r0 = r11.f44988d
            r2 = -1
            r0.f141905b = r2
            r11.f44991g = r1
            r11.f44995k = r1
            r11.f44994j = r1
            if (r12 == 0) goto Ld9
            ku1.l r3 = r11.f44990f
            if (r3 == 0) goto Ld3
            android.content.Context r4 = r11.getContext()
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r8 = 0
            r9 = 0
            r6 = 1
            r7 = 1
            r10 = 64
            r5 = r12
            ku1.l.b(r3, r4, r5, r6, r7, r8, r9, r10)
            goto Ld9
        Ld3:
            java.lang.String r12 = "uriNavigator"
            kotlin.jvm.internal.Intrinsics.r(r12)
            throw r1
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.education.view.EducationNewContainerView.j(java.lang.String):void");
    }

    public final void k() {
        String str;
        m();
        h hVar = this.f44992h;
        if (hVar != null && (str = (String) hVar.f85198c) != null) {
            w0 w0Var = y0.Companion;
            int parseInt = Integer.parseInt(str);
            w0Var.getClass();
            y0 a13 = w0.a(parseInt);
            if (a13 == null) {
                return;
            }
            n b13 = ((d) y.a()).b(a13);
            if (b13 != null) {
                b13.c(null, null);
            } else {
                ((d) y.a()).j(a13);
            }
        }
        this.f44992h = null;
        this.f44988d.f141905b = -1;
        this.f44991g = null;
        this.f44995k = null;
        this.f44994j = null;
    }

    public final void l() {
        ArrayList arrayList = this.f44996l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EducationPulsarView educationPulsarView = (EducationPulsarView) it.next();
            educationPulsarView.c();
            educationPulsarView.setOnClickListener(null);
            removeView(educationPulsarView);
        }
        ArrayList arrayList2 = this.f44997m;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((u1) it2.next()).onPulsarHide();
        }
        arrayList.clear();
        arrayList2.clear();
    }

    public final void m() {
        GestaltText gestaltText;
        Context context = getContext();
        int i13 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i13));
        GestaltBannerOverlay gestaltBannerOverlay = this.f45003s;
        int i14 = 0;
        if (gestaltBannerOverlay != null) {
            gg0.a nextState = gg0.a.f64908y;
            Intrinsics.checkNotNullParameter(nextState, "nextState");
        }
        EducationPulsarView educationPulsarView = this.f44998n;
        if (educationPulsarView != null) {
            educationPulsarView.c();
        }
        EducationToolTipView educationToolTipView = this.f44999o;
        Object obj2 = null;
        if (educationToolTipView != null) {
            educationToolTipView.setVisibility(8);
            educationToolTipView.f45028f.removeCallbacksAndMessages(null);
            educationToolTipView.f45034l = true;
        }
        EducationPromptView educationPromptView = this.f45000p;
        if (educationPromptView != null) {
            educationPromptView.setVisibility(8);
            educationPromptView.f45015d.removeCallbacksAndMessages(null);
        }
        if (educationPromptView != null && (gestaltText = educationPromptView.f45012a) != null) {
            gestaltText.j(new bp.j(13, obj2, educationPromptView));
        }
        ActionPromptView actionPromptView = this.f45001q;
        if (actionPromptView != null) {
            actionPromptView.t();
        }
        l();
        this.f45009y = false;
        this.f45008x = false;
        this.f44993i = false;
        this.f44989e.j(this.f45010z);
        C(false);
    }

    public final View n(i32.c cVar) {
        View o13;
        View o14;
        View o15;
        View o16;
        View o17 = o();
        boolean z13 = false;
        if (o17 != null && o17.getVisibility() == 0) {
            z13 = true;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity k03 = bs1.c.k0(context);
        Intrinsics.g(k03, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.BaseActivity");
        this.f44988d.getClass();
        nl1.d b13 = f.b((p) k03);
        View view = b13 != null ? b13.getView() : null;
        int i13 = r.f64958a[cVar.ordinal()];
        if (i13 == 1) {
            if (!z13 || (o13 = o()) == null) {
                return null;
            }
            return o13.findViewById(t0.pin_action_reaction);
        }
        if (i13 == 2) {
            if (!z13 || (o14 = o()) == null) {
                return null;
            }
            return o14.findViewById(ud0.a.save_pinit_bt);
        }
        if (i13 == 3) {
            if (!z13 || (o15 = o()) == null) {
                return null;
            }
            return o15.findViewById(t0.clickthrough_button);
        }
        if (i13 == 4) {
            View findViewById = view != null ? view.findViewById(t0.user_profile_collapsed_options_icon) : null;
            if (bs1.c.o1(findViewById)) {
                return findViewById;
            }
            return null;
        }
        if (i13 == 5 && z13 && (o16 = o()) != null) {
            return o16.findViewById(t0.action_module_comments_icon);
        }
        return null;
    }

    public final View o() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity k03 = bs1.c.k0(context);
        Intrinsics.g(k03, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.BaseActivity");
        this.f44988d.getClass();
        com.pinterest.framework.screens.a b13 = f.b((p) k03);
        if (!Intrinsics.d(b13 != null ? b13.getClass() : null, ((ScreenLocation) l1.f51059e.getValue()).getF35549a())) {
            return null;
        }
        l0 l0Var = b13 instanceof l0 ? (l0) b13 : null;
        if (l0Var != null) {
            return l0Var.h5();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w wVar = this.f44989e;
        wVar.j(this.f45010z);
        wVar.j(this.f45006v);
        j jVar = this.f45004t;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.education.view.EducationNewContainerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r12 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(long r20, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.education.view.EducationNewContainerView.q(long, android.graphics.Rect):void");
    }

    public final void s(a aVar, n nVar) {
        ActionPromptView actionPromptView = this.f45001q;
        if (actionPromptView == null) {
            return;
        }
        C(true);
        h hVar = this.f44992h;
        actionPromptView.X(aVar, hVar != null ? (String) hVar.f85199d : null, nVar);
        Context context = getContext();
        int i13 = fj.d.bright_foreground_disabled_material_light;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i13));
        this.f44993i = true;
    }

    public final void t(boolean z13) {
        NavigationImpl w13 = Navigation.w1((ScreenLocation) l1.f51061g.getValue());
        w13.y0(Boolean.TRUE, "com.pinterest.EXTRA_IS_BIRTHDATE_COLLECTION");
        a aVar = this.f44994j;
        w13.y0(aVar != null ? aVar.f58864g : null, "com.pinterest.EXTRA_MESSAGE_BLOCKING");
        w13.y0(Boolean.valueOf(z13), "com.pinterest.EXTRA_IS_BIRTHDAY_COLLECTION_DISMISSIBLE");
        this.f44989e.d(w13);
    }

    public final boolean x() {
        k();
        return this.f44993i;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getF44993i() {
        return this.f44993i;
    }

    public /* synthetic */ EducationNewContainerView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationNewContainerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        xk2.v vVar = f.f141903e;
        this.f44988d = e.e();
        w wVar = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f44989e = wVar;
        this.f44996l = new ArrayList();
        this.f44997m = new ArrayList();
        this.f45005u = new LinkedHashMap();
        t tVar = new t(this);
        this.f45006v = tVar;
        this.f45007w = bs1.c.b0(this, eo1.c.lego_spacing_gutter);
        View.inflate(context, jg0.d.education_new_container, this);
        this.f44998n = (EducationPulsarView) findViewById(jg0.c.education_pulsar_view);
        this.f44999o = (EducationToolTipView) findViewById(jg0.c.education_tooltip_view);
        this.f45000p = (EducationPromptView) findViewById(jg0.c.education_prompt_view);
        wVar.h(tVar);
        this.f45010z = new u(this);
    }
}
