package iu1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73705i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f73706j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(f fVar, int i13) {
        super(1);
        this.f73705i = i13;
        this.f73706j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73705i;
        f fVar = this.f73706j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], fVar.f73700c), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                ln1.l bind = (ln1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(((d) fVar.f73701d).f73697a);
                return Unit.f80348a;
        }
    }
}
