package nn1;

import androidx.appcompat.widget.AppCompatButton;
import com.pinterest.gestalt.splitButton.view.ButtonWithEllipsize;
import com.pinterest.gestalt.splitButton.view.GestaltSplitButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91560i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSplitButton f91561j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(GestaltSplitButton gestaltSplitButton, int i13) {
        super(0);
        this.f91560i = i13;
        this.f91561j = gestaltSplitButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f91560i;
        GestaltSplitButton gestaltSplitButton = this.f91561j;
        switch (i13) {
            case 0:
                return (AppCompatButton) gestaltSplitButton.findViewById(mn1.d.split_button_icon_button);
            default:
                return (ButtonWithEllipsize) gestaltSplitButton.findViewById(mn1.d.split_button_text_button);
        }
    }
}
