package oy;

import ey.k3;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends ey.v1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Set f98032g = kotlin.collections.h1.f(c0.class, b0.class, c1.class, b1.class, q.class, p.class);

    /* renamed from: f, reason: collision with root package name */
    public final Set f98033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f98033f = f98032g;
    }

    @Override // ey.v1
    public final Set b() {
        return this.f98033f;
    }

    @Override // ey.v1
    public final boolean o(ey.u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof c0) {
            q(e13.c());
            c0 c0Var = (c0) e13;
            h(c0Var.f98019e, "num.images.selected");
            h(c0Var.f98020f, "num.videos.selected");
            l("video.conversions.complete.at.start", c0Var.f98021g);
            return true;
        }
        if (e13 instanceof b0) {
            b0 b0Var = (b0) e13;
            s92.l lVar = s92.l.USER_NAVIGATION;
            long c13 = e13.c();
            a(b0Var.f98007g, lVar, b0Var.f98005e, b0Var.f98006f, c13, false);
            r(e13.c());
            String str = b0Var.f98008h;
            if (str == null) {
                return true;
            }
            j("error", str);
            return true;
        }
        if (e13 instanceof c1) {
            q(e13.c());
            l("is.retry", ((c1) e13).f98022g);
            return true;
        }
        if (e13 instanceof b1) {
            r(e13.c());
            b1 b1Var = (b1) e13;
            j("pwt.result", b1Var.f98009g.toString());
            String str2 = b1Var.f98010h;
            if (str2 == null) {
                return true;
            }
            j("error", str2);
            return true;
        }
        if (e13 instanceof q) {
            q(e13.c());
            return true;
        }
        if (!(e13 instanceof p)) {
            return false;
        }
        r(e13.c());
        p pVar = (p) e13;
        j("pwt.result", pVar.f98164f.toString());
        String str3 = pVar.f98165g;
        if (str3 == null) {
            return true;
        }
        j("error", str3);
        return true;
    }
}
