package a7;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.b f1198a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1199b;

    public s(androidx.media3.common.b bVar, long j13) {
        bf.b.h("format colorInfo must be set", bVar.C != null);
        int i13 = bVar.f18772v;
        bf.b.h("format width must be positive, but is: " + i13, i13 > 0);
        int i14 = bVar.f18773w;
        bf.b.h("format height must be positive, but is: " + i14, i14 > 0);
        this.f1198a = bVar;
        this.f1199b = j13;
    }
}
