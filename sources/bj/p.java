package bj;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.q0;
import wi.e0;

/* loaded from: classes3.dex */
public final class p extends dj.e implements n {

    /* renamed from: m, reason: collision with root package name */
    public final List f22924m;

    /* renamed from: n, reason: collision with root package name */
    public final List f22925n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f22926o;

    /* renamed from: p, reason: collision with root package name */
    public final d f22927p;

    /* renamed from: q, reason: collision with root package name */
    public final wi.d f22928q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f22929r;

    /* renamed from: s, reason: collision with root package name */
    public final e f22930s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f22931t;

    /* renamed from: u, reason: collision with root package name */
    public final vi.a f22932u;

    /* renamed from: v, reason: collision with root package name */
    public final List f22933v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f22934w;

    public p(String str, String str2, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, Bundle bundle, HashSet hashSet, HashSet hashSet2, LinkedHashMap linkedHashMap2, String str3, List list, q0 q0Var, boolean z13, d dVar, wi.d dVar2, e0 e0Var, q0 q0Var2) {
        super(str, str2, linkedHashSet, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, str3);
        this.f22924m = list;
        this.f22925n = q0Var;
        this.f22926o = z13;
        this.f22927p = dVar;
        this.f22928q = dVar2;
        this.f22929r = e0Var;
        this.f22930s = null;
        this.f22931t = false;
        this.f22932u = null;
        this.f22933v = q0Var2;
        this.f22934w = false;
    }

    @Override // bj.n
    public final List a() {
        return this.f22925n;
    }

    @Override // bj.n
    public final e b() {
        return this.f22930s;
    }

    @Override // vi.d
    public final e0 c() {
        return this.f22929r;
    }

    @Override // bj.n
    public final List d() {
        return this.f22924m;
    }

    @Override // bj.n
    public final wi.d e() {
        return this.f22928q;
    }

    @Override // bj.n
    public final boolean f() {
        return this.f22931t;
    }

    @Override // vi.d
    public final boolean g() {
        return this.f22934w;
    }

    @Override // vi.d
    public final List h() {
        return this.f22933v;
    }

    @Override // bj.n
    public final boolean i() {
        return this.f22926o;
    }

    @Override // bj.n
    public final d j() {
        return this.f22927p;
    }

    @Override // vi.d
    public final vi.a k() {
        return this.f22932u;
    }
}
