package p5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends s4.f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f98858d;

    public e(int i13) {
        super(i13, 1);
        this.f98858d = new Object();
    }

    @Override // s4.f, p5.d
    public final boolean a(Object instance) {
        boolean a13;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f98858d) {
            a13 = super.a(instance);
        }
        return a13;
    }

    @Override // s4.f, p5.d
    public final Object b() {
        Object b13;
        synchronized (this.f98858d) {
            b13 = super.b();
        }
        return b13;
    }
}
