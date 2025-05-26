package we1;

import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gb;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.feature.following.carousel.view.ImpressionableUserRep;
import com.pinterest.ui.imageview.WebImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f2 extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129348a;

    public f2(int i13) {
        this.f129348a = i13;
    }

    private static void h(yk1.n nVar, Object obj) {
        t view = (t) nVar;
        ue1.h model = (ue1.h) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        String url = n10.b.a(model.f122005a);
        view.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        view.f129609c.setVisibility(0);
        view.f129609c.V1(url, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : view.f129607a, (r18 & 64) != 0 ? null : null, null);
        ue1.m mVar = model.f122017m;
        re1.r rVar = mVar != null ? mVar.f122037d : null;
        if (rVar != null) {
            q1 q1Var = view.f129610d;
            q1Var.setVisibility(0);
            q1Var.n(rVar);
            q1Var.setBackgroundResource(r82.c.editorial_card_rounded_bottom_stroke);
        }
        uo0.c listener = model.f122006b;
        Intrinsics.checkNotNullParameter(listener, "listener");
        view.f129608b = listener;
    }

    private static void i(yk1.n nVar, Object obj) {
        k0 view = (k0) nVar;
        ue1.h model = (ue1.h) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        List imageUrls = model.f122005a.h();
        Intrinsics.checkNotNullExpressionValue(imageUrls, "getSmallCoverImageList(...)");
        view.getClass();
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Iterator it = view.f129445a.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            ((WebImageView) next).V1((String) imageUrls.get(i13), (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : view.f129446b, (r18 & 64) != 0 ? null : null, null);
            i13 = i14;
        }
        view.f129448d.setVisibility(0);
        uo0.c listener = model.f122006b;
        Intrinsics.checkNotNullParameter(listener, "listener");
        view.f129447c = listener;
        u50.e eVar = n10.b.f88918a;
        xk xkVar = model.f122005a;
        Intrinsics.checkNotNullParameter(xkVar, "<this>");
        List list = xkVar.f43726r;
        Intrinsics.checkNotNullExpressionValue(list, "getUsers(...)");
        int i15 = 1;
        wy0 user = list.isEmpty() ^ true ? (wy0) xkVar.f43726r.get(0) : null;
        if (user != null) {
            Intrinsics.checkNotNullParameter(user, "merchant");
            ze0.a aVar = ze0.a.List;
            ImpressionableUserRep impressionableUserRep = view.f129449e;
            impressionableUserRep.y1(aVar);
            Context context = impressionableUserRep.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rl1.g baseAvatarViewModel = rl1.n.e(context);
            Boolean s22 = user.s2();
            Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
            yl1.b actionButtonState = kh2.u2.P(kh2.d.s(s22.booleanValue(), c0.d.d2(user)), new yk1.a(impressionableUserRep.getResources(), impressionableUserRep.getContext().getTheme()), true);
            Intrinsics.checkNotNullParameter(impressionableUserRep, "<this>");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(baseAvatarViewModel, "baseAvatarViewModel");
            Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
            impressionableUserRep.H0(rl1.n.c(baseAvatarViewModel, dl2.b.s0(user), dl2.b.M0(user), dl2.b.W1(user) && !user.O3().booleanValue()));
            oa2.t.i4(impressionableUserRep, dl2.b.j1(user), 0, null, 14);
            impressionableUserRep.P0(kh2.u2.Q(user, new yk1.a(impressionableUserRep.getResources(), impressionableUserRep.getContext().getTheme())));
            impressionableUserRep.s1(dl2.b.Z0(user));
            impressionableUserRep.G0(yl1.b.f(actionButtonState, null, false, d7.b.Z(false), null, null, null, null, null, 0, null, 1019));
            impressionableUserRep.M1(vn1.g.UI_400);
            impressionableUserRep.T0(vn1.h.f126278d);
            Boolean O3 = user.O3();
            Intrinsics.checkNotNullExpressionValue(O3, "getIsVerifiedMerchant(...)");
            impressionableUserRep.H1(dl2.b.i1(user), O3.booleanValue() ? sm1.b.ic_check_circle_gestalt : 0, Integer.valueOf(eo1.b.color_blue_500), Integer.valueOf(bs1.c.W(impressionableUserRep, r82.b.shopping_avatar_verified_icon_size_medium)));
            Context context2 = impressionableUserRep.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i16 = pk.a0.q0(context2) ? eo1.a.sema_color_background_transparent : eo1.a.color_background_dark_opacity_100;
            Context context3 = impressionableUserRep.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            impressionableUserRep.f52345e.setColorFilter(dl2.b.x0(context3, i16));
            impressionableUserRep.setPaddingRelative(0, bs1.c.W(impressionableUserRep, eo1.c.margin_half), 0, 0);
            impressionableUserRep.z1(new ld1.f(i15, user));
            view.addView(impressionableUserRep);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0597, code lost:
    
        r2 = kotlin.text.StringsKt__StringsKt.split$default(r2, new java.lang.String[]{","}, false, 0, 6, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x065e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c9  */
    /* JADX WARN: Type inference failed for: r11v32, types: [com.pinterest.gestalt.text.GestaltText] */
    /* JADX WARN: Type inference failed for: r12v10, types: [android.view.View, com.pinterest.gestalt.avatargroup.legacy.AvatarGroup] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object] */
    @Override // vq0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(yk1.n r61, java.lang.Object r62, int r63) {
        /*
            Method dump skipped, instructions count: 3450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we1.f2.c(yk1.n, java.lang.Object, int):void");
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f129348a;
        switch (i14) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                ue1.u model = (ue1.u) obj;
                switch (i14) {
                    case 5:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            case 6:
                ue1.u model2 = (ue1.u) obj;
                switch (i14) {
                    case 5:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                }
            case 7:
                break;
            case 8:
                Intrinsics.checkNotNullParameter((ue1.z) obj, "model");
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                ue1.c0 model3 = (ue1.c0) obj;
                Intrinsics.checkNotNullParameter(model3, "model");
                break;
            case 13:
                break;
            case 14:
                Intrinsics.checkNotNullParameter((gb) obj, "model");
                break;
            case 15:
                xk model4 = (xk) obj;
                Intrinsics.checkNotNullParameter(model4, "model");
                break;
            case 16:
                dl1.s model5 = (dl1.s) obj;
                switch (i14) {
                    case 16:
                        Intrinsics.checkNotNullParameter(model5, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model5, "model");
                        break;
                }
            case 17:
                vh model6 = (vh) obj;
                Intrinsics.checkNotNullParameter(model6, "model");
                kj kjVar = model6.f42856n;
                String a13 = kjVar != null ? kjVar.a() : null;
                if (a13 == null) {
                    a13 = "";
                }
                kj kjVar2 = model6.f42855m;
                String a14 = kjVar2 != null ? kjVar2.a() : null;
                String str = a14 != null ? a14 : "";
                if (!kotlin.text.z.j(a13)) {
                    break;
                }
                break;
            case 18:
                dl1.s model7 = (dl1.s) obj;
                switch (i14) {
                    case 16:
                        Intrinsics.checkNotNullParameter(model7, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model7, "model");
                        break;
                }
            case 19:
                Intrinsics.checkNotNullParameter((f30) obj, "model");
                break;
            case 20:
                s42.f model8 = (s42.f) obj;
                Intrinsics.checkNotNullParameter(model8, "model");
                String str2 = model8.f111144b;
                if (str2 != null && !kotlin.text.z.j(str2)) {
                    break;
                } else {
                    break;
                }
                break;
            case 21:
                Intrinsics.checkNotNullParameter((ha2.o) obj, "model");
                break;
            case 22:
                Intrinsics.checkNotNullParameter((ha2.t) obj, "model");
                break;
            case 23:
                pb2.h model9 = (pb2.h) obj;
                Intrinsics.checkNotNullParameter(model9, "model");
                break;
            case 24:
                Intrinsics.checkNotNullParameter((pb2.e) obj, "model");
                break;
            case 25:
                Intrinsics.checkNotNullParameter((pb2.m) obj, "model");
                break;
            case 26:
                Intrinsics.checkNotNullParameter((pb2.a) obj, "model");
                break;
            case 27:
                Intrinsics.checkNotNullParameter((pb2.b) obj, "model");
                break;
            case 28:
                Intrinsics.checkNotNullParameter((pb2.c) obj, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter((pb2.n) obj, "model");
                break;
        }
        return null;
    }

    public final String j(ue1.h model) {
        switch (this.f129348a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 5:
            case 6:
            case 8:
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return model.f122011g;
    }
}
