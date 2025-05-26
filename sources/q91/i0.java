package q91;

import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq91/i0;", "Lmm1/l;", "<init>", "()V", "personalInformation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i0 extends z {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f103134h0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public final d4 f103135g0 = d4.UNKNOWN_VIEW;

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(h52.b.fragment_policy_account_conversion_to_personal, false, 0, 99, false, false, new h81.b(this, 6), 756);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF103135g0() {
        return this.f103135g0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        a8(b.f103071r);
        View view = getView();
        if (view != null) {
            wy0 f13 = ((b60.d) getActiveUserManager()).f();
            if (f13 != null) {
                View findViewById = view.findViewById(h52.a.policy_conversion_user_avatar);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                kh2.m0.V0((GestaltAvatar) findViewById, f13);
            }
            ((GestaltButton) view.findViewById(h52.a.policy_conversion_button)).e(new l11.p(this, 26));
        }
    }
}
