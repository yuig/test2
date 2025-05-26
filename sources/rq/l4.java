package rq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l4 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109365i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Integer f109366j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(Integer num, int i13) {
        super(1);
        this.f109365i = i13;
        this.f109366j = num;
    }

    public final bk1.a2 b(bk1.a2 it) {
        switch (this.f109365i) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return bk1.a2.b(it, null, false, false, null, null, 0, false, null, null, null, false, false, this.f109366j, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -262145, 524287);
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f109365i;
        Integer num = this.f109366j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = num.toString();
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
            case 3:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, num != null ? vn1.c.DEFAULT : vn1.c.LIGHT, null, null, null, 3, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097117);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], num.intValue()), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], num.intValue()), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], num.intValue()), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109365i;
        Integer num = this.f109366j;
        switch (i13) {
            case 1:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 6:
                ao1.b it3 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
        }
        return b((bk1.a2) obj);
    }
}
