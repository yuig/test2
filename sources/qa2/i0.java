package qa2;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yk1.v f103271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f30 f103272s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f103273t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f103274u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f103275v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(yk1.v vVar, f30 f30Var, boolean z13, boolean z14, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f103271r = vVar;
        this.f103272s = f30Var;
        this.f103273t = z13;
        this.f103274u = z14;
        this.f103275v = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i0(this.f103271r, this.f103272s, this.f103273t, this.f103274u, this.f103275v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f103275v.invoke(com.bumptech.glide.c.X(this.f103271r, this.f103272s, this.f103273t, this.f103274u));
        return Unit.f80348a;
    }
}
