package t91;

import android.os.Build;
import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import df.j1;
import java.util.Iterator;
import jc0.s;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.m3;
import lh0.z3;
import m60.t;
import m60.x0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import s91.j;
import sp2.k;
import yk1.v;

/* loaded from: classes5.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f116830a;

    public b(e eVar) {
        this.f116830a = eVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s event) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f116830a;
        Iterator it = CollectionsKt.F0(eVar.f116843j.f135191h).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dl1.s) obj) instanceof s91.e) {
                    break;
                }
            }
        }
        dl1.s sVar = (dl1.s) obj;
        if (sVar != null) {
            s91.e eVar2 = (s91.e) sVar;
            int i03 = j1.i0(eVar.f116840g);
            String string = ((yk1.a) ((v) eVar.f116842i.f83754b)).f139224a.getString(i03 != 1 ? i03 != 2 ? Build.VERSION.SDK_INT <= 28 ? c52.e.settings_dark_mode_battery_saver : c52.e.settings_dark_mode_follow_system : x0.settings_dark_mode_dark : x0.settings_dark_mode_light);
            Intrinsics.checkNotNullParameter(string, "<set-?>");
            eVar2.f112058f = string;
        }
        Object adapter = eVar.getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull p91.k event) {
        Object obj;
        ScreenLocation screenLocation;
        Intrinsics.checkNotNullParameter(event, "event");
        bd1.b bVar = event.f99295a;
        e eVar = this.f116830a;
        eVar.getClass();
        int i13 = a.f116829a[bVar.ordinal()];
        Object obj2 = null;
        String str = event.f99296b;
        s91.c cVar = eVar.f116843j;
        if (i13 == 1) {
            wy0 wy0Var = eVar.f116841h;
            if (wy0Var != null) {
                vy0 H4 = wy0Var.H4();
                H4.E(str);
                wy0 a13 = H4.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                eVar.f116841h = a13;
                Iterator it = CollectionsKt.F0(cVar.f135191h).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((dl1.s) next) instanceof j) {
                        obj2 = next;
                        break;
                    }
                }
                dl1.s sVar = (dl1.s) obj2;
                if (sVar != null) {
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    ((j) sVar).f112080f = str;
                }
            } else {
                Intrinsics.r("user");
                throw null;
            }
        } else if (i13 == 2) {
            wy0 wy0Var2 = eVar.f116841h;
            if (wy0Var2 != null) {
                vy0 H42 = wy0Var2.H4();
                H42.v0(Boolean.valueOf(Boolean.parseBoolean(str)));
                wy0 a14 = H42.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                eVar.f116841h = a14;
                Iterator it2 = CollectionsKt.F0(cVar.f135191h).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((dl1.s) obj) instanceof s91.k) {
                            break;
                        }
                    }
                }
                dl1.s sVar2 = (dl1.s) obj;
                if (sVar2 != null) {
                    s91.k kVar = (s91.k) sVar2;
                    wy0 wy0Var3 = eVar.f116841h;
                    if (wy0Var3 != null) {
                        Boolean E3 = wy0Var3.E3();
                        Intrinsics.checkNotNullExpressionValue(E3, "getIsParentalControlPasscodeEnabled(...)");
                        if (E3.booleanValue()) {
                            m3 m3Var = eVar.f116839f;
                            m3Var.getClass();
                            z3 z3Var = a4.f83297a;
                            g1 g1Var = (g1) m3Var.f83424a;
                            if (!g1Var.o("android_passcode_summary_sba", "enabled", z3Var) && !g1Var.l("android_passcode_summary_sba")) {
                                screenLocation = (ScreenLocation) com.pinterest.screens.z3.f51683i.getValue();
                            } else {
                                screenLocation = (ScreenLocation) com.pinterest.screens.z3.f51684j.getValue();
                            }
                        } else {
                            screenLocation = (ScreenLocation) com.pinterest.screens.z3.f51681g.getValue();
                        }
                        Intrinsics.checkNotNullParameter(screenLocation, "<set-?>");
                        kVar.f112088h = screenLocation;
                    } else {
                        Intrinsics.r("user");
                        throw null;
                    }
                }
            } else {
                Intrinsics.r("user");
                throw null;
            }
        } else if (i13 == 3) {
            wy0 wy0Var4 = eVar.f116841h;
            if (wy0Var4 == null) {
                Intrinsics.r("user");
                throw null;
            }
            vy0 H43 = wy0Var4.H4();
            H43.I0 = Boolean.valueOf(Boolean.parseBoolean(str));
            boolean[] zArr = H43.V1;
            if (zArr.length > 86) {
                zArr[86] = true;
            }
            wy0 a15 = H43.a();
            Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
            eVar.f116841h = a15;
        }
        Object adapter = eVar.getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }
}
