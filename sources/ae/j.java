package ae;

import java.util.Map;

/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.s f15014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15015b;

    public j(k kVar, androidx.lifecycle.s sVar) {
        this.f15015b = kVar;
        this.f15014a = sVar;
    }

    @Override // ae.i
    public final void b() {
    }

    @Override // ae.i
    public final void onDestroy() {
        ((Map) this.f15015b.f15016a).remove(this.f15014a);
    }

    @Override // ae.i
    public final void x() {
    }
}
