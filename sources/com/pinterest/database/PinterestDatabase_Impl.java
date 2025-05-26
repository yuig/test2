package com.pinterest.database;

import ae0.e;
import android.content.Context;
import ce0.a;
import ja.e0;
import ja.g;
import ja.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lb.f0;
import lb.g0;
import lb.h0;
import xd0.f;
import xd0.h;
import zd0.d;

/* loaded from: classes.dex */
public final class PinterestDatabase_Impl extends PinterestDatabase {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f44827q = 0;

    /* renamed from: m, reason: collision with root package name */
    public volatile f f44828m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e f44829n;

    /* renamed from: o, reason: collision with root package name */
    public volatile d f44830o;

    /* renamed from: p, reason: collision with root package name */
    public volatile a f44831p;

    @Override // ja.d0
    public final s d() {
        return new s(this, new HashMap(0), new HashMap(0), "idea_pin_font", "idea_pin_drafts", "idea_pin_recently_used_content", "network_speed");
    }

    @Override // ja.d0
    public final oa.f e(g gVar) {
        e0 callback = new e0(gVar, new h0(this, 13, 1), "bbfbd7ca46a44b6d1e8249b9365b3a0a", "4fee745d7dd12a458a22f024cae6a6b0");
        Context context = gVar.f75216a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return gVar.f75218c.q(new oa.d(context, gVar.f75217b, callback, false, false));
    }

    @Override // ja.d0
    public final List f(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g0(3));
        arrayList.add(new f0(7));
        arrayList.add(new f0(8));
        arrayList.add(new g0(4));
        arrayList.add(new f0(9));
        arrayList.add(new f0(10));
        arrayList.add(new g0(2));
        arrayList.add(new f0(6));
        return arrayList;
    }

    @Override // ja.d0
    public final Set i() {
        return new HashSet();
    }

    @Override // ja.d0
    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(f.class, Arrays.asList(h.class));
        hashMap.put(ae0.a.class, Collections.emptyList());
        hashMap.put(d.class, Collections.emptyList());
        hashMap.put(a.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.pinterest.database.PinterestDatabase
    public final d t() {
        d dVar;
        if (this.f44830o != null) {
            return this.f44830o;
        }
        synchronized (this) {
            try {
                if (this.f44830o == null) {
                    this.f44830o = new d(this);
                }
                dVar = this.f44830o;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVar;
    }

    @Override // com.pinterest.database.PinterestDatabase
    public final f u() {
        f fVar;
        if (this.f44828m != null) {
            return this.f44828m;
        }
        synchronized (this) {
            try {
                if (this.f44828m == null) {
                    this.f44828m = new f(this);
                }
                fVar = this.f44828m;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return fVar;
    }

    @Override // com.pinterest.database.PinterestDatabase
    public final ae0.a v() {
        e eVar;
        if (this.f44829n != null) {
            return this.f44829n;
        }
        synchronized (this) {
            try {
                if (this.f44829n == null) {
                    this.f44829n = new e(this);
                }
                eVar = this.f44829n;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return eVar;
    }

    @Override // com.pinterest.database.PinterestDatabase
    public final a w() {
        a aVar;
        if (this.f44831p != null) {
            return this.f44831p;
        }
        synchronized (this) {
            try {
                if (this.f44831p == null) {
                    this.f44831p = new a(this);
                }
                aVar = this.f44831p;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return aVar;
    }
}
