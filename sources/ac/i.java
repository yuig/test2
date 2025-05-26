package ac;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class i extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f1816r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.h f1817s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f1818t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1819u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1820v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, com.airbnb.lottie.h hVar, float f13, int i13, boolean z13, bl2.c cVar) {
        super(1, cVar);
        this.f1816r = jVar;
        this.f1817s = hVar;
        this.f1818t = f13;
        this.f1819u = i13;
        this.f1820v = z13;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new i(this.f1816r, this.f1817s, this.f1818t, this.f1819u, this.f1820v, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j jVar = this.f1816r;
        jVar.f1829i.setValue(this.f1817s);
        jVar.g(this.f1818t);
        jVar.f(this.f1819u);
        jVar.f1821a.setValue(Boolean.FALSE);
        if (this.f1820v) {
            jVar.f1832l.setValue(Long.MIN_VALUE);
        }
        return Unit.f80348a;
    }
}
