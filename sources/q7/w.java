package q7;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102692c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w() {
        this("https://notify.bugsnag.com", "https://sessions.bugsnag.com", 2);
        this.f102690a = 2;
    }

    public final String toString() {
        switch (this.f102690a) {
            case 0:
                return this.f102691b + ", " + this.f102692c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w(String str, String str2, int i13) {
        this.f102690a = i13;
        this.f102691b = str;
        this.f102692c = str2;
    }
}
