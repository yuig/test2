package k7;

import android.media.MediaCodec;
import d7.n0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f78442a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f78443b;

    /* renamed from: c, reason: collision with root package name */
    public int f78444c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f78445d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f78446e;

    /* renamed from: f, reason: collision with root package name */
    public int f78447f;

    /* renamed from: g, reason: collision with root package name */
    public int f78448g;

    /* renamed from: h, reason: collision with root package name */
    public int f78449h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f78450i;

    /* renamed from: j, reason: collision with root package name */
    public final b f78451j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f78450i = cryptoInfo;
        this.f78451j = n0.f53866a >= 24 ? new b(cryptoInfo) : null;
    }

    public final void a(int i13) {
        if (i13 == 0) {
            return;
        }
        if (this.f78445d == null) {
            int[] iArr = new int[1];
            this.f78445d = iArr;
            this.f78450i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f78445d;
        iArr2[0] = iArr2[0] + i13;
    }
}
