package i2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f71066a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f71067b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Object f71068c;

    public a(Object obj) {
        this.f71066a = obj;
        this.f71068c = obj;
    }

    @Override // i2.f
    public final void clear() {
        this.f71067b.clear();
        this.f71068c = this.f71066a;
        ((s3.k0) ((s3.l2) this).f71066a).R();
    }

    @Override // i2.f
    public final Object e() {
        return this.f71068c;
    }

    @Override // i2.f
    public final void g(Object obj) {
        this.f71067b.add(this.f71068c);
        this.f71068c = obj;
    }

    @Override // i2.f
    public final void h() {
        ArrayList arrayList = this.f71067b;
        if (!arrayList.isEmpty()) {
            this.f71068c = arrayList.remove(arrayList.size() - 1);
        } else {
            ao2.m0.p0("empty stack");
            throw null;
        }
    }
}
