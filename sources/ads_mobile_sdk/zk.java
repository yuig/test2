package ads_mobile_sdk;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zk extends a.r {

    /* renamed from: a, reason: collision with root package name */
    public int f14805a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f14806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ il f14807c;

    public zk(il ilVar) {
        this.f14807c = ilVar;
        this.f14806b = ilVar.size();
    }

    @Override // a.g2
    public final byte a() {
        int i13 = this.f14805a;
        if (i13 >= this.f14806b) {
            throw new NoSuchElementException();
        }
        this.f14805a = i13 + 1;
        return this.f14807c.c(i13);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14805a < this.f14806b;
    }
}
