package qp1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f104800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ do1.d f104801e;

    public k0(do1.d dVar, int i13) {
        this.f104800d = i13;
        this.f104801e = dVar;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        int i13 = this.f104800d;
        do1.d dVar = this.f104801e;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
                gestaltToast.v(new j0(dVar, 0));
                return gestaltToast;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context2 = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltToast gestaltToast2 = new GestaltToast(6, context2, (AttributeSet) null);
                gestaltToast2.v(new j0(dVar, 1));
                return gestaltToast2;
        }
    }
}
