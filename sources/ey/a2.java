package ey;

/* loaded from: classes.dex */
public abstract class a2 extends w1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f60427e;

    /* renamed from: f, reason: collision with root package name */
    public final String f60428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(String str, int i13) {
        super(str, 1);
        this.f60427e = i13;
        this.f60428f = str;
    }

    @Override // ey.u1
    public final String b() {
        return this.f60428f;
    }

    @Override // ey.w1, ey.u1
    public final String e() {
        switch (this.f60427e) {
            case 0:
                return "video_load";
            default:
                return "video_prepare";
        }
    }
}
