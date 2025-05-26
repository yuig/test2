package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xo0 extends vg {
    public xo0() {
        super(Boolean.FALSE);
    }

    @Override // com.pinterest.api.model.vg
    public final Object c(km0 value5) {
        boolean z13;
        Intrinsics.checkNotNullParameter(value5, "value5");
        zk0 f13 = value5.f();
        if (f13 == null) {
            return Boolean.FALSE;
        }
        Double k13 = f13.k();
        Intrinsics.checkNotNullExpressionValue(k13, "getXCoord(...)");
        if (ml2.c.b(k13.doubleValue()) == 0) {
            Double l13 = f13.l();
            Intrinsics.checkNotNullExpressionValue(l13, "getYCoord(...)");
            if (ml2.c.b(l13.doubleValue()) == 0) {
                Double j13 = f13.j();
                Intrinsics.checkNotNullExpressionValue(j13, "getWidth(...)");
                if (ml2.c.b(j13.doubleValue()) == 100) {
                    Double h10 = f13.h();
                    Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
                    if (ml2.c.b(h10.doubleValue()) == 100) {
                        z13 = true;
                        return Boolean.valueOf(z13);
                    }
                }
            }
        }
        z13 = false;
        return Boolean.valueOf(z13);
    }
}
