package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends h implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80369b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f80370c;

    /* renamed from: d, reason: collision with root package name */
    public int f80371d;

    /* renamed from: e, reason: collision with root package name */
    public final List f80372e;

    public g(h list, int i13, int i14) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f80372e = list;
        this.f80370c = i13;
        e eVar = h.f80373a;
        int b13 = list.b();
        eVar.getClass();
        e.d(i13, i14, b13);
        this.f80371d = i14 - this.f80370c;
    }

    @Override // kotlin.collections.b
    public final int b() {
        switch (this.f80369b) {
        }
        return this.f80371d;
    }

    public final void c(int i13, int i14) {
        e eVar = h.f80373a;
        int size = this.f80372e.size();
        eVar.getClass();
        e.d(i13, i14, size);
        this.f80370c = i13;
        this.f80371d = i14 - i13;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        int i14 = this.f80369b;
        List list = this.f80372e;
        switch (i14) {
            case 0:
                e eVar = h.f80373a;
                int i15 = this.f80371d;
                eVar.getClass();
                e.b(i13, i15);
                return ((h) list).get(this.f80370c + i13);
            default:
                e eVar2 = h.f80373a;
                int i16 = this.f80371d;
                eVar2.getClass();
                e.b(i13, i16);
                return list.get(this.f80370c + i13);
        }
    }

    public g(ro2.e list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f80372e = list;
    }
}
