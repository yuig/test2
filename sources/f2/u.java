package f2;

import b2.a1;
import b2.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60915i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f60916j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f60917k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(boolean z13, k kVar, int i13) {
        super(3);
        this.f60915i = i13;
        this.f60916j = z13;
        this.f60917k = kVar;
    }

    public final void b(e0 e0Var, i2.o oVar, int i13) {
        int i14 = this.f60915i;
        Object obj = this.f60917k;
        switch (i14) {
            case 0:
                boolean z13 = this.f60916j;
                s.f60907a.b(e0Var, null, z13, (k) obj, null, null, 0.0f, 0.0f, oVar, (i13 & 14) | 100663296, RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM);
                break;
            default:
                s.f60907a.b(e0Var, null, this.f60916j, (k) obj, null, null, 0.0f, 0.0f, oVar, (i13 & 14) | 100663296, RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM);
                break;
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f60915i) {
            case 0:
                b((e0) obj, (i2.o) obj2, ((Number) obj3).intValue());
                return Unit.f80348a;
            case 1:
                b((e0) obj, (i2.o) obj2, ((Number) obj3).intValue());
                return Unit.f80348a;
            default:
                u2.q qVar = (u2.q) obj;
                ((Number) obj3).intValue();
                i2.s sVar = (i2.s) ((i2.o) obj2);
                sVar.W(-196777734);
                long j13 = ((a1) sVar.m(b1.f21111a)).f21105a;
                boolean g13 = sVar.g(j13);
                Function0 function0 = (Function0) this.f60917k;
                boolean h10 = g13 | sVar.h(function0);
                boolean z13 = this.f60916j;
                boolean i13 = h10 | sVar.i(z13);
                Object J2 = sVar.J();
                if (i13 || J2 == i2.n.f71185a) {
                    J2 = new b2.g(j13, function0, z13);
                    sVar.g0(J2);
                }
                u2.q e13 = androidx.compose.ui.draw.a.e(qVar, (Function1) J2);
                sVar.r(false);
                return e13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z13, Function0 function0) {
        super(3);
        this.f60915i = 2;
        this.f60917k = function0;
        this.f60916j = z13;
    }
}
