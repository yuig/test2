package ow0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97919i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mw0.a f97920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(mw0.a aVar, int i13) {
        super(1);
        this.f97919i = i13;
        this.f97920j = aVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f97919i;
        mw0.a aVar = this.f97920j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(aVar.f88421c), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(aVar.f88422d), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f97919i) {
        }
        return b((yl1.b) obj);
    }
}
