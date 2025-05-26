package androidx.work.impl;

import android.content.Context;
import ja.e0;
import ja.g;
import ja.s;
import java.util.ArrayList;
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
import oa.d;
import oa.f;
import tb.a0;
import tb.b;
import tb.c;
import tb.e;
import tb.i;
import tb.l;
import tb.o;
import tb.y;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile y f20005m;

    /* renamed from: n, reason: collision with root package name */
    public volatile c f20006n;

    /* renamed from: o, reason: collision with root package name */
    public volatile a0 f20007o;

    /* renamed from: p, reason: collision with root package name */
    public volatile i f20008p;

    /* renamed from: q, reason: collision with root package name */
    public volatile l f20009q;

    /* renamed from: r, reason: collision with root package name */
    public volatile o f20010r;

    /* renamed from: s, reason: collision with root package name */
    public volatile e f20011s;

    @Override // ja.d0
    public final s d() {
        return new s(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // ja.d0
    public final f e(g gVar) {
        e0 callback = new e0(gVar, new h0(this, 23, 0), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0");
        Context context = gVar.f75216a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return gVar.f75218c.q(new d(context, gVar.f75217b, callback, false, false));
    }

    @Override // ja.d0
    public final List f(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f0(0));
        arrayList.add(new g0(0));
        arrayList.add(new f0(1));
        arrayList.add(new f0(2));
        arrayList.add(new f0(3));
        arrayList.add(new g0(1));
        arrayList.add(new f0(4));
        arrayList.add(new f0(5));
        return arrayList;
    }

    @Override // ja.d0
    public final Set i() {
        return new HashSet();
    }

    @Override // ja.d0
    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(y.class, Collections.emptyList());
        hashMap.put(c.class, Collections.emptyList());
        hashMap.put(a0.class, Collections.emptyList());
        hashMap.put(i.class, Collections.emptyList());
        hashMap.put(l.class, Collections.emptyList());
        hashMap.put(o.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(tb.f.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c t() {
        c cVar;
        if (this.f20006n != null) {
            return this.f20006n;
        }
        synchronized (this) {
            try {
                if (this.f20006n == null) {
                    c cVar2 = new c();
                    cVar2.f116959a = this;
                    cVar2.f116960b = new b(cVar2, this, 0);
                    this.f20006n = cVar2;
                }
                cVar = this.f20006n;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e u() {
        e eVar;
        if (this.f20011s != null) {
            return this.f20011s;
        }
        synchronized (this) {
            try {
                if (this.f20011s == null) {
                    e eVar2 = new e();
                    eVar2.f116963a = this;
                    eVar2.f116964b = new b(eVar2, this, 1);
                    this.f20011s = eVar2;
                }
                eVar = this.f20011s;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i v() {
        i iVar;
        if (this.f20008p != null) {
            return this.f20008p;
        }
        synchronized (this) {
            try {
                if (this.f20008p == null) {
                    this.f20008p = new i(this);
                }
                iVar = this.f20008p;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l w() {
        l lVar;
        if (this.f20009q != null) {
            return this.f20009q;
        }
        synchronized (this) {
            try {
                if (this.f20009q == null) {
                    this.f20009q = new l(this, 0);
                }
                lVar = this.f20009q;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o x() {
        o oVar;
        if (this.f20010r != null) {
            return this.f20010r;
        }
        synchronized (this) {
            try {
                if (this.f20010r == null) {
                    this.f20010r = new o(this);
                }
                oVar = this.f20010r;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final y y() {
        y yVar;
        if (this.f20005m != null) {
            return this.f20005m;
        }
        synchronized (this) {
            try {
                if (this.f20005m == null) {
                    this.f20005m = new y(this);
                }
                yVar = this.f20005m;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return yVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a0 z() {
        a0 a0Var;
        if (this.f20007o != null) {
            return this.f20007o;
        }
        synchronized (this) {
            try {
                if (this.f20007o == null) {
                    this.f20007o = new a0(this);
                }
                a0Var = this.f20007o;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return a0Var;
    }
}
