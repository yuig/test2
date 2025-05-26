package oh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94468i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f94469j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i13) {
        super(1);
        this.f94468i = i13;
        this.f94469j = gVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f94468i;
        g gVar = this.f94469j;
        switch (i13) {
            case 0:
                Intrinsics.f(th3);
                gVar.getClass();
                gVar.f94472c.c(new a(th3));
                break;
            case 1:
                Intrinsics.f(th3);
                gVar.getClass();
                gVar.f94472c.c(new a(th3));
                break;
            default:
                Intrinsics.f(th3);
                gVar.getClass();
                gVar.f94472c.c(new a(th3));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94468i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                g gVar = this.f94469j;
                gVar.b().i(new d(gVar, 1), new ug0.d(13, new f(gVar, 1)));
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
