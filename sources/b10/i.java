package b10;

import com.pinterest.api.model.pr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.rg;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20896i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pr f20897j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ rg f20898k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(pr prVar, rg rgVar, int i13) {
        super(0);
        this.f20896i = i13;
        this.f20897j = prVar;
        this.f20898k = rgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f20896i) {
            case 0:
                m57invoke();
                break;
            case 1:
                m57invoke();
                break;
            case 2:
                m57invoke();
                break;
            case 3:
                m57invoke();
                break;
            default:
                m57invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m57invoke() {
        int i13 = this.f20896i;
        pr prVar = this.f20897j;
        rg rgVar = this.f20898k;
        switch (i13) {
            case 0:
                prVar.d(rgVar.f133211b);
                break;
            case 1:
                prVar.b(rgVar.f133212c);
                break;
            case 2:
                prVar.f(rgVar.f133213d != null ? Double.valueOf(r0.intValue()) : null);
                break;
            case 3:
                prVar.c(rgVar.f133214e != null ? Double.valueOf(r0.intValue()) : null);
                break;
            default:
                prVar.e(rgVar.f133215f);
                break;
        }
    }
}
