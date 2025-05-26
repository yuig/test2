package w;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f126937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f126938c;

    public /* synthetic */ r(s sVar, String str, int i13) {
        this.f126936a = i13;
        this.f126937b = sVar;
        this.f126938c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f126936a;
        String str = this.f126938c;
        s sVar = this.f126937b;
        switch (i13) {
            case 0:
                sVar.f126940b.onCameraAvailable(str);
                break;
            default:
                sVar.f126940b.onCameraUnavailable(str);
                break;
        }
    }
}
