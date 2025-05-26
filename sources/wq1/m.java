package wq1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130837i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f130838j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i13) {
        super(1);
        this.f130837i = i13;
        this.f130838j = nVar;
    }

    public final void b(Throwable it) {
        int i13 = this.f130837i;
        n nVar = this.f130838j;
        switch (i13) {
            case 1:
                com.pinterest.identity.authentication.a aVar = nVar.f130840b;
                Intrinsics.f(it);
                aVar.a(false, it);
                break;
            case 3:
                com.pinterest.identity.authentication.a aVar2 = nVar.f130840b;
                Intrinsics.f(it);
                aVar2.a(false, it);
                break;
            case 5:
                com.pinterest.identity.authentication.a aVar3 = nVar.f130840b;
                Intrinsics.f(it);
                aVar3.a(false, it);
                break;
            case 8:
                com.pinterest.identity.authentication.a aVar4 = nVar.f130840b;
                Intrinsics.f(it);
                aVar4.a(false, it);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                nVar.f130840b.a(false, it);
                break;
        }
    }

    public final void e(xj2.c cVar) {
        int i13 = this.f130837i;
        n nVar = this.f130838j;
        switch (i13) {
            case 0:
                nVar.f130843e.d(new of0.a(new mf0.l()));
                break;
            case 1:
            case 3:
            default:
                nVar.f130843e.d(new of0.a(new mf0.l()));
                break;
            case 2:
                nVar.f130843e.d(new of0.a(new mf0.l()));
                break;
            case 4:
                nVar.f130843e.d(new of0.a(new mf0.l()));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130837i) {
            case 0:
                e((xj2.c) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                e((xj2.c) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                e((xj2.c) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            case 6:
                e((xj2.c) obj);
                break;
            case 7:
                Object c13 = ((tt1.a) obj).c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                boolean booleanValue = ((Boolean) c13).booleanValue();
                n nVar = this.f130838j;
                if (booleanValue) {
                    ((f) ((i) nVar.getView())).i8(j.LAUNCH_ADS_STEP);
                } else {
                    nVar.x3();
                }
                break;
            case 8:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
