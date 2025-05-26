package kw1;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import r72.e1;
import r72.e2;
import r72.q1;
import rl1.q;
import ro2.d0;
import ro2.o;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81038i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f81039j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i13) {
        super(1);
        this.f81038i = i13;
        this.f81039j = str;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f81038i;
        String str = this.f81039j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2("+" + str), vn1.c.SUCCESS, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.ERROR, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, d7.b.Z(!z.j(str)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 13:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.SUBTLE, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, bs1.c.h2(str), null, null, null, null, false, null, null, 2092988);
        }
    }

    public final void e(d0 putJsonObject) {
        int i13 = this.f81038i;
        String str = this.f81039j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
                Intrinsics.checkNotNullParameter(putJsonObject, "<this>");
                Intrinsics.checkNotNullParameter("_0", "key");
                putJsonObject.a("_0", o.b(str));
                break;
            case 11:
                Intrinsics.checkNotNullParameter(putJsonObject, "$this$addJsonObject");
                kg.o.K(putJsonObject, "unique", new c(str, 10));
                break;
            default:
                Intrinsics.checkNotNullParameter(putJsonObject, "$this$addJsonObject");
                kg.o.K(putJsonObject, str, g72.d0.f63961k);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f81038i;
        String str = this.f81039j;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            case 4:
                return b((rn1.a) obj);
            case 5:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, bs1.c.h2(str), null, yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 6:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "pair");
                return Boolean.valueOf(Intrinsics.d(str, pair.f80346a));
            case 7:
                x02.z event = (x02.z) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                return Boolean.valueOf(Intrinsics.d(event.f131541a.getUid(), str));
            case 8:
                return b((rn1.a) obj);
            case 9:
                q1 it2 = (q1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                e1 e1Var = it2.f106627b;
                e2 shuffleOverlay = it2.f106628c;
                Intrinsics.checkNotNullParameter(shuffleOverlay, "shuffleOverlay");
                return new q1(str, e1Var, shuffleOverlay);
            case 10:
                e((d0) obj);
                return Unit.f80348a;
            case 11:
                e((d0) obj);
                return Unit.f80348a;
            case 12:
                e((d0) obj);
                return Unit.f80348a;
            case 13:
                return b((rn1.a) obj);
            case 14:
                return b((rn1.a) obj);
            case 15:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return q.e(it3, this.f81039j, null, false, null, null, false, false, null, 0, rl1.b.f108524a, null, 1534);
            case 16:
                return b((rn1.a) obj);
            case 17:
                yl1.b it4 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return yl1.b.f(it4, bs1.c.p2(str), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                dl1.s it5 = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return Boolean.valueOf(Intrinsics.d(it5.getUid(), str));
        }
    }
}
