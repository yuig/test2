package mm1;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.pinterest.gestalt.sheet.container.GestaltSheetContainer;
import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import com.pinterest.ui.blurView.BlurView;
import hn1.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ua.q0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f87611a;

    /* renamed from: b, reason: collision with root package name */
    public final d f87612b;

    /* renamed from: c, reason: collision with root package name */
    public jn1.i f87613c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltSheetHeader f87614d;

    /* renamed from: e, reason: collision with root package name */
    public View f87615e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltSheetContainer f87616f;

    /* renamed from: g, reason: collision with root package name */
    public ViewGroup f87617g;

    /* renamed from: h, reason: collision with root package name */
    public View f87618h;

    /* renamed from: i, reason: collision with root package name */
    public BlurView f87619i;

    /* renamed from: j, reason: collision with root package name */
    public int f87620j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f87621k;

    /* renamed from: l, reason: collision with root package name */
    public Function0 f87622l;

    /* renamed from: m, reason: collision with root package name */
    public Function2 f87623m;

    /* renamed from: n, reason: collision with root package name */
    public Function0 f87624n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnClickListener f87625o;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f87626p;

    public k(Fragment fragment, d config) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f87611a = fragment;
        this.f87612b = config;
    }

    public final void a(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f87626p = listener;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.f87625o = onClickListener;
    }

    public final void c(Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f87622l = listener;
    }

    public final void d(Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f87624n = listener;
    }

    public final void e(xb0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f87623m = listener;
    }

    public final jn1.i f() {
        jn1.i iVar = this.f87613c;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.r("bottomSheetController");
        throw null;
    }

    public final View g() {
        View view;
        if (this.f87612b.f87597j == hn1.o.OPAQUE && this.f87621k) {
            view = this.f87619i;
            if (view == null) {
                Intrinsics.r("blurScrim");
                throw null;
            }
        } else {
            view = this.f87618h;
            if (view == null) {
                Intrinsics.r("regularScrim");
                throw null;
            }
        }
        return view;
    }

    public final GestaltSheetContainer h() {
        GestaltSheetContainer gestaltSheetContainer = this.f87616f;
        if (gestaltSheetContainer != null) {
            return gestaltSheetContainer;
        }
        Intrinsics.r("sheetContainer");
        throw null;
    }

    public final GestaltSheetHeader i() {
        GestaltSheetHeader gestaltSheetHeader = this.f87614d;
        if (gestaltSheetHeader != null) {
            return gestaltSheetHeader;
        }
        Intrinsics.r("sheetHeader");
        throw null;
    }

    public final void j(jn1.c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        jn1.i.b(f(), action);
    }

    public final void k(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m(view);
        h().u(h.f87605k);
    }

    public final void l() {
        Fragment fragment = this.f87611a;
        q0 q0Var = new q0(fragment.requireContext());
        Intrinsics.checkNotNullExpressionValue(q0Var, "from(...)");
        fragment.setEnterTransition(q0Var.c(y.fade));
        fragment.setExitTransition(q0Var.c(y.slide_bottom));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r0 = r0.getCurrentWindowMetrics();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        r0 = r0.getWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(final android.view.View r14) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm1.k.m(android.view.View):void");
    }
}
