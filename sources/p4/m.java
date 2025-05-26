package p4;

import androidx.lifecycle.z;
import k1.s2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lb.l0;
import s3.k0;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f98821j = new m(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m f98822k = new m(1);

    /* renamed from: l, reason: collision with root package name */
    public static final m f98823l = new m(2);

    /* renamed from: m, reason: collision with root package name */
    public static final m f98824m = new m(3);

    /* renamed from: n, reason: collision with root package name */
    public static final m f98825n = new m(4);

    /* renamed from: o, reason: collision with root package name */
    public static final m f98826o = new m(5);

    /* renamed from: p, reason: collision with root package name */
    public static final m f98827p = new m(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98828i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(2);
        this.f98828i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = 1;
        int i14 = this.f98828i;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                Function1 function1 = (Function1) obj2;
                switch (i14) {
                    case 0:
                        t c13 = androidx.compose.ui.viewinterop.a.c(k0Var);
                        c13.f98842z = function1;
                        c13.f98797d = new s(c13, 2);
                        c13.f98798e = true;
                        c13.f98807n.invoke();
                        break;
                    default:
                        t c14 = androidx.compose.ui.viewinterop.a.c(k0Var);
                        c14.B = function1;
                        c14.f98800g = new s(c14, 1);
                        break;
                }
                return Unit.f80348a;
            case 1:
                k0 k0Var2 = (k0) obj;
                Function1 function12 = (Function1) obj2;
                switch (i14) {
                    case 0:
                        t c15 = androidx.compose.ui.viewinterop.a.c(k0Var2);
                        c15.f98842z = function12;
                        c15.f98797d = new s(c15, 2);
                        c15.f98798e = true;
                        c15.f98807n.invoke();
                        break;
                    default:
                        t c16 = androidx.compose.ui.viewinterop.a.c(k0Var2);
                        c16.B = function12;
                        c16.f98800g = new s(c16, 1);
                        break;
                }
                return Unit.f80348a;
            case 2:
                u2.q qVar = (u2.q) obj2;
                t c17 = androidx.compose.ui.viewinterop.a.c((k0) obj);
                if (qVar != c17.f98801h) {
                    c17.f98801h = qVar;
                    i2.i iVar = c17.f98802i;
                    if (iVar != null) {
                        iVar.invoke(qVar);
                    }
                }
                return Unit.f80348a;
            case 3:
                n4.b bVar = (n4.b) obj2;
                t c18 = androidx.compose.ui.viewinterop.a.c((k0) obj);
                if (bVar != c18.f98803j) {
                    c18.f98803j = bVar;
                    s2 s2Var = c18.f98804k;
                    if (s2Var != null) {
                        s2Var.invoke(bVar);
                    }
                }
                return Unit.f80348a;
            case 4:
                z zVar = (z) obj2;
                t c19 = androidx.compose.ui.viewinterop.a.c((k0) obj);
                if (zVar != c19.f98805l) {
                    c19.f98805l = zVar;
                    b7.c.Q(c19, zVar);
                }
                return Unit.f80348a;
            case 5:
                ma.i iVar2 = (ma.i) obj2;
                t c23 = androidx.compose.ui.viewinterop.a.c((k0) obj);
                if (iVar2 != c23.f98806m) {
                    c23.f98806m = iVar2;
                    l0.i1(c23, iVar2);
                }
                return Unit.f80348a;
            default:
                t c24 = androidx.compose.ui.viewinterop.a.c((k0) obj);
                int i15 = o.f98835a[((n4.k) obj2).ordinal()];
                if (i15 == 1) {
                    i13 = 0;
                } else if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c24.setLayoutDirection(i13);
                return Unit.f80348a;
        }
    }
}
