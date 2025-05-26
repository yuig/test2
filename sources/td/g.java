package td;

/* loaded from: classes3.dex */
public final class g implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117388a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f117389b;

    public /* synthetic */ g(Object obj, int i13) {
        this.f117388a = i13;
        this.f117389b = obj;
    }

    @Override // td.c0
    public final boolean a(Object obj) {
        switch (this.f117388a) {
            case 0:
                return true;
            default:
                return obj.toString().startsWith("data:image");
        }
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        int i15 = this.f117388a;
        Object obj2 = this.f117389b;
        switch (i15) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new b0(new ge.d(bArr), new f(bArr, (e) obj2));
            default:
                return new b0(new ge.d(obj), new j(0, obj.toString(), (rd.j) obj2));
        }
    }
}
