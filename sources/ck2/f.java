package ck2;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class f implements Callable, ak2.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27916a;

    public f(Object obj) {
        this.f27916a = obj;
    }

    @Override // ak2.f
    public final Object apply(Object obj) {
        return this.f27916a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f27916a;
    }
}
