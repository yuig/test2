package xz1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends k92.a {
    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
        pp2.a.l(gestaltToast, a.f136243i);
        return gestaltToast;
    }

    public final boolean equals(Object obj) {
        return obj instanceof b;
    }

    public final int hashCode() {
        return b.class.hashCode();
    }
}
