package cj0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27869i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zo.c f27870j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13, zo.c cVar) {
        super(1);
        this.f27869i = i13;
        this.f27870j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27869i) {
            case 0:
                d0 it = (d0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return d0.b(it, null, null, this.f27870j, null, null, false, 503);
            default:
                lm0.a it2 = (lm0.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return lm0.a.e(it2, null, this.f27870j, null, false, null, false, null, null, null, null, 2043);
        }
    }
}
