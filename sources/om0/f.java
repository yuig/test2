package om0;

import i2.f2;
import i2.z1;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s80.f4;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f96490a = c(rm1.q.ARROW_BACK);

    /* renamed from: b, reason: collision with root package name */
    public static final a f96491b = c(rm1.q.PERSON_ADD);

    /* renamed from: c, reason: collision with root package name */
    public static final a f96492c = c(rm1.q.SPEECH_ELLIPSIS);

    /* renamed from: d, reason: collision with root package name */
    public static final a f96493d = c(rm1.q.ANDROID_SHARE);

    /* renamed from: e, reason: collision with root package name */
    public static final a f96494e = c(rm1.q.ELLIPSIS);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(om0.a r20, u2.q r21, om1.f r22, kotlin.jvm.functions.Function0 r23, i2.o r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.f.a(om0.a, u2.q, om1.f, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public static final void b(b state, u2.q qVar, om1.f fVar, float f13, Function1 function1, i2.o oVar, int i13, int i14) {
        float f14;
        int i15;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1852816608);
        int i16 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i16 != 0 ? nVar : qVar;
        om1.f fVar2 = (i14 & 4) != 0 ? om1.f.TRANSPARENT_DARK_GRAY : fVar;
        if ((i14 & 8) != 0) {
            f14 = com.bumptech.glide.d.A(eo1.c.space_100, sVar);
            i15 = i13 & (-7169);
        } else {
            f14 = f13;
            i15 = i13;
        }
        Function1 function12 = (i14 & 16) != 0 ? d.f96476i : function1;
        boolean z13 = 0;
        p1.e1 a13 = p1.c1.a(p1.l.g(f14), u2.b.f120022j, sVar, 0);
        int i17 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        Iterator it = state.f96466a.iterator();
        while (true) {
            boolean z14 = true;
            if (!it.hasNext()) {
                break;
            }
            a aVar = (a) it.next();
            u2.q j13 = androidx.compose.ui.platform.a.j(nVar, aVar.f96456a.name());
            sVar.W(154624248);
            if ((((57344 & i13) ^ 24576) <= 16384 || !sVar.h(function12)) && (i13 & 24576) != 16384) {
                z14 = z13;
            }
            boolean h10 = z14 | sVar.h(aVar);
            Object J2 = sVar.J();
            if (h10 || J2 == i2.n.f71185a) {
                J2 = new e(function12, aVar, z13);
                sVar.g0(J2);
            }
            sVar.r(z13);
            a(aVar, j13, fVar2, (Function0) J2, sVar, i15 & 896, 0);
            z13 = z13;
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new f4(state, qVar2, fVar2, f14, function12, i13, i14);
        }
    }

    public static a c(rm1.q qVar) {
        return new a(qVar, true, qVar.ordinal());
    }
}
