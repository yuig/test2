package we1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129549i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ re1.s f129550j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(re1.s sVar, int i13) {
        super(0);
        this.f129549i = i13;
        this.f129550j = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        re1.s sVar = this.f129550j;
        int i13 = this.f129549i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        Function1 function1 = sVar.f107662c;
                        if (function1 != null) {
                            function1.invoke(sVar.f107661b);
                            break;
                        }
                        break;
                    default:
                        Function1 function12 = sVar.f107662c;
                        if (function12 != null) {
                            function12.invoke(sVar.f107661b);
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        Function1 function13 = sVar.f107662c;
                        if (function13 != null) {
                            function13.invoke(sVar.f107661b);
                            break;
                        }
                        break;
                    default:
                        Function1 function14 = sVar.f107662c;
                        if (function14 != null) {
                            function14.invoke(sVar.f107661b);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
