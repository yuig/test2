package bn2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.d f23582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ am2.d f23583b;

    public k(com.bumptech.glide.d dVar, am2.d dVar2) {
        this.f23582a = dVar;
        this.f23583b = dVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am2.d second = (am2.d) obj;
        com.bumptech.glide.d dVar = this.f23582a;
        dVar.getClass();
        am2.d first = this.f23583b;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        dVar.x(first, second);
        return Unit.f80348a;
    }
}
