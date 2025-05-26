package zw0;

import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;
import o82.j0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142910i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vh f142911j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(vh vhVar, int i13) {
        super(1);
        this.f142910i = i13;
        this.f142911j = vhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142910i;
        vh vhVar = this.f142911j;
        switch (i13) {
            case 0:
                s it = (s) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return s.b(it, new j0(new i2(vhVar, 2)));
            case 1:
                dx0.u it2 = (dx0.u) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return dx0.u.b(it2, new j0(new i2(vhVar, 2)));
            default:
                rn1.a it3 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                kj kjVar = vhVar.f42855m;
                String a13 = kjVar != null ? kjVar.a() : null;
                if (a13 == null) {
                    a13 = "";
                }
                return rn1.a.y(it3, bs1.c.h2(a13), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }
}
