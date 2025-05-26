package mo2;

import ho2.v;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class k extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f87828e;

    public k(long j13, k kVar, int i13) {
        super(j13, kVar, i13);
        this.f87828e = new AtomicReferenceArray(j.f87827f);
    }

    @Override // ho2.v
    public final int i() {
        return j.f87827f;
    }

    @Override // ho2.v
    public final void j(int i13, CoroutineContext coroutineContext) {
        this.f87828e.set(i13, j.f87826e);
        k();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f69789c + ", hashCode=" + hashCode() + ']';
    }
}
