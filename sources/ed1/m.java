package ed1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import bk1.a2;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.UploadStatus;
import com.pinterest.api.model.al0;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bp;
import com.pinterest.api.model.co0;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fo0;
import com.pinterest.api.model.kv;
import com.pinterest.api.model.ly0;
import com.pinterest.api.model.oo0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.s30;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wo0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import com.pinterest.api.model.zk0;
import com.pinterest.api.model.zq0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.comment.reactions.view.CommentReactionIndicator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.unifiedcomments.view.CommunityInsightHeaderView;
import com.pinterest.feature.unifiedcomments.view.PinCommentReactionHeaderView;
import com.pinterest.feature.video.worker.StatusMediaWorker;
import com.pinterest.feature.video.worker.VideoPinCreateMediaWorker;
import com.pinterest.feature.video.worker.base.BaseMediaWorker;
import com.pinterest.gestalt.banner.GestaltBanner;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.video.core.view.PinterestVideoView;
import gk1.w0;
import h32.c1;
import h32.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import ni1.x1;
import rf1.p0;
import v.f1;
import z32.n1;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58662i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f58663j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f58664k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f58665l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f58662i = i13;
        this.f58663j = obj;
        this.f58664k = obj2;
        this.f58665l = obj3;
    }

    public final rn1.a b(rn1.a it) {
        vn1.g gVar;
        int i13 = this.f58662i;
        Object obj = this.f58663j;
        Object obj2 = this.f58665l;
        Object obj3 = this.f58664k;
        switch (i13) {
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = ((String) obj) + " " + ((String) obj3);
                Intrinsics.checkNotNullParameter(string, "string");
                u50.f0 f0Var = new u50.f0(string);
                CommunityInsightHeaderView communityInsightHeaderView = (CommunityInsightHeaderView) obj2;
                Context context = communityInsightHeaderView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (dl2.b.T1(context)) {
                    gVar = it.f108853k;
                } else {
                    Context context2 = communityInsightHeaderView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    gVar = pk.a0.s(context2);
                }
                return rn1.a.y(it, f0Var, null, null, null, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.f0 h23 = bs1.c.h2((String) obj);
                String string2 = ((PinCommentReactionHeaderView) obj3).getResources().getString(ob2.f.content_description_reaction_count, (String) obj2);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return rn1.a.y(it, h23, null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.h2(string2), null, null, null, null, false, null, null, 2093054);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, (u50.i0) ((kotlin.jvm.internal.j0) obj3).f80434a, ((GestaltListAction) obj2).N ? vn1.c.DEFAULT : vn1.c.SUBTLE, null, null, vn1.g.BODY_100, 2, null, rn1.b.END, null, null, ((kotlin.jvm.internal.f0) obj).f80424a, ho1.b.list_action_end_text, null, null, null, null, null, false, null, null, 2093900);
        }
    }

    public final void e(z2 z2Var) {
        f30 f30Var;
        String f39332b;
        Object cVar;
        int i13 = this.f58662i;
        Object obj = this.f58665l;
        Object obj2 = this.f58664k;
        Object obj3 = this.f58663j;
        switch (i13) {
            case 8:
                rf1.o oVar = (rf1.o) obj3;
                Intrinsics.f(z2Var);
                rp0.b bVar = new rp0.b(z2Var);
                zk0 blockStyle = (zk0) obj2;
                Intrinsics.checkNotNullExpressionValue(blockStyle, "$blockStyle");
                bp bpVar = (bp) obj;
                rf1.p pVar = oVar.f107795b;
                if (pVar.isBound()) {
                    wo0 wo0Var = pVar.f107820r;
                    f30 f30Var2 = wo0Var.f43312c;
                    if ((f30Var2 == null || !Intrinsics.d(f30Var2.k5(), Boolean.TRUE)) && (f30Var = wo0Var.f43312c) != null && (f39332b = f30Var.getF39332b()) != null) {
                        pVar.f107807e.L(f39332b).F(new rf1.j(8, new ja.a(pVar, blockStyle, bpVar, oVar.f107797d, bVar, 6)), new rf1.j(9, rf1.l.f107766j), ck2.i.f27923c, ck2.i.f27924d);
                        break;
                    }
                }
                break;
            default:
                Function2 function2 = (Function2) obj3;
                if (Intrinsics.d(((mh1.d) obj2).E, "aggregatedcomment")) {
                    dl1.s sVar = (dl1.s) obj;
                    Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.AggregatedComment");
                    cVar = new rp0.b((z2) sVar);
                } else {
                    dl1.s sVar2 = (dl1.s) obj;
                    Intrinsics.g(sVar2, "null cannot be cast to non-null type com.pinterest.api.model.UserDidItData");
                    cVar = new rp0.c((az0) sVar2);
                }
                Intrinsics.f(z2Var);
                function2.invoke(cVar, z2Var);
                break;
        }
    }

    public final void f(v7 v7Var) {
        Object obj;
        Object obj2;
        int i13 = this.f58662i;
        Object obj3 = this.f58665l;
        Object obj4 = this.f58664k;
        Object obj5 = this.f58663j;
        switch (i13) {
            case 0:
                List I0 = v7Var.I0();
                if (I0 != null) {
                    dr.i iVar = (dr.i) obj4;
                    Iterator it = I0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.d(((wy0) obj).getF39332b(), iVar.f56179a.A())) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    if (((wy0) obj) != null) {
                        ((kotlin.jvm.internal.f0) obj5).f80424a = true;
                    }
                }
                Set h10 = ((lb0.b) lb0.n.f82725d.a()).h("PREF_INVITES_SENT_USER_IDS", new LinkedHashSet());
                kotlin.jvm.internal.f0 f0Var = (kotlin.jvm.internal.f0) obj5;
                f0Var.f80424a = f0Var.f80424a || (h10 != null && h10.contains(String.valueOf(((dr.i) obj4).f56179a.A())));
                q qVar = (q) obj3;
                gi.m mVar = qVar.f58689q;
                String d2 = qVar.f58677e.d();
                Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
                dr.i iVar2 = (dr.i) obj4;
                TypeAheadItem contact = iVar2.f56179a;
                Intrinsics.checkNotNullExpressionValue(contact, "contact");
                fk2.c l13 = mVar.F(d2, new TypeAheadItem[]{contact}, null, f0Var.f80424a).h(wj2.c.a()).l(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                nl.b.r(l13, new px0.g(f0Var, iVar2, qVar, 11), null, 2);
                break;
            default:
                List I02 = v7Var.I0();
                if (I02 != null) {
                    dr.i iVar3 = (dr.i) obj4;
                    Iterator it2 = I02.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (Intrinsics.d(((wy0) obj2).getF39332b(), iVar3.f56179a.A())) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (((wy0) obj2) != null) {
                        ((kotlin.jvm.internal.f0) obj5).f80424a = true;
                    }
                }
                Set h13 = ((lb0.b) lb0.n.f82725d.a()).h("PREF_INVITES_SENT_USER_IDS", new LinkedHashSet());
                kotlin.jvm.internal.f0 f0Var2 = (kotlin.jvm.internal.f0) obj5;
                f0Var2.f80424a = f0Var2.f80424a || (h13 != null && h13.contains(String.valueOf(((dr.i) obj4).f56179a.A())));
                f0 f0Var3 = (f0) obj3;
                gi.m mVar2 = f0Var3.f58595p;
                String d13 = f0Var3.f58583d.d();
                Intrinsics.checkNotNullExpressionValue(d13, "getUid(...)");
                dr.i iVar4 = (dr.i) obj4;
                TypeAheadItem contact2 = iVar4.f56179a;
                Intrinsics.checkNotNullExpressionValue(contact2, "contact");
                fk2.c l14 = mVar2.F(d13, new TypeAheadItem[]{contact2}, null, f0Var2.f80424a).h(wj2.c.a()).l(tk2.e.f118017c);
                Intrinsics.checkNotNullExpressionValue(l14, "subscribeOn(...)");
                nl.b.r(l14, new px0.g(f0Var2, iVar4, f0Var3, 12), null, 2);
                break;
        }
    }

    public final void h(Throwable th3) {
        f1 f1Var;
        int i13 = this.f58662i;
        Object obj = this.f58665l;
        Object obj2 = this.f58664k;
        Object obj3 = this.f58663j;
        switch (i13) {
            case 4:
                pe1.r.i0((pe1.r) obj3, (f30) obj2, (String) obj);
                break;
            default:
                HashMap hashMap = new HashMap();
                qz.d dVar = null;
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null) {
                    dVar = k3.M(f1Var);
                }
                VideoPinCreateMediaWorker videoPinCreateMediaWorker = (VideoPinCreateMediaWorker) obj3;
                nx.b0 b0Var = videoPinCreateMediaWorker.f49025s;
                int i14 = videoPinCreateMediaWorker.f78963b.f20000d;
                b0Var.getClass();
                nx.b0.j(hashMap, (x10.c) obj2, th3, dVar, i14);
                BaseMediaWorker.w(videoPinCreateMediaWorker, h32.f1.PIN_CREATE_FAILURE, hashMap, 2);
                ((fk2.f) ((uj2.r) obj)).a(th3);
                break;
        }
    }

    public final void i(boolean z13) {
        Object obj;
        ExoPlayer exoPlayer;
        int i13 = this.f58662i;
        int i14 = 1;
        Object obj2 = this.f58665l;
        Object obj3 = this.f58664k;
        Object obj4 = this.f58663j;
        switch (i13) {
            case 6:
                qf1.i0 i0Var = (qf1.i0) obj4;
                f30 f30Var = (f30) obj3;
                Resources resources = ((Context) obj2).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                i0Var.getClass();
                boolean z14 = !f30Var.Q3().booleanValue();
                boolean z15 = !f30Var.e4().booleanValue();
                boolean z16 = z14 != z13;
                boolean z17 = z15 != z13;
                if (z16 || z17) {
                    hk2.k e13 = i0Var.c(f30Var, z13).h(tk2.e.f118017c).e(wj2.c.a());
                    hk2.b bVar = new hk2.b(new vd1.a(16, new k1.b0(z13, i0Var, f30Var, resources, 13)), new vd1.a(17, new qf1.d0(i0Var, resources, i14)), ck2.i.f27923c);
                    e13.f(bVar);
                    i0Var.f103691b.a(bVar);
                    i0Var.d();
                    break;
                }
            default:
                u50.r rVar = (u50.r) obj4;
                if (rVar != null) {
                    rVar.a(new x1(new gk1.o(((PinterestVideoView) obj3).getB())));
                }
                if (z13) {
                    pg1.c cVar = (pg1.c) obj2;
                    if (!cVar.f100116z.V()) {
                        PinterestVideoView pinterestVideoView = cVar.f100116z;
                        pinterestVideoView.R = true;
                        hc2.m mVar = pinterestVideoView.Q;
                        if (mVar == null || (exoPlayer = ((dc2.g) mVar).f54407a) == null) {
                            obj = null;
                        } else {
                            m7.l0 l0Var = (m7.l0) exoPlayer;
                            l0Var.L0();
                            obj = l0Var.f86269j;
                        }
                        k8.q qVar = obj instanceof k8.q ? (k8.q) obj : null;
                        if (qVar != null) {
                            dl2.b.W2(qVar, true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        qf1.b0 b0Var;
        Iterator it;
        Iterator it2;
        rm1.d dVar;
        boolean z13 = false;
        int i13 = 3;
        int i14 = this.f58662i;
        str = "";
        boolean z14 = true;
        Object obj2 = this.f58665l;
        Object obj3 = this.f58664k;
        Object obj4 = this.f58663j;
        switch (i14) {
            case 0:
                f((v7) obj);
                return Unit.f80348a;
            case 1:
                f((v7) obj);
                return Unit.f80348a;
            case 2:
                String userId = (String) obj;
                Intrinsics.checkNotNullParameter(userId, "userId");
                uk1.d dVar2 = (uk1.d) obj3;
                HashMap hashMap = (HashMap) obj2;
                ((ld1.g) obj4).getClass();
                if (!kotlin.text.z.j(userId)) {
                    nx.d0 d0Var = dVar2.f122379a;
                    h32.f1 f1Var = h32.f1.TAP;
                    h32.g0 g0Var = h32.g0.PIN_CLOSEUP_BRAND_CATALOG;
                    u0 u0Var = u0.SHOPPING_DOMAIN_MODULE_USER_AVATAR;
                    Intrinsics.f(d0Var);
                    d0Var.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : userId, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    r41.k.f106176a.d(userId, r41.b.DomainCarousel);
                }
                return Unit.f80348a;
            case 3:
                n1 storyIcon = (n1) obj;
                Intrinsics.checkNotNullParameter(storyIcon, "storyIcon");
                oe1.b bVar = (oe1.b) obj4;
                String str2 = bVar.f94261h;
                Map map = (Map) obj3;
                List list = (List) map.get(str2);
                if (list == null || !list.contains(storyIcon)) {
                    Map map2 = (Map) obj2;
                    if (!map2.containsKey(str2)) {
                        bVar.f94259f.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.RENDER, (r18 & 2) != 0 ? null : (u0) oe1.c.f94273a.get(storyIcon), (r18 & 4) != 0 ? null : bVar.f94267n, (r18 & 8) != 0 ? null : bVar.f94261h, (r18 & 32) != 0 ? null : bVar.f94255b, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        Object obj5 = map.get(str2);
                        Object obj6 = obj5;
                        if (obj5 == null) {
                            ArrayList arrayList = new ArrayList();
                            map.put(str2, arrayList);
                            obj6 = arrayList;
                        }
                        ((List) obj6).add(storyIcon);
                        map.put(str2, obj6);
                        List list2 = (List) map.get(str2);
                        if (list2 != null && list2.size() == bVar.f94263j) {
                            map2.put(str2, Boolean.TRUE);
                        }
                    }
                }
                return Unit.f80348a;
            case 4:
                h((Throwable) obj);
                return Unit.f80348a;
            case 5:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                String f39332b = user.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                String j03 = c0.d.j0(f39332b, ((vh) obj4).f42861s);
                oe1.b loggingData = (oe1.b) obj3;
                Intrinsics.checkNotNullParameter(loggingData, "loggingData");
                Intrinsics.checkNotNullParameter(user, "user");
                HashMap Y = c0.d.Y(loggingData.e(), null, null, loggingData, null, null);
                c0.d.G2(user, Y);
                c0.d.j2(loggingData.f94259f, h32.f1.TAP, user.getF39332b(), (r16 & 8) != 0 ? null : loggingData.f94257d, (r16 & 16) != 0 ? null : null, loggingData.f94272s, loggingData.f94255b);
                gd1.d dVar3 = (gd1.d) ((Function0) obj2).invoke();
                if (dVar3 != null) {
                    dVar3.O5(j03, Y);
                }
                return Unit.f80348a;
            case 6:
                i(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 7:
                tt1.a it3 = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                qf1.i0 i0Var = (qf1.i0) obj4;
                nx.d0 d0Var2 = i0Var.f103690a;
                h32.f1 f1Var2 = h32.f1.MENTION_UNLINK;
                f30 f30Var = (f30) obj3;
                String f39332b2 = f30Var.getF39332b();
                HashMap hashMap2 = new HashMap();
                String str3 = (String) obj2;
                hashMap2.put("user_id", str3);
                Unit unit = Unit.f80348a;
                d0Var2.g(f1Var2, f39332b2, hashMap2, false);
                dl0 v63 = f30Var.v6();
                if (v63 != null) {
                    qf1.b0 b0Var2 = new qf1.b0(str3);
                    ArrayList arrayList2 = new ArrayList();
                    List s13 = v63.s();
                    if (s13 != null) {
                        Iterator it4 = s13.iterator();
                        while (it4.hasNext()) {
                            uo0 uo0Var = (uo0) it4.next();
                            ArrayList arrayList3 = new ArrayList();
                            List list3 = uo0Var.x().f40761b;
                            if (list3 != null) {
                                Iterator it5 = list3.iterator();
                                ?? r13 = z13;
                                while (it5.hasNext()) {
                                    ro0 ro0Var = (ro0) it5.next();
                                    fo0 fo0Var = (fo0) ro0Var.a(b0Var2);
                                    if (fo0Var != null) {
                                        co0 co0Var = new co0(fo0Var, r13);
                                        Boolean bool = Boolean.TRUE;
                                        co0Var.f36485d = bool;
                                        boolean[] zArr = co0Var.f36489h;
                                        b0Var = b0Var2;
                                        if (zArr.length > i13) {
                                            zArr[i13] = z14;
                                        }
                                        it = it4;
                                        it2 = it5;
                                        fo0 fo0Var2 = new fo0(co0Var.f36482a, co0Var.f36483b, co0Var.f36484c, bool, co0Var.f36486e, co0Var.f36487f, co0Var.f36488g, zArr, 0);
                                        Intrinsics.checkNotNullExpressionValue(fo0Var2, "build(...)");
                                        arrayList3.add(new ro0(fo0Var2));
                                    } else {
                                        b0Var = b0Var2;
                                        it = it4;
                                        it2 = it5;
                                        arrayList3.add(ro0Var);
                                    }
                                    b0Var2 = b0Var;
                                    it4 = it;
                                    it5 = it2;
                                    r13 = 0;
                                    i13 = 3;
                                    z14 = true;
                                }
                            }
                            oo0 x13 = uo0Var.x();
                            x13.c(arrayList3);
                            uo0 a13 = x13.a();
                            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                            arrayList2.add(a13);
                            b0Var2 = b0Var2;
                            it4 = it4;
                            z13 = false;
                            i13 = 3;
                            z14 = true;
                        }
                    }
                    al0 w13 = v63.w();
                    w13.g(arrayList2);
                    dl0 a14 = w13.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                    e30 R6 = f30Var.R6();
                    R6.m2(a14);
                    f30 a15 = R6.a();
                    Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
                    i0Var.f103696g.W(a15);
                }
                return Integer.valueOf(x0.pin_remove_mention_success);
            case 8:
                e((z2) obj);
                return Unit.f80348a;
            case 9:
                ((rf1.o) obj4).m((f30) obj, (zk0) obj3, (zq0) obj2);
                return Unit.f80348a;
            case 10:
                h22.d dVar4 = (h22.d) obj;
                Intrinsics.f(dVar4);
                ((p0) obj4).k4((String) obj3, (f30) obj2, dVar4);
                return Unit.f80348a;
            case 11:
                i(((Boolean) obj).booleanValue());
                return Unit.f80348a;
            case 12:
                Typeface typeface = (Typeface) obj;
                Iterator it6 = ((List) obj4).iterator();
                while (it6.hasNext()) {
                    ((TextView) it6.next()).setTypeface(typeface);
                }
                ((pg1.c) obj3).f100110t.remove((String) obj2);
                return Unit.f80348a;
            case 13:
                u50.r rVar = (u50.r) obj4;
                com.pinterest.feature.settings.passcode.d dVar5 = com.pinterest.feature.settings.passcode.d.RESET_PASSWORD;
                String str4 = (String) ((pb1.o) obj3).f99474a.get("passcode");
                rVar.a(new pb1.e(dVar5, str4 != null ? str4 : ""));
                ((kh1.c) obj2).f79416e.k(vq1.d.change_pwd_success);
                return Unit.f80348a;
            case 14:
                e((z2) obj);
                return Unit.f80348a;
            case 15:
                View it7 = (View) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                ((rh1.k0) obj4).f108223l.invoke((rp0.d) obj3, ((CommentReactionIndicator) obj2).L());
                return Boolean.TRUE;
            case 16:
                return b((rn1.a) obj);
            case 17:
                return b((rn1.a) obj);
            case 18:
                Map map3 = (Map) obj;
                StatusMediaWorker statusMediaWorker = (StatusMediaWorker) obj4;
                if (statusMediaWorker.e()) {
                    ((fk2.f) ((uj2.r) obj3)).a(new CancellationException(statusMediaWorker.f49040e));
                } else if (map3.keySet().isEmpty()) {
                    ((fk2.f) ((uj2.r) obj3)).a(new IllegalStateException("No keys returned"));
                } else {
                    String[] B = statusMediaWorker.B().length == 0 ? new String[]{(String) obj2} : statusMediaWorker.B();
                    uj2.r emitter = (uj2.r) obj3;
                    Intrinsics.checkNotNullExpressionValue(emitter, "$emitter");
                    int length = B.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            String str5 = B[i15];
                            if (map3.containsKey(str5)) {
                                i15++;
                            } else {
                                Collection<kv> values = map3.values();
                                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(values, 10));
                                for (kv kvVar : values) {
                                    UploadStatus.f35584g.getClass();
                                    arrayList4.add(ly0.a(kvVar));
                                }
                                statusMediaWorker.f49017r = arrayList4;
                                ((fk2.f) emitter).a(new IllegalStateException(a.a.k("Upload data with id ", str5, " not found")));
                            }
                        } else {
                            ArrayList arrayList5 = new ArrayList(B.length);
                            for (String str6 : B) {
                                ly0 ly0Var = UploadStatus.f35584g;
                                Object obj7 = map3.get(str6);
                                Intrinsics.f(obj7);
                                ly0Var.getClass();
                                arrayList5.add(ly0.a((kv) obj7));
                            }
                            statusMediaWorker.f49017r = arrayList5;
                            fk2.f fVar = (fk2.f) emitter;
                            fVar.c(arrayList5);
                            fVar.b();
                        }
                    }
                }
                return Unit.f80348a;
            case 19:
                h((Throwable) obj);
                return Unit.f80348a;
            case 20:
                bk1.o it8 = (bk1.o) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                f30 f30Var2 = (f30) obj4;
                a2 a2Var = (a2) obj2;
                bk1.c cVar = new bk1.c(f30Var2, true, f30Var2.getF39332b(), (c1) obj3, r7, null, a2Var.W, a2Var.X);
                it8.getClass();
                return bk1.o.e(cVar);
            case 21:
                fk1.d it9 = (fk1.d) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                List list4 = it9.f62348a;
                f30 f30Var3 = (f30) obj4;
                wa2.h0 h0Var = new wa2.h0(b40.e0(f30Var3));
                v32.c O = b40.O(f30Var3);
                ps0.m mVar = fk1.v.f62375f;
                ((fk1.v) obj3).getClass();
                return fk1.d.e(CollectionsKt.m0(new hj1.b(new wa2.x(h0Var, new wa2.v(fk1.v.o(O)), ((wa2.m) obj2).Z ? vn1.c.LIGHT : vn1.c.DEFAULT)), list4));
            case 22:
                gk1.l state = (gk1.l) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                List list5 = state.f65239a;
                s30 s30Var = (s30) obj3;
                f30 f30Var4 = (f30) obj2;
                ps0.y yVar = w0.f65282g;
                ((w0) obj4).getClass();
                ArrayList arrayList6 = new ArrayList();
                for (cr0.f fVar2 : ua2.z.f121638b) {
                    Integer valueOf = fVar2 instanceof cr0.e ? Integer.valueOf(s30Var.getImpressionCount()) : fVar2 instanceof cr0.c ? Integer.valueOf(s30Var.getCloseupCount()) : fVar2 instanceof cr0.d ? Integer.valueOf(s30Var.getSaveCount()) : null;
                    Boolean T5 = f30Var4.T5();
                    Intrinsics.checkNotNullExpressionValue(T5, "getPromotedIsRemovable(...)");
                    if (!T5.booleanValue() || !(fVar2 instanceof cr0.d)) {
                        arrayList6.add(new jj1.a(fVar2.f53093b, valueOf));
                    }
                }
                return gk1.l.e(state, CollectionsKt.m0(new jj1.b(arrayList6), list5), null, null, 6);
            case 23:
                hk1.g state2 = (hk1.g) obj;
                Intrinsics.checkNotNullParameter(state2, "state");
                List list6 = state2.f69351a;
                f30 f30Var5 = (f30) obj4;
                Boolean o43 = f30Var5.o4();
                Intrinsics.checkNotNullExpressionValue(o43, "getFavoritedByMe(...)");
                boolean booleanValue = o43.booleanValue();
                hk1.u uVar = (hk1.u) obj3;
                int intValue = (((wa2.m) obj2).f128895z ? f30Var5.n4() : 0).intValue();
                uVar.getClass();
                if (intValue != 0) {
                    if (intValue < 9) {
                        str = String.valueOf(intValue);
                    } else if (intValue > 9) {
                        str = "9+";
                    }
                }
                return hk1.g.e(CollectionsKt.m0(new yj1.b(new yj1.c(str, booleanValue)), list6));
            case 24:
                ku1.k screenNavigator = (ku1.k) obj;
                Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
                screenNavigator.y1((Function1) obj4, (String) obj3, (Bundle) obj2);
                return Unit.f80348a;
            case 25:
                cm1.d it10 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                vl1.c cVar2 = (vl1.c) obj4;
                yl1.b bVar2 = new yl1.b(cVar2.f126108a, false, null, null, null, null, null, null, vl1.r.banner_primary_action_button, null, 766);
                u50.i0 i0Var2 = cVar2.f126109b;
                u50.i0 i0Var3 = i0Var2 == null ? u50.h0.f120562a : i0Var2;
                Context context = ((GestaltBanner) obj3).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                return cm1.d.e(it10, bVar2, new yl1.b(i0Var3, false, d7.b.Z(!(i0Var2 == null || i0Var2.a(context).length() == 0)), null, ((vl1.l) obj2) instanceof vl1.e ? yl1.i.b() : (yl1.g) yl1.i.f139337c.getValue(), null, null, null, vl1.r.banner_secondary_action_button, null, 746), null, null, fm1.c.VISIBLE, 92);
            case 26:
                rm1.d it11 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return rm1.d.e(it11, new rm1.f((rm1.q) obj4, rm1.i.MD), ((vl1.l) obj3).f126126c, (fm1.c) obj2, 0, null, 24);
            case 27:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                u50.i0 text = (u50.i0) obj4;
                GestaltCheckBox gestaltCheckBox = (GestaltCheckBox) obj3;
                Intrinsics.checkNotNullExpressionValue(gestaltCheckBox.getContext(), "getContext(...)");
                bind.i(d7.b.Z(!kotlin.text.z.j(text.a(r2))));
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f108886a = text;
                em1.e eVar = (em1.e) obj2;
                em1.e eVar2 = em1.e.ERROR;
                bind.b(eVar == eVar2 ? vn1.c.ERROR : vn1.c.SUBTLE);
                bind.h(vn1.g.BODY_100);
                if (eVar == eVar2) {
                    rm1.c cVar3 = rm1.c.ERROR;
                    Context context2 = gestaltCheckBox.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    dVar = new rm1.d(dl2.b.T1(context2) ? new rm1.e(rm1.n.WORKFLOW_STATUS_PROBLEM) : new rm1.f(rm1.q.WORKFLOW_STATUS_PROBLEM), cVar3, null, 0, null, 28);
                } else {
                    dVar = null;
                }
                bind.f108895j = dVar;
                bind.f108901p = eVar == eVar2 ? new u50.b0(eo1.c.space_100) : null;
                return Unit.f80348a;
            case 28:
                return b((rn1.a) obj);
            default:
                int intValue2 = ((Number) obj).intValue();
                GestaltRadioGroup gestaltRadioGroup = (GestaltRadioGroup) obj4;
                an1.l lVar = (an1.l) obj3;
                Integer valueOf2 = lVar != null ? Integer.valueOf(lVar.f15747e) : null;
                List list7 = ((an1.l) obj2).f15746d;
                fm1.c cVar4 = GestaltRadioGroup.f49488x;
                gestaltRadioGroup.getClass();
                if (intValue2 >= 0 && intValue2 < list7.size()) {
                    int i16 = 2;
                    if (valueOf2 != null && valueOf2.intValue() != -1) {
                        GestaltRadioButton gestaltRadioButton = (GestaltRadioButton) gestaltRadioGroup.findViewWithTag(valueOf2);
                        mm1.i nextState = new mm1.i(z13, i13);
                        gestaltRadioButton.getClass();
                        Intrinsics.checkNotNullParameter(nextState, "nextState");
                        com.google.firebase.messaging.q qVar = gestaltRadioButton.f49487f;
                    }
                    GestaltRadioButton gestaltRadioButton2 = (GestaltRadioButton) gestaltRadioGroup.findViewWithTag(Integer.valueOf(intValue2));
                    mm1.i nextState2 = new mm1.i(z14, i13);
                    gestaltRadioButton2.getClass();
                    Intrinsics.checkNotNullParameter(nextState2, "nextState");
                    com.google.firebase.messaging.q qVar2 = gestaltRadioButton2.f49487f;
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlin.jvm.internal.j0 j0Var, GestaltListAction gestaltListAction, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f58662i = 28;
        this.f58664k = j0Var;
        this.f58665l = gestaltListAction;
        this.f58663j = f0Var;
    }
}
