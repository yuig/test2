package w1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.s3;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127232i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l1 f127233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(l1 l1Var, int i13) {
        super(1);
        this.f127232i = i13;
        this.f127233j = l1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Unit unit;
        s3 s3Var;
        int i13 = this.f127232i;
        boolean z13 = false;
        l1 l1Var = this.f127233j;
        switch (i13) {
            case 0:
                q3.x xVar = (q3.x) obj;
                r2 d2 = l1Var.d();
                if (d2 != null) {
                    d2.f127473c = xVar;
                }
                return Unit.f80348a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                l1Var.f127371q.setValue(bool);
                return Unit.f80348a;
            case 2:
                List list = (List) obj;
                if (l1Var.d() != null) {
                    r2 d13 = l1Var.d();
                    Intrinsics.f(d13);
                    list.add(d13.f127471a);
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 3:
                int i14 = ((h4.n) obj).f67594a;
                h1 h1Var = l1Var.f127372r;
                h1Var.getClass();
                if (h4.n.a(i14, 7)) {
                    function1 = h1Var.a().f127306a;
                } else if (h4.n.a(i14, 2)) {
                    function1 = h1Var.a().f127307b;
                } else if (h4.n.a(i14, 6)) {
                    function1 = h1Var.a().f127308c;
                } else if (h4.n.a(i14, 5)) {
                    function1 = h1Var.a().f127309d;
                } else if (h4.n.a(i14, 3)) {
                    function1 = h1Var.a().f127310e;
                } else if (h4.n.a(i14, 4)) {
                    function1 = h1Var.a().f127311f;
                } else {
                    if (!h4.n.a(i14, 1) && !h4.n.a(i14, 0)) {
                        throw new IllegalStateException("invalid ImeAction".toString());
                    }
                    function1 = null;
                }
                if (function1 != null) {
                    function1.invoke(h1Var);
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    if (h4.n.a(i14, 6)) {
                        z2.j jVar = h1Var.f127282c;
                        if (jVar == null) {
                            Intrinsics.r("focusManager");
                            throw null;
                        }
                        ((androidx.compose.ui.focus.b) jVar).e(1);
                    } else if (h4.n.a(i14, 5)) {
                        z2.j jVar2 = h1Var.f127282c;
                        if (jVar2 == null) {
                            Intrinsics.r("focusManager");
                            throw null;
                        }
                        ((androidx.compose.ui.focus.b) jVar2).e(2);
                    } else if (h4.n.a(i14, 7) && (s3Var = h1Var.f127280a) != null) {
                        ((t3.h2) s3Var).a();
                    }
                }
                return Unit.f80348a;
            default:
                h4.f0 f0Var = (h4.f0) obj;
                String str = f0Var.f67559a.f21571a;
                b4.g gVar = l1Var.f127364j;
                if (!Intrinsics.d(str, gVar != null ? gVar.f21571a : null)) {
                    l1Var.f127365k.setValue(w0.None);
                }
                long j13 = b4.p0.f21639b;
                l1Var.g(j13);
                l1Var.f(j13);
                l1Var.f127373s.invoke(f0Var);
                i2.f2 f2Var = (i2.f2) l1Var.f127356b;
                i2.g2 g2Var = f2Var.f71111b;
                if (g2Var != null) {
                    g2Var.a(f2Var, null);
                }
                return Unit.f80348a;
        }
    }
}
