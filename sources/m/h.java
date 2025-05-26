package m;

import a.a4;
import a.ig;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.u0;
import androidx.recyclerview.widget.i1;
import androidx.recyclerview.widget.o3;
import c0.m1;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.sb;
import com.google.android.gms.internal.measurement.x;
import d7.n0;
import el.i0;
import g1.o0;
import h32.f1;
import h32.v0;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import kh2.m0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l0.r;
import l0.s;
import l0.u;
import l0.v;
import l0.w;
import n.d0;
import oi.g4;
import oi.u6;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pk.a0;
import so.oa;
import so.u8;
import v.c3;
import v9.h0;
import vk.b0;
import vk.k0;
import vk.l0;
import vk.t;

/* loaded from: classes2.dex */
public final class h implements b, c3, l9.l, o3, ik.d, jk.n, we2.a {

    /* renamed from: f */
    public static h f85195f;

    /* renamed from: a */
    public final /* synthetic */ int f85196a;

    /* renamed from: b */
    public Object f85197b;

    /* renamed from: c */
    public Object f85198c;

    /* renamed from: d */
    public Object f85199d;

    /* renamed from: e */
    public Object f85200e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h() {
        this(17);
        this.f85196a = 17;
    }

    public static h G(vd0.c cVar) {
        String o13 = cVar.o("id", "");
        String str = !a0.x0(o13) ? o13.split(":")[0] : "";
        String o14 = cVar.o("experience_id", "");
        ArrayList arrayList = new ArrayList();
        vd0.c m13 = cVar.m("display_data");
        if (m13 != null && ((pm.l) m13.f125623a.f91366a.entrySet()).size() > 0) {
            if (m13.e("steps")) {
                ArrayList arrayList2 = new ArrayList();
                vd0.a k13 = m13.k("steps");
                int d2 = k13.d();
                for (int i13 = 0; i13 < d2; i13++) {
                    arrayList2.add(new eg0.b(k13.j(i13)));
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(new eg0.b(m13));
            }
        }
        return new h(o13, str, o14, arrayList, 26);
    }

    public final eg0.b A(int i13) {
        Object obj = this.f85200e;
        if (((List) obj) == null || i13 < 0 || ((List) obj).size() <= i13) {
            return null;
        }
        return (eg0.b) ((List) this.f85200e).get(i13);
    }

    public final Menu B(n.o oVar) {
        Menu menu = (Menu) ((o0) this.f85200e).get(oVar);
        if (menu != null) {
            return menu;
        }
        d0 d0Var = new d0((Context) this.f85198c, oVar);
        ((o0) this.f85200e).put(oVar, d0Var);
        return d0Var;
    }

    public final String C() {
        return (String) this.f85198c;
    }

    public final void D(String name, String str, HashMap hashMap) {
        String k13;
        v0 v0Var;
        Intrinsics.checkNotNullParameter(name, "name");
        String D = a.a.D((String) this.f85198c, "_", name);
        if (hashMap == null) {
            k13 = "";
        } else {
            vb0.j.f125466a.S(hashMap.keySet().size() <= 12, "auxData tags cannot exceed size of: 12", new Object[0]);
            k13 = ((nm.o) this.f85200e).k(hashMap);
            Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
        }
        nx.d0 d0Var = (nx.d0) this.f85197b;
        f1 f1Var = f1.GENERIC_STAT_LOG_EVENT;
        HashMap x13 = a.a.x("name", D, "statslog_tags", k13);
        Unit unit = Unit.f80348a;
        if (str != null) {
            v0Var = new v0();
            v0Var.G = str;
        } else {
            v0Var = null;
        }
        d0Var.H(f1Var, null, null, x13, v0Var, false);
    }

    @Override // l9.l
    public final int E() {
        return 2;
    }

    public final void F(HashMap baseTags, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(baseTags, "baseTags");
        if (hashMap != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((HashMap) this.f85199d).containsKey((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            baseTags.putAll(linkedHashMap);
        }
    }

    public final void H() {
        ((u) this.f85197b).a();
        f0.h.m0(new ig(this, 22));
    }

    public final void I(vk.c cVar) {
        this.f85200e = cVar;
    }

    public final void J(k0 k0Var) {
        this.f85199d = k0Var;
    }

    public final void K(String str) {
        this.f85198c = str;
    }

    public final void L(l0 l0Var) {
        this.f85197b = l0Var;
    }

    public final w M(l0.c cVar) {
        s sVar;
        Rect rect;
        f0.h.s();
        this.f85200e = cVar;
        this.f85199d = new w();
        Iterator it = cVar.f81203b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sVar = cVar.f81202a;
            if (hasNext) {
                n0.c cVar2 = (n0.c) it.next();
                w wVar = (w) this.f85199d;
                Rect rect2 = cVar2.f88736d;
                Matrix matrix = new Matrix(sVar.f81268b);
                RectF rectF = new RectF(rect2);
                RectF rectF2 = e0.u.f56755a;
                float f13 = 0;
                Size size = cVar2.f88737e;
                RectF rectF3 = new RectF(f13, f13, size.getWidth(), size.getHeight());
                int i13 = cVar2.f88738f;
                boolean z13 = cVar2.f88739g;
                Matrix a13 = e0.u.a(i13, rectF, rectF3, z13);
                matrix.postConcat(a13);
                com.bumptech.glide.d.h(e0.u.d(e0.u.g(i13, e0.u.e(rect2)), false, size));
                if (cVar2.f88740h) {
                    Rect rect3 = cVar2.f88736d;
                    Rect rect4 = sVar.f81270d;
                    com.bumptech.glide.d.g("Output crop rect " + rect3 + " must contain input crop rect " + rect4, rect3.contains(rect4));
                    rect = new Rect();
                    RectF rectF4 = new RectF(rect4);
                    a13.mapRect(rectF4);
                    rectF4.round(rect);
                } else {
                    rect = new Rect(0, 0, size.getWidth(), size.getHeight());
                }
                Rect rect5 = rect;
                androidx.camera.core.impl.j a14 = sVar.f81273g.a();
                a14.f16875b = size;
                wVar.put(cVar2, new s(cVar2.f88734b, cVar2.f88735c, a14.b(), matrix, false, rect5, sVar.f81275i - i13, -1, sVar.f81271e != z13));
            } else {
                try {
                    break;
                } catch (ProcessingException e13) {
                    m0.t("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e13);
                }
            }
        }
        ((u) this.f85197b).d(sVar.d((j0) this.f85198c, true));
        for (Map.Entry entry : ((w) this.f85199d).entrySet()) {
            v(sVar, entry);
            ((s) entry.getValue()).a(new a4(this, sVar, entry, 9));
        }
        v vVar = new v((w) this.f85199d, 0);
        sVar.getClass();
        sVar.f81281o.add(vVar);
        return (w) this.f85199d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127 A[Catch: NumberFormatException | JSONException -> 0x012f, NumberFormatException | JSONException -> 0x012f, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x012f, blocks: (B:13:0x002b, B:31:0x009a, B:31:0x009a, B:34:0x00ab, B:34:0x00ab, B:36:0x00be, B:36:0x00be, B:38:0x00d0, B:38:0x00d0, B:40:0x00d9, B:40:0x00d9, B:43:0x00dd, B:43:0x00dd, B:45:0x00f0, B:45:0x00f0, B:47:0x0102, B:47:0x0102, B:49:0x010b, B:49:0x010b, B:52:0x010f, B:52:0x010f, B:54:0x011b, B:54:0x011b, B:56:0x0127, B:56:0x0127, B:58:0x0059, B:61:0x0063, B:64:0x006d, B:67:0x0078, B:70:0x0082), top: B:12:0x002b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle N() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.h.N():android.os.Bundle");
    }

    public final com.google.android.gms.internal.measurement.n O(com.google.android.gms.internal.measurement.e eVar) {
        com.google.android.gms.internal.measurement.n nVar = com.google.android.gms.internal.measurement.n.Fn;
        Iterator r13 = eVar.r();
        while (r13.hasNext()) {
            nVar = ((x) this.f85198c).u(this, eVar.e(((Integer) r13.next()).intValue()));
            if (nVar instanceof com.google.android.gms.internal.measurement.h) {
                break;
            }
        }
        return nVar;
    }

    public final com.google.android.gms.internal.measurement.n P(com.google.android.gms.internal.measurement.n nVar) {
        return ((x) this.f85198c).u(this, nVar);
    }

    public final com.google.android.gms.internal.measurement.n Q(String str) {
        h hVar = this;
        while (!((Map) hVar.f85199d).containsKey(str)) {
            Object obj = hVar.f85197b;
            if (((h) obj) == null) {
                throw new IllegalArgumentException(a.a.C(str, " is not defined"));
            }
            hVar = (h) obj;
        }
        return (com.google.android.gms.internal.measurement.n) ((Map) hVar.f85199d).get(str);
    }

    public final com.google.android.gms.internal.measurement.n R(h hVar, h4... h4VarArr) {
        com.google.android.gms.internal.measurement.n nVar = com.google.android.gms.internal.measurement.n.Fn;
        for (h4 h4Var : h4VarArr) {
            nVar = com.google.android.gms.internal.measurement.o0.o(h4Var);
            com.google.android.gms.internal.measurement.o0.w((h) this.f85199d);
            if ((nVar instanceof com.google.android.gms.internal.measurement.q) || (nVar instanceof com.google.android.gms.internal.measurement.o)) {
                nVar = ((x) this.f85197b).u(hVar, nVar);
            }
        }
        return nVar;
    }

    public final h S() {
        return new h(this, (x) this.f85198c);
    }

    public final void T(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = ((g4) this.f85200e).w().edit();
        if (bundle.size() == 0) {
            edit.remove((String) this.f85197b);
        } else {
            String str = (String) this.f85197b;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        ia.a();
                        if (!((g4) this.f85200e).l().x(null, oi.s.D0)) {
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                ((g4) this.f85200e).zzj().f95268f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "d");
                        } else {
                            ((g4) this.f85200e).zzj().f95268f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e13) {
                        ((g4) this.f85200e).zzj().f95268f.b(e13, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f85199d = bundle;
    }

    public final void U(String str, com.google.android.gms.internal.measurement.n nVar) {
        if (((Map) this.f85200e).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            ((Map) this.f85199d).remove(str);
        } else {
            ((Map) this.f85199d).put(str, nVar);
        }
    }

    public final boolean V(String str) {
        h hVar = this;
        while (!((Map) hVar.f85199d).containsKey(str)) {
            Object obj = hVar.f85197b;
            if (((h) obj) == null) {
                return false;
            }
            hVar = (h) obj;
        }
        return true;
    }

    public final void W(String str, com.google.android.gms.internal.measurement.n nVar) {
        h hVar = this;
        while (!((Map) hVar.f85199d).containsKey(str)) {
            Object obj = hVar.f85197b;
            if (((h) obj) == null || !((h) obj).V(str)) {
                break;
            } else {
                hVar = (h) hVar.f85197b;
            }
        }
        if (((Map) hVar.f85200e).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            ((Map) hVar.f85199d).remove(str);
        } else {
            ((Map) hVar.f85199d).put(str, nVar);
        }
    }

    @Override // v.c3
    public final void a(TotalCaptureResult totalCaptureResult) {
        if (((r4.i) this.f85199d) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Object obj = this.f85200e;
            if (((Rect) obj) == null || !((Rect) obj).equals(rect)) {
                return;
            }
            ((r4.i) this.f85199d).b(null);
            this.f85199d = null;
            this.f85200e = null;
        }
    }

    @Override // m.b
    public final boolean b(c cVar, n.o oVar) {
        return ((ActionMode.Callback) this.f85197b).onPrepareActionMode(z(cVar), B(oVar));
    }

    @Override // ik.d
    public final void c(ZipFile zipFile, HashSet hashSet) {
        ik.g gVar = (ik.g) this.f85200e;
        ik.b bVar = (ik.b) this.f85197b;
        u6 u6Var = new u6(this, 20);
        Pattern pattern = ik.g.f72395b;
        gVar.c(bVar, hashSet, u6Var);
    }

    @Override // androidx.recyclerview.widget.o3
    public final void dispose() {
        l0.k kVar = (l0.k) this.f85200e;
        i1 i1Var = (i1) this.f85199d;
        for (int size = ((SparseArray) kVar.f81236c).size() - 1; size >= 0; size--) {
            if (((i1) ((SparseArray) kVar.f81236c).valueAt(size)) == i1Var) {
                ((SparseArray) kVar.f81236c).removeAt(size);
            }
        }
    }

    @Override // m.b
    public final void e(c cVar) {
        ((ActionMode.Callback) this.f85197b).onDestroyActionMode(z(cVar));
    }

    @Override // v.c3
    public final float f() {
        return 1.0f;
    }

    @Override // v.c3
    public final void g(float f13, r4.i iVar) {
        ((Rect) ((w.l) this.f85197b).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float width = r0.width() / f13;
        float height = r0.height() / f13;
        float width2 = (r0.width() - width) / 2.0f;
        float height2 = (r0.height() - height) / 2.0f;
        this.f85198c = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        r4.i iVar2 = (r4.i) this.f85199d;
        if (iVar2 != null) {
            iVar2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f85200e = (Rect) this.f85198c;
        this.f85199d = iVar;
    }

    @Override // androidx.recyclerview.widget.o3
    public final int h(int i13) {
        int indexOfKey = ((SparseIntArray) this.f85198c).indexOfKey(i13);
        if (indexOfKey >= 0) {
            return ((SparseIntArray) this.f85198c).valueAt(indexOfKey);
        }
        StringBuilder s13 = a.a.s("requested global type ", i13, " does not belong to the adapter:");
        s13.append(((i1) this.f85199d).f19449c);
        throw new IllegalStateException(s13.toString());
    }

    @Override // androidx.recyclerview.widget.o3
    public final int i(int i13) {
        int indexOfKey = ((SparseIntArray) this.f85197b).indexOfKey(i13);
        if (indexOfKey > -1) {
            return ((SparseIntArray) this.f85197b).valueAt(indexOfKey);
        }
        l0.k kVar = (l0.k) this.f85200e;
        i1 i1Var = (i1) this.f85199d;
        int i14 = kVar.f81235b;
        kVar.f81235b = i14 + 1;
        ((SparseArray) kVar.f81236c).put(i14, i1Var);
        ((SparseIntArray) this.f85197b).put(i13, i14);
        ((SparseIntArray) this.f85198c).put(i14, i13);
        return i14;
    }

    @Override // m.b
    public final boolean j(c cVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f85197b).onActionItemClicked(z(cVar), new n.v((Context) this.f85198c, (h5.b) menuItem));
    }

    @Override // v.c3
    public final void k() {
        this.f85200e = null;
        this.f85198c = null;
        Object obj = this.f85199d;
        if (((r4.i) obj) != null) {
            ((r4.i) obj).d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.f85199d = null;
        }
    }

    @Override // v.c3
    public final float l() {
        Float f13 = (Float) ((w.l) this.f85197b).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f13 != null && f13.floatValue() >= 1.0f) {
            return f13.floatValue();
        }
        return 1.0f;
    }

    @Override // v.c3
    public final void m(u.a aVar) {
        Rect rect = (Rect) this.f85198c;
        if (rect != null) {
            aVar.g(CaptureRequest.SCALER_CROP_REGION, rect, u0.REQUIRED);
        }
    }

    @Override // m.b
    public final boolean n(c cVar, n.o oVar) {
        return ((ActionMode.Callback) this.f85197b).onCreateActionMode(z(cVar), B(oVar));
    }

    @Override // jk.n
    public final void o(int i13) {
        jk.w wVar = (jk.w) this.f85200e;
        wVar.f76360g.post(new s.h(wVar, (jk.d) this.f85197b, 6, i13));
    }

    public final void p(int[] iArr, ValueAnimator valueAnimator) {
        com.google.android.material.internal.w wVar = new com.google.android.material.internal.w(iArr, valueAnimator);
        valueAnimator.addListener((Animator.AnimatorListener) this.f85200e);
        ((ArrayList) this.f85199d).add(wVar);
    }

    public final void q(mn.b bVar) {
        bVar.f87750a = this;
        ((ArrayDeque) this.f85199d).add(bVar);
        if (((mn.b) this.f85200e) == null) {
            mn.b bVar2 = (mn.b) ((ArrayDeque) this.f85199d).poll();
            this.f85200e = bVar2;
            if (bVar2 != null) {
                bVar2.executeOnExecutor((ThreadPoolExecutor) this.f85198c, new Object[0]);
            }
        }
    }

    public final bl.m r() {
        bl.k kVar = (bl.k) this.f85197b;
        if (kVar == null) {
            throw new GeneralSecurityException("HPKE KEM parameter is not set");
        }
        bl.j jVar = (bl.j) this.f85198c;
        if (jVar == null) {
            throw new GeneralSecurityException("HPKE KDF parameter is not set");
        }
        bl.i iVar = (bl.i) this.f85199d;
        if (iVar == null) {
            throw new GeneralSecurityException("HPKE AEAD parameter is not set");
        }
        bl.l lVar = (bl.l) this.f85200e;
        if (lVar != null) {
            return new bl.m(kVar, jVar, iVar, lVar);
        }
        throw new GeneralSecurityException("HPKE variant is not set");
    }

    public final jl.e s() {
        jl.c cVar = (jl.c) this.f85197b;
        if (cVar == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        jl.a aVar = (jl.a) this.f85198c;
        if (aVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        jl.b bVar = (jl.b) this.f85199d;
        if (bVar == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        jl.d dVar = (jl.d) this.f85200e;
        if (dVar == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (aVar == jl.a.f76788c && bVar != jl.b.f76797b) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        jl.a aVar2 = jl.a.f76789d;
        jl.b bVar2 = jl.b.f76799d;
        if (aVar == aVar2 && bVar != jl.b.f76798c && bVar != bVar2) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (aVar != jl.a.f76790e || bVar == bVar2) {
            return new jl.e(cVar, aVar, bVar, dVar);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public final vk.f t() {
        ml.a b13;
        vk.l lVar = (vk.l) this.f85197b;
        if (lVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ll.j jVar = (ll.j) this.f85198c;
        if (jVar == null || ((ll.j) this.f85199d) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (lVar.f125984a != jVar.I()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (((vk.l) this.f85197b).f125985b != ((ll.j) this.f85199d).I()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (((vk.l) this.f85197b).a() && ((Integer) this.f85200e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((vk.l) this.f85197b).a() && ((Integer) this.f85200e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        vk.k kVar = ((vk.l) this.f85197b).f125988e;
        if (kVar == vk.k.f125975d) {
            b13 = i0.f59494a;
        } else if (kVar == vk.k.f125974c) {
            b13 = i0.a(((Integer) this.f85200e).intValue());
        } else {
            if (kVar != vk.k.f125973b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + ((vk.l) this.f85197b).f125988e);
            }
            b13 = i0.b(((Integer) this.f85200e).intValue());
        }
        return new vk.f((vk.l) this.f85197b, (ll.j) this.f85198c, (ll.j) this.f85199d, b13, (Integer) this.f85200e);
    }

    public final vk.m0 u() {
        if (((l0) this.f85197b) == null) {
            this.f85197b = l0.f125991c;
        }
        if (((String) this.f85198c) == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (((k0) this.f85199d) == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        vk.c cVar = (vk.c) this.f85200e;
        if (cVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (cVar.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        k0 k0Var = (k0) this.f85199d;
        vk.c cVar2 = (vk.c) this.f85200e;
        if ((k0Var.equals(k0.f125977b) && (cVar2 instanceof t)) || ((k0Var.equals(k0.f125979d) && (cVar2 instanceof b0)) || ((k0Var.equals(k0.f125978c) && (cVar2 instanceof vk.v0)) || ((k0Var.equals(k0.f125980e) && (cVar2 instanceof vk.l)) || ((k0Var.equals(k0.f125981f) && (cVar2 instanceof vk.p)) || (k0Var.equals(k0.f125982g) && (cVar2 instanceof vk.x))))))) {
            return new vk.m0((l0) this.f85197b, (String) this.f85198c, (k0) this.f85199d, (vk.c) this.f85200e);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + ((k0) this.f85199d).f125983a + " when new keys are picked according to " + ((vk.c) this.f85200e) + ".");
    }

    public final void v(s sVar, Map.Entry entry) {
        s sVar2 = (s) entry.getValue();
        c0.h hVar = null;
        c0.h hVar2 = new c0.h(sVar.f81273g.f16893a, ((n0.c) entry.getKey()).f88736d, sVar.f81269c ? (j0) this.f85198c : null, ((n0.c) entry.getKey()).f88738f, ((n0.c) entry.getKey()).f88739g);
        int i13 = ((n0.c) entry.getKey()).f88735c;
        sVar2.getClass();
        f0.h.s();
        sVar2.b();
        com.bumptech.glide.d.v("Consumer can only be linked once.", !sVar2.f81276j);
        sVar2.f81276j = true;
        r rVar = sVar2.f81278l;
        g0.m.a(g0.m.j(rVar.c(), new l0.q(sVar2, rVar, i13, hVar2, hVar), l3.c.H0()), new m1(4, this, sVar2), l3.c.H0());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022e  */
    @Override // l9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(byte[] r38, int r39, int r40, l9.k r41, d7.i r42) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.h.w(byte[], int, int, l9.k, d7.i):void");
    }

    public final void y(q8.u uVar, h0 h0Var) {
        for (int i13 = 0; i13 < ((q8.k0[]) this.f85199d).length; i13++) {
            h0Var.a();
            h0Var.b();
            q8.k0 D = uVar.D(h0Var.f124634d, 3);
            androidx.media3.common.b bVar = (androidx.media3.common.b) ((List) this.f85197b).get(i13);
            String str = bVar.f18765o;
            bf.b.h("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = bVar.f18751a;
            if (str2 == null) {
                h0Var.b();
                str2 = h0Var.f124635e;
            }
            a7.q qVar = new a7.q();
            qVar.f1168a = str2;
            qVar.f1180m = a7.o0.r((String) this.f85198c);
            qVar.f1181n = a7.o0.r(str);
            qVar.f1172e = bVar.f18755e;
            qVar.f1171d = bVar.f18754d;
            qVar.I = bVar.f18750J;
            qVar.f1184q = bVar.f18768r;
            D.b(new androidx.media3.common.b(qVar));
            ((q8.k0[]) this.f85199d)[i13] = D;
        }
    }

    public final i z(c cVar) {
        int size = ((ArrayList) this.f85199d).size();
        for (int i13 = 0; i13 < size; i13++) {
            i iVar = (i) ((ArrayList) this.f85199d).get(i13);
            if (iVar != null && iVar.f85202b == cVar) {
                return iVar;
            }
        }
        i iVar2 = new i((Context) this.f85198c, cVar);
        ((ArrayList) this.f85199d).add(iVar2);
        return iVar2;
    }

    @Override // jk.n
    public final void zza() {
        jk.w wVar = (jk.w) this.f85200e;
        wVar.f76360g.post(new s.h(wVar, (jk.d) this.f85197b, 5, 0));
    }

    @Override // jk.n
    public final void zzc() {
        if (((Intent) this.f85199d).getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((jk.w) this.f85200e).f79898a.c("Splits copied and verified more than once.", new Object[0]);
        } else {
            ((Intent) this.f85199d).putExtra("triggered_from_app_after_verification", true);
            ((Context) this.f85198c).sendBroadcast((Intent) this.f85199d);
        }
    }

    public h(int i13) {
        this.f85196a = i13;
        if (i13 == 10) {
            x xVar = new x(0);
            this.f85197b = xVar;
            h hVar = new h((h) null, xVar);
            this.f85199d = hVar;
            this.f85198c = hVar.S();
            androidx.lifecycle.k0 k0Var = new androidx.lifecycle.k0(2);
            this.f85200e = k0Var;
            ((h) this.f85199d).W("require", new sb(k0Var));
            androidx.lifecycle.k0 k0Var2 = (androidx.lifecycle.k0) this.f85200e;
            k0Var2.f18655a.put("internal.platform", k1.f31487a);
            ((h) this.f85199d).W("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
            return;
        }
        if (i13 == 17) {
            this.f85197b = null;
            this.f85198c = null;
            this.f85199d = null;
            this.f85200e = null;
            return;
        }
        if (i13 == 22) {
            this.f85199d = new ArrayDeque();
            this.f85200e = null;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            this.f85197b = linkedBlockingQueue;
            this.f85198c = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
            return;
        }
        if (i13 == 13) {
            this.f85199d = new ArrayList();
            this.f85197b = null;
            this.f85198c = null;
            this.f85200e = new androidx.appcompat.widget.d(this, 6);
            return;
        }
        if (i13 == 14) {
            this.f85197b = new Object();
            this.f85198c = new Handler(Looper.getMainLooper(), new yd.g(this, 1));
            return;
        }
        if (i13 == 19) {
            this.f85197b = null;
            this.f85198c = null;
            this.f85199d = null;
            this.f85200e = bl.l.f23447d;
            return;
        }
        if (i13 != 20) {
            this.f85197b = new d7.d0();
            this.f85198c = new d7.d0();
            this.f85199d = new o9.a();
        } else {
            this.f85197b = null;
            this.f85198c = null;
            this.f85199d = null;
            this.f85200e = jl.d.f76819e;
        }
    }

    public /* synthetic */ h(int i13, int i14) {
        this.f85196a = i13;
    }

    public h(ik.g gVar, ik.b bVar, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.f85196a = 15;
        this.f85200e = gVar;
        this.f85197b = bVar;
        this.f85198c = hashSet;
        this.f85199d = atomicBoolean;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj) {
        this(18, 0);
        this.f85196a = 18;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f85196a = i13;
        this.f85197b = obj;
        this.f85198c = obj2;
        this.f85199d = obj3;
        this.f85200e = obj4;
    }

    public h(jk.w wVar, jk.d dVar, Intent intent, Context context) {
        this.f85196a = 16;
        this.f85200e = wVar;
        this.f85197b = dVar;
        this.f85199d = intent;
        this.f85198c = context;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(jq.b bVar) {
        this(19);
        this.f85196a = 19;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(g gVar) {
        this(20);
        this.f85196a = 20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(nx.d0 d0Var) {
        this(d0Var, "comments_ui_event_logger", new HashMap());
        this.f85196a = 28;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(oa oaVar, u8 u8Var, int i13) {
        this(oaVar, u8Var);
        this.f85196a = 25;
    }

    public h(vd0.c json) {
        this.f85196a = 29;
        Intrinsics.checkNotNullParameter(json, "json");
        vd0.c m13 = json.m("display_data");
        this.f85197b = m13;
        this.f85198c = m13 != null ? m13.d("onboarding_text") : null;
        vd0.c cVar = (vd0.c) this.f85197b;
        this.f85199d = cVar != null ? cVar.d("onboarding_sub_text") : null;
        vd0.c cVar2 = (vd0.c) this.f85197b;
        this.f85200e = cVar2 != null ? cVar2.d("media_url") : null;
    }

    public h(nx.d0 pinalytics, String baseName, HashMap allowedAuxKeys) {
        this.f85196a = 28;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(allowedAuxKeys, "allowedAuxKeys");
        this.f85197b = pinalytics;
        this.f85198c = baseName;
        this.f85199d = allowedAuxKeys;
        this.f85200e = new nm.o();
    }

    public h(h hVar, x xVar) {
        this.f85196a = 11;
        this.f85199d = new HashMap();
        this.f85200e = new HashMap();
        this.f85197b = hVar;
        this.f85198c = xVar;
    }

    public h(eb.o windowInfoTracker, Executor executor) {
        this.f85196a = 7;
        Intrinsics.checkNotNullParameter(windowInfoTracker, "windowInfoTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f85197b = windowInfoTracker;
        this.f85198c = executor;
    }

    public h(w.l lVar) {
        this.f85196a = 1;
        this.f85198c = null;
        this.f85200e = null;
        this.f85197b = lVar;
    }

    public h(List list, int i13) {
        this.f85196a = 5;
        this.f85197b = list;
        this.f85198c = "video/mp2t";
        this.f85199d = new q8.k0[list.size()];
        this.f85200e = new e7.w(new a8.v(this, 7));
    }

    public h(List list) {
        int i13;
        this.f85196a = 4;
        this.f85197b = new d7.d0();
        this.f85198c = new d7.d0();
        t9.a aVar = new t9.a();
        this.f85199d = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i14 = n0.f53866a;
        for (String str : trim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] split = str.substring(9).split(",", -1);
                aVar.f116777d = new int[split.length];
                for (int i15 = 0; i15 < split.length; i15++) {
                    int[] iArr = aVar.f116777d;
                    try {
                        i13 = Integer.parseInt(split[i15].trim(), 16);
                    } catch (RuntimeException unused) {
                        i13 = 0;
                    }
                    iArr[i15] = i13;
                }
            } else if (str.startsWith("size: ")) {
                String[] split2 = str.substring(6).trim().split("x", -1);
                if (split2.length == 2) {
                    try {
                        aVar.f116778e = Integer.parseInt(split2[0]);
                        aVar.f116779f = Integer.parseInt(split2[1]);
                        aVar.f116775b = true;
                    } catch (RuntimeException e13) {
                        d7.u.h("VobsubParser", "Parsing IDX failed", e13);
                    }
                }
            }
        }
    }

    public h(g4 g4Var, String str) {
        this.f85196a = 12;
        this.f85200e = g4Var;
        com.bumptech.glide.d.o(str);
        this.f85197b = str;
        this.f85198c = new Bundle();
    }

    public h(j0 j0Var, u uVar) {
        this.f85196a = 2;
        this.f85198c = j0Var;
        this.f85197b = uVar;
    }

    public h(Context context, ActionMode.Callback callback) {
        this.f85196a = 0;
        this.f85198c = context;
        this.f85197b = callback;
        this.f85199d = new ArrayList();
        this.f85200e = new o0();
    }

    public h(l0.k kVar, i1 i1Var) {
        this.f85196a = 6;
        this.f85200e = kVar;
        this.f85197b = new SparseIntArray(1);
        this.f85198c = new SparseIntArray(1);
        this.f85199d = i1Var;
    }

    public h(tt0.d0 onLoadingStart, tt0.d0 onLoadingComplete, tt0.d0 onLoadingFailed, tt0.d0 onCameraClosed) {
        this.f85196a = 27;
        Intrinsics.checkNotNullParameter(onLoadingStart, "onLoadingStart");
        Intrinsics.checkNotNullParameter(onLoadingComplete, "onLoadingComplete");
        Intrinsics.checkNotNullParameter(onLoadingFailed, "onLoadingFailed");
        Intrinsics.checkNotNullParameter(onCameraClosed, "onCameraClosed");
        this.f85197b = onLoadingStart;
        this.f85198c = onLoadingComplete;
        this.f85199d = onLoadingFailed;
        this.f85200e = onCameraClosed;
    }

    public h(oa oaVar, u8 u8Var) {
        this.f85196a = 25;
        this.f85197b = oaVar;
        this.f85198c = u8Var;
    }
}
