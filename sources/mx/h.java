package mx;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.handshake.ui.webview.HandshakeWebView;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.l;
import mq.e0;
import mq.f0;
import mq.g0;
import pp1.r;
import qp1.c0;
import qp1.t;
import qp1.t0;
import tb0.p;
import xk2.k;
import xk2.n;
import xk2.v;
import z70.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmx/h;", "Lnl1/d;", "Lrp1/a;", "<init>", "()V", "amazonHandshake_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends j implements rp1.a {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f88457l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public np1.j f88458c0;

    /* renamed from: d0, reason: collision with root package name */
    public l f88459d0;

    /* renamed from: e0, reason: collision with root package name */
    public m f88460e0;

    /* renamed from: f0, reason: collision with root package name */
    public pb0.a f88461f0;

    /* renamed from: g0, reason: collision with root package name */
    public final m1 f88462g0;

    /* renamed from: h0, reason: collision with root package name */
    public HandshakeWebView f88463h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f88464i0;

    /* renamed from: j0, reason: collision with root package name */
    public final v f88465j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f88466k0;

    public h() {
        k q13 = jq.b.q(10, new q1(this, 10), n.NONE);
        int i13 = 9;
        this.f88462g0 = a1.s(this, k0.f80436a.b(t0.class), new e0(q13, i13), new f0(null, q13, i13), new g0(this, q13, i13));
        this.f88465j0 = xk2.m.b(new b(this, 0));
        this.f88466k0 = d4.BROWSER;
    }

    public final pp1.f Y7() {
        return (pp1.f) this.f88465j0.getValue();
    }

    public final np1.j Z7() {
        np1.j jVar = this.f88458c0;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("handshakeManager");
        throw null;
    }

    public final t0 a8() {
        return (t0) this.f88462g0.getValue();
    }

    public final void b8(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            startActivity(intent);
        } catch (Throwable th3) {
            b6().q(th3, "Handshake malformed Uri: " + th3, p.AMAZON_HANDSHAKE);
        }
    }

    public final void c8(Function0 function0) {
        function0.invoke();
        ((l82.c) a8().c()).a(new qp1.l(r.f100945a));
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        ((l82.c) a8().c()).a(qp1.r.f104825a);
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF35233h() {
        return this.f88466k0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = lx.b.fragment_handshake_webview;
        Navigation navigation = this.I;
        Unit unit = null;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_ID") : null;
        Navigation navigation2 = this.I;
        String v04 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_URL") : null;
        a8().h();
        if (v03 != null) {
            u50.r c13 = a8().c();
            pb0.a aVar = this.f88461f0;
            if (aVar == null) {
                Intrinsics.r("clock");
                throw null;
            }
            ((l82.c) c13).a(new qp1.m(((pb0.g) aVar).a(), v03, v04));
            unit = Unit.f80348a;
        }
        if (unit == null) {
            ((l82.c) a8().c()).a(new qp1.v("", "Pin ID is null"));
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        HandshakeWebView handshakeWebView = this.f88463h0;
        if (handshakeWebView == null) {
            Intrinsics.r("webview");
            throw null;
        }
        handshakeWebView.a();
        l lVar = this.f88459d0;
        if (lVar == null) {
            Intrinsics.r("experiment");
            throw null;
        }
        if (lVar.a()) {
            ((np1.i) Z7()).f91789a.a();
        }
        u50.r c13 = a8().c();
        pb0.a aVar = this.f88461f0;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        ((l82.c) c13).a(new t(((pb0.g) aVar).a()));
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        requireActivity().getWindow().clearFlags(8192);
        ((np1.i) Z7()).f91800l = null;
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().setFlags(8192, 8192);
        np1.j Z7 = Z7();
        u50.r eventIntake = a8().c();
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ((np1.i) Z7).f91800l = eventIntake;
        np1.i iVar = (np1.i) Z7();
        ArrayList arrayList = iVar.f91801m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            u50.r rVar = iVar.f91800l;
            if (rVar != null) {
                rVar.a(c0Var);
            }
        }
        arrayList.clear();
        if (this.f88464i0) {
            np1.j Z72 = Z7();
            HandshakeWebView handshakeWebView = this.f88463h0;
            if (handshakeWebView != null) {
                ((np1.i) Z72).e(handshakeWebView);
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
        View findViewById = v13.findViewById(lx.a.handshakeWebView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f88463h0 = (HandshakeWebView) findViewById;
        View findViewById2 = v13.findViewById(lx.a.handshake_bottom_sheet_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ((CoordinatorLayout) findViewById2).addView(Y7());
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new f(this, null), 3);
    }
}
