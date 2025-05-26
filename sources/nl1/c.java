package nl1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f91279j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f91280k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91281i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f91281i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91281i) {
            case 0:
                break;
            default:
                ((Throwable) obj).getMessage();
                break;
        }
        return Unit.f80348a;
    }
}
