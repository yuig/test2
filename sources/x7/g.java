package x7;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g extends k7.e {

    /* renamed from: k, reason: collision with root package name */
    public long f134039k;

    /* renamed from: l, reason: collision with root package name */
    public int f134040l;

    /* renamed from: m, reason: collision with root package name */
    public int f134041m;

    @Override // k7.e
    public final void n() {
        super.n();
        this.f134040l = 0;
    }

    public final boolean r(k7.e eVar) {
        ByteBuffer byteBuffer;
        bf.b.i(!eVar.i(1073741824));
        bf.b.i(!eVar.i(268435456));
        bf.b.i(!eVar.i(4));
        if (s()) {
            if (this.f134040l >= this.f134041m) {
                return false;
            }
            ByteBuffer byteBuffer2 = eVar.f78454e;
            if (byteBuffer2 != null && (byteBuffer = this.f78454e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i13 = this.f134040l;
        this.f134040l = i13 + 1;
        if (i13 == 0) {
            this.f78456g = eVar.f78456g;
            if (eVar.i(1)) {
                this.f57530b = 1;
            }
        }
        ByteBuffer byteBuffer3 = eVar.f78454e;
        if (byteBuffer3 != null) {
            p(byteBuffer3.remaining());
            this.f78454e.put(byteBuffer3);
        }
        this.f134039k = eVar.f78456g;
        return true;
    }

    public final boolean s() {
        return this.f134040l > 0;
    }
}
