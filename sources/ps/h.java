package ps;

import hs1.x;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class h implements hs1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f101231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f101232b;

    public h(k kVar, Function1 function1) {
        this.f101231a = kVar;
        this.f101232b = function1;
    }

    @Override // hs1.p
    public final void a(boolean z13, x xVar) {
        if (this.f101231a.f101239b) {
            return;
        }
        this.f101232b.invoke(Boolean.valueOf(z13));
    }
}
