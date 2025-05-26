package rc0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final h0 f107320i = new h0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.SmallPrimaryButton smallPrimaryButton = new GestaltButton.SmallPrimaryButton(6, context, (AttributeSet) null);
        if (Build.VERSION.SDK_INT >= 29) {
            smallPrimaryButton.setForceDarkAllowed(false);
        }
        bs1.c.s(smallPrimaryButton, a0.f107247o);
        return smallPrimaryButton;
    }
}
