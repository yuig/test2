package rc0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final s f107395i = new s(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.SmallTransparentButton smallTransparentButton = new GestaltButton.SmallTransparentButton(6, context, (AttributeSet) null);
        if (Build.VERSION.SDK_INT >= 29) {
            smallTransparentButton.setForceDarkAllowed(false);
        }
        smallTransparentButton.setText("Button");
        return smallTransparentButton;
    }
}
