package z7;

import androidx.media3.exoplayer.offline.DownloadRequest;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public final DownloadRequest f140908a;

    /* renamed from: b */
    public final int f140909b;

    /* renamed from: c */
    public final long f140910c;

    /* renamed from: d */
    public final long f140911d;

    /* renamed from: e */
    public final long f140912e;

    /* renamed from: f */
    public final int f140913f;

    /* renamed from: g */
    public final int f140914g;

    /* renamed from: h */
    public final j f140915h;

    public d(DownloadRequest downloadRequest, int i13, long j13, long j14, int i14) {
        this(downloadRequest, i13, j13, j14, -1L, i14, 0, new j());
    }

    public d(DownloadRequest downloadRequest, int i13, long j13, long j14, long j15, int i14, int i15, j jVar) {
        jVar.getClass();
        bf.b.i((i15 == 0) == (i13 != 4));
        if (i14 != 0) {
            bf.b.i((i13 == 2 || i13 == 0) ? false : true);
        }
        this.f140908a = downloadRequest;
        this.f140909b = i13;
        this.f140910c = j13;
        this.f140911d = j14;
        this.f140912e = j15;
        this.f140913f = i14;
        this.f140914g = i15;
        this.f140915h = jVar;
    }
}
