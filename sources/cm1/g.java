package cm1;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28020i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltButtonGroup f28021j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(GestaltButtonGroup gestaltButtonGroup, int i13) {
        super(0);
        this.f28020i = i13;
        this.f28021j = gestaltButtonGroup;
    }

    public final LinearLayout.LayoutParams b() {
        int i13 = this.f28020i;
        GestaltButtonGroup gestaltButtonGroup = this.f28021j;
        switch (i13) {
            case 1:
                GestaltButton gestaltButton = gestaltButtonGroup.f49339c;
                if (gestaltButton == null) {
                    Intrinsics.r("primaryButton");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = gestaltButton.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = 0.5f;
                return layoutParams2;
            default:
                GestaltButton gestaltButton2 = gestaltButtonGroup.f49340d;
                if (gestaltButton2 == null) {
                    Intrinsics.r("secondaryButton");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = gestaltButton2.getLayoutParams();
                Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.weight = 0.5f;
                return layoutParams4;
        }
    }

    public final Integer e() {
        int i13 = this.f28020i;
        GestaltButtonGroup gestaltButtonGroup = this.f28021j;
        switch (i13) {
            case 0:
                Resources resources = gestaltButtonGroup.getResources();
                Context context = gestaltButtonGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return Integer.valueOf(resources.getDimensionPixelSize(dl2.b.a1(context, GestaltButtonGroup.f49334l)));
            default:
                Resources resources2 = gestaltButtonGroup.getResources();
                Context context2 = gestaltButtonGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return Integer.valueOf(resources2.getDimensionPixelSize(dl2.b.a1(context2, GestaltButtonGroup.f49335m)));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f28020i) {
            case 0:
                return e();
            case 1:
                return b();
            case 2:
                return b();
            default:
                return e();
        }
    }
}
