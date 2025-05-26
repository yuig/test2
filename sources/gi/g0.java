package gi;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class g0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f65068c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Object f65069b;

    public g0(Object obj) {
        super(0);
        this.f65069b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65069b != f65068c;
    }

    @Override // gi.r0, java.util.Iterator
    public final Object next() {
        Object obj = this.f65069b;
        Object obj2 = f65068c;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f65069b = obj2;
        return obj;
    }
}
