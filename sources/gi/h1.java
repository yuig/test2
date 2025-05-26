package gi;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class h1 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public int f65071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f65073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var) {
        super(1);
        this.f65073d = j1Var;
        this.f65071b = 0;
        this.f65072c = j1Var.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65071b < this.f65072c;
    }

    @Override // gi.r0
    public final byte zza() {
        int i13 = this.f65071b;
        if (i13 >= this.f65072c) {
            throw new NoSuchElementException();
        }
        this.f65071b = i13 + 1;
        return this.f65073d.e(i13);
    }
}
