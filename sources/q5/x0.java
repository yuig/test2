package q5;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class x0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102536a;

    /* renamed from: b, reason: collision with root package name */
    public int f102537b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f102538c;

    public /* synthetic */ x0(Object obj, int i13) {
        this.f102536a = i13;
        this.f102538c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f102536a;
        Object obj = this.f102538c;
        switch (i13) {
            case 0:
                return this.f102537b < ((ViewGroup) obj).getChildCount();
            case 1:
                return this.f102537b < ((kotlin.collections.h) obj).b();
            case 2:
                return ((Iterator) obj).hasNext();
            default:
                return this.f102537b < ((Object[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f102536a;
        Object obj = this.f102538c;
        switch (i13) {
            case 0:
                int i14 = this.f102537b;
                this.f102537b = i14 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i14);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i15 = this.f102537b;
                this.f102537b = i15 + 1;
                return ((kotlin.collections.h) obj).get(i15);
            case 2:
                int i16 = this.f102537b;
                this.f102537b = i16 + 1;
                if (i16 >= 0) {
                    return new IndexedValue(i16, ((Iterator) obj).next());
                }
                kotlin.collections.f0.p();
                throw null;
            default:
                try {
                    int i17 = this.f102537b;
                    this.f102537b = i17 + 1;
                    return ((Object[]) obj)[i17];
                } catch (ArrayIndexOutOfBoundsException e13) {
                    this.f102537b--;
                    throw new NoSuchElementException(e13.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f102536a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f102538c;
                int i13 = this.f102537b - 1;
                this.f102537b = i13;
                viewGroup.removeViewAt(i13);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x0(Object[] array) {
        this.f102536a = 3;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f102538c = array;
    }

    public x0(Iterator iterator) {
        this.f102536a = 2;
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f102538c = iterator;
    }
}
