package ho2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class t {

    @NotNull
    private volatile AtomicReferenceArray<Object> array;

    public t(int i13) {
        this.array = new AtomicReferenceArray<>(i13);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i13) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i13 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i13);
        }
        return null;
    }

    public final void c(int i13, ko2.b bVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i13 < length) {
            atomicReferenceArray.set(i13, bVar);
            return;
        }
        int i14 = i13 + 1;
        int i15 = length * 2;
        if (i14 < i15) {
            i14 = i15;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i14);
        for (int i16 = 0; i16 < length; i16++) {
            atomicReferenceArray2.set(i16, atomicReferenceArray.get(i16));
        }
        atomicReferenceArray2.set(i13, bVar);
        this.array = atomicReferenceArray2;
    }
}
