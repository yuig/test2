package ok0;

import dl0.b;
import fm1.c;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f95448i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f95449j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f95448i = i13;
        this.f95449j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f95448i;
        b bVar = this.f95449j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, bVar.f55191c ? c.VISIBLE : c.GONE, null, null, null, null, null, 0, null, 1019);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, null, e0.b(bVar.f55195g), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
        }
    }
}
