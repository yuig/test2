package lr;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84539d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f84540e;

    public r(int i13, Function0 onShareActionClick) {
        this.f84539d = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(onShareActionClick, "onShareActionClick");
            this.f84540e = onShareActionClick;
        } else {
            Intrinsics.checkNotNullParameter(onShareActionClick, "onButtonClick");
            this.f84540e = onShareActionClick;
            this.f129243c = true;
        }
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        switch (this.f84539d) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
                gestaltToast.v(new e.f(this, container, gestaltToast, 23));
                return gestaltToast;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltToast gestaltToast2 = new GestaltToast(6, context2, (AttributeSet) null);
                gestaltToast2.v(new rx0.f(this, container, gestaltToast2, 28));
                return gestaltToast2;
        }
    }
}
