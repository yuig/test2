package ap;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class n extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20278i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f20279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(1);
        this.f20278i = i13;
        this.f20279j = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20278i;
        o oVar = this.f20279j;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                tb0.h hVar = oVar.f20284d;
                Intrinsics.f(th3);
                hVar.o("Error uploading contacts", th3);
                break;
            default:
                mf0.l lVar = new mf0.l();
                lVar.q7(bs1.c.b2(oVar.f20291k));
                oVar.f20287g.d(new of0.a(lVar));
                break;
        }
        return Unit.f80348a;
    }
}
