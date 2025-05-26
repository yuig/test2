package io1;

import cr1.c;
import p40.b;

/* loaded from: classes5.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f73315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73317c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f73318d = false;

    /* renamed from: e, reason: collision with root package name */
    public final String f73319e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73320f;

    /* renamed from: g, reason: collision with root package name */
    public final c f73321g;

    public a(b bVar) {
        this.f73315a = bVar.b();
        this.f73316b = bVar.getId();
        this.f73317c = bVar.a();
        this.f73319e = bVar.e();
        this.f73320f = bVar.getName();
        this.f73321g = new c(bVar);
    }

    @Override // p40.b
    public final String a() {
        return this.f73317c;
    }

    @Override // p40.b
    public final String b() {
        return this.f73315a;
    }

    @Override // p40.b
    public final Boolean c() {
        return Boolean.valueOf(this.f73318d);
    }

    @Override // p40.b
    public final p40.a d() {
        return this.f73321g;
    }

    @Override // p40.b
    public final String e() {
        return this.f73319e;
    }

    @Override // p40.b
    public final String getId() {
        return this.f73316b;
    }

    @Override // p40.b
    public final String getName() {
        return this.f73320f;
    }
}
