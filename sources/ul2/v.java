package ul2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122616i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f122617j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(c0 c0Var, int i13) {
        super(0);
        this.f122616i = i13;
        this.f122617j = c0Var;
    }

    public final Collection b() {
        int i13 = this.f122616i;
        c0 c0Var = this.f122617j;
        switch (i13) {
            case 1:
                return c0Var.k(c0Var.a().j().w(), f0.DECLARED);
            case 2:
                in2.n b03 = c0Var.a().b0();
                Intrinsics.checkNotNullExpressionValue(b03, "getStaticScope(...)");
                return c0Var.k(b03, f0.DECLARED);
            case 3:
            default:
                in2.n b04 = c0Var.a().b0();
                Intrinsics.checkNotNullExpressionValue(b04, "getStaticScope(...)");
                return c0Var.k(b04, f0.INHERITED);
            case 4:
                return c0Var.k(c0Var.a().j().w(), f0.INHERITED);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dm2.m s13;
        sm2.c cVar;
        int i13 = this.f122616i;
        sm2.b bVar = null;
        c0 c0Var = this.f122617j;
        switch (i13) {
            case 0:
                Collection h10 = c0Var.h();
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(h10, 10));
                Iterator it = h10.iterator();
                while (it.hasNext()) {
                    arrayList.add(new k0(c0Var, (am2.l) it.next()));
                }
                return arrayList;
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                int i14 = c0.f122501d;
                ym2.b t13 = c0Var.t();
                y yVar = (y) c0Var.f122503c.getValue();
                yVar.getClass();
                rl2.u uVar = e0.f122514b[0];
                Object invoke = yVar.f122515a.invoke();
                Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
                fm2.g gVar = (fm2.g) invoke;
                am2.d0 d0Var = gVar.f62583a.f84109b;
                boolean z13 = t13.f139465c;
                Class cls = c0Var.f122502b;
                am2.g b13 = (z13 && cls.isAnnotationPresent(Metadata.class)) ? gVar.f62583a.b(t13) : lb.l0.c0(d0Var, t13);
                if (b13 != null) {
                    return b13;
                }
                if (cls.isSynthetic()) {
                    s13 = c0.s(t13, gVar);
                } else {
                    fm2.c f13 = re2.h.f(cls);
                    if (f13 != null && (cVar = f13.f62577b) != null) {
                        bVar = cVar.f113274a;
                    }
                    switch (bVar == null ? -1 : z.f122648a[bVar.ordinal()]) {
                        case -1:
                        case 6:
                            throw new u1("Unresolved class: " + cls + " (kind = " + bVar + ')');
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            s13 = c0.s(t13, gVar);
                            break;
                        case 5:
                            throw new u1("Unknown class: " + cls + " (kind = " + bVar + ')');
                    }
                }
                return s13;
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                if (c0Var.f122502b.isAnonymousClass()) {
                    return null;
                }
                ym2.b t14 = c0Var.t();
                if (t14.f139465c) {
                    return null;
                }
                return t14.b().b();
            default:
                return new y(c0Var);
        }
    }
}
