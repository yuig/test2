package pu0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final z f101421a;

    /* renamed from: b, reason: collision with root package name */
    public final List f101422b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f101423c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f101424d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f101425e;

    public s(z type, List items, boolean z13) {
        Object obj;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f101421a = type;
        this.f101422b = items;
        this.f101423c = z13;
        Iterator it = items.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((r) obj).e()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        List list = this.f101422b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof p) {
                arrayList.add(obj2);
            }
        }
        this.f101424d = arrayList;
        List list2 = this.f101422b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof q) {
                arrayList2.add(obj3);
            }
        }
        this.f101425e = arrayList2;
    }

    public static s a(s sVar, ArrayList items) {
        z type = sVar.f101421a;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        return new s(type, items, true);
    }

    public final List b() {
        return this.f101422b;
    }

    public final z c() {
        return this.f101421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f101421a == sVar.f101421a && Intrinsics.d(this.f101422b, sVar.f101422b) && this.f101423c == sVar.f101423c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101423c) + ep.b.c(this.f101422b, this.f101421a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OverlayTransitionSelectionState(type=");
        sb3.append(this.f101421a);
        sb3.append(", items=");
        sb3.append(this.f101422b);
        sb3.append(", isDoneEnabled=");
        return a.a.r(sb3, this.f101423c, ")");
    }
}
