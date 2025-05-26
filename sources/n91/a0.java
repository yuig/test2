package n91;

import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.screens.z3;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kh2.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.i0;
import u50.k0;
import v.f1;

/* loaded from: classes5.dex */
public final class a0 extends l82.d {
    public static i0 g(Throwable th3) {
        f1 f1Var;
        qz.d M;
        String str = null;
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null) {
            str = M.e();
        }
        if (str != null && str.length() != 0) {
            return ep.b.x(str, "string", str);
        }
        int i13 = x0.generic_error;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new k0(i13, new ArrayList(0));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        b0 vmState = (b0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return new l82.c0(new a(vmState.f90032b, false, true, null, false), vmState, e0.b(new w(new zy.e0(new zy.a(vmState.f90033c, h32.f1.VIEW, null, pp2.a.r(vmState), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)))));
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        l82.c0 c0Var;
        f1 f1Var;
        qz.d M;
        f1 f1Var2;
        k event = (k) sVar;
        a priorDisplayState = (a) oVar;
        b0 priorVMState = (b0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof h) {
            h hVar = (h) event;
            String submittedVerificationCode = hVar.f90044a;
            Map priorRequestCache = priorVMState.f90031a;
            Intrinsics.checkNotNullParameter(priorRequestCache, "priorRequestCache");
            String newEmailAddress = priorVMState.f90032b;
            Intrinsics.checkNotNullParameter(newEmailAddress, "newEmailAddress");
            h32.i0 pinalyticsContext = priorVMState.f90033c;
            Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
            Intrinsics.checkNotNullParameter(submittedVerificationCode, "submittedVerificationCode");
            return new l82.c0(a.e(priorDisplayState, hVar.f90044a.length() == 6, false, null, false, 21), new b0(priorRequestCache, newEmailAddress, pinalyticsContext, submittedVerificationCode), q0.f80391a);
        }
        if (Intrinsics.d(event, f.f90042a)) {
            return new l82.c0(a.e(priorDisplayState, false, false, null, true, 13), priorVMState, f0.j(new u(priorVMState.f90034d, priorVMState.f90031a), new w(new zy.e0(new zy.a(h32.i0.a(priorVMState.f90033c, null, null, null, u0.ENTER_BUTTON, 95), h32.f1.TAP, null, pp2.a.r(priorVMState), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)))));
        }
        if (event instanceof c) {
            return new l82.c0(a.e(priorDisplayState, false, false, null, true, 11), priorVMState, f0.j(new t(priorVMState.f90031a), new w(new zy.e0(new zy.a(h32.i0.a(priorVMState.f90033c, null, null, null, u0.SEND_NEW_CODE_LINK, 95), h32.f1.TAP, null, pp2.a.r(priorVMState), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)))));
        }
        if (event instanceof b) {
            return new l82.c0(priorDisplayState, priorVMState, f0.j(new v(al1.b.f15477a), new w(new zy.e0(new zy.a(h32.i0.a(priorVMState.f90033c, null, null, null, u0.CLOSE_BUTTON, 95), h32.f1.TAP, null, pp2.a.r(priorVMState), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)))));
        }
        if (Intrinsics.d(event, i.f90045a)) {
            a e13 = a.e(priorDisplayState, false, false, null, false, 15);
            s sVar2 = new s(priorVMState.f90032b);
            int i13 = b52.c.edit_email_success;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            return new l82.c0(e13, priorVMState, f0.j(sVar2, new x(new k92.n(new k92.c(new k0(i13, new ArrayList(0)), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)), new v(new al1.c(z3.c())), new w(new zy.e0(new zy.a(priorVMState.f90033c, h32.f1.EMAIL_OTP_VERIFICATION_SUCCESS, null, pp2.a.r(priorVMState), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)))));
        }
        if (event instanceof g) {
            g gVar = (g) event;
            a e14 = a.e(priorDisplayState, false, false, g(gVar.f90043a), false, 7);
            h32.f1 f1Var3 = h32.f1.EMAIL_OTP_VERIFICATION_FAILURE;
            h32.i0 i0Var2 = priorVMState.f90033c;
            HashMap r13 = pp2.a.r(priorVMState);
            Throwable th3 = gVar.f90043a;
            boolean z13 = th3 instanceof NetworkResponseError;
            NetworkResponseError networkResponseError = z13 ? (NetworkResponseError) th3 : null;
            int i14 = -1;
            r13.put("status_code", String.valueOf((networkResponseError == null || (f1Var2 = networkResponseError.f45043a) == null) ? -1 : f1Var2.f123449b));
            NetworkResponseError networkResponseError2 = z13 ? (NetworkResponseError) th3 : null;
            if (networkResponseError2 != null && (f1Var = networkResponseError2.f45043a) != null && (M = k3.M(f1Var)) != null) {
                i14 = M.f105387g;
            }
            r13.put("api_error_code", String.valueOf(i14));
            c0Var = new l82.c0(e14, priorVMState, e0.b(new w(new zy.e0(new zy.a(i0Var2, f1Var3, null, r13, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION)))));
        } else if (event instanceof e) {
            a e15 = a.e(priorDisplayState, false, true, null, false, 11);
            int i15 = b52.c.email_change_verification_code_resent;
            String[] formatArgs2 = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
            c0Var = new l82.c0(e15, priorVMState, e0.b(new x(new k92.n(new k92.c(new k0(i15, new ArrayList(0)), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null))));
        } else {
            if (!(event instanceof d)) {
                if (event instanceof j) {
                    return new l82.c0(priorDisplayState, priorVMState);
                }
                throw new NoWhenBranchMatchedException();
            }
            c0Var = new l82.c0(a.e(priorDisplayState, false, true, null, false, 11), priorVMState, e0.b(new x(new k92.n(new k92.c(g(((d) event).f90038a), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null))));
        }
        return c0Var;
    }
}
