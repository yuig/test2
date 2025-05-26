package lr;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class k extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public String f84518d;

    public k(yk1.v viewResources) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f84518d = "";
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new GestaltToast(context, new do1.d(bs1.c.h2(this.f84518d), do1.k.f55681a, null, null, 0, 0, 0, null, false, 508));
    }
}
