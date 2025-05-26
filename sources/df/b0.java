package df;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public String f54715a;

    /* renamed from: b, reason: collision with root package name */
    public String f54716b;

    public b0(int i13) {
        if (i13 != 1) {
            this.f54715a = "oauth/access_token";
            this.f54716b = "fb_extend_sso_token";
        } else {
            this.f54715a = "refresh_access_token";
            this.f54716b = "ig_refresh_token";
        }
    }

    public /* synthetic */ b0(String str, String str2) {
        this.f54715a = str;
        this.f54716b = str2;
    }
}
