package rc0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l f107327i = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.SmallSelectedButton smallSelectedButton = new GestaltButton.SmallSelectedButton(6, context, (AttributeSet) null);
        if (Build.VERSION.SDK_INT >= 29) {
            smallSelectedButton.setForceDarkAllowed(false);
        }
        bs1.c.s(smallSelectedButton, e.E);
        return smallSelectedButton;
    }
}
