package a;

import ads_mobile_sdk.a61;
import ads_mobile_sdk.b13;
import ads_mobile_sdk.cf1;
import ads_mobile_sdk.f13;
import ads_mobile_sdk.g13;
import ads_mobile_sdk.g61;
import ads_mobile_sdk.gy1;
import ads_mobile_sdk.hy1;
import ads_mobile_sdk.i22;
import ads_mobile_sdk.j22;
import ads_mobile_sdk.m61;
import ads_mobile_sdk.me2;
import ads_mobile_sdk.q61;
import ads_mobile_sdk.w61;
import ads_mobile_sdk.y03;
import android.database.Cursor;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.transition.Transition;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements y, de, t9, p7, lb, t3, b2.r, b4.j0, h4.p0, a7.l, l7.f0, d7.r, d7.i, x7.i, x7.u, d9.g, ua.p0, df.s, rg.f, o82.o2, nx.h1 {

    /* renamed from: a */
    public final /* synthetic */ int f33a;

    public /* synthetic */ e(int i13) {
        this.f33a = i13;
    }

    @Override // a.p7
    public p6 a(ea eaVar) {
        j22 j22Var = (j22) eaVar;
        switch (this.f33a) {
            case 8:
                return ads_mobile_sdk.ea.a(j22Var);
            default:
                return ads_mobile_sdk.h8.a(j22Var);
        }
    }

    @Override // d7.i
    public void accept(Object obj) {
        ((s7.m) obj).c();
    }

    @Override // rg.f
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f33a) {
            case 27:
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 28:
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return null;
            default:
                return Boolean.valueOf(cursor.getCount() > 0);
        }
    }

    @Override // l7.f0
    public void b(VideoFrameProcessingException videoFrameProcessingException) {
        switch (this.f33a) {
            case 9:
                d7.u.d("BaseGlShaderProgram", "Exception caught by default BaseGlShaderProgram errorListener.", videoFrameProcessingException);
                break;
            default:
                d7.u.d("DebugViewShaderProgram", "Exception caught by errorListener.", videoFrameProcessingException);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.t9
    public j22 c(nb nbVar) {
        switch (this.f33a) {
            case 7:
                return ads_mobile_sdk.ea.a((ads_mobile_sdk.da) nbVar);
            default:
                return ads_mobile_sdk.h8.a((ads_mobile_sdk.e8) nbVar);
        }
    }

    public Object d() {
        g13 a13;
        g13 a14;
        g13 a15;
        switch (this.f33a) {
            case 4:
                return cf1.a();
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                return hy1.d();
            case 12:
                return gy1.a();
            case 13:
                return gy1.b();
            case 14:
                return gy1.c();
            case 15:
                return gy1.d();
            case 16:
                return gy1.e();
            case 17:
                return gy1.f();
            case 18:
                a13 = g13.a(f13.f5009b, 12);
                return a13;
            case 19:
                a14 = g13.a(f13.f5010c, 12);
                return a14;
            case 20:
                a15 = g13.a(f13.f5010c, 8);
                return a15;
            case 25:
                return ads_mobile_sdk.ha.a();
            case 26:
                return hy1.a();
            case 27:
                return hy1.b();
            case 28:
                return hy1.c();
        }
    }

    @Override // a.y
    public Object e(i7 i7Var) {
        switch (this.f33a) {
            case 0:
                return a61.a((m61) i7Var);
            case 1:
                return ads_mobile_sdk.s9.a((ads_mobile_sdk.y9) i7Var);
            case 2:
                return ads_mobile_sdk.c8.a((ads_mobile_sdk.z7) i7Var);
            case 3:
                return ads_mobile_sdk.c8.b((ads_mobile_sdk.z7) i7Var);
            case 4:
            case 5:
            default:
                return g61.a((q61) i7Var);
            case 6:
                return y03.a((b13) i7Var);
        }
    }

    @Override // nx.h1
    public HashMap f() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r6.f21181b == r7.f21181b) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        r13 = r3.f21178d.f21615a.f21603a.f21571a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r0 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r13.length() != 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        r13 = r3.f21178d.f21615a.f21603a.f21571a;
        r8 = r13.length();
        r11 = r3.f21175a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        if (r11 != 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        r13 = w1.g1.q(0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r4 == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        r13 = b2.o.a(r5, e0.t.k(r6, r3, r13), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r13 = b2.o.a(r5, null, e0.t.k(r7, r3, r13), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (r11 != r8) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        r13 = w1.g1.t(r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (r4 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        r13 = b2.o.a(r5, e0.t.k(r6, r3, r13), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        r13 = b2.o.a(r5, null, e0.t.k(r7, r3, r13), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r0.f21190c != true) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        if ((r4 ^ r1) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r13 = w1.g1.t(r11, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
    
        if (r4 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
    
        r13 = b2.o.a(r5, e0.t.k(r6, r3, r13), null, r1, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0109, code lost:
    
        r13 = b2.o.a(r5, null, e0.t.k(r7, r3, r13), r1, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        r13 = w1.g1.q(r11, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0092, code lost:
    
        if (r3.f21178d.f21615a.f21603a.f21571a.length() != (r13 ? r7 : r6).f21181b) goto L123;
     */
    @Override // b2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b2.o g(b2.o0 r13) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.g(b2.o0):b2.o");
    }

    @Override // x7.u
    public int h(Object obj) {
        x7.n nVar = (x7.n) obj;
        HashMap hashMap = x7.v.f134106a;
        return (nVar.f134056h ? 2 : 0) + (!nVar.f134057i ? 1 : 0);
    }

    @Override // a.lb
    public i7 i(ea eaVar, me2 me2Var) {
        i22 i22Var = (i22) eaVar;
        switch (this.f33a) {
            case 10:
                return ads_mobile_sdk.ea.a(i22Var, me2Var);
            default:
                return ads_mobile_sdk.h8.a(i22Var, me2Var);
        }
    }

    @Override // o82.o2
    public Object invoke(Object obj) {
        switch (this.f33a) {
            case 0:
                com.pinterest.feature.unauth.sba.e0 vmState = (com.pinterest.feature.unauth.sba.e0) obj;
                int i13 = com.pinterest.feature.unauth.sba.w.I0;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                com.pinterest.feature.unauth.sba.y yVar = com.pinterest.feature.unauth.sba.y.f48879a;
                return com.pinterest.feature.unauth.sba.e0.n(vmState);
            default:
                ad2.j item = (ad2.j) obj;
                int i14 = ad2.h.H0;
                Intrinsics.checkNotNullParameter(item, "item");
                return new ad2.k(item.f2100a, item.f2101b, item.f2102c);
        }
    }

    @Override // df.s
    public void j(boolean z13) {
        String str = ue.b.f121938a;
        if (z13) {
            pe.d dVar = pe.d.f99893a;
            if (p001if.a.b(pe.d.class)) {
                return;
            }
            try {
                pe.d.f99898f.set(true);
                return;
            } catch (Throwable th3) {
                p001if.a.a(pe.d.class, th3);
                return;
            }
        }
        pe.d dVar2 = pe.d.f99893a;
        if (p001if.a.b(pe.d.class)) {
            return;
        }
        try {
            pe.d.f99898f.set(false);
        } catch (Throwable th4) {
            p001if.a.a(pe.d.class, th4);
        }
    }

    public void k(ua.o0 o0Var, Transition transition) {
        switch (this.f33a) {
            case 20:
                o0Var.b(transition);
                break;
            case 21:
                o0Var.c(transition);
                break;
            case 22:
                o0Var.g(transition);
                break;
            case 23:
                o0Var.a();
                break;
            default:
                o0Var.d();
                break;
        }
    }

    @Override // a.de
    public i22 m(i7 i7Var, me2 me2Var) {
        switch (this.f33a) {
            case 5:
                return ((w61) i7Var).a(me2Var);
            case 9:
                return ads_mobile_sdk.ea.a((ads_mobile_sdk.y9) i7Var, me2Var);
            default:
                return ads_mobile_sdk.h8.a((ads_mobile_sdk.z7) i7Var, me2Var);
        }
    }

    @Override // d7.r
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        int i13 = m7.l0.f86250p0;
        ((a7.t0) obj).C4(ExoPlaybackException.b(new ExoTimeoutException(1), 1003));
    }
}
