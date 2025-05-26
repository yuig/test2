package d10;

import ao2.j0;
import com.pinterest.error.NetworkResponseError;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v.f1;

/* loaded from: classes.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f53602r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ pc.h f53603s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, pc.h hVar, bl2.c cVar) {
        super(2, cVar);
        this.f53602r = gVar;
        this.f53603s = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f53602r, this.f53603s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        z40.b a13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c10.d dVar = this.f53602r.f53611a;
        dVar.getClass();
        pc.h response = this.f53603s;
        Intrinsics.checkNotNullParameter(response, "response");
        u00.e onErrorFound = new u00.e(dVar, 1);
        c10.b bVar = dVar.f24487d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(onErrorFound, "onErrorFound");
        if (response.f99563c != null && (a13 = bVar.a(response.f99562b.name(), 0, response.f99563c)) != null) {
            new NetworkResponseError((f1) null);
            onErrorFound.invoke(a13);
        }
        return Unit.f80348a;
    }
}
