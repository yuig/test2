package xh0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yl1.l;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f134962j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f134963k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134964i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f134964i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134964i) {
            case 0:
                ((Boolean) obj).getClass();
                break;
            default:
                l bind = (l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(yl1.c.LARGE);
                break;
        }
        return Unit.f80348a;
    }
}
