package i91;

import android.net.Uri;
import android.os.Bundle;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.n4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m60.x0;

/* loaded from: classes5.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f71822b;

    public /* synthetic */ f0(i0 i0Var, int i13) {
        this.f71821a = i13;
        this.f71822b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f71821a;
        i0 i0Var = this.f71822b;
        switch (i13) {
            case 0:
                i0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putParcelable("ARG_SENDABLE_OBJECT", i0Var.f71841b);
                bundle.putString("ARG_URI_STRING", ((Uri) obj).toString());
                bundle.putString("ARG_SHARE_APP", "instagram_stories");
                bundle.putSerializable("ARG_INVITE_CATEGORY", i0Var.f71845f);
                bundle.putBoolean("ARG_IS_STATIC_PREVIEW", true);
                bundle.putInt("ARG_TITLE_STRING_RES", b62.d.share_this_collage);
                m60.u.f85943a.d(Navigation.v1((ScreenLocation) n4.f51147d.getValue(), bundle));
                return Boolean.TRUE;
            default:
                i0Var.f71855p.h(x0.generic_error);
                return Unit.f80348a;
        }
    }
}
