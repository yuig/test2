package s4;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.o;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.g0;
import kotlin.collections.t0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lq0.h1;
import pn2.b0;
import q5.x0;
import ul2.i0;
import wa2.u;
import z40.d0;

/* loaded from: classes3.dex */
public final class g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111094a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f111095b;

    public /* synthetic */ g(Object obj, int i13) {
        this.f111094a = i13;
        this.f111095b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        int i13 = this.f111094a;
        Integer num2 = null;
        Object obj3 = this.f111095b;
        switch (i13) {
            case 0:
                return ((j) obj).f111101b - ((j) obj2).f111101b;
            case 1:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                throw null;
            case 2:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 3:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f32352o).compareTo(Boolean.valueOf(materialButton2.f32352o));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 4:
                return ((wm.e) obj).f130230d - ((wm.e) obj2).f130230d;
            case 5:
                h1 h1Var = (h1) obj3;
                return al2.a.b(Integer.valueOf(Intrinsics.d(((d0) obj).a(), ((b60.d) h1Var.b()).g()) ? 1 : 0), Integer.valueOf(Intrinsics.d(((d0) obj2).a(), ((b60.d) h1Var.b()).g()) ? 1 : 0));
            case 6:
                ee1.h hVar = (ee1.h) obj;
                ee1.e eVar = (ee1.e) obj3;
                List list = eVar.f58794d;
                int i14 = -1;
                if (list != null) {
                    Iterator it = list.iterator();
                    int i15 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            k00 q13 = ((g00) it.next()).q();
                            Integer v13 = q13 != null ? q13.v() : null;
                            t32.f fVar = hVar.f58799a;
                            if (!Intrinsics.d(v13, fVar != null ? Integer.valueOf(fVar.getValue()) : null)) {
                                i15++;
                            }
                        } else {
                            i15 = -1;
                        }
                    }
                    num = Integer.valueOf(i15);
                } else {
                    num = null;
                }
                ee1.h hVar2 = (ee1.h) obj2;
                List list2 = eVar.f58794d;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            k00 q14 = ((g00) it2.next()).q();
                            Integer v14 = q14 != null ? q14.v() : null;
                            t32.f fVar2 = hVar2.f58799a;
                            if (Intrinsics.d(v14, fVar2 != null ? Integer.valueOf(fVar2.getValue()) : null)) {
                                i14 = r2;
                            } else {
                                r2++;
                            }
                        }
                    }
                    num2 = Integer.valueOf(i14);
                }
                return al2.a.b(num, num2);
            case 7:
                k62.c o13 = (k62.c) obj;
                k62.c o23 = (k62.c) obj2;
                Intrinsics.checkNotNullParameter(o13, "o1");
                Intrinsics.checkNotNullParameter(o23, "o2");
                Map map = (Map) obj3;
                return ((Number) z0.e(o13.f78424a.b(), map)).intValue() - ((Number) z0.e(o23.f78424a.b(), map)).intValue();
            case 8:
                Context context = (Context) obj3;
                return al2.a.b(context.getPackageManager().getApplicationLabel(((ResolveInfo) obj).activityInfo.applicationInfo).toString(), context.getPackageManager().getApplicationLabel(((ResolveInfo) obj2).activityInfo.applicationInfo).toString());
            case 9:
                Map.Entry entry = (Map.Entry) obj2;
                int intValue = ((Number) entry.getValue()).intValue() * 100;
                u uVar = (u) obj3;
                v32.c cVar = (v32.c) entry.getKey();
                ArrayList arrayList = uVar.f128947e;
                int indexOf = arrayList.indexOf(cVar);
                Integer valueOf = Integer.valueOf((indexOf > 0 ? arrayList.size() - indexOf : 0) + intValue);
                Map.Entry entry2 = (Map.Entry) obj;
                int intValue2 = ((Number) entry2.getValue()).intValue() * 100;
                v32.c cVar2 = (v32.c) entry2.getKey();
                ArrayList arrayList2 = uVar.f128947e;
                int indexOf2 = arrayList2.indexOf(cVar2);
                return al2.a.b(valueOf, Integer.valueOf((indexOf2 > 0 ? arrayList2.size() - indexOf2 : 0) + intValue2));
            case 10:
                Point point = (Point) obj3;
                return al2.a.b(Double.valueOf(o.i((Point) obj, point)), Double.valueOf(o.i((Point) obj2, point)));
            case 11:
                Function2 tmp0 = (Function2) obj3;
                Regex regex = i0.f122531a;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Number) tmp0.invoke(obj, obj2)).intValue();
            default:
                b0 b0Var = (b0) obj;
                Function1 function1 = (Function1) obj3;
                Intrinsics.f(b0Var);
                String obj4 = function1.invoke(b0Var).toString();
                b0 b0Var2 = (b0) obj2;
                Intrinsics.f(b0Var2);
                return al2.a.b(obj4, function1.invoke(b0Var2).toString());
        }
    }

    public g(Map map) {
        this.f111094a = 7;
        t0 M0 = CollectionsKt.M0(map.keySet());
        int a13 = y0.a(g0.q(M0, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        Iterator it = M0.iterator();
        while (true) {
            x0 x0Var = (x0) it;
            if (!x0Var.hasNext()) {
                this.f111095b = linkedHashMap;
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) x0Var.next();
                linkedHashMap.put(indexedValue.f80350b, Integer.valueOf(indexedValue.f80349a));
            }
        }
    }
}
