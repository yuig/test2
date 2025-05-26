package y01;

import android.content.Context;
import c50.t4;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qz0;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.vz0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.feature.pin.creation.CreationActivity;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import h32.d4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136471i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f136472j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Object obj, int i13) {
        super(1);
        this.f136471i = i13;
        this.f136472j = obj;
    }

    public final om1.c b(om1.c displayState) {
        String b23;
        int i13 = this.f136471i;
        Object obj = this.f136472j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return om1.c.e(displayState, rm1.q.ARROW_BACK, null, ((Boolean) ((Function0) ((v.c1) obj).f123388e).invoke()).booleanValue() ? om1.f.TRANSPARENT_ALWAYS_LIGHT : om1.f.WASH_WHITE, null, null, false, 0, 1018);
            default:
                Intrinsics.checkNotNullParameter(displayState, "it");
                a41.f0 f0Var = (a41.f0) obj;
                rm1.q qVar = f0Var.f589a;
                if (qVar == null) {
                    qVar = GestaltIconButton.E;
                }
                rm1.q qVar2 = qVar;
                fm1.c Z = d7.b.Z(!(Intrinsics.d(f0Var, a41.f0.f588f) || f0Var.f589a == null));
                Integer num = f0Var.f592d;
                return om1.c.e(displayState, qVar2, null, f0Var.f590b, Z, (num == null || (b23 = bs1.c.b2(num.intValue())) == null) ? null : bs1.c.p2(b23), false, 0, 994);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f136471i;
        Object obj = this.f136472j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(((b11.l0) obj).f21064a), null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 7:
                Intrinsics.checkNotNullParameter(it, "displayState");
                Intrinsics.checkNotNullParameter(it, "displayState");
                u50.i0 i0Var = it.f108849g;
                String string = ((HeaderCell) obj).getResources().getString(f02.g.save_to_board);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                u50.f0 text = new u50.f0(string);
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, it.f108850h, it.f108851i, it.f108852j, it.f108853k, it.f108854l, it.f108855m, it.f108856n, it.f108857o, it.f108858p, it.f108859q, it.f108860r, it.f108861s, it.f108862t, it.f108863u, it.f108864v, it.f108865w, it.f108866x, it.f108867y, it.f108868z, it.A);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(((k31.j) obj).f78257a), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final y31.r f(y31.r it) {
        int i13 = this.f136471i;
        Object obj = this.f136472j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                c92.n media = (c92.n) obj;
                boolean z13 = it.f136849a.f136775b;
                Intrinsics.checkNotNullParameter(media, "media");
                return y31.r.e(it, new y31.b(media, z13), null, null, null, null, null, 62);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                y31.b bVar = it.f136849a;
                c92.n media2 = ((y31.y) obj).f136861a;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(media2, "media");
                return y31.r.e(it, new y31.b(media2, true), null, null, null, null, null, 62);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return y31.r.e(it, null, null, null, null, (vz0) obj, null, 47);
        }
    }

    public final yl1.b h(yl1.b it) {
        int i13 = this.f136471i;
        Object obj = this.f136472j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, null, null, null, (yl1.c) obj, null, null, 0, null, 991);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(((k31.i) obj).f78255a), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                a41.e0 e0Var = (a41.e0) obj;
                return yl1.b.f(it, bs1.c.h2(e0Var.f585a), false, null, null, e0Var.f586b, null, null, null, 0, null, 1006);
        }
    }

    public final void i(Throwable error) {
        int i13 = this.f136471i;
        Object obj = this.f136472j;
        switch (i13) {
            case 4:
                i11.r rVar = (i11.r) obj;
                rVar.f71007j.i(((yk1.a) rVar.f71003h).f139224a.getString(e02.e.unable_to_save_pins_to_board));
                break;
            case 5:
                Intrinsics.checkNotNullParameter(error, "error");
                ((i11.u) obj).f71057n0.o("StoryPinBoardPickerPresenter: failed to fetch StoryPinLocalData", error);
                break;
            default:
                Intrinsics.checkNotNullParameter(error, "it");
                ((CreationActivity) obj).b6().o("CreationActivity: failed to load story pin local data.", error);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f136471i;
        Object obj2 = this.f136472j;
        switch (i13) {
            case 0:
                j((l82.n) obj);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                i((Throwable) obj);
                break;
            case 5:
                i((Throwable) obj);
                break;
            case 6:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                ((l11.j) obj2).M1(navigation);
                break;
            case 7:
                break;
            case 8:
                i((Throwable) obj);
                break;
            case 9:
                String value = (String) obj;
                Intrinsics.checkNotNullParameter(value, "text");
                s11.a aVar = (s11.a) obj2;
                q11.c cVar = aVar.f110586l;
                if (cVar != null) {
                    aq.d field = aVar.f110575a;
                    Intrinsics.checkNotNullParameter(field, "field");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ((t11.f) cVar).f115812l.put(field, value);
                }
                break;
            case 10:
                gb2.k it = (gb2.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = it.f64758a;
                f30 f30Var = ((p21.f) obj2).f98692a;
                break;
            case 11:
                PinnableImage pinnableImage = (PinnableImage) obj;
                u21.o oVar = (u21.o) obj2;
                Intrinsics.f(pinnableImage);
                oVar.getClass();
                NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.v0.f51439a.getValue(), "", ml1.b.MODAL_TRANSITION.getValue());
                L.a(kotlin.collections.f0.d(pinnableImage));
                L.m0("com.pinterest.EXTRA_PIN_CREATE_TYPE", "com.pinterest.EXTRA_PIN_OR_SPIN");
                L.Y1("com.pinterest.EXTRA_ALLOW_PROFILE_SAVE_OPTION", false);
                oVar.f120107d.f(L);
                break;
            case 12:
                j((l82.n) obj);
                break;
            case 13:
                j((l82.n) obj);
                break;
            case 14:
                j((l82.n) obj);
                break;
            case 15:
                q1.x LazyRow = (q1.x) obj;
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                List list = ((k31.a) obj2).f78235a;
                k31.g gVar = k31.g.f78248i;
                int size = list.size();
                u80.s sVar = new u80.s(12, list, gVar);
                tc0.e eVar = new tc0.e(list, r2);
                Object obj3 = q2.i.f102113a;
                ((q1.i) LazyRow).s(size, null, sVar, new q2.h(eVar, true, -632812321));
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                Integer n43 = user.n4();
                Intrinsics.checkNotNullExpressionValue(n43, "getScheduledPinCount(...)");
                int intValue = n43.intValue();
                if (intValue <= 0) {
                    kk2.b j13 = uj2.b0.j(kotlin.collections.q0.f80391a);
                    Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
                    break;
                } else {
                    p31.a aVar2 = (p31.a) obj2;
                    aVar2.getClass();
                    kk2.m mVar = new kk2.m(aVar2.f98763m.j(hf0.b.q() ? 5 : 4, n00.b.a(n00.c.SCHEDULED_PIN_PREVIEW)).r(tk2.e.f118017c).l(wj2.c.a()), new wv0.a(29, new zx0.d(intValue, 9)), 0);
                    Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
                    break;
                }
            case 19:
                NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.f50990x.getValue());
                Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                ((u31.f) obj2).M1(w13);
                break;
            case 20:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                u50.r rVar = ((UserProfileHeader) obj2).f47531q;
                if (rVar != null) {
                    rVar.a(new y31.t(booleanValue));
                }
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                j((l82.n) obj);
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                e41.a aVar3 = (e41.a) obj2;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(board, "board");
                g70.h.f(aVar3.f57182b, board, null, 6);
                break;
            case 28:
                z40.y user2 = (z40.y) obj;
                Intrinsics.checkNotNullParameter(user2, "user");
                g41.m mVar2 = (g41.m) obj2;
                n41.b bVar = (n41.b) mVar2.D0.getValue();
                vy0 f23 = wy0.f2();
                f23.p1(user2.a());
                f23.N(user2.f());
                f23.H(user2.d());
                f23.L(user2.c());
                f23.N(user2.f());
                f23.b0(user2.b());
                f23.r1(user2.g());
                qz0 c13 = tz0.c();
                z40.x i14 = user2.i();
                c13.b(i14 != null ? i14.getName() : null);
                z40.x i15 = user2.i();
                c13.c(i15 != null ? i15.a() : null);
                f23.t1(c13.a());
                f23.l(user2.m());
                f23.x0(user2.j());
                wy0 a13 = f23.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                Context requireContext = mVar2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                bVar.a(requireContext, a13);
                break;
            default:
                wy0 wy0Var = (wy0) obj;
                Intrinsics.f(wy0Var);
                g41.p.b8((g41.p) obj2, wy0Var);
                break;
        }
        return Unit.f80348a;
    }

    public final void j(l82.n start) {
        int i13 = this.f136471i;
        int i14 = 23;
        int i15 = 22;
        Object obj = this.f136472j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                q1 q1Var = (q1) obj;
                p70.e eVar = q1Var.f136475c;
                start.a(eVar, new t4(22), eVar.a());
                ws.q qVar = q1Var.f136476d;
                start.a(qVar, new t4(28), qVar.a());
                z01.e eVar2 = q1Var.f136477e;
                start.a(eVar2, new t4(23), eVar2.a());
                mb0.a aVar = q1Var.f136478f;
                start.a(aVar, new t4(24), aVar.a());
                w60.d dVar = q1Var.f136479g;
                start.a(dVar, new t4(29), dVar.a());
                ws.q qVar2 = q1Var.f136480h;
                start.a(qVar2, new o1(0), qVar2.a());
                nu.b bVar = q1Var.f136481i;
                start.a(bVar, new t4(25), bVar.a());
                nu.a aVar2 = q1Var.f136482j;
                start.a(aVar2, new o1(1), aVar2.a());
                z01.k kVar = q1Var.f136483k;
                start.a(kVar, new t4(26), kVar.a());
                zy.d0 d0Var = q1Var.f136484l;
                start.a(d0Var, new o1(2), d0Var.a());
                mb0.a aVar3 = q1Var.f136486n;
                start.a(aVar3, new t4(27), aVar3.a());
                break;
            case 12:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                u21.d0 d0Var2 = (u21.d0) obj;
                l82.n.b(start, d0Var2.f120082d);
                zy.d0 d0Var3 = d0Var2.f120083e;
                start.a(d0Var3, new o1(4), d0Var3.a());
                w60.d dVar2 = d0Var2.f120084f;
                start.a(dVar2, new o1(5), dVar2.a());
                u21.j jVar = d0Var2.f120081c;
                start.a(jVar, new o1(3), jVar.a());
                break;
            case 13:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                v21.c0 c0Var = (v21.c0) obj;
                l82.n.b(start, c0Var.f123868c);
                zy.d0 d0Var4 = c0Var.f123870e;
                start.a(d0Var4, new o1(7), d0Var4.a());
                v21.b bVar2 = c0Var.f123869d;
                start.a(bVar2, new o1(6), bVar2.a());
                break;
            case 14:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                c31.t tVar = (c31.t) obj;
                g31.c cVar = tVar.f25621i;
                start.a(cVar, new o1(12), cVar.a());
                sy.a a13 = tVar.f25620h.a(s92.i.ALL_PINS, s92.l.USER_NAVIGATION, d4.USER, null, false);
                start.a(a13, new o1(15), a13.a());
                g31.e eVar3 = tVar.f25618f;
                start.a(eVar3, new o1(13), eVar3.a());
                f31.a0 a0Var = tVar.f25619g;
                start.a(a0Var, new o1(11), a0Var.a());
                mb0.a aVar4 = (mb0.a) tVar.f25625m.f63225b;
                start.a(aVar4, new o1(10), "AllPins_".concat(aVar4.a()));
                zy.d0 d0Var5 = tVar.f25622j;
                start.a(d0Var5, new o1(14), "AllPins_".concat(d0Var5.a()));
                nu.b bVar3 = tVar.f25623k;
                start.a(bVar3, new o1(16), bVar3.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                y31.p0 p0Var = (y31.p0) obj;
                z31.e eVar4 = p0Var.f136834d;
                start.a(eVar4, new o1(18), eVar4.a());
                z31.f fVar = p0Var.f136835e;
                start.a(fVar, new o1(19), fVar.a());
                z31.b bVar4 = p0Var.f136836f;
                start.a(bVar4, new o1(17), bVar4.a());
                z31.g gVar = p0Var.f136837g;
                start.a(gVar, new o1(20), gVar.a());
                w60.d dVar3 = p0Var.f136838h;
                start.a(dVar3, new o1(21), dVar3.a());
                z31.d dVar4 = p0Var.f136839i;
                start.a(dVar4, new o1(i15), dVar4.a());
                zy.d0 d0Var6 = p0Var.f136840j;
                start.a(d0Var6, new o1(i14), d0Var6.a());
                break;
        }
    }
}
