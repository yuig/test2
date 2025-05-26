package com.bugsnag.android.repackaged.dslplatform.json;

/* loaded from: classes3.dex */
public final class f extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f29505b;

    public /* synthetic */ f(k kVar, int i13) {
        this.f29504a = i13;
        this.f29505b = kVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f29504a) {
            case 0:
                return new v();
            default:
                k kVar = this.f29505b;
                kVar.getClass();
                return new t(new byte[4096], new char[64], kVar.f29528b, kVar.f29531e, kVar.f29532f, kVar.f29533g, kVar.f29534h, kVar.f29535i);
        }
    }
}
