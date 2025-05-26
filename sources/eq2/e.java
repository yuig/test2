package eq2;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public d f59943a;

    public abstract d a();

    public final synchronized d b() {
        try {
            if (this.f59943a == null) {
                this.f59943a = a();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f59943a;
    }
}
