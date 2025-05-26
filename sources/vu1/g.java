package vu1;

import ao2.j0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.Callback;

/* loaded from: classes2.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f126673r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Callback f126674s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Callback callback, bl2.c cVar) {
        super(2, cVar);
        this.f126673r = iVar;
        this.f126674s = callback;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f126673r, this.f126674s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Callback callback = this.f126674s;
        i iVar = this.f126673r;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            callback.onResponse(iVar, iVar.c(iVar.b()));
            return Unit.f80348a;
        } catch (IOException e13) {
            iVar.f126681g.k();
            callback.onFailure(iVar, e13);
            return Unit.f80348a;
        } catch (ExecutionException e14) {
            e = e14;
            iVar.f126681g.k();
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            callback.onFailure(iVar, new IOException(e));
            return Unit.f80348a;
        } catch (Throwable th3) {
            iVar.f126681g.k();
            callback.onFailure(iVar, new IOException(th3));
            return Unit.f80348a;
        }
    }
}
