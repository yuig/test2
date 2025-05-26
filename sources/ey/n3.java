package ey;

/* loaded from: classes.dex */
public abstract class n3 extends s3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f60543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(boolean z13, int i13) {
        super(z13);
        this.f60543d = i13;
    }

    @Override // ey.s3, ey.u1
    public final String e() {
        switch (this.f60543d) {
            case 0:
                return "profile_api_request";
            case 1:
                return "profile_avatar";
            default:
                return "profile_boards";
        }
    }

    @Override // ey.u1
    public final String g() {
        switch (this.f60543d) {
        }
        return super.e();
    }
}
