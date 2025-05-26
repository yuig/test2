package com.pinterest.framework.screens;

import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.attribution.GestaltAttribution;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.callout.GestaltCallout;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.navigation.Navigation;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nm1.d0;
import nm1.k0;
import rl1.c0;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f49222j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f49223k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13, Object obj, Object obj2) {
        super(1);
        this.f49221i = i13;
        this.f49222j = obj;
        this.f49223k = obj2;
    }

    public final rl1.q b(rl1.q it) {
        int i13 = this.f49221i;
        Object obj = this.f49223k;
        Object obj2 = this.f49222j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e((rl1.q) ((Function1) obj2).invoke(((GestaltAvatar) obj).O2()), "", "", false, null, null, false, false, null, 0, null, null, 1980);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                rl1.g gVar = (rl1.g) obj2;
                String str = gVar.f108575b;
                String str2 = gVar.f108581h;
                f0 x13 = ep.b.x(str2, "string", str2);
                Context context = ((GestaltAvatar) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                int F0 = dl2.b.F0(context, eo1.a.comp_avatar_xs_size);
                int i14 = gVar.f108574a;
                rl1.r rVar = i14 <= F0 ? rl1.r.XS : i14 <= dl2.b.F0(context, eo1.a.comp_avatar_sm_size) ? rl1.r.SM : i14 <= dl2.b.F0(context, eo1.a.comp_avatar_md_size) ? rl1.r.MD : i14 <= dl2.b.F0(context, eo1.a.comp_avatar_lg_size) ? rl1.r.LG : i14 <= dl2.b.F0(context, eo1.a.comp_avatar_xl_size) ? rl1.r.XL : rl1.r.XXL;
                Integer num = gVar.f108584k;
                return rl1.q.e(it, str, gVar.f108580g.f108590a, false, rVar, x13, false, false, gVar.f108582i, gVar.f108583j, num == null ? rl1.b.f108524a : new rl1.d(num.intValue()), gVar.f108585l, 100);
        }
    }

    public final void e(nm1.l endActions) {
        int i13 = this.f49221i;
        int i14 = 0;
        Object obj = this.f49223k;
        Object obj2 = this.f49222j;
        switch (i13) {
            case 26:
                Intrinsics.checkNotNullParameter(endActions, "endActions");
                if (!(endActions instanceof nm1.g)) {
                    if (!(endActions instanceof nm1.e)) {
                        ((nm1.q) obj).f91467a.a0(nm1.d.f91401q);
                        break;
                    } else {
                        GestaltHeaderBar gestaltHeaderBar = (GestaltHeaderBar) obj2;
                        Context context = gestaltHeaderBar.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        int F0 = dl2.b.F0(context, eo1.a.sema_space_100);
                        nm1.q qVar = (nm1.q) obj;
                        qVar.f91467a.a0(new k0(endActions, 1));
                        int idRes = dn1.a.END_ACTION_BUTTONS_ONE.getIdRes();
                        GestaltSearchField gestaltSearchField = qVar.f91467a;
                        GestaltHeaderBar.F0(gestaltHeaderBar, gestaltSearchField, idRes, F0);
                        GestaltHeaderBar.F0(gestaltHeaderBar, gestaltSearchField, dn1.a.END_ACTION_BUTTONS_TWO.getIdRes(), F0);
                        break;
                    }
                } else {
                    GestaltHeaderBar gestaltHeaderBar2 = (GestaltHeaderBar) obj2;
                    Context context2 = gestaltHeaderBar2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    int F02 = dl2.b.F0(context2, eo1.a.sema_space_100);
                    nm1.q qVar2 = (nm1.q) obj;
                    qVar2.f91467a.a0(new k0(endActions, i14));
                    GestaltHeaderBar.F0(gestaltHeaderBar2, qVar2.f91467a, dn1.a.END_ACTION_BUTTONS_ONE.getIdRes(), F02);
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(endActions, "endActions");
                GestaltHeaderBar gestaltHeaderBar3 = (GestaltHeaderBar) obj2;
                nm1.t tVar = (nm1.t) obj;
                GestaltHeaderBar.X(gestaltHeaderBar3, tVar.f91494d, gestaltHeaderBar3);
                List list = tVar.f91494d;
                list.clear();
                List list2 = tVar.f91493c;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    gestaltHeaderBar3.removeView((View) it.next());
                }
                list2.clear();
                boolean z13 = endActions instanceof nm1.k;
                nm1.f fVar = nm1.f.f91423a;
                GestaltHeaderBar.T(gestaltHeaderBar3, list2, z13 ? fVar : endActions, false);
                if (z13) {
                    endActions = fVar;
                }
                GestaltHeaderBar.Z(gestaltHeaderBar3, list, endActions, false);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence charSequence;
        int i13 = this.f49221i;
        int i14 = 2;
        int i15 = 3;
        boolean z13 = true;
        Object obj2 = this.f49223k;
        Object obj3 = this.f49222j;
        switch (i13) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                if (((p) entry.getValue()).f49219a == ((Context) obj3).hashCode()) {
                    ((p) entry.getValue()).f49220b.a();
                    ((Iterator) obj2).remove();
                }
                return Unit.f80348a;
            case 1:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf((((Boolean) ((Function1) obj3).invoke(navigation)).booleanValue() || Intrinsics.d(navigation, ((nl1.d) obj2).I)) ? false : true);
            case 2:
                ql1.e newState = (ql1.e) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                fm1.c cVar = GestaltAttribution.f49243f;
                ((GestaltAttribution) obj3).T((ql1.e) obj2, newState);
                return Unit.f80348a;
            case 3:
                c0 bind = (c0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                ql1.b bVar = (ql1.b) obj3;
                String imageUrl = bVar.f104074d;
                if (imageUrl != null) {
                    bind.getClass();
                    Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                    bind.f108528a = imageUrl;
                }
                Integer num = bVar.f104075e;
                rl1.c backgroundColor = num == null ? rl1.b.f108524a : new rl1.d(num.intValue());
                bind.getClass();
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                bind.f108537j = backgroundColor;
                Context context = ((GestaltAttribution) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String name = bVar.f104077a.a(context).toString();
                Intrinsics.checkNotNullParameter(name, "name");
                bind.f108529b = name;
                return Unit.f80348a;
            case 4:
                return b((rl1.q) obj);
            case 5:
                return b((rl1.q) obj);
            case 6:
                sl1.i state = (sl1.i) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                al1.n nVar = GestaltAvatarGroup.f49251e;
                ((GestaltAvatarGroup) obj3).e((sl1.i) obj2, state);
                return Unit.f80348a;
            case 7:
                rm1.k bind2 = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                wl1.d dVar = (wl1.d) ((wl1.h) obj3);
                rm1.f iconAndSize = new rm1.f(dVar.f130186a, rm1.i.MD);
                bind2.getClass();
                Intrinsics.checkNotNullParameter(iconAndSize, "iconAndSize");
                bind2.f108709a = iconAndSize;
                bind2.c(fm1.c.VISIBLE);
                bind2.a(dVar.f130187b);
                bind2.f108712d = ((GestaltBannerOverlay) obj2).f49312f;
                return Unit.f80348a;
            case 8:
                am1.b newState2 = (am1.b) obj;
                Intrinsics.checkNotNullParameter(newState2, "newState");
                fm1.c cVar2 = GestaltButtonSocial.f49326v;
                ((GestaltButtonSocial) obj3).t((am1.b) obj2, newState2);
                return Unit.f80348a;
            case 9:
                bm1.m newState3 = (bm1.m) obj;
                Intrinsics.checkNotNullParameter(newState3, "newState");
                int i16 = GestaltButtonToggle.f49328x;
                ((GestaltButtonToggle) obj3).w((bm1.m) obj2, newState3);
                return Unit.f80348a;
            case 10:
                cm1.d newState4 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(newState4, "newState");
                cm1.e eVar = GestaltButtonGroup.f49332j;
                ((GestaltButtonGroup) obj3).h((cm1.d) obj2, newState4);
                return Unit.f80348a;
            case 11:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) obj3;
                gm1.a aVar = (gm1.a) obj2;
                GestaltButton gestaltButton = gestaltButtonGroup.f49339c;
                if (gestaltButton == null) {
                    Intrinsics.r("primaryButton");
                    throw null;
                }
                gestaltButton.e(aVar);
                GestaltButton gestaltButton2 = gestaltButtonGroup.f49340d;
                if (gestaltButton2 == null) {
                    Intrinsics.r("secondaryButton");
                    throw null;
                }
                gestaltButton2.e(aVar);
                GestaltButton gestaltButton3 = gestaltButtonGroup.f49341e;
                if (gestaltButton3 != null) {
                    gestaltButton3.e(aVar);
                }
                return Unit.f80348a;
            case 12:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return yl1.b.f((yl1.b) obj3, null, false, null, null, null, ((cm1.d) obj2).f28015d, null, null, 0, null, 991);
            case 13:
                dm1.c newState5 = (dm1.c) obj;
                Intrinsics.checkNotNullParameter(newState5, "newState");
                dm1.d dVar2 = GestaltCallout.f49346g;
                ((GestaltCallout) obj3).a0((dm1.c) obj2, newState5);
                return Unit.f80348a;
            case 14:
                GestaltAvatarGroup component = (GestaltAvatarGroup) obj;
                Intrinsics.checkNotNullParameter(component, "component");
                GestaltAvatarGroup a13 = component.a(new ql1.k((sl1.i) obj3, 12));
                gm1.a aVar2 = (gm1.a) obj2;
                if (aVar2 != null) {
                    a13.b(aVar2);
                }
                return Unit.f80348a;
            case 15:
                GestaltAvatar component2 = (GestaltAvatar) obj;
                Intrinsics.checkNotNullParameter(component2, "component");
                GestaltAvatar H2 = component2.H2(new ql1.k((rl1.q) obj3, 13));
                gm1.a aVar3 = (gm1.a) obj2;
                if (aVar3 != null) {
                    H2.M2(aVar3);
                }
                return Unit.f80348a;
            case 16:
                GestaltButtonGroup component3 = (GestaltButtonGroup) obj;
                Intrinsics.checkNotNullParameter(component3, "component");
                GestaltButtonGroup a14 = component3.a(new cm1.h((cm1.d) obj3, i15));
                gm1.a aVar4 = (gm1.a) obj2;
                if (aVar4 != null) {
                    a14.b(aVar4);
                }
                return Unit.f80348a;
            case 17:
                GestaltButton component4 = (GestaltButton) obj;
                Intrinsics.checkNotNullParameter(component4, "component");
                GestaltButton d2 = component4.d(new jw0.b((yl1.b) obj3, i14));
                gm1.a aVar5 = (gm1.a) obj2;
                if (aVar5 != null) {
                    d2.e(aVar5);
                }
                return Unit.f80348a;
            case 18:
                GestaltButtonToggle component5 = (GestaltButtonToggle) obj;
                Intrinsics.checkNotNullParameter(component5, "component");
                GestaltButtonToggle s13 = component5.s(new ql1.k((bm1.m) obj3, 14));
                gm1.a aVar6 = (gm1.a) obj2;
                if (aVar6 != null) {
                    s13.t(aVar6);
                }
                return Unit.f80348a;
            case 19:
                GestaltDivider component6 = (GestaltDivider) obj;
                Intrinsics.checkNotNullParameter(component6, "component");
                GestaltDivider a15 = component6.a(new ql1.k((jm1.b) obj3, 15));
                gm1.a eventHandler = (gm1.a) obj2;
                if (eventHandler != null) {
                    a15.getClass();
                    Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                }
                return Unit.f80348a;
            case 20:
                GestaltIconButton component7 = (GestaltIconButton) obj;
                Intrinsics.checkNotNullParameter(component7, "component");
                GestaltIconButton t13 = component7.t(new dm1.h((om1.c) obj3, z13 ? 1 : 0));
                gm1.a aVar7 = (gm1.a) obj2;
                if (aVar7 != null) {
                    t13.u(aVar7);
                }
                return Unit.f80348a;
            case 21:
                GestaltIcon component8 = (GestaltIcon) obj;
                Intrinsics.checkNotNullParameter(component8, "component");
                GestaltIcon g23 = component8.g2(new ks0.f((rm1.d) obj3, 8));
                gm1.a eventHandler2 = (gm1.a) obj2;
                if (eventHandler2 != null) {
                    g23.getClass();
                    Intrinsics.checkNotNullParameter(eventHandler2, "eventHandler");
                }
                return Unit.f80348a;
            case 22:
                GestaltPreviewTextView component9 = (GestaltPreviewTextView) obj;
                Intrinsics.checkNotNullParameter(component9, "component");
                component9.i(new ql1.k((un1.c) obj2, 16));
                gm1.a aVar8 = (gm1.a) obj3;
                if (aVar8 != null) {
                    component9.j(aVar8);
                }
                return Unit.f80348a;
            case 23:
                GestaltSwitchWithLabel component10 = (GestaltSwitchWithLabel) obj;
                Intrinsics.checkNotNullParameter(component10, "component");
                GestaltSwitchWithLabel T = component10.T(new ql1.k((on1.k) obj3, 17));
                gm1.a aVar9 = (gm1.a) obj2;
                if (aVar9 != null) {
                    T.X(aVar9);
                }
                return Unit.f80348a;
            case 24:
                nm1.m state2 = (nm1.m) obj;
                Intrinsics.checkNotNullParameter(state2, "state");
                Object obj4 = ((Map) obj3).get((ek.e) obj2);
                Intrinsics.f(obj4);
                return ((d0) state2).b(((Number) obj4).intValue());
            case 25:
                nm1.m it3 = (nm1.m) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                GestaltHeaderBar gestaltHeaderBar = (GestaltHeaderBar) obj3;
                gestaltHeaderBar.B0((nm1.m) obj2, gestaltHeaderBar.r0());
                return Unit.f80348a;
            case 26:
                e((nm1.l) obj);
                return Unit.f80348a;
            case 27:
                e((nm1.l) obj);
                return Unit.f80348a;
            case 28:
                rn1.a it4 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return rn1.a.y(it4, (i0) obj2, ((GestaltIconButton) obj3).w().f96644f ? vn1.c.DEFAULT : vn1.c.DISABLED, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            default:
                un1.m bind3 = (un1.m) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                wm1.s sVar = (wm1.s) obj3;
                i0 text = sVar.f130333b;
                bind3.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind3.f122894b = text;
                boolean z14 = sVar instanceof wm1.r;
                bind3.f122909q = z14 ? ((wm1.r) sVar).f130331h : 3;
                if (z14) {
                    co1.b bVar2 = (co1.b) ((GestaltListAction) obj2).R.getValue();
                    bVar2.getClass();
                    Date date = ((wm1.r) sVar).f130328e;
                    Intrinsics.checkNotNullParameter(date, "date");
                    pb0.i iVar = xa0.j.p(date).f99433a;
                    int i17 = iVar == null ? -1 : co1.a.f28285a[iVar.ordinal()];
                    if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
                        charSequence = bVar2.f28286a.a(date, pb0.b.STYLE_COMPACT);
                    } else {
                        charSequence = bVar2.f28287b.format(date);
                        Intrinsics.checkNotNullExpressionValue(charSequence, "format(...)");
                    }
                } else {
                    charSequence = "";
                }
                bind3.f122910r = charSequence != null ? new f0(charSequence) : null;
                un1.j suffixMode = z14 ? new un1.g(un1.e.f122883a) : un1.i.f122887b;
                Intrinsics.checkNotNullParameter(suffixMode, "suffixMode");
                bind3.f122908p = suffixMode;
                vn1.c color = vn1.c.SUBTLE;
                vn1.g variant = vn1.g.BODY_200;
                bind3.f122911s = new un1.k(variant, vn1.e.REGULAR, color);
                GestaltListAction gestaltListAction = (GestaltListAction) obj2;
                Context context2 = gestaltListAction.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (sVar.a(context2) != wm1.t.HEADER_SUBHEADER) {
                    color = vn1.c.DEFAULT;
                }
                Intrinsics.checkNotNullParameter(color, "color");
                bind3.f122895c = color;
                if (!gestaltListAction.N || !(sVar instanceof wm1.q)) {
                    variant = vn1.g.BODY_300;
                }
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind3.f122898f = variant;
                bind3.f122903k = sVar.f130334c;
                bind3.f122904l = ho1.b.list_action_subheader;
                return Unit.f80348a;
        }
    }
}
