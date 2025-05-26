package rc0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final n f107330i = new n(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.SmallShoppingButton smallShoppingButton = new GestaltButton.SmallShoppingButton(6, context, (AttributeSet) null);
        if (Build.VERSION.SDK_INT >= 29) {
            smallShoppingButton.setForceDarkAllowed(false);
        }
        smallShoppingButton.setText("Button");
        return smallShoppingButton;
    }
}
