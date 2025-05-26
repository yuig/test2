package om1;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96652i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButton f96653j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(GestaltIconButton gestaltIconButton, int i13) {
        super(0);
        this.f96652i = i13;
        this.f96653j = gestaltIconButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f96652i;
        GestaltIconButton gestaltIconButton = this.f96653j;
        switch (i13) {
            case 0:
                return (AppCompatButton) gestaltIconButton.findViewById(v.icon_button);
            default:
                return (FrameLayout) gestaltIconButton.findViewById(v.icon_button_container);
        }
    }
}
