package h8;

/* loaded from: classes.dex */
public abstract class p extends f {

    /* renamed from: j, reason: collision with root package name */
    public final long f68072j;

    public p(g7.f fVar, g7.i iVar, androidx.media3.common.b bVar, int i13, Object obj, long j13, long j14, long j15) {
        super(fVar, iVar, 1, bVar, i13, obj, j13, j14);
        bVar.getClass();
        this.f68072j = j15;
    }

    public long a() {
        long j13 = this.f68072j;
        if (j13 != -1) {
            return 1 + j13;
        }
        return -1L;
    }

    public abstract boolean b();
}
