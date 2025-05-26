package to0;

import com.pinterest.feature.browser.view.InAppBrowserFragment;
import df.j1;
import h32.i0;
import h32.w0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nx.z0;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f118674r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InAppBrowserFragment f118675s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InAppBrowserFragment inAppBrowserFragment, bl2.c cVar) {
        super(2, cVar);
        this.f118675s = inAppBrowserFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f118675s, cVar);
        kVar.f118674r = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((androidx.lifecycle.q) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        int i13 = j.f118673a[((androidx.lifecycle.q) this.f118674r).ordinal()];
        InAppBrowserFragment inAppBrowserFragment = this.f118675s;
        if (i13 == 1) {
            int i14 = InAppBrowserFragment.T0;
            w0 e13 = inAppBrowserFragment.s7().e();
            String str = e13 != null ? e13.G : null;
            HashMap f13 = inAppBrowserFragment.s7().f();
            qq2.c cVar = new qq2.c(f13 != null ? j1.R1(f13) : new z0(), str);
            i0 p13 = inAppBrowserFragment.s7().p();
            if (p13 != null) {
                inAppBrowserFragment.w7().f(p13, cVar);
            }
        } else if (i13 == 2) {
            inAppBrowserFragment.w7().c();
        }
        return Unit.f80348a;
    }
}
