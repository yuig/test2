package kz1;

import kotlin.jvm.internal.Intrinsics;
import tu1.u;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f81181a;

    /* renamed from: b, reason: collision with root package name */
    public final v f81182b;

    public a(c hardware) {
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        this.f81181a = hardware;
        this.f81182b = m.b(new u(this, 3));
    }

    public final double a() {
        return ((Number) this.f81182b.getValue()).doubleValue();
    }
}
