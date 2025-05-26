package iw1;

import ao2.j0;
import dl2.j;
import io2.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o1.f;
import u50.r;
import uj2.h;
import z01.k;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f73763r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f73764s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ rx.d f73765t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f73766u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, rx.d dVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f73764s = kVar;
        this.f73765t = dVar;
        this.f73766u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f73764s, this.f73765t, this.f73766u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        k kVar = this.f73764s;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73763r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                px.a aVar2 = (px.a) kVar.f140564c;
                rx.d params = this.f73765t;
                px.c cVar = (px.c) aVar2;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                h s13 = cVar.e(params).s();
                Intrinsics.checkNotNullExpressionValue(s13, "toFlowable(...)");
                io2.a[] aVarArr = io2.j.f73346a;
                i iVar = new i(s13);
                f fVar = new f(18, kVar, this.f73766u);
                this.f73763r = 1;
                if (iVar.collect(fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
        } catch (Exception unused) {
        }
        return Unit.f80348a;
    }
}
