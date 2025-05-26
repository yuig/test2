package xf2;

/* loaded from: classes4.dex */
public abstract class c0 implements j0 {

    /* renamed from: a */
    public final d0 f134851a = new d0("type", false, 14);

    /* renamed from: b */
    public final String f134852b;

    /* renamed from: c */
    public final r0 f134853c;

    public c0(String str, String str2) {
        String concat;
        this.f134852b = str.concat((str2 == null || (concat = ".".concat(str2)) == null) ? "" : concat);
        this.f134853c = r0.DEFAULT;
    }

    public r0 a() {
        return this.f134853c;
    }

    @Override // xf2.j0
    public final d0 getKey() {
        return this.f134851a;
    }

    @Override // xf2.j0
    public final String getValue() {
        return this.f134852b;
    }
}
