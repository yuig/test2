package rc0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final x f107478i = new x(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.LargeAlwaysLightButton largeAlwaysLightButton = new GestaltButton.LargeAlwaysLightButton(6, context, (AttributeSet) null);
        bs1.c.s(largeAlwaysLightButton, e.K);
        return largeAlwaysLightButton;
    }
}
