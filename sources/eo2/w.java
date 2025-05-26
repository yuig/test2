package eo2;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes4.dex */
public final class w implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59843b;

    public /* synthetic */ w(Object obj, int i13) {
        this.f59842a = i13;
        this.f59843b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f59843b;
        int i13 = this.f59842a;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        ao2.x xVar = (ao2.x) obj2;
                        if (xVar.isActive()) {
                            xVar.cancel((CancellationException) new AbortFlowException(xVar));
                            break;
                        }
                        break;
                    default:
                        ((xj2.c) obj2).dispose();
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        ao2.x xVar2 = (ao2.x) obj2;
                        if (xVar2.isActive()) {
                            xVar2.cancel((CancellationException) new AbortFlowException(xVar2));
                            break;
                        }
                        break;
                    default:
                        ((xj2.c) obj2).dispose();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
