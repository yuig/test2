package q5;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class d0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f102417a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Iterator f102418b;

    public d0(Iterator it) {
        this.f102418b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f102418b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f102418b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        Iterator it = viewGroup != null ? d7.b.O(viewGroup).iterator() : null;
        ArrayList arrayList = this.f102417a;
        if (it == null || !it.hasNext()) {
            while (!this.f102418b.hasNext() && (!arrayList.isEmpty())) {
                this.f102418b = (Iterator) CollectionsKt.b0(arrayList);
                kotlin.collections.k0.B(arrayList);
            }
        } else {
            arrayList.add(this.f102418b);
            this.f102418b = it;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
