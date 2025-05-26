package n90;

import i2.o;
import i2.u;
import java.util.List;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class k extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90012i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f90013j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f90014k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f90015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f90016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f90017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f90018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f90019p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list, float f13, float f14, float f15, q qVar, int i13, int i14) {
        super(2);
        this.f90015l = list;
        this.f90014k = f13;
        this.f90016m = f14;
        this.f90017n = f15;
        this.f90013j = qVar;
        this.f90018o = i13;
        this.f90019p = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f90012i;
        int i15 = this.f90018o;
        switch (i14) {
            case 0:
                int p13 = u.p(i15 | 1);
                l.c(this.f90014k, this.f90016m, this.f90017n, p13, this.f90019p, oVar, this.f90013j, this.f90015l);
                break;
            default:
                int p14 = u.p(i15 | 1);
                m2.J(this.f90014k, this.f90016m, this.f90017n, p14, this.f90019p, oVar, this.f90013j, this.f90015l);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f90012i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, float f13, List list, float f14, float f15, int i13, int i14) {
        super(2);
        this.f90013j = qVar;
        this.f90014k = f13;
        this.f90015l = list;
        this.f90016m = f14;
        this.f90017n = f15;
        this.f90018o = i13;
        this.f90019p = i14;
    }
}
