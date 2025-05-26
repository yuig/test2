package ko2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80341b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80342c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80343d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80344e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f80345a = new AtomicReferenceArray(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final j a(j jVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80342c;
        if (atomicIntegerFieldUpdater.get(this) - f80343d.get(this) == 127) {
            return jVar;
        }
        if (jVar.f80332b) {
            f80344e.incrementAndGet(this);
        }
        int i13 = atomicIntegerFieldUpdater.get(this) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f80345a;
            if (atomicReferenceArray.get(i13) == null) {
                atomicReferenceArray.lazySet(i13, jVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final void b(j jVar) {
        if (jVar.f80332b) {
            f80344e.decrementAndGet(this);
        }
    }

    public final j d() {
        j jVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80343d;
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 - f80342c.get(this) == 0) {
                return null;
            }
            int i14 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i13, i13 + 1) && (jVar = (j) this.f80345a.getAndSet(i14, null)) != null) {
                b(jVar);
                return jVar;
            }
        }
    }

    public final j e(int i13) {
        int i14 = f80343d.get(this);
        int i15 = f80342c.get(this);
        boolean z13 = i13 == 1;
        while (i14 != i15) {
            if (z13 && f80344e.get(this) == 0) {
                return null;
            }
            int i16 = i14 + 1;
            j f13 = f(i14, z13);
            if (f13 != null) {
                return f13;
            }
            i14 = i16;
        }
        return null;
    }

    public final j f(int i13, boolean z13) {
        int i14 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        AtomicReferenceArray atomicReferenceArray = this.f80345a;
        j jVar = (j) atomicReferenceArray.get(i14);
        if (jVar == null || jVar.f80332b != z13 || !jq.b.B(atomicReferenceArray, i14, jVar)) {
            return null;
        }
        if (z13) {
            f80344e.decrementAndGet(this);
        }
        return jVar;
    }
}
