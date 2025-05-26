package oo2;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96895a;

    /* renamed from: b, reason: collision with root package name */
    public int f96896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f96897c;

    public i(g gVar, int i13) {
        this.f96895a = i13;
        if (i13 != 1) {
            this.f96897c = gVar;
            this.f96896b = gVar.e();
        } else {
            this.f96897c = gVar;
            this.f96896b = gVar.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f96895a) {
            case 0:
                if (this.f96896b > 0) {
                    break;
                }
                break;
            default:
                if (this.f96896b > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f96895a;
        g gVar = this.f96897c;
        switch (i13) {
            case 0:
                int e13 = gVar.e();
                int i14 = this.f96896b;
                this.f96896b = i14 - 1;
                return gVar.h(e13 - i14);
            default:
                int e14 = gVar.e();
                int i15 = this.f96896b;
                this.f96896b = i15 - 1;
                return gVar.f(e14 - i15);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f96895a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
