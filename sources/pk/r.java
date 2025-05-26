package pk;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class r extends h implements ListIterator {

    /* renamed from: e */
    public final /* synthetic */ s f100475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(sVar);
        this.f100475e = sVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        s sVar = this.f100475e;
        boolean isEmpty = sVar.isEmpty();
        c().add(obj);
        sVar.f100477f.f100376e++;
        if (isEmpty) {
            sVar.b();
        }
    }

    public final ListIterator c() {
        b();
        return (ListIterator) this.f100408b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, int i13) {
        super(sVar, ((List) sVar.f100469b).listIterator(i13));
        this.f100475e = sVar;
    }
}
