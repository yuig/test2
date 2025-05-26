package y3;

import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import io.embrace.android.embracesdk.internal.payload.NativeCrashData;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.a implements Function1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f136727h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object obj, int i13) {
        super(1, obj, k2.e.class, "add", "add(Ljava/lang/Object;)Z", 8);
        this.f136727h = i13;
        if (i13 == 1) {
            super(1, obj, xj2.b.class, "add", "add(Lio/reactivex/disposables/Disposable;)Z", 8);
            return;
        }
        if (i13 == 2) {
            super(1, obj, LegoPinGridCellImpl.class, "navigateToCloseupDirectly", "navigateToCloseupDirectly(Lcom/pinterest/api/model/Pin;)Z", 8);
        } else if (i13 != 3) {
        } else {
            super(1, obj, Set.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f136727h;
        Object obj2 = this.f80413a;
        switch (i13) {
            case 0:
                ((k2.e) obj2).b((n) obj);
                break;
            case 1:
                xj2.c p03 = (xj2.c) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((xj2.b) obj2).a(p03);
                break;
            case 2:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "p0");
                LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) obj2;
                legoPinGridCellImpl.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                legoPinGridCellImpl.i2(pin, false);
                break;
            default:
                NativeCrashData p04 = (NativeCrashData) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                ((Set) obj2).add(p04);
                break;
        }
        return Unit.f80348a;
    }
}
