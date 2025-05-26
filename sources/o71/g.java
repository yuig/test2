package o71;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93290i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f93291j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(1);
        this.f93290i = i13;
        this.f93291j = iVar;
    }

    public final void b(String str) {
        int i13 = this.f93290i;
        i iVar = this.f93291j;
        switch (i13) {
            case 0:
                k71.o oVar = (k71.o) iVar.getViewIfBound();
                if (oVar != null) {
                    Intrinsics.f(str);
                    ((q71.x) oVar).Y8(str);
                    break;
                }
                break;
            default:
                Intrinsics.f(str);
                iVar.addDisposable(iVar.f93301l.f93340h.J(j22.l.TOP, str).i(new fp.a(24, iVar, str), new u51.b(24, new b31.f(str, 18))));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i iVar = this.f93291j;
        int i13 = this.f93290i;
        switch (i13) {
            case 0:
                b((String) obj);
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th3);
                        iVar.f93301l.f93345m.o("Error occurred in response to auto-fill change emission", th3);
                        break;
                    default:
                        Intrinsics.f(th3);
                        iVar.f93301l.f93345m.o("Error occurred while clearing query from type-ahead suggestions", th3);
                        break;
                }
                break;
            case 2:
                b((String) obj);
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th4);
                        iVar.f93301l.f93345m.o("Error occurred in response to auto-fill change emission", th4);
                        break;
                    default:
                        Intrinsics.f(th4);
                        iVar.f93301l.f93345m.o("Error occurred while clearing query from type-ahead suggestions", th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
