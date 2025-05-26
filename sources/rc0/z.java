package rc0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final z f107489i = new z(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.SmallAlwaysLightButton smallAlwaysLightButton = new GestaltButton.SmallAlwaysLightButton(6, context, (AttributeSet) null);
        bs1.c.s(smallAlwaysLightButton, e.M);
        return smallAlwaysLightButton;
    }
}
