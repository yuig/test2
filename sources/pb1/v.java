package pb1;

import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.Map;
import kh2.g0;
import kh2.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l82.i0;
import u50.h0;
import u50.k0;

/* loaded from: classes5.dex */
public final class v extends l82.d {
    @Override // l82.d
    public final l82.c0 c(i0 i0Var) {
        x vmState = (x) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return new l82.c0(new a(false, yn1.f.DEFAULT, false, false), vmState, q0.f80391a);
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        u50.i0 k0Var;
        f1 f1Var;
        v.f1 f1Var2;
        qz.d M;
        f1 f1Var3;
        u50.i0 i0Var2;
        i event = (i) sVar;
        a priorDisplayState = (a) oVar;
        x priorVMState = (x) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof f) {
            h32.i0 i0Var3 = priorVMState.f99491d.f143086a;
            String str = ((f) event).f99454a;
            g0.l0(resultBuilder, i0Var3, f1.TAP, u0.CONTINUE_BUTTON, null, 24);
            if (str.length() != 0) {
                resultBuilder.f(u.f99483l);
                resultBuilder.d(new n(priorVMState.f99488a, str));
            }
        } else if (event instanceof e) {
            e eVar = (e) event;
            com.pinterest.feature.settings.passcode.d dVar = eVar.f99452a;
            int[] iArr = t.f99480a;
            if (iArr[dVar.ordinal()] == 1) {
                g0.k0(resultBuilder, priorVMState.f99491d.f143086a, f1.USER_PASSWORD_RESET_COMPLETED, null, null, bs1.c.o(new Pair("method", "password")));
                resultBuilder.f(u.f99482k);
            } else {
                h32.i0 i0Var4 = priorVMState.f99491d.f143086a;
                com.pinterest.feature.settings.passcode.d dVar2 = priorVMState.f99488a;
                int i13 = iArr[dVar2.ordinal()];
                if (i13 == 1) {
                    f1Var3 = f1.USER_PASSWORD_RESET_COMPLETED;
                } else if (i13 == 2) {
                    f1Var3 = f1.SAVE_SETTING_WITH_PASSCODE_SUCCESS;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f1Var3 = f1.DISABLE_PASSCODE_SUCCESS;
                }
                g0.l0(resultBuilder, i0Var4, f1Var3, null, null, 24);
                s[] sVarArr = new s[1];
                if (iArr[dVar2.ordinal()] == 3) {
                    int i14 = c52.e.settings_account_management_parental_passcode_disabled;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    i0Var2 = new k0(i14, new ArrayList(0));
                } else {
                    i0Var2 = h0.f120562a;
                }
                sVarArr[0] = new p(dVar2, eVar.f99453b, i0Var2);
                resultBuilder.d(sVarArr);
                resultBuilder.f(u.f99485n);
            }
        } else if (event instanceof h) {
            h32.i0 i0Var5 = priorVMState.f99491d.f143086a;
            Throwable th3 = ((h) event).f99461a;
            NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
            String e13 = (networkResponseError == null || (f1Var2 = networkResponseError.f45043a) == null || (M = k3.M(f1Var2)) == null) ? null : M.e();
            if (e13 == null || e13.length() == 0) {
                int i15 = i92.e.generic_error;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                k0Var = new k0(i15, new ArrayList(0));
            } else {
                k0Var = ep.b.x(e13, "string", e13);
            }
            int[] iArr2 = t.f99480a;
            com.pinterest.feature.settings.passcode.d dVar3 = priorVMState.f99488a;
            int i16 = iArr2[dVar3.ordinal()];
            if (i16 == 1) {
                f1Var = f1.UNAUTH_ACCOUNT_RECOVERY_FAILURE;
            } else if (i16 == 2) {
                f1Var = f1.SAVE_SETTING_WITH_PASSCODE_ERROR;
            } else {
                if (i16 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f1Var = f1.DISABLE_PASSCODE_FAILURE;
            }
            g0.k0(resultBuilder, i0Var5, f1Var, null, null, iArr2[dVar3.ordinal()] == 1 ? bs1.c.o(new Pair("fail_reason", k0Var.toString())) : null);
            resultBuilder.a(new r(new k92.n(new k92.c(k0Var, null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
            resultBuilder.f(u.f99484m);
        } else if (event instanceof g) {
            h32.i0 i0Var6 = priorVMState.f99491d.f143086a;
            Map map = ((g) event).f99460a;
            g0.l0(resultBuilder, i0Var6, f1.TAP, u0.CONTINUE_BUTTON, null, 24);
            resultBuilder.f(u.f99481j);
            resultBuilder.d(new o(map));
        } else if (event instanceof d) {
            String str2 = ((d) event).f99447a;
            String obj = str2 != null ? StringsKt.i0(str2).toString() : null;
            if (obj != null && obj.length() == 4) {
                for (int i17 = 0; i17 < obj.length() && Character.isDigit(obj.charAt(i17)); i17++) {
                }
            }
            resultBuilder.f(new u81.h(str2.length() == 4, 22));
        } else if (Intrinsics.d(event, b.f99441a)) {
            g0.l0(resultBuilder, priorVMState.f99491d.f143086a, f1.TAP, u0.DISMISS_BUTTON, null, 24);
        } else {
            if (!Intrinsics.d(event, c.f99444a)) {
                throw new NoWhenBranchMatchedException();
            }
            g0.l0(resultBuilder, priorVMState.f99491d.f143086a, f1.TAP, u0.EXTERNAL_LINK, h32.g0.PARENTAL_PASSCODE_SETTINGS_VIEW, 16);
        }
        return resultBuilder.e();
    }
}
