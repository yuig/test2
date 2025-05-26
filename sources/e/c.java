package e;

import a.z0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.TextureView;
import ao2.j0;
import b4.m0;
import b4.p0;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import e0.t;
import e82.a0;
import h32.u0;
import h4.f0;
import h4.o;
import h4.y;
import i1.n1;
import i1.o1;
import i1.r0;
import i1.x;
import i2.s0;
import i2.v3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kh2.m2;
import kh2.r;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import m60.x0;
import n72.m;
import nt.a1;
import nt.d1;
import nx.d0;
import p91.c0;
import q4.w;
import q4.z;
import r1.e0;
import r72.q1;
import ra0.u;
import ra0.v;
import t3.e4;
import t3.f2;
import w1.a2;
import w1.l1;
import w1.r2;
import xk2.q;
import y1.b0;
import y1.g0;
import y1.n;
import z9.p;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56664i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f56665j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f56666k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f56667l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f56668m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f56669n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        super(1);
        this.f56664i = i13;
        this.f56665j = obj;
        this.f56666k = obj2;
        this.f56667l = obj3;
        this.f56668m = obj4;
        this.f56669n = obj5;
    }

    public final s0 b() {
        int i13 = this.f56664i;
        Object obj = this.f56669n;
        Object obj2 = this.f56668m;
        Object obj3 = this.f56666k;
        Object obj4 = this.f56665j;
        switch (i13) {
            case 0:
                a aVar = (a) obj4;
                aVar.f56661a = ((g.g) obj3).e((String) this.f56667l, (h.a) obj2, new z0((v3) obj, 2));
                return new b(aVar, 0);
            default:
                w wVar = (w) obj4;
                wVar.f102372l.addView(wVar, wVar.f102373m);
                wVar.o((Function0) obj3, (z) obj2, (n4.k) obj);
                return new b(wVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m0 m0Var;
        List list;
        float f13;
        SpannableStringBuilder spannableStringBuilder;
        Object m13;
        yk1.a aVar;
        g70.h hVar;
        i92.k kVar;
        ApplicationInfo applicationInfo;
        int i13 = 8;
        int i14 = this.f56664i;
        int i15 = 1;
        Object obj2 = this.f56669n;
        Object obj3 = this.f56667l;
        Object obj4 = this.f56668m;
        Object obj5 = this.f56666k;
        Object obj6 = this.f56665j;
        switch (i14) {
            case 0:
                return b();
            case 1:
                s3.m0 m0Var2 = (s3.m0) ((d3.e) obj);
                m0Var2.a();
                float h10 = ((n) obj6).f136592b.h();
                if (h10 != 0.0f) {
                    long j13 = ((f0) obj3).f67560b;
                    int i16 = p0.f21640c;
                    int b13 = ((y) obj5).b((int) (j13 >> 32));
                    r2 d2 = ((l1) obj4).d();
                    a3.d dVar = (d2 == null || (m0Var = d2.f127471a) == null) ? new a3.d(0.0f, 0.0f, 0.0f, 0.0f) : m0Var.c(b13);
                    float l03 = m0Var2.l0(a2.f127150a);
                    float f14 = l03 / 2;
                    float a13 = ql2.s.a(ql2.s.c(dVar.f484a + f14, a3.f.d(m0Var2.f110840a.g()) - f14), f14);
                    d3.h.q0(m0Var2, (b3.s) obj2, com.bumptech.glide.c.d(a13, dVar.f485b), com.bumptech.glide.c.d(a13, dVar.f487d), l03, h10, 432);
                }
                return Unit.f80348a;
            case 2:
                g0 g0Var = (g0) obj;
                b0 b0Var = ((y1.g) obj5).f136540a;
                g0Var.f136566h = (f0) obj6;
                g0Var.f136567i = (o) obj3;
                g0Var.f136561c = (Function1) obj4;
                g0Var.f136562d = (Function1) obj2;
                g0Var.f136563e = b0Var != null ? ((y1.z) b0Var).f136611o : null;
                g0Var.f136564f = b0Var != null ? ((y1.z) b0Var).f136612p : null;
                g0Var.f136565g = b0Var != null ? (e4) com.bumptech.glide.c.w((y1.z) b0Var, f2.f115994q) : null;
                return Unit.f80348a;
            case 3:
                return b();
            case 4:
                z9.k entry = (z9.k) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                ((kotlin.jvm.internal.f0) obj6).f80424a = true;
                List list2 = (List) obj5;
                int indexOf = list2.indexOf(entry);
                if (indexOf != -1) {
                    h0 h0Var = (h0) obj3;
                    int i17 = indexOf + 1;
                    list = list2.subList(h0Var.f80426a, i17);
                    h0Var.f80426a = i17;
                } else {
                    list = q0.f80391a;
                }
                ((p) obj4).a(entry.f141211b, (Bundle) obj2, entry, list);
                return Unit.f80348a;
            case 5:
                x xVar = (x) ((i1.s) obj);
                if (!((List) ((v3) obj2).getValue()).contains(xVar.c())) {
                    return r.u1(n1.f70854b, o1.f70858b);
                }
                Map map = (Map) obj6;
                Float f15 = (Float) map.get(((z9.k) xVar.c()).f141215f);
                if (f15 != null) {
                    f13 = f15.floatValue();
                } else {
                    map.put(((z9.k) xVar.c()).f141215f, Float.valueOf(0.0f));
                    f13 = 0.0f;
                }
                if (!Intrinsics.d(((z9.k) xVar.a()).f141215f, ((z9.k) xVar.c()).f141215f)) {
                    f13 = ((Boolean) ((ba.i) obj5).f22269c.getValue()).booleanValue() ? f13 - 1.0f : f13 + 1.0f;
                }
                float f16 = f13;
                map.put(((z9.k) xVar.a()).f141215f, Float.valueOf(f16));
                return new r0((n1) ((Function1) obj3).invoke(xVar), (o1) ((Function1) obj4).invoke(xVar), f16, 8);
            case 6:
                v7 v7Var = (v7) obj;
                if (v7Var != null) {
                    wy0 f17 = ((b60.d) ((b60.b) obj6)).f();
                    wy0 wy0Var = (wy0) obj5;
                    boolean d13 = Intrinsics.d(f17 != null ? f17.getUid() : null, wy0Var.getUid());
                    Intrinsics.checkNotNullParameter(v7Var, "<this>");
                    if (!kotlin.text.z.i(v7Var.o1(), "protected", true)) {
                        String string = d13 ? ((GestaltText) obj3).getResources().getString(n80.f.pin_attribution_you_and_board) : ((GestaltText) obj3).getResources().getString(n80.f.pin_attribution_pinner_name_and_board);
                        Intrinsics.f(string);
                        String j14 = v7Var.j1();
                        Intrinsics.checkNotNullExpressionValue(j14, "getName(...)");
                        int L = StringsKt.L(string, "%1$s", 0, false, 6);
                        int L2 = StringsKt.L(string, "%2$s", 0, false, 6);
                        if (L != -1) {
                            String Z2 = wy0Var.Z2();
                            String str = Z2 != null ? Z2 : "";
                            if (L < L2) {
                                L2 = (str.length() + L2) - 4;
                            } else {
                                L = (j14.length() + L) - 4;
                            }
                            spannableStringBuilder = new SpannableStringBuilder(j1.Y(string, new Object[]{str, j14}, null, 6));
                            Context context = ((GestaltText) obj3).getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            f0.h.m(context, spannableStringBuilder, L, str.length() + L, (cf0.b) obj4);
                        } else {
                            spannableStringBuilder = new SpannableStringBuilder(j1.Y(string, new Object[]{null, j14}, null, 6));
                        }
                        GestaltText gestaltText = (GestaltText) obj3;
                        Context context2 = gestaltText.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        f0.h.m(context2, spannableStringBuilder, L2, j14.length() + L2, (cf0.b) obj2);
                        gestaltText.i(new zp.s0(spannableStringBuilder, 9));
                    } else if (d13) {
                        ((GestaltText) obj3).i(sq.a.f114957m);
                    } else {
                        GestaltText gestaltText2 = (GestaltText) obj3;
                        Context context3 = gestaltText2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        String string2 = gestaltText2.getResources().getString(n80.f.pin_attribution_pinner_name_saved_pin);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        String Z22 = wy0Var.Z2();
                        gestaltText2.i(new zp.s0(f0.h.B(context3, string2, "%1$s", Z22 == null ? "" : Z22, -1, (cf0.b) obj4), i13));
                    }
                    if (((cf0.b) obj4) != null) {
                        ((GestaltText) obj3).i(sq.a.f114958n);
                    }
                    ((GestaltText) obj3).setOnLongClickListener(new rq.n(3));
                }
                return Unit.f80348a;
            case 7:
                Intrinsics.checkNotNullParameter((em1.c) obj, "it");
                ((GestaltText) obj6).i(d1.f92003k);
                a1 a1Var = (a1) obj5;
                if (a1Var.f91979c) {
                    a1Var.f91979c = false;
                    u50.r rVar = (u50.r) obj3;
                    if (rVar != null) {
                        rVar.a(new nt.g0(((CharSequence) obj2).toString(), (u0) obj4));
                    }
                }
                return Unit.f80348a;
            case 8:
                em1.d it = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context4 = ((GestaltCheckBox) obj6).getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int i18 = ps.s.signup_disclosure_v2;
                CharSequence[] charSequenceArr = new CharSequence[3];
                String str2 = (String) obj3;
                charSequenceArr[0] = str2 != null ? str2 : "";
                charSequenceArr[1] = (String) obj5;
                charSequenceArr[2] = (String) obj4;
                return em1.d.e(it, null, null, fm1.c.VISIBLE, bs1.c.h2(((Object) m2.C0(context4, i18, charSequenceArr)) + ((String) obj2)), null, null, 10, null, false, 0, 947);
            case 9:
                TextureView it2 = (TextureView) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Object tag = it2.getTag();
                Intrinsics.g(tag, "null cannot be cast to non-null type com.pinterest.shuffles.scene.SceneViewHandle");
                x72.j jVar = (x72.j) tag;
                String colorString = ((q1) obj6).f106626a;
                if (colorString != null) {
                    id2.b bVar = id2.c.Companion;
                    try {
                        q qVar = xk2.s.f135225b;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(colorString, "colorString");
                        m13 = id2.b.a(Color.parseColor(colorString));
                    } catch (Throwable th3) {
                        q qVar2 = xk2.s.f135225b;
                        m13 = ue.c.m(th3);
                    }
                    if (!(m13 instanceof xk2.r)) {
                        id2.c cVar = (id2.c) m13;
                        ke2.c f52894a = jVar.getF52894a();
                        f52894a.getClass();
                        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
                        f52894a.f79315g = cVar;
                    }
                }
                com.pinterest.shuffles.scene.composer.y yVar = new com.pinterest.shuffles.scene.composer.y(jVar, (j0) obj5, (m) obj3);
                yVar.e((com.pinterest.shuffles.scene.composer.z0) obj4);
                com.pinterest.shuffles.scene.composer.y.r(yVar, (List) obj2);
                return Unit.f80348a;
            case 10:
                e0 LazyHorizontalGrid = (e0) obj;
                Intrinsics.checkNotNullParameter(LazyHorizontalGrid, "$this$LazyHorizontalGrid");
                h0 h0Var2 = new h0();
                u uVar = (u) obj6;
                List list3 = uVar.f107006a;
                ra0.r rVar2 = ra0.r.f106983j;
                int size = list3.size();
                u80.s sVar = new u80.s(i15, list3, rVar2);
                ra0.s sVar2 = new ra0.s(list3, uVar, (v) obj5, h0Var2, (Function0) obj3, (Function0) obj4, (Function1) obj2);
                Object obj7 = q2.i.f102113a;
                ((r1.l) LazyHorizontalGrid).s(size, null, null, sVar, new q2.h(sVar2, true, 699646206));
                return Unit.f80348a;
            case 11:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                if (!bool.booleanValue()) {
                    PinCloseupPresenter pinCloseupPresenter = (PinCloseupPresenter) obj6;
                    aVar = pinCloseupPresenter.viewResources;
                    String string3 = aVar.f139224a.getString(n80.f.quicksave_toast_subheader);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String str3 = (String) ((kotlin.jvm.internal.j0) obj4).f80434a;
                    String uid = ((f30) obj2).getUid();
                    hVar = pinCloseupPresenter.boardNavigator;
                    lr.l lVar = new lr.l((String) obj3, (String) obj5, str3, string3, uid, hVar);
                    kVar = pinCloseupPresenter.toastUtils;
                    i92.k.d(kVar, lVar);
                    if (ig1.b.h0() && pinCloseupPresenter.isBound()) {
                        PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter);
                        if (pinCloseupFragment.Y1 == null) {
                            pinCloseupFragment.Y1 = MediaPlayer.create(pinCloseupFragment.getContext(), xb2.c.success_2);
                        }
                        MediaPlayer mediaPlayer = pinCloseupFragment.Y1;
                        if (mediaPlayer != null) {
                            mediaPlayer.start();
                        }
                    }
                }
                return Unit.f80348a;
            case 12:
                String recaptchaV3Token = (String) obj;
                Intrinsics.checkNotNullParameter(recaptchaV3Token, "recaptchaV3Token");
                c0 c0Var = (c0) obj6;
                cr1.a aVar2 = c0Var.f99262b;
                String str4 = (String) obj3;
                if (c0Var.f99261a != l91.f.UPDATE) {
                    str4 = null;
                }
                return aVar2.s(str4, (String) obj5, (String) obj4, (String) obj2, recaptchaV3Token).r(tk2.e.f118017c);
            case 13:
                Throwable th4 = (Throwable) obj;
                Intrinsics.f(th4);
                if (r91.b.c(th4)) {
                    xb1.f fVar = (xb1.f) obj6;
                    if (fVar.isBound()) {
                        ((com.pinterest.feature.settings.permissions.b) fVar.getView()).y6(new aw0.j(fVar, (wb1.l) obj5, (bd1.b) obj4, this.f56669n, 15));
                        return Unit.f80348a;
                    }
                }
                if (r91.b.d(th4)) {
                    xb1.f fVar2 = (xb1.f) obj6;
                    if (fVar2.isBound()) {
                        ((com.pinterest.feature.settings.permissions.b) fVar2.getView()).z3(new q4.h((yk1.p) fVar2, (dl1.s) obj5, (Enum) obj4, this.f56669n, (String) obj3, 6));
                    }
                }
                return Unit.f80348a;
            case 14:
                z2 z2Var = (z2) obj;
                qh1.e eVar = (qh1.e) obj6;
                m60.w wVar = eVar.f103900a;
                Intrinsics.f(z2Var);
                rp0.b bVar2 = new rp0.b(z2Var);
                f30 f30Var = (f30) obj5;
                String g13 = b40.g(f30Var);
                String uid2 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                wVar.d(new pg0.f(bVar2, g13, uid2));
                eVar.f103906g.remove("PREF_COMMENT_COMPOSER_DRAFT");
                String uid3 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                qh1.e.a(eVar, (d0) obj3, (uk1.d) obj4, uid3);
                Function1 function1 = (Function1) obj2;
                if (function1 != null) {
                    function1.invoke(new rp0.b(z2Var));
                }
                return Unit.f80348a;
            case 15:
                wy0 sender = (wy0) obj;
                Intrinsics.checkNotNullParameter(sender, "sender");
                Boolean s43 = sender.s4();
                Intrinsics.checkNotNullExpressionValue(s43, "getShouldShowMessaging(...)");
                if (s43.booleanValue()) {
                    ((xj2.b) obj5).a(uj2.b.n(2L, TimeUnit.SECONDS, tk2.e.f118016b).l(tk2.e.f118017c).h(wj2.c.a()).i(new oo1.c(oo1.j.l(sender), (no1.e) obj4, sender, (String) obj3, (f30) obj6, (Function0) obj2), new dl1.c(17, oo1.g.f96849r)));
                }
                return Unit.f80348a;
            case 16:
                Object obj8 = new qz.d((vd0.c) obj).f105381a;
                if (obj8 instanceof vd0.c) {
                    e82.h0 h0Var3 = (e82.h0) obj6;
                    vd0.c cVar2 = (vd0.c) obj8;
                    u0[] u0VarArr = e82.h0.f57856i;
                    h0Var3.getClass();
                    Intent a14 = e82.h0.a(cVar2);
                    String str5 = (String) obj3;
                    if (Intrinsics.d(str5, "com.samsung.android.messaging")) {
                        a14.removeExtra("android.intent.extra.SUBJECT");
                    }
                    String o13 = cVar2.o("invite_code", "");
                    Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
                    Context context5 = (Context) obj5;
                    SendableObject sendableObject = (SendableObject) obj4;
                    p32.c cVar3 = (p32.c) obj2;
                    a14.setPackage(str5);
                    try {
                        context5.startActivity(a14);
                        h0Var3.k(str5);
                        p32.f a15 = a0.a(str5);
                        Intrinsics.checkNotNullExpressionValue(a15, "getInviteChannelFromAppPackage(...)");
                        h0Var3.i(sendableObject, cVar3, a15, t.f56747e, o13);
                        t.M0(t.f56747e, h0Var3.f57863e);
                    } catch (Exception unused) {
                        a14.toString();
                        try {
                            applicationInfo = context5.getPackageManager().getApplicationInfo(str5, 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            applicationInfo = null;
                        }
                        h0Var3.f57861c.i(context5.getResources().getString(x0.cannot_share_via_channel, applicationInfo != null ? (String) context5.getPackageManager().getApplicationLabel(applicationInfo) : null));
                    }
                }
                return Unit.f80348a;
            default:
                List widgetPins = (List) obj;
                Intrinsics.checkNotNullParameter(widgetPins, "widgetPins");
                ArrayList l04 = CollectionsKt.l0(widgetPins, (List) obj6);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj9 : l04) {
                    if (hashSet.add(((xc2.j) obj9).f134556a)) {
                        arrayList.add(obj9);
                    }
                }
                xc2.q qVar3 = (xc2.q) obj5;
                int size2 = qVar3.f134574c < arrayList.size() ? qVar3.f134574c : arrayList.size();
                List<xc2.j> subList = arrayList.subList(0, size2);
                List boardPinList = arrayList.subList(size2, arrayList.size());
                xc2.w wVar2 = (xc2.w) obj4;
                String boardId = (String) obj3;
                wVar2.f134588c.getClass();
                Intrinsics.checkNotNullParameter(boardId, "boardId");
                Intrinsics.checkNotNullParameter(boardPinList, "boardPinList");
                ((lb0.b) lb0.n.f82725d.a()).n(j1.U("widget_board_data_%s", new Object[]{boardId}), new nm.o().k(boardPinList));
                Integer num = (Integer) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (xc2.j jVar2 : subList) {
                    Intrinsics.f(num);
                    Bitmap a16 = xc2.w.a(wVar2, num.intValue(), jVar2.f134557b, qVar3.f134577f);
                    xc2.i iVar = a16 != null ? new xc2.i(a16, jVar2.f134556a) : null;
                    if (iVar != null) {
                        arrayList2.add(iVar);
                    }
                }
                return new xc2.t("BOARD", y0.b(new Pair(num, arrayList2)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, String str, Object obj4, int i13) {
        super(1);
        this.f56664i = i13;
        this.f56665j = obj;
        this.f56666k = obj2;
        this.f56668m = obj3;
        this.f56667l = str;
        this.f56669n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, String str, Object obj2, Object obj3, Object obj4, int i13) {
        super(1);
        this.f56664i = i13;
        this.f56665j = obj;
        this.f56667l = str;
        this.f56666k = obj2;
        this.f56668m = obj3;
        this.f56669n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, f30 f30Var, xj2.b bVar, no1.e eVar, w01.j jVar) {
        super(1);
        this.f56664i = 15;
        this.f56667l = str;
        this.f56665j = f30Var;
        this.f56666k = bVar;
        this.f56668m = eVar;
        this.f56669n = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xb1.f fVar, wb1.l lVar, bd1.b bVar, Object obj, String str) {
        super(1);
        this.f56664i = 13;
        this.f56665j = fVar;
        this.f56666k = lVar;
        this.f56668m = bVar;
        this.f56669n = obj;
        this.f56667l = str;
    }
}
