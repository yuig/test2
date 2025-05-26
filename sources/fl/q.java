package fl;

import com.bugsnag.android.a0;
import com.facebook.Profile;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.firebase.components.ComponentRegistrar;
import com.pinterest.activity.PinterestActivity;
import com.pinterest.activity.task.activity.MainActivity;
import el.b1;
import el.k0;
import el.l0;
import el.m0;
import el.u0;
import el.v0;
import h32.f1;
import il.d3;
import il.f3;
import il.g3;
import il.i3;
import il.i4;
import il.j3;
import il.l3;
import il.m3;
import il.n4;
import il.o4;
import il.o5;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pd.d0;
import uj2.e0;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements b1, m0, k0, el.o, el.m, km.e, sl.f, n5.o, ze.b, e0, OnFailureListener, l8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62543a;

    public /* synthetic */ q(int i13) {
        this.f62543a = i13;
    }

    @Override // sl.f
    public final List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // el.m
    public final se.l b(u0 u0Var) {
        int i13 = 3;
        gi.h hVar = null;
        byte b13 = 0;
        Integer num = u0Var.f59542f;
        o5 o5Var = u0Var.f59541e;
        com.google.crypto.tink.shaded.protobuf.k kVar = u0Var.f59539c;
        String str = u0Var.f59537a;
        switch (this.f62543a) {
            case 8:
                l0 l0Var = gl.b.f65721a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    il.c H = il.c.H(kVar, u.a());
                    if (H.F() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    x92.b bVar = new x92.b();
                    bVar.Q(H.D().size());
                    bVar.R(H.E().C());
                    bVar.f134367d = gl.b.b(o5Var);
                    d n13 = bVar.n();
                    gi.m mVar = new gi.m((gi.i) (b13 == true ? 1 : 0));
                    mVar.f65093b = n13;
                    mVar.f65095d = new ll.j(ml.a.a(H.D().i()), i13);
                    mVar.f65094c = num;
                    return mVar.h();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                d0 d0Var = gl.e.f65727a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    g3 I = g3.I(kVar, u.a());
                    if (I.G() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    com.google.firebase.messaging.q b14 = l.b();
                    b14.f33803a = Integer.valueOf(I.E().size());
                    b14.f33804b = Integer.valueOf(I.F().E());
                    b14.f33805c = (j) gl.e.f65728b.b(I.F().D());
                    b14.f33806d = (k) gl.e.f65727a.b(o5Var);
                    l e13 = b14.e();
                    gi.m mVar2 = new gi.m(hVar);
                    mVar2.f65093b = e13;
                    mVar2.f65095d = new ll.j(ml.a.a(I.E().i()), i13);
                    mVar2.f65094c = num;
                    return mVar2.k();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // l8.d
    public final void c(int i13, long j13, long j14) {
        vb0.j.f125485t = j14;
    }

    @Override // el.o
    public final u0 d(se.l lVar) {
        switch (this.f62543a) {
            case 7:
                a aVar = (a) lVar;
                l0 l0Var = gl.b.f65721a;
                il.b G = il.c.G();
                d dVar = aVar.f62496b;
                il.h D = il.i.D();
                D.i(dVar.f62510b);
                G.j((il.i) D.a());
                byte[] b13 = ((ml.a) aVar.f62497c.f83754b).b();
                G.i(com.google.crypto.tink.shaded.protobuf.k.d(b13, 0, b13.length));
                return u0.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((il.c) G.a()).e(), i4.SYMMETRIC, gl.b.a(aVar.f62496b.f62511c), aVar.f62499e);
            default:
                h hVar = (h) lVar;
                d0 d0Var = gl.e.f65727a;
                f3 H = g3.H();
                l lVar2 = hVar.f62513b;
                l3 F = m3.F();
                F.j(lVar2.f62535b);
                F.i((d3) gl.e.f65728b.c(lVar2.f62537d));
                H.j((m3) F.a());
                byte[] b14 = ((ml.a) hVar.f62514c.f83754b).b();
                H.i(com.google.crypto.tink.shaded.protobuf.k.d(b14, 0, b14.length));
                return u0.a("type.googleapis.com/google.crypto.tink.HmacKey", ((g3) H.a()).e(), i4.SYMMETRIC, (o5) gl.e.f65727a.c(hVar.f62513b.f62536c), hVar.f62516e);
        }
    }

    @Override // ze.b
    public final void e(ze.c cVar) {
        if (cVar != null) {
            HashMap hashMap = new HashMap();
            String string = cVar.f141801b.getString("target_url");
            if (string == null) {
                string = "";
            }
            hashMap.put("full_url", string);
            sh.f.a().g(f1.DEFERRED_DEEP_LINK_FACEBOOK, null, hashMap, false);
        }
    }

    @Override // n5.o
    public final boolean f() {
        switch (this.f62543a) {
            case 19:
                int i13 = PinterestActivity.D;
                return true;
            default:
                bk.f fVar = MainActivity.N0;
                return false;
        }
    }

    @Override // uj2.e0
    public final void g(kk2.a emitter) {
        Unit unit;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        String str = Profile.f29917h;
        Profile p13 = a0.p();
        if (p13 != null) {
            emitter.b(p13);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            new hr1.a(emitter).b();
        }
    }

    @Override // el.b1
    public final Object get() {
        j jVar = j.f62525d;
        j jVar2 = j.f62527f;
        k kVar = k.f62529b;
        switch (this.f62543a) {
            case 0:
                com.google.firebase.messaging.q b13 = l.b();
                b13.f33803a = 32;
                b13.f33804b = 16;
                b13.f33806d = kVar;
                b13.f33805c = jVar;
                return b13.e();
            case 1:
                com.google.firebase.messaging.q b14 = l.b();
                b14.f33803a = 32;
                b14.f33804b = 32;
                b14.f33806d = kVar;
                b14.f33805c = jVar;
                return b14.e();
            case 2:
                com.google.firebase.messaging.q b15 = l.b();
                b15.f33803a = 64;
                b15.f33804b = 32;
                b15.f33806d = kVar;
                b15.f33805c = jVar2;
                return b15.e();
            case 3:
                com.google.firebase.messaging.q b16 = l.b();
                b16.f33803a = 64;
                b16.f33804b = 64;
                b16.f33806d = kVar;
                b16.f33805c = jVar2;
                return b16.e();
            default:
                x92.b bVar = new x92.b();
                bVar.Q(32);
                bVar.R(16);
                bVar.f134367d = c.f62504b;
                return bVar.n();
        }
    }

    @Override // el.m0
    public final v0 l(uk.q qVar) {
        switch (this.f62543a) {
            case 5:
                d dVar = (d) qVar;
                l0 l0Var = gl.b.f65721a;
                n4 H = o4.H();
                H.j("type.googleapis.com/google.crypto.tink.AesCmacKey");
                il.e E = il.f.E();
                il.h D = il.i.D();
                D.i(dVar.f62510b);
                E.j((il.i) D.a());
                E.i(dVar.f62509a);
                H.k(((il.f) E.a()).e());
                H.i(gl.b.a(dVar.f62511c));
                return v0.a((o4) H.a());
            default:
                l lVar = (l) qVar;
                d0 d0Var = gl.e.f65727a;
                n4 H2 = o4.H();
                H2.j("type.googleapis.com/google.crypto.tink.HmacKey");
                i3 G = j3.G();
                l3 F = m3.F();
                F.j(lVar.f62535b);
                F.i((d3) gl.e.f65728b.c(lVar.f62537d));
                G.j((m3) F.a());
                G.i(lVar.f62534a);
                H2.k(((j3) G.a()).e());
                H2.i((o5) gl.e.f65727a.c(lVar.f62536c));
                return v0.a((o4) H2.a());
        }
    }

    @Override // el.k0
    public final uk.q o(v0 v0Var) {
        int i13 = this.f62543a;
        o4 o4Var = v0Var.f59546b;
        switch (i13) {
            case 6:
                l0 l0Var = gl.b.f65721a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    il.f F = il.f.F(o4Var.G(), u.a());
                    x92.b bVar = new x92.b();
                    bVar.Q(F.C());
                    bVar.R(F.D().C());
                    bVar.f134367d = gl.b.b(o4Var.E());
                    return bVar.n();
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e13);
                }
            default:
                d0 d0Var = gl.e.f65727a;
                if (!o4Var.F().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + o4Var.F());
                }
                try {
                    j3 H = j3.H(o4Var.G(), u.a());
                    if (H.F() != 0) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + H.F());
                    }
                    com.google.firebase.messaging.q b13 = l.b();
                    b13.f33803a = Integer.valueOf(H.D());
                    b13.f33804b = Integer.valueOf(H.E().E());
                    b13.f33805c = (j) gl.e.f65728b.b(H.E().D());
                    b13.f33806d = (k) gl.e.f65727a.b(o4Var.E());
                    return b13.e();
                } catch (InvalidProtocolBufferException e14) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e14);
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        String message = e13.getMessage();
        if (message == null) {
            message = "";
        }
        kh2.r.g("FirebaseInitializationFailure", message);
    }
}
