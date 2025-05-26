package kp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80541i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f80542j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, int i13) {
        super(1);
        this.f80541i = i13;
        this.f80542j = mVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f80541i;
        m mVar = this.f80542j;
        switch (i13) {
            case 0:
                ek2.f fVar = mVar.f80557l;
                if (fVar != null) {
                    bk2.c.dispose(fVar);
                    break;
                }
                break;
            case 1:
                ek2.f fVar2 = mVar.f80557l;
                if (fVar2 != null) {
                    bk2.c.dispose(fVar2);
                    break;
                }
                break;
            case 2:
                ek2.f fVar3 = mVar.f80558m;
                if (fVar3 != null) {
                    bk2.c.dispose(fVar3);
                    break;
                }
                break;
            case 3:
                ek2.f fVar4 = mVar.f80558m;
                if (fVar4 != null) {
                    bk2.c.dispose(fVar4);
                    break;
                }
                break;
            case 4:
                ek2.f fVar5 = mVar.f80557l;
                if (fVar5 != null) {
                    bk2.c.dispose(fVar5);
                    break;
                }
                break;
            default:
                ek2.f fVar6 = mVar.f80557l;
                if (fVar6 != null) {
                    bk2.c.dispose(fVar6);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80541i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
