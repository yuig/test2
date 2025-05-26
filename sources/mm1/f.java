package mm1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87600i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f87601j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, int i13) {
        super(0);
        this.f87600i = i13;
        this.f87601j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        k kVar = this.f87601j;
        int i13 = this.f87600i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        Function0 function0 = kVar.f87624n;
                        if (function0 != null) {
                            function0.invoke();
                            break;
                        }
                        break;
                    default:
                        Function0 function02 = kVar.f87622l;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        kVar.f87612b.f87596i.invoke();
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        Function0 function03 = kVar.f87624n;
                        if (function03 != null) {
                            function03.invoke();
                            break;
                        }
                        break;
                    default:
                        Function0 function04 = kVar.f87622l;
                        if (function04 != null) {
                            function04.invoke();
                        }
                        kVar.f87612b.f87596i.invoke();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
