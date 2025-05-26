package ep;

import a.l2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.compose.foundation.lazy.layout.z0;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hl;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.t60;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubRecentPinEmptyStateView;
import com.pinterest.creatorHub.feature.hub.view.components.ToolButtonView;
import com.pinterest.feature.adscarousel.view.items.AdsCarouselPinItemVideoView;
import com.pinterest.feature.articlecarousel.SeparatorTitleView;
import com.pinterest.feature.board.common.newideas.view.MoreIdeasFeedSectionTitleView;
import com.pinterest.feature.board.detail.view.BoardExpandedSectionHeaderView;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.listAction.GestaltListAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kh2.m0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lh0.a4;
import lh0.e0;
import lh0.g1;
import lh0.z3;
import m60.w0;
import m60.x0;
import mp.s;
import mp.u;
import pk.a0;
import rb2.t;
import rq.t0;
import u50.f0;
import u50.k0;

/* loaded from: classes3.dex */
public final class c extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59864a;

    public c(int i13) {
        this.f59864a = i13;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        String str;
        String title;
        String str2;
        String str3;
        int i14 = this.f59864a;
        int i15 = 7;
        int i16 = 8;
        int i17 = 1;
        switch (i14) {
            case 0:
                i((rb2.d) nVar, (pb2.a) obj);
                break;
            case 1:
                mp.f view = (mp.f) nVar;
                pb2.k model = (pb2.k) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                TypeAheadItem typeAheadItem = model.f99506a;
                view.getClass();
                Intrinsics.checkNotNullParameter(typeAheadItem, "typeAheadItem");
                String n13 = typeAheadItem.n();
                Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
                if (n13.length() > 0) {
                    String n14 = typeAheadItem.n();
                    Intrinsics.checkNotNullExpressionValue(n14, "getTitle(...)");
                    String substring = n14.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    str = substring.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                } else {
                    str = "";
                }
                String n15 = typeAheadItem.n();
                if (n15 == null) {
                    n15 = "";
                }
                String l13 = typeAheadItem.l();
                String str4 = l13 != null ? l13 : "";
                int i18 = typeAheadItem.f35147h;
                Intrinsics.checkNotNullExpressionValue(Integer.valueOf(i18), "getAvatarColorIndex(...)");
                a0.p(view.f87850e, n15);
                view.f87849d.H2(new mp.d(str4, str, n15, i18));
                mp.a aVar = mp.a.f87830k;
                GestaltIconButton gestaltIconButton = view.f87851f;
                GestaltIconButton t13 = gestaltIconButton.t(aVar);
                gestaltIconButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                gestaltIconButton.setPaddingRelative(t13.getResources().getDimensionPixelSize(eo1.c.space_200), 0, 0, 0);
                view.f87848c.setOnClickListener(new co.a(i15, view, h1.c(typeAheadItem)));
                break;
            case 2:
                mp.k view2 = (mp.k) nVar;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter((pb2.i) obj, "model");
                view2.findViewById(xc0.e.new_message_button).setPaddingRelative(0, bs1.c.W(view2, eo1.c.space_300), 0, bs1.c.W(view2, eo1.c.space_300));
                view2.setOnClickListener(new l2(view2, 17));
                break;
            case 3:
                mp.i view3 = (mp.i) nVar;
                pb2.l model2 = (pb2.l) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                TypeAheadItem typeAheadItem2 = model2.f99507a;
                view3.getClass();
                Intrinsics.checkNotNullParameter(typeAheadItem2, "typeAheadItem");
                ContactSearchListCell contactSearchListCell = view3.f87861c;
                contactSearchListCell.f48393j = true;
                contactSearchListCell.b(typeAheadItem2);
                co.a listener = new co.a(i16, view3, h1.c(typeAheadItem2));
                Intrinsics.checkNotNullParameter(listener, "listener");
                contactSearchListCell.f48391h = listener;
                String string = contactSearchListCell.getResources().getString(x0.send_message);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                contactSearchListCell.e(i13, string, "", new HashMap(), g91.c.RECIPIENT);
                break;
            case 4:
                i((rb2.d) nVar, (pb2.a) obj);
                break;
            case 5:
                rb2.d view4 = (rb2.d) nVar;
                pb2.b model3 = (pb2.b) obj;
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                view4.b(model3.f99500a);
                break;
            case 6:
                rb2.i view5 = (rb2.i) nVar;
                pb2.c model4 = (pb2.c) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                view5.a(i13, model4.f99501a);
                break;
            case 7:
                mp.b view6 = (mp.b) nVar;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter((pb2.d) obj, "model");
                view6.f87837d.d(mp.a.f87829j);
                view6.setOnClickListener(new l2(view6, 16));
                break;
            case 8:
                u view7 = (u) nVar;
                pb2.j model5 = (pb2.j) obj;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(model5, "model");
                int i19 = model5.f99504a;
                view7.getClass();
                j0 j0Var = new j0();
                j0Var.f80434a = "";
                if (i19 > 0) {
                    String quantityString = view7.getContext().getResources().getQuantityString(xc0.h.boards_count, i19, Integer.valueOf(i19));
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    j0Var.f80434a = quantityString;
                }
                int i23 = model5.f99505b;
                if (i23 > 0) {
                    j0Var.f80434a = j0Var.f80434a + " - " + view7.getContext().getResources().getQuantityString(xc0.h.messages_count, i23, Integer.valueOf(i23));
                }
                z0 z0Var = new z0(4, j0Var);
                GestaltListAction gestaltListAction = view7.f87891d;
                kg.a.h(gestaltListAction, z0Var);
                gestaltListAction.Z(new xo.k(view7, 2));
                break;
            case 9:
                h((s) nVar, (pb2.g) obj);
                break;
            case 10:
                h((s) nVar, (pb2.g) obj);
                break;
            case 11:
                h((s) nVar, (pb2.g) obj);
                break;
            case 12:
                rb2.i view8 = (rb2.i) nVar;
                z40.f model6 = (z40.f) obj;
                Intrinsics.checkNotNullParameter(view8, "view");
                Intrinsics.checkNotNullParameter(model6, "model");
                view8.a(i13, model6);
                break;
            case 13:
                rb2.d view9 = (rb2.d) nVar;
                z40.f model7 = (z40.f) obj;
                Intrinsics.checkNotNullParameter(view9, "view");
                Intrinsics.checkNotNullParameter(model7, "model");
                view9.b(model7);
                break;
            case 14:
                t view10 = (t) nVar;
                z40.n model8 = (z40.n) obj;
                switch (i14) {
                    case 14:
                        Intrinsics.checkNotNullParameter(view10, "view");
                        Intrinsics.checkNotNullParameter(model8, "model");
                        view10.a(model8);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(view10, "view");
                        Intrinsics.checkNotNullParameter(model8, "model");
                        view10.a(model8);
                        break;
                }
            case 15:
                t view11 = (t) nVar;
                z40.n model9 = (z40.n) obj;
                switch (i14) {
                    case 14:
                        Intrinsics.checkNotNullParameter(view11, "view");
                        Intrinsics.checkNotNullParameter(model9, "model");
                        view11.a(model9);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(view11, "view");
                        Intrinsics.checkNotNullParameter(model9, "model");
                        view11.a(model9);
                        break;
                }
            case 16:
                ms.b view12 = (ms.b) nVar;
                t60 model10 = (t60) obj;
                switch (i14) {
                    case 16:
                        Intrinsics.checkNotNullParameter(view12, "view");
                        Intrinsics.checkNotNullParameter(model10, "model");
                        view12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        view12.f88094c = model10.f42108a;
                        view12.f88092a = model10.f42110c;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(view12, "view");
                        Intrinsics.checkNotNullParameter(model10, "model");
                        view12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        view12.f88094c = model10.f42108a;
                        view12.f88092a = model10.f42110c;
                        break;
                }
            case 17:
                ms.b view13 = (ms.b) nVar;
                t60 model11 = (t60) obj;
                switch (i14) {
                    case 16:
                        Intrinsics.checkNotNullParameter(view13, "view");
                        Intrinsics.checkNotNullParameter(model11, "model");
                        view13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        view13.f88094c = model11.f42108a;
                        view13.f88092a = model11.f42110c;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(view13, "view");
                        Intrinsics.checkNotNullParameter(model11, "model");
                        view13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        view13.f88094c = model11.f42108a;
                        view13.f88092a = model11.f42110c;
                        break;
                }
            case 18:
                BoardExpandedSectionHeaderView view14 = (BoardExpandedSectionHeaderView) nVar;
                vh model12 = (vh) obj;
                Intrinsics.checkNotNullParameter(view14, "view");
                Intrinsics.checkNotNullParameter(model12, "model");
                kj kjVar = model12.f42855m;
                String a13 = kjVar != null ? kjVar.a() : null;
                kj kjVar2 = model12.R;
                title = kjVar2 != null ? kjVar2.a() : null;
                view14.f45242a.i(new kl0.c(a13, r11));
                view14.f45243b.i(new kl0.c(title, r11));
                break;
            case 19:
                k90.k view15 = (k90.k) nVar;
                e90.c model13 = (e90.c) obj;
                Intrinsics.checkNotNullParameter(view15, "view");
                Intrinsics.checkNotNullParameter(model13, "model");
                view15.a0(model13.f57911c, model13.f57910b);
                break;
            case 20:
                k90.g view16 = (k90.g) nVar;
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(view16, "view");
                Intrinsics.checkNotNullParameter(user, "model");
                view16.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                GestaltAvatar gestaltAvatar = view16.f78755f;
                m0.V0(gestaltAvatar, user);
                gestaltAvatar.H2(k90.b.f78717k);
                int i24 = r80.f.pin_detail_attrib_photo_only_author;
                String[] formatArgs = {dl2.b.j1(user)};
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new f0(formatArgs[0]));
                a0.q(view16.f78756g, new k0(i24, arrayList));
                int i25 = w0.plural_followers_string;
                Integer V2 = user.V2();
                Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
                int intValue = V2.intValue();
                String[] formatArgs2 = {String.valueOf(user.V2().intValue())};
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                a0.q(view16.f78757h, new u50.j0(i25, intValue, c0.b0(formatArgs2)));
                e0 e0Var = view16.f78754e;
                e0Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) e0Var.f83334a;
                r11 = (g1Var.o("android_curation_collages_cutout_reporting", "enabled", z3Var) || g1Var.l("android_curation_collages_cutout_reporting")) ? 1 : 0;
                GestaltIconButton gestaltIconButton2 = view16.f78758i;
                if (r11 == 0) {
                    bs1.c.X0(gestaltIconButton2);
                    break;
                } else {
                    bs1.c.U1(gestaltIconButton2);
                    gestaltIconButton2.u(new bp.j(i16, view16, user));
                    break;
                }
                break;
            case 21:
                CreatorHubRecentPinEmptyStateView view17 = (CreatorHubRecentPinEmptyStateView) nVar;
                fd0.f state = (fd0.f) obj;
                Intrinsics.checkNotNullParameter(view17, "view");
                Intrinsics.checkNotNullParameter(state, "model");
                view17.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                view17.f44802a.e(new yb0.b(state, 6));
                if (!view17.f44803b) {
                    state.f61847b.invoke(md0.a.CREATOR_RECENT_PINS_EMPTY_STATE_VIEWED);
                    view17.f44803b = true;
                    break;
                }
                break;
            case 22:
                jd0.j view18 = (jd0.j) nVar;
                fd0.g state2 = (fd0.g) obj;
                Intrinsics.checkNotNullParameter(view18, "view");
                Intrinsics.checkNotNullParameter(state2, "model");
                view18.getClass();
                Intrinsics.checkNotNullParameter(state2, "state");
                if (state2.f61848a) {
                    str3 = view18.getResources().getString(rd0.d.recent_pins_module_title);
                    Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
                    str2 = view18.getResources().getString(rd0.d.recent_pins_module_subtitle);
                    Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                } else {
                    int i26 = rd0.d.recent_pins_module_title;
                    String string2 = view18.getResources().getString(i26);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = view18.getResources().getString(i26);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    str2 = string3;
                    str3 = string2;
                }
                a0.p(view18.f75499a, str3);
                view18.f75500b.i(new gd0.c(str2, 3, state2));
                if (!view18.f75501c) {
                    state2.f61850c.invoke(md0.a.CREATOR_RECENT_PINS_MODULE_VIEWED);
                    view18.f75501c = true;
                    break;
                }
                break;
            case 23:
                ld0.a view19 = (ld0.a) nVar;
                hd0.a state3 = (hd0.a) obj;
                Intrinsics.checkNotNullParameter(view19, "view");
                Intrinsics.checkNotNullParameter(state3, "model");
                view19.getClass();
                Intrinsics.checkNotNullParameter(state3, "state");
                view19.f82950a.C(CollectionsKt.H0(state3.f68845a));
                if (!view19.f82951b) {
                    state3.f68846b.invoke(md0.a.CREATOR_NEWS_MODULE_VIEWED);
                    view19.f82951b = true;
                    break;
                }
                break;
            case 24:
                ld0.d view20 = (ld0.d) nVar;
                fd0.c state4 = (fd0.c) obj;
                Intrinsics.checkNotNullParameter(view20, "view");
                Intrinsics.checkNotNullParameter(state4, "model");
                view20.getClass();
                Intrinsics.checkNotNullParameter(state4, "state");
                view20.f82957b.i(new ld0.b(state4, r11));
                view20.f82958c.H2(new ld0.b(state4, i17));
                view20.f82959d.e(new yb0.b(state4, i15));
                view20.f82960e.C(state4.f61841c);
                if (!view20.f82961f) {
                    state4.f61843e.invoke(md0.a.CREATOR_STATS_MODULE_VIEWED);
                    view20.f82961f = true;
                    break;
                }
                break;
            case 25:
                fd0.a view21 = (fd0.a) nVar;
                hd0.b viewState = (hd0.b) obj;
                Intrinsics.checkNotNullParameter(view21, "view");
                Intrinsics.checkNotNullParameter(viewState, "model");
                ld0.f fVar = (ld0.f) view21;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                List list = fVar.f82963a;
                List list2 = viewState.f68847a;
                Iterator it = list.iterator();
                Iterator it2 = list2.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(g0.q(list, 10), g0.q(list2, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    Object next = it.next();
                    hd0.k toolButtonState = (hd0.k) it2.next();
                    ToolButtonView toolButtonView = (ToolButtonView) next;
                    toolButtonView.getClass();
                    Intrinsics.checkNotNullParameter(toolButtonState, "toolButtonState");
                    int i27 = toolButtonState.f68878a;
                    Context context = toolButtonView.getContext();
                    Object obj2 = d5.a.f53679a;
                    Drawable drawable = context.getDrawable(i27);
                    GestaltIcon gestaltIcon = toolButtonView.f44824b;
                    gestaltIcon.setImageDrawable(drawable);
                    CharSequence charSequence = toolButtonState.f68879b;
                    gestaltIcon.setContentDescription(charSequence);
                    a0.q(toolButtonView.f44825c, bs1.c.h2(charSequence));
                    toolButtonView.f44823a.setOnClickListener(new t0(i16, toolButtonState.f68880c));
                    arrayList2.add(Unit.f80348a);
                }
                if (!fVar.f82964b) {
                    viewState.f68848b.invoke();
                    fVar.f82964b = true;
                    break;
                }
                break;
            case 26:
                qi0.h view22 = (qi0.h) nVar;
                f30 model14 = (f30) obj;
                Intrinsics.checkNotNullParameter(view22, "view");
                Intrinsics.checkNotNullParameter(model14, "model");
                view22.setPin(model14, i13);
                break;
            case 27:
                AdsCarouselPinItemVideoView view23 = (AdsCarouselPinItemVideoView) nVar;
                f30 model15 = (f30) obj;
                Intrinsics.checkNotNullParameter(view23, "view");
                Intrinsics.checkNotNullParameter(model15, "model");
                view23.setPin(model15, i13);
                break;
            case 28:
                SeparatorTitleView view24 = (SeparatorTitleView) nVar;
                vh model16 = (vh) obj;
                Intrinsics.checkNotNullParameter(view24, "view");
                Intrinsics.checkNotNullParameter(model16, "model");
                kj kjVar3 = model16.f42855m;
                title = kjVar3 != null ? kjVar3.b() : null;
                if (title != null) {
                    view24.getClass();
                    Intrinsics.checkNotNullParameter(title, "title");
                    a0.p(view24.f45086a, title);
                    break;
                }
                break;
            default:
                MoreIdeasFeedSectionTitleView view25 = (MoreIdeasFeedSectionTitleView) nVar;
                hl model17 = (hl) obj;
                Intrinsics.checkNotNullParameter(view25, "view");
                Intrinsics.checkNotNullParameter(model17, "model");
                String title2 = model17.s();
                Intrinsics.checkNotNullExpressionValue(title2, "getTitle(...)");
                view25.getClass();
                Intrinsics.checkNotNullParameter(title2, "title");
                a0.q(view25.f45137a, bs1.c.h2(title2));
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f59864a;
        switch (i14) {
            case 0:
                pb2.a model = (pb2.a) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            case 1:
                pb2.k model2 = (pb2.k) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
            case 2:
                pb2.i model3 = (pb2.i) obj;
                Intrinsics.checkNotNullParameter(model3, "model");
                break;
            case 3:
                pb2.l model4 = (pb2.l) obj;
                Intrinsics.checkNotNullParameter(model4, "model");
                break;
            case 4:
                pb2.a model5 = (pb2.a) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model5, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model5, "model");
                        break;
                }
            case 5:
                Intrinsics.checkNotNullParameter((pb2.b) obj, "model");
                break;
            case 6:
                Intrinsics.checkNotNullParameter((pb2.c) obj, "model");
                break;
            case 7:
                pb2.d model6 = (pb2.d) obj;
                Intrinsics.checkNotNullParameter(model6, "model");
                break;
            case 8:
                pb2.j model7 = (pb2.j) obj;
                Intrinsics.checkNotNullParameter(model7, "model");
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                z40.f model8 = (z40.f) obj;
                switch (i14) {
                    case 12:
                        Intrinsics.checkNotNullParameter(model8, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model8, "model");
                        break;
                }
            case 13:
                z40.f model9 = (z40.f) obj;
                switch (i14) {
                    case 12:
                        Intrinsics.checkNotNullParameter(model9, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model9, "model");
                        break;
                }
            case 14:
                z40.n model10 = (z40.n) obj;
                switch (i14) {
                    case 14:
                        Intrinsics.checkNotNullParameter(model10, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model10, "model");
                        break;
                }
            case 15:
                z40.n model11 = (z40.n) obj;
                switch (i14) {
                    case 14:
                        Intrinsics.checkNotNullParameter(model11, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model11, "model");
                        break;
                }
            case 16:
                t60 model12 = (t60) obj;
                switch (i14) {
                    case 16:
                        Intrinsics.checkNotNullParameter(model12, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model12, "model");
                        break;
                }
            case 17:
                t60 model13 = (t60) obj;
                switch (i14) {
                    case 16:
                        Intrinsics.checkNotNullParameter(model13, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model13, "model");
                        break;
                }
            case 18:
                vh model14 = (vh) obj;
                switch (i14) {
                    case 18:
                        Intrinsics.checkNotNullParameter(model14, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model14, "model");
                        kj kjVar = model14.f42855m;
                        if (kjVar != null) {
                            break;
                        }
                        break;
                }
            case 19:
                Intrinsics.checkNotNullParameter((e90.c) obj, "model");
                break;
            case 20:
                Intrinsics.checkNotNullParameter((wy0) obj, "model");
                break;
            case 21:
                Intrinsics.checkNotNullParameter((fd0.f) obj, "model");
                break;
            case 22:
                Intrinsics.checkNotNullParameter((fd0.g) obj, "model");
                break;
            case 23:
                Intrinsics.checkNotNullParameter((hd0.a) obj, "model");
                break;
            case 24:
                Intrinsics.checkNotNullParameter((fd0.c) obj, "model");
                break;
            case 25:
                Intrinsics.checkNotNullParameter((hd0.b) obj, "model");
                break;
            case 26:
                f30 model15 = (f30) obj;
                switch (i14) {
                    case 26:
                        Intrinsics.checkNotNullParameter(model15, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model15, "model");
                        break;
                }
            case 27:
                f30 model16 = (f30) obj;
                switch (i14) {
                    case 26:
                        Intrinsics.checkNotNullParameter(model16, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model16, "model");
                        break;
                }
            case 28:
                vh model17 = (vh) obj;
                switch (i14) {
                    case 18:
                        Intrinsics.checkNotNullParameter(model17, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model17, "model");
                        kj kjVar2 = model17.f42855m;
                        if (kjVar2 != null) {
                            break;
                        }
                        break;
                }
            default:
                Intrinsics.checkNotNullParameter((hl) obj, "model");
                break;
        }
        return null;
    }

    public final void h(s view, pb2.g model) {
        switch (this.f59864a) {
            case 9:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                int i13 = model.f99503a;
                view.getClass();
                break;
            case 10:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                int i14 = model.f99503a;
                view.getClass();
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                int i15 = model.f99503a;
                view.getClass();
                break;
        }
    }

    public final void i(rb2.d view, pb2.a model) {
        switch (this.f59864a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view.a(model.f99499a);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view.a(model.f99499a);
                break;
        }
    }

    public final String j(pb2.g model) {
        switch (this.f59864a) {
            case 9:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return model.getUid();
    }
}
