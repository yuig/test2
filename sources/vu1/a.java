package vu1;

import ao2.j0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.Callback;

/* loaded from: classes4.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f126652r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Callback f126653s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Callback callback, bl2.c cVar) {
        super(2, cVar);
        this.f126652r = dVar;
        this.f126653s = callback;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f126652r, this.f126653s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Callback callback = this.f126653s;
        d dVar = this.f126652r;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            callback.onResponse(dVar, dVar.c(dVar.b()));
            return Unit.f80348a;
        } catch (IOException e13) {
            dVar.f126666g.k();
            callback.onFailure(dVar, e13);
            return Unit.f80348a;
        } catch (ExecutionException e14) {
            e = e14;
            dVar.f126666g.k();
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            callback.onFailure(dVar, new IOException(e));
            return Unit.f80348a;
        } catch (Throwable th3) {
            dVar.f126666g.k();
            callback.onFailure(dVar, new IOException(th3));
            return Unit.f80348a;
        }
    }
}
