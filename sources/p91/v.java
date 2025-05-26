package p91;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.account.view.AccountConversionView;
import com.pinterest.feature.settings.shared.view.SettingsEducationTooltip;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import et1.q0;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import ht1.i0;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.e4;
import lh0.g1;
import lh0.z3;
import nx.d0;
import so.ba;
import so.y6;
import va1.u0;
import x02.x2;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99330i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f99331j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f99332k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13, Object obj, Object obj2) {
        super(0);
        this.f99330i = i13;
        this.f99331j = obj;
        this.f99332k = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Constructor<?>[] constructors;
        Constructor<?> constructor;
        int i13 = this.f99330i;
        Object obj = this.f99332k;
        Object obj2 = this.f99331j;
        switch (i13) {
            case 0:
                m231invoke();
                return Unit.f80348a;
            case 1:
                m231invoke();
                return Unit.f80348a;
            case 2:
                m231invoke();
                return Unit.f80348a;
            case 3:
                m231invoke();
                return Unit.f80348a;
            case 4:
                m231invoke();
                return Unit.f80348a;
            case 5:
                m231invoke();
                return Unit.f80348a;
            case 6:
                wa1.k kVar = (wa1.k) obj2;
                x2 x2Var = kVar.f128653d;
                Object obj3 = ((lb2.n) kVar.f128654e).f82783a.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                boolean z13 = com.bumptech.glide.c.a0((UserDeserializer) obj3).size() > 1;
                d0 d0Var = ((uk1.d) obj).f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                return new va1.w(x2Var, z13, kVar.f128658i, kVar.f128660k, kVar.f128655f, d0Var, kVar.f128651b, kVar.f128652c, kVar.f128661l, kVar.f128662m, kVar.f128663n, kVar.f128664o);
            case 7:
                m231invoke();
                return Unit.f80348a;
            case 8:
                m231invoke();
                return Unit.f80348a;
            case 9:
                m231invoke();
                return Unit.f80348a;
            case 10:
                return new lc1.a((Context) obj, new hc1.d(2, (hc1.e) obj2, hc1.e.class, "handleSelected", "handleSelected(Ljava/lang/String;Ljava/lang/String;)V", 0));
            case 11:
                m231invoke();
                return Unit.f80348a;
            case 12:
                m231invoke();
                return Unit.f80348a;
            case 13:
                SettingsEducationTooltip settingsEducationTooltip = (SettingsEducationTooltip) obj2;
                Resources resources = settingsEducationTooltip.getResources();
                Context context = (Context) obj;
                int i14 = eo1.b.color_icon_info;
                Object obj4 = d5.a.f53679a;
                int color = context.getColor(i14);
                Resources resources2 = settingsEducationTooltip.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                ve0.q qVar = new ve0.q(resources, color, j1.f0(resources2));
                int i15 = settingsEducationTooltip.f48333f;
                qVar.e(context, i15, i15, i15, i15);
                qVar.c(ve0.b.TOP_CENTER);
                return qVar;
            case 14:
                m231invoke();
                return Unit.f80348a;
            case 15:
                pe1.g gVar = (pe1.g) obj2;
                uk1.d dVar = gVar.f99944f0;
                com.pinterest.feature.pin.j jVar = gVar.f99939a0.f68906w;
                Intrinsics.f(jVar);
                oj0.b bVar = oj0.b.f95357d;
                bVar.f95360c.put("is_saved_to_wishlist", "true");
                Unit unit = Unit.f80348a;
                oj0.a aVar = (oj0.a) gVar.f99949k0.getValue();
                d0 d0Var2 = gVar.f99944f0.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                return new oj0.g(dVar, gVar.f99940b0, gVar.f99942d0, gVar.f99943e0, gVar.f99941c0, jVar, bVar, aVar, ((y6) gVar.f99946h0).a(d0Var2), gVar.f99945g0, (nx.b0) obj);
            case 16:
                sd1.a aVar2 = (sd1.a) obj2;
                return new rd1.b(aVar2.w3(), (String) aVar2.f112313m, (x2) obj, new i1.h(aVar2, 29), aVar2.f112311k);
            case 17:
                m231invoke();
                return Unit.f80348a;
            case 18:
                m231invoke();
                return Unit.f80348a;
            case 19:
                jg1.a aVar3 = (jg1.a) obj;
                i0 c13 = ((jg1.q) obj2).c(aVar3.f75898b, aVar3.f75899c, aVar3.f75901e, aVar3.f75902f, aVar3.f75903g, aVar3.f75900d);
                Intrinsics.f(c13);
                return c13;
            case 20:
                m231invoke();
                return Unit.f80348a;
            case 21:
                com.pinterest.feature.todaytab.tab.view.e eVar = (com.pinterest.feature.todaytab.tab.view.e) obj2;
                ni1.d0 d0Var3 = eVar.f48722k;
                if (d0Var3 == null) {
                    Intrinsics.r("pinModelToVMStateConverterFactory");
                    throw null;
                }
                d0 d0Var4 = (d0) obj;
                int i16 = 3;
                return ((ba) d0Var3).a(eVar.f48719h, new sp.e(d0Var4, i16), new sp.f(d0Var4, i16));
            case 22:
                m231invoke();
                return Unit.f80348a;
            case 23:
                m231invoke();
                return Unit.f80348a;
            case 24:
                Context context2 = ((ji1.g) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new ji1.c(context2, (d0) obj);
            case 25:
                Context context3 = ((View) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new va2.d(context3, (hs1.q) obj);
            case 26:
                ScreenDescription screenDescription = (ScreenDescription) obj;
                ((il1.b) obj2).f72556b.h("NOT Instantiating " + screenDescription.getScreenClass().getName() + " with Factory");
                Class screenClass = screenDescription.getScreenClass();
                if (View.class.isAssignableFrom(screenClass)) {
                    screenClass = null;
                }
                if (screenClass == null || (constructors = screenClass.getConstructors()) == null) {
                    return null;
                }
                int length = constructors.length;
                int i17 = 0;
                while (true) {
                    if (i17 < length) {
                        constructor = constructors[i17];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length != 0) {
                            i17++;
                        }
                    } else {
                        constructor = null;
                    }
                }
                if (constructor != null) {
                    return constructor.newInstance(new Object[0]);
                }
                return null;
            case 27:
                return new sl1.o((List) obj2, ((GestaltAvatarGroup) obj).getId());
            case 28:
                tp1.e eVar2 = (tp1.e) obj2;
                uk1.d c14 = uk1.e.c(eVar2.f118788f, eVar2);
                uj2.q qVar2 = eVar2.f118789g;
                if (qVar2 != null) {
                    return new xp0.d(c14, qVar2, eVar2, eVar2.f118792j, new vt1.a(), false, 22, 64);
                }
                Intrinsics.r("networkStateStream");
                throw null;
            default:
                m231invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m231invoke() {
        yb0.n a13;
        vg1.a aVar;
        int i13 = this.f99330i;
        int i14 = 1;
        int i15 = 0;
        Object obj = this.f99332k;
        Object obj2 = this.f99331j;
        switch (i13) {
            case 0:
                w.F3((w) obj2, (wy0) obj, true, null, true, 4);
                return;
            case 1:
                ((View.OnClickListener) obj2).onClick(((AccountConversionView) obj).f48125h);
                return;
            case 2:
                d0.B((d0) obj2, f1.UNIDIRECTIONAL_PASSCODE_ACKNOWLEDGED, null, null, null, 30);
                ((Function0) obj).invoke();
                return;
            case 3:
                ma1.n nVar = (ma1.n) obj2;
                int i16 = ma1.n.K0;
                nVar.b9().f86823g.e().a(ma1.e.f86781a);
                h32.i0 i0Var = new h32.i0(d4.SETTINGS, a4.CONFIRM_REVOKE_SESSION, null, null, null, null);
                m60.w f73 = nVar.f7();
                int i17 = yb0.n.f138503p;
                Context requireContext = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String string = nVar.requireContext().getString(l52.c.settings_security_connected_devices_revoke_session);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = nVar.requireContext().getString(l52.c.settings_security_connected_devices_revoke_session_confirmation);
                String string3 = nVar.requireContext().getString(l52.c.settings_security_connected_devices_revoke_session);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = nVar.requireContext().getString(l52.c.settings_security_connected_devices_revoke_session_cancel);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                a13 = xa0.j.a(requireContext, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new px0.g((ma1.p) obj, nVar, i0Var, 8), (r20 & 64) != 0 ? yb0.k.f138492k : new ma1.l(nVar, i0Var, i15), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : new ma1.l(nVar, i0Var, i14), (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
                f73.d(new yb0.e(a13));
                return;
            case 4:
                va1.w wVar = (va1.w) obj2;
                wy0 wy0Var = ((u0) obj).f125248a;
                wVar.f125262p.X(h32.u0.VIEW_PROFILE_BUTTON);
                r41.k kVar = r41.k.f106176a;
                String uid = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                NavigationImpl c13 = r41.k.c(kVar, uid, null, null, null, 30);
                c13.z(r41.i.Public.ordinal(), "PROFILE_VIEWING_MODE");
                wVar.f125261o.d(c13);
                return;
            case 5:
                wa1.k kVar2 = (wa1.k) obj2;
                d0 pinalytics = kVar2.getPinalytics();
                g0 g0Var = g0.ADD_ACCOUNT_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("group_id", a60.a.b());
                hashMap.put("group_count", String.valueOf(a60.a.a(null).getAll().size()));
                d0.B(pinalytics, null, g0Var, null, hashMap, 21);
                va1.f1 f1Var = (va1.f1) obj;
                kVar2.f128655f.d(Navigation.L(f1Var.j(), "", f1Var.c()));
                return;
            case 6:
            case 10:
            case 13:
            case 15:
            case 16:
            case 19:
            case 21:
            default:
                ((q0) obj2).f60082c.remove((mt1.a) obj);
                return;
            case 7:
                com.pinterest.feature.settings.menu.a aVar2 = ((xa1.l) obj2).H0;
                if (aVar2 != null) {
                    mr1.h userAccount = (mr1.h) obj;
                    wa1.k kVar3 = (wa1.k) aVar2;
                    Intrinsics.checkNotNullParameter(userAccount, "userAccount");
                    xj2.c o13 = new kk2.h(new kk2.g(new kk2.g(new kk2.g(new kk2.m(kVar3.f128650a.I5(), new t81.a(20, new wa1.j(kVar3, userAccount, i15)), 0).l(wj2.c.a()), new ta1.c(1, new wa1.j(kVar3, userAccount, i14)), 2), new ta1.c(2, new wa1.j(kVar3, userAccount, 2)), 3), new ta1.c(3, new wa1.j(kVar3, userAccount, 3)), 1), new g51.h(kVar3, 5), 1).o(new ta1.c(4, new wa1.j(kVar3, userAccount, 4)), new ta1.c(5, new wa1.i(kVar3, i14)));
                    Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                    kVar3.addDisposable(o13);
                    return;
                }
                return;
            case 8:
                ((u50.r) obj2).a(new com.pinterest.feature.settings.notifications.y(((com.pinterest.feature.settings.notifications.b) obj).f48163a));
                return;
            case 9:
                gb1.o oVar = (gb1.o) obj2;
                gb1.m mVar = (gb1.m) obj;
                int i18 = gb1.o.f64714r;
                oVar.getClass();
                m60.u.f85943a.d(new jc0.v(new gb1.x(oVar.f64717e ? c52.e.you_wont_get_any_more_push_notifications_from_pinterest : c52.e.you_wont_get_any_more_emails_from_pinterest, mVar), false, 0L, 30));
                return;
            case 11:
                c2 c2Var = ((hc1.n) obj2).E0;
                if (c2Var != null) {
                    c2Var.q(y32.f.PROFILE.value(), (wy0) obj);
                    return;
                } else {
                    Intrinsics.r("sharesheetUtils");
                    throw null;
                }
            case 12:
                int i19 = kc1.d0.L0;
                ((kc1.d0) obj2).b9().f79161e.e().a(new kc1.q((String) obj));
                return;
            case 14:
                id1.g gVar = (id1.g) obj2;
                wy0 user = (wy0) obj;
                d0.B(gVar.getPinalytics(), f1.TAP, null, user.getUid(), null, 26);
                id1.d loggingData = new id1.d(gVar);
                Intrinsics.checkNotNullParameter(loggingData, "loggingData");
                Intrinsics.checkNotNullParameter(user, "user");
                HashMap Y = c0.d.Y(loggingData.e(), null, null, loggingData, null, null);
                c0.d.G2(user, Y);
                String uid2 = user.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                ((jd1.d) ((gd1.c) gVar.getView())).O5(c0.d.j0(uid2, null), Y);
                return;
            case 17:
                qf1.i0 i0Var2 = (qf1.i0) obj2;
                e02.a.b(i0Var2.f103704o, (f30) obj, true, i0Var2.f103699j, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                return;
            case 18:
                jg1.d dVar = (jg1.d) obj2;
                jg1.g gVar2 = dVar.f75956b;
                if (gVar2 != null) {
                    gVar2.a();
                }
                jg1.g gVar3 = (jg1.g) ((Function0) obj).invoke();
                dVar.f75956b = gVar3;
                gVar3.f();
                return;
            case 20:
                ug1.k kVar4 = ((wg1.z) obj2).A;
                if (kVar4 != null) {
                    f30 pin = (f30) obj;
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    e4 e4Var = kVar4.f122201e;
                    e4Var.getClass();
                    z3 z3Var = lh0.a4.f83298b;
                    g1 g1Var = (g1) e4Var.f83339a;
                    if ((g1Var.o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || g1Var.l("android_ads_mrc_btr_1px1s")) && (aVar = kVar4.f122200d) != null) {
                        ps0.y yVar = ro1.c.f108967f;
                        ur.b bVar = (ur.b) kVar4.f122208l;
                        aVar.f125787c = yVar.i(pin, bVar.f123060c, bVar.f123058a);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ((qh1.e) obj2).f103900a.d((Navigation) obj);
                return;
            case 23:
                bi1.p pVar = (bi1.p) obj2;
                e02.a aVar3 = pVar.f22873f0;
                if (aVar3 != null) {
                    f30 f30Var = (f30) obj;
                    il1.a aVar4 = pVar.f22874g0;
                    if (aVar4 != null) {
                        e02.a.b(aVar3, f30Var, false, aVar4, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                        return;
                    } else {
                        Intrinsics.r("fragmentFactory");
                        throw null;
                    }
                }
                Intrinsics.r("boardRouter");
                throw null;
        }
    }
}
