package yk2;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import q5.j0;

/* loaded from: classes2.dex */
public final class d extends j0 implements Iterator, ll2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f139243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g map, int i13) {
        super(map);
        this.f139243e = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(map, "map");
        } else {
            Intrinsics.checkNotNullParameter(map, "map");
            super(map);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f139243e;
        Serializable serializable = this.f102467d;
        switch (i13) {
            case 0:
                b();
                int i14 = this.f102464a;
                g gVar = (g) serializable;
                if (i14 >= gVar.f139253f) {
                    throw new NoSuchElementException();
                }
                this.f102464a = i14 + 1;
                this.f102465b = i14;
                e eVar = new e(gVar, i14);
                f();
                return eVar;
            default:
                b();
                int i15 = this.f102464a;
                g gVar2 = (g) serializable;
                if (i15 >= gVar2.f139253f) {
                    throw new NoSuchElementException();
                }
                this.f102464a = i15 + 1;
                this.f102465b = i15;
                Object obj = gVar2.f139248a[i15];
                f();
                return obj;
        }
    }
}
