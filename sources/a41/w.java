package a41;

import com.pinterest.api.model.b30;
import com.pinterest.api.model.k60;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f693i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f694j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(d0 d0Var, int i13) {
        super(0);
        this.f693i = i13;
        this.f694j = d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f693i) {
            case 0:
                m2invoke();
                return Unit.f80348a;
            case 1:
                m2invoke();
                return Unit.f80348a;
            case 2:
                m2invoke();
                return Unit.f80348a;
            case 3:
                m2invoke();
                return Unit.f80348a;
            case 4:
                m2invoke();
                return Unit.f80348a;
            case 5:
                m2invoke();
                return Unit.f80348a;
            case 6:
                m2invoke();
                return Unit.f80348a;
            case 7:
                m2invoke();
                return Unit.f80348a;
            case 8:
                m2invoke();
                return Unit.f80348a;
            case 9:
                m2invoke();
                return Unit.f80348a;
            default:
                d0 d0Var = this.f694j;
                nx.d0 pinalytics = d0Var.getPinalytics();
                HashMap hashMap = new HashMap();
                hashMap.put("pin_id", d0Var.f557b);
                Unit unit = Unit.f80348a;
                return new ok1.f(new nk1.g(pinalytics, null, d0Var.f556a, hashMap, null, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER), d0Var.f565j, null, false, null, 60);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2invoke() {
        wy0 wy0Var;
        wy0 wy0Var2;
        String str;
        b30 F;
        int i13 = 5;
        int i14 = this.f693i;
        d0 d0Var = this.f694j;
        switch (i14) {
            case 0:
                if (d0Var.isBound()) {
                    new b01.c(11, d0Var, d0Var.f556a).invoke();
                    break;
                }
                break;
            case 1:
                d0Var.getPinalytics().X(u0.BOARDS_DISPLAY_OPTIONS_BUTTON);
                if (d0Var.isBound()) {
                    ((r) ((p0) d0Var.getView())).Y4(new ha2.a((List) kh2.b0.m0(d0Var.v3(), d0Var.D, false, true, !d0Var.f558c || ((wy0Var = d0Var.C) != null && Intrinsics.d(wy0Var.L2(), Boolean.TRUE)), false, new x(d0Var, 5), new x(d0Var, 6)), false, (Integer) null, 14));
                    break;
                }
                break;
            case 2:
                d0Var.getPinalytics().X(u0.CREATOR_HUB_ENTRY_POINT);
                d0Var.f566k.d(Navigation.w1((ScreenLocation) i3.f50975i.getValue()));
                break;
            case 3:
                if (d0Var.isBound() && (wy0Var2 = d0Var.C) != null) {
                    v10 Y3 = wy0Var2.Y3();
                    boolean o03 = com.bumptech.glide.d.o0(Y3 != null ? Y3.H() : null);
                    String E = Y3 != null ? Y3.E() : null;
                    String f13 = (Y3 == null || (F = Y3.F()) == null) ? null : F.f();
                    String C = Y3 != null ? Y3.C() : null;
                    k60 J2 = Y3 != null ? Y3.J() : null;
                    if (J2 != null) {
                        List j13 = kotlin.collections.f0.j(J2.N(), J2.H(), J2.J(), J2.M(), J2.G());
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : j13) {
                            String str2 = (String) obj;
                            if (!(str2 == null || str2.length() == 0)) {
                                arrayList.add(obj);
                            }
                        }
                        str = CollectionsKt.Z(arrayList, ", ", null, null, 0, null, null, 62);
                    } else {
                        str = null;
                    }
                    d0Var.getPinalytics().N(f1.TAP, u0.USER_CONTACT_BUTTON, h32.g0.USER_CONTACT, d0Var.f556a, false);
                    p0 p0Var = (p0) d0Var.getView();
                    String uid = wy0Var2.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    ArrayList arrayList2 = new ArrayList();
                    if (o03) {
                        arrayList2.add(new ha2.a0(oz1.e.lego_profile_overflow_message_option_title, 0, null, null, null, null, null, null, null, 1020));
                    }
                    if (C != null) {
                        arrayList2.add(new ha2.a0(nz1.f.business_profile_other_email, 1, null, C, null, null, null, null, null, 1012));
                    }
                    if (E != null && !kotlin.text.z.j(E) && f13 != null && !kotlin.text.z.j(f13)) {
                        arrayList2.add(new ha2.a0(oz1.e.call, 2, null, null, null, null, null, null, null, 1020));
                    }
                    ha2.z zVar = new ha2.z(new ha2.x(x0.contact, null, null, null, null, 30), arrayList2, new aw0.j(d0Var, uid, C, E, 10));
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(zVar);
                    if (str != null && str.length() != 0) {
                        int i15 = nz1.f.business_profile_other_address;
                        arrayList3.add(new ha2.z(new ha2.x(nz1.f.address, null, null, null, null, 30), kotlin.collections.e0.b(new ha2.a0(i15, 3, null, ((yk1.a) d0Var.f567l).f139224a.getString(i15, str), null, null, null, null, null, 1012)), new rx0.f(d0Var, uid, str, 10)));
                    }
                    ((r) p0Var).Y4(new ha2.a((List) arrayList3, false, (Integer) null, 14));
                    break;
                }
                break;
            case 4:
                d0Var.getPinalytics().F(h32.g0.NAVIGATION, u0.SEARCH_BOX_TEXT_INPUT);
                p0 p0Var2 = (p0) d0Var.getViewIfBound();
                if (p0Var2 != null) {
                    NavigationImpl w13 = Navigation.w1(i3.b());
                    w13.y0("VALUE_SEARCH_LIBRARY", "com.pinterest.EXTRA_SEARCH_MODE");
                    Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                    ((r) p0Var2).M1(w13);
                    break;
                }
                break;
            case 5:
                nx.d0 pinalytics = d0Var.getPinalytics();
                u0 u0Var = u0.SEND_BUTTON;
                h32.g0 g0Var = h32.g0.MESSAGE_FLYOUT;
                String str3 = d0Var.f556a;
                pinalytics.b0(u0Var, g0Var, str3, false);
                ig1.b.U0(str3, d0Var.f572q, d0Var.f566k);
                break;
            case 6:
                if (d0Var.isBound()) {
                    d0Var.getPinalytics().X(u0.BACK_BUTTON);
                    r rVar = (r) ((p0) d0Var.getView());
                    rVar.getClass();
                    if (com.bumptech.glide.d.G(rVar, "PROFILE_SHOULD_DISMISS_AS_OVERLAY", false)) {
                        rVar.P7();
                        break;
                    } else {
                        rVar.D5();
                        break;
                    }
                }
                break;
            case 7:
                d0Var.J3();
                break;
            case 8:
                d0Var.K3();
                break;
            default:
                wy0 wy0Var3 = d0Var.C;
                if (wy0Var3 != null) {
                    new y(d0Var, wy0Var3, i13).invoke();
                    break;
                }
                break;
        }
    }
}
