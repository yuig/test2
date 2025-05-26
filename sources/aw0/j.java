package aw0;

import a41.p0;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.ek;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fr;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import com.pinterest.feature.newshub.feed.view.NewsHubFeedItemBaseView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.s2;
import ed1.f0;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jk2.x;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import nx.d0;
import p91.y;
import qf1.i0;
import x02.c2;
import x02.z0;
import x40.tc;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20559i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20560j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f20561k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f20562l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f20563m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f30 f30Var, i0 i0Var, List list, String str) {
        super(1);
        this.f20559i = 19;
        this.f20561k = f30Var;
        this.f20562l = i0Var;
        this.f20560j = list;
        this.f20563m = str;
    }

    public final void b(int i13) {
        Object obj;
        String emailAddress;
        int i14 = this.f20559i;
        Object obj2 = this.f20562l;
        Object obj3 = this.f20563m;
        final int i15 = 1;
        Object obj4 = this.f20560j;
        Object obj5 = this.f20561k;
        switch (i14) {
            case 1:
                final px0.j jVar = (px0.j) obj5;
                dl1.s sVar = (dl1.s) obj2;
                final Integer num = (Integer) ((j0) obj3).f80434a;
                List list = (List) obj4;
                if (jVar.isBound()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((ox0.a) obj).f97980a.ordinal() == i13) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ox0.a aVar = (ox0.a) obj;
                    Pair pair = aVar != null ? new Pair(aVar.f97981b, aVar.f97982c) : new Pair(null, null);
                    final String str = (String) pair.f80346a;
                    String str2 = (String) pair.f80347b;
                    ((NewsHubFeedItemBaseView) ((mx0.b) jVar.getView())).x2();
                    int ordinal = ox0.b.UnfollowUserAction.ordinal();
                    uo.a aVar2 = jVar.f101618c;
                    d0 d0Var = jVar.f101616a;
                    if (i13 != ordinal && i13 != ox0.b.UnfollowPinAction.ordinal()) {
                        if (i13 != ox0.b.FollowUserAction.ordinal() && i13 != ox0.b.FollowPinAction.ordinal()) {
                            if (i13 != ox0.b.ViewNotificationSettings.ordinal()) {
                                int ordinal2 = ox0.b.DeleteNewsHubItem.ordinal();
                                w12.b bVar = jVar.f101617b;
                                if (i13 != ordinal2) {
                                    if ((i13 == ox0.b.SeeLessAboutInterest1.ordinal() || i13 == ox0.b.SeeLessAboutInterest2.ordinal()) && str2 != null) {
                                        qx qxVar = jVar.f101619d;
                                        String id3 = qxVar != null ? qxVar.getId() : null;
                                        if (id3 != null) {
                                            d0Var.X(u0.NEWS_HUB_UNSUB_OR_RESUB_FROM_OBJECT_BUTTON);
                                            ek2.f i16 = bVar.d(id3, str2).l(tk2.e.f118017c).h(wj2.c.a()).i(new px0.b(num, jVar, id3, str2, 0), new hx0.a(6, px0.d.f101586j));
                                            Intrinsics.checkNotNullExpressionValue(i16, "subscribe(...)");
                                            jVar.addDisposable(i16);
                                            break;
                                        }
                                    }
                                } else {
                                    qx qxVar2 = jVar.f101619d;
                                    String id4 = qxVar2 != null ? qxVar2.getId() : null;
                                    if (id4 != null) {
                                        ek2.f i17 = bVar.b(e0.b(id4), true).l(tk2.e.f118017c).h(wj2.c.a()).i(new fp.a(15, jVar, id4), new hx0.a(5, px0.d.f101590n));
                                        Intrinsics.checkNotNullExpressionValue(i17, "subscribe(...)");
                                        jVar.addDisposable(i17);
                                        d0Var.X(u0.NEWS_HUB_HIDE_ITEM_BUTTON);
                                        break;
                                    }
                                }
                            } else {
                                ((NewsHubFeedItemBaseView) ((mx0.b) jVar.getView())).a().d(Navigation.w1((ScreenLocation) s2.f51350i.getValue()));
                                d0Var.X(u0.NEWS_HUB_VIEW_SETTINGS_BUTTON);
                                break;
                            }
                        } else {
                            xj2.c o13 = aVar2.c(null, sVar != null ? sVar.getId() : null).r(tk2.e.f118017c).l(wj2.c.a()).o(new ak2.e() { // from class: px0.a
                                @Override // ak2.e
                                public final void accept(Object obj6) {
                                    int i18 = i15;
                                    String str3 = str;
                                    Integer num2 = num;
                                    j this$0 = jVar;
                                    switch (i18) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            if (this$0.isBound()) {
                                                ((NewsHubFeedItemBaseView) ((mx0.b) this$0.getView())).f46815p = false;
                                                if (num2 != null) {
                                                    this$0.f101622g.l(num2.intValue(), str3 != null ? str3 : "");
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            if (this$0.isBound()) {
                                                ((NewsHubFeedItemBaseView) ((mx0.b) this$0.getView())).f46815p = true;
                                                if (num2 != null) {
                                                    this$0.f101622g.l(num2.intValue(), str3 != null ? str3 : "");
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, new hx0.a(4, px0.d.f101588l));
                            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                            jVar.addDisposable(o13);
                            d0Var.X(u0.NEWS_HUB_UNSUB_OR_RESUB_FROM_OBJECT_BUTTON);
                            break;
                        }
                    } else {
                        final int i18 = 0;
                        xj2.c o14 = aVar2.c(sVar != null ? sVar.getId() : null, null).r(tk2.e.f118017c).l(wj2.c.a()).o(new ak2.e() { // from class: px0.a
                            @Override // ak2.e
                            public final void accept(Object obj6) {
                                int i182 = i18;
                                String str3 = str;
                                Integer num2 = num;
                                j this$0 = jVar;
                                switch (i182) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        if (this$0.isBound()) {
                                            ((NewsHubFeedItemBaseView) ((mx0.b) this$0.getView())).f46815p = false;
                                            if (num2 != null) {
                                                this$0.f101622g.l(num2.intValue(), str3 != null ? str3 : "");
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        if (this$0.isBound()) {
                                            ((NewsHubFeedItemBaseView) ((mx0.b) this$0.getView())).f46815p = true;
                                            if (num2 != null) {
                                                this$0.f101622g.l(num2.intValue(), str3 != null ? str3 : "");
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }, new hx0.a(3, px0.d.f101587k));
                        Intrinsics.checkNotNullExpressionValue(o14, "subscribe(...)");
                        jVar.addDisposable(o14);
                        d0Var.X(u0.NEWS_HUB_UNSUB_OR_RESUB_FROM_OBJECT_BUTTON);
                        break;
                    }
                }
                break;
            default:
                a41.d0 d0Var2 = (a41.d0) obj5;
                ((a41.r) ((p0) d0Var2.getView())).x2();
                if (i13 == 0) {
                    String str3 = (String) obj4;
                    a41.d0.p3(d0Var2, u0.USER_MESSAGE_OPTION, str3);
                    ig1.b.U0(str3, d0Var2.f572q, d0Var2.f566k);
                    break;
                } else {
                    if (i13 == 1) {
                        a41.d0.p3(d0Var2, u0.USER_EMAIL_OPTION, (String) obj4);
                        p0 p0Var = (p0) d0Var2.getView();
                        String str4 = (String) obj2;
                        emailAddress = str4 != null ? str4 : "";
                        a41.r rVar = (a41.r) p0Var;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("mailto:"));
                        intent.putExtra("android.intent.extra.EMAIL", new String[]{emailAddress});
                        if (intent.resolveActivity(rVar.requireContext().getPackageManager()) != null) {
                            rVar.startActivity(intent);
                            break;
                        }
                    } else if (i13 == 2) {
                        a41.d0.p3(d0Var2, u0.USER_PHONE_OPTION, (String) obj4);
                        p0 p0Var2 = (p0) d0Var2.getView();
                        String str5 = (String) obj3;
                        emailAddress = str5 != null ? str5 : "";
                        a41.r rVar2 = (a41.r) p0Var2;
                        rVar2.getClass();
                        Intrinsics.checkNotNullParameter(emailAddress, "phoneNumber");
                        Intent intent2 = new Intent("android.intent.action.DIAL");
                        intent2.setData(Uri.parse("tel:".concat(emailAddress)));
                        if (intent2.resolveActivity(rVar2.requireContext().getPackageManager()) != null) {
                            rVar2.startActivity(intent2);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public final void e(v7 v7Var) {
        Unit unit;
        int i13 = this.f20559i;
        int i14 = 1;
        Object obj = this.f20560j;
        Object obj2 = this.f20563m;
        Object obj3 = this.f20561k;
        switch (i13) {
            case 3:
                f30 f30Var = (f30) obj3;
                if (f30Var.s6() != null || ((c2) obj).f131310o == null) {
                    e30 R6 = f30Var.R6();
                    R6.C1(v7Var);
                    R6.x1(((f30) obj2).getId());
                    Integer num = R6.f37141r2;
                    R6.U1(num != null ? Integer.valueOf(num.intValue() + 1) : null);
                    f30 a13 = R6.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    ((com.pinterest.feature.pin.j) this.f20562l).f47231e.W(a13);
                    break;
                }
                break;
            default:
                if (((String) obj3) != null) {
                    da1.c cVar = (da1.c) obj;
                    u50.r rVar = (u50.r) obj2;
                    Intrinsics.f(v7Var);
                    String str = ((e82.f) cVar.f54230c).f57836f;
                    if (str != null) {
                        ((xj2.b) cVar.f54231d).a(((z0) cVar.f54233f).L(str).H(tk2.e.f118017c).A(wj2.c.a()).F(new y(18, new da1.b(rVar, v7Var, 0)), new y(19, new da1.b(rVar, v7Var, i14)), ck2.i.f27923c, ck2.i.f27924d));
                    }
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ((u50.r) obj2).a(new ca1.b(v7Var.j1(), v7Var.b1(), null));
                    break;
                }
                break;
        }
    }

    public final void f(f30 f30Var) {
        String str;
        int i13 = this.f20559i;
        Object obj = this.f20563m;
        Object obj2 = this.f20562l;
        Object obj3 = this.f20560j;
        Object obj4 = this.f20561k;
        switch (i13) {
            case 4:
                com.pinterest.feature.pin.j jVar = (com.pinterest.feature.pin.j) obj4;
                new x(jVar.f47232f.P(b40.i(f30Var)), new fp.a(18, (ak2.e) obj3, f30Var), 1).F(new com.pinterest.feature.pin.i(1, new j((f30) obj2, (c2) obj, jVar, f30Var, 3)), new com.pinterest.feature.pin.i(2, com.pinterest.feature.pin.c.f46923k), ck2.i.f27923c, ck2.i.f27924d);
                break;
            case 16:
                ed1.q qVar = (ed1.q) obj4;
                qVar.K = f30Var;
                Intrinsics.f(f30Var);
                String b13 = qVar.f58698z.b(f30Var);
                v0 v0Var = new v0();
                v0Var.G = b13;
                ((j0) obj3).f80434a = v0Var;
                qVar.f58674b.h0((r18 & 1) != 0 ? f1.TAP : f1.SEND_SHARE_OPEN, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : (g0) obj2, (r18 & 8) != 0 ? null : qVar.f58677e.d(), (r18 & 32) != 0 ? null : (HashMap) obj, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
            case 17:
                f0 f0Var = (f0) obj4;
                f0Var.I = f30Var;
                Intrinsics.f(f30Var);
                String b14 = f0Var.f58604y.b(f30Var);
                v0 v0Var2 = new v0();
                v0Var2.G = b14;
                ((j0) obj3).f80434a = v0Var2;
                f0Var.f58581b.h0((r18 & 1) != 0 ? f1.TAP : f1.SEND_SHARE_OPEN, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : (g0) obj2, (r18 & 8) != 0 ? null : f0Var.f58583d.d(), (r18 & 32) != 0 ? null : (HashMap) obj, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var2 : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
            default:
                pe1.r rVar = (pe1.r) obj4;
                f30 f30Var2 = (f30) obj3;
                v7 G5 = f30Var.G5();
                if (G5 == null || (str = G5.getId()) == null) {
                    str = (String) obj2;
                }
                Intrinsics.f(str);
                pe1.r.i0(rVar, f30Var2, str);
                gb2.d dVar = (gb2.d) obj;
                LinkedHashMap linkedHashMap = rVar.Q;
                hd1.e eVar = (hd1.e) linkedHashMap.get(f30Var2.getId());
                if (eVar != null) {
                    eVar.f68912c = f30Var.getId();
                }
                if (eVar == null) {
                    String id3 = f30Var2.getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    eVar = new hd1.e(id3, dVar, f30Var.getId());
                }
                String id4 = f30Var2.getId();
                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                linkedHashMap.put(id4, eVar);
                break;
        }
    }

    public final void h(List it) {
        int i13 = this.f20559i;
        Object obj = this.f20563m;
        Object obj2 = this.f20562l;
        Object obj3 = this.f20560j;
        Object obj4 = this.f20561k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                List list = (List) obj3;
                qq qqVar = (qq) obj2;
                RectF rectF = (RectF) obj;
                Pair y13 = ((IdeaPinVideoExportWorker) obj4).y(qqVar);
                ek ekVar = (ek) y13.f80346a;
                vk vkVar = (vk) y13.f80347b;
                Matrix matrix = qqVar.getConfig().getMatrix();
                if (matrix == null) {
                    matrix = new Matrix();
                }
                long j13 = 1000;
                list.add(new fr(it, matrix, rectF.width(), rectF.height(), qqVar.getDurationConfig().getStartTimeMs() * j13, qqVar.getDurationConfig().getEndTimeMs() * j13, ekVar, vkVar));
                break;
            default:
                z40.d dVar = (z40.d) obj4;
                z40.e eVar = (z40.e) obj3;
                kl2.n nVar = (kl2.n) obj2;
                z40.f fVar = (z40.f) obj;
                if (dVar != null && eVar != null) {
                    Intrinsics.f(it);
                    tc tcVar = (tc) eVar;
                    String str = tcVar.f133373n;
                    String str2 = str == null ? "" : str;
                    String str3 = tcVar.f133374o;
                    nVar.p(it, dVar, fVar, str2, str3 == null ? "" : str3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0328  */
    /* JADX WARN: Type inference failed for: r14v31, types: [df.j] */
    /* JADX WARN: Type inference failed for: r2v146, types: [com.facebook.login.t] */
    /* JADX WARN: Type inference failed for: r2v69, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v45, types: [vr.b] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 3132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aw0.j.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(1);
        this.f20559i = i13;
        this.f20561k = obj;
        this.f20560j = obj2;
        this.f20562l = obj3;
        this.f20563m = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(px0.j jVar, dl1.s sVar, j0 j0Var, ArrayList arrayList) {
        super(1);
        this.f20559i = 1;
        this.f20561k = jVar;
        this.f20562l = sVar;
        this.f20563m = j0Var;
        this.f20560j = arrayList;
    }
}
