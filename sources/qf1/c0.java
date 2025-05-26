package qf1;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f103647j = new c0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f103648k = new c0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103649i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i13) {
        super(1);
        this.f103649i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f103649i) {
            case 0:
                return Unit.f80348a;
            default:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                return Boolean.valueOf(pin.I5() == null);
        }
    }
}
