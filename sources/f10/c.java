package f10;

import com.google.firebase.messaging.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements ed.c {

    /* renamed from: a, reason: collision with root package name */
    public final a f60772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.b f60773b;

    public c(b networkClientWrapper) {
        Intrinsics.checkNotNullParameter(networkClientWrapper, "networkClientWrapper");
        this.f60772a = networkClientWrapper;
        this.f60773b = new ed.b(networkClientWrapper.f60771a);
    }

    @Override // ed.c
    public final Object a(q qVar, bl2.c cVar) {
        return this.f60773b.a(qVar, cVar);
    }

    @Override // ed.c
    public final void dispose() {
        this.f60773b.getClass();
    }
}
