package rq;

import android.content.Context;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class v3 extends PinCloseupBaseModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract void b();
}
