package to0;

import ao2.j0;
import ao2.m0;
import com.pinterest.feature.browser.view.InAppBrowserFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f118678r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InAppBrowserFragment f118679s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InAppBrowserFragment inAppBrowserFragment, bl2.c cVar) {
        super(2, cVar);
        this.f118679s = inAppBrowserFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f118679s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f118678r;
        if (i13 == 0) {
            ue.c.H(obj);
            InAppBrowserFragment inAppBrowserFragment = this.f118679s;
            androidx.lifecycle.z viewLifecycleOwner = inAppBrowserFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.CREATED;
            l lVar = new l(inAppBrowserFragment, null);
            this.f118678r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, lVar, this) == aVar) {
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
