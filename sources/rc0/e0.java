package rc0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final e0 f107314i = new e0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltButton.LargeAlwaysDarkButton largeAlwaysDarkButton = new GestaltButton.LargeAlwaysDarkButton(6, context, (AttributeSet) null);
        bs1.c.s(largeAlwaysDarkButton, a0.f107245m);
        return largeAlwaysDarkButton;
    }
}
