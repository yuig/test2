package bh;

import ai.f;
import ai.l;
import ai.q;
import android.content.res.Resources;
import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Parcel;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.Surface;
import cl.h;
import cl.i;
import cl.k;
import com.bumptech.glide.d;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.internal.measurement.b8;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.shaded.protobuf.r;
import com.google.gson.JsonIOException;
import com.google.protobuf.j;
import com.google.protobuf.s;
import com.google.protobuf.u;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kg0;
import com.pinterest.feature.boardpreview.export.render.RendererException;
import el.c1;
import gi.b2;
import gi.d2;
import gi.m;
import gi.w;
import java.io.File;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;
import javax.crypto.Mac;
import kg.t;
import kh2.k3;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.n1;
import ll.n;
import nx.d0;
import nx.d1;
import oi.a7;
import oi.d4;
import oi.q6;
import pk.o1;
import pm.p;
import so.oa;
import so.r8;
import x02.i2;
import x02.x0;
import zk.e;

/* loaded from: classes3.dex */
public final class b implements o, d4, h, p {

    /* renamed from: a */
    public final /* synthetic */ int f22797a;

    /* renamed from: b */
    public Object f22798b;

    /* renamed from: c */
    public Object f22799c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b() {
        this(13);
        this.f22797a = 13;
    }

    public static b i(n nVar) {
        int i13 = cl.n.f27973a[nVar.ordinal()];
        if (i13 == 1) {
            return new b(new z.a("HmacSha256", 7, 0), n.NIST_P256, 14);
        }
        if (i13 == 2) {
            return new b(new z.a("HmacSha384", 7, 0), n.NIST_P384, 14);
        }
        if (i13 == 3) {
            return new b(new z.a("HmacSha512", 7, 0), n.NIST_P521, 14);
        }
        throw new GeneralSecurityException("invalid curve type: " + nVar);
    }

    public static void j(b bVar, x xVar) {
        el.a.q2((long[]) ((m) bVar.f22798b).f65093b, (long[]) ((m) xVar.f31694b).f65093b, (long[]) xVar.f31695c);
        long[] jArr = (long[]) ((m) bVar.f22798b).f65095d;
        m mVar = (m) xVar.f31694b;
        el.a.q2(jArr, (long[]) mVar.f65095d, (long[]) mVar.f65094c);
        el.a.q2((long[]) ((m) bVar.f22798b).f65094c, (long[]) ((m) xVar.f31694b).f65094c, (long[]) xVar.f31695c);
        long[] jArr2 = (long[]) bVar.f22799c;
        m mVar2 = (m) xVar.f31694b;
        el.a.q2(jArr2, (long[]) mVar2.f65093b, (long[]) mVar2.f65095d);
    }

    public final j a() {
        if (((u) this.f22798b).H() == 0) {
            return new j((byte[]) this.f22799c);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void accept(Object obj, Object obj2) {
        switch (this.f22797a) {
            case 1:
                uh.b bVar = new uh.b((TaskCompletionSource) obj2);
                d2 d2Var = (d2) ((b2) obj).getService();
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) this.f22799c;
                Parcel B = d2Var.B();
                int i13 = w.f65126a;
                B.writeStrongBinder(bVar);
                if (publicKeyCredentialCreationOptions == null) {
                    B.writeInt(0);
                } else {
                    B.writeInt(1);
                    publicKeyCredentialCreationOptions.writeToParcel(B, 0);
                }
                Parcel obtain = Parcel.obtain();
                try {
                    d2Var.f141967b.transact(1, B, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                    B.recycle();
                    obtain.recycle();
                }
            default:
                f fVar = new f((TaskCompletionSource) obj2);
                q qVar = (q) ((ai.h) obj).getService();
                GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) this.f22799c;
                d.t(getSignInIntentRequest);
                Parcel C = qVar.C();
                int i14 = l.f15231a;
                C.writeStrongBinder(fVar);
                l.c(C, getSignInIntentRequest);
                qVar.D(C, 3);
                return;
        }
    }

    @Override // oi.d4
    public final void b(String str, int i13, Throwable th3, byte[] bArr, Map map) {
        ((a7) this.f22798b).q(true, i13, th3, bArr);
    }

    @Override // cl.h
    public final i c(byte[] bArr) {
        KeyPair F = el.a.F(el.a.I((n) this.f22798b));
        n nVar = (n) this.f22798b;
        ll.p pVar = ll.p.UNCOMPRESSED;
        byte[] t13 = el.a.t((ECPrivateKey) F.getPrivate(), el.a.K(nVar, pVar, bArr));
        n nVar2 = (n) this.f22798b;
        byte[] s22 = el.a.s2(el.a.I(nVar2).getCurve(), pVar, ((ECPublicKey) F.getPublic()).getW());
        byte[] u13 = t.u(s22, bArr);
        byte[] u14 = t.u(k.f27968m, e());
        z.a aVar = (z.a) this.f22799c;
        int macLength = Mac.getInstance(aVar.f140498b).getMacLength();
        Charset charset = c1.f59463a;
        byte[] bytes = "eae_prk".getBytes(charset);
        byte[] bArr2 = k.f27970o;
        return new i(aVar.g(macLength, aVar.h(t.u(bArr2, u14, bytes, t13), null), t.u(k.b(2, macLength), bArr2, u14, "shared_secret".getBytes(charset), u13)), s22);
    }

    public final zk.f d() {
        Integer num = (Integer) this.f22798b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((e) this.f22799c) != null) {
            return new zk.f(num.intValue(), (e) this.f22799c);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    @Override // cl.h
    public final byte[] e() {
        int i13 = cl.n.f27973a[((n) this.f22798b).ordinal()];
        if (i13 == 1) {
            return k.f27958c;
        }
        if (i13 == 2) {
            return k.f27959d;
        }
        if (i13 == 3) {
            return k.f27960e;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    public final void f() {
        ((b20.c) this.f22798b).y(null);
    }

    public final aq.c g(f30 pin, d1 trackingParamAttacher) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        r8 r8Var = ((so.j) this.f22799c).f113470a;
        b60.b bVar = (b60.b) r8Var.f114090a.f113850p0.get();
        oa oaVar = r8Var.f114090a;
        return new aq.c(pin, trackingParamAttacher, bVar, (i2) oaVar.F3.get(), (x0) oaVar.f113765k3.get(), (n1) oaVar.E0.get());
    }

    public final aq.m h(kg0 scheduledPin) {
        Intrinsics.checkNotNullParameter(scheduledPin, "scheduledPin");
        r8 r8Var = ((so.i) this.f22798b).f113453a;
        n22.a E1 = oa.E1(r8Var.f114090a);
        oa oaVar = r8Var.f114090a;
        return new aq.m(scheduledPin, E1, (b60.b) oaVar.f113850p0.get(), (n1) oaVar.E0.get());
    }

    public final u k() {
        return (u) this.f22798b;
    }

    public final jz.d l() {
        Object obj;
        Iterator it = ((List) this.f22799c).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jz.f) obj) instanceof jz.d) {
                break;
            }
        }
        if (obj instanceof jz.d) {
            return (jz.d) obj;
        }
        return null;
    }

    public final jz.f m() {
        return (jz.f) ((List) this.f22799c).get(((b20.c) this.f22798b).j());
    }

    public final CharSequence n(Resources resources, int i13, int i14, pb0.b bVar, boolean z13) {
        String quantityString;
        int length;
        if (bVar == pb0.b.STYLE_COMPACT || bVar == pb0.b.STYLE_COMPACT_NO_BOLDING) {
            quantityString = z13 ? resources.getQuantityString(((SparseIntArray) this.f22799c).get(i13), i14) : i13 == pb0.f.just_now ? resources.getString(((SparseIntArray) this.f22798b).get(i13)) : resources.getQuantityString(((SparseIntArray) this.f22798b).get(i13), i14);
            Intrinsics.f(quantityString);
        } else {
            quantityString = i13 == pb0.f.just_now ? resources.getString(i13) : resources.getQuantityString(i13, i14);
            Intrinsics.f(quantityString);
        }
        if (bVar == pb0.b.STYLE_NORMAL_NO_BOLDING || bVar == pb0.b.STYLE_COMPACT_NO_BOLDING) {
            String format = String.format(quantityString, BidiFormatter.getInstance(Locale.getDefault()).unicodeWrap(String.valueOf(i14)));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        String valueOf = String.valueOf(i14);
        boolean z14 = false;
        int L = StringsKt.L(quantityString, "%1$s", 0, false, 6);
        if (L >= 0) {
            length = valueOf.length() + L;
            z14 = true;
        } else {
            length = quantityString.length();
            L = 0;
        }
        if (z14) {
            quantityString = String.format(quantityString, BidiFormatter.getInstance(Locale.getDefault()).unicodeWrap(valueOf));
            Intrinsics.checkNotNullExpressionValue(quantityString, "format(...)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
        spannableStringBuilder.setSpan(new StyleSpan(1), L, length, 33);
        return spannableStringBuilder;
    }

    public final boolean o() {
        return ((b20.c) this.f22798b).j() == 0;
    }

    public final boolean p() {
        return ((b20.c) this.f22798b).j() == f0.i((List) this.f22799c);
    }

    public final boolean q() {
        int i13;
        int j13 = ((b20.c) this.f22798b).j();
        List list = (List) this.f22799c;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i13 = -1;
                break;
            }
            if (((jz.f) listIterator.previous()) instanceof jz.d) {
                i13 = listIterator.nextIndex();
                break;
            }
        }
        return j13 == i13;
    }

    public final void r() {
        dn0.d dVar = (dn0.d) this.f22798b;
        EGLSurface readSurface = (EGLSurface) this.f22799c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(readSurface, "eglSurface");
        Intrinsics.checkNotNullParameter(readSurface, "drawSurface");
        Intrinsics.checkNotNullParameter(readSurface, "readSurface");
        EGLDisplay eGLDisplay = dVar.f55611a;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        if (EGL14.eglMakeCurrent(eGLDisplay, readSurface, readSurface, dVar.f55612b)) {
            return;
        }
        Intrinsics.checkNotNullParameter("eglMakeCurrent(draw,read) failed", "message");
        throw new RendererException("eglMakeCurrent(draw,read) failed");
    }

    public final void s() {
        Object obj = this.f22798b;
        ((b20.c) obj).w(((b20.c) obj).j() + 1, false);
    }

    public final void t() {
        ((b20.c) this.f22798b).w(((b20.c) r0).j() - 1, false);
    }

    public final String toString() {
        switch (this.f22797a) {
            case 12:
                return "Files.asByteSink(" + ((File) this.f22798b) + ", " + ((o1) this.f22799c) + ")";
            case 21:
                StringBuilder sb3 = new StringBuilder("GetFriendsResponse{groups=");
                sb3.append((List) this.f22798b);
                sb3.append(", nextPageRequestToken='");
                return a.a.p(sb3, (String) this.f22799c, "'}");
            default:
                return super.toString();
        }
    }

    @Override // pm.p
    public final Object u() {
        throw new JsonIOException((String) this.f22799c);
    }

    public final void v() {
        dn0.d dVar = (dn0.d) this.f22798b;
        EGLSurface eglSurface = (EGLSurface) this.f22799c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        EGL14.eglDestroySurface(dVar.f55611a, eglSurface);
        EGLSurface EGL_NO_SURFACE = EGL14.EGL_NO_SURFACE;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_SURFACE, "EGL_NO_SURFACE");
        Intrinsics.checkNotNullParameter(EGL_NO_SURFACE, "<set-?>");
        this.f22799c = EGL_NO_SURFACE;
    }

    public final void w(int i13) {
        if (i13 != 32 && i13 != 48 && i13 != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i13)));
        }
        this.f22798b = Integer.valueOf(i13);
    }

    public final void x(m.h hVar, m mVar) {
        b8 b8Var = new b8(mVar);
        for (Integer num : ((TreeMap) this.f22798b).keySet()) {
            com.google.android.gms.internal.measurement.c cVar = (com.google.android.gms.internal.measurement.c) ((com.google.android.gms.internal.measurement.c) mVar.f65095d).clone();
            com.google.android.gms.internal.measurement.n a13 = ((com.google.android.gms.internal.measurement.o) ((TreeMap) this.f22798b).get(num)).a(hVar, Collections.singletonList(b8Var));
            int A = a13 instanceof g ? o0.A(a13.zze().doubleValue()) : -1;
            if (A == 2 || A == -1) {
                mVar.f65095d = cVar;
            }
        }
        Iterator it = ((TreeMap) this.f22799c).keySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.n a14 = ((com.google.android.gms.internal.measurement.o) ((TreeMap) this.f22799c).get((Integer) it.next())).a(hVar, Collections.singletonList(b8Var));
            if (a14 instanceof g) {
                o0.A(a14.zze().doubleValue());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i13) {
        this(15, new m(14), new long[10]);
        this.f22797a = i13;
        if (i13 == 3) {
            this.f22798b = new TreeMap();
            this.f22799c = new TreeMap();
            return;
        }
        if (i13 != 11) {
            if (i13 == 13) {
                this.f22798b = null;
                this.f22799c = e.f142072d;
                return;
            }
            int i14 = 10;
            if (i13 == 15) {
                return;
            }
            if (i13 == 19) {
                ll.j jVar = new ll.j(11);
                this.f22798b = jVar;
                this.f22799c = new ll.j(jVar, i14);
                return;
            }
            if (i13 != 27) {
                if (i13 != 28) {
                    this.f22798b = Boolean.FALSE;
                    return;
                } else {
                    this.f22798b = new int[2];
                    this.f22799c = new RectF();
                    return;
                }
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.put(pb0.f.just_now, pb0.f.now);
            sparseIntArray.put(pb0.e.plural_minute_normal, pb0.e.plural_minute_compact);
            sparseIntArray.put(pb0.e.plural_hour_normal, pb0.e.plural_hour_compact);
            sparseIntArray.put(pb0.e.plural_day_normal, pb0.e.plural_day_compact);
            sparseIntArray.put(pb0.e.plural_week_normal, pb0.e.plural_week_compact);
            sparseIntArray.put(pb0.e.plural_month_normal, pb0.e.plural_month_compact);
            sparseIntArray.put(pb0.e.plural_year_normal, pb0.e.plural_year_compact);
            this.f22798b = sparseIntArray;
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            sparseIntArray2.put(pb0.f.just_now, pb0.f.now);
            sparseIntArray2.put(pb0.e.plural_minute_normal, pb0.e.plural_minute_ago_compact);
            sparseIntArray2.put(pb0.e.plural_hour_normal, pb0.e.plural_hour_ago_compact);
            sparseIntArray2.put(pb0.e.plural_day_normal, pb0.e.plural_day_ago_compact);
            sparseIntArray2.put(pb0.e.plural_week_normal, pb0.e.plural_week_ago_compact);
            sparseIntArray2.put(pb0.e.plural_month_normal, pb0.e.plural_month_ago_compact);
            sparseIntArray2.put(pb0.e.plural_year_normal, pb0.e.plural_year_ago_compact);
            sparseIntArray2.put(pb0.e.plural_minute_ago_normal, pb0.e.plural_minute_ago_compact);
            sparseIntArray2.put(pb0.e.plural_hour_ago_normal, pb0.e.plural_hour_ago_compact);
            sparseIntArray2.put(pb0.e.plural_day_ago_normal, pb0.e.plural_day_ago_compact);
            sparseIntArray2.put(pb0.e.plural_week_ago_normal, pb0.e.plural_week_ago_compact);
            sparseIntArray2.put(pb0.e.plural_month_ago_normal, pb0.e.plural_month_ago_compact);
            sparseIntArray2.put(pb0.e.plural_year_ago_normal, pb0.e.plural_year_ago_compact);
            this.f22799c = sparseIntArray2;
        }
    }

    public b(int i13, int i14) {
        this.f22797a = i14;
        if (i14 == 16) {
            byte[] bArr = new byte[i13];
            this.f22799c = bArr;
            Logger logger = r.f33683c;
            this.f22798b = new com.google.crypto.tink.shaded.protobuf.p(bArr, i13);
            return;
        }
        if (i14 != 18) {
            byte[] bArr2 = new byte[i13];
            this.f22799c = bArr2;
            this.f22798b = new q5(bArr2, i13);
        } else {
            byte[] bArr3 = new byte[i13];
            this.f22799c = bArr3;
            Logger logger2 = u.f34000q;
            this.f22798b = new s(bArr3, i13);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13, a.c cVar) {
        this(i13, 18);
        this.f22797a = 18;
    }

    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        this.f22797a = i13;
        this.f22798b = obj;
        this.f22799c = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(x xVar) {
        this(15);
        this.f22797a = 15;
        j(this, xVar);
    }

    public /* synthetic */ b(Object obj, Object obj2, int i13) {
        this.f22797a = i13;
        this.f22799c = obj;
        this.f22798b = obj2;
    }

    public b(q6 q6Var) {
        this.f22797a = 7;
        this.f22799c = q6Var;
    }

    public b(c cVar) {
        this.f22797a = 0;
        this.f22798b = Boolean.FALSE;
        c cVar2 = c.f22800c;
        cVar.getClass();
        this.f22798b = Boolean.valueOf(cVar.f22801a);
        this.f22799c = cVar.f22802b;
    }

    public b(Surface surface, dn0.d glCore) {
        this.f22797a = 29;
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(glCore, "glCore");
        Intrinsics.checkNotNullParameter(glCore, "glCore");
        this.f22798b = glCore;
        Intrinsics.checkNotNullParameter(surface, "surface");
        k3.m0();
        EGLDisplay eGLDisplay = glCore.f55611a;
        EGLConfig eGLConfig = glCore.f55613c;
        Intrinsics.f(eGLConfig);
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        k3.n0("eglCreateWindowSurface");
        if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            Intrinsics.f(eglCreateWindowSurface);
            this.f22799c = eglCreateWindowSurface;
        } else {
            Intrinsics.checkNotNullParameter("surface was null", "message");
            throw new RendererException("surface was null");
        }
    }

    public b(b20.c viewPager, List pages, hz.g onPageScrolled) {
        this.f22797a = 26;
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(onPageScrolled, "onPageScrolled");
        this.f22798b = viewPager;
        this.f22799c = pages;
        viewPager.y(new hz.l(onPageScrolled, 0));
        ((b20.c) this.f22798b).x(false);
    }

    public b(d0 pinalytics, Function0 contextProvider) {
        this.f22797a = 25;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f22798b = pinalytics;
        this.f22799c = contextProvider;
    }

    public b(so.i editableScheduledPinFactory, so.j editablePinFactory) {
        this.f22797a = 23;
        Intrinsics.checkNotNullParameter(editableScheduledPinFactory, "editableScheduledPinFactory");
        Intrinsics.checkNotNullParameter(editablePinFactory, "editablePinFactory");
        this.f22798b = editableScheduledPinFactory;
        this.f22799c = editablePinFactory;
    }

    public b(mj.i iVar, mj.i iVar2) {
        this.f22797a = 9;
        d.h(iVar.f87246a <= iVar2.f87246a);
        this.f22798b = iVar;
        this.f22799c = iVar2;
    }
}
