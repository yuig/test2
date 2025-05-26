package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class fb implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public String f37641a;

    /* renamed from: d, reason: collision with root package name */
    public t82.a f37644d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37649i;

    /* renamed from: b, reason: collision with root package name */
    public List f37642b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public List f37643c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f37645e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public HashMap f37646f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f37647g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f37648h = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f37650j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f37651k = new HashSet();

    public final db a(int i13) {
        return (db) this.f37643c.get(i13);
    }

    @Override // dl1.s
    public final String b() {
        return "";
    }

    public final boolean c() {
        boolean z13;
        int i13 = this.f37650j;
        while (true) {
            i13++;
            if (i13 >= this.f37642b.size()) {
                i13 = -1;
                break;
            }
            HashMap hashMap = ((eb) this.f37642b.get(i13)).f37228g;
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            if (i13 == 0 || hashMap.isEmpty()) {
                break;
            }
            while (true) {
                z13 = true;
                for (Long l13 : hashMap.keySet()) {
                    List list = (List) hashMap.get(l13);
                    List<Long> list2 = (List) this.f37648h.get(l13);
                    if (z13 && list != null && list2 != null) {
                        boolean z14 = false;
                        for (Long l14 : list2) {
                            if (!z14) {
                                z14 = list.contains(l14);
                            }
                        }
                        if (z14) {
                            break;
                        }
                    }
                    z13 = false;
                }
            }
            if (z13) {
                break;
            }
        }
        if (i13 == -1) {
            return false;
        }
        this.f37650j = i13;
        List list3 = ((eb) this.f37642b.get(i13)).f37223b;
        if (list3 == null) {
            list3 = new ArrayList();
        }
        this.f37643c = list3;
        this.f37646f = new HashMap();
        this.f37651k.clear();
        return true;
    }
}
