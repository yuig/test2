package fe2;

import ae2.d;
import ah2.h;
import android.app.ActivityManager;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Looper;
import android.util.Size;
import android.util.SizeF;
import androidx.lifecycle.k0;
import com.pinterest.xrenderer.RustBridge$Scene;
import com.pinterest.xrenderer.RustBridge$Surface;
import com.pinterest.xrenderer.legacy.view.LegacySceneView;
import ei2.l;
import ei2.x;
import he2.f;
import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh2.b1;
import kh2.b3;
import kh2.c0;
import kh2.d1;
import kh2.f3;
import kh2.h0;
import kh2.h1;
import kh2.h3;
import kh2.i;
import kh2.i1;
import kh2.j2;
import kh2.j3;
import kh2.l0;
import kh2.l3;
import kh2.m;
import kh2.m3;
import kh2.o;
import kh2.o0;
import kh2.o2;
import kh2.q;
import kh2.q2;
import kh2.r0;
import kh2.s2;
import kh2.t0;
import kh2.y2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mh2.n;
import okhttp3.OkHttpClient;
import org.chromium.net.y;
import pd2.a0;
import pd2.i0;
import pd2.p0;
import pf2.e;
import pg2.k;
import rh2.g;
import rl2.u;
import t72.j;
import v.z1;
import vg2.c;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62084i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f62085j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f62086k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        super(0);
        this.f62084i = i13;
        this.f62085j = obj;
        this.f62086k = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f62084i;
        int i14 = 0;
        Object obj = this.f62086k;
        Object obj2 = this.f62085j;
        switch (i13) {
            case 0:
                b bVar = (b) obj2;
                d dVar = bVar.f64857l;
                if (dVar != null) {
                    dVar.b();
                }
                int i15 = d.f15059f;
                bVar.f64857l = y.O(bVar.f62087m);
                bVar.f58816a = false;
                j gl3 = (j) obj;
                Intrinsics.checkNotNullParameter(gl3, "gl");
                ge2.a aVar = bVar.f64856k;
                if (aVar != null) {
                    aVar.f64840a.g();
                    aVar.f64845f.c();
                    aVar.f64846g.c();
                    aVar.f64847h.l();
                }
                bVar.f64856k = new ge2.a(bVar, gl3);
                return Boolean.TRUE;
            case 1:
                m141invoke();
                return Unit.f80348a;
            case 2:
                m141invoke();
                return Unit.f80348a;
            case 3:
                m141invoke();
                return Unit.f80348a;
            case 4:
                return new f((Context) obj2, ((LegacySceneView) obj).f52892h, false);
            case 5:
                m141invoke();
                return Unit.f80348a;
            case 6:
                HttpURLConnection httpURLConnection = (HttpURLConnection) obj;
                ((h) obj2).getClass();
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    if (headerFields == null) {
                        return z0.d();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(headerFields.size()));
                    for (Object obj3 : headerFields.entrySet()) {
                        Object key = ((Map.Entry) obj3).getKey();
                        Object value = ((Map.Entry) obj3).getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "it.value");
                        linkedHashMap.put(key, CollectionsKt.Z((Iterable) value, null, null, null, 0, null, null, 63));
                    }
                    return linkedHashMap;
                } catch (Throwable unused) {
                    return z0.d();
                }
            case 7:
                m141invoke();
                return Unit.f80348a;
            case 8:
                i iVar = (i) obj2;
                Looper looper = (Looper) iVar.f79520d.a(iVar, i.f79516i[2]);
                Intrinsics.checkNotNullExpressionValue(looper, "looper");
                return new e(looper, iVar.f79517a, ((d1) ((b1) obj)).f79455a);
            case 9:
                m mVar = (m) obj2;
                b1 b1Var = (b1) obj;
                if (m.a(mVar, b1Var)) {
                    return null;
                }
                OkHttpClient okHttpClient = (OkHttpClient) mVar.f79608a.a(mVar, m.f79607g[0]);
                k c13 = mVar.c();
                if (c13 == null) {
                    return null;
                }
                return new c(okHttpClient, c13, ((d1) b1Var).a());
            case 10:
                InstrumentedConfigImpl instrumentedConfigImpl = ((d1) ((b1) obj2)).f79461g;
                q qVar = (q) obj;
                nf2.c cVar = (nf2.c) qVar.f79656e.a(qVar, q.f79651g[4]);
                String packageName = qVar.b().getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                return new yf2.c(instrumentedConfigImpl, cVar, packageName);
            case 11:
                sg2.a aVar2 = (sg2.a) obj2;
                t0 t0Var = (t0) obj;
                try {
                    c0.d.M2("breadcrumb-service-init");
                    return new dg2.a(aVar2, new kh2.y(t0Var, i14));
                } finally {
                }
            case 12:
                j3 j3Var = (j3) ((h3) obj2);
                j3Var.getClass();
                return new ai2.c((ActivityManager) j3Var.f79577b.a(j3Var, j3.f79575g[0]), ((d1) ((b1) obj)).f79456b);
            case 13:
                kh2.a aVar3 = (kh2.a) obj2;
                b1 b1Var2 = (b1) obj;
                try {
                    c0.d.M2("user-service-init");
                    return new mg2.a(((kh2.c) aVar3).a(), ((d1) b1Var2).f79456b);
                } finally {
                }
            case 14:
                vf2.b logWriter = (vf2.b) obj2;
                lh2.b logger = ((d1) ((b1) obj)).f79456b;
                Intrinsics.checkNotNullParameter(logWriter, "logWriter");
                Intrinsics.checkNotNullParameter(logger, "logger");
                return new kg2.b(logWriter, logger, new wf2.c(kg2.a.f79406i));
            case 15:
                d1 d1Var = (d1) ((b1) obj2);
                return new bg2.e(d1Var.f79455a, ((s2) ((q2) obj)).e(), d1Var.f79456b);
            case 16:
                return new g(((r0) ((o0) obj2)).b(), ((d1) ((b1) obj)).f79456b);
            case 17:
                i1 i1Var = (i1) obj2;
                c0 c0Var = i1Var.f79534c;
                u[] uVarArr = i1.f79531h;
                return new rh2.e((rh2.c) c0Var.a(i1Var, uVarArr[2]), (rh2.i) i1Var.f79532a.a(i1Var, uVarArr[0]), ((s2) ((q2) obj)).e());
            case 18:
                j2 j2Var = (j2) obj2;
                return (o) j2Var.f79552d.invoke((Context) obj, j2Var.f79550b);
            case 19:
                j2 j2Var2 = (j2) obj2;
                return (kh2.k) j2Var2.f79553e.g(j2Var2.f79550b, j2Var2.d(), j2Var2.f79551c, j2Var2.m(), j2Var2.a(), (th2.g) obj);
            case 20:
                d1 d1Var2 = (d1) ((b1) obj);
                return new qf2.c(((o2) obj2).a(), d1Var2.a(), d1Var2.f79455a);
            case 21:
                return new fh2.c(((kh2.c) ((kh2.a) obj2)).a(), ((sg2.b) ((m) ((kh2.k) obj)).b()).f112890o);
            case 22:
                y2 y2Var = (y2) obj2;
                y2Var.getClass();
                u[] uVarArr2 = y2.f79750l;
                fh2.a aVar4 = (fh2.a) y2Var.f79759i.a(y2Var, uVarArr2[8]);
                gh2.d dVar2 = (gh2.d) y2Var.f79758h.a(y2Var, uVarArr2[7]);
                eh2.c cVar2 = (eh2.c) y2Var.f79753c.a(y2Var, uVarArr2[2]);
                l0 l0Var = (l0) ((h0) obj);
                l0Var.getClass();
                return new eh2.a(aVar4, dVar2, cVar2, (dh2.a) l0Var.f79595j.a(l0Var, l0.f79585m[8]));
            case 23:
                b3 b3Var = (b3) obj2;
                b3Var.getClass();
                yh2.a aVar5 = (yh2.a) b3Var.f79442b.a(b3Var, b3.f79440h[1]);
                r0 r0Var = (r0) ((o0) obj);
                r0Var.getClass();
                return new di2.a(aVar5, (mg2.b) r0Var.f79673e.a(r0Var, r0.f79668m[2]), r0Var.f());
            case 24:
                return new ih2.a(((m) ((kh2.k) obj2)).b(), ((i1) ((h1) obj)).a());
            case 25:
                return new qg2.e(((f3) obj2).a(), ((d1) ((b1) obj)).a());
            case 26:
                f3 f3Var = (f3) obj2;
                return new qg2.g((qg2.a) f3Var.f79494b.a(f3Var, f3.f79492d[1]), ((m3) ((l3) obj)).d(ki2.i.f79817c));
            case 27:
                if (((ii2.a) ((ii2.d) obj2)).a(26)) {
                    return (StorageStatsManager) j3.a((j3) obj, "storagestats");
                }
                return null;
            case 28:
                n nVar = (n) obj2;
                sh2.j jVar = (sh2.j) obj;
                ArrayList arrayList = jVar.f112980e;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((dj2.a) it.next());
                }
                dj2.a bVar2 = arrayList2.isEmpty() ? dj2.c.f55155a : arrayList2.size() == 1 ? (dj2.a) arrayList2.get(0) : new dj2.b((dj2.a[]) arrayList2.toArray(new dj2.a[0]));
                Intrinsics.checkNotNullExpressionValue(bVar2, "composite(externalLogExporters)");
                return new mh2.b(new mh2.a(nVar, bVar2, jVar.f112982g));
            default:
                x xVar = (x) obj2;
                sh2.j jVar2 = (sh2.j) obj;
                ArrayList arrayList3 = jVar2.f112979d;
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add((pj2.c) it2.next());
                }
                pj2.c aVar6 = arrayList4.isEmpty() ? pj2.b.f100344a : arrayList4.size() == 1 ? (pj2.c) arrayList4.get(0) : new pj2.a((pj2.c[]) arrayList4.toArray(new pj2.c[0]));
                Intrinsics.checkNotNullExpressionValue(aVar6, "composite(externalSpanExporters)");
                return new l(new ei2.g(xVar, aVar6, jVar2.f112982g), (String) jVar2.f112978c.getValue());
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m141invoke() {
        Object m13;
        Object m14;
        int i13 = 2;
        int i14 = 0;
        int i15 = 6;
        int i16 = 5;
        switch (this.f62084i) {
            case 1:
                ge2.c cVar = (ge2.c) this.f62085j;
                d texture = cVar.f64857l;
                if (texture != null) {
                    ge2.a aVar = cVar.f64856k;
                    if (aVar == null) {
                        throw new IllegalStateException("can't render released sticker".toString());
                    }
                    if (cVar.f58819d < 1.0E-6f) {
                        return;
                    }
                    ee2.a aVar2 = (ee2.a) this.f62086k;
                    androidx.camera.core.impl.j jVar = aVar.f64847h;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(texture, "texture");
                    List list = (List) jVar.f16876c;
                    ArrayList arrayList = new ArrayList(g0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((td2.a) it.next()).f117474c.e());
                    }
                    List F0 = CollectionsKt.F0(arrayList);
                    int i17 = 1;
                    if (!Intrinsics.d(F0, (List) jVar.f16878e)) {
                        jVar.f16878e = F0;
                        if (((List) jVar.f16876c).isEmpty()) {
                            jVar.f16879f = texture;
                        } else {
                            if (((d) jVar.f16879f) == null) {
                                jVar.f16879f = new d(texture.f15060e, ae2.b.UInt8RGBA);
                            }
                            j jVar2 = (j) jVar.f16875b;
                            a block = new a(i13, jVar, texture);
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(block, "block");
                            k0 state = new k0(5);
                            Map map = state.f18655a;
                            int[] iArr = {0, 0};
                            GLES20.glGetIntegerv(36010, iArr, 0);
                            GLES20.glGetIntegerv(36006, iArr, 1);
                            map.put("framebuffer", new yd2.k(iArr[0], iArr[1]));
                            block.invoke();
                            Intrinsics.checkNotNullParameter(state, "state");
                            if (state.f18655a.containsKey("framebuffer")) {
                                Object obj = state.f18655a.get("framebuffer");
                                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.xrenderer.legacy.gl.framebuffer.GLFrameBufferBindings");
                                yd2.k bindings = (yd2.k) obj;
                                Intrinsics.checkNotNullParameter(bindings, "bindings");
                                pe.i.J(new yd2.l(bindings, i14), "rebind previous framebuffer to READ");
                                pe.i.J(new yd2.l(bindings, i17), "rebind previous framebuffer to DRAW");
                            }
                        }
                    }
                    d dVar = (d) jVar.f16879f;
                    Intrinsics.f(dVar);
                    aVar.f64840a.a();
                    aVar.f64845f.a(0);
                    aVar.f64846g.a(1);
                    dVar.f15064c = 0;
                    dVar.a();
                    ge2.b bVar = aVar.f64843d;
                    bVar.getClass();
                    bVar.f64855g.h(ge2.b.f64848h[6]).j(dVar);
                    int i18 = 0;
                    for (Object obj2 : aVar.f64842c) {
                        int i19 = i18 + 1;
                        if (i18 >= 0) {
                            rd2.d dVar2 = (rd2.d) obj2;
                            ae2.f fVar = dVar2.f107520a;
                            fVar.f15064c = i19;
                            fVar.a();
                            dVar2.f107521b.j(dVar2.f107520a);
                            i18 = i19;
                        } else {
                            f0.p();
                            throw null;
                        }
                    }
                    u[] uVarArr = ge2.b.f64848h;
                    androidx.appcompat.widget.a h10 = bVar.f64849a.h(uVarArr[0]);
                    if (h10.f16503b) {
                        z1 value = aVar2.f58805b;
                        Intrinsics.checkNotNullParameter(value, "value");
                        pe.i.J(new et1.r0(29, h10, value), a.a.p(new StringBuilder("set '"), (String) h10.f16504c, "' transform uniform"));
                        b bVar2 = (b) cVar;
                        bVar.f64850b.h(uVarArr[1]).g(new SizeF(bVar2.f62088n, bVar2.f62089o).getWidth(), new SizeF(bVar2.f62088n, bVar2.f62089o).getHeight());
                        bVar.f64851c.h(uVarArr[2]).f(aVar2.f58806c);
                        bVar.f64852d.h(uVarArr[3]).c(true);
                        bVar.f64853e.h(uVarArr[4]).i(cVar.f58818c);
                        bVar.f64854f.h(uVarArr[5]).f(cVar.f58819d);
                        for (rd2.c cVar2 : aVar.f64841b) {
                            p0 d2 = cVar2.f107517a.f121933c.d(cVar2.f107519c);
                            boolean z13 = d2 instanceof i0;
                            androidx.appcompat.widget.a aVar3 = cVar2.f107518b;
                            if (z13) {
                                aVar3.i(((i0) d2).f99845b);
                            } else if (d2 instanceof pd2.f0) {
                                aVar3.f(((pd2.f0) d2).f99839b);
                            } else if (d2 instanceof a0) {
                                aVar3.e(((a0) d2).f99825b);
                            } else if (d2 instanceof pd2.x) {
                                aVar3.c(((pd2.x) d2).f99879b);
                            } else if (d2 instanceof pd2.o0) {
                                PointF pointF = ((pd2.o0) d2).f99863b;
                                aVar3.g(pointF.x, pointF.y);
                            } else if (d2 instanceof pd2.l0) {
                                hd2.f fVar2 = ((pd2.l0) d2).f99854b;
                                PointF pointF2 = fVar2.f68922a;
                                float f13 = pointF2.x;
                                float f14 = pointF2.y;
                                PointF pointF3 = fVar2.f68923b;
                                aVar3.h(f13, f14, pointF3.x, pointF3.y);
                            }
                        }
                        Size size = aVar2.f58804a;
                        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
                        GLES20.glDrawArrays(4, 0, aVar.f64844e.f102897c);
                        return;
                    }
                    throw new IllegalStateException(a.a.p(new StringBuilder("can't get "), (String) h10.f16504c, " uniform location").toString());
                }
                throw new IllegalStateException("can't render sticker w/o sourceTexture set".toString());
            case 2:
                androidx.camera.core.impl.j jVar3 = (androidx.camera.core.impl.j) this.f62085j;
                android.support.v4.media.a aVar4 = (android.support.v4.media.a) jVar3.f16877d;
                d inputTexture = (d) this.f62086k;
                d targetTexture = (d) jVar3.f16879f;
                Intrinsics.f(targetTexture);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(inputTexture, "inputTexture");
                Intrinsics.checkNotNullParameter(targetTexture, "targetTexture");
                com.pinterest.xrenderer.legacy.multipass_processing.b block2 = new com.pinterest.xrenderer.legacy.multipass_processing.b(aVar4, targetTexture, inputTexture, i13);
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block2, "block");
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block2, "block");
                block2.invoke();
                return;
            case 3:
                f fVar3 = (f) this.f62085j;
                Size value2 = (Size) this.f62086k;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(value2, "newSize");
                d dVar3 = fVar3.f68978f;
                if (dVar3 != null) {
                    dVar3.b();
                    d dVar4 = fVar3.f68979g;
                    if (dVar4 != null) {
                        dVar4.b();
                        d dVar5 = fVar3.f68980h;
                        if (dVar5 == null) {
                            Intrinsics.r("postProcessingTexture");
                            throw null;
                        }
                        dVar5.b();
                    } else {
                        Intrinsics.r("indexTexture");
                        throw null;
                    }
                }
                ae2.b bVar3 = ae2.b.UInt8RGBA;
                fVar3.f68978f = new d(value2, bVar3);
                fVar3.f68979g = new d(value2, bVar3);
                fVar3.f68980h = new d(value2, bVar3);
                ce2.b bVar4 = fVar3.f68982j;
                if (bVar4 != null) {
                    d dVar6 = fVar3.f68978f;
                    if (dVar6 != null) {
                        bVar4.f27621a = dVar6;
                        d dVar7 = fVar3.f68979g;
                        if (dVar7 != null) {
                            bVar4.f27622b = dVar7;
                            kd2.i iVar = kd2.i.f79272h;
                            if (iVar != null) {
                                if (iVar.f79279g) {
                                    int width = value2.getWidth();
                                    int height = value2.getHeight();
                                    try {
                                        xk2.q qVar = xk2.s.f135225b;
                                        m14 = ByteBuffer.allocateDirect(width * height * 4);
                                    } catch (OutOfMemoryError e13) {
                                        xk2.q qVar2 = xk2.s.f135225b;
                                        m14 = ue.c.m(e13);
                                    }
                                    Throwable a13 = xk2.s.a(m14);
                                    if (a13 == null) {
                                        Intrinsics.checkNotNullExpressionValue(m14, "getOrElse(...)");
                                        fVar3.f68986n = (ByteBuffer) m14;
                                    } else {
                                        throw new Throwable("Out of memory while allocating buffer for texture copy", a13);
                                    }
                                }
                                if (fVar3.f68976d) {
                                    return;
                                }
                                he2.a aVar5 = fVar3.f68983k;
                                aVar5.getClass();
                                Intrinsics.checkNotNullParameter(value2, "value");
                                try {
                                    xk2.q qVar3 = xk2.s.f135225b;
                                    m13 = ByteBuffer.allocateDirect(((int) ig1.b.N(value2)) * 4);
                                } catch (OutOfMemoryError e14) {
                                    xk2.q qVar4 = xk2.s.f135225b;
                                    m13 = ue.c.m(e14);
                                }
                                if (xk2.s.a(m13) != null) {
                                    m13 = ByteBuffer.allocate(0);
                                }
                                ByteBuffer order = ((ByteBuffer) m13).order(ByteOrder.nativeOrder());
                                Intrinsics.checkNotNullExpressionValue(order, "order(...)");
                                aVar5.f68962a = order;
                                aVar5.f68963b = value2;
                                return;
                            }
                            throw new IllegalStateException("XRendererApp must be initialized first.".toString());
                        }
                        Intrinsics.r("indexTexture");
                        throw null;
                    }
                    Intrinsics.r("colorTexture");
                    throw null;
                }
                Intrinsics.r("postProcessing");
                throw null;
            case 4:
            default:
                ((ch2.d) this.f62085j).f27753j.remove((yg2.d) this.f62086k);
                return;
            case 5:
                kd2.i iVar2 = kd2.i.f79272h;
                if (iVar2 != null) {
                    ((kd2.e) iVar2.a()).b(new me2.e((me2.f) this.f62085j, i16), "RenderThread");
                    RustBridge$Surface.f52864a.resize(((me2.f) this.f62085j).f87050c, ((Size) this.f62086k).getWidth(), ((Size) this.f62086k).getHeight());
                    ke2.f fVar4 = ((me2.f) this.f62085j).f87051d;
                    if (fVar4 != null) {
                        int width2 = ((Size) this.f62086k).getWidth();
                        int height2 = ((Size) this.f62086k).getHeight();
                        if (fVar4.a() && width2 > 0 && height2 > 0) {
                            RustBridge$Scene.f52862a.resize(fVar4.f79327d, width2, height2);
                        }
                    }
                    kd2.i iVar3 = kd2.i.f79272h;
                    if (iVar3 != null) {
                        ((kd2.e) iVar3.a()).b(new me2.e((me2.f) this.f62085j, i15), "RenderThread");
                        return;
                    }
                    throw new IllegalStateException("XRendererApp must be initialized first.".toString());
                }
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
        }
    }
}
