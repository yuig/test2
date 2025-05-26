package ads_mobile_sdk;

import android.util.Base64;
import ao2.j0;
import java.util.concurrent.atomic.AtomicReference;
import kh2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class gs2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ks2 f5681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs2(AtomicReference atomicReference, AtomicReference atomicReference2, ks2 ks2Var, bl2.c cVar) {
        super(2, cVar);
        this.f5679a = atomicReference;
        this.f5680b = atomicReference2;
        this.f5681c = ks2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new gs2(this.f5679a, this.f5680b, this.f5681c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gs2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        if (g0.f0("GET_VARIATIONS_HEADER")) {
            int i13 = ab.e.f1688a;
            if (!bb.k.f22456d.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            String variationsHeader = bb.l.f22459a.getStatics().getVariationsHeader();
            Intrinsics.f(variationsHeader);
            if (z.j(variationsHeader)) {
                return Unit.f80348a;
            }
            try {
                this.f5679a.set(xm.a(Base64.decode(variationsHeader, 0)));
                this.f5680b.set(variationsHeader);
            } catch (Throwable th3) {
                this.f5681c.a("Exception caught parsing chrome variations data.", th3);
            }
        }
        return Unit.f80348a;
    }
}
