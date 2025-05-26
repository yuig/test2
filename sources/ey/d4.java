package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d4 extends u1 implements b2 {

    /* renamed from: c, reason: collision with root package name */
    public final q1 f60472c;

    public d4(q1 pwtSearchType) {
        Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
        this.f60472c = pwtSearchType;
    }

    @Override // ey.u1
    public final /* bridge */ /* synthetic */ String e() {
        return "render_search_screen";
    }

    @Override // ey.u1
    public final String g() {
        return this.f60472c.getSpanName();
    }
}
