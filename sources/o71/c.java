package o71;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93234i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k71.o f93235j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(k71.o oVar, int i13) {
        super(1);
        this.f93234i = i13;
        this.f93235j = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k71.o oVar = this.f93235j;
        int i13 = this.f93234i;
        switch (i13) {
            case 0:
                String str = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(str);
                        ((q71.x) oVar).Y8(str);
                        break;
                    default:
                        Intrinsics.f(str);
                        ((q71.x) oVar).Y8(str);
                        break;
                }
                break;
            default:
                String str2 = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.f(str2);
                        ((q71.x) oVar).Y8(str2);
                        break;
                    default:
                        Intrinsics.f(str2);
                        ((q71.x) oVar).Y8(str2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
