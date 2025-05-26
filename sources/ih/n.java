package ih;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f72278d;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f72278d = bArr;
    }

    @Override // ih.m
    public final byte[] E() {
        return this.f72278d;
    }
}
