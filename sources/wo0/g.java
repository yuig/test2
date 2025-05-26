package wo0;

import android.widget.FrameLayout;
import ck2.i;
import com.pinterest.api.model.xk;
import go0.j;
import kl0.t;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import r41.k;
import uj2.q;
import x02.x2;
import xo0.n;
import yk1.r;

/* loaded from: classes5.dex */
public final class g extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f130648a;

    /* renamed from: b, reason: collision with root package name */
    public final k f130649b;

    /* renamed from: c, reason: collision with root package name */
    public xk f130650c;

    /* renamed from: d, reason: collision with root package name */
    public String f130651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.d presenterPinalytics, q networkStateStream, x2 userRepository) {
        super(presenterPinalytics, networkStateStream);
        k profileNavigator = k.f106176a;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        this.f130648a = userRepository;
        this.f130649b = profileNavigator;
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(uo0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        xk xkVar = this.f130650c;
        if (xkVar != null) {
            String str = xkVar.f43721m;
            if (str != null && str.length() != 0) {
                String str2 = xkVar.f43721m;
                this.f130651d = str2;
                Intrinsics.checkNotNullExpressionValue(str2, "getCuratorUid(...)");
                xj2.c F = this.f130648a.L(str2).F(new j(19, new t(view, 25)), new j(20, f.f130647i), i.f27923c, i.f27924d);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                addDisposable(F);
            }
            String title = xkVar.n();
            if (title == null) {
                title = "";
            }
            n nVar = (n) view;
            Intrinsics.checkNotNullParameter(title, "title");
            a0.p(nVar.f135608d, title);
            Boolean g13 = xkVar.g();
            Intrinsics.checkNotNullExpressionValue(g13, "getShowCover(...)");
            boolean booleanValue = g13.booleanValue();
            FrameLayout frameLayout = nVar.f135605a;
            if (booleanValue) {
                String imageUrl = n10.b.a(xkVar);
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                nVar.f135606b.loadUrl(imageUrl);
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
            nVar.setContentDescription(title);
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((n) view).f135610f = this;
    }
}
