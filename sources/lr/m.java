package lr;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends i92.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // i92.g, we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new GestaltToast(context, new do1.d(bs1.c.h2(this.f71928d), null, null, null, 0, 7000, 0, null, false, 478));
    }
}
