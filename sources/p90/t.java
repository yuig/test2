package p90;

import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f99223r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f99224s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f99224s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        t tVar = new t(this.f99224s, cVar);
        tVar.f99223r = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f99223r;
        int i13 = w.Y0;
        w wVar = this.f99224s;
        wVar.getClass();
        wVar.S0 = bVar.f99172d;
        wVar.R0.setValue(bVar.f99169a);
        ComposeView composeView = wVar.N0;
        if (composeView != null) {
            bs1.c.R1(composeView, bVar.f99173e);
            return Unit.f80348a;
        }
        Intrinsics.r("closeButton");
        throw null;
    }
}
