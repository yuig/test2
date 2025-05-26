package sq;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f114961i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vn1.e f114962j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(vn1.e eVar, int i13) {
        super(1);
        this.f114961i = i13;
        this.f114962j = eVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f114961i;
        vn1.e eVar = this.f114962j;
        switch (i13) {
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
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, null, e0.b(eVar), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f114961i) {
        }
        return b((rn1.a) obj);
    }
}
