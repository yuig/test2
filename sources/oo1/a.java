package oo1;

import java.util.List;

/* loaded from: classes5.dex */
public final class a implements z40.n {

    /* renamed from: a, reason: collision with root package name */
    public final String f96818a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96819b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96820c;

    /* renamed from: d, reason: collision with root package name */
    public final List f96821d;

    /* renamed from: e, reason: collision with root package name */
    public final int f96822e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f96823f;

    /* renamed from: g, reason: collision with root package name */
    public final List f96824g;

    /* renamed from: h, reason: collision with root package name */
    public final z40.m f96825h;

    /* renamed from: i, reason: collision with root package name */
    public final z40.h f96826i;

    /* renamed from: j, reason: collision with root package name */
    public final String f96827j;

    public a(z40.n nVar) {
        this.f96818a = nVar.b();
        this.f96819b = nVar.getId();
        this.f96820c = nVar.a();
        this.f96821d = nVar.h();
        this.f96823f = nVar.c();
        this.f96824g = nVar.f();
        this.f96825h = nVar.g();
        this.f96826i = nVar.d();
        this.f96827j = nVar.e();
    }

    @Override // z40.t
    public final String a() {
        return this.f96820c;
    }

    @Override // z40.n
    public final String b() {
        return this.f96818a;
    }

    @Override // z40.n
    public final Boolean c() {
        return this.f96823f;
    }

    @Override // z40.n
    public final z40.h d() {
        return this.f96826i;
    }

    @Override // z40.n
    public final String e() {
        return this.f96827j;
    }

    @Override // z40.n
    public final List f() {
        return this.f96824g;
    }

    @Override // z40.n
    public final z40.m g() {
        return this.f96825h;
    }

    @Override // z40.n
    public final String getId() {
        return this.f96819b;
    }

    @Override // z40.n
    public final List h() {
        return this.f96821d;
    }

    @Override // z40.n
    public final Integer i() {
        return Integer.valueOf(this.f96822e);
    }
}
