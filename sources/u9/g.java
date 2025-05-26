package u9;

/* loaded from: classes3.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f121149a;

    /* renamed from: b, reason: collision with root package name */
    public final c f121150b;

    public g(int i13, c cVar) {
        this.f121149a = i13;
        this.f121150b = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f121149a, ((g) obj).f121149a);
    }
}
