package my0;

import ag2.e;
import i32.y0;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import rg0.d0;
import rg0.e0;

/* loaded from: classes5.dex */
public final class a extends k3 {

    /* renamed from: a, reason: collision with root package name */
    public String f88490a;

    /* renamed from: b, reason: collision with root package name */
    public String f88491b;

    /* renamed from: c, reason: collision with root package name */
    public int f88492c;

    /* renamed from: d, reason: collision with root package name */
    public y0 f88493d;

    @Override // kh2.k3
    public final e0 D1(e displayData, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Object obj = null;
        if (!(displayData instanceof d0)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Iterator it = ((d0) displayData).e(activeUserManager).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            e0 e0Var = (e0) next;
            e0Var.getClass();
            List POSSIBLE_INTEREST_PICKERS = e0.f107990g;
            Intrinsics.checkNotNullExpressionValue(POSSIBLE_INTEREST_PICKERS, "POSSIBLE_INTEREST_PICKERS");
            if (e0Var.d(POSSIBLE_INTEREST_PICKERS)) {
                obj = next;
                break;
            }
        }
        return (e0) obj;
    }

    @Override // kh2.k3
    public final void E1(e0 step) {
        Intrinsics.checkNotNullParameter(step, "step");
        String str = step.f107993b;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f88490a = str;
        String str2 = step.f107994c;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        this.f88491b = str2;
        this.f88492c = step.f107995d;
    }

    @Override // kh2.k3
    public final y0 h0() {
        return this.f88493d;
    }
}
