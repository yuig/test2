package yq0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public List f139751a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f139752b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f139753c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Looper f139754d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f139755e;

    /* renamed from: f, reason: collision with root package name */
    public final tb0.h f139756f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.f0 f139757g;

    public x() {
        Looper mainLooper = Looper.getMainLooper();
        this.f139754d = mainLooper;
        this.f139755e = new Handler(mainLooper);
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        this.f139756f = hVar;
        this.f139757g = vb0.j.f125466a;
    }

    public static String b(sq0.e0 e0Var) {
        String name = e0Var.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final void a(String str) {
        this.f139756f.h("RecyclerConsistencyTracker: " + str);
    }

    public final void c(a0 dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        a("RESET notification from datasource:".concat(b(dataSource)));
        j(dataSource, "RESET");
        List list = this.f139751a;
        if (list != null) {
            h(list);
        } else {
            Intrinsics.r("dataSources");
            throw null;
        }
    }

    public final void d(a0 dataSource, int i13) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        a("INSERT notification from datasource:".concat(b(dataSource)));
        j(dataSource, "INSERT");
        LinkedHashMap linkedHashMap = this.f139752b;
        Integer num = (Integer) linkedHashMap.get(dataSource);
        int intValue = num != null ? num.intValue() : 0;
        int a13 = dataSource.a();
        if (intValue + i13 != a13) {
            k(dataSource, i13);
        } else {
            linkedHashMap.put(dataSource, Integer.valueOf(a13));
            i();
        }
    }

    public final void e(a0 dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        a("ITEM-CHANGE notification from datasource:".concat(b(dataSource)));
        j(dataSource, "ITEM-CHANGE");
    }

    public final void f(a0 dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        a("MOVE notification from datasource:".concat(b(dataSource)));
        j(dataSource, "MOVE");
    }

    public final void g(a0 dataSource, int i13) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        a("REMOVE notification from datasource:".concat(b(dataSource)));
        j(dataSource, "REMOVE");
        LinkedHashMap linkedHashMap = this.f139752b;
        Integer num = (Integer) linkedHashMap.get(dataSource);
        int intValue = num != null ? num.intValue() : 0;
        int a13 = dataSource.a();
        if (intValue - i13 != a13) {
            k(dataSource, i13 * (-1));
        } else {
            linkedHashMap.put(dataSource, Integer.valueOf(a13));
            i();
        }
    }

    public final void h(List dataSourceList) {
        Intrinsics.checkNotNullParameter(dataSourceList, "dataSourceList");
        this.f139751a = dataSourceList;
        LinkedHashMap linkedHashMap = this.f139752b;
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.f139753c;
        linkedHashMap2.clear();
        List<sq0.e0> list = this.f139751a;
        if (list == null) {
            Intrinsics.r("dataSources");
            throw null;
        }
        for (sq0.e0 e0Var : list) {
            linkedHashMap.put(e0Var, Integer.valueOf(e0Var.a()));
            linkedHashMap2.put(e0Var, 0);
        }
    }

    public final void i() {
        List<sq0.e0> list = this.f139751a;
        if (list == null) {
            Intrinsics.r("dataSources");
            throw null;
        }
        for (sq0.e0 e0Var : list) {
            LinkedHashMap linkedHashMap = this.f139752b;
            Integer num = (Integer) linkedHashMap.get(e0Var);
            if ((num != null ? num.intValue() : 0) != e0Var.a()) {
                String b13 = b(e0Var);
                Integer num2 = (Integer) linkedHashMap.get(e0Var);
                int intValue = num2 != null ? num2.intValue() : 0;
                int a13 = e0Var.a();
                StringBuilder v13 = a.a.v("Datasource ", b13, " count has changed without notifying the adapter. Expected: ", intValue, " actual:");
                v13.append(a13);
                l(v13.toString());
            }
        }
    }

    public final void j(a0 a0Var, String str) {
        if (Intrinsics.d(this.f139754d, Looper.myLooper())) {
            return;
        }
        String m13 = a.a.m("RecyclerConsistencyTracker warning: datasource ", b(a0Var), " ", str, " on non-main thread");
        this.f139756f.i(m13, Thread.currentThread().getStackTrace());
        this.f139757g.G(m13, new Object[0]);
    }

    public final void k(a0 a0Var, int i13) {
        LinkedHashMap linkedHashMap = this.f139753c;
        Integer num = (Integer) linkedHashMap.get(a0Var);
        linkedHashMap.put(a0Var, Integer.valueOf((num != null ? num.intValue() : 0) + i13));
        Integer num2 = (Integer) linkedHashMap.get(a0Var);
        if ((num2 != null ? num2.intValue() : 0) == i13) {
            Handler handler = this.f139755e;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, new dp.a(20, this, a0Var)));
        }
    }

    public final void l(String str) {
        String j13 = a.a.j("RecyclerConsistencyTracker warning: ", str);
        this.f139756f.h(a.a.j("RegistryRecyclerAdapter warning: ", str));
        this.f139757g.G(j13, new Object[0]);
    }
}
