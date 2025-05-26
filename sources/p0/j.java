package p0;

import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.h0;
import e0.u;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class j extends g1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f98344b;

    /* renamed from: c, reason: collision with root package name */
    public int f98345c;

    public j(h0 h0Var) {
        super(h0Var);
        this.f98344b = "virtual-" + h0Var.c() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.g1, c0.r
    public final int b() {
        return o(0);
    }

    @Override // androidx.camera.core.impl.g1, androidx.camera.core.impl.h0
    public final String c() {
        return this.f98344b;
    }

    @Override // androidx.camera.core.impl.g1, c0.r
    public final int o(int i13) {
        return u.h(super.o(i13) - this.f98345c);
    }
}
