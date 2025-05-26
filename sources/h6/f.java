package h6;

import android.os.Build;
import java.util.Set;

/* loaded from: classes.dex */
public final class f extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f67710a;

    public f(g gVar) {
        this.f67710a = gVar;
    }

    @Override // com.bumptech.glide.d
    public final void m0(Throwable th3) {
        ((m) this.f67710a.f66449b).e(th3);
    }

    @Override // com.bumptech.glide.d
    public final void n0(com.google.firebase.messaging.q qVar) {
        g gVar = this.f67710a;
        gVar.f67714d = qVar;
        com.google.firebase.messaging.q qVar2 = gVar.f67714d;
        Object obj = gVar.f66449b;
        m mVar = (m) obj;
        e3.e eVar = mVar.f67735g;
        e eVar2 = mVar.f67737i;
        ((m) obj).getClass();
        Set<int[]> a13 = Build.VERSION.SDK_INT >= 34 ? s.a() : d7.b.Q();
        e3.a aVar = new e3.a();
        aVar.f56996b = eVar;
        aVar.f56997c = qVar2;
        aVar.f56998d = eVar2;
        aVar.f56995a = false;
        aVar.f56999e = null;
        if (!a13.isEmpty()) {
            for (int[] iArr : a13) {
                String str = new String(iArr, 0, iArr.length);
                aVar.m(str, 0, str.length(), 1, true, new z.a(str, 1, 0));
            }
        }
        gVar.f67713c = aVar;
        ((m) gVar.f66449b).f();
    }
}
