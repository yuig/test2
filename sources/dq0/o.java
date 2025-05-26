package dq0;

import com.pinterest.api.model.mv;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class o extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56118i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f56119j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mv f56120k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, mv mvVar, int i13) {
        super(1);
        this.f56118i = i13;
        this.f56119j = pVar;
        this.f56120k = mvVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mv mvVar = this.f56120k;
        p pVar = this.f56119j;
        int i13 = this.f56118i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        p.u3(pVar, th3.getMessage(), mvVar);
                        break;
                    default:
                        p.u3(pVar, th3.getMessage(), mvVar);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        p.u3(pVar, th4.getMessage(), mvVar);
                        break;
                    default:
                        p.u3(pVar, th4.getMessage(), mvVar);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
