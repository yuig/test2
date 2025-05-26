package an1;

import com.pinterest.gestalt.radioGroup.GestaltRadio;
import com.pinterest.gestalt.radioGroup.GestaltRadioButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15728i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltRadioButton f15729j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GestaltRadioButton gestaltRadioButton, int i13) {
        super(0);
        this.f15728i = i13;
        this.f15729j = gestaltRadioButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f15728i;
        GestaltRadioButton gestaltRadioButton = this.f15729j;
        switch (i13) {
            case 0:
                return (GestaltText) gestaltRadioButton.findViewById(bn1.b.radio_button_label);
            default:
                return (GestaltRadio) gestaltRadioButton.findViewById(bn1.b.radio_button);
        }
    }
}
