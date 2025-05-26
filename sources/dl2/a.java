package dl2;

import java.io.Serializable;
import kg.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.q;
import xk2.s;

/* loaded from: classes2.dex */
public abstract class a implements bl2.c, e, Serializable {
    private final bl2.c<Object> completion;

    public a(bl2.c cVar) {
        this.completion = cVar;
    }

    @NotNull
    public bl2.c<Unit> create(@NotNull bl2.c<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // dl2.e
    public e getCallerFrame() {
        bl2.c<Object> cVar = this.completion;
        if (cVar instanceof e) {
            return (e) cVar;
        }
        return null;
    }

    public final bl2.c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return p.A(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bl2.c
    public final void resumeWith(@NotNull Object obj) {
        bl2.c frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            bl2.c cVar = aVar.completion;
            Intrinsics.f(cVar);
            try {
                obj = aVar.invokeSuspend(obj);
            } catch (Throwable th3) {
                q qVar = s.f135225b;
                obj = ue.c.m(th3);
            }
            if (obj == cl2.a.COROUTINE_SUSPENDED) {
                return;
            }
            q qVar2 = s.f135225b;
            aVar.releaseIntercepted();
            if (!(cVar instanceof a)) {
                cVar.resumeWith(obj);
                return;
            }
            frame = cVar;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb3 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb3.append(stackTraceElement);
        return sb3.toString();
    }

    @NotNull
    public bl2.c<Unit> create(Object obj, @NotNull bl2.c<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
