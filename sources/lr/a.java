package lr;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes3.dex */
public final class a extends k92.a {

    /* renamed from: g, reason: collision with root package name */
    public final i0 f84467g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84468h;

    public a(k0 message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f84467g = message;
        this.f84468h = str;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
        pp2.a.l(gestaltToast, new tq.a0(this, 4));
        return gestaltToast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.d(this.f84467g, aVar.f84467g) && Intrinsics.d(this.f84468h, aVar.f84468h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f84467g, this.f84468h);
    }
}
