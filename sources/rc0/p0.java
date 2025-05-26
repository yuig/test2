package rc0;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107371i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Enum f107372j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Enum r13, int i13) {
        super(1);
        this.f107371i = i13;
        this.f107372j = r13;
    }

    public final Boolean b(Context $receiver) {
        int i13 = this.f107371i;
        boolean z13 = true;
        Enum r23 = this.f107372j;
        boolean z14 = false;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 1:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 2:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 3:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 4:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 5:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 6:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 7:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 8:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 9:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 10:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                vn1.c cVar = (vn1.c) r23;
                if (cVar != vn1.c.INVERSE && ((!pk.a0.q0($receiver) || cVar != vn1.c.DARK) && (pk.a0.q0($receiver) || cVar != vn1.c.LIGHT))) {
                    z13 = false;
                }
                break;
            case 11:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                if (r23 != null) {
                    vn1.c cVar2 = (vn1.c) r23;
                    if (cVar2 != vn1.c.INVERSE && ((!pk.a0.q0($receiver) || cVar2 != vn1.c.DARK) && (pk.a0.q0($receiver) || cVar2 != vn1.c.LIGHT))) {
                        z13 = false;
                    }
                    z14 = z13;
                }
                break;
            case 12:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            default:
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
        }
        return Boolean.FALSE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f107371i) {
        }
        return b((Context) obj);
    }
}
