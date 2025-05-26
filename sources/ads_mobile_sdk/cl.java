package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class cl extends gl {

    /* renamed from: e, reason: collision with root package name */
    public final int f3947e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3948f;

    public cl(byte[] bArr, int i13, int i14) {
        super(bArr);
        il.a(i13, i13 + i14, bArr.length);
        this.f3947e = i13;
        this.f3948f = i14;
    }

    @Override // ads_mobile_sdk.gl, ads_mobile_sdk.il
    public final void a(int i13, int i14, int i15, byte[] bArr) {
        System.arraycopy(this.f5606d, this.f3947e + i13, bArr, i14, i15);
    }

    @Override // ads_mobile_sdk.gl, ads_mobile_sdk.il
    public final byte b(int i13) {
        il.a(i13, this.f3948f);
        return this.f5606d[this.f3947e + i13];
    }

    @Override // ads_mobile_sdk.gl, ads_mobile_sdk.il
    public final byte c(int i13) {
        return this.f5606d[this.f3947e + i13];
    }

    @Override // ads_mobile_sdk.gl
    public final int g() {
        return this.f3947e;
    }

    @Override // ads_mobile_sdk.gl, ads_mobile_sdk.il
    public final int size() {
        return this.f3948f;
    }
}
