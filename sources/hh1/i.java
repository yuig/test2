package hh1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69175i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f69176j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(q qVar, int i13) {
        super(1);
        this.f69175i = i13;
        this.f69176j = qVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f69175i;
        q qVar = this.f69176j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = qVar.f69210h;
                if (str == null) {
                    str = "";
                }
                return rn1.a.y(it, bs1.c.h2(str), qVar.f69208f, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(qVar.f69211i), qVar.f69208f, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f69175i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            default:
                rm1.d it = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rm1.d.e(it, null, null, d7.b.Z(this.f69176j.f69209g), 0, null, 27);
        }
    }
}
