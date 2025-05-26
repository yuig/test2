package qm1;

import kotlin.jvm.internal.Intrinsics;
import rm1.q;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public q f104404a;

    /* renamed from: b, reason: collision with root package name */
    public d f104405b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f104406c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f104407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f104408e;

    public l(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f104404a = displayState.f104382a;
        this.f104405b = displayState.f104383b;
        this.f104406c = displayState.f104384c;
        this.f104407d = displayState.f104385d;
        this.f104408e = displayState.f104386e;
    }

    public final void a(q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f104404a = icon;
    }
}
