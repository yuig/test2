package bw;

import bj.f;
import com.pinterest.gestalt.text.GestaltText;
import es.h;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import so.jb;
import so.oa;
import u50.f0;
import yv.g;

/* loaded from: classes3.dex */
public final class d extends g {

    /* renamed from: s, reason: collision with root package name */
    public boolean f23966s;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    @Override // yv.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bw.d.X():void");
    }

    @Override // yv.h
    public final void a3(float f13) {
        this.f140194r = f13;
    }

    @Override // xv.j
    public final void b() {
        if (this.f23966s) {
            return;
        }
        this.f23966s = true;
        jb jbVar = (jb) ((e) generatedComponent());
        this.f140179c = jbVar.a();
        this.f140180d = (ni1.d) jbVar.f113485c.f114551x.get();
        oa oaVar = jbVar.f113483a;
        this.f140181e = (pb0.a) oaVar.f113834o1.get();
        this.f140182f = (h) oaVar.f113735i7.get();
    }

    @Override // y92.g
    public final boolean resizable() {
        return false;
    }

    @Override // yv.g
    public final int s() {
        return j().r3();
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        return j().s3();
    }

    @Override // yv.g
    public final int x() {
        return 33;
    }

    @Override // yv.h
    public final void x0(f nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        z().f32084a.a(q(), "3001");
        z().f32084a.a(D(), "3005");
        z().f32084a.a(n(), "3002");
        GestaltText q13 = q();
        String string = nativeAd.getHeadline();
        if (string == null) {
            string = "";
        }
        Intrinsics.checkNotNullParameter(string, "string");
        a0.q(q13, new f0(string));
        GestaltText D = D();
        String string2 = nativeAd.getAdvertiser();
        if (string2 == null) {
            string2 = "";
        }
        Intrinsics.checkNotNullParameter(string2, "string");
        a0.q(D, new f0(string2));
        GestaltText n13 = n();
        String callToAction = nativeAd.getCallToAction();
        String string3 = callToAction != null ? callToAction : "";
        Intrinsics.checkNotNullParameter(string3, "string");
        a0.q(n13, new f0(string3));
        GestaltText k13 = k();
        String string4 = l();
        Intrinsics.checkNotNullParameter(string4, "string");
        a0.q(k13, new f0(string4));
        t().a(nativeAd.getMediaContent());
        String p33 = j().p3();
        if (p33 == null || p33.length() == 0) {
            z().f32084a.a(g(), "3011");
        } else {
            g().setOnClickListener(new a(this, 0));
        }
        z().a(nativeAd, t());
        yv.f j13 = j();
        o();
        j13.w3(System.currentTimeMillis() - this.f140183g);
    }
}
