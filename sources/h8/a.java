package h8;

/* loaded from: classes.dex */
public abstract class a extends p {

    /* renamed from: k, reason: collision with root package name */
    public final long f67998k;

    /* renamed from: l, reason: collision with root package name */
    public final long f67999l;

    /* renamed from: m, reason: collision with root package name */
    public c f68000m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f68001n;

    public a(g7.f fVar, g7.i iVar, androidx.media3.common.b bVar, int i13, Object obj, long j13, long j14, long j15, long j16, long j17) {
        super(fVar, iVar, bVar, i13, obj, j13, j14, j17);
        this.f67998k = j15;
        this.f67999l = j16;
    }

    public final int c(int i13) {
        int[] iArr = this.f68001n;
        bf.b.w(iArr);
        return iArr[i13];
    }
}
