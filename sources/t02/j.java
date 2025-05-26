package t02;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.view.NoticeView;
import ea1.u0;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import r02.c0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt02/j;", "Lnl1/d;", "<init>", "()V", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends a {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f115728f0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f115729c0;

    /* renamed from: d0, reason: collision with root package name */
    public NoticeView f115730d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d4 f115731e0;

    public j() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(9, new c0(this, 2)));
        int i13 = 0;
        this.f115729c0 = a1.s(this, k0.f80436a.b(o.class), new u0(a13, 29), new h(a13, i13), new i(this, a13, i13));
        this.f115731e0 = d4.REPORT;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF97239v0() {
        return this.f115731e0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = h02.d.fragment_report_sensitivity_notice;
        Navigation navigation = this.I;
        Unit unit = null;
        Object i03 = navigation != null ? navigation.i0("EXTRA_REPORT_FLOW_SENSITIVITY_DATA") : null;
        m02.b bVar = i03 instanceof m02.b ? (m02.b) i03 : null;
        if (bVar != null) {
            ((o) this.f115729c0.getValue()).h(bVar);
            unit = Unit.f80348a;
        }
        if (unit == null) {
            D5();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(h02.c.close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        com.bumptech.glide.c.m((GestaltIconButton) findViewById, new ex1.n(this, 27));
        View findViewById2 = v13.findViewById(h02.c.report_advisory_notice);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f115730d0 = (NoticeView) findViewById2;
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new g(this, null), 3);
    }
}
