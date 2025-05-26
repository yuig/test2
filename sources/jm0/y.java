package jm0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wm0.a f77012j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(wm0.a aVar, int i13) {
        super(1);
        this.f77011i = i13;
        this.f77012j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77011i) {
            case 0:
                lm0.a it = (lm0.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return lm0.a.e(it, null, null, null, false, this.f77012j, false, null, null, null, null, 2015);
            default:
                qm0.b it2 = (qm0.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return qm0.b.e(it2, null, null, this.f77012j, null, null, 27);
        }
    }
}
