package oh1;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import bk1.a2;
import bk1.b0;
import bk1.m1;
import bk1.q0;
import bk1.z1;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.unifiedcomments.view.AttachedPinCommentView;
import com.pinterest.feature.unifiedcomments.view.CommunityInsightHeaderView;
import com.pinterest.feature.unifiedcomments.view.PinTitleHeaderView;
import com.pinterest.feature.video.worker.VideoPinCreateMediaWorker;
import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.j0;
import com.pinterest.framework.multisection.datasource.pagedlist.l0;
import com.pinterest.framework.multisection.datasource.pagedlist.o0;
import com.pinterest.framework.multisection.datasource.pagedlist.p0;
import com.pinterest.navigation.Navigation;
import com.pinterest.repository.TypedId;
import ek1.g0;
import ek1.r1;
import gk1.d0;
import h32.f1;
import h32.u0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;
import qa2.h0;
import rh1.k0;
import u50.f0;
import u50.i0;
import we1.n1;
import yq0.z;
import zy.e0;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94575i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f94576j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f94577k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13, Object obj, Object obj2) {
        super(1);
        this.f94575i = i13;
        this.f94576j = obj;
        this.f94577k = obj2;
    }

    public final a2 b(a2 it) {
        int i13 = this.f94575i;
        Object obj = this.f94577k;
        Object obj2 = this.f94576j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                z1 z1Var = (z1) obj;
                return a2.b(it, null, false, false, null, (u0) obj2, 0, false, null, null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, ((es.v) z1Var.f23390d).D(), null, null, ((es.v) z1Var.f23390d).P(), false, false, false, -257, 505855);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                z1 z1Var2 = (z1) obj;
                return a2.b(it, null, false, false, null, null, 0, false, null, null, Long.valueOf(((b0) ((q0) obj2)).f23181a), false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, ((es.v) z1Var2.f23390d).D(), null, null, ((es.v) z1Var2.f23390d).P(), false, false, false, -16385, 505855);
        }
    }

    public final rn1.a e(rn1.a it) {
        CharSequence c13;
        vn1.g gVar;
        vn1.g u13;
        int i13 = this.f94575i;
        Object obj = this.f94577k;
        Object obj2 = this.f94576j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                Date date = (Date) obj2;
                k0 k0Var = (k0) obj;
                pb0.d fuzzyDateFormatter = k0Var.f108212f;
                int i14 = ai0.a.f15235a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
                pb0.h p13 = xa0.j.p(date);
                pb0.i iVar = p13.f99433a;
                if ((iVar != null ? c0.K(pb0.i.values(), iVar) : -1) >= c0.K(pb0.i.values(), pb0.i.MONTHS)) {
                    c13 = new SimpleDateFormat("MM/YY", Locale.US).format(date);
                    Intrinsics.checkNotNullExpressionValue(c13, "format(...)");
                } else {
                    c13 = fuzzyDateFormatter.c(p13, pb0.b.STYLE_COMPACT_NO_BOLDING, false);
                }
                return rn1.a.y(it, bs1.c.h2(c13), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, bs1.c.h2(k0Var.f108212f.b(date, pb0.b.STYLE_NORMAL_NO_BOLDING, true)), null, null, null, null, false, null, null, 2092990);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = (String) obj2;
                f0 x13 = ep.b.x(str, "string", str);
                CommunityInsightHeaderView communityInsightHeaderView = (CommunityInsightHeaderView) obj;
                Context context = communityInsightHeaderView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (dl2.b.T1(context)) {
                    Context context2 = communityInsightHeaderView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    gVar = a0.u(context2);
                } else {
                    gVar = it.f108853k;
                }
                return rn1.a.y(it, x13, null, null, null, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                f0 h23 = bs1.c.h2((String) obj2);
                PinTitleHeaderView pinTitleHeaderView = (PinTitleHeaderView) obj;
                int i15 = PinTitleHeaderView.f48957l;
                if (((Boolean) pinTitleHeaderView.f48963i.getValue()).booleanValue() || ((Boolean) pinTitleHeaderView.f48964j.getValue()).booleanValue() || ((Boolean) pinTitleHeaderView.f48965k.getValue()).booleanValue()) {
                    Context context3 = pinTitleHeaderView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    u13 = a0.u(context3);
                } else {
                    u13 = it.f108853k;
                }
                return rn1.a.y(it, h23, null, null, null, u13, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
        }
    }

    public final void f(f30 pin) {
        String string;
        int i13 = this.f94575i;
        Object obj = this.f94577k;
        Object obj2 = this.f94576j;
        switch (i13) {
            case 1:
                z zVar = (z) obj2;
                rh1.k kVar = (rh1.k) obj;
                zVar.H(new int[]{1, 2}, new px0.g(kVar, zVar, pin, 20));
                zVar.G(4, new rh1.d(kVar, 1));
                zVar.G(3, new rh1.d(kVar, 2));
                return;
            case 2:
            default:
                k0 k0Var = (k0) obj2;
                Intrinsics.f(pin);
                Integer num = k0Var.f108211e0;
                k0Var.setPin(pin, num != null ? num.intValue() : 0);
                KeyEvent.Callback callback = (h0) obj;
                Intrinsics.g(callback, "null cannot be cast to non-null type android.view.View");
                View view = (View) callback;
                as1.b a13 = as1.b.a();
                Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                sr b13 = bs1.b.b(pin, a13);
                int E0 = bs1.c.E0(b13);
                int w03 = bs1.c.w0(b13);
                double d2 = E0;
                double d13 = (hf0.b.f69002b * 0.2d) / d2;
                double d14 = hf0.b.f69001a * 1.3d;
                if (d13 > d14) {
                    d13 = d14;
                }
                int b14 = ml2.c.b(d2 * d13);
                int b15 = ml2.c.b(w03 * d13);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = b14;
                layoutParams.height = b15;
                view.setLayoutParams(layoutParams);
                bs1.c.U1(k0Var.K);
                com.bumptech.glide.c.u1(k0Var.L);
                a0.k0(k0Var.O);
                com.bumptech.glide.c.d0(k0Var.F);
                a0.k0(k0Var.N);
                bs1.c.X0(k0Var.S);
                return;
            case 3:
                k0 k0Var2 = (k0) obj2;
                AttachedPinCommentView attachedPinCommentView = k0Var2.I;
                String str = (String) obj;
                Intrinsics.f(pin);
                attachedPinCommentView.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                String B0 = bs1.c.B0(pin);
                Intrinsics.f(B0);
                attachedPinCommentView.f48908a.loadUrl(B0);
                String z63 = pin.z6();
                if (z63 == null || z63.length() == 0) {
                    String r43 = pin.r4();
                    if (r43 == null || r43.length() == 0) {
                        string = attachedPinCommentView.getResources().getString(fb0.f.attached_pin_comment_title_placeholder);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        string = pin.r4();
                        Intrinsics.f(string);
                    }
                } else {
                    string = pin.z6();
                    Intrinsics.f(string);
                }
                attachedPinCommentView.f48909b.i(new qf1.z(string, 22));
                attachedPinCommentView.f48910c.i(new n1(attachedPinCommentView, 27));
                attachedPinCommentView.setOnClickListener(new fd1.e(k0Var2, str, 10));
                bs1.c.U1(attachedPinCommentView);
                return;
        }
    }

    public final void h(dl1.s plankModel) {
        rp0.d cVar;
        int i13 = this.f94575i;
        Object obj = this.f94576j;
        Object obj2 = this.f94577k;
        switch (i13) {
            case 0:
                w wVar = (w) obj;
                if (plankModel instanceof z2) {
                    cVar = new rp0.b((z2) plankModel);
                } else {
                    Intrinsics.g(plankModel, "null cannot be cast to non-null type com.pinterest.api.model.UserDidItData");
                    cVar = new rp0.c((az0) plankModel);
                }
                ((Function1) obj2).invoke(cVar);
                wVar.f94595q = cVar;
                break;
            case 17:
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                ((Function1) obj2).invoke(((uf0.a) obj).i(plankModel));
                break;
            default:
                Intrinsics.f(plankModel);
                ((dl1.l) obj).W((dl1.s) ((Function1) obj2).invoke(plankModel));
                break;
        }
    }

    public final void i(Throwable error) {
        int i13 = this.f94575i;
        Object obj = this.f94576j;
        switch (i13) {
            case 18:
                wy0 wy0Var = (wy0) this.f94577k;
                ((Function2) obj).invoke(wy0Var, Boolean.valueOf(c0.d.d2(wy0Var)));
                break;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                com.pinterest.framework.multisection.datasource.pagedlist.h0 h0Var = (com.pinterest.framework.multisection.datasource.pagedlist.h0) obj;
                h0Var.A = false;
                if (!(error instanceof p0)) {
                    h0Var.f49129s.c(new wt1.i(error));
                    break;
                } else {
                    h0Var.z();
                    h0Var.a0(kotlin.collections.q0.f80391a);
                    h0Var.f49128r = new j0();
                    h0Var.n();
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [rl1.d] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = 6;
        int i14 = this.f94575i;
        int i15 = 10;
        boolean z13 = false;
        int i16 = 0;
        z13 = false;
        int i17 = 1;
        Object obj2 = this.f94577k;
        Object obj3 = this.f94576j;
        switch (i14) {
            case 0:
                h((dl1.s) obj);
                return Unit.f80348a;
            case 1:
                f((f30) obj);
                return Unit.f80348a;
            case 2:
                Intrinsics.checkNotNullParameter((View) obj, "it");
                k0 k0Var = (k0) obj3;
                rp0.d dVar = (rp0.d) obj2;
                int i18 = k0.f108203k0;
                k0Var.getClass();
                boolean i19 = dVar.i();
                Function2 function2 = k0Var.f108222k;
                if (i19) {
                    function2.invoke(dVar, rh1.x.Unlike);
                }
                if (dVar.j()) {
                    function2.invoke(dVar, rh1.x.NotHelpful);
                }
                if (!dVar.i() && !dVar.j()) {
                    function2.invoke(dVar, rh1.x.Like);
                }
                return Unit.f80348a;
            case 3:
                f((f30) obj);
                return Unit.f80348a;
            case 4:
                f((f30) obj);
                return Unit.f80348a;
            case 5:
                return e((rn1.a) obj);
            case 6:
                return e((rn1.a) obj);
            case 7:
                return e((rn1.a) obj);
            case 8:
                f30 f30Var = (f30) ((tt1.a) obj).c();
                fk2.f fVar = (fk2.f) ((uj2.r) obj3);
                fVar.c(f30Var);
                HashMap hashMap = new HashMap();
                VideoPinCreateMediaWorker videoPinCreateMediaWorker = (VideoPinCreateMediaWorker) obj2;
                hashMap.put("is_video", "true");
                hashMap.put("media_upload_id", videoPinCreateMediaWorker.t());
                f1 f1Var = f1.PIN_CREATE;
                String f39332b = f30Var.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                videoPinCreateMediaWorker.v(f1Var, f39332b, hashMap);
                videoPinCreateMediaWorker.k().f(gi1.e.b(videoPinCreateMediaWorker, videoPinCreateMediaWorker.u().getPath()));
                if (f30Var.D3() != null) {
                    videoPinCreateMediaWorker.k().d(new y42.d(f30Var, z13, i13));
                }
                fVar.b();
                return Unit.f80348a;
            case 9:
                rl1.q it = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                rl1.a aVar = (rl1.a) obj3;
                String str = aVar.f108520b;
                String str2 = (String) obj2;
                i0 x13 = str2.length() > 0 ? ep.b.x(str2, "string", str2) : it.f108651e;
                wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
                return rl1.q.e(it, aVar.f108519a, str, false, null, x13, false, false, null, 0, f13 != null ? new rl1.d(f13.q2().intValue()) : rl1.b.f108524a, null, 1516);
            case 10:
                return b((a2) obj);
            case 11:
                bk1.o it2 = (bk1.o) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                a2 a2Var = (a2) ((l82.e) obj2).f82219b;
                bk1.m mVar = new bk1.m((f30) obj3, a2Var.W, a2Var.X, null, null, null);
                it2.getClass();
                return bk1.o.e(mVar);
            case 12:
                bs.d notQuarantined = (bs.d) obj;
                Intrinsics.checkNotNullParameter(notQuarantined, "notQuarantined");
                h32.i0 i0Var = ((a2) obj2).f23157c.f143086a;
                f1 f1Var2 = f1.PIN_HANDSHAKE_ERROR;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("fail_reason", notQuarantined.f23843a.getFailureName());
                hashMap2.put("handshake_error_code", notQuarantined.f23843a.getErrorCode());
                Unit unit = Unit.f80348a;
                ((l82.e) obj3).a(new m1(new e0(new zy.a(i0Var, f1Var2, null, hashMap2, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
                return Unit.f80348a;
            case 13:
                return b((a2) obj);
            case 14:
                r1 it3 = (r1) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                int i23 = ((ek1.u) ((g0) obj2)).f59378a;
                List pinChips = ((ek1.d) obj3).f59225b;
                Intrinsics.checkNotNullParameter(pinChips, "pinChips");
                return r1.b(it3, null, null, 0, new ek1.d(i23, pinChips), null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -129, 4194303);
            case 15:
                gk1.l it4 = (gk1.l) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                d0 d0Var = (d0) obj2;
                List<ni1.f0> list = ((gk1.l) obj3).f65239a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (ni1.f0 f0Var : list) {
                    if (f0Var instanceof oj1.a) {
                        oj1.a aVar2 = (oj1.a) f0Var;
                        boolean z14 = ((gk1.r) d0Var).f65259a;
                        u50.k0 description = aVar2.f95393a;
                        Intrinsics.checkNotNullParameter(description, "description");
                        u50.n topRadius = aVar2.f95394b;
                        Intrinsics.checkNotNullParameter(topRadius, "topRadius");
                        f0Var = new oj1.a(description, topRadius, aVar2.f95395c, z14);
                    }
                    arrayList.add(f0Var);
                }
                return gk1.l.e(it4, arrayList, null, null, 6);
            case 16:
                Intrinsics.checkNotNullParameter((v7) obj, "it");
                ((i92.k) obj3).i(((yk1.a) ((yk1.v) obj2)).f139224a.getString(x0.block_user_follow_board_message));
                return Unit.f80348a;
            case 17:
                h((dl1.s) obj);
                return Unit.f80348a;
            case 18:
                i((Throwable) obj);
                return Unit.f80348a;
            case 19:
                wk1.e eVar = (wk1.e) obj3;
                if (!eVar.s() && eVar.a() > 0) {
                    z13 = true;
                }
                if (z13) {
                    wk1.e eVar2 = (wk1.e) obj2;
                    if (eVar2.s()) {
                        eVar2.t();
                        return Unit.f80348a;
                    }
                }
                if (!z13) {
                    wk1.e eVar3 = (wk1.e) obj2;
                    if (!eVar3.s()) {
                        eVar3.y();
                    }
                }
                return Unit.f80348a;
            case 20:
                wt1.c0 c0Var = (wt1.c0) obj;
                Intrinsics.f(c0Var);
                ((wk1.q) obj3).onStateUpdated(c0Var, (wk1.e) obj2);
                return Unit.f80348a;
            case 21:
                pc.h hVar = (pc.h) obj;
                com.pinterest.framework.multisection.datasource.pagedlist.k kVar = (com.pinterest.framework.multisection.datasource.pagedlist.k) obj3;
                Intrinsics.f(hVar);
                Object f14 = kVar.f(hVar);
                if (f14 != null) {
                    com.pinterest.framework.multisection.datasource.pagedlist.s sVar = (com.pinterest.framework.multisection.datasource.pagedlist.s) obj2;
                    for (Object obj4 : sVar.d()) {
                        int i24 = i16 + 1;
                        if (i16 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        if (sVar.f49169h.y(obj4, f14)) {
                            sVar.u1(i16, kVar.H(obj4, f14));
                        }
                        i16 = i24;
                    }
                }
                return Unit.f80348a;
            case 22:
                com.pinterest.framework.multisection.datasource.pagedlist.i0 response = (com.pinterest.framework.multisection.datasource.pagedlist.i0) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                com.pinterest.framework.multisection.datasource.pagedlist.h0 h0Var = (com.pinterest.framework.multisection.datasource.pagedlist.h0) obj3;
                h0Var.f49130t = response.f49142c;
                String str3 = response.f49140a;
                h0Var.f49128r = new com.pinterest.framework.multisection.datasource.pagedlist.k0(str3);
                int length = str3.length();
                List list2 = response.f49141b;
                if (length != 0 && list2.isEmpty()) {
                    h0Var.R(true);
                } else {
                    h0Var.A = false;
                    h0Var.f49129s.c(new wt1.p(list2));
                    if (d7.b.f53785b) {
                        new ly.b(i13, z13 ? 1 : 0).i();
                    }
                    kotlin.jvm.internal.r rVar = (kotlin.jvm.internal.r) obj2;
                    boolean z15 = !(rVar instanceof l0);
                    if (rVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.k0) {
                        h0Var.w(list2, z15);
                    } else {
                        h0Var.b0(list2, z15);
                    }
                }
                if (h0Var.O()) {
                    ((qo1.b) h0Var.D.getValue()).b(list2);
                }
                return Unit.f80348a;
            case 23:
                i((Throwable) obj);
                return Unit.f80348a;
            case 24:
                Map<String, String> it5 = (Map) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                RetrofitPagedRemoteRequest retrofitPagedRemoteRequest = (RetrofitPagedRemoteRequest) obj3;
                x12.a pagedListService = retrofitPagedRemoteRequest.getPagedListService();
                Object obj5 = ((o0) obj2).getParams()[0];
                Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.String");
                return pagedListService.c((String) obj5, it5, retrofitPagedRemoteRequest.getPwtAction(), retrofitPagedRemoteRequest.maybeFreezeHeaders());
            case 25:
                List it6 = (List) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return (it6.isEmpty() || ((TypedId[]) obj3).length != it6.size()) ? uj2.b0.g(new p0()) : uj2.b0.j(new com.pinterest.framework.multisection.datasource.pagedlist.i0((String) obj2, null, it6));
            case 26:
                j((ku1.k) obj);
                return Unit.f80348a;
            case 27:
                j((ku1.k) obj);
                return Unit.f80348a;
            case 28:
                dl1.s localModel = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(localModel, "localModel");
                uj2.l lVar = (uj2.l) ((Function0) obj3).invoke();
                com.pinterest.framework.multisection.datasource.pagedlist.h hVar2 = new com.pinterest.framework.multisection.datasource.pagedlist.h(i15, new dl1.j((dl1.l) obj2, localModel, i17));
                lVar.getClass();
                return new hk2.h(lVar, hVar2, i17).i(uj2.l.d(localModel));
            default:
                h((dl1.s) obj);
                return Unit.f80348a;
        }
    }

    public final void j(ku1.k screenNavigator) {
        int i13 = this.f94575i;
        Object obj = this.f94577k;
        Object obj2 = this.f94576j;
        switch (i13) {
            case 26:
                Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
                Navigation navigation = (Navigation) obj2;
                u70.a bottomNavTabType = (u70.a) obj;
                nl1.d dVar = (nl1.d) screenNavigator;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
                com.pinterest.framework.screens.s sVar = ((ku1.j) dVar.o7()).f80914l;
                r70.a aVar = sVar != null ? sVar.f49234i : null;
                r70.a aVar2 = aVar instanceof r70.a ? aVar : null;
                if (aVar2 != null) {
                    int i14 = nl1.b.f91278a[bottomNavTabType.ordinal()];
                    if (i14 == 1) {
                        aVar2.b();
                    } else if (i14 == 2) {
                        aVar2.k(com.pinterest.framework.screens.u.NAVIGATION);
                    } else {
                        if (i14 != 3) {
                            throw new IllegalArgumentException("Unsupported tab type: " + bottomNavTabType);
                        }
                        aVar2.h();
                    }
                    dVar.M1(navigation);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
                ((nl1.d) screenNavigator).X6((String) obj2, (Bundle) obj);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Function1 function1, Object obj, int i13) {
        super(1);
        this.f94575i = i13;
        this.f94577k = function1;
        this.f94576j = obj;
    }
}
