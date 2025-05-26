package oy;

/* loaded from: classes.dex */
public abstract class r0 extends ey.z1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f98177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(String str, int i13) {
        super(str);
        this.f98177e = i13;
    }

    @Override // ey.u1
    public String e() {
        switch (this.f98177e) {
            case 0:
                return l0.f98135b;
            default:
                return ty.h.f119702a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(String str, int i13, int i14) {
        this(str, 0);
        this.f98177e = i13;
        int i15 = 1;
        if (i13 != 1) {
        } else {
            this(str, i15);
        }
    }
}
