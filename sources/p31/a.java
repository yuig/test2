package p31;

import b60.b;
import com.bumptech.glide.d;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import k22.m;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import uj2.q;
import x02.x2;
import xk1.c;
import y01.p1;

/* loaded from: classes5.dex */
public final class a extends c implements j {

    /* renamed from: k, reason: collision with root package name */
    public final String f98761k;

    /* renamed from: l, reason: collision with root package name */
    public final x2 f98762l;

    /* renamed from: m, reason: collision with root package name */
    public final m f98763m;

    /* renamed from: n, reason: collision with root package name */
    public final b f98764n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String userId, x2 userRepository, m userService, b activeUserManager) {
        super(null);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f98761k = userId;
        this.f98762l = userRepository;
        this.f98763m = userService;
        this.f98764n = activeUserManager;
        o(RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW, new t31.a());
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        if (getItem(i13) instanceof s31.a) {
            return RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW;
        }
        return -2;
    }

    @Override // xk1.c
    public final q k() {
        wy0 Q = d.Q(this.f98764n);
        String str = this.f98761k;
        if (dl2.b.S1(Q, str)) {
            Boolean G3 = Q.G3();
            Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
            if (G3.booleanValue()) {
                return new kk2.m(this.f98762l.e0().Q(str).s(), new wv0.a(28, new p1(this, 18)), 0).u();
            }
        }
        return q.y(q0.f80391a);
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
