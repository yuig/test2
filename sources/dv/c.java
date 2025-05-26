package dv;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f56282j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f56283k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56284i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f56284i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f56284i) {
            case 0:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                boolean[] zArr = pin.f37485h3;
                return Boolean.valueOf(!(zArr.length > 47 && zArr[47]));
            default:
                return Unit.f80348a;
        }
    }
}
