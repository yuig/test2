package g41;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.wy0;
import h32.a4;
import h32.d4;
import jk.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import so.b2;
import w01.e0;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg41/e;", "Lc41/a;", "Lyq0/a0;", "Lyq0/b0;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class e extends i<a0> implements c41.a {
    public b2 A0;
    public final d4 B0 = d4.USER;
    public final a4 C0 = a4.USER_FOLLOWING;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f63505z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(44, new e0(this, 17));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        b2 b2Var = this.A0;
        if (b2Var == null) {
            Intrinsics.r("followedUsersPresenterFactory");
            throw null;
        }
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", "");
        uk1.e eVar = this.f63505z0;
        if (eVar != null) {
            return b2.a(b2Var, Z, ((uk1.a) eVar).g());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.C0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getQ0() {
        return this.B0;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin);
        H8(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Resources resources = view.getResources();
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        F8(resources.getString((f13 == null || !dl2.b.S1(f13, com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", ""))) ? nz1.f.empty_others_following_users_message : x0.empty_my_following_message));
        a8(new eb2.d(null, null, null, v.e0(getResources().getDimensionPixelSize(eo1.c.lego_spacing_between_elements)), 7));
    }
}
