package x02;

import com.pinterest.api.model.z2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131479i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f131480j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z2 f131481k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(u uVar, z2 z2Var, int i13) {
        super(1);
        this.f131479i = i13;
        this.f131480j = uVar;
        this.f131481k = z2Var;
    }

    public final void b(Throwable th3) {
        int i13 = this.f131479i;
        z2 z2Var = this.f131481k;
        u uVar = this.f131480j;
        switch (i13) {
            case 0:
                uVar.W(z2Var);
                uj2.l.d(z2Var);
                break;
            case 1:
                uVar.W(z2Var);
                uj2.l.d(z2Var);
                break;
            case 2:
                uVar.W(z2Var);
                uj2.l.d(z2Var);
                break;
            default:
                uVar.W(z2Var);
                uj2.l.d(z2Var);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131479i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
