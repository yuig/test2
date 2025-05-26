package r4;

/* loaded from: classes3.dex */
public final class b extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106101a;

    public b() {
        this.f106101a = 2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f106101a) {
            case 0:
                synchronized (this) {
                }
                return this;
            case 1:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i13) {
        super(str);
        this.f106101a = i13;
    }
}
