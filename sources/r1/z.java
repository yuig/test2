package r1;

import i2.q1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q3.b1;
import q3.c1;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106018i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f106019j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q1 f106020k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(ArrayList arrayList, q1 q1Var, int i13) {
        super(1);
        this.f106018i = i13;
        this.f106019j = arrayList;
        this.f106020k = q1Var;
    }

    public final void b(b1 b1Var) {
        List list;
        int i13;
        List list2;
        int i14;
        int i15;
        int i16 = this.f106018i;
        q1 q1Var = this.f106020k;
        int i17 = Integer.MIN_VALUE;
        List list3 = this.f106019j;
        switch (i16) {
            case 0:
                int size = list3.size();
                for (int i18 = 0; i18 < size; i18++) {
                    b0 b0Var = (b0) list3.get(i18);
                    if (b0Var.f105864o == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("position() should be called first".toString());
                    }
                    List list4 = b0Var.f105856g;
                    int size2 = list4.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        c1 c1Var = (c1) list4.get(i19);
                        boolean z13 = b0Var.f105852c;
                        if (z13) {
                            int i23 = c1Var.f102179b;
                        } else {
                            int i24 = c1Var.f102178a;
                        }
                        long j13 = b0Var.f105866q;
                        b0Var.f105859j.a(i19, b0Var.f105851b);
                        if (b0Var.f105854e) {
                            if (z13) {
                                list = list4;
                                i13 = (int) (j13 >> 32);
                            } else {
                                list = list4;
                                i13 = (b0Var.f105864o - ((int) (j13 >> 32))) - (z13 ? c1Var.f102179b : c1Var.f102178a);
                            }
                            j13 = d7.b.a(i13, z13 ? (b0Var.f105864o - ((int) (j13 & 4294967295L))) - (z13 ? c1Var.f102179b : c1Var.f102178a) : (int) (j13 & 4294967295L));
                        } else {
                            list = list4;
                        }
                        long c13 = n4.h.c(j13, b0Var.f105857h);
                        if (z13) {
                            b1.j(b1Var, c1Var, c13);
                        } else {
                            b1.h(b1Var, c1Var, c13);
                        }
                        i19++;
                        list4 = list;
                    }
                }
                q1Var.getValue();
                return;
            default:
                int size3 = list3.size();
                int i25 = 0;
                while (i25 < size3) {
                    s1.l lVar = (s1.l) list3.get(i25);
                    if (lVar.f110471n == i17) {
                        throw new IllegalArgumentException("position() should be called first".toString());
                    }
                    List list5 = lVar.f110460c;
                    int size4 = list5.size();
                    int i26 = 0;
                    while (i26 < size4) {
                        c1 c1Var2 = (c1) list5.get(i26);
                        int i27 = i26 * 2;
                        int[] iArr = lVar.f110469l;
                        long a13 = d7.b.a(iArr[i27], iArr[i27 + 1]);
                        boolean z14 = lVar.f110466i;
                        boolean z15 = lVar.f110467j;
                        if (z14) {
                            if (z15) {
                                list2 = list5;
                                i14 = size4;
                                i15 = (int) (a13 >> 32);
                            } else {
                                list2 = list5;
                                i14 = size4;
                                i15 = (lVar.f110471n - ((int) (a13 >> 32))) - (z15 ? c1Var2.f102179b : c1Var2.f102178a);
                            }
                            a13 = d7.b.a(i15, z15 ? (lVar.f110471n - ((int) (a13 & 4294967295L))) - (z15 ? c1Var2.f102179b : c1Var2.f102178a) : (int) (a13 & 4294967295L));
                        } else {
                            list2 = list5;
                            i14 = size4;
                        }
                        long c14 = n4.h.c(a13, lVar.f110461d);
                        if (z15) {
                            b1.j(b1Var, c1Var2, c14);
                        } else {
                            b1.h(b1Var, c1Var2, c14);
                        }
                        i26++;
                        list5 = list2;
                        size4 = i14;
                    }
                    i25++;
                    i17 = Integer.MIN_VALUE;
                }
                q1Var.getValue();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f106018i) {
            case 0:
                b((b1) obj);
                break;
            default:
                b((b1) obj);
                break;
        }
        return Unit.f80348a;
    }
}
