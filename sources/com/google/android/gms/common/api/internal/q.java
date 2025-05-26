package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f30857a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30858b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30859c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Object f30860d;

    public q(int[] iArr, boolean z13) {
        this.f30858b = z13;
        for (int i13 : iArr) {
            ((List) this.f30859c).add(Integer.valueOf(i13));
        }
        this.f30857a = 0;
        if (this.f30858b) {
            Collections.shuffle((List) this.f30859c);
        }
        this.f30860d = new HashMap();
    }

    public final m0 a() {
        com.bumptech.glide.d.i("execute parameter required", ((o) this.f30859c) != null);
        return new m0(this, (Feature[]) this.f30860d, this.f30858b, this.f30857a);
    }

    public final int b() {
        Object obj = this.f30859c;
        int i13 = this.f30857a;
        this.f30857a = i13 + 1;
        return ((Integer) ((List) obj).get(i13 % ((List) obj).size())).intValue();
    }
}
