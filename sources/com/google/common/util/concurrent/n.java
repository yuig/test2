package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pk.c1;

/* loaded from: classes3.dex */
public final class n extends i {

    /* renamed from: k, reason: collision with root package name */
    public List f33578k;

    public n(c1 c1Var) {
        super(c1Var, true, true);
        List arrayList;
        if (c1Var.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            int size = c1Var.size();
            pk.a0.C(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            arrayList.add(null);
        }
        this.f33578k = arrayList;
        J();
    }

    @Override // com.google.common.util.concurrent.i
    public final void F(int i13, Object obj) {
        List list = this.f33578k;
        if (list != null) {
            list.set(i13, new o(obj));
        }
    }

    @Override // com.google.common.util.concurrent.i
    public final void H() {
        List<o> list = this.f33578k;
        if (list != null) {
            int size = list.size();
            pk.a0.C(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (o oVar : list) {
                arrayList.add(oVar != null ? oVar.f33579a : null);
            }
            v(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // com.google.common.util.concurrent.i
    public final void L(h hVar) {
        hVar.getClass();
        this.f33566g = null;
        this.f33578k = null;
    }
}
