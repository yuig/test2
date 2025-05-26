package cn0;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f28087j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f28088k = new o(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28089i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(1);
        this.f28089i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f28089i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        break;
                    default:
                        boolean z13 = th3 instanceof CancellationException;
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        break;
                    default:
                        boolean z14 = th4 instanceof CancellationException;
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
