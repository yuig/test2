package mb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ca1.h;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x91.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmb1/b;", "Lnl1/d;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f86866e0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f86867c0 = d4.PARENTAL_PASSCODE;

    /* renamed from: d0, reason: collision with root package name */
    public final a4 f86868d0 = a4.PARENTAL_PASSCODE_INSTRUCTIONS;

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getI0() {
        return this.f86868d0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f86867c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = f52.b.fragment_passcode_setup_instructions;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        settingsRoundHeaderView.k0(f52.c.settings_parental_passcode_setup_header_title);
        settingsRoundHeaderView.g0(new k(this, 14));
        ((GestaltButton) onCreateView.findViewById(f52.a.start_passcode_setup_button)).e(new h(this, 3));
        return onCreateView;
    }
}
