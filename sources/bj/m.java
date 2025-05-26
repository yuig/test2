package bj;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.q0;
import wi.e0;

/* loaded from: classes3.dex */
public final class m extends wi.h implements vi.d, n {

    /* renamed from: l, reason: collision with root package name */
    public final List f22907l;

    /* renamed from: m, reason: collision with root package name */
    public final List f22908m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f22909n;

    /* renamed from: o, reason: collision with root package name */
    public final d f22910o;

    /* renamed from: p, reason: collision with root package name */
    public final wi.d f22911p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f22912q;

    /* renamed from: r, reason: collision with root package name */
    public final e f22913r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f22914s;

    /* renamed from: t, reason: collision with root package name */
    public final vi.a f22915t;

    /* renamed from: u, reason: collision with root package name */
    public final List f22916u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f22917v;

    public m(String str, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, Bundle bundle, HashSet hashSet, HashSet hashSet2, LinkedHashMap linkedHashMap2, String str2, List list, q0 q0Var, d dVar, wi.d dVar2, e0 e0Var, q0 q0Var2) {
        super(str, linkedHashSet, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, str2);
        this.f22907l = list;
        this.f22908m = q0Var;
        this.f22909n = false;
        this.f22910o = dVar;
        this.f22911p = dVar2;
        this.f22912q = e0Var;
        this.f22913r = null;
        this.f22914s = false;
        this.f22915t = null;
        this.f22916u = q0Var2;
        this.f22917v = false;
    }

    @Override // bj.n
    public final List a() {
        return this.f22908m;
    }

    @Override // bj.n
    public final e b() {
        return this.f22913r;
    }

    @Override // vi.d
    public final e0 c() {
        return this.f22912q;
    }

    @Override // bj.n
    public final List d() {
        return this.f22907l;
    }

    @Override // bj.n
    public final wi.d e() {
        return this.f22911p;
    }

    @Override // bj.n
    public final boolean f() {
        return this.f22914s;
    }

    @Override // vi.d
    public final boolean g() {
        return this.f22917v;
    }

    @Override // vi.d
    public final List h() {
        return this.f22916u;
    }

    @Override // bj.n
    public final boolean i() {
        return this.f22909n;
    }

    @Override // bj.n
    public final d j() {
        return this.f22910o;
    }

    @Override // vi.d
    public final vi.a k() {
        return this.f22915t;
    }
}
