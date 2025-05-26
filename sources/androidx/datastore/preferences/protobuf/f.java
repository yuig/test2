package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public int f18061a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f18062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f18063c;

    public f(i iVar) {
        this.f18063c = iVar;
        this.f18062b = iVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18061a < this.f18062b;
    }
}
