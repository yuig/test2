package lr;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.k3;
import kotlin.jvm.internal.Intrinsics;
import rg0.i0;

/* loaded from: classes3.dex */
public final class p extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final wy0 f84536d;

    /* renamed from: e, reason: collision with root package name */
    public final f30 f84537e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f84538f;

    public p(f30 pin, wy0 creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f84536d = creator;
        this.f84537e = pin;
        this.f84538f = xk2.m.b(o.f84533j);
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltToast gestaltToast = new GestaltToast(6, context, (AttributeSet) null);
        return gestaltToast.v(new e.f(container, this, gestaltToast, 22));
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m60.w wVar = m60.u.f85943a;
        NavigationImpl z03 = Navigation.z0((ScreenLocation) k3.f51030e.getValue(), this.f84536d.getUid());
        z03.z(r41.b.FollowUpsellToast.ordinal(), "ADS_ONLY_PROFILE_ORIGIN");
        wVar.d(z03);
    }

    @Override // we0.a
    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        g4.u uVar = i0.f108029b;
        String uid = this.f84537e.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        g4.u.v0(uVar, uid, null, 6);
    }
}
