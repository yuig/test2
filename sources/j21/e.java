package j21;

import android.content.Context;
import com.pinterest.feature.minicell.view.PinMiniCellView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import q21.k;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74496i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f74497j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f74496i = i13;
        this.f74497j = fVar;
    }

    public final PinMiniCellView b() {
        int i13 = this.f74496i;
        f fVar = this.f74497j;
        switch (i13) {
            case 0:
                Context context = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new PinMiniCellView(context);
            default:
                Context context2 = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new PinMiniCellView(context2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f74496i;
        f fVar = this.f74497j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                Context context = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new a(context, fVar.f74502e);
            case 2:
                return b();
            default:
                Context context2 = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                k kVar = new k(context2, fVar.f74502e);
                kVar.setOnClickListener(new com.pinterest.feature.home.view.c(fVar, 22));
                return kVar;
        }
    }
}
