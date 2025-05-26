package wo2;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f130667a = new z(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f130668b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f130669c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f130668b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i13 = 0; i13 < highestOneBit; i13++) {
            atomicReferenceArr[i13] = new AtomicReference();
        }
        f130669c = atomicReferenceArr;
    }

    public static final void a(z segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f130757f != null || segment.f130758g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f130755d) {
            return;
        }
        AtomicReference atomicReference = f130669c[(int) (Thread.currentThread().getId() & (f130668b - 1))];
        z zVar = f130667a;
        z zVar2 = (z) atomicReference.getAndSet(zVar);
        if (zVar2 == zVar) {
            return;
        }
        int i13 = zVar2 != null ? zVar2.f130754c : 0;
        if (i13 >= 65536) {
            atomicReference.set(zVar2);
            return;
        }
        segment.f130757f = zVar2;
        segment.f130753b = 0;
        segment.f130754c = i13 + 8192;
        atomicReference.set(segment);
    }

    public static final z b() {
        AtomicReference atomicReference = f130669c[(int) (Thread.currentThread().getId() & (f130668b - 1))];
        z zVar = f130667a;
        z zVar2 = (z) atomicReference.getAndSet(zVar);
        if (zVar2 == zVar) {
            return new z();
        }
        if (zVar2 == null) {
            atomicReference.set(null);
            return new z();
        }
        atomicReference.set(zVar2.f130757f);
        zVar2.f130757f = null;
        zVar2.f130754c = 0;
        return zVar2;
    }
}
