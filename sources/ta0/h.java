package ta0;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f116880d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116881e;

    public h(Bitmap collageBitmap, String collageId) {
        Intrinsics.checkNotNullParameter(collageBitmap, "collageBitmap");
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        this.f116880d = collageBitmap;
        this.f116881e = collageId;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
        gestaltToast.v(new sv.y(gestaltToast, this, container, 13));
        return gestaltToast;
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        kg.t.L0(new nx.a0(), this.f116881e, null, null, null, 28);
    }
}
