package ji1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.videocarousel.view.VideoCarouselActionCellView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76298i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f76299j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i13) {
        super(0);
        this.f76298i = i13;
        this.f76299j = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f76298i;
        g gVar = this.f76299j;
        switch (i13) {
            case 0:
                Context context = gVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new VideoCarouselActionCellView(6, context, (AttributeSet) null);
            default:
                Context context2 = gVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new i(context2);
        }
    }
}
