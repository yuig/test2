package pk;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class z1 extends m3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f100528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f100529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(AbstractList abstractList, ListIterator listIterator, int i13) {
        super(listIterator);
        this.f100528b = i13;
        this.f100529c = abstractList;
    }

    @Override // pk.l3
    public final Object a(Object obj) {
        int i13 = this.f100528b;
        AbstractList abstractList = this.f100529c;
        switch (i13) {
            case 0:
                return ((a2) abstractList).f100349b.apply(obj);
            default:
                return ((b2) abstractList).f100360b.apply(obj);
        }
    }
}
