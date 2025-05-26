package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name */
    public int f31776a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f31777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f31778c;

    public p(u uVar) {
        this.f31778c = uVar;
        this.f31777b = uVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31776a < this.f31777b;
    }
}
