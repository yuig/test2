package to0;

import ao2.j0;
import com.pinterest.feature.browser.view.InAppBrowserFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f118676r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InAppBrowserFragment f118677s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InAppBrowserFragment inAppBrowserFragment, bl2.c cVar) {
        super(2, cVar);
        this.f118677s = inAppBrowserFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f118677s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f118676r;
        if (i13 == 0) {
            ue.c.H(obj);
            InAppBrowserFragment inAppBrowserFragment = this.f118677s;
            ad0.b bVar = inAppBrowserFragment.O0;
            if (bVar == null) {
                Intrinsics.r("appLifecycle");
                throw null;
            }
            do2.i V = l0.V(bVar.f2083a);
            k kVar = new k(inAppBrowserFragment, null);
            this.f118676r = 1;
            if (l0.I(V, kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
