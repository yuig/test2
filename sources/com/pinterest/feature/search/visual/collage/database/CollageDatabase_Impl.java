package com.pinterest.feature.search.visual.collage.database;

import android.content.Context;
import ja.e0;
import ja.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oa.f;
import u71.a;
import u71.b;
import v71.c;
import w71.d;
import w71.g;
import w71.i;

/* loaded from: classes5.dex */
public final class CollageDatabase_Impl extends CollageDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile d f47939m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i f47940n;

    /* renamed from: o, reason: collision with root package name */
    public volatile g f47941o;

    @Override // ja.d0
    public final s d() {
        return new s(this, new HashMap(0), new HashMap(0), "collage_drafts", "collage_page", "collage_item");
    }

    @Override // ja.d0
    public final f e(ja.g gVar) {
        e0 callback = new e0(gVar, new b(this, 2, 0), "c38068b28b1318e569fdbd673ad2ccd6", "6614fffc6d11d88119d2b07317ac78cc");
        Context context = gVar.f75216a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return gVar.f75218c.q(new oa.d(context, gVar.f75217b, callback, false, false));
    }

    @Override // ja.d0
    public final List f(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        return arrayList;
    }

    @Override // ja.d0
    public final Set i() {
        return new HashSet();
    }

    @Override // ja.d0
    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, Arrays.asList(v71.a.class, c.class));
        hashMap.put(i.class, Arrays.asList(c.class));
        hashMap.put(g.class, Arrays.asList(c.class));
        return hashMap;
    }

    @Override // com.pinterest.feature.search.visual.collage.database.CollageDatabase
    public final d t() {
        d dVar;
        if (this.f47939m != null) {
            return this.f47939m;
        }
        synchronized (this) {
            try {
                if (this.f47939m == null) {
                    this.f47939m = new d(this);
                }
                dVar = this.f47939m;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVar;
    }

    @Override // com.pinterest.feature.search.visual.collage.database.CollageDatabase
    public final g u() {
        g gVar;
        if (this.f47941o != null) {
            return this.f47941o;
        }
        synchronized (this) {
            try {
                if (this.f47941o == null) {
                    this.f47941o = new g(this);
                }
                gVar = this.f47941o;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return gVar;
    }

    @Override // com.pinterest.feature.search.visual.collage.database.CollageDatabase
    public final i v() {
        i iVar;
        if (this.f47940n != null) {
            return this.f47940n;
        }
        synchronized (this) {
            try {
                if (this.f47940n == null) {
                    this.f47940n = new i(this);
                }
                iVar = this.f47940n;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return iVar;
    }
}
