package ey;

/* loaded from: classes.dex */
public abstract class x1 extends w1 implements g2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f60621e;

    /* renamed from: f, reason: collision with root package name */
    public final String f60622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(String str, int i13) {
        super(str, 0);
        this.f60621e = i13;
        this.f60622f = str;
    }

    @Override // ey.u1
    public final String b() {
        return this.f60622f;
    }

    @Override // ey.w1, ey.u1
    public String e() {
        switch (this.f60621e) {
            case 0:
                return "prefetch_image";
            default:
                return "load_pin_cell_image";
        }
    }
}
