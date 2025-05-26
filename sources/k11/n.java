package k11;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class n extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f78158d;

    public n(int i13) {
        this.f78158d = i13;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        switch (this.f78158d) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new GestaltToast(context, new do1.d(bs1.c.j2(new String[0], x0.generic_error), null, null, do1.n.ERROR, 0, 0, 0, null, false, 502));
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltToast gestaltToast = new GestaltToast(6, context2, (AttributeSet) null);
                gestaltToast.v(cb1.e.f27273m);
                return gestaltToast;
        }
    }
}
