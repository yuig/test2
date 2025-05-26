package oo2;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class j implements Iterable, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f96899b;

    public /* synthetic */ j(g gVar, int i13) {
        this.f96898a = i13;
        this.f96899b = gVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i13 = this.f96898a;
        g gVar = this.f96899b;
        switch (i13) {
            case 0:
                return new i(gVar, 0);
            default:
                return new i(gVar, 1);
        }
    }
}
