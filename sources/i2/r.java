package i2;

/* loaded from: classes.dex */
public final class r implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71255b;

    public /* synthetic */ r(Object obj, int i13) {
        this.f71254a = i13;
        this.f71255b = obj;
    }

    public final void a() {
        int i13 = this.f71254a;
        Object obj = this.f71255b;
        switch (i13) {
            case 0:
                s sVar = (s) obj;
                sVar.f71290z--;
                break;
            default:
                s2.v vVar = (s2.v) obj;
                vVar.f110694j--;
                break;
        }
    }

    public final void b() {
        int i13 = this.f71254a;
        Object obj = this.f71255b;
        switch (i13) {
            case 0:
                ((s) obj).f71290z++;
                break;
            default:
                ((s2.v) obj).f110694j++;
                break;
        }
    }
}
