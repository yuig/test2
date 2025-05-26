package c50;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.util.Log;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import io.jsonwebtoken.Header;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements l82.f, kk.g, kk.e, kk.f, cl.d, com.google.crypto.tink.shaded.protobuf.i0, com.google.crypto.tink.shaded.protobuf.i, ll.t, pm.p, nr0.p {

    /* renamed from: a */
    public final /* synthetic */ int f25918a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1() {
        this(12);
        this.f25918a = 12;
    }

    public static void p(ClassLoader classLoader, HashSet hashSet, c1 c1Var) {
        Object[] objArr;
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(((File) it.next()).getParentFile());
        }
        int i13 = 8;
        Object J2 = new gi.m((Object) classLoader, (Object) rl2.g0.q0(classLoader, "pathList"), (Serializable) Object.class, i13).J();
        gi.m mVar = new gi.m(J2, (Object) rl2.g0.q0(J2, "nativeLibraryDirectories"), (Serializable) List.class, i13);
        synchronized (jk.r.class) {
            ArrayList arrayList = new ArrayList((Collection) mVar.J());
            hashSet2.removeAll(arrayList);
            arrayList.addAll(hashSet2);
            mVar.K(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(hashSet2);
        switch (c1Var.f25918a) {
            case 1:
                objArr = (Object[]) rl2.g0.p0(J2, "makePathElements", List.class, arrayList3, null, List.class, arrayList2);
                break;
            default:
                objArr = (Object[]) rl2.g0.o0(J2, "makePathElements", Object[].class, List.class, arrayList3);
                break;
        }
        if (arrayList2.isEmpty()) {
            synchronized (jk.r.class) {
                rl2.g0.n0(Object.class, J2, "nativeLibraryPathElements").M(Arrays.asList(objArr));
            }
            return;
        }
        zzbh zzbhVar = new zzbh("Error in makePathElements");
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i14));
            } catch (Exception unused) {
            }
        }
        throw zzbhVar;
    }

    public static boolean r(ClassLoader classLoader, File file, File file2, boolean z13) {
        return kp.n.C0(classLoader, file, file2, z13, new c1(0), Header.COMPRESSION_ALGORITHM, new kp.n(27));
    }

    @Override // l82.f
    public l82.h D(l82.h engineRequest) {
        switch (this.f25918a) {
            case 0:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                com.pinterest.widget.configuration.q qVar = (com.pinterest.widget.configuration.q) engineRequest;
                com.pinterest.widget.configuration.p pVar = qVar instanceof com.pinterest.widget.configuration.p ? (com.pinterest.widget.configuration.p) qVar : null;
                if (pVar != null) {
                    return pVar.f52846a;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                com.pinterest.widget.configuration.q qVar2 = (com.pinterest.widget.configuration.q) engineRequest;
                if (qVar2 instanceof com.pinterest.widget.configuration.n) {
                    return (com.pinterest.widget.configuration.n) qVar2;
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l82.f
    public u50.s E(u50.s anotherEvent) {
        switch (this.f25918a) {
            case 0:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return (cd2.g) ((Void) anotherEvent);
            default:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new cd2.f((com.pinterest.widget.configuration.i) anotherEvent);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public byte[] a(byte[] bArr, int i13, int i14) {
        return Arrays.copyOfRange(bArr, i13, i14 + i13);
    }

    @Override // cl.d
    public int b() {
        return 32;
    }

    @Override // nr0.p
    public boolean c() {
        return true;
    }

    public Object d(String str, Provider provider) {
        switch (this.f25918a) {
            case 21:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 22:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 23:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 24:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 25:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 26:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // nr0.p
    public boolean e(int i13) {
        return true;
    }

    @Override // nr0.p
    public boolean f(int i13) {
        switch (this.f25918a) {
        }
        return RecyclerViewTypes.FULL_SPAN_ITEM_TYPES.contains(Integer.valueOf(i13));
    }

    @Override // cl.d
    public byte[] g() {
        return cl.k.f27966k;
    }

    @Override // nr0.p
    public int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER;
    }

    @Override // nr0.p
    public boolean h(int i13) {
        return true;
    }

    @Override // cl.d
    public byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3, int i13, byte[] bArr4) {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        yk.d dVar = wk.t.f130088b;
        a.g gVar = wk.k.f130069g;
        int i14 = 0;
        if (!(((Cipher) gVar.get()) != null)) {
            wk.r rVar = new wk.r(bArr, i14);
            if (bArr3.length > 2147483631) {
                throw new GeneralSecurityException("plaintext too long");
            }
            ByteBuffer allocate = ByteBuffer.allocate(bArr3.length + 16);
            rVar.b(allocate, bArr2, bArr3, bArr4);
            byte[] array = allocate.array();
            if (array.length > Integer.MAX_VALUE - i13) {
                throw new InvalidAlgorithmParameterException("Plaintext too long");
            }
            byte[] bArr5 = new byte[array.length + i13];
            System.arraycopy(array, 0, bArr5, i13, array.length);
            return bArr5;
        }
        wk.t tVar = new wk.t(bArr);
        if (bArr3 == null) {
            throw new NullPointerException("plaintext is null");
        }
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("nonce length must be 12 bytes.");
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = (Cipher) gVar.get();
        cipher.init(1, tVar.f130089a, ivParameterSpec);
        if (bArr4.length != 0) {
            cipher.updateAAD(bArr4);
        }
        int outputSize = cipher.getOutputSize(bArr3.length);
        if (outputSize > Integer.MAX_VALUE - i13) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr6 = new byte[i13 + outputSize];
        if (cipher.doFinal(bArr3, 0, bArr3.length, bArr6, i13) == outputSize) {
            return bArr6;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // kk.e
    public boolean k(ClassLoader classLoader, File file, File file2, boolean z13) {
        switch (this.f25918a) {
        }
        return kp.n.C0(classLoader, file, file2, z13, new c1(0), "path", new c1(6));
    }

    @Override // kk.e
    public void l(ClassLoader classLoader, HashSet hashSet) {
        switch (this.f25918a) {
            case 2:
                p(classLoader, hashSet, new c1(1));
                break;
            case 3:
                p(classLoader, hashSet, new c1(1));
                break;
            case 4:
                p(classLoader, hashSet, new c1(1));
                break;
            case 5:
            case 6:
            default:
                p(classLoader, hashSet, new c1(5));
                break;
            case 7:
                p(classLoader, hashSet, new c1(5));
                break;
        }
    }

    @Override // nr0.p
    public boolean m() {
        return true;
    }

    public pc.m0 n() {
        switch (this.f25918a) {
            case 0:
                return d1.f25941b;
            case 1:
                return e1.f25965b;
            case 2:
                return f1.f25989b;
            case 3:
                return k1.f26104b;
            case 4:
                return l1.f26124b;
            case 5:
                return m1.f26148b;
            case 6:
                return s1.f26284b;
            case 7:
                return x1.f26438b;
            case 8:
                return y1.f26460b;
            case 9:
                return z1.f26482b;
            case 10:
                return a2.f25873b;
            case 11:
                return b2.f25897b;
            case 12:
                return d2.f25943b;
            case 13:
                return e2.f25967b;
            case 14:
                return f2.f25991b;
            case 15:
                return g2.f26014b;
            case 16:
                return h2.f26037b;
            case 17:
                return i2.f26060b;
            case 18:
                return j2.f26084b;
            case 19:
            default:
                return v2.f26397b;
            case 20:
                return l2.f26126b;
            case 21:
                return m2.f26150b;
            case 22:
                return n2.f26173b;
            case 23:
                return o2.f26196b;
            case 24:
                return p2.f26220b;
            case 25:
                return q2.f26242b;
            case 26:
                return r2.f26264b;
            case 27:
                return t2.f26306b;
            case 28:
                return u2.f26375b;
        }
    }

    public void o(fo.a protocol, Object obj) {
        byte b13;
        byte b14;
        byte b15;
        byte b16;
        byte b17;
        byte b18;
        byte b19;
        byte b23;
        byte b24;
        byte b25;
        byte b26;
        byte b27;
        byte b28;
        byte b29;
        switch (this.f25918a) {
            case 0:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("ModuleData", "structName");
                throw null;
            case 1:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("NativeCheckoutData", "structName");
                throw null;
            case 2:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("NetworkStoryImpression", "structName");
                throw null;
            case 3:
                h32.n1 struct = (h32.n1) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct, "struct");
                fo.b bVar = (fo.b) protocol;
                bVar.getClass();
                Intrinsics.checkNotNullParameter("NewsHubData", "structName");
                if (struct.f67152a != null) {
                    protocol.e("newsIdStr", 1, (byte) 11);
                    protocol.m(struct.f67152a);
                }
                Short sh3 = struct.f67153b;
                if (sh3 != null) {
                    b13 = 6;
                    n60.o.s(protocol, "newsType", 2, (byte) 6, sh3);
                } else {
                    b13 = 6;
                }
                Short sh4 = struct.f67154c;
                if (sh4 != null) {
                    n60.o.s(protocol, "newsIndex", 3, b13, sh4);
                }
                Short sh5 = struct.f67155d;
                if (sh5 != null) {
                    n60.o.s(protocol, "displayMode", 4, b13, sh5);
                }
                bVar.c((byte) 0);
                return;
            case 4:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("NotificationImpression", "structName");
                throw null;
            case 5:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("OffsiteServiceResult", "structName");
                throw null;
            case 6:
                h32.u1 struct2 = (h32.u1) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct2, "struct");
                fo.b bVar2 = (fo.b) protocol;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter("OneBarModuleImpression", "structName");
                if (struct2.f67269a != null) {
                    b14 = 10;
                    protocol.e("moduleId", 1, (byte) 10);
                    protocol.h(struct2.f67269a.longValue());
                } else {
                    b14 = 10;
                }
                Long l13 = struct2.f67270b;
                if (l13 != null) {
                    n60.o.r(protocol, "time", 2, b14, l13);
                }
                Long l14 = struct2.f67271c;
                if (l14 != null) {
                    n60.o.r(protocol, "endTime", 3, b14, l14);
                }
                Short sh6 = struct2.f67272d;
                if (sh6 != null) {
                    n60.o.s(protocol, "slotIndex", 4, (byte) 6, sh6);
                }
                Short sh7 = struct2.f67273e;
                if (sh7 != null) {
                    n60.o.s(protocol, "moduleType", 5, (byte) 6, sh7);
                }
                String str = struct2.f67274f;
                if (str != null) {
                    b15 = 11;
                    protocol.e("moduleName", 6, (byte) 11);
                    protocol.m(str);
                } else {
                    b15 = 11;
                }
                String str2 = struct2.f67275g;
                if (str2 != null) {
                    protocol.e("clientTrackingParams", 7, b15);
                    protocol.m(str2);
                }
                bVar2.c((byte) 0);
                return;
            case 7:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PfyPreferenceChange", "structName");
                throw null;
            case 8:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PhantomRawResult", "structName");
                throw null;
            case 9:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PhantomRedirectHeaders", "structName");
                throw null;
            case 10:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PhantomRedirectResult", "structName");
                throw null;
            case 11:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PhantomScraperResult", "structName");
                throw null;
            case 12:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PhantomServiceResult", "structName");
                throw null;
            case 13:
                h32.w1 struct3 = (h32.w1) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct3, "struct");
                fo.b bVar3 = (fo.b) protocol;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter("PinCarouselSlotEventData", "structName");
                if (struct3.f67350a != null) {
                    b16 = 10;
                    protocol.e("carouselDataId", 1, (byte) 10);
                    protocol.h(struct3.f67350a.longValue());
                } else {
                    b16 = 10;
                }
                Long l15 = struct3.f67351b;
                if (l15 != null) {
                    n60.o.r(protocol, "carouselSlotId", 2, b16, l15);
                }
                Short sh8 = struct3.f67352c;
                if (sh8 != null) {
                    n60.o.s(protocol, "carouselSlotIndex", 3, (byte) 6, sh8);
                }
                String str3 = struct3.f67353d;
                if (str3 != null) {
                    protocol.e("carouselImageSignature", 4, (byte) 11);
                    protocol.m(str3);
                }
                Short sh9 = struct3.f67354e;
                if (sh9 != null) {
                    n60.o.s(protocol, "toCarouselSlotIndex", 6, (byte) 6, sh9);
                }
                Long l16 = struct3.f67355f;
                if (l16 != null) {
                    n60.o.r(protocol, "internalItemId", 7, (byte) 10, l16);
                }
                bVar3.c((byte) 0);
                return;
            case 14:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PinClusterImpression", "structName");
                throw null;
            case 15:
                h32.b2 struct4 = (h32.b2) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct4, "struct");
                fo.b bVar4 = (fo.b) protocol;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter("PinImpressionClickEvent", "structName");
                if (struct4.f66883a != null) {
                    b17 = 8;
                    protocol.e("xPosition", 1, (byte) 8);
                    protocol.g(struct4.f66883a.intValue());
                } else {
                    b17 = 8;
                }
                Integer num = struct4.f66884b;
                if (num != null) {
                    n60.o.q(protocol, "yPosition", 2, b17, num);
                }
                Long l17 = struct4.f66885c;
                if (l17 != null) {
                    n60.o.r(protocol, "time", 3, (byte) 10, l17);
                }
                bVar4.c((byte) 0);
                return;
            case 16:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PinInfo", "structName");
                throw null;
            case 17:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PinPromotionEvent", "structName");
                throw null;
            case 18:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("PortalImpression", "structName");
                throw null;
            case 19:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("ProductGroupImpression", "structName");
                throw null;
            case 20:
                h32.l2 struct5 = (h32.l2) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct5, "struct");
                fo.b bVar5 = (fo.b) protocol;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter("QuizEventData", "structName");
                if (struct5.f67138a != null) {
                    protocol.e("resultPinId", 1, (byte) 10);
                    protocol.h(struct5.f67138a.longValue());
                }
                bVar5.c((byte) 0);
                return;
            case 21:
                h32.m2 struct6 = (h32.m2) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct6, "struct");
                fo.b bVar6 = (fo.b) protocol;
                bVar6.getClass();
                Intrinsics.checkNotNullParameter("RelatedPinsFilterImpression", "structName");
                if (struct6.f67143a != null) {
                    b18 = 11;
                    protocol.e("filterTabIdStr", 1, (byte) 11);
                    protocol.m(struct6.f67143a);
                } else {
                    b18 = 11;
                }
                String str4 = struct6.f67144b;
                if (str4 != null) {
                    protocol.e("queryPinIdStr", 2, b18);
                    protocol.m(str4);
                }
                String str5 = struct6.f67145c;
                if (str5 != null) {
                    protocol.e("name", 3, b18);
                    protocol.m(str5);
                }
                Short sh10 = struct6.f67146d;
                if (sh10 != null) {
                    b19 = 6;
                    n60.o.s(protocol, "filterTabType", 4, (byte) 6, sh10);
                } else {
                    b19 = 6;
                }
                Long l18 = struct6.f67147e;
                if (l18 != null) {
                    b23 = 10;
                    n60.o.r(protocol, "time", 5, (byte) 10, l18);
                } else {
                    b23 = 10;
                }
                Long l19 = struct6.f67148f;
                if (l19 != null) {
                    n60.o.r(protocol, "endTime", b19, b23, l19);
                }
                Short sh11 = struct6.f67149g;
                if (sh11 != null) {
                    n60.o.s(protocol, "totalObjectCount", 7, b19, sh11);
                }
                Short sh12 = struct6.f67150h;
                if (sh12 != null) {
                    n60.o.s(protocol, "carouselSlotIndex", 8, b19, sh12);
                }
                bVar6.c((byte) 0);
                return;
            case 22:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("RequestInfo", "structName");
                throw null;
            case 23:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("RuleResult", "structName");
                throw null;
            case 24:
                h32.n2 struct7 = (h32.n2) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct7, "struct");
                fo.b bVar7 = (fo.b) protocol;
                bVar7.getClass();
                Intrinsics.checkNotNullParameter("SearchImpression", "structName");
                if (struct7.f67157a != null) {
                    b24 = 11;
                    protocol.e("term", 1, (byte) 11);
                    protocol.m(struct7.f67157a);
                } else {
                    b24 = 11;
                }
                String str6 = struct7.f67158b;
                if (str6 != null) {
                    protocol.e("imageSignature", 2, b24);
                    protocol.m(str6);
                }
                String str7 = struct7.f67159c;
                if (str7 != null) {
                    protocol.e("insertionId", 3, b24);
                    protocol.m(str7);
                }
                Long l23 = struct7.f67160d;
                if (l23 != null) {
                    b25 = 10;
                    n60.o.r(protocol, "time", 4, (byte) 10, l23);
                } else {
                    b25 = 10;
                }
                Long l24 = struct7.f67161e;
                if (l24 != null) {
                    n60.o.r(protocol, "endTime", 5, b25, l24);
                }
                Integer num2 = struct7.f67162f;
                if (num2 != null) {
                    n60.o.q(protocol, "yPosition", 6, (byte) 8, num2);
                }
                Short sh13 = struct7.f67163g;
                if (sh13 != null) {
                    n60.o.s(protocol, "slotIndex", 7, (byte) 6, sh13);
                }
                Long l25 = struct7.f67164h;
                if (l25 != null) {
                    n60.o.r(protocol, "storyId", 8, (byte) 10, l25);
                }
                Short sh14 = struct7.f67165i;
                if (sh14 != null) {
                    n60.o.s(protocol, "storyIndex", 9, (byte) 6, sh14);
                }
                String str8 = struct7.f67166j;
                if (str8 != null) {
                    protocol.e("storyIdStr", 10, (byte) 11);
                    protocol.m(str8);
                }
                bVar7.c((byte) 0);
                return;
            case 25:
                h32.p2 struct8 = (h32.p2) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct8, "struct");
                fo.b bVar8 = (fo.b) protocol;
                bVar8.getClass();
                Intrinsics.checkNotNullParameter("ShowcaseEventData", "structName");
                if (struct8.f67177a != null) {
                    b26 = 10;
                    protocol.e("subpagePinId", 1, (byte) 10);
                    protocol.h(struct8.f67177a.longValue());
                } else {
                    b26 = 10;
                }
                Long l26 = struct8.f67178b;
                if (l26 != null) {
                    n60.o.r(protocol, "subpinPinId", 2, b26, l26);
                }
                String str9 = struct8.f67179c;
                if (str9 != null) {
                    protocol.e("imageSignature", 3, (byte) 11);
                    protocol.m(str9);
                }
                String str10 = struct8.f67180d;
                if (str10 != null) {
                    protocol.e("pinIdStr", 4, (byte) 11);
                    protocol.m(str10);
                }
                Long l27 = struct8.f67181e;
                if (l27 != null) {
                    n60.o.r(protocol, "pinId", 5, (byte) 10, l27);
                }
                bVar8.c((byte) 0);
                return;
            case 26:
                h32.q2 struct9 = (h32.q2) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct9, "struct");
                fo.b bVar9 = (fo.b) protocol;
                bVar9.getClass();
                Intrinsics.checkNotNullParameter("ShowcaseImpression", "structName");
                if (struct9.f67189a != null) {
                    protocol.e("pinIdStr", 1, (byte) 11);
                    protocol.m(struct9.f67189a);
                }
                Long l28 = struct9.f67190b;
                if (l28 != null) {
                    b27 = 10;
                    n60.o.r(protocol, "pinId", 2, (byte) 10, l28);
                } else {
                    b27 = 10;
                }
                String str11 = struct9.f67191c;
                if (str11 != null) {
                    protocol.e("insertionId", 3, (byte) 11);
                    protocol.m(str11);
                }
                Long l29 = struct9.f67192d;
                if (l29 != null) {
                    n60.o.r(protocol, "time", 5, b27, l29);
                }
                Long l33 = struct9.f67193e;
                if (l33 != null) {
                    n60.o.r(protocol, "endTime", 6, b27, l33);
                }
                Long l34 = struct9.f67194f;
                if (l34 != null) {
                    n60.o.r(protocol, "subpagePinId", 7, b27, l34);
                }
                Long l35 = struct9.f67195g;
                if (l35 != null) {
                    n60.o.r(protocol, "subpinPinId", 8, b27, l35);
                }
                String str12 = struct9.f67196h;
                if (str12 != null) {
                    protocol.e("imageSignature", 9, (byte) 11);
                    protocol.m(str12);
                }
                bVar9.c((byte) 0);
                return;
            case 27:
                h32.r2 struct10 = (h32.r2) obj;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(struct10, "struct");
                fo.b bVar10 = (fo.b) protocol;
                bVar10.getClass();
                Intrinsics.checkNotNullParameter("ShuffleImpression", "structName");
                if (struct10.f67219a != null) {
                    protocol.e("shuffleId", 1, (byte) 10);
                    protocol.h(struct10.f67219a.longValue());
                }
                String str13 = struct10.f67220b;
                if (str13 != null) {
                    protocol.e("shuffleIdStr", 2, (byte) 11);
                    protocol.m(str13);
                }
                Long l36 = struct10.f67221c;
                if (l36 != null) {
                    b28 = 10;
                    n60.o.r(protocol, "time", 3, (byte) 10, l36);
                } else {
                    b28 = 10;
                }
                Long l37 = struct10.f67222d;
                if (l37 != null) {
                    n60.o.r(protocol, "endTime", 4, b28, l37);
                }
                Integer num3 = struct10.f67223e;
                if (num3 != null) {
                    n60.o.q(protocol, "yPosition", 5, (byte) 8, num3);
                }
                Short sh15 = struct10.f67224f;
                if (sh15 != null) {
                    b29 = 6;
                    n60.o.s(protocol, "columnIndex", 6, (byte) 6, sh15);
                } else {
                    b29 = 6;
                }
                Short sh16 = struct10.f67225g;
                if (sh16 != null) {
                    n60.o.s(protocol, "slotIndex", 7, b29, sh16);
                }
                String str14 = struct10.f67226h;
                if (str14 != null) {
                    protocol.e("requestId", 8, (byte) 11);
                    protocol.m(str14);
                }
                Double d2 = struct10.f67227i;
                if (d2 != null) {
                    protocol.e("renderDuration", 9, (byte) 4);
                    protocol.d(d2.doubleValue());
                }
                String str15 = struct10.f67228j;
                if (str15 != null) {
                    protocol.e("clientTrackingParams", 10, (byte) 11);
                    protocol.m(str15);
                }
                bVar10.c((byte) 0);
                return;
            case 28:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("SignupData", "structName");
                throw null;
            default:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(null, "struct");
                ((fo.b) protocol).getClass();
                Intrinsics.checkNotNullParameter("SpamServiceRequest", "structName");
                throw null;
        }
    }

    @Override // nr0.p
    public boolean q(int i13) {
        switch (this.f25918a) {
        }
        return RecyclerViewTypes.INSTANCE.getFULL_BLEED_ITEM_TYPES().contains(Integer.valueOf(i13));
    }

    @Override // pm.p
    public Object u() {
        switch (this.f25918a) {
            case 28:
                return new TreeSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // kk.f
    public boolean w(Object obj, File file, File file2) {
        switch (this.f25918a) {
            case 6:
                try {
                    Class<?> cls = Class.forName("dalvik.system.DexFile");
                    try {
                        if (!((Boolean) Boolean.class.cast(rl2.g0.r0(cls, "isDexOptNeeded", String.class).invoke(null, file.getPath()))).booleanValue()) {
                            return true;
                        }
                    } catch (Exception e13) {
                        throw new zzbl("Failed to invoke static method isDexOptNeeded on type " + cls, e13);
                    }
                } catch (ClassNotFoundException unused) {
                    Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
                }
                return false;
            default:
                return true;
        }
    }

    @Override // kk.g
    public Object[] x(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) rl2.g0.p0(obj, "makePathElements", List.class, arrayList, file, List.class, arrayList2);
    }

    public /* synthetic */ c1(int i13) {
        this.f25918a = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i13, int i14) {
        this(0);
        this.f25918a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Object obj) {
        this(20);
        this.f25918a = 20;
    }
}
