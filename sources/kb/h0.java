package kb;

/* loaded from: classes.dex */
public final class h0 extends so.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79001b;

    public /* synthetic */ h0(int i13) {
        this.f79001b = i13;
    }

    public final String toString() {
        switch (this.f79001b) {
            case 0:
                return "IN_PROGRESS";
            default:
                return "SUCCESS";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i13, int i14) {
        this(0);
        this.f79001b = i13;
        int i15 = 1;
        if (i13 != 1) {
        } else {
            this(i15);
        }
    }
}
