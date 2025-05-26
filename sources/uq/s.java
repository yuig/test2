package uq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123025i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rl1.r f123026j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(rl1.r rVar, int i13) {
        super(1);
        this.f123025i = i13;
        this.f123026j = rVar;
    }

    public final rl1.q b(rl1.q it) {
        switch (this.f123025i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rl1.q.e(it, null, null, false, this.f123026j, null, false, false, null, 0, null, null, 2039);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f123025i) {
        }
        return b((rl1.q) obj);
    }
}
