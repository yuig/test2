package c3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import androidx.appcompat.widget.x;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import df.j1;
import el.b1;
import el.k0;
import el.l0;
import el.m0;
import el.n0;
import el.o0;
import el.u0;
import el.v0;
import g8.y0;
import il.c5;
import il.d5;
import il.f5;
import il.g4;
import il.g5;
import il.i3;
import il.i4;
import il.i5;
import il.j3;
import il.j4;
import il.j5;
import il.m5;
import il.n4;
import il.o4;
import il.o5;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kh2.a1;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import vk.c0;
import vk.d0;
import vk.e0;
import vk.g0;
import vk.i0;
import vk.j0;
import vk.p0;
import vk.r0;
import vk.s0;
import vk.t0;
import vk.y;
import vk.z;
import wk.w;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements k, n5.o, h7.i, d7.r, d7.s, s7.p, x7.u, d7.i, q8.p, df.s, rg.f, o0, m0, k0, el.o, el.m, b1, sl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25491a;

    public /* synthetic */ e(int i13) {
        this.f25491a = i13;
    }

    public static Bitmap m(int i13, byte[] bArr) {
        try {
            return a1.t(bArr, i13);
        } catch (ParserException e13) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i13 + ")", e13);
        } catch (IOException e14) {
            throw new ImageDecoderException(e14);
        }
    }

    @Override // s7.p
    public void a() {
    }

    @Override // d7.i
    public void accept(Object obj) {
        switch (this.f25491a) {
            case 11:
                ((y0) obj).f64481b.a();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // rg.f
    public Object apply(Object obj) {
        int i13 = 3;
        switch (this.f25491a) {
            case 0:
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 1:
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            case 2:
                return (List) rg.g.g(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new e(i13));
            default:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    if (ig.c.DEFAULT == null) {
                        throw new NullPointerException("Null priority");
                    }
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null backendName");
                    }
                    arrayList.add(new lg.b(string, rg.g.d(cursor.getString(3)), ug.a.b(cursor.getInt(2))));
                }
                return arrayList;
        }
    }

    @Override // el.m
    public se.l b(u0 u0Var) {
        int i13 = this.f25491a;
        Integer num = u0Var.f59542f;
        o5 o5Var = u0Var.f59541e;
        com.google.crypto.tink.shaded.protobuf.k kVar = u0Var.f59539c;
        String str = u0Var.f59537a;
        switch (i13) {
            case 16:
                l0 l0Var = i0.f125961a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    d5 F = d5.F(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (F.D() == 0) {
                        return e0.j(new g0(F.C().C(), i0.b(o5Var)), num);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + F);
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e13);
                }
            default:
                l0 l0Var2 = vk.o0.f126009a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    j5 F2 = j5.F(kVar, com.google.crypto.tink.shaded.protobuf.u.a());
                    if (F2.D() == 0) {
                        return j0.j(vk.o0.a(F2.C(), o5Var), num);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + F2);
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e14);
                }
        }
    }

    @Override // d7.s
    public void c(Object obj, a7.p pVar) {
    }

    @Override // el.o
    public u0 d(se.l lVar) {
        switch (this.f25491a) {
            case 15:
                e0 e0Var = (e0) lVar;
                l0 l0Var = i0.f125961a;
                c5 E = d5.E();
                f5 D = g5.D();
                D.i(e0Var.f125942b.f125952a);
                E.i((g5) D.a());
                return u0.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((d5) E.a()).e(), i4.REMOTE, i0.a(e0Var.f125942b.f125953b), e0Var.f125943c);
            default:
                j0 j0Var = (j0) lVar;
                l0 l0Var2 = vk.o0.f126009a;
                i5 E2 = j5.E();
                E2.i(vk.o0.b(j0Var.f125971b));
                return u0.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((j5) E2.a()).e(), i4.REMOTE, vk.o0.c(j0Var.f125971b.f125997a), j0Var.f125972c);
        }
    }

    @Override // sl.e
    public Object e(pd.s sVar) {
        ig.d lambda$getComponents$0;
        dm.f lambda$getComponents$02;
        FirebaseMessaging lambda$getComponents$03;
        switch (this.f25491a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.f33721a.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f33723c.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f33722b.get();
            case 3:
                sl.m mVar = ExecutorsRegistrar.f33721a;
                return tl.l.INSTANCE;
            case 4:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(sVar);
                return lambda$getComponents$0;
            case 5:
                lambda$getComponents$02 = FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
                return lambda$getComponents$02;
            case 6:
                lambda$getComponents$03 = FirebaseMessagingRegistrar.lambda$getComponents$0(sVar);
                return lambda$getComponents$03;
            default:
                Set b13 = sVar.b(sl.q.a(km.a.class));
                km.c cVar = km.c.f80162b;
                if (cVar == null) {
                    synchronized (km.c.class) {
                        try {
                            cVar = km.c.f80162b;
                            if (cVar == null) {
                                cVar = new km.c(0);
                                km.c.f80162b = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new km.b(b13, cVar);
        }
    }

    @Override // n5.o
    public boolean f() {
        return false;
    }

    @Override // el.o0
    public Object g(se.l lVar) {
        byte[] b13;
        switch (this.f25491a) {
            case 5:
                el.s sVar = (el.s) lVar;
                u0 u0Var = sVar.f59529b;
                el.s.j(u0Var);
                g4 H = j4.H();
                H.j(u0Var.f59537a);
                H.k(u0Var.f59539c);
                H.i(u0Var.f59540d);
                uk.a aVar = (uk.a) uk.t.a((j4) H.a(), uk.a.class);
                int[] iArr = wk.u.f130090a;
                o5 o5Var = u0Var.f59541e;
                int i13 = iArr[o5Var.ordinal()];
                if (i13 != 1) {
                    u0 u0Var2 = sVar.f59529b;
                    if (i13 == 2 || i13 == 3) {
                        b13 = el.i0.a(u0Var2.f59542f.intValue()).b();
                    } else {
                        if (i13 != 4) {
                            throw new GeneralSecurityException("unknown output prefix type " + o5Var);
                        }
                        b13 = el.i0.b(u0Var2.f59542f.intValue()).b();
                    }
                } else {
                    b13 = el.i0.f59494a.b();
                }
                return new wk.v(aVar, b13);
            case 6:
                return ll.q.c((vk.f) lVar);
            case 7:
                vk.m mVar = (vk.m) lVar;
                if (!ll.b.f83681f.isCompatible()) {
                    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
                }
                vk.p pVar = mVar.f125993b;
                if (pVar.f126015c == 16) {
                    return new ll.b(pVar.f126014b, ((ml.a) mVar.f125994c.f83754b).b(), mVar.f125995d.b());
                }
                throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + pVar.f126015c);
            case 8:
                vk.q qVar = (vk.q) lVar;
                yk.d dVar = ll.c.f83690c;
                vk.t tVar = qVar.f126023b;
                if (tVar.f126044b != 12) {
                    throw new GeneralSecurityException("Expected IV Size 12, got " + tVar.f126044b);
                }
                int i14 = tVar.f126045c;
                if (i14 == 16) {
                    return new ll.c(((ml.a) qVar.f126024c.f83754b).b(), qVar.f126025d);
                }
                throw new GeneralSecurityException(a.a.d("Expected tag Size 16, got ", i14));
            case 9:
                vk.u uVar = (vk.u) lVar;
                return new xk.a(((ml.a) uVar.f126052c.f83754b).b(), uVar.f126053d.b());
            case 10:
                y yVar = (y) lVar;
                n0 n0Var = z.f126074a;
                return wk.k.e() ? wk.k.d(yVar) : wk.v.c(yVar);
            case 11:
                n0 n0Var2 = c0.f125931a;
                uk.o.a(((e0) lVar).f125942b.f125952a);
                throw null;
            case 12:
                el.q qVar2 = d0.f125937a;
                uk.o.a(((j0) lVar).f125971b.f125998b);
                throw null;
            default:
                s0 s0Var = (s0) lVar;
                n0 n0Var3 = t0.f126047a;
                return w.d() ? w.c(s0Var) : wk.v.d(s0Var);
        }
    }

    @Override // el.b1
    public Object get() {
        vk.s sVar = vk.s.f126035b;
        vk.o oVar = vk.o.f126005b;
        vk.k kVar = vk.k.f125973b;
        vk.j jVar = vk.j.f125967d;
        switch (this.f25491a) {
            case 21:
                vk.t tVar = p0.f126017a;
                com.google.firebase.messaging.q b13 = vk.t.b();
                b13.C();
                b13.E(16);
                b13.M();
                b13.f33806d = sVar;
                return b13.g();
            case 22:
                vk.t tVar2 = p0.f126017a;
                com.google.firebase.messaging.q b14 = vk.t.b();
                b14.C();
                b14.E(32);
                b14.M();
                b14.f33806d = sVar;
                return b14.g();
            case 23:
                vk.t tVar3 = p0.f126017a;
                com.google.firebase.messaging.q b15 = vk.p.b();
                b15.B(16);
                b15.D(16);
                b15.L();
                b15.f33806d = oVar;
                return b15.f();
            case 24:
                vk.t tVar4 = p0.f126017a;
                com.google.firebase.messaging.q b16 = vk.p.b();
                b16.B(16);
                b16.D(32);
                b16.L();
                b16.f33806d = oVar;
                return b16.f();
            case 25:
                vk.t tVar5 = p0.f126017a;
                x b17 = vk.l.b();
                b17.x(16);
                b17.z(32);
                b17.C(16);
                b17.A(16);
                b17.f16712e = jVar;
                b17.f16713f = kVar;
                return b17.e();
            case 26:
                vk.t tVar6 = p0.f126017a;
                x b18 = vk.l.b();
                b18.x(32);
                b18.z(32);
                b18.C(32);
                b18.A(16);
                b18.f16712e = jVar;
                b18.f16713f = kVar;
                return b18.e();
            default:
                vk.t tVar7 = p0.f126017a;
                return new r0();
        }
    }

    @Override // x7.u
    public int h(Object obj) {
        HashMap hashMap = x7.v.f134106a;
        String str = ((x7.n) obj).f134049a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (d7.n0.f53866a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // c3.k
    public double i(double d2) {
        switch (this.f25491a) {
            case 0:
                double d13 = d2 < 0.0d ? -d2 : d2;
                return Math.copySign(d13 >= 0.0031308049535603718d ? (Math.pow(d13, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d13 / 0.07739938080495357d, d2);
            case 1:
                double d14 = d2 < 0.0d ? -d2 : d2;
                return Math.copySign(d14 >= 0.04045d ? Math.pow((0.9478672985781991d * d14) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d14, d2);
            default:
                return d2;
        }
    }

    @Override // d7.r
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        a7.t0 t0Var = (a7.t0) obj;
        switch (this.f25491a) {
            case 5:
                t0Var.L5();
                break;
            default:
                t0Var.O1();
                break;
        }
    }

    @Override // df.s
    public void j(boolean z13) {
        switch (this.f25491a) {
            case 16:
                le.v vVar = le.v.f83104a;
                if (z13 && le.o0.b()) {
                    df.y yVar = df.y.f54881a;
                    df.y.a(new e(27), df.v.CrashReport);
                    df.y.a(new e(28), df.v.ErrorReport);
                    df.y.a(new e(29), df.v.AnrReport);
                    break;
                }
                break;
            case 17:
                le.v vVar2 = le.v.f83104a;
                if (z13 && !p001if.a.b(me.o.class)) {
                    try {
                        df.e0 e0Var = df.e0.f54743a;
                        me.n callback = new me.n();
                        Intrinsics.checkNotNullParameter(callback, "callback");
                        df.e0.f54748f.add(callback);
                        df.e0.c();
                        break;
                    } catch (Throwable th3) {
                        p001if.a.a(me.o.class, th3);
                        return;
                    }
                }
                break;
            case 18:
                if (!z13) {
                    le.v vVar3 = le.v.f83104a;
                    break;
                } else {
                    le.v.f83116m = true;
                    break;
                }
            case 19:
                if (!z13) {
                    le.v vVar4 = le.v.f83104a;
                    break;
                } else {
                    le.v.f83117n = true;
                    break;
                }
            case 20:
                if (!z13) {
                    le.v vVar5 = le.v.f83104a;
                    break;
                } else {
                    le.v.f83118o = true;
                    break;
                }
            case 21:
                if (z13 && !p001if.a.b(ne.a.class)) {
                    try {
                        try {
                            le.v.d().execute(new com.appsflyer.internal.p(3));
                            break;
                        } catch (Exception unused) {
                            le.v vVar6 = le.v.f83104a;
                            return;
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(ne.a.class, th4);
                        return;
                    }
                }
                break;
            case 22:
                if (z13) {
                    xe.b bVar = xe.b.f134644a;
                    if (!p001if.a.b(xe.b.class)) {
                        try {
                            xe.b.f134645b = true;
                            xe.b.f134644a.b();
                            break;
                        } catch (Throwable th5) {
                            p001if.a.a(xe.b.class, th5);
                            return;
                        }
                    }
                }
                break;
            case 23:
                if (z13) {
                    ve.g gVar = ve.g.f125671a;
                    if (!p001if.a.b(ve.g.class)) {
                        try {
                            j1.x1(new com.appsflyer.internal.p(4));
                            break;
                        } catch (Throwable th6) {
                            p001if.a.a(ve.g.class, th6);
                            return;
                        }
                    }
                }
                break;
            case 24:
                if (z13) {
                    re.b bVar2 = re.b.f107532a;
                    if (!p001if.a.b(re.b.class)) {
                        try {
                            re.b.f107533b = true;
                            re.b.f107532a.a();
                            break;
                        } catch (Throwable th7) {
                            p001if.a.a(re.b.class, th7);
                            return;
                        }
                    }
                }
                break;
            case 25:
                if (z13) {
                    se.j jVar = se.j.f112368a;
                    if (!p001if.a.b(se.j.class)) {
                        try {
                            se.j.f112369b.set(true);
                            se.j.a();
                            break;
                        } catch (Throwable th8) {
                            p001if.a.a(se.j.class, th8);
                            return;
                        }
                    }
                }
                break;
            case 26:
                if (z13) {
                    oe.f.q();
                    break;
                }
                break;
            case 27:
                if (z13) {
                    hf.a.f68998b.b0();
                    df.y yVar2 = df.y.f54881a;
                    if (df.y.b(df.v.CrashShield)) {
                        b0.b0();
                        p001if.a.f72220b = true;
                    }
                    df.y.b(df.v.ThreadCheck);
                    break;
                }
                break;
            case 28:
                if (z13) {
                    a1.x();
                    break;
                }
                break;
            default:
                if (z13) {
                    gf.c.a();
                    break;
                }
                break;
        }
    }

    public String k(g7.i iVar) {
        String str = iVar.f63793h;
        return str != null ? str : iVar.f63786a.toString();
    }

    @Override // el.m0
    public v0 l(uk.q qVar) {
        switch (this.f25491a) {
            case 13:
                g0 g0Var = (g0) qVar;
                l0 l0Var = i0.f125961a;
                n4 H = o4.H();
                H.j("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                f5 D = g5.D();
                D.i(g0Var.f125952a);
                H.k(((g5) D.a()).e());
                H.i(i0.a(g0Var.f125953b));
                return v0.a((o4) H.a());
            case 17:
                vk.m0 m0Var = (vk.m0) qVar;
                l0 l0Var2 = vk.o0.f126009a;
                n4 H2 = o4.H();
                H2.j("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                H2.k(vk.o0.b(m0Var).e());
                H2.i(vk.o0.c(m0Var.f125997a));
                return v0.a((o4) H2.a());
            default:
                vk.l lVar = (vk.l) qVar;
                l0 l0Var3 = wk.c.f130045a;
                n4 H3 = o4.H();
                H3.j("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                il.n E = il.o.E();
                il.t F = il.u.F();
                il.w D2 = il.x.D();
                D2.i(lVar.f125986c);
                F.j((il.x) D2.a());
                F.i(lVar.f125984a);
                E.i((il.u) F.a());
                i3 G = j3.G();
                G.j(wk.c.a(lVar));
                G.i(lVar.f125985b);
                E.j((j3) G.a());
                H3.k(((il.o) E.a()).e());
                H3.i(wk.c.c(lVar.f125988e));
                return v0.a((o4) H3.a());
        }
    }

    public Constructor n() {
        switch (this.f25491a) {
            case 13:
                int[] iArr = q8.q.f102985f;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(q8.s.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = q8.q.f102985f;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(q8.s.class).getConstructor(new Class[0]);
        }
    }

    @Override // el.k0
    public uk.q o(v0 v0Var) {
        int i13 = this.f25491a;
        o4 o4Var = v0Var.f59546b;
        switch (i13) {
            case 14:
                l0 l0Var = i0.f125961a;
                if (o4Var.F().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    try {
                        return new g0(g5.E(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a()).C(), i0.b(o4Var.E()));
                    } catch (InvalidProtocolBufferException e13) {
                        throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e13);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + o4Var.F());
            default:
                l0 l0Var2 = vk.o0.f126009a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    return vk.o0.a(m5.G(o4Var.G(), com.google.crypto.tink.shaded.protobuf.u.a()), o4Var.E());
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e14);
                }
        }
    }
}
