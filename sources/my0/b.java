package my0;

import ag2.e;
import i32.y0;
import java.util.Iterator;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import rg0.d0;
import rg0.e0;

/* loaded from: classes5.dex */
public final class b extends k3 {

    /* renamed from: a, reason: collision with root package name */
    public String f88494a;

    /* renamed from: b, reason: collision with root package name */
    public String f88495b;

    /* renamed from: c, reason: collision with root package name */
    public String f88496c;

    /* renamed from: d, reason: collision with root package name */
    public String f88497d;

    /* renamed from: e, reason: collision with root package name */
    public y0 f88498e;

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
            if (((e0) next).c()) {
                obj = next;
                break;
            }
        }
        return (e0) obj;
    }

    @Override // kh2.k3
    public final void E1(e0 step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f88494a = step.f107993b;
        this.f88495b = step.f107994c;
        this.f88496c = step.f107996e;
        this.f88497d = step.f107997f;
    }

    @Override // kh2.k3
    public final y0 h0() {
        return this.f88498e;
    }
}
