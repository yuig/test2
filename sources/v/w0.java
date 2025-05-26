package v;

import android.util.Range;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class w0 implements r4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f123715b;

    public /* synthetic */ w0(AtomicReference atomicReference, int i13) {
        this.f123714a = i13;
        this.f123715b = atomicReference;
    }

    @Override // r4.j
    public final Object C(r4.i iVar) {
        int i13 = this.f123714a;
        AtomicReference atomicReference = this.f123715b;
        switch (i13) {
            case 0:
                atomicReference.set(new y0(iVar, 0));
                return "OnScreenFlashUiApplied";
            case 1:
                atomicReference.set(iVar);
                return "Data closed";
            case 2:
                atomicReference.set(iVar);
                return "Data closed";
            case 3:
                Range range = y0.c0.E;
                atomicReference.set(iVar);
                return "mReleasedFuture";
            case 4:
                Range range2 = y0.c0.E;
                atomicReference.set(iVar);
                return "acquireInputBuffer";
            default:
                atomicReference.set(iVar);
                return "Terminate InputBuffer";
        }
    }
}
