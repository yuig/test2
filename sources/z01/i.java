package z01;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import y01.v0;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f140555r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f140556s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f140557t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(StringBuilder sb3, k kVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f140555r = sb3;
        this.f140556s = kVar;
        this.f140557t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f140555r, this.f140556s, this.f140557t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        String g13 = ((rw0.f) this.f140556s.f140563b).g();
        StringBuilder sb3 = this.f140555r;
        sb3.append(g13);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        this.f140557t.a(new v0(sb4));
        return Unit.f80348a;
    }
}
