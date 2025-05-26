package dl2;

import ao2.f0;
import ao2.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class d extends a {
    private final CoroutineContext _context;
    private transient bl2.c<Object> intercepted;

    public d(bl2.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }

    @Override // bl2.c
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.f(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final bl2.c<Object> intercepted() {
        bl2.c<Object> cVar = this.intercepted;
        if (cVar == null) {
            kotlin.coroutines.f fVar = (kotlin.coroutines.f) getContext().get(kotlin.coroutines.f.Ho);
            cVar = fVar != null ? new ho2.e((f0) fVar, this) : this;
            this.intercepted = cVar;
        }
        return cVar;
    }

    @Override // dl2.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bl2.c<Object> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.f.Ho);
            Intrinsics.f(element);
            ho2.e eVar = (ho2.e) cVar;
            do {
                atomicReferenceFieldUpdater = ho2.e.f69753h;
            } while (atomicReferenceFieldUpdater.get(eVar) == ho2.f.f69759b);
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            o oVar = obj instanceof o ? (o) obj : null;
            if (oVar != null) {
                oVar.r();
            }
        }
        this.intercepted = c.f55296a;
    }

    public d(bl2.c cVar, CoroutineContext coroutineContext) {
        super(cVar);
        this._context = coroutineContext;
    }
}
