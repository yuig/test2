package w80;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f128381r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f128382s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(String str, ExoPlayer exoPlayer, bl2.c cVar) {
        super(2, cVar);
        this.f128381r = str;
        this.f128382s = exoPlayer;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r1(this.f128381r, this.f128382s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a7.i0 b13 = a7.i0.b(this.f128381r);
        Intrinsics.checkNotNullExpressionValue(b13, "fromUri(...)");
        a7.v0 v0Var = this.f128382s;
        ((a7.h) v0Var).e0(b13);
        ((m7.l0) v0Var).b();
        ((m7.l0) v0Var).B0(true);
        ((m7.l0) v0Var).O(2);
        return Unit.f80348a;
    }
}
