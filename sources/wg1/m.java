package wg1;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129810i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f129811j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i13) {
        super(1);
        this.f129810i = i13;
        this.f129811j = nVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f129810i;
        n nVar = this.f129811j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DARK, null, kotlin.collections.e0.b(vn1.e.BOLD), nVar.D ? vn1.g.BODY_300 : vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097125);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = vn1.c.DARK;
                Context context = nVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, null, cVar, kotlin.collections.e0.b(vn1.b.START), null, pk.a0.o0(context), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097129);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DARK, null, kotlin.collections.e0.b(nVar.D ? vn1.e.BOLD : vn1.e.REGULAR), vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097125);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar2 = vn1.c.DEFAULT;
                Context context2 = nVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return rn1.a.y(it, null, cVar2, kotlin.collections.e0.b(vn1.b.START), null, pk.a0.o0(context2), 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097129);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DARK, null, kotlin.collections.e0.b(nVar.D ? vn1.e.BOLD : vn1.e.REGULAR), vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097125);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f129810i) {
        }
        return b((rn1.a) obj);
    }
}
