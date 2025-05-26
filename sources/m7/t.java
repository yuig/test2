package m7;

import android.util.Base64;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements ok.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86387a;

    @Override // ok.g0
    public final Object get() {
        switch (this.f86387a) {
            case 0:
                return new n(new l8.m(true), 50000, 50000, 1000, 2000, false);
            case 1:
                byte[] bArr = new byte[12];
                n7.e0.f89419i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                throw new IllegalStateException();
        }
    }
}
