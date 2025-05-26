package b10;

import com.pinterest.api.model.pr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.pi;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pr f20865j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ pi f20866k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(pr prVar, pi piVar, int i13) {
        super(0);
        this.f20864i = i13;
        this.f20865j = prVar;
        this.f20866k = piVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20864i) {
            case 0:
                m51invoke();
                break;
            case 1:
                m51invoke();
                break;
            case 2:
                m51invoke();
                break;
            case 3:
                m51invoke();
                break;
            default:
                m51invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m51invoke() {
        int i13 = this.f20864i;
        pr prVar = this.f20865j;
        pi piVar = this.f20866k;
        switch (i13) {
            case 0:
                prVar.e(piVar.f133052a);
                break;
            case 1:
                prVar.f(piVar.f133053b != null ? Double.valueOf(r0.intValue()) : null);
                break;
            case 2:
                prVar.b(piVar.f133054c);
                break;
            case 3:
                prVar.d(piVar.f133055d);
                break;
            default:
                prVar.c(piVar.f133056e != null ? Double.valueOf(r0.intValue()) : null);
                break;
        }
    }
}
