package tc0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f117334i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f117335j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f117336k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f117337l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f117338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(long j13, float f13, float f14, long j14, float f15) {
        super(1);
        this.f117334i = j13;
        this.f117335j = f13;
        this.f117336k = f14;
        this.f117337l = j14;
        this.f117338m = f15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d3.h Canvas = (d3.h) obj;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f13 = this.f117335j;
        d3.h.O(Canvas, this.f117334i, Canvas.l0(f13), 0L, this.f117336k, null, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
        d3.h.O(Canvas, this.f117337l, Canvas.l0(f13), 0L, 0.0f, new d3.l(Canvas.l0(this.f117338m), 0.0f, 0, 0, null, 30), RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
        return Unit.f80348a;
    }
}
