package wg1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129772i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tg1.e f129773j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(tg1.e eVar, int i13) {
        super(1);
        this.f129772i = i13;
        this.f129773j = eVar;
    }

    public final rn1.a b(rn1.a it) {
        String str;
        i0 i0Var = h0.f120562a;
        int i13 = this.f129772i;
        tg1.e eVar = this.f129773j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = eVar.f117586c;
                fm1.c Z = d7.b.Z(!(str2 == null || kotlin.text.z.j(str2)));
                String str3 = eVar.f117586c;
                if (str3 != null) {
                    i0Var = bs1.c.p2(str3);
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, Z, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String str4 = eVar.f117587d;
                fm1.c Z2 = d7.b.Z(!(str4 == null || kotlin.text.z.j(str4)));
                String str5 = eVar.f117587d;
                if (str5 != null) {
                    i0Var = bs1.c.p2(str5);
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, Z2, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                tg1.c cVar = eVar.f117588e;
                if (cVar != null && (str = cVar.f117581b) != null) {
                    i0Var = bs1.c.p2(str);
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        switch (this.f129772i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            default:
                rl1.q it = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                tg1.e eVar = this.f129773j;
                tg1.c cVar = eVar.f117588e;
                if (cVar == null || (str = cVar.f117582c) == null) {
                    str = "";
                }
                Integer num = cVar != null ? cVar.f117583d : null;
                rl1.c dVar = num == null ? rl1.b.f108524a : new rl1.d(num.intValue());
                tg1.c cVar2 = eVar.f117588e;
                if (cVar2 == null || (str2 = cVar2.f117581b) == null) {
                    str2 = "";
                }
                String str3 = cVar2 != null ? cVar2.f117581b : null;
                return rl1.q.e(it, str, str2, false, null, null, false, false, d7.b.Z(true ^ (str3 == null || kotlin.text.z.j(str3))), 0, dVar, null, 1404);
        }
    }
}
