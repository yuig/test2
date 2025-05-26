package w21;

import com.pinterest.api.model.i50;
import com.pinterest.api.model.x40;
import com.pinterest.api.model.y40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public Map f127643a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f127644b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f127645c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f127646d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public String f127647e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f127648f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f127649g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f127650h = "";

    /* renamed from: i, reason: collision with root package name */
    public y40 f127651i;

    public b0() {
        x40 x40Var = new x40(0);
        y40 y40Var = new y40(x40Var.f43580a, x40Var.f43581b, x40Var.f43582c, x40Var.f43583d, x40Var.f43584e, x40Var.f43585f, x40Var.f43586g, x40Var.f43587h, x40Var.f43588i, x40Var.f43589j, 0);
        Intrinsics.checkNotNullExpressionValue(y40Var, "build(...)");
        this.f127651i = y40Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int size = this.f127643a.size();
        for (int i13 = 0; i13 < size; i13++) {
            List list = (List) this.f127643a.get(Integer.valueOf(i13));
            if (list != null) {
                arrayList.add(list);
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        List x03 = CollectionsKt.x0(this.f127644b.entrySet(), new sw0.u(4));
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(x03, 10));
        Iterator it = x03.iterator();
        while (it.hasNext()) {
            arrayList.add((i50) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List c(int i13) {
        List F0;
        int i14;
        String e13;
        y40.a s13 = this.f127651i.s();
        int i15 = s13 == null ? -1 : a0.f127632a[s13.ordinal()];
        if (i15 == 1) {
            LinkedHashSet linkedHashSet = this.f127645c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (!this.f127646d.contains((i50) obj)) {
                    arrayList.add(obj);
                }
            }
            F0 = CollectionsKt.F0(arrayList);
        } else if (i15 != 2) {
            F0 = kotlin.collections.q0.f80391a;
        } else {
            F0 = (List) this.f127643a.get(Integer.valueOf(i13));
            if (F0 == null) {
                F0 = kotlin.collections.q0.f80391a;
            }
        }
        if (F0.size() < 2) {
            return kotlin.collections.q0.f80391a;
        }
        while (true) {
            ol2.e eVar = ol2.f.f96454a;
            int size = F0.size();
            eVar.getClass();
            i14 = ol2.f.f96455b.i(size);
            String e14 = ((i50) F0.get(i14)).e();
            if (e14 != null && e14.length() != 0) {
                break;
            }
        }
        while (true) {
            ol2.e eVar2 = ol2.f.f96454a;
            int size2 = F0.size();
            eVar2.getClass();
            int i16 = ol2.f.f96455b.i(size2);
            if (i16 != i14 && (e13 = ((i50) F0.get(i16)).e()) != null && e13.length() != 0) {
                return kotlin.collections.f0.j(F0.get(i14), F0.get(i16));
            }
        }
    }

    public final void d(List questions) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        List list = questions;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            arrayList.add(new Pair(Integer.valueOf(i13), (List) obj));
            i13 = i14;
        }
        this.f127643a = kotlin.collections.z0.m(arrayList);
    }
}
