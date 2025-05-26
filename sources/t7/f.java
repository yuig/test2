package t7;

import java.util.Arrays;
import lb.l0;

/* loaded from: classes3.dex */
public final class f extends h8.f {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f116473j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f116474k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f116475l;

    @Override // l8.u
    public final void h() {
        try {
            this.f68031i.d(this.f68024b);
            int i13 = 0;
            int i14 = 0;
            while (i13 != -1 && !this.f116474k) {
                byte[] bArr = this.f116473j;
                if (bArr.length < i14 + 16384) {
                    this.f116473j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i13 = this.f68031i.read(this.f116473j, i14, 16384);
                if (i13 != -1) {
                    i14 += i13;
                }
            }
            if (!this.f116474k) {
                this.f116475l = Arrays.copyOf(this.f116473j, i14);
            }
            l0.H(this.f68031i);
        } catch (Throwable th3) {
            l0.H(this.f68031i);
            throw th3;
        }
    }

    @Override // l8.u
    public final void o() {
        this.f116474k = true;
    }
}
