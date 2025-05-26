package o71;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f93377j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f93378k = new u(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93379i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f93379i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93379i) {
            case 0:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                vb0.j.f125466a.E("SearchTypeaheadPinCarouselPresenter:loadPins", th3);
                return Unit.f80348a;
            default:
                IndexedValue it = (IndexedValue) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f80350b instanceof f30);
        }
    }
}
