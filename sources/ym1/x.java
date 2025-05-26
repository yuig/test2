package ym1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139459i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ha.a f139460j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(ha.a aVar, int i13) {
        super(0);
        this.f139459i = i13;
        this.f139460j = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ha.a aVar = this.f139460j;
        int i13 = this.f139459i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        Function0 function0 = (Function0) aVar.f68325j;
                        if (function0 != null) {
                            function0.invoke();
                            break;
                        }
                        break;
                    default:
                        Function0 function02 = (Function0) aVar.f68326k;
                        if (function02 != null) {
                            function02.invoke();
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        Function0 function03 = (Function0) aVar.f68325j;
                        if (function03 != null) {
                            function03.invoke();
                            break;
                        }
                        break;
                    default:
                        Function0 function04 = (Function0) aVar.f68326k;
                        if (function04 != null) {
                            function04.invoke();
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
