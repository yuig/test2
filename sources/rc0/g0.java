package rc0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final g0 f107318i = new g0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.LargePrimaryButton largePrimaryButton = new GestaltButton.LargePrimaryButton(6, context, (AttributeSet) null);
        if (Build.VERSION.SDK_INT >= 29) {
            largePrimaryButton.setForceDarkAllowed(false);
        }
        bs1.c.s(largePrimaryButton, a0.f107243k);
        return largePrimaryButton;
    }
}
