package jk2;

/* loaded from: classes2.dex */
public final class v0 extends ek2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76720a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f76721b;

    /* renamed from: c, reason: collision with root package name */
    public int f76722c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f76723d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f76724e;

    public v0(uj2.v vVar, Object[] objArr) {
        this.f76720a = vVar;
        this.f76721b = objArr;
    }

    @Override // dk2.i
    public final void clear() {
        this.f76722c = this.f76721b.length;
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76724e = true;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76724e;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f76722c == this.f76721b.length;
    }

    @Override // dk2.i
    public final Object poll() {
        int i13 = this.f76722c;
        Object[] objArr = this.f76721b;
        if (i13 == objArr.length) {
            return null;
        }
        this.f76722c = i13 + 1;
        Object obj = objArr[i13];
        ck2.i.b(obj, "The array element is null");
        return obj;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        this.f76723d = true;
        return 1;
    }
}
