package b10;

import com.pinterest.api.model.al0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x40.ag;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20887i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ al0 f20888j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ag f20889k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(al0 al0Var, ag agVar, int i13) {
        super(0);
        this.f20887i = i13;
        this.f20888j = al0Var;
        this.f20889k = agVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ag agVar = this.f20889k;
        al0 al0Var = this.f20888j;
        int i13 = this.f20887i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        al0Var.f35797g = agVar.f131968a;
                        boolean[] zArr = al0Var.f35803m;
                        if (zArr.length > 6) {
                            zArr[6] = true;
                            break;
                        }
                        break;
                    default:
                        al0Var.d(agVar.f131970c);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        al0Var.f35797g = agVar.f131968a;
                        boolean[] zArr2 = al0Var.f35803m;
                        if (zArr2.length > 6) {
                            zArr2[6] = true;
                            break;
                        }
                        break;
                    default:
                        al0Var.d(agVar.f131970c);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
