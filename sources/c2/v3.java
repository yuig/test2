package c2;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class v3 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f25303i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f25304j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f25305k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f25306l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f25307m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25308n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f25309o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f25310p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Integer f25311q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n2 f25312r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f25313s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i13, int i14, int i15, Integer num, n2 n2Var, Integer num2) {
        super(1);
        this.f25303i = arrayList;
        this.f25304j = arrayList2;
        this.f25305k = arrayList3;
        this.f25306l = arrayList4;
        this.f25307m = arrayList5;
        this.f25308n = i13;
        this.f25309o = i14;
        this.f25310p = i15;
        this.f25311q = num;
        this.f25312r = n2Var;
        this.f25313s = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        q3.b1 b1Var = (q3.b1) obj;
        List list = this.f25303i;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            q3.b1.d(b1Var, (q3.c1) list.get(i14), 0, this.f25308n);
        }
        List list2 = this.f25304j;
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            q3.b1.d(b1Var, (q3.c1) list2.get(i15), 0, 0);
        }
        List list3 = this.f25305k;
        int size3 = list3.size();
        int i16 = 0;
        while (true) {
            i13 = this.f25309o;
            if (i16 >= size3) {
                break;
            }
            q3.b1.d(b1Var, (q3.c1) list3.get(i16), 0, i13 - this.f25310p);
            i16++;
        }
        List list4 = this.f25306l;
        int size4 = list4.size();
        for (int i17 = 0; i17 < size4; i17++) {
            q3.c1 c1Var = (q3.c1) list4.get(i17);
            Integer num = this.f25311q;
            q3.b1.d(b1Var, c1Var, 0, i13 - (num != null ? num.intValue() : 0));
        }
        List list5 = this.f25307m;
        int size5 = list5.size();
        for (int i18 = 0; i18 < size5; i18++) {
            q3.c1 c1Var2 = (q3.c1) list5.get(i18);
            n2 n2Var = this.f25312r;
            int i19 = n2Var != null ? n2Var.f25001a : 0;
            Integer num2 = this.f25313s;
            q3.b1.d(b1Var, c1Var2, i19, i13 - (num2 != null ? num2.intValue() : 0));
        }
        return Unit.f80348a;
    }
}
