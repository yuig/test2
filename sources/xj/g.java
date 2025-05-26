package xj;

import kh2.c3;

/* loaded from: classes3.dex */
public final class g extends c3 {
    @Override // kh2.c3
    public final float N(Object obj) {
        return ((h) obj).f135105o.f135121b * 10000.0f;
    }

    @Override // kh2.c3
    public final void o0(float f13, Object obj) {
        h hVar = (h) obj;
        hVar.f135105o.f135121b = f13 / 10000.0f;
        hVar.invalidateSelf();
    }
}
