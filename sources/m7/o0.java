package m7;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements ok.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f86328b;

    public /* synthetic */ o0(AtomicBoolean atomicBoolean, int i13) {
        this.f86327a = i13;
        this.f86328b = atomicBoolean;
    }

    @Override // ok.g0
    public final Object get() {
        int i13 = this.f86327a;
        AtomicBoolean atomicBoolean = this.f86328b;
        switch (i13) {
        }
        return Boolean.valueOf(atomicBoolean.get());
    }
}
