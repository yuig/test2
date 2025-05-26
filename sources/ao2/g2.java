package ao2;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final class g2 extends kotlin.coroutines.a implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g2 f20157b = new g2(g0.f20154b);

    @Override // ao2.o1
    public final s attachChild(u uVar) {
        return h2.f20160a;
    }

    @Override // ao2.o1
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // ao2.o1
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // ao2.o1
    public final /* synthetic */ boolean cancel(Throwable th3) {
        throw null;
    }

    @Override // ao2.o1
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // ao2.o1
    public final Sequence getChildren() {
        return yn2.g.f139557a;
    }

    @Override // ao2.o1
    public final lo2.c getOnJoin() {
        throw null;
    }

    @Override // ao2.o1
    public final o1 getParent() {
        throw null;
    }

    @Override // ao2.o1
    public final x0 invokeOnCompletion(Function1 function1) {
        return h2.f20160a;
    }

    @Override // ao2.o1
    public final boolean isActive() {
        return true;
    }

    @Override // ao2.o1
    public final boolean isCancelled() {
        return false;
    }

    @Override // ao2.o1
    public final boolean isCompleted() {
        return false;
    }

    @Override // ao2.o1
    public final Object join(bl2.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // ao2.o1
    public final o1 plus(o1 o1Var) {
        throw null;
    }

    @Override // ao2.o1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // ao2.o1
    public final x0 invokeOnCompletion(boolean z13, boolean z14, Function1 function1) {
        return h2.f20160a;
    }
}
