package m7;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements ok.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f86437b;

    public /* synthetic */ v(Object obj, int i13) {
        this.f86436a = i13;
        this.f86437b = obj;
    }

    @Override // ok.g0
    public final Object get() {
        int i13 = this.f86436a;
        Object obj = this.f86437b;
        switch (i13) {
            case 0:
                return (w0) obj;
            case 1:
                return (l8.e) obj;
            case 2:
                return (k8.y) obj;
            case 3:
                return (g8.d0) obj;
            case 4:
                return (q) obj;
            default:
                try {
                    return (g8.d0) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e13) {
                    throw new IllegalStateException(e13);
                }
        }
    }
}
