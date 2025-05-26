package sc1;

import android.os.Bundle;
import android.view.View;
import ca1.h;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.q;
import uk1.d;
import uk1.e;
import xk2.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsc1/b;", "Lyk1/k;", "Lqc1/a;", "<init>", "()V", "privacyData_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends a implements qc1.a {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f112293p0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public k f112294j0;

    /* renamed from: k0, reason: collision with root package name */
    public e f112295k0;

    /* renamed from: l0, reason: collision with root package name */
    public cr1.a f112296l0;

    /* renamed from: m0, reason: collision with root package name */
    public rc1.a f112297m0;

    /* renamed from: n0, reason: collision with root package name */
    public final d4 f112298n0;

    /* renamed from: o0, reason: collision with root package name */
    public final a4 f112299o0;

    public b() {
        m.b(new h81.b(this, 18));
        this.f112298n0 = d4.SETTINGS;
        this.f112299o0 = a4.PRIVACY_AND_DATA_SETTINGS;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        e eVar = this.f112295k0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        d g13 = ((uk1.a) eVar).g();
        q p73 = p7();
        cr1.a aVar = this.f112296l0;
        if (aVar != null) {
            return new rc1.a(g13, p73, aVar, getActiveUserManager());
        }
        Intrinsics.r("accountService");
        throw null;
    }

    public final void b8(boolean z13) {
        int i13;
        if (z13) {
            d0.B(s7(), f1.DATA_REQUEST_SUCCESS, null, null, null, 30);
            i13 = i52.c.settings_privacy_data_request_data_confirmation_request;
        } else {
            d0.B(s7(), f1.DATA_REQUEST_FAILURE, null, null, null, 30);
            i13 = i52.c.settings_privacy_data_request_data_generic_error;
        }
        k kVar = this.f112294j0;
        if (kVar != null) {
            kVar.k(i13);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getU0() {
        return this.f112299o0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getS0() {
        return this.f112298n0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = i52.b.request_data_layout;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f112297m0 = null;
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) v13.findViewById(i52.a.header_request_data);
        settingsRoundHeaderView.k0(i52.c.settings_privacy_data_request_data);
        settingsRoundHeaderView.f51780e = new lc1.b(this, 3);
        d0.B(s7(), f1.VIEW, g0.REQUEST_DATA_UI, null, null, 28);
        ((GestaltButton) v13.findViewById(i52.a.start_request_button)).e(new h(this, 12));
        super.onViewCreated(v13, bundle);
    }
}
