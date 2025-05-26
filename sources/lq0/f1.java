package lq0;

import android.graphics.Matrix;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Spanned;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.ui.LegacyPlayerView;
import c50.h9;
import c50.t4;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.sg;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.yc0;
import com.pinterest.api.model.zs;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.engagementtab.EngagementTabRetrofitRemoteRequest;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinFontPicker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m7.x1;
import o82.i2;
import pk.v2;
import so.mb;
import so.qb;

/* loaded from: classes5.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84309i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f84310j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Object obj, int i13) {
        super(1);
        this.f84309i = i13;
        this.f84310j = obj;
    }

    public final dt0.a0 b(dt0.a0 it) {
        int i13 = this.f84309i;
        Object obj = this.f84310j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return dt0.a0.b(it, (ts0.b) obj, null, 12);
            default:
                Intrinsics.checkNotNullParameter(it, "vmState");
                return dt0.a0.b(it, null, new o82.j0(new i2(new et0.a(((dt0.a0) obj).f56224a.getFilterParam()), 2)), 7);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f84309i;
        Object obj = this.f84310j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(String.valueOf(((sg) obj).j())), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                b0.c cVar = (b0.c) obj;
                return rn1.a.y(it, bs1.c.h2((CharSequence) cVar.f20717f), null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.h2((CharSequence) cVar.f20718g), null, null, null, null, false, null, null, 2093054);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                List b13 = kotlin.collections.e0.b(vn1.b.CENTER);
                vn1.g gVar = vn1.g.BODY_100;
                vn1.g gVar2 = vn1.g.BODY_200;
                rn1.b bVar = rn1.b.END;
                Spanned string = (Spanned) obj;
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, b13, null, null, 4, null, bVar, null, null, true, 0, null, gVar, gVar2, null, null, false, null, null, 2071386);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(((PinGridHideView) obj).f45737p), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    public final void f(l82.n buildAndStart) {
        int i13 = this.f84309i;
        Object obj = this.f84310j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                ys0.s sVar = (ys0.s) obj;
                mb0.a aVar = (mb0.a) sVar.f140129e.f63225b;
                buildAndStart.a(aVar, new h9(23), aVar.a());
                zy.d0 d0Var = sVar.f140127c;
                buildAndStart.a(d0Var, new h9(25), d0Var.a());
                at0.b bVar = sVar.f140128d;
                buildAndStart.a(bVar, new h9(24), bVar.a());
                break;
            case 16:
            case 18:
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                dt0.c0 c0Var = (dt0.c0) obj;
                mb0.a aVar2 = (mb0.a) c0Var.f56234g.f63225b;
                buildAndStart.a(aVar2, new h9(29), aVar2.a());
                zy.d0 d0Var2 = c0Var.f56230c;
                buildAndStart.a(d0Var2, new t4(3), d0Var2.a());
                at0.b bVar2 = c0Var.f56231d;
                buildAndStart.a(bVar2, new t4(0), bVar2.a());
                nu.a aVar3 = c0Var.f56232e;
                buildAndStart.a(aVar3, new t4(1), aVar3.a());
                i60.a aVar4 = c0Var.f56233f;
                buildAndStart.a(aVar4, new t4(2), aVar4.a());
                break;
            case 17:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                mb0.a aVar5 = (mb0.a) ((bt0.v) obj).f23893d.f63225b;
                buildAndStart.a(aVar5, new h9(26), aVar5.a());
                break;
            case 19:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                ct0.a0 a0Var = (ct0.a0) obj;
                mb0.a aVar6 = (mb0.a) a0Var.f53131e.f63225b;
                buildAndStart.a(aVar6, new h9(27), aVar6.a());
                w60.d dVar = a0Var.f53130d;
                buildAndStart.a(dVar, new h9(28), dVar.a());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        ct0.u uVar;
        a7.b0 b0Var;
        a7.d0 d0Var;
        int i13 = this.f84309i;
        boolean z13 = false;
        Object obj2 = this.f84310j;
        switch (i13) {
            case 0:
                rl1.q it = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                z40.d0 d0Var2 = (z40.d0) obj2;
                String H = f0.h.H(d0Var2);
                Integer n13 = d0Var2.n();
                return rl1.q.e(it, null, H, false, null, null, false, false, null, 0, n13 == null ? rl1.b.f108524a : new rl1.d(n13.intValue()), null, 1533);
            case 1:
                h32.h0 update = (h32.h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = ((yq0.g0) obj2).f139696d;
                return Unit.f80348a;
            case 2:
                yc0 it2 = (yc0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                List boards = ((yc0) ((qx.b) obj2).f105312b).h();
                it2.getClass();
                Intrinsics.checkNotNullParameter(boards, "boards");
                it2.h().addAll(0, boards);
                return it2;
            case 3:
                return e((rn1.a) obj);
            case 4:
                yb0.d dismissReason = (yb0.d) obj;
                Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
                switch (ur0.c.f123065a[dismissReason.ordinal()]) {
                    case 1:
                        str = "outside_touch";
                        break;
                    case 2:
                        str = "back_button_click";
                        break;
                    case 3:
                        str = "showing_another";
                        break;
                    case 4:
                        str = "confirm_button_click";
                        break;
                    case 5:
                        str = "cancel_button_click";
                        break;
                    case 6:
                        str = "explicit_directive";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ((rg0.n) obj2).d(kotlin.collections.y0.b(new Pair("dismiss_trigger", str)));
                return Unit.f80348a;
            case 5:
                wr0.s sVar = (wr0.s) ((wr0.f) ((wr0.w) obj2).getView());
                i92.k kVar = sVar.A0;
                if (kVar != null) {
                    kVar.i(sVar.getResources().getString(m60.x0.generic_error));
                    return Unit.f80348a;
                }
                Intrinsics.r("toastUtils");
                throw null;
            case 6:
                vd0.c pinterestJsonObject = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "it");
                EngagementTabRetrofitRemoteRequest engagementTabRetrofitRemoteRequest = (EngagementTabRetrofitRemoteRequest) obj2;
                engagementTabRetrofitRemoteRequest.getClass();
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                String bookmark = pinterestJsonObject.o("bookmark", "");
                Intrinsics.checkNotNullExpressionValue(bookmark, "optString(...)");
                Object a13 = vd0.c.a(pinterestJsonObject.f125623a.v("data"));
                Intrinsics.g(a13, "null cannot be cast to non-null type com.pinterest.customjson.PinterestJsonObject");
                vd0.a array = ((vd0.c) a13).c("results");
                if (array == null) {
                    array = new vd0.a();
                }
                Intrinsics.checkNotNullParameter(array, "array");
                Intrinsics.checkNotNullParameter(bookmark, "bookmark");
                ArrayList arrayList = new ArrayList();
                Iterator it3 = array.iterator();
                while (it3.hasNext()) {
                    vd0.c cVar = (vd0.c) it3.next();
                    ke0.a aVar = engagementTabRetrofitRemoteRequest.getRegisteredDeserializers().get("trackedcomment");
                    if (aVar != null) {
                        Intrinsics.f(cVar);
                        dl1.s d2 = aVar.d(cVar);
                        if (d2 != null) {
                            arrayList.add(d2);
                        }
                    }
                    throw new IllegalArgumentException("Cannot deserialize type trackedcomment");
                    break;
                }
                return new com.pinterest.framework.multisection.datasource.pagedlist.i0(bookmark, null, arrayList);
            case 7:
                return e((rn1.a) obj);
            case 8:
                wy0 wy0Var = (wy0) obj;
                fs0.i iVar = (fs0.i) obj2;
                iVar.q3();
                Intrinsics.f(wy0Var);
                iVar.f62852e.d(new pg0.c(wy0Var, iVar.f62848a, 6));
                return Unit.f80348a;
            case 9:
                return e((rn1.a) obj);
            case 10:
                on1.i it4 = (on1.i) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                cs0.f fVar = (cs0.f) obj2;
                if (fVar != null) {
                    boolean z14 = it4 instanceof on1.g;
                    fs0.w wVar = (fs0.w) fVar;
                    String str2 = wVar.K;
                    if (str2 == null) {
                        Intrinsics.r("pinUid");
                        throw null;
                    }
                    xj2.c F = wVar.f62902a.P(str2).F(new fs0.q(7, new r1.f(wVar, z14, 18)), new fs0.q(8, new fs0.s(wVar, 3)), ck2.i.f27923c, ck2.i.f27924d);
                    if (wVar.isBound()) {
                        wVar.addDisposable(F);
                    }
                }
                return Unit.f80348a;
            case 11:
                return e((rn1.a) obj);
            case 12:
                yl1.l bind = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String string = ((ps0.g) obj2).getContext().getString(wp1.f.reload_button_text_calico);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                bind.d(string);
                return Unit.f80348a;
            case 13:
                on1.b it5 = (on1.b) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                xs0.a aVar2 = (xs0.a) obj2;
                boolean z15 = aVar2.f135771f;
                boolean z16 = aVar2.f135777l;
                return on1.b.e(it5, z15, z16, d7.b.Z(z16), 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
            case 14:
                Intrinsics.checkNotNullParameter((om1.c) obj, "it");
                return ((xs0.q) obj2).f135836c;
            case 15:
                f((l82.n) obj);
                return Unit.f80348a;
            case 16:
                mb factory = (mb) obj;
                Intrinsics.checkNotNullParameter(factory, "factory");
                String uid = com.bumptech.glide.d.Q(((bt0.j) obj2).getActiveUserManager()).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                qb qbVar = factory.f113554a;
                return new bt0.v(com.pinterest.widget.configuration.k.h(qbVar.f114076a.f113603b), (ao2.j0) qbVar.f114078c.f114104c.get(), (k22.m) qbVar.f114076a.Y4.get(), uid);
            case 17:
                f((l82.n) obj);
                return Unit.f80348a;
            case 18:
                o12.b response = (o12.b) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List<dl1.s> list = response.f92783a;
                ct0.d dVar = (ct0.d) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (dl1.s sVar2 : list) {
                    if (!((sVar2 instanceof zs) && dVar.f53142c && !((zs) sVar2).C().booleanValue()) && dVar.f53142c) {
                        uVar = null;
                    } else {
                        Intrinsics.g(sVar2, "null cannot be cast to non-null type com.pinterest.api.model.Interest");
                        uVar = new ct0.u((zs) sVar2);
                    }
                    if (uVar != null) {
                        arrayList2.add(uVar);
                    }
                }
                return new o82.l0(arrayList2, response.f92784b);
            case 19:
                f((l82.n) obj);
                return Unit.f80348a;
            case 20:
                int intValue = ((Number) obj).intValue();
                int i14 = dt0.n.S0;
                ((dt0.n) obj2).k9().f56235h.e().a(new dt0.d(intValue));
                return Unit.f80348a;
            case 21:
                return b((dt0.a0) obj);
            case 22:
                dt0.a it6 = (dt0.a) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return dt0.a.e(it6, 0, 0, null, !((dt0.a) obj2).f56223e, 15);
            case 23:
                return b((dt0.a0) obj);
            case 24:
                f((l82.n) obj);
                return Unit.f80348a;
            case 25:
                String str3 = (String) obj;
                ss0.a aVar3 = (ss0.a) obj2;
                Intrinsics.f(str3);
                aVar3.G = StringsKt.i0(str3).toString();
                aVar3.i2();
                return Unit.f80348a;
            case 26:
                rt0.b model = (rt0.b) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                if (!model.f109952d) {
                    qt0.c cVar2 = (qt0.c) obj2;
                    LegacyPlayerView legacyPlayerView = cVar2.f105136a.B0;
                    if (legacyPlayerView == null) {
                        Intrinsics.r("cameraPlaybackView");
                        throw null;
                    }
                    legacyPlayerView.y(null);
                    cVar2.e();
                    if (model.j()) {
                        tt0.l0 l0Var = cVar2.f105136a;
                        m7.l0 a14 = new m7.x(l0Var.requireContext()).a();
                        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                        a14.b0(model.r(), model.q(), false);
                        a14.L0();
                        a14.Z = 2;
                        a14.x0(2, 2, 4);
                        x1 x1Var = x1.f86480c;
                        a14.L0();
                        if (x1Var == null) {
                            x1Var = x1.f86481d;
                        }
                        if (!a14.N.equals(x1Var)) {
                            a14.N = x1Var;
                            a14.f86275m.f86417h.b(5, x1Var).b();
                        }
                        a14.M(cVar2.f105140e);
                        ArrayList arrayList3 = model.f109957i;
                        ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
                        Iterator it7 = arrayList3.iterator();
                        while (it7.hasNext()) {
                            bo0 bo0Var = (bo0) it7.next();
                            a7.w wVar2 = new a7.w();
                            a7.z zVar = new a7.z();
                            List emptyList = Collections.emptyList();
                            v2 v2Var = v2.f100502e;
                            a7.b0 b0Var2 = new a7.b0();
                            a7.e0 e0Var = a7.e0.f982d;
                            k01 videoItem = bo0Var.getVideoItem();
                            Intrinsics.f(videoItem);
                            bf.b.t((zVar.f1244b == null || zVar.f1243a != null) ? true : z13);
                            Uri uri = videoItem.f41101b;
                            if (uri != null) {
                                b0Var = b0Var2;
                                d0Var = new a7.d0(uri, null, zVar.f1243a != null ? new a7.a0(zVar) : null, emptyList, null, v2Var, null, -9223372036854775807L);
                            } else {
                                b0Var = b0Var2;
                                d0Var = null;
                            }
                            arrayList4.add(new a7.i0("", new a7.y(wVar2), d0Var, new a7.c0(b0Var), a7.l0.I, e0Var));
                            z13 = false;
                        }
                        a14.W(arrayList4);
                        a14.b();
                        LegacyPlayerView legacyPlayerView2 = l0Var.B0;
                        if (legacyPlayerView2 == null) {
                            Intrinsics.r("cameraPlaybackView");
                            throw null;
                        }
                        legacyPlayerView2.y(a14);
                        cVar2.f105139d = a14;
                    }
                }
                return Unit.f80348a;
            case 27:
                ag1.k it8 = (ag1.k) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ag1.k.a(it8, null, null, null, (ag1.i) obj2, null, 95);
            case 28:
                bo0 mediaItem = (bo0) obj;
                Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
                return bo0.a(mediaItem, null, 0L, 0L, (Matrix) obj2, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
            default:
                List<cw0.a> creationFonts = (List) obj;
                Intrinsics.f(creationFonts);
                IdeaPinFontPicker ideaPinFontPicker = (IdeaPinFontPicker) ((com.pinterest.feature.ideaPinCreation.closeup.view.h0) obj2);
                ideaPinFontPicker.getClass();
                Intrinsics.checkNotNullParameter(creationFonts, "creationFonts");
                LinearLayout linearLayout = ideaPinFontPicker.f46003f;
                if (linearLayout.getChildCount() < creationFonts.size()) {
                    linearLayout.removeAllViews();
                    for (cw0.a aVar4 : creationFonts) {
                        CheckedTextView checkedTextView = new CheckedTextView(ideaPinFontPicker.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        checkedTextView.setPaddingRelative(0, 0, 0, ideaPinFontPicker.f46002e);
                        checkedTextView.setLayoutParams(layoutParams);
                        checkedTextView.setGravity(16);
                        checkedTextView.setTextSize(2, 20.0f);
                        int i15 = ideaPinFontPicker.f46000c;
                        checkedTextView.setTextColor(i15);
                        checkedTextView.setText(aVar4.f53330e);
                        checkedTextView.setTypeface(Typeface.createFromFile(aVar4.f53331f));
                        String str4 = ideaPinFontPicker.f46006i;
                        String str5 = aVar4.f53326a;
                        if (Intrinsics.d(str5, str4)) {
                            checkedTextView.setCheckMarkDrawable(ideaPinFontPicker.f46001d);
                            checkedTextView.getCheckMarkDrawable().setTint(i15);
                        }
                        checkedTextView.setTag(aq1.d.idea_pin_font_id, str5);
                        checkedTextView.setOnClickListener(new xa0.m(24, ideaPinFontPicker, aVar4));
                        linearLayout.addView(checkedTextView);
                    }
                }
                return Unit.f80348a;
        }
    }
}
