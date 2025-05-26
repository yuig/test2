package p70;

import ca0.j;
import ca0.t;
import com.pinterest.api.model.ia0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import ea1.c0;
import ea1.q;
import f31.m;
import f31.n;
import f31.z;
import i51.i;
import k41.f;
import kg.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lm0.x;
import om1.l;
import om1.p;
import s80.v;
import u50.r;
import u62.k;
import x91.g;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99060i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f99061j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(r rVar, int i13) {
        super(1);
        this.f99060i = i13;
        this.f99061j = rVar;
    }

    public final void b(int i13) {
        f[] fVarArr;
        int i14 = this.f99060i;
        r rVar = this.f99061j;
        switch (i14) {
            case 11:
                rVar.a(new x(o.f(i13, zo.c.DEFAULT)));
                break;
            case 17:
                k41.b.Companion.getClass();
                k41.b a13 = k41.a.a(i13);
                int i15 = a13 == null ? -1 : z.f61034a[a13.ordinal()];
                if (i15 == 1) {
                    rVar.a(f31.r.f61028a);
                    break;
                } else if (i15 == 2) {
                    rVar.a(n.f61024a);
                    break;
                } else if (i15 == 3) {
                    rVar.a(m.f61019a);
                    break;
                }
                break;
            case 18:
                rVar.a(new x31.f(i13));
                break;
            default:
                f.Companion.getClass();
                fVarArr = f.cachedValues;
                rVar.a(new k51.r(fVarArr[i13]));
                break;
        }
    }

    public final void e(wy0 wy0Var) {
        int i13 = this.f99060i;
        r rVar = this.f99061j;
        switch (i13) {
            case 19:
                rVar.a(i.f71592a);
                break;
            case 20:
            case 22:
            default:
                Intrinsics.f(wy0Var);
                rVar.a(new c0(wy0Var));
                break;
            case 21:
                Intrinsics.f(wy0Var);
                rVar.a(new g(wy0Var));
                break;
            case 23:
                Intrinsics.f(wy0Var);
                rVar.a(new ca1.f(wy0Var));
                break;
        }
    }

    public final void f(String newValue) {
        int i13 = this.f99060i;
        r rVar = this.f99061j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                rVar.a(new t(newValue));
                break;
            case 5:
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                rVar.a(new j(newValue));
                break;
            default:
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                rVar.a(new ca0.e(newValue));
                break;
        }
    }

    public final void h(Throwable it) {
        n70.b bVar = n70.b.f89602a;
        int i13 = this.f99060i;
        r rVar = this.f99061j;
        switch (i13) {
            case 0:
                rVar.a(bVar);
                break;
            case 1:
                rVar.a(bVar);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                rVar.a(new v(null, false));
                break;
            case 8:
                rVar.a(new tk0.n(false));
                break;
            case 9:
                rVar.a(new tk0.n(false));
                break;
            case 14:
                rVar.a(new fz0.d(null));
                break;
            case 22:
                rVar.a(x91.f.f134315a);
                break;
            case 24:
                Intrinsics.f(it);
                rVar.a(new ca1.d(it));
                break;
            case 25:
                Intrinsics.f(it);
                rVar.a(new q(it));
                break;
            case 26:
                Intrinsics.f(it);
                rVar.a(new q(it));
                break;
            case 27:
                Intrinsics.f(it);
                rVar.a(new q(it));
                break;
            default:
                Intrinsics.f(it);
                rVar.a(new q(it));
                break;
        }
    }

    public final void i(p event) {
        int i13 = this.f99060i;
        r rVar = this.f99061j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof l) {
                    rVar.a(u21.c.f120075a);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof l) {
                    rVar.a(v21.d.f123872a);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f99060i;
        r rVar = this.f99061j;
        switch (i13) {
            case 0:
                h((Throwable) obj);
                break;
            case 1:
                h((Throwable) obj);
                break;
            case 2:
                h((Throwable) obj);
                break;
            case 3:
                k event = (k) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                rVar.a(new sa0.b(event));
                break;
            case 4:
                f((String) obj);
                break;
            case 5:
                f((String) obj);
                break;
            case 6:
                on1.i event2 = (on1.i) obj;
                Intrinsics.checkNotNullParameter(event2, "event");
                rVar.a(new ca0.k(event2 instanceof on1.g));
                break;
            case 7:
                f((String) obj);
                break;
            case 8:
                h((Throwable) obj);
                break;
            case 9:
                h((Throwable) obj);
                break;
            case 10:
                v7 v7Var = (v7) obj;
                Intrinsics.f(v7Var);
                rVar.a(new tk0.f(v7Var));
                break;
            case 11:
                b(((Number) obj).intValue());
                break;
            case 12:
                cl0.a option = (cl0.a) obj;
                Intrinsics.checkNotNullParameter(option, "option");
                rVar.a(new qm0.n(option));
                break;
            case 13:
                rVar.a(new fz0.d((ia0) ((tt1.a) obj).c()));
                break;
            case 14:
                h((Throwable) obj);
                break;
            case 15:
                i((p) obj);
                break;
            case 16:
                i((p) obj);
                break;
            case 17:
                b(((Number) obj).intValue());
                break;
            case 18:
                b(((Number) obj).intValue());
                break;
            case 19:
                e((wy0) obj);
                break;
            case 20:
                b(((Number) obj).intValue());
                break;
            case 21:
                e((wy0) obj);
                break;
            case 22:
                h((Throwable) obj);
                break;
            case 23:
                e((wy0) obj);
                break;
            case 24:
                h((Throwable) obj);
                break;
            case 25:
                h((Throwable) obj);
                break;
            case 26:
                h((Throwable) obj);
                break;
            case 27:
                h((Throwable) obj);
                break;
            case 28:
                e((wy0) obj);
                break;
            default:
                h((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
