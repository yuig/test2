package y70;

import android.os.Bundle;
import tb0.p;

/* loaded from: classes.dex */
public final class f extends s.b {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f137995o;

    public f(g gVar) {
        this.f137995o = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
    
        r1 = r0.f137995o.f138005p;
     */
    @Override // s.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void extraCallback(java.lang.String r1, android.os.Bundle r2) {
        /*
            r0 = this;
            java.lang.String r2 = "callbackName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "onOpenInBrowser"
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto L18
            y70.g r1 = r0.f137995o
            y70.c r1 = y70.g.a(r1)
            if (r1 == 0) goto L18
            r1.b()
        L18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y70.f.extraCallback(java.lang.String, android.os.Bundle):void");
    }

    @Override // s.b
    public final void onNavigationEvent(int i13, Bundle bundle) {
        g gVar = this.f137995o;
        c cVar = gVar.f138005p;
        if (cVar != null) {
            switch (i13) {
                case 1:
                    cVar.f();
                    break;
                case 2:
                    cVar.d();
                    break;
                case 3:
                    cVar.e();
                    break;
                case 4:
                    cVar.c();
                    break;
                case 5:
                    cVar.h();
                    break;
                case 6:
                    cVar.g();
                    break;
                default:
                    gVar.f137998i.F(a.a.d("Unsupported Chrome Event ", i13), p.CHROME_TAB, new Object[0]);
                    break;
            }
        }
    }
}
