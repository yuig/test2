package an1;

import android.view.MenuItem;
import android.view.View;
import cn1.d0;
import cn1.y;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import do1.x;
import do1.z;
import en1.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import qp1.t0;
import u50.f0;
import wt1.c0;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15737i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f15738j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i13) {
        super(1);
        this.f15737i = i13;
        this.f15738j = obj;
    }

    public final on1.b b(on1.b it) {
        int i13 = this.f15737i;
        Object obj = this.f15738j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                on1.b bVar = (on1.b) obj;
                return on1.b.e(it, bVar.f96708a, bVar.f96709b, bVar.f96710c, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                on1.s sVar = (on1.s) obj;
                return new on1.b(sVar.f96761a, sVar.f96762b, sVar.f96763c, sVar.f96764d, sVar.f96765e, sVar.f96766f, sVar.f96767g);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f15737i;
        Object obj = this.f15738j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                rn1.k kVar = (rn1.k) obj;
                return new rn1.a(kVar.f108886a, kVar.f108887b, kVar.f108888c, kVar.f108889d, kVar.f108890e, kVar.f108891f, kVar.f108892g, kVar.f108893h, kVar.f108894i, kVar.f108895j, kVar.f108896k, kVar.f108897l, kVar.f108898m, kVar.f108899n, kVar.f108900o, kVar.f108901p, kVar.f108902q, kVar.f108903r, kVar.f108904s, kVar.f108905t, kVar.f108906u);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                rn1.b bVar = rn1.b.END;
                int i14 = xn1.l.label;
                yn1.f fVar = GestaltTextField.f49669t;
                return rn1.a.y(it, null, null, null, null, null, 0, null, bVar, null, null, false, i14, null, null, null, null, Integer.valueOf(((GestaltTextField) obj).o0().getId()), false, null, null, 2029439);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                MenuItem menuItem = (MenuItem) obj;
                int itemId = menuItem.getItemId();
                CharSequence title = menuItem.getTitle();
                CharSequence charSequence = "";
                if (title == null) {
                    title = "";
                }
                f0 h23 = bs1.c.h2(title);
                CharSequence contentDescription = menuItem instanceof h5.b ? ((h5.b) menuItem).getContentDescription() : menuItem.getContentDescription();
                if (contentDescription == null) {
                    CharSequence title2 = menuItem.getTitle();
                    if (title2 != null) {
                        charSequence = title2;
                    }
                } else {
                    charSequence = contentDescription;
                }
                return rn1.a.y(it, h23, null, null, null, null, 0, null, null, null, null, false, itemId, bs1.c.h2(charSequence), null, null, null, null, false, null, null, 2091006);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.BODY_100;
                return rn1.a.y(it, bs1.c.h2(((GestaltToolbarImpl) obj).f49701a), vn1.c.SUBTLE, null, null, gVar, 0, fm1.c.GONE, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096940);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                pp1.a aVar = (pp1.a) obj;
                return rn1.a.y(it, aVar.f100911a, null, null, null, null, 0, null, null, null, aVar.f100912b, false, 0, null, null, null, null, null, false, null, null, 2096638);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Navigation navigation = ((jq1.n) obj).I;
                return rn1.a.y(it, bs1.c.h2(String.valueOf(navigation != null ? navigation.v0("com.pinterest.EXTRA_TITLE") : null)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tl1.i iVar;
        int i13 = this.f15737i;
        Object obj2 = this.f15738j;
        switch (i13) {
            case 0:
                e it = (e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                h hVar = (h) obj2;
                return new e(hVar.f15731a, hVar.f15732b, hVar.f15733c, hVar.f15734d, hVar.f15735e, hVar.f15736f);
            case 1:
                b it2 = (b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                r rVar = (r) obj2;
                return new b(rVar.f15759a, rVar.f15760b, rVar.f15761c, rVar.f15762d);
            case 2:
                cn1.d it3 = (cn1.d) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return (cn1.d) obj2;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return ((cn1.n) obj2).a();
                }
            case 3:
                cn1.d it4 = (cn1.d) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return (cn1.d) obj2;
                    default:
                        Intrinsics.checkNotNullParameter(it4, "it");
                        return ((cn1.n) obj2).a();
                }
            case 4:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.g(((y) obj2).f28242b);
                bind.b(GestaltStaticSearchBar.f49526r);
                return Unit.f80348a;
            case 5:
                y it5 = (y) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                d0 d0Var = (d0) obj2;
                return new y(d0Var.f28171a, d0Var.f28172b, d0Var.f28173c, d0Var.f28174d, d0Var.f28175e, d0Var.f28176f, d0Var.f28177g, d0Var.f28178h, d0Var.f28179i, d0Var.f28180j, d0Var.f28181k, d0Var.f28182l, d0Var.f28183m, d0Var.f28184n, d0Var.f28185o, d0Var.f28186p);
            case 6:
                en1.d it6 = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                k0 k0Var = (k0) obj2;
                return new en1.d(k0Var.f59679a, k0Var.f59680b, k0Var.f59681c, k0Var.f59682d, k0Var.f59683e, k0Var.f59684f, k0Var.f59685g, k0Var.f59686h, k0Var.f59687i);
            case 7:
                fn1.b it7 = (fn1.b) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                fn1.o oVar = (fn1.o) obj2;
                return new fn1.b(oVar.f62713a, oVar.f62714b, oVar.f62715c, oVar.f62716d, oVar.f62717e, oVar.f62718f, oVar.f62719g, oVar.f62720h, oVar.f62721i, oVar.f62722j, oVar.f62723k);
            case 8:
                kn1.b it8 = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                kn1.h hVar2 = (kn1.h) obj2;
                return new kn1.b(hVar2.f80265a, hVar2.f80266b, hVar2.f80267c, hVar2.f80268d, hVar2.f80269e, hVar2.f80270f, hVar2.f80271g, hVar2.f80272h, hVar2.f80273i, hVar2.f80274j, hVar2.f80275k);
            case 9:
                ln1.d it9 = (ln1.d) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                ln1.l lVar = (ln1.l) obj2;
                return new ln1.d(lVar.f84044a, lVar.f84045b, lVar.f84046c, lVar.f84047d, lVar.f84048e, lVar.f84049f);
            case 10:
                return b((on1.b) obj);
            case 11:
                on1.k it10 = (on1.k) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                on1.r rVar2 = (on1.r) obj2;
                return new on1.k(rVar2.f96754a, rVar2.f96755b, rVar2.f96756c, rVar2.f96757d, rVar2.f96758e, rVar2.f96759f, rVar2.f96760g);
            case 12:
                return b((on1.b) obj);
            case 13:
                qn1.b it11 = (qn1.b) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                qn1.g gVar = (qn1.g) obj2;
                return new qn1.b(gVar.f104486a, gVar.f104487b, gVar.f104488c, gVar.f104489d, gVar.f104490e, gVar.f104491f, gVar.f104492g, gVar.f104493h);
            case 14:
                return e((rn1.a) obj);
            case 15:
                un1.c it12 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                un1.m mVar = (un1.m) obj2;
                return new un1.c(mVar.f122894b, mVar.f122895c, mVar.f122896d, mVar.f122897e, mVar.f122898f, mVar.f122899g, mVar.f122900h, mVar.f122901i, mVar.f122902j, mVar.f122903k, mVar.f122904l, mVar.f122905m, mVar.f122906n, mVar.f122907o, mVar.f122908p, mVar.f122909q, mVar.f122910r, mVar.f122911s, mVar.f122912t);
            case 16:
                wn1.d it13 = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (wn1.d) obj2;
            case 17:
                ao1.b it14 = (ao1.b) obj;
                switch (i13) {
                    case 17:
                        Intrinsics.checkNotNullParameter(it14, "it");
                        return (ao1.b) obj2;
                    default:
                        Intrinsics.checkNotNullParameter(it14, "it");
                        ao1.i iVar2 = (ao1.i) obj2;
                        return new ao1.b(iVar2.f20084a, iVar2.f20085b, iVar2.f20086c, iVar2.f20087d, iVar2.f20088e, iVar2.f20089f, iVar2.f20090g, iVar2.f20091h, iVar2.f20092i, iVar2.f20093j, iVar2.f20094k, iVar2.f20095l, iVar2.f20096m, iVar2.f20097n, iVar2.f20098o, iVar2.f20099p, iVar2.f20100q, iVar2.f20101r, iVar2.f20102s, iVar2.f20103t, iVar2.f20104u, iVar2.f20105v);
                }
            case 18:
                return e((rn1.a) obj);
            case 19:
                ao1.b it15 = (ao1.b) obj;
                switch (i13) {
                    case 17:
                        Intrinsics.checkNotNullParameter(it15, "it");
                        return (ao1.b) obj2;
                    default:
                        Intrinsics.checkNotNullParameter(it15, "it");
                        ao1.i iVar3 = (ao1.i) obj2;
                        return new ao1.b(iVar3.f20084a, iVar3.f20085b, iVar3.f20086c, iVar3.f20087d, iVar3.f20088e, iVar3.f20089f, iVar3.f20090g, iVar3.f20091h, iVar3.f20092i, iVar3.f20093j, iVar3.f20094k, iVar3.f20095l, iVar3.f20096m, iVar3.f20097n, iVar3.f20098o, iVar3.f20099p, iVar3.f20100q, iVar3.f20101r, iVar3.f20102s, iVar3.f20103t, iVar3.f20104u, iVar3.f20105v);
                }
            case 20:
                rm1.k bind2 = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                rm1.g iconAndSize = ((do1.l) obj2).f55683a;
                bind2.getClass();
                Intrinsics.checkNotNullParameter(iconAndSize, "iconAndSize");
                bind2.f108709a = iconAndSize;
                bind2.a(rm1.c.INVERSE);
                bind2.c(fm1.c.VISIBLE);
                bind2.f108712d = z.icon;
                return Unit.f80348a;
            case 21:
                do1.d it16 = (do1.d) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                x xVar = (x) obj2;
                return new do1.d(xVar.f55704a, xVar.f55705b, xVar.f55706c, xVar.f55707d, xVar.f55708e, xVar.f55709f, xVar.f55710g, xVar.f55711h, xVar.f55712i);
            case 22:
                return e((rn1.a) obj);
            case 23:
                return e((rn1.a) obj);
            case 24:
                return e((rn1.a) obj);
            case 25:
                l82.n start = (l82.n) obj;
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, ((t0) obj2).f104841c);
                return Unit.f80348a;
            case 26:
                xn1.j event = (xn1.j) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xn1.i) {
                    ((yp0.b) obj2).h3(event);
                }
                return Unit.f80348a;
            case 27:
                c0 c0Var = (c0) obj;
                if ((c0Var instanceof wt1.y) && (iVar = c0Var.f131096b) != null && iVar.f118095a > 0) {
                    iq1.e eVar = (iq1.e) obj2;
                    if (eVar.isBound()) {
                        jq1.n nVar = (jq1.n) ((gq1.c) eVar.getView());
                        View view = nVar.D9().f27254m;
                        if (view != null) {
                            view.addOnLayoutChangeListener(new n5.h(10, view, nVar));
                        }
                    }
                }
                return Unit.f80348a;
            case 28:
                wy0 wy0Var = (wy0) obj;
                if (wy0Var != null) {
                    jq1.c cVar = (jq1.c) obj2;
                    w f73 = cVar.f7();
                    Navigation navigation = cVar.I;
                    String f49940b = navigation != null ? navigation.getF49940b() : null;
                    if (f49940b == null) {
                        f49940b = "";
                    }
                    f73.d(new lf1.b(f49940b, wy0Var));
                }
                return Unit.f80348a;
            default:
                return e((rn1.a) obj);
        }
    }
}
