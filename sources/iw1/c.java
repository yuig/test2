package iw1;

import ao2.j0;
import dl2.j;
import fd.q;
import io2.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import uj2.h;
import z01.k;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f73767r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f73768s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f73769t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f73770u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, String str, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f73768s = kVar;
        this.f73769t = str;
        this.f73770u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f73768s, this.f73769t, this.f73770u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String params = this.f73769t;
        k kVar = this.f73768s;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73767r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                px.c cVar = (px.c) ((px.a) kVar.f140564c);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                h s13 = cVar.f(params).s();
                Intrinsics.checkNotNullExpressionValue(s13, "toFlowable(...)");
                io2.a[] aVarArr = io2.j.f73346a;
                i iVar = new i(s13);
                q qVar = new q(kVar, params, this.f73770u, 4);
                this.f73767r = 1;
                if (iVar.collect(qVar, this) == aVar) {
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
