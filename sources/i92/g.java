package i92;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class g extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public String f71928d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71929e;

    public /* synthetic */ g(String str) {
        this(str, 5000);
    }

    @Override // we0.a
    public GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
        gestaltToast.sendAccessibilityEvent(8);
        pp2.a.l(gestaltToast, new s12.a(this, 28));
        return gestaltToast;
    }

    public final String d() {
        return this.f71928d;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f71928d = str;
    }

    public g(String message, int i13) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f71928d = message;
        this.f71929e = i13;
    }
}
