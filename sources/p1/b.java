package p1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f98481i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f98482j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f98483k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(float f13, float f14, List list) {
        super(1);
        this.f98483k = list;
        this.f98481i = f13;
        this.f98482j = f14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d3.h Canvas = (d3.h) obj;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        d3.h.q(Canvas, new b3.h0((List) this.f98483k, com.bumptech.glide.c.d(0.0f, this.f98481i), com.bumptech.glide.c.d(0.0f, this.f98482j), 0), 0L, 0L, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        return Unit.f80348a;
    }
}
