package ads_mobile_sdk;

import android.os.Bundle;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class d00 extends s.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00 f4081a;

    public d00(e00 e00Var) {
        this.f4081a = e00Var;
    }

    @Override // s.b
    public final void onNavigationEvent(int i13, Bundle bundle) {
        sb2 sb2Var = this.f4081a.f4534c;
        il0 il0Var = il0.CUI_NAME_CUSTOM_TABS_NAVIGATION_EVENT;
        ss2 ss2Var = new ss2(new o52(), new v01(), new k72(), new g5());
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        if (qs2.b().f9801a == null) {
            p12 a13 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
            try {
                qs2.a().f().f7002x = Integer.valueOf(i13);
                Object obj = Unit.f80348a;
                if (obj instanceof jk0) {
                    ft2.a((jk0) obj);
                }
                dl2.b.J(a13, null);
                return;
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (th3 instanceof a.jf) {
                        throw th3;
                    }
                    a13.a(th3);
                    if (th3 instanceof TimeoutCancellationException) {
                        throw new xl0(th3);
                    }
                    if (th3 instanceof CancellationException) {
                        throw new yj0(th3);
                    }
                    if (!(th3 instanceof uk0)) {
                        throw new dk0(th3);
                    }
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        dl2.b.J(a13, th4);
                        throw th5;
                    }
                }
            }
        }
        cs2 a14 = qs2.a(il0Var, q0Var, true);
        try {
            qs2.a().f().f7002x = Integer.valueOf(i13);
            Object obj2 = Unit.f80348a;
            if (obj2 instanceof jk0) {
                ft2.a((jk0) obj2);
            }
            dl2.b.J(a14, null);
        } catch (Throwable th6) {
            try {
                a14.b(th6);
                if (th6 instanceof a.jf) {
                    throw th6;
                }
                a14.a(th6);
                if (th6 instanceof TimeoutCancellationException) {
                    throw new xl0(th6);
                }
                if (th6 instanceof CancellationException) {
                    throw new yj0(th6);
                }
                if (!(th6 instanceof uk0)) {
                    throw new dk0(th6);
                }
                throw th6;
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    dl2.b.J(a14, th7);
                    throw th8;
                }
            }
        }
    }
}
