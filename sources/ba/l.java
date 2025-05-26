package ba;

import java.util.List;

/* loaded from: classes3.dex */
public final class l implements androidx.lifecycle.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f22280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z9.k f22281c;

    public l(boolean z13, List list, z9.k kVar) {
        this.f22279a = z13;
        this.f22280b = list;
        this.f22281c = kVar;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z zVar, androidx.lifecycle.q qVar) {
        boolean z13 = this.f22279a;
        z9.k kVar = this.f22281c;
        List list = this.f22280b;
        if (z13 && !list.contains(kVar)) {
            list.add(kVar);
        }
        if (qVar == androidx.lifecycle.q.ON_START && !list.contains(kVar)) {
            list.add(kVar);
        }
        if (qVar == androidx.lifecycle.q.ON_STOP) {
            list.remove(kVar);
        }
    }
}
