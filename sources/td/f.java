package td;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class f implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f117379a;

    /* renamed from: b, reason: collision with root package name */
    public final e f117380b;

    public f(byte[] bArr, e eVar) {
        this.f117379a = bArr;
        this.f117380b = eVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (((bb.p) this.f117380b).f22463a) {
            case 3:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        return nd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        Object wrap;
        int i13 = ((bb.p) this.f117380b).f22463a;
        byte[] bArr = this.f117379a;
        switch (i13) {
            case 3:
                wrap = ByteBuffer.wrap(bArr);
                break;
            default:
                wrap = new ByteArrayInputStream(bArr);
                break;
        }
        dVar.f(wrap);
    }
}
