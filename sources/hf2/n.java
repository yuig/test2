package hf2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements mp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final e f69056a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69057b;

    /* renamed from: c, reason: collision with root package name */
    public final mp2.a f69058c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f69059d;

    public n(e client, kq0.b bVar) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f69056a = client;
        this.f69058c = bVar;
        this.f69059d = new Object();
    }

    @Override // mp2.c
    public final mp2.b a() {
        return this.f69056a;
    }

    public final void b() {
        synchronized (this.f69059d) {
            this.f69059d.notifyAll();
            mp2.a aVar = this.f69058c;
            if (aVar != null) {
                aVar.a(this);
                Unit unit = Unit.f80348a;
            }
        }
    }
}
