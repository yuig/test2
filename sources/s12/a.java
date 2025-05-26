package s12;

import androidx.appcompat.widget.c2;
import bs1.c;
import c50.w2;
import ck2.i;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.my0;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import d92.o0;
import df.j1;
import dl1.u;
import do1.n;
import do1.x;
import gx.e;
import h32.h0;
import i92.f;
import i92.g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l62.a0;
import m62.v0;
import n72.j;
import n72.k;
import n72.m;
import o82.b3;
import o82.i3;
import r72.b1;
import r72.m1;
import r72.q1;
import r72.u1;
import r72.x1;
import r72.z1;
import rg0.k0;
import ro2.c0;
import ro2.d0;
import ro2.o;
import tb0.h;
import tb0.p;
import u50.f0;
import u52.c1;
import u52.l;
import u52.n0;
import w60.d;
import x02.m2;
import y52.j0;
import y52.z0;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110594i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f110595j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i13) {
        super(1);
        this.f110594i = i13;
        this.f110595j = obj;
    }

    public final void b(x bind) {
        int i13 = this.f110594i;
        Object obj = this.f110595j;
        switch (i13) {
            case 27:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                f fVar = (f) obj;
                String str = fVar.f71928d;
                if (str == null) {
                    str = "";
                }
                Intrinsics.checkNotNullExpressionValue(str, "orEmpty(...)");
                f0 text = c.h2(str);
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f55704a = text;
                n variant = n.ERROR;
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind.f55707d = variant;
                bind.f55709f = fVar.f71929e;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                g gVar = (g) obj;
                CharSequence a03 = j1.a0(gVar.f71928d);
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                f0 text2 = c.h2(a03);
                bind.getClass();
                Intrinsics.checkNotNullParameter(text2, "text");
                bind.f55704a = text2;
                bind.f55710g = Integer.MAX_VALUE;
                bind.f55709f = gVar.f71929e;
                break;
        }
    }

    public final void e(Throwable throwable) {
        int i13 = this.f110594i;
        Object obj = this.f110595j;
        switch (i13) {
            case 12:
                h hVar = (h) ((e) obj).f66247c;
                Intrinsics.f(throwable);
                hVar.q(throwable, "GetShareLinkPerformerSEP: inviteUserExternal failed", p.BOARD_INVITE);
                break;
            case 13:
                h hVar2 = (h) ((p70.e) obj).f99074d;
                Intrinsics.f(throwable);
                hVar2.q(throwable, "ShareBoardVideoLoggingSEP: inviteUserExternalSent failed", p.BOARD_INVITE);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                a0 a0Var = (a0) obj;
                a0Var.f81616b.post(new a11.p(25, a0Var, throwable));
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ((m) ((c2) obj).f16534e).e(throwable);
                break;
        }
    }

    public final void f(l82.n start) {
        int i13 = this.f110594i;
        Object obj = this.f110595j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                s52.s sVar = (s52.s) obj;
                mb0.a aVar = (mb0.a) sVar.f111210j.f63225b;
                start.a(aVar, new w2(6), "ShareBoardPinSelectionSheet_".concat(aVar.a()));
                nu.a aVar2 = sVar.f111206f;
                start.a(aVar2, new w2(7), aVar2.a());
                d dVar = sVar.f111207g;
                start.a(dVar, new w2(8), dVar.a());
                i60.a aVar3 = sVar.f111208h;
                start.a(aVar3, new w2(9), aVar3.a());
                break;
            case 11:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                u52.p pVar = (u52.p) obj;
                v52.d dVar2 = pVar.f120721e;
                start.a(dVar2, new w2(11), dVar2.a());
                d dVar3 = pVar.f120720d;
                start.a(dVar3, new w2(12), dVar3.a());
                z01.e eVar = pVar.f120722f;
                start.a(eVar, new w2(10), eVar.a());
                i60.a aVar4 = pVar.f120723g;
                start.a(aVar4, new w2(13), aVar4.a());
                break;
            case 14:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                j0 j0Var = (j0) obj;
                e eVar2 = j0Var.f137811c;
                start.a(eVar2, new w2(14), eVar2.a());
                nu.a aVar5 = j0Var.f137813e;
                start.a(aVar5, new w2(17), aVar5.a());
                mb0.a aVar6 = j0Var.f137812d;
                start.a(aVar6, new w2(18), aVar6.a());
                mb0.a aVar7 = j0Var.f137814f;
                start.a(aVar7, new w2(15), aVar7.a());
                p70.e eVar3 = j0Var.f137815g;
                start.a(eVar3, new w2(19), eVar3.a());
                d dVar4 = j0Var.f137816h;
                start.a(dVar4, new w2(20), dVar4.a());
                y52.c cVar = j0Var.f137817i;
                start.a(cVar, new w2(16), cVar.a());
                z0 z0Var = j0Var.f137818j;
                start.a(z0Var, new w2(21), z0Var.a());
                break;
            case 22:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                l82.n.b(start, (w72.e) ((v72.a0) obj).f124400c);
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, ((o0) obj).f54180c);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f110594i;
        Object obj2 = this.f110595j;
        switch (i13) {
            case 0:
                f3 it = (f3) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                b bVar = (b) obj2;
                wy0 f13 = ((b60.d) bVar.f110598c).f();
                if (f13 != null) {
                    int intValue = f13.c4().intValue() - 1;
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    vy0 H4 = f13.H4();
                    H4.f43043g1 = Integer.valueOf(intValue);
                    boolean[] zArr = H4.V1;
                    if (zArr.length > 110) {
                        zArr[110] = true;
                    }
                    wy0 a13 = H4.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    bVar.f110597b.W(a13);
                }
                return Unit.f80348a;
            case 1:
                my0 urlInfo = (my0) obj;
                Intrinsics.checkNotNullParameter(urlInfo, "urlInfo");
                u uVar = (u) obj2;
                String str = urlInfo.f40259b;
                Intrinsics.checkNotNullExpressionValue(str, "getUrl(...)");
                urlInfo.f40259b = str.length() == 0 ? ((m2) uVar).f131448d : urlInfo.f40259b;
                return urlInfo;
            case 2:
                Boolean it2 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return (ln0) obj2;
            case 3:
                ((i22.b) obj2).f71444d = (ln0) obj;
                return Unit.f80348a;
            case 4:
                h42.a it3 = (h42.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return h42.a.e(it3, null, ((h42.c) ((h42.d) obj2)).f67647a, 13);
            case 5:
                String playIntegrityToken = (String) obj;
                Intrinsics.checkNotNullParameter(playIntegrityToken, "playIntegrityToken");
                uj2.b a14 = ((b20.d) ((r42.g) obj2).f106190a.f21278a).a(null, null, playIntegrityToken);
                bk.f fVar = i.f27926f;
                a14.getClass();
                return new fk2.c(1, a14, fVar).l(tk2.e.f118017c);
            case 6:
                String it4 = (String) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Boolean.valueOf(Intrinsics.d(it4, ((r52.a) obj2).f106256a.getUid()));
            case 7:
                f((l82.n) obj);
                return Unit.f80348a;
            case 8:
                yl1.b it5 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return yl1.b.f(it5, c.p2(((k0) obj2).f108045e), false, null, null, null, null, null, null, 0, null, 1022);
            case 9:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = ((l) obj2).f120713j0;
                return Unit.f80348a;
            case 10:
                u52.x it6 = (u52.x) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return u52.x.e(it6, null, null, new c1(it6.f120745c.f120675a, ((n0) obj2).f120718a), null, 11);
            case 11:
                f((l82.n) obj);
                return Unit.f80348a;
            case 12:
                e((Throwable) obj);
                return Unit.f80348a;
            case 13:
                e((Throwable) obj);
                return Unit.f80348a;
            case 14:
                f((l82.n) obj);
                return Unit.f80348a;
            case 15:
                Intrinsics.checkNotNullParameter((q1) obj, "<anonymous parameter 0>");
                return ((m1) obj2).f106570t;
            case 16:
                k62.a it7 = (k62.a) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return Boolean.valueOf(Intrinsics.d(it7.f78418a.a(), ((k62.a) obj2).f78418a.a()));
            case 17:
                e((Throwable) obj);
                return Unit.f80348a;
            case 18:
                z1 it8 = (z1) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof u1)) {
                    return it8;
                }
                u1 u1Var = (u1) it8;
                x1 x1Var = x1.FINISHED;
                b1 b1Var = (b1) ((j) ((k) obj2)).f89728a;
                return u1.f(u1Var, null, null, 0.0d, 0.0d, null, null, null, null, b1Var.f106442a, null, null, x1Var, b1Var.f106443b, 212735);
            case 19:
                ((Function1) ((c2) obj2).f16535f).invoke(new v0(String.valueOf((String) obj)));
                return Unit.f80348a;
            case 20:
                e((Throwable) obj);
                return Unit.f80348a;
            case 21:
                d0 addJsonObject = (d0) obj;
                Intrinsics.checkNotNullParameter(addJsonObject, "$this$addJsonObject");
                c0 f14 = o.f((ro2.n) obj2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : f14.f108979a.entrySet()) {
                    if (!Intrinsics.d((String) entry.getKey(), "unique")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    addJsonObject.a((String) entry2.getKey(), (ro2.n) entry2.getValue());
                }
                return Unit.f80348a;
            case 22:
                f((l82.n) obj);
                return Unit.f80348a;
            case 23:
                f30 it9 = (f30) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new ge.d(a.a.D(((b82.k) obj2).getClass().getName(), "-", it9.getUid()));
            case 24:
                b3 it10 = (b3) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((i3) obj2).X8(it10);
                return Unit.f80348a;
            case 25:
                rn1.a it11 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                c92.a aVar = (c92.a) obj2;
                return rn1.a.y(it11, aVar.f26993a, null, null, null, null, 0, null, null, null, aVar.f26994b, false, 0, null, null, null, null, null, false, null, null, 2096638);
            case 26:
                f((l82.n) obj);
                return Unit.f80348a;
            case 27:
                b((x) obj);
                return Unit.f80348a;
            case 28:
                b((x) obj);
                return Unit.f80348a;
            default:
                om1.c it12 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                return om1.c.e(it12, ((da2.g) obj2).f54247c, null, null, null, null, false, 0, 1022);
        }
    }
}
