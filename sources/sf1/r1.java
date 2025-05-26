package sf1;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f112694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f112695b;

    public r1(s1 s1Var, String str) {
        this.f112694a = s1Var;
        this.f112695b = str;
    }

    public final void a(double d2, long j13) {
        s1 s1Var = this.f112694a;
        s1Var.getClass();
        float f13 = (float) d2;
        w0 w0Var = s1Var.f112746x;
        w0Var.getClass();
        String pageId = this.f112695b;
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        j1 j1Var = w0Var.f112788a.G;
        if (j1Var != null) {
            rf1.p0 p0Var = (rf1.p0) j1Var;
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            Iterator it = p0Var.f107834d0.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (Intrinsics.d(((dl1.s) it.next()).getUid(), pageId)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0 || i13 != p0Var.f107842h0) {
                return;
            }
            k1 x33 = p0Var.x3();
            if (x33 != null) {
                ((e1) x33).I0(i13, f13);
            }
            if (p0Var.f107860q0 < 0) {
                p0Var.f107858p0 = j13;
            }
            p0Var.f107860q0 = j13;
        }
    }
}
