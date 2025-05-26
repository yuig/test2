package y3;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136717i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f136718j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CancellationSignal cancellationSignal, int i13) {
        super(1);
        this.f136717i = i13;
        this.f136718j = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CancellationSignal cancellationSignal = this.f136718j;
        int i13 = this.f136717i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        if (th3 != null) {
                            cancellationSignal.cancel();
                            break;
                        }
                        break;
                    default:
                        cancellationSignal.cancel();
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        if (th4 != null) {
                            cancellationSignal.cancel();
                            break;
                        }
                        break;
                    default:
                        cancellationSignal.cancel();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
