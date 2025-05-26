package w82;

import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.m1;
import c92.s;
import com.pinterest.navigation.Navigation;
import com.pinterest.targethandshake.ui.webview.TargetHandshakeWebView;
import d92.o;
import d92.o0;
import d92.q;
import d92.z;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import r02.c0;
import u50.r;
import xk2.k;
import xk2.n;
import xk2.v;
import z70.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw82/i;", "Lnl1/d;", "Le92/a;", "<init>", "()V", "targetHandshake_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i extends a implements e92.a {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f128474l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public z82.b f128475c0;

    /* renamed from: d0, reason: collision with root package name */
    public m f128476d0;

    /* renamed from: e0, reason: collision with root package name */
    public pb0.a f128477e0;

    /* renamed from: f0, reason: collision with root package name */
    public m60.e f128478f0;

    /* renamed from: g0, reason: collision with root package name */
    public final m1 f128479g0;

    /* renamed from: h0, reason: collision with root package name */
    public TargetHandshakeWebView f128480h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f128481i0;

    /* renamed from: j0, reason: collision with root package name */
    public final v f128482j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f128483k0;

    public i() {
        k a13 = xk2.m.a(n.NONE, new ax1.a(15, new c0(this, 6)));
        int i13 = 4;
        this.f128479g0 = a1.s(this, k0.f80436a.b(o0.class), new s52.m(a13, 3), new t02.h(a13, i13), new t02.i(this, a13, i13));
        this.f128482j0 = xk2.m.b(new c(this, 0));
        this.f128483k0 = d4.BROWSER;
    }

    public final c92.f Y7() {
        return (c92.f) this.f128482j0.getValue();
    }

    public final z82.b Z7() {
        z82.b bVar = this.f128475c0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("handshakeManager");
        throw null;
    }

    public final o0 a8() {
        return (o0) this.f128479g0.getValue();
    }

    public final void b8(Function0 function0) {
        function0.invoke();
        a8().f54181d.e().a(new d92.j(s.f27028a));
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        ((l82.c) a8().c()).a(o.f54179a);
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF35233h() {
        return this.f128483k0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = v82.b.target_fragment_handshake_webview;
        Navigation navigation = this.I;
        Unit unit = null;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_ID") : null;
        a8().h();
        if (v03 != null) {
            r c13 = a8().c();
            pb0.a aVar = this.f128477e0;
            if (aVar == null) {
                Intrinsics.r("clock");
                throw null;
            }
            ((l82.c) c13).a(new d92.k(v03, ((pb0.g) aVar).a()));
            unit = Unit.f80348a;
        }
        if (unit == null) {
            ((l82.c) a8().c()).a(new d92.s("", "Pin ID is null"));
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        TargetHandshakeWebView targetHandshakeWebView = this.f128480h0;
        if (targetHandshakeWebView == null) {
            Intrinsics.r("webview");
            throw null;
        }
        targetHandshakeWebView.a();
        r c13 = a8().c();
        pb0.a aVar = this.f128477e0;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        ((l82.c) c13).a(new q(((pb0.g) aVar).a()));
        ((z82.j) Z7()).f141127a.a();
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        requireActivity().getWindow().clearFlags(8192);
        ((z82.j) Z7()).f141138l = null;
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().setFlags(8192, 8192);
        z82.b Z7 = Z7();
        r eventIntake = a8().c();
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ((z82.j) Z7).f141138l = eventIntake;
        z82.j jVar = (z82.j) Z7();
        ArrayList arrayList = jVar.f141139m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            r rVar = jVar.f141138l;
            if (rVar != null) {
                rVar.a(zVar);
            }
        }
        arrayList.clear();
        if (this.f128481i0) {
            z82.b Z72 = Z7();
            TargetHandshakeWebView targetHandshakeWebView = this.f128480h0;
            if (targetHandshakeWebView != null) {
                ((z82.j) Z72).d(targetHandshakeWebView, false);
            } else {
                Intrinsics.r("webview");
                throw null;
            }
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(v82.a.target_handshake_webview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f128480h0 = (TargetHandshakeWebView) findViewById;
        View findViewById2 = v13.findViewById(v82.a.target_handshake_bottom_sheet_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ((CoordinatorLayout) findViewById2).addView(Y7());
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new g(this, null), 3);
    }
}
