package on1;

import android.widget.CompoundButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSwitch f96735j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GestaltSwitch gestaltSwitch, int i13) {
        super(2);
        this.f96734i = i13;
        this.f96735j = gestaltSwitch;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        int i13 = this.f96734i;
        GestaltSwitch gestaltSwitch = this.f96735j;
        switch (i13) {
            case 0:
                CompoundButton compoundButton = (CompoundButton) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(compoundButton, "switch");
                if (compoundButton.isPressed() && (onCheckedChangeListener = gestaltSwitch.K) != null) {
                    onCheckedChangeListener.onCheckedChanged(gestaltSwitch, booleanValue);
                }
                return Unit.f80348a;
            default:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((CompoundButton) obj, "<anonymous parameter 0>");
                fm1.c cVar = GestaltSwitch.L;
                return gestaltSwitch.isChecked() ? new g(gestaltSwitch.getId()) : new h(gestaltSwitch.getId());
        }
    }
}
