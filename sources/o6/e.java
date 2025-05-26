package o6;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i f92919a;

    /* renamed from: b, reason: collision with root package name */
    public final j f92920b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f92921c = true;

    public e(i iVar, j jVar) {
        this.f92919a = iVar;
        this.f92920b = jVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f92919a);
        sb3.append(" ");
        sb3.append(!this.f92921c ? "+>" : "->");
        sb3.append(" ");
        sb3.append(this.f92920b);
        return sb3.toString();
    }
}
