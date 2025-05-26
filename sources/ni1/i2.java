package ni1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.od;
import so.qc;
import so.rc;

/* loaded from: classes2.dex */
public final class i2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90706i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f90707j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l82.e f90708k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(int i13, l82.e eVar, boolean z13) {
        super(0);
        this.f90706i = i13;
        this.f90707j = z13;
        this.f90708k = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f90706i) {
            case 0:
                m193invoke();
                break;
            case 1:
                m193invoke();
                break;
            case 2:
                m193invoke();
                break;
            case 3:
                m193invoke();
                break;
            default:
                m193invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m193invoke() {
        od odVar = od.f114047a;
        int i13 = this.f90706i;
        l82.e eVar = this.f90708k;
        boolean z13 = this.f90707j;
        switch (i13) {
            case 0:
                if (z13) {
                    ps0.m mVar = n2.f90745n;
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    eVar.a(new o(odVar));
                    break;
                }
                break;
            case 1:
                if (z13) {
                    ps0.m mVar2 = n2.f90745n;
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    eVar.a(new o(qc.f114080a));
                    break;
                }
                break;
            case 2:
                if (z13) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    eVar.a(a.f90592a);
                    break;
                }
                break;
            case 3:
                if (z13) {
                    ps0.m mVar3 = n2.f90745n;
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    eVar.a(new o(rc.f114199a));
                    break;
                }
                break;
            default:
                if (z13) {
                    ps0.m mVar4 = n2.f90745n;
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    eVar.a(new o(odVar));
                    break;
                }
                break;
        }
    }
}
