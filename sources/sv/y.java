package sv;

import android.content.Context;
import android.content.res.Resources;
import c50.ma;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.create.namingview.view.BoardCreateBoardNamingView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import la0.n0;
import la0.o0;
import la0.t1;
import m60.x0;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115317i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f115318j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f115319k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f115320l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f115317i = i13;
        this.f115318j = obj;
        this.f115319k = obj2;
        this.f115320l = obj3;
    }

    public final void b(int i13) {
        Unit unit;
        Object obj;
        rl2.g gVar;
        int i14 = this.f115317i;
        Object obj2 = this.f115319k;
        Object obj3 = this.f115320l;
        Object obj4 = this.f115318j;
        switch (i14) {
            case 4:
                com.pinterest.boardAutoCollages.b.Companion.getClass();
                com.pinterest.boardAutoCollages.b bVar = (com.pinterest.boardAutoCollages.b) CollectionsKt.U(i13, com.pinterest.boardAutoCollages.b.getEntries());
                if (bVar != null && w60.a.f128112a[bVar.ordinal()] == 1) {
                    ((u50.r) obj4).a(new com.pinterest.boardAutoCollages.i(((com.pinterest.boardAutoCollages.w) obj2).f44600b));
                }
                a.c.y(((nu.a) obj3).f92305b);
                break;
            case 10:
                if (i13 != t90.f.f116787a.f116819c) {
                    if (i13 != t90.f.f116788b.f116819c) {
                        if (i13 == t90.f.f116789c.f116819c) {
                            ((Function0) obj3).invoke();
                            break;
                        }
                    } else {
                        ((Function0) obj2).invoke();
                        break;
                    }
                } else {
                    ((Function0) obj4).invoke();
                    break;
                }
                break;
            case 12:
                t1.Companion.getClass();
                t1 t1Var = (t1) CollectionsKt.U(i13, t1.getEntries());
                int i15 = t1Var == null ? -1 : na0.a.f90083a[t1Var.ordinal()];
                if (i15 == 1) {
                    ((u50.r) obj4).a(new la0.v(((n0) ((o0) obj2)).f82440b));
                } else if (i15 == 2) {
                    ((u50.r) obj4).a(new la0.t(((n0) ((o0) obj2)).f82440b));
                } else if (i15 == 3) {
                    ((u50.r) obj4).a(new la0.u(((n0) ((o0) obj2)).f82440b));
                }
                a.c.y(((na0.c) obj3).f90088a);
                break;
            default:
                Iterator it = ((List) obj4).iterator();
                while (true) {
                    unit = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ha2.a0) obj).f68400b == i13) {
                        }
                    } else {
                        obj = null;
                    }
                }
                ha2.a0 a0Var = (ha2.a0) obj;
                if (a0Var != null && (gVar = (rl2.g) ((Map) obj3).get(Integer.valueOf(a0Var.f68399a))) != null) {
                    ((Function0) gVar).invoke();
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    un0.h hVar = (un0.h) obj2;
                    hVar.f122839g.i(((yk1.a) hVar.f122840h).f139224a.getString(x0.generic_error));
                    break;
                }
                break;
        }
    }

    public final void e(Throwable it) {
        int i13 = this.f115317i;
        Object obj = this.f115320l;
        Object obj2 = this.f115319k;
        Object obj3 = this.f115318j;
        switch (i13) {
            case 3:
                int i14 = r60.h.f106328e;
                Resources resources = ((Context) obj3).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                ma.a(resources, (i92.k) obj2, (wy0) obj, !r1.s2().booleanValue());
                break;
            case 21:
                ((oj0.d) obj3).b((f30) obj2, (f30) obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ((BoardCreateBoardNamingView) ((bk0.a) obj3)).b((List) obj2);
                Objects.toString(it);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x076c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 2464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.y.invoke(java.lang.Object):java.lang.Object");
    }
}
