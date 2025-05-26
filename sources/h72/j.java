package h72;

import ao2.j0;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f67981r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f67981r = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f67981r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return new File(a.a.C(this.f67981r.f67986a.getFilesDir().getAbsolutePath(), "/renderresouces"));
    }
}
