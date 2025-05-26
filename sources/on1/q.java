package on1;

import android.content.Context;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96752i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSwitchWithLabel f96753j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(GestaltSwitchWithLabel gestaltSwitchWithLabel, int i13) {
        super(0);
        this.f96752i = i13;
        this.f96753j = gestaltSwitchWithLabel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f96752i;
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f96753j;
        switch (i13) {
            case 0:
                return (GestaltSwitch) gestaltSwitchWithLabel.findViewById(v.gestalt_switch);
            case 1:
                return (GestaltText) gestaltSwitchWithLabel.findViewById(v.gestalt_switch_label);
            default:
                Context context = gestaltSwitchWithLabel.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return Integer.valueOf(ml2.c.c(dl2.b.D0(context, eo1.a.comp_switch_android_horizontal_gap)));
        }
    }
}
