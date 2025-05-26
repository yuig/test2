package da0;

import ca0.i1;
import ca0.m;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import do2.j;
import iu1.h;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.l1;
import o82.p1;
import pm0.q;
import u50.r;
import v72.k;
import wr1.c0;
import wr1.y;

/* loaded from: classes5.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f54204b;

    public /* synthetic */ b(r rVar, int i13) {
        this.f54203a = i13;
        this.f54204b = rVar;
    }

    public final Unit a(qr1.c cVar) {
        int i13 = this.f54203a;
        r rVar = this.f54204b;
        switch (i13) {
            case 3:
                Intrinsics.f(cVar);
                rVar.a(new y(cVar));
                break;
            default:
                Intrinsics.f(cVar);
                rVar.a(new c0(cVar));
                break;
        }
        return Unit.f80348a;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        int i13 = this.f54203a;
        r rVar = this.f54204b;
        switch (i13) {
            case 0:
                String c03 = k3.c0((fi0) obj);
                if (c03 == null) {
                    c03 = "";
                }
                rVar.a(new m(new i1(c03)));
                break;
            case 1:
                rVar.a(new q((v7) obj));
                break;
            case 2:
                w12.a aVar = (w12.a) obj;
                Intrinsics.f(aVar);
                rVar.a(new tx0.e(aVar));
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                wy0 wy0Var = (wy0) obj;
                switch (i13) {
                    case 5:
                        rVar.a(new hu1.f(wy0Var));
                        break;
                    default:
                        rVar.a(new h(wy0Var));
                        break;
                }
            case 6:
                wy0 wy0Var2 = (wy0) obj;
                switch (i13) {
                    case 5:
                        rVar.a(new hu1.f(wy0Var2));
                        break;
                    default:
                        rVar.a(new h(wy0Var2));
                        break;
                }
            case 7:
                rVar.a(new k(((Boolean) obj).booleanValue()));
                break;
            case 8:
                i0 i0Var = (i0) obj;
                switch (i13) {
                    case 8:
                        rVar.a(new p1(i0Var));
                        break;
                    default:
                        rVar.a(new l1(i0Var));
                        break;
                }
            default:
                i0 i0Var2 = (i0) obj;
                switch (i13) {
                    case 8:
                        rVar.a(new p1(i0Var2));
                        break;
                    default:
                        rVar.a(new l1(i0Var2));
                        break;
                }
        }
        return Unit.f80348a;
    }
}
