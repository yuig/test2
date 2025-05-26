package gi;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class r0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65110a;

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f65110a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract byte zza();
}
