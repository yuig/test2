package androidx.compose.foundation.lazy.layout;

import com.pinterest.componentBrowser.ComponentBrowserActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import w1.g1;
import w1.v2;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17302i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f17303j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17304k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f17305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f17306m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(int i13, List list, ArrayList arrayList, ArrayList arrayList2) {
        super(2);
        this.f17302i = 8;
        this.f17305l = list;
        this.f17304k = i13;
        this.f17306m = arrayList;
        this.f17303j = arrayList2;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f17302i;
        Object obj = this.f17303j;
        Object obj2 = this.f17306m;
        int i15 = this.f17304k;
        Object obj3 = this.f17305l;
        switch (i14) {
            case 0:
                ((v0) obj3).e(obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 1:
                g1.e((u2.q) obj3, (b2.t0) obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 2:
                Object[] objArr = (Object[]) obj2;
                ((v2) obj3).b(Arrays.copyOf(objArr, objArr.length), (Function1) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 3:
                c0.d.b((b2.l) obj3, (u2.e) obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 4:
                ((q2.h) obj3).e(obj2, obj, oVar, i2.u.p(i15) | 1);
                break;
            case 5:
                ((r2.i) obj3).e(obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 6:
                kh2.s0.o((z9.k) obj3, (r2.d) obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            case 7:
                ComponentBrowserActivity.q((ComponentBrowserActivity) obj3, (z9.e0) obj2, (oc0.r) obj, oVar, i2.u.p(i15 | 1));
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                kg.p.e((String) ((List) obj3).get(i15), androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.k(u2.n.f120041b, ((n4.e) ((List) obj2).get(i15)).f89175a, ((n4.e) ((List) obj).get(i15)).f89175a), v1.i.a(com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar))), oVar, 0, 0);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f17302i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 6:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 7:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, int i13, int i14) {
        super(2);
        this.f17302i = i14;
        this.f17305l = obj;
        this.f17306m = obj2;
        this.f17303j = obj3;
        this.f17304k = i13;
    }
}
