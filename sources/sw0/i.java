package sw0;

import com.pinterest.api.model.i01;
import com.pinterest.api.model.k01;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115450i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f115451j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(0);
        this.f115450i = i13;
        this.f115451j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f115450i) {
            case 0:
                m261invoke();
                break;
            default:
                m261invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m261invoke() {
        int i13 = this.f115450i;
        j jVar = this.f115451j;
        switch (i13) {
            case 0:
                jVar.f115462g = null;
                r0 r0Var = jVar.f115456a;
                if (r0Var != null) {
                    r0Var.e(jVar.f115469n);
                    break;
                }
                break;
            default:
                k01 k01Var = jVar.f115462g;
                if (k01Var != null) {
                    k01Var.f39243f.add(i01.FAILED_TO_LOAD_THUMBNAIL);
                }
                jVar.f115462g = null;
                r0 r0Var2 = jVar.f115456a;
                if (r0Var2 != null) {
                    r0Var2.e(jVar.f115469n);
                    break;
                }
                break;
        }
    }
}
