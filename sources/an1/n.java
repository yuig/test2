package an1;

import android.widget.RadioGroup;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class n extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15754i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltRadioGroup f15755j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(GestaltRadioGroup gestaltRadioGroup, int i13) {
        super(0);
        this.f15754i = i13;
        this.f15755j = gestaltRadioGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f15754i;
        GestaltRadioGroup gestaltRadioGroup = this.f15755j;
        switch (i13) {
            case 0:
                return (GestaltText) gestaltRadioGroup.findViewById(bn1.b.radio_group_legend);
            default:
                return (RadioGroup) gestaltRadioGroup.findViewById(bn1.b.radio_group);
        }
    }
}
