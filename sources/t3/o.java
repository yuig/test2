package t3;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116104i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f116105j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(c0 c0Var, int i13) {
        super(1);
        this.f116104i = i13;
        this.f116105j = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f116104i;
        c0 c0Var = this.f116105j;
        switch (i13) {
            case 0:
                int i14 = ((k3.a) obj).f78222a;
                if (i14 == 1) {
                    r1 = c0Var.isInTouchMode();
                } else if (i14 != 2) {
                    r1 = false;
                } else if (c0Var.isInTouchMode()) {
                    r1 = c0Var.requestFocusFromTouch();
                }
                return Boolean.valueOf(r1);
            case 1:
                KeyEvent keyEvent = ((l3.b) obj).f81494a;
                c0Var.getClass();
                long G = l3.c.G(keyEvent);
                z2.c cVar = l3.a.a(G, l3.a.f81486h) ? new z2.c(keyEvent.isShiftPressed() ? 2 : 1) : l3.a.a(G, l3.a.f81484f) ? new z2.c(4) : l3.a.a(G, l3.a.f81483e) ? new z2.c(3) : (l3.a.a(G, l3.a.f81481c) || l3.a.a(G, l3.a.f81489k)) ? new z2.c(5) : (l3.a.a(G, l3.a.f81482d) || l3.a.a(G, l3.a.f81490l)) ? new z2.c(6) : (l3.a.a(G, l3.a.f81485g) || l3.a.a(G, l3.a.f81487i) || l3.a.a(G, l3.a.f81491m)) ? new z2.c(7) : (l3.a.a(G, l3.a.f81480b) || l3.a.a(G, l3.a.f81488j)) ? new z2.c(8) : null;
                if (cVar == null || !pp2.a.p(l3.c.N(keyEvent), 2)) {
                    return Boolean.FALSE;
                }
                a3.d y13 = c0Var.y();
                x xVar = new x(cVar, 1);
                androidx.compose.ui.focus.b bVar = c0Var.f115877e;
                int i15 = cVar.f140608a;
                Boolean d2 = bVar.d(i15, y13, xVar);
                if (d2 == null || d2.booleanValue()) {
                    return Boolean.TRUE;
                }
                if (!androidx.compose.ui.focus.a.s(i15)) {
                    return Boolean.FALSE;
                }
                Integer u13 = nl.b.u(i15);
                if (u13 == null) {
                    throw new IllegalStateException("Invalid focus direction".toString());
                }
                int intValue = u13.intValue();
                Rect L0 = y13 != null ? kh2.n3.L0(y13) : null;
                if (L0 == null) {
                    throw new IllegalStateException("Invalid rect".toString());
                }
                View view = c0Var;
                while (true) {
                    if (view != null) {
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = c0Var.getRootView();
                        Intrinsics.g(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                        if (view != null) {
                            if (!Intrinsics.d(view, c0Var)) {
                                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                    if (parent == c0Var) {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        view = null;
                    }
                }
                if (!(!Intrinsics.d(view, c0Var))) {
                    view = null;
                }
                if ((view == null || !nl.b.h(view, Integer.valueOf(intValue), L0)) && bVar.b(i15, false, false)) {
                    Boolean d13 = bVar.d(i15, null, new x(cVar, 0));
                    return Boolean.valueOf(d13 != null ? d13.booleanValue() : true);
                }
                return Boolean.TRUE;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = c0Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = c0Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new a0(0, function0));
                    }
                }
                return Unit.f80348a;
        }
    }
}
