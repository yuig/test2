package o7;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f93046a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f93047b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f93048c;

    public final g a() {
        if (this.f93046a || !(this.f93047b || this.f93048c)) {
            return new g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final boolean b() {
        return (this.f93048c || this.f93047b) && this.f93046a;
    }
}
