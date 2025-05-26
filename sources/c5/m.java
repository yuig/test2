package c5;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25821a;

    /* renamed from: b, reason: collision with root package name */
    public int f25822b;

    public final void a() {
        if (!this.f25821a) {
            this.f25821a = true;
            this.f25822b = 2049654618;
        } else {
            if (this.f25822b == 2049654618) {
                return;
            }
            throw new IllegalArgumentException("Given job ID 2049654618 is different than previous " + this.f25822b);
        }
    }
}
