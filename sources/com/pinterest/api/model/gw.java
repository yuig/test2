package com.pinterest.api.model;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class gw {

    /* renamed from: a, reason: collision with root package name */
    public et f38162a;

    /* renamed from: b, reason: collision with root package name */
    public x9 f38163b;

    /* renamed from: c, reason: collision with root package name */
    public lz0 f38164c;

    private gw() {
    }

    public /* synthetic */ gw(int i13) {
        this();
    }

    public static void a(String str) {
        k8 k8Var;
        String str2;
        Iterator it = ew.f37371o.snapshot().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                k8Var = null;
                break;
            }
            k8Var = (k8) it.next();
            if (str.equals(k8Var.f39332b) && k8Var.getIsAcceptable()) {
                break;
            }
        }
        if (k8Var == null || (str2 = k8Var.f39332b) == null) {
            return;
        }
        LruCache lruCache = ew.f37371o;
        synchronized (lruCache) {
            lruCache.remove(str2);
        }
    }

    public static v7 b(String str) {
        if (str == null) {
            return null;
        }
        return ew.a(str);
    }

    public static ArrayList c(List list) {
        zs zsVar;
        if (list == null || list.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                LruCache lruCache = ew.f37357a;
                zsVar = null;
            } else {
                zsVar = (zs) ew.f37361e.get(str);
            }
            if (zsVar != null) {
                arrayList.add(zsVar);
            }
        }
        return arrayList.size() == list.size() ? arrayList : new ArrayList();
    }

    public static f30 d(String str) {
        if (str != null) {
            return ew.c(str);
        }
        return null;
    }

    public static ArrayList e(List list, boolean z13) {
        if (list == null || list.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f30 c13 = ew.c(str);
            if (c13 != null) {
                arrayList.add(c13);
            } else if (z13) {
                e30 r33 = f30.r3();
                r33.x2(str);
                arrayList.add(r33.a());
            }
        }
        return arrayList.size() == list.size() ? arrayList : new ArrayList();
    }

    public static void f(vh vhVar) {
        LruCache lruCache = ew.f37357a;
        if (vhVar.getF39332b() == null) {
            return;
        }
        LruCache lruCache2 = ew.f37362f;
        synchronized (lruCache2) {
            lruCache2.put(vhVar.getF39332b(), vhVar);
        }
    }
}
