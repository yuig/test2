package ads_mobile_sdk;

import xk2.s;

/* loaded from: classes2.dex */
public final class uz2 implements ab.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.m f12260a;

    public uz2(ao2.o oVar) {
        this.f12260a = oVar;
    }

    @Override // ab.d
    public final void onSuccess(ab.g gVar) {
        ao2.m mVar = this.f12260a;
        xk2.q qVar = s.f135225b;
        mVar.resumeWith(new pk0(gVar));
    }
}
