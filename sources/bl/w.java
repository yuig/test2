package bl;

/* loaded from: classes3.dex */
public abstract class w extends se.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23476b;

    public w(int i13) {
        this.f23476b = i13;
    }

    public Integer j() {
        switch (this.f23476b) {
            case 0:
                return l().j();
            default:
                return m().j();
        }
    }

    public ml.a k() {
        switch (this.f23476b) {
            case 0:
                return l().k();
            default:
                return m().k();
        }
    }

    public abstract w l();

    public abstract w m();
}
