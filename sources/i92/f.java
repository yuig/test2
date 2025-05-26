package i92;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends g {
    public /* synthetic */ f(String str) {
        this(str, 5000);
    }

    @Override // i92.g, we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
        pp2.a.l(gestaltToast, new s12.a(this, 27));
        return gestaltToast;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String message, int i13) {
        super(message, i13);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
