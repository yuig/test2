package lb;

import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;
import com.pinterest.api.model.f30;
import ek1.q1;
import ek1.r1;
import ek1.s1;
import ek1.t1;
import ek1.v1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82690i = 2;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f82691j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f82692k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f82693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f82694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(List list, pn2.u0 u0Var, pn2.b1 b1Var, boolean z13) {
        super(1);
        this.f82692k = b1Var;
        this.f82693l = list;
        this.f82694m = u0Var;
        this.f82691j = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String methodName;
        v1 v1Var;
        int i13 = this.f82690i;
        Object obj2 = this.f82694m;
        boolean z13 = this.f82691j;
        Object obj3 = this.f82693l;
        Object obj4 = this.f82692k;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof WorkerStoppedException) {
                    ((kb.a0) obj4).h(((WorkerStoppedException) th3).f20012a);
                }
                if (z13 && (methodName = (String) obj3) != null) {
                    a1 a1Var = (a1) obj2;
                    bk.f fVar = a1Var.f82563f.f78982m;
                    int hashCode = a1Var.f82558a.hashCode();
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(methodName, "methodName");
                    if (Build.VERSION.SDK_INT >= 29) {
                        ta.a.b(hashCode, tb.f.k0(methodName));
                    } else {
                        String k03 = tb.f.k0(methodName);
                        try {
                            if (tb.f.f116968d == null) {
                                tb.f.f116968d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            tb.f.f116968d.invoke(null, Long.valueOf(tb.f.f116965a), k03, Integer.valueOf(hashCode));
                        } catch (Exception e13) {
                            tb.f.O("asyncTraceEnd", e13);
                        }
                    }
                }
                return Unit.f80348a;
            case 1:
                r1 it = (r1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (z13) {
                    List list = (List) obj4;
                    Intrinsics.f(list);
                    q1 q1Var = (q1) obj3;
                    f30 f30Var = (f30) obj2;
                    boolean y13 = ((es.c) q1Var.f59324c).y(f30Var);
                    es.c cVar = (es.c) q1Var.f59324c;
                    v1Var = new s1(list, y13, cVar.z(f30Var), cVar.a(f30Var), it.f59337J != null ? bs1.c.E0(r2) / bs1.c.w0(r2) : 1.0f);
                } else {
                    v1Var = t1.f59377a;
                }
                return r1.b(it, null, null, 0, null, v1Var, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -257, 4194303);
            default:
                qn2.i refiner = (qn2.i) obj;
                Intrinsics.checkNotNullParameter(refiner, "refiner");
                am2.j descriptor = ((pn2.b1) obj4).b();
                if (descriptor != null) {
                    ((qn2.h) refiner).getClass();
                    Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kb.a0 a0Var, boolean z13, String str, a1 a1Var) {
        super(1);
        this.f82692k = a0Var;
        this.f82691j = z13;
        this.f82693l = str;
        this.f82694m = a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(boolean z13, ArrayList arrayList, q1 q1Var, f30 f30Var) {
        super(1);
        this.f82691j = z13;
        this.f82692k = arrayList;
        this.f82693l = q1Var;
        this.f82694m = f30Var;
    }
}
