package dp2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f56044a;

    /* renamed from: b, reason: collision with root package name */
    public int f56045b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f56046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f56047d;

    public f(g gVar) {
        this.f56047d = gVar;
        gVar.f56050c++;
        this.f56044a = gVar.f56048a.size();
    }

    public final void b() {
        if (this.f56046c) {
            return;
        }
        this.f56046c = true;
        g gVar = this.f56047d;
        int i13 = gVar.f56050c - 1;
        gVar.f56050c = i13;
        if (i13 <= 0 && gVar.f56052e) {
            gVar.f56052e = false;
            gVar.c();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13;
        g gVar = this.f56047d;
        if (gVar.f56053f) {
            gVar.f56049b.getClass();
        }
        int i14 = this.f56045b;
        while (true) {
            i13 = this.f56044a;
            if (i14 >= i13 || gVar.f56048a.get(i14) != null) {
                break;
            }
            i14++;
        }
        if (i14 < i13) {
            return true;
        }
        b();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13;
        ArrayList arrayList;
        g gVar = this.f56047d;
        if (gVar.f56053f) {
            gVar.f56049b.getClass();
        }
        while (true) {
            int i14 = this.f56045b;
            i13 = this.f56044a;
            arrayList = gVar.f56048a;
            if (i14 >= i13 || arrayList.get(i14) != null) {
                break;
            }
            this.f56045b++;
        }
        int i15 = this.f56045b;
        if (i15 < i13) {
            this.f56045b = i15 + 1;
            return arrayList.get(i15);
        }
        b();
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
