package rm2;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f108742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f108743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f108744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym2.g f108745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f108746e;

    public k(n nVar, n nVar2, ym2.g gVar, ArrayList arrayList) {
        this.f108743b = nVar;
        this.f108744c = nVar2;
        this.f108745d = gVar;
        this.f108746e = arrayList;
        this.f108742a = nVar;
    }

    @Override // rm2.c0
    public final void a() {
        this.f108743b.a();
        this.f108744c.g(this.f108745d, new dn2.a((bm2.c) CollectionsKt.s0(this.f108746e)));
    }

    @Override // rm2.c0
    public final void b(ym2.g gVar, ym2.b enumClassId, ym2.g enumEntryName) {
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f108742a.b(gVar, enumClassId, enumEntryName);
    }

    @Override // rm2.c0
    public final void c(Object obj, ym2.g gVar) {
        this.f108742a.c(obj, gVar);
    }

    @Override // rm2.c0
    public final void d(ym2.g gVar, dn2.f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f108742a.d(gVar, value);
    }

    @Override // rm2.c0
    public final d0 e(ym2.g gVar) {
        return this.f108742a.e(gVar);
    }

    @Override // rm2.c0
    public final c0 f(ym2.b classId, ym2.g gVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return this.f108742a.f(classId, gVar);
    }
}
