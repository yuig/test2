package rq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109425i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rm1.q f109426j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(rm1.q qVar, int i13) {
        super(1);
        this.f109425i = i13;
        this.f109426j = qVar;
    }

    public final om1.c b(om1.c it) {
        switch (this.f109425i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "displayState");
                rm1.m mVar = it.f96639a;
                rm1.q icon = this.f109426j;
                Intrinsics.checkNotNullParameter(icon, "icon");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return om1.c.e(it, this.f109426j, null, null, null, null, false, 0, 1022);
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f109425i;
        rm1.q qVar = this.f109426j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(qVar, rm1.i.MD), null, null, 0, null, 30), false, 0, null, null, null, null, null, false, null, null, 2096639);
    }

    public final void f(rm1.k bind) {
        int i13 = this.f109425i;
        rm1.q qVar = this.f109426j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 0));
                break;
            case 12:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 11));
                break;
            case 14:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 13));
                break;
            case 17:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 16));
                break;
            case 21:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 20));
                break;
            case 24:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 23));
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 26));
                break;
        }
    }

    public final void h(rm1.l standard) {
        int i13 = this.f109425i;
        rm1.q qVar = this.f109426j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
            default:
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(qVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f109425i;
        rm1.q qVar = this.f109426j;
        switch (i13) {
            case 0:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 1:
                f((rm1.k) obj);
                return Unit.f80348a;
            case 2:
                om1.q bind = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(qVar);
                return Unit.f80348a;
            case 3:
                return b((om1.c) obj);
            case 4:
                return b((om1.c) obj);
            case 5:
                return e((rn1.a) obj);
            case 6:
                return e((rn1.a) obj);
            case 7:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 8:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 9:
                return b((om1.c) obj);
            case 10:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 11:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 12:
                f((rm1.k) obj);
                return Unit.f80348a;
            case 13:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 14:
                f((rm1.k) obj);
                return Unit.f80348a;
            case 15:
                return b((om1.c) obj);
            case 16:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 17:
                f((rm1.k) obj);
                return Unit.f80348a;
            case 18:
                return b((om1.c) obj);
            case 19:
                return b((om1.c) obj);
            case 20:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 21:
                f((rm1.k) obj);
                return Unit.f80348a;
            case 22:
                return b((om1.c) obj);
            case 23:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 24:
                f((rm1.k) obj);
                return Unit.f80348a;
            case 25:
                return b((om1.c) obj);
            case 26:
                h((rm1.l) obj);
                return Unit.f80348a;
            case 27:
                f((rm1.k) obj);
                return Unit.f80348a;
            case 28:
                en1.d it = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return en1.d.e(it, null, null, null, false, new en1.u(qVar), null, false, 0, 479);
            default:
                return b((om1.c) obj);
        }
    }
}
