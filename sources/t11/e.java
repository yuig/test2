package t11;

import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.PinFeatureModuleLocation;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.f3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f115796j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f115797k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f115798l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f115799m = new e(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115800i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f115800i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f115800i) {
            case 0:
                return Unit.f80348a;
            case 1:
                v7 it = (v7) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean[] zArr = it.f42764n0;
                return Boolean.valueOf(zArr.length > 42 && zArr[42]);
            case 2:
                return Unit.f80348a;
            default:
                Navigation it2 = (Navigation) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.getF49939a() != PinFeatureModuleLocation.PIN_EDIT_PIN && !Intrinsics.d(it2.getF49939a(), (ScreenLocation) f3.f50792i.getValue())) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
        }
    }
}
