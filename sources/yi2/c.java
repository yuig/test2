package yi2;

import nj2.l;
import nj2.m;
import ui2.p;
import ui2.q;
import ui2.r;

/* loaded from: classes4.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final m f139175a;

    public c(m mVar) {
        this.f139175a = mVar;
    }

    @Override // ui2.r
    public final q a(String str) {
        return this.f139175a.a(str);
    }

    public final p b() {
        l lVar = (l) this.f139175a.a("io.embrace.android.embracesdk.core");
        lVar.f91033c = "7.1.0";
        return lVar.build();
    }

    @Override // ui2.r
    public final p c(String str) {
        return this.f139175a.c(str);
    }
}
