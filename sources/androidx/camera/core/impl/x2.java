package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x2 {

    /* renamed from: a */
    public final String f16994a;

    /* renamed from: b */
    public Map f16995b;

    public x2(String str, int i13) {
        if (i13 != 2) {
            this.f16995b = new LinkedHashMap();
            this.f16994a = str;
        } else {
            this.f16995b = null;
            this.f16994a = str;
        }
    }

    public vl.b a() {
        return new vl.b(this.f16994a, this.f16995b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f16995b)));
    }

    public n2 b() {
        n2 n2Var = new n2();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f16995b.entrySet()) {
            w2 w2Var = (w2) entry.getValue();
            if (w2Var.f16988e) {
                n2Var.a(w2Var.f16984a);
                arrayList.add((String) entry.getKey());
            }
        }
        kh2.m0.p("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f16994a);
        return n2Var;
    }

    public Collection c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f16995b.entrySet()) {
            if (((w2) entry.getValue()).f16988e) {
                arrayList.add(((w2) entry.getValue()).f16984a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f16995b.entrySet()) {
            if (((w2) entry.getValue()).f16988e) {
                arrayList.add(((w2) entry.getValue()).f16985b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public boolean e(String str) {
        if (this.f16995b.containsKey(str)) {
            return ((w2) this.f16995b.get(str)).f16988e;
        }
        return false;
    }

    public void f(String str) {
        if (this.f16995b.containsKey(str)) {
            w2 w2Var = (w2) this.f16995b.get(str);
            w2Var.f16989f = false;
            if (w2Var.f16988e) {
                return;
            }
            this.f16995b.remove(str);
        }
    }

    public void g(String str, o2 o2Var, z2 z2Var, k kVar, List list) {
        if (this.f16995b.containsKey(str)) {
            w2 w2Var = new w2(o2Var, z2Var, kVar, list);
            w2 w2Var2 = (w2) this.f16995b.get(str);
            w2Var.f16988e = w2Var2.f16988e;
            w2Var.f16989f = w2Var2.f16989f;
            this.f16995b.put(str, w2Var);
        }
    }

    public void h(yl.a aVar) {
        if (this.f16995b == null) {
            this.f16995b = new HashMap();
        }
        this.f16995b.put(yl.e.class, aVar);
    }

    public /* synthetic */ x2(String str, Map map) {
        this.f16994a = str;
        this.f16995b = map;
    }

    public x2(String str) {
        this.f16994a = str;
    }
}
