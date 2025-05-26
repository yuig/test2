package c61;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.s3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0 f26594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w60.d f26595s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(w0 w0Var, w60.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f26594r = w0Var;
        this.f26595s = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k0(this.f26594r, this.f26595s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        w0 w0Var = this.f26594r;
        boolean z13 = w0Var instanceof s0;
        w60.d dVar = this.f26595s;
        if (z13) {
            dVar.f128119b.B();
        } else if (Intrinsics.d(w0Var, t0.f26641a)) {
            ll.j jVar = dVar.f128119b;
            NavigationImpl w13 = Navigation.w1((ScreenLocation) s3.f51353b.getValue());
            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
            jVar.f(w13);
        } else if (Intrinsics.d(w0Var, u0.f26643a)) {
            ll.j jVar2 = dVar.f128119b;
            NavigationImpl w14 = Navigation.w1((ScreenLocation) s3.f51353b.getValue());
            w14.Y1("com.pinterest.EXTRA_START_VOICE_SEARCH", true);
            Intrinsics.checkNotNullExpressionValue(w14, "apply(...)");
            jVar2.f(w14);
        } else if (Intrinsics.d(w0Var, v0.f26645a)) {
            ll.j jVar3 = dVar.f128119b;
            NavigationImpl w15 = Navigation.w1((ScreenLocation) s3.f51352a.getValue());
            Intrinsics.checkNotNullExpressionValue(w15, "create(...)");
            jVar3.f(w15);
        }
        return Unit.f80348a;
    }
}
