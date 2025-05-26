package lr;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import h32.b3;
import h32.u0;
import java.util.List;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import pg0.q0;
import u50.k0;

/* loaded from: classes3.dex */
public final class e0 extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f84497d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84498e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84499f;

    /* renamed from: g, reason: collision with root package name */
    public final List f84500g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84501h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f84502i;

    /* renamed from: j, reason: collision with root package name */
    public final m60.w f84503j;

    public e0(String userId, String str, String userAvatarImageUrl, List list, boolean z13) {
        f0 toastConfig = new f0();
        m60.w eventManager = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userAvatarImageUrl, "userAvatarImageUrl");
        Intrinsics.checkNotNullParameter(toastConfig, "toastConfig");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f84497d = userId;
        this.f84498e = str;
        this.f84499f = userAvatarImageUrl;
        this.f84500g = list;
        this.f84501h = z13;
        this.f84502i = toastConfig;
        this.f84503j = eventManager;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f0 f0Var = this.f84502i;
        k0 j23 = bs1.c.j2(new String[0], f0Var.f84510b);
        String str = this.f84498e;
        if (str == null) {
            str = "";
        }
        return new GestaltToast(context, new do1.d(j23, new do1.e(this.f84499f, str), null, null, 0, f0Var.f84509a, Integer.MAX_VALUE, null, false, 412));
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f84501h) {
            return;
        }
        u0 u0Var = u0.HOMEFEED_BUILDER_FOLLOW_TOAST;
        b3 b3Var = b3.USER_FOLLOW;
        String str = this.f84497d;
        u2.a1(u0Var, str, b3Var);
        r41.k.f106176a.d(str, r41.b.UserFollowEducationToast);
    }

    @Override // we0.a
    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84503j.d(new q0(this.f84497d));
    }
}
