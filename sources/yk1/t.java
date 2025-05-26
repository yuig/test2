package yk1;

import h32.g0;

/* loaded from: classes2.dex */
public abstract class t extends p {
    @Override // yk1.p
    public void unbindPinalytics() {
        if (getPresenterPinalytics() != null) {
            getPresenterPinalytics().k();
        }
    }

    @Override // yk1.p
    public void bindPinalytics(u uVar) {
        uk1.d presenterPinalytics = getPresenterPinalytics();
        if (presenterPinalytics != null) {
            g0 f13 = presenterPinalytics.f();
            if (f13 == null) {
                f13 = uVar.getF53240t0();
            }
            presenterPinalytics.d(uVar.getW0(), uVar.getX0(), getUniqueViewKey(), f13, null);
        }
    }
}
