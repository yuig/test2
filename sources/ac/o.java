package ac;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1873i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f1874j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i13) {
        super(0);
        this.f1873i = i13;
        this.f1874j = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f1873i;
        p pVar = this.f1874j;
        switch (i13) {
            case 0:
                return Boolean.valueOf((((com.airbnb.lottie.h) pVar.f1876b.getValue()) == null && ((Throwable) pVar.f1877c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) pVar.f1877c.getValue()) != null);
            case 2:
                if (((com.airbnb.lottie.h) pVar.f1876b.getValue()) == null && ((Throwable) pVar.f1877c.getValue()) == null) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                return Boolean.valueOf(((com.airbnb.lottie.h) pVar.f1876b.getValue()) != null);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f1873i) {
        }
        return invoke();
    }
}
