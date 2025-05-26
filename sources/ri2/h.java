package ri2;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108410a;

    /* renamed from: b, reason: collision with root package name */
    public int f108411b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f108412c;

    public /* synthetic */ h(Object obj, int i13) {
        this.f108410a = i13;
        this.f108412c = obj;
        this.f108411b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f108410a;
        Object obj = this.f108412c;
        switch (i13) {
            case 0:
                if (this.f108411b < ((i) obj).f108413a.f108415a.size()) {
                    break;
                }
                break;
            case 1:
                if (this.f108411b < Array.getLength(obj)) {
                    break;
                }
                break;
            default:
                if (this.f108411b < ((Object[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f108410a;
        Object obj = this.f108412c;
        switch (i13) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object b13 = ((i) obj).b(this.f108411b);
                this.f108411b += 2;
                return b13;
            case 1:
                int i14 = this.f108411b;
                this.f108411b = i14 + 1;
                return Array.get(obj, i14);
            default:
                int i15 = this.f108411b;
                Object[] objArr = (Object[]) obj;
                if (i15 != objArr.length) {
                    this.f108411b = i15 + 1;
                    return objArr[i15];
                }
                throw new NoSuchElementException("Out of elements: " + this.f108411b);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f108410a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("cannot remove items from an array");
            default:
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public h(Object obj) {
        this.f108410a = 1;
        this.f108411b = 0;
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("not an array");
        }
        this.f108412c = obj;
    }
}
