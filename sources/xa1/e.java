package xa1;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.divider.GestaltDivider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import u50.b0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134449i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f134450j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f134449i = i13;
        this.f134450j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f134449i;
        f fVar = this.f134450j;
        switch (i13) {
            case 0:
                Context context = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                a52.a aVar = new a52.a(context);
                aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                aVar.addView(new GestaltDivider(context, new jm1.b(new b0(r0.margin), RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED)));
                return aVar;
            default:
                Context requireContext = fVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                vb0.l lVar = fVar.A0;
                if (lVar != null) {
                    return new h(requireContext, lVar);
                }
                Intrinsics.r("manifestInfo");
                throw null;
        }
    }
}
