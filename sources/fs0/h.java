package fs0;

import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f62841j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f62842k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f62843l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f62844m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f62845n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f62846o = new h(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62847i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f62847i = i13;
    }

    public final Boolean b(f30 pin) {
        switch (this.f62847i) {
            case 4:
                Intrinsics.checkNotNullParameter(pin, "pin");
                return Boolean.valueOf(pin.I5() == null);
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                return Boolean.valueOf(pin.t6() != null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f62847i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return b((f30) obj);
    }
}
