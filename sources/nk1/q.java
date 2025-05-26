package nk1;

import com.pinterest.api.model.tz0;
import com.pinterest.api.model.wy0;
import z40.x;

/* loaded from: classes5.dex */
public final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f91165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91166b;

    public q(wy0 wy0Var) {
        tz0 B4 = wy0Var.B4();
        this.f91165a = B4 != null ? B4.e() : null;
        tz0 B42 = wy0Var.B4();
        this.f91166b = B42 != null ? B42.d() : null;
    }

    @Override // z40.x
    public final Boolean a() {
        return this.f91165a;
    }

    @Override // z40.x
    public final String b() {
        return "VerifiedIdentity";
    }

    @Override // z40.x
    public final String getName() {
        return this.f91166b;
    }
}
