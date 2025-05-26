package v;

import a.jg;
import android.content.Intent;
import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import com.pinterest.shuffles.composer.ui.widget.SceneViewContainer;
import com.pinterest.shuffles.composer.ui.widget.ZOrderIndicator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import kotlin.jvm.functions.Function1;
import v.z1;

/* loaded from: classes2.dex */
public final class z1 implements androidx.camera.core.impl.l1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f123756a;

    /* renamed from: b, reason: collision with root package name */
    public Object f123757b;

    /* renamed from: c, reason: collision with root package name */
    public Object f123758c;

    public z1(int i13) {
        if (i13 == 3) {
            this.f123757b = null;
            this.f123756a = false;
            this.f123758c = null;
        } else if (i13 != 9) {
            this.f123756a = true;
        } else {
            this.f123757b = new ArrayList();
            this.f123758c = new float[16];
        }
    }

    public static void a(z1 z1Var, vd0.a aVar) {
        z1Var.getClass();
        List e03 = kotlin.jvm.internal.r.e0(aVar);
        if (((dr.k) z1Var.f123758c).F.booleanValue()) {
            z1Var.g((List) e03.stream().filter(new ri2.c(z1Var, 2)).collect(Collectors.toList()), z1Var.f123756a);
        } else {
            z1Var.g(e03, z1Var.f123756a);
        }
    }

    public static boolean c(c0.z zVar, c0.z zVar2) {
        com.bumptech.glide.d.v("Fully specified range is not actually fully specified.", zVar2.b());
        int i13 = zVar.f24407a;
        int i14 = zVar2.f24407a;
        if (i13 == 2 && i14 == 1) {
            return false;
        }
        if (i13 != 2 && i13 != 0 && i13 != i14) {
            return false;
        }
        int i15 = zVar.f24408b;
        return i15 == 0 || i15 == zVar2.f24408b;
    }

    public static boolean d(c0.z zVar, c0.z zVar2, HashSet hashSet) {
        if (hashSet.contains(zVar2)) {
            return c(zVar, zVar2);
        }
        kh2.m0.p("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + zVar + "\nCandidate dynamic range:\n  " + zVar2);
        return false;
    }

    public static c0.z e(c0.z zVar, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (zVar.f24407a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c0.z zVar2 = (c0.z) it.next();
            com.bumptech.glide.d.s(zVar2, "Fully specified DynamicRange cannot be null.");
            com.bumptech.glide.d.v("Fully specified DynamicRange must have fully defined encoding.", zVar2.b());
            if (zVar2.f24407a != 1 && d(zVar, zVar2, hashSet)) {
                return zVar2;
            }
        }
        return null;
    }

    public static int f(ArrayList arrayList, int i13, je.p1 p1Var) {
        int i14 = 0;
        if (i13 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i13);
        je.n1 n1Var = p1Var.f75758b;
        if (obj != n1Var) {
            return -1;
        }
        Iterator it = n1Var.getChildren().iterator();
        while (it.hasNext()) {
            if (((je.r1) it.next()) == p1Var) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static ArrayList n(je.e eVar) {
        ArrayList arrayList = new ArrayList();
        while (!eVar.s()) {
            String str = null;
            if (!eVar.s()) {
                int i13 = eVar.f63178a;
                char charAt = ((String) eVar.f63180c).charAt(i13);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    eVar.f63178a = i13;
                } else {
                    int j13 = eVar.j();
                    while (true) {
                        if ((j13 < 65 || j13 > 90) && (j13 < 97 || j13 > 122)) {
                            break;
                        }
                        j13 = eVar.j();
                    }
                    str = ((String) eVar.f63180c).substring(i13, eVar.f63178a);
                }
            }
            if (str == null) {
                break;
            }
            try {
                arrayList.add(je.g.valueOf(str));
            } catch (IllegalArgumentException unused) {
            }
            if (!eVar.J()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean r(bb.p pVar, je.p pVar2, int i13, ArrayList arrayList, int i14, je.p1 p1Var) {
        je.q qVar = (je.q) pVar2.f75728a.get(i13);
        if (!w(pVar, qVar, p1Var)) {
            return false;
        }
        je.f fVar = je.f.DESCENDANT;
        je.f fVar2 = qVar.f75742a;
        if (fVar2 == fVar) {
            if (i13 == 0) {
                return true;
            }
            while (i14 >= 0) {
                if (u(pVar, pVar2, i13 - 1, arrayList, i14)) {
                    return true;
                }
                i14--;
            }
            return false;
        }
        if (fVar2 == je.f.CHILD) {
            return u(pVar, pVar2, i13 - 1, arrayList, i14);
        }
        int f13 = f(arrayList, i14, p1Var);
        if (f13 <= 0) {
            return false;
        }
        return r(pVar, pVar2, i13 - 1, arrayList, i14, (je.p1) p1Var.f75758b.getChildren().get(f13 - 1));
    }

    public static boolean t(bb.p pVar, je.p pVar2, je.p1 p1Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = p1Var.f75758b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((je.r1) obj).f75758b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = pVar2.f75728a;
        if (arrayList2 != null && arrayList2.size() == 1) {
            return w(pVar, (je.q) pVar2.f75728a.get(0), p1Var);
        }
        return r(pVar, pVar2, (pVar2.f75728a != null ? r0.size() : 0) - 1, arrayList, size, p1Var);
    }

    public static boolean u(bb.p pVar, je.p pVar2, int i13, ArrayList arrayList, int i14) {
        je.q qVar = (je.q) pVar2.f75728a.get(i13);
        je.p1 p1Var = (je.p1) arrayList.get(i14);
        if (!w(pVar, qVar, p1Var)) {
            return false;
        }
        je.f fVar = je.f.DESCENDANT;
        je.f fVar2 = qVar.f75742a;
        if (fVar2 == fVar) {
            if (i13 == 0) {
                return true;
            }
            while (i14 > 0) {
                i14--;
                if (u(pVar, pVar2, i13 - 1, arrayList, i14)) {
                    return true;
                }
            }
            return false;
        }
        if (fVar2 == je.f.CHILD) {
            return u(pVar, pVar2, i13 - 1, arrayList, i14 - 1);
        }
        int f13 = f(arrayList, i14, p1Var);
        if (f13 <= 0) {
            return false;
        }
        return r(pVar, pVar2, i13 - 1, arrayList, i14, (je.p1) p1Var.f75758b.getChildren().get(f13 - 1));
    }

    public static boolean w(bb.p pVar, je.q qVar, je.p1 p1Var) {
        ArrayList arrayList;
        String str = qVar.f75743b;
        if (str != null && !str.equals(p1Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = qVar.f75744c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                je.c cVar = (je.c) it.next();
                String str2 = cVar.f75563a;
                str2.getClass();
                boolean equals = str2.equals("id");
                String str3 = cVar.f75565c;
                if (equals) {
                    if (!str3.equals(p1Var.f75734c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = p1Var.f75738g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = qVar.f75745d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((je.h) it2.next()).a(pVar, p1Var)) {
                return false;
            }
        }
        return true;
    }

    public static void x(z1 z1Var, float f13, float f14, float f15, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 2) != 0) {
            f14 = 0.0f;
        }
        if ((i13 & 4) != 0) {
            f15 = 0.0f;
        }
        z1Var.b(new hd2.h(f13, f14, f15, 1));
    }

    public static void y(HashSet hashSet, c0.z zVar, gc.c cVar) {
        com.bumptech.glide.d.v("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set c13 = ((x.b) cVar.f64764b).c(zVar);
        if (c13.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(c13);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + zVar + "\nConstraints:\n  " + TextUtils.join("\n  ", c13) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    public final void A(int i13, int i14) {
        ZOrderIndicator g13 = ((SceneViewContainer) this.f123758c).g();
        rl2.u[] uVarArr = ZOrderIndicator.f51907n;
        g13.f51909a.d(g13, uVarArr[0], Integer.valueOf(i13));
        ZOrderIndicator g14 = ((SceneViewContainer) this.f123758c).g();
        g14.f51910b.d(g14, uVarArr[1], Integer.valueOf(i14));
    }

    public final a8.q B() {
        return new a8.q(Boolean.FALSE);
    }

    @Override // androidx.camera.core.impl.l1
    public final c0.n0 F() {
        Image image;
        synchronized (this.f123758c) {
            try {
                image = ((ImageReader) this.f123757b).acquireNextImage();
            } catch (RuntimeException e13) {
                if (!"ImageReaderContext is not initialized".equals(e13.getMessage())) {
                    throw e13;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new c0.b(image);
        }
    }

    public final void b(Function1 function1) {
        this.f123756a = false;
        ((List) this.f123757b).add(function1);
    }

    @Override // androidx.camera.core.impl.l1
    public final void close() {
        synchronized (this.f123758c) {
            ((ImageReader) this.f123757b).close();
        }
    }

    public final void g(List list, boolean z13) {
        dr.k kVar = (dr.k) this.f123758c;
        List c13 = fr.a.c(kVar.f56202q, kVar.f56199n, (String) this.f123757b);
        ((dr.k) this.f123758c).getClass();
        if (j22.a.PEOPLE_PICKER == j22.a.INVITE_FRIENDS) {
            List d2 = fr.a.d(100, ((dr.k) this.f123758c).f56199n, (String) this.f123757b);
            if (c13 == null || c13.isEmpty()) {
                c13 = d2;
            } else {
                c13.addAll(d2);
            }
        }
        list.size();
        c13.size();
        ((m60.d) m60.d.a()).g();
        if (!list.isEmpty() && !c13.isEmpty()) {
            list.addAll(c13);
            ((dr.k) this.f123758c).a((String) this.f123757b, list, Boolean.valueOf(z13));
        } else if (c13.isEmpty()) {
            ((dr.k) this.f123758c).a((String) this.f123757b, list, Boolean.valueOf(z13));
        } else {
            ((dr.k) this.f123758c).a((String) this.f123757b, c13, Boolean.valueOf(z13));
        }
    }

    public final void h(vd0.a aVar) {
        if (((String) this.f123757b).equalsIgnoreCase(((dr.k) this.f123758c).f56201p)) {
            new dr.j(this, aVar).b();
        }
        ((dr.k) this.f123758c).i(false);
    }

    @Override // androidx.camera.core.impl.l1
    public final int i() {
        int height;
        synchronized (this.f123758c) {
            height = ((ImageReader) this.f123757b).getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.l1
    public final int j() {
        int width;
        synchronized (this.f123758c) {
            width = ((ImageReader) this.f123757b).getWidth();
        }
        return width;
    }

    public final void k(za.c cVar, je.e eVar) {
        int intValue;
        char charAt;
        int M;
        String O = eVar.O();
        eVar.K();
        if (O == null) {
            throw new je.a("Invalid '@' rule");
        }
        int i13 = 0;
        if (!this.f123756a && O.equals("media")) {
            ArrayList n13 = n(eVar);
            if (!eVar.p('{')) {
                throw new je.a("Invalid @media rule: missing rule set");
            }
            eVar.K();
            je.g gVar = (je.g) this.f123757b;
            Iterator it = n13.iterator();
            while (it.hasNext()) {
                je.g gVar2 = (je.g) it.next();
                if (gVar2 == je.g.all || gVar2 == gVar) {
                    this.f123756a = true;
                    cVar.c(q(eVar));
                    this.f123756a = false;
                    break;
                }
            }
            q(eVar);
            if (!eVar.s() && !eVar.p('}')) {
                throw new je.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f123756a || !O.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + O + " rule");
            while (!eVar.s() && ((intValue = eVar.y().intValue()) != 59 || i13 != 0)) {
                if (intValue == 123) {
                    i13++;
                } else if (intValue == 125 && i13 > 0 && i13 - 1 == 0) {
                    break;
                }
            }
        } else {
            String str = null;
            if (!eVar.s()) {
                int i14 = eVar.f63178a;
                if (eVar.q("url(")) {
                    eVar.K();
                    String N = eVar.N();
                    if (N == null) {
                        StringBuilder sb3 = new StringBuilder();
                        while (!eVar.s() && (charAt = ((String) eVar.f63180c).charAt(eVar.f63178a)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !g.i.w(charAt) && !Character.isISOControl((int) charAt)) {
                            eVar.f63178a++;
                            if (charAt == '\\') {
                                if (!eVar.s()) {
                                    String str2 = (String) eVar.f63180c;
                                    int i15 = eVar.f63178a;
                                    eVar.f63178a = i15 + 1;
                                    charAt = str2.charAt(i15);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int M2 = je.e.M(charAt);
                                        if (M2 != -1) {
                                            for (int i16 = 1; i16 <= 5 && !eVar.s() && (M = je.e.M(((String) eVar.f63180c).charAt(eVar.f63178a))) != -1; i16++) {
                                                eVar.f63178a++;
                                                M2 = (M2 * 16) + M;
                                            }
                                            sb3.append((char) M2);
                                        }
                                    }
                                }
                            }
                            sb3.append(charAt);
                        }
                        N = sb3.length() == 0 ? null : sb3.toString();
                    }
                    if (N == null) {
                        eVar.f63178a = i14;
                    } else {
                        eVar.K();
                        if (eVar.s() || eVar.q(")")) {
                            str = N;
                        } else {
                            eVar.f63178a = i14;
                        }
                    }
                }
            }
            if (str == null) {
                str = eVar.N();
            }
            if (str == null) {
                throw new je.a("Invalid @import rule: expected string or url()");
            }
            eVar.K();
            n(eVar);
            if (!eVar.s() && !eVar.p(';')) {
                throw new je.a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        eVar.K();
    }

    @Override // androidx.camera.core.impl.l1
    public final c0.n0 l() {
        Image image;
        synchronized (this.f123758c) {
            try {
                image = ((ImageReader) this.f123757b).acquireLatestImage();
            } catch (RuntimeException e13) {
                if (!"ImageReaderContext is not initialized".equals(e13.getMessage())) {
                    throw e13;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new c0.b(image);
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final int m() {
        int imageFormat;
        synchronized (this.f123758c) {
            imageFormat = ((ImageReader) this.f123757b).getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.l1
    public final void o() {
        synchronized (this.f123758c) {
            this.f123756a = true;
            ((ImageReader) this.f123757b).setOnImageAvailableListener(null, null);
        }
    }

    public final boolean p(za.c cVar, je.e eVar) {
        ArrayList P = eVar.P();
        if (P == null || P.isEmpty()) {
            return false;
        }
        if (!eVar.p('{')) {
            throw new je.a("Malformed rule block: expected '{'");
        }
        eVar.K();
        je.j1 j1Var = new je.j1();
        do {
            String O = eVar.O();
            eVar.K();
            if (!eVar.p(':')) {
                throw new je.a("Expected ':'");
            }
            eVar.K();
            String str = null;
            if (!eVar.s()) {
                int i13 = eVar.f63178a;
                int charAt = ((String) eVar.f63180c).charAt(i13);
                int i14 = i13;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!g.i.w(charAt)) {
                        i14 = eVar.f63178a + 1;
                    }
                    charAt = eVar.j();
                }
                if (eVar.f63178a > i13) {
                    str = ((String) eVar.f63180c).substring(i13, i14);
                } else {
                    eVar.f63178a = i13;
                }
            }
            if (str == null) {
                throw new je.a("Expected property value");
            }
            eVar.K();
            if (eVar.p('!')) {
                eVar.K();
                if (!eVar.q("important")) {
                    throw new je.a("Malformed rule set: found unexpected '!'");
                }
                eVar.K();
            }
            eVar.p(';');
            je.f3.G(j1Var, O, str);
            eVar.K();
            if (eVar.s()) {
                break;
            }
        } while (!eVar.p('}'));
        eVar.K();
        Iterator it = P.iterator();
        while (it.hasNext()) {
            je.p pVar = (je.p) it.next();
            je.r rVar = (je.r) this.f123758c;
            je.o oVar = new je.o();
            oVar.f75716a = pVar;
            oVar.f75717b = j1Var;
            oVar.f75718c = rVar;
            cVar.b(oVar);
        }
        return true;
    }

    public final za.c q(je.e eVar) {
        za.c cVar = new za.c(1);
        while (!eVar.s()) {
            try {
                if (!eVar.q("<!--") && !eVar.q("-->")) {
                    if (!eVar.p('@')) {
                        if (!p(cVar, eVar)) {
                            break;
                        }
                    } else {
                        k(cVar, eVar);
                    }
                }
            } catch (je.a e13) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e13.getMessage());
            }
        }
        return cVar;
    }

    @Override // androidx.camera.core.impl.l1
    public final int s() {
        int maxImages;
        synchronized (this.f123758c) {
            maxImages = ((ImageReader) this.f123757b).getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.l1
    public final void v(final androidx.camera.core.impl.k1 k1Var, final Executor executor) {
        synchronized (this.f123758c) {
            this.f123756a = false;
            ((ImageReader) this.f123757b).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: c0.c
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    z1 z1Var = z1.this;
                    Executor executor2 = executor;
                    androidx.camera.core.impl.k1 k1Var2 = k1Var;
                    synchronized (z1Var.f123758c) {
                        try {
                            if (!z1Var.f123756a) {
                                executor2.execute(new jg(12, z1Var, k1Var2));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }, e0.t.s());
        }
    }

    @Override // androidx.camera.core.impl.l1
    public final Surface z() {
        Surface surface;
        synchronized (this.f123758c) {
            surface = ((ImageReader) this.f123757b).getSurface();
        }
        return surface;
    }

    public z1(Set set, boolean z13) {
        this.f123757b = "com.google.android.gms.fido";
        this.f123758c = set;
        this.f123756a = z13;
    }

    public z1(ImageReader imageReader) {
        this.f123758c = new Object();
        this.f123756a = true;
        this.f123757b = imageReader;
    }

    public z1(je.g gVar, je.r rVar) {
        this.f123756a = false;
        this.f123757b = gVar;
        this.f123758c = rVar;
    }

    public z1(Intent intent, Bundle bundle, boolean z13) {
        this.f123757b = intent;
        this.f123758c = bundle;
        this.f123756a = z13;
    }

    public z1(dr.k kVar, String str, boolean z13) {
        this.f123758c = kVar;
        this.f123757b = str;
        this.f123756a = z13;
    }
}
