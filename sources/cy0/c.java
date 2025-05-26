package cy0;

import ac2.m;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import so.o0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcy0/c;", "Lq91/m;", "<init>", "()V", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends a {
    public final d4 G0 = d4.ORIENTATION;
    public final a4 H0 = a4.ORIENTATION_COUNTRY_PICKER_STEP;

    @Override // nl1.d, ec2.o
    public final m P0() {
        return B7();
    }

    @Override // q91.m, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        ((GestaltToolbarImpl) toolbar).b0(getResources().getString(c52.e.country));
    }

    @Override // q91.m, yk1.k
    public final yk1.m V7() {
        o0 o0Var = this.f103143z0;
        if (o0Var != null) {
            return o0Var.a(false);
        }
        Intrinsics.r("countrySettingsPresenterFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.H0;
    }

    @Override // q91.m, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.G0;
    }

    @Override // q91.m, yq0.t
    public final a7.e m8() {
        return new a7.e(v0.fragment_settings_menu, t0.p_recycler_view);
    }
}
