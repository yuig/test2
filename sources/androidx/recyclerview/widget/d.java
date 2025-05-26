package androidx.recyclerview.widget;

import java.util.List;

/* loaded from: classes3.dex */
public final class d extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19353b;

    public d(e eVar) {
        this.f19353b = eVar;
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean a(int i13, int i14) {
        e eVar = this.f19353b;
        Object obj = ((List) eVar.f19362c).get(i13);
        Object obj2 = ((List) eVar.f19363d).get(i14);
        if (obj != null && obj2 != null) {
            return ((a0) ((f) eVar.f19365f).f19371b.f15968d).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean c(int i13, int i14) {
        e eVar = this.f19353b;
        Object obj = ((List) eVar.f19362c).get(i13);
        Object obj2 = ((List) eVar.f19363d).get(i14);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((a0) ((f) eVar.f19365f).f19371b.f15968d).d(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.a0
    public final Object f(int i13, int i14) {
        e eVar = this.f19353b;
        Object obj = ((List) eVar.f19362c).get(i13);
        Object obj2 = ((List) eVar.f19363d).get(i14);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((a0) ((f) eVar.f19365f).f19371b.f15968d).g(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.a0
    public final int h() {
        return ((List) this.f19353b.f19363d).size();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int i() {
        return ((List) this.f19353b.f19362c).size();
    }
}
