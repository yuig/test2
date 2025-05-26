package wg1;

/* loaded from: classes5.dex */
public abstract class a extends xi0.f implements af2.c {

    /* renamed from: m, reason: collision with root package name */
    public ye2.o f129718m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f129719n;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129718m == null) {
            this.f129718m = new ye2.o(this);
        }
        return this.f129718m;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129718m == null) {
            this.f129718m = new ye2.o(this);
        }
        return this.f129718m.generatedComponent();
    }
}
