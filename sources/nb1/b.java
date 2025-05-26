package nb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ca1.h;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.f4;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x91.k;
import y01.l1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnb1/b;", "Lnl1/d;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f90340e0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f90341c0 = d4.PARENTAL_PASSCODE;

    /* renamed from: d0, reason: collision with root package name */
    public final a4 f90342d0 = a4.PARENTAL_PASSCODE_CONFIRMATION;

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        z(new l1(1, Navigation.w1(f4.b())));
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF57498l1() {
        return this.f90342d0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF88466k0() {
        return this.f90341c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = f52.b.fragment_passcode_setup_success;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        settingsRoundHeaderView.k0(f52.c.settings_parental_passcode_create_success_title);
        settingsRoundHeaderView.g0(new k(this, 15));
        ((GestaltButton) onCreateView.findViewById(f52.a.got_it_button)).e(new h(this, 4));
        return onCreateView;
    }
}
