package od1;

import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f94168r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f94169s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f94169s = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f94169s, cVar);
        qVar.f94168r = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        WebImageView webImageView;
        GestaltText gestaltText;
        ov1.k kVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f94168r;
        t tVar = this.f94169s;
        if (tVar.Q0.i().isEmpty() && (!bVar.i().isEmpty()) && (kVar = tVar.T0) != null) {
            kVar.g(bVar.i());
            ov1.k kVar2 = tVar.T0;
            if (kVar2 != null) {
                kVar2.m();
            }
        }
        if (!Intrinsics.d(tVar.Q0.h(), bVar.h()) && (gestaltText = tVar.W0) != null) {
            pk.a0.p(gestaltText, bVar.h());
        }
        if (!Intrinsics.d(tVar.Q0.g(), bVar.g()) && (webImageView = tVar.X0) != null) {
            webImageView.loadUrl(bVar.g());
        }
        tVar.Q0 = bVar;
        return Unit.f80348a;
    }
}
