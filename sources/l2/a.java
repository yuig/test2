package l2;

import java.util.List;
import kotlin.collections.h;

/* loaded from: classes2.dex */
public final class a extends h implements b {

    /* renamed from: b, reason: collision with root package name */
    public final b f81471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f81473d;

    public a(b bVar, int i13, int i14) {
        this.f81471b = bVar;
        this.f81472c = i13;
        ue.c.h(i13, i14, bVar.size());
        this.f81473d = i14 - i13;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f81473d;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        ue.c.f(i13, this.f81473d);
        return this.f81471b.get(this.f81472c + i13);
    }

    @Override // kotlin.collections.h, java.util.List
    public final List subList(int i13, int i14) {
        ue.c.h(i13, i14, this.f81473d);
        int i15 = this.f81472c;
        return new a(this.f81471b, i13 + i15, i15 + i14);
    }
}
