package qm2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.collections.t0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import q5.x0;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f104434a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f104435b;

    /* renamed from: c, reason: collision with root package name */
    public Pair f104436c;

    public o(qq2.c cVar, String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        this.f104434a = functionName;
        this.f104435b = new ArrayList();
        this.f104436c = new Pair("V", null);
    }

    public final void a(String type, c... qualifiers) {
        q qVar;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        ArrayList arrayList = this.f104435b;
        if (qualifiers.length == 0) {
            qVar = null;
        } else {
            t0 g03 = c0.g0(qualifiers);
            int a13 = y0.a(g0.q(g03, 10));
            if (a13 < 16) {
                a13 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
            Iterator it = g03.iterator();
            while (true) {
                x0 x0Var = (x0) it;
                if (!x0Var.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) x0Var.next();
                linkedHashMap.put(Integer.valueOf(indexedValue.f80349a), (c) indexedValue.f80350b);
            }
            qVar = new q(linkedHashMap);
        }
        arrayList.add(new Pair(type, qVar));
    }

    public final void b(gn2.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String desc = type.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
        this.f104436c = new Pair(desc, null);
    }

    public final void c(String type, c... qualifiers) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        t0 g03 = c0.g0(qualifiers);
        int a13 = y0.a(g0.q(g03, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        Iterator it = g03.iterator();
        while (true) {
            x0 x0Var = (x0) it;
            if (!x0Var.hasNext()) {
                this.f104436c = new Pair(type, new q(linkedHashMap));
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) x0Var.next();
                linkedHashMap.put(Integer.valueOf(indexedValue.f80349a), (c) indexedValue.f80350b);
            }
        }
    }
}
