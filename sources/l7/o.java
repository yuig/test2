package l7;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f81835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f81836c;

    public /* synthetic */ o(w wVar, v vVar, int i13) {
        this.f81834a = i13;
        this.f81835b = wVar;
        this.f81836c = vVar;
    }

    @Override // l7.y0
    public final void run() {
        int i13 = this.f81834a;
        v vVar = this.f81836c;
        w wVar = this.f81835b;
        switch (i13) {
            case 0:
                wVar.a(vVar, true);
                break;
            default:
                wVar.a(vVar, false);
                break;
        }
    }
}
