package tp1;

import ao1.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.u;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118783i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f118784j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f118783i = i13;
        this.f118784j = eVar;
    }

    public final void b(i bind) {
        int i13 = this.f118783i;
        e eVar = this.f118784j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(eVar.f118786d);
                bind.f20099p = Integer.valueOf(eVar.f118787e);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(eVar.f118786d);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f118783i;
        e eVar = this.f118784j;
        switch (i13) {
            case 0:
                b((i) obj);
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    xp0.d dVar = (xp0.d) eVar.f118793k.getValue();
                    dVar.v3();
                    dVar.clearDisposables();
                    eVar.f118791i.dispose();
                    a.c.y(u.f85943a);
                }
                break;
            case 2:
                String str = (String) obj;
                xp0.d dVar2 = (xp0.d) eVar.f118793k.getValue();
                Intrinsics.f(str);
                dVar2.G3(str);
                break;
            default:
                b((i) obj);
                break;
        }
        return Unit.f80348a;
    }
}
