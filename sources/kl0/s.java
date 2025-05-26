package kl0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80112i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ om1.f f80113j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(om1.f fVar, int i13) {
        super(1);
        this.f80112i = i13;
        this.f80113j = fVar;
    }

    public final om1.c b(om1.c it) {
        switch (this.f80112i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return om1.c.e(it, null, null, this.f80113j, null, null, false, 0, 1019);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80112i) {
        }
        return b((om1.c) obj);
    }
}
