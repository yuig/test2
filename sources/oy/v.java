package oy;

import ey.k3;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends ey.v1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Set f98216g = kotlin.collections.h1.f(t.class, s.class, z.class, y.class, x.class, w.class);

    /* renamed from: f, reason: collision with root package name */
    public final Set f98217f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f98217f = f98216g;
    }

    @Override // ey.v1
    public final Set b() {
        return this.f98217f;
    }

    @Override // ey.v1
    public final boolean o(ey.u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof t) {
            q(e13.c());
            return true;
        }
        if (e13 instanceof s) {
            s sVar = (s) e13;
            s92.l lVar = s92.l.USER_NAVIGATION;
            long c13 = e13.c();
            a(sVar.f98183g, lVar, sVar.f98181e, sVar.f98182f, c13, false);
            r(e13.c());
            h(sVar.f98184h, "num.thumbnails.visible");
            h(sVar.f98185i, "num.thumbnails.loaded");
            return true;
        }
        if (e13 instanceof z) {
            q(e13.c());
            l("is.video", ((z) e13).f98249g);
            return true;
        }
        if (e13 instanceof y) {
            r(e13.c());
            return true;
        }
        if (e13 instanceof x) {
            q(e13.c());
            return true;
        }
        if (!(e13 instanceof w)) {
            return false;
        }
        r(e13.c());
        h(((w) e13).f98225f, "num.media.items");
        return true;
    }
}
