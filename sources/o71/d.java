package o71;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93252i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f93253j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f93252i = i13;
        this.f93253j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f93252i;
        e eVar = this.f93253j;
        switch (i13) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                eVar.addDisposable(eVar.f93261q.J(j22.l.TOP, it).i(new b(eVar.B3(), it, 0), new u51.b(19, new d(eVar, 1))));
                break;
            default:
                eVar.f93258n.i(((yk1.a) eVar.f93264t).f139224a.getString(x0.generic_error));
                break;
        }
        return Unit.f80348a;
    }
}
