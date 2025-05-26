package s3;

import kh2.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110959i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f110960j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f110961k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, long j13, int i13) {
        super(0);
        this.f110959i = i13;
        this.f110961k = obj;
        this.f110960j = j13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f110959i) {
            case 0:
                m253invoke();
                return Unit.f80348a;
            case 1:
                return ((b3.v0) ((b3.s) this.f110961k)).b(this.f110960j);
            default:
                m253invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m253invoke() {
        int i13 = this.f110959i;
        long j13 = this.f110960j;
        Object obj = this.f110961k;
        switch (i13) {
            case 0:
                a1 V0 = ((v0) obj).b().V0();
                Intrinsics.f(V0);
                ((w) V0).Q(j13);
                return;
            default:
                kh2.j2 j2Var = (kh2.j2) obj;
                try {
                    c0.d.M2("span-service-init");
                    ((s2) j2Var.f79551c).e().a(j13);
                    Unit unit = Unit.f80348a;
                    return;
                } finally {
                }
        }
    }
}
