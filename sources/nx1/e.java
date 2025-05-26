package nx1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92507i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ox1.b f92508j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ox1.b bVar, int i13) {
        super(1);
        this.f92507i = i13;
        this.f92508j = bVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f92507i;
        ox1.b bVar = this.f92508j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return yl1.b.f(it, null, false, d7.b.Z(bVar.f97985c), null, null, null, null, null, 0, null, 1019);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f92507i) {
        }
        return b((yl1.b) obj);
    }
}
