package zm2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142191a;

    /* renamed from: b, reason: collision with root package name */
    public int f142192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f142193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f142194d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(z zVar, int i13) {
        this(zVar);
        this.f142191a = 1;
    }

    public final byte b() {
        int i13 = this.f142191a;
        z zVar = this.f142194d;
        switch (i13) {
            case 0:
                if (this.f142192b >= this.f142193c) {
                    throw new NoSuchElementException();
                }
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(zVar);
                throw null;
            default:
                try {
                    byte[] bArr = zVar.f142259b;
                    int i14 = this.f142192b;
                    this.f142192b = i14 + 1;
                    return bArr[i14];
                } catch (ArrayIndexOutOfBoundsException e13) {
                    throw new NoSuchElementException(e13.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f142191a;
        int i14 = this.f142193c;
        switch (i13) {
            case 0:
                if (this.f142192b < i14) {
                    break;
                }
                break;
            default:
                if (this.f142192b < i14) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f142191a;
        switch (i13) {
            case 0:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return Byte.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f142191a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public e(z zVar) {
        this.f142191a = 1;
        this.f142194d = zVar;
        this.f142192b = 0;
        this.f142193c = zVar.size();
    }
}
