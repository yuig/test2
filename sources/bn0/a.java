package bn0;

import a.m2;
import a8.j0;
import a8.k0;
import a8.l0;
import a8.o0;
import a8.p;
import a8.q;
import a8.r;
import a8.t0;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.GLES20;
import androidx.media3.common.ParserException;
import com.pinterest.shuffles.cutout.editor.ui.CutoutEditorView;
import com.pinterest.shuffles.cutout.editor.ui.select.MaskedImageView;
import com.pinterest.shuffles.cutout.editor.ui.widget.ShimmerView;
import d7.d0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import oo2.o;
import pk.c1;
import pk.e1;
import pk.h1;
import pk.v2;
import q8.t;
import q8.x;
import t3.e4;
import u62.l;
import xk2.v;

/* loaded from: classes5.dex */
public final class a implements q8.k {

    /* renamed from: a */
    public final /* synthetic */ int f23558a;

    /* renamed from: b */
    public int f23559b;

    /* renamed from: c */
    public Object f23560c;

    /* renamed from: d */
    public Object f23561d;

    public a(int i13) {
        this.f23558a = i13;
        if (i13 != 17) {
            return;
        }
        this.f23560c = new Object[8];
        int[] iArr = new int[8];
        for (int i14 = 0; i14 < 8; i14++) {
            iArr[i14] = -1;
        }
        this.f23561d = iArr;
        this.f23559b = -1;
    }

    public final void a() {
        int i13 = this.f23559b;
        if (i13 <= 0) {
            throw new IllegalStateException("program is released".toString());
        }
        GLES20.glUseProgram(i13);
    }

    public final long b(t tVar) {
        int o13;
        while (tVar.k() < tVar.getLength() - 6) {
            x xVar = (x) this.f23560c;
            int i13 = this.f23559b;
            t0 t0Var = (t0) this.f23561d;
            long k13 = tVar.k();
            byte[] bArr = new byte[2];
            int i14 = 0;
            tVar.s(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i13) {
                d0 d0Var = new d0(16);
                System.arraycopy(bArr, 0, d0Var.f53806a, 0, 2);
                byte[] bArr2 = d0Var.f53806a;
                while (i14 < 14 && (o13 = tVar.o(bArr2, 2 + i14, 14 - i14)) != -1) {
                    i14 += o13;
                }
                d0Var.J(i14);
                tVar.g();
                tVar.m((int) (k13 - tVar.h()));
                if (ph.a.t(d0Var, xVar, i13, t0Var)) {
                    break;
                }
            } else {
                tVar.g();
                tVar.m((int) (k13 - tVar.h()));
            }
            tVar.m(1);
        }
        if (tVar.k() < tVar.getLength() - 6) {
            return ((t0) this.f23561d).f1462a;
        }
        tVar.m((int) (tVar.getLength() - tVar.k()));
        return ((x) this.f23560c).f103006j;
    }

    public final String c() {
        StringBuilder sb3 = new StringBuilder("$");
        int i13 = this.f23559b + 1;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = ((Object[]) this.f23560c)[i14];
            if (obj instanceof oo2.g) {
                oo2.g gVar = (oo2.g) obj;
                if (!Intrinsics.d(gVar.c(), o.f96904b)) {
                    int i15 = ((int[]) this.f23561d)[i14];
                    if (i15 >= 0) {
                        sb3.append(".");
                        sb3.append(gVar.f(i15));
                    }
                } else if (((int[]) this.f23561d)[i14] != -1) {
                    sb3.append("[");
                    sb3.append(((int[]) this.f23561d)[i14]);
                    sb3.append("]");
                }
            } else if (obj != so2.o.f114805a) {
                sb3.append("['");
                sb3.append(obj);
                sb3.append("']");
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public final k0 d(int i13, String str, Map map, Uri uri) {
        String str2 = ((p) this.f23561d).f1427c;
        int i14 = this.f23559b;
        this.f23559b = i14 + 1;
        q qVar = new q(str2, str, i14);
        p pVar = (p) this.f23561d;
        if (pVar.f1439o != null) {
            bf.b.w(pVar.f1435k);
            try {
                Object obj = this.f23561d;
                qVar.a("Authorization", ((p) obj).f1439o.g(((p) obj).f1435k, uri, i13));
            } catch (ParserException e13) {
                p.J((p) this.f23561d, new IOException((Throwable) e13) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
                    public RtspMediaSource$RtspPlaybackException(Exception exc) {
                        super(exc);
                    }
                });
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            qVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new k0(uri, i13, new r(qVar), "");
    }

    @Override // q8.k
    public final q8.j e(t tVar, long j13) {
        long h10 = tVar.h();
        long b13 = b(tVar);
        long k13 = tVar.k();
        tVar.m(Math.max(6, ((x) this.f23560c).f102999c));
        long b14 = b(tVar);
        return (b13 > j13 || b14 <= j13) ? b14 <= j13 ? new q8.j(-2, b14, tVar.k()) : new q8.j(-1, b13, h10) : new q8.j(0, -9223372036854775807L, k13);
    }

    public final Object f(h hVar, bl2.c cVar) {
        if (hVar instanceof g) {
            this.f23559b = ((MediaMuxer) this.f23560c).addTrack(((g) hVar).f23574b);
            ((MediaMuxer) this.f23560c).start();
        } else if (!(hVar instanceof e)) {
            if (hVar instanceof f) {
                f fVar = (f) hVar;
                MediaCodec mediaCodec = fVar.f23570a;
                int i13 = fVar.f23571b;
                MediaCodec.BufferInfo bufferInfo = fVar.f23572c;
                int i14 = bufferInfo.flags;
                if ((i14 & 2) != 0) {
                    return Unit.f80348a;
                }
                if ((i14 & 4) != 0) {
                    ((MediaMuxer) this.f23560c).stop();
                    Object emit = ((do2.j) this.f23561d).emit(i.f23575a, cVar);
                    cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                    if (emit != aVar) {
                        emit = Unit.f80348a;
                    }
                    return emit == aVar ? emit : Unit.f80348a;
                }
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i13);
                if (outputBuffer != null) {
                    ((MediaMuxer) this.f23560c).writeSampleData(this.f23559b, outputBuffer, bufferInfo);
                    mediaCodec.releaseOutputBuffer(i13, false);
                    Object emit2 = ((do2.j) this.f23561d).emit(new j(bufferInfo.presentationTimeUs), cVar);
                    cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                    if (emit2 != aVar2) {
                        emit2 = Unit.f80348a;
                    }
                    if (emit2 == aVar2) {
                        return emit2;
                    }
                }
            } else if (hVar instanceof d) {
                MediaCodec.CodecException codecException = ((d) hVar).f23567b;
            }
        }
        return Unit.f80348a;
    }

    public final void g() {
        if (this.f23559b <= 0) {
            return;
        }
        pe.i.J(new zd2.a(this, 3), "");
        this.f23559b = 0;
    }

    public final void h() {
        int i13 = this.f23559b * 2;
        Object[] copyOf = Arrays.copyOf((Object[]) this.f23560c, i13);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.f23560c = copyOf;
        int[] copyOf2 = Arrays.copyOf((int[]) this.f23561d, i13);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        this.f23561d = copyOf2;
    }

    public final void i() {
        bf.b.w((k0) this.f23560c);
        e1 e1Var = ((k0) this.f23560c).f1386c.f1454a;
        HashMap hashMap = new HashMap();
        for (String str : e1Var.f100447d.keySet()) {
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                hashMap.put(str, (String) com.bumptech.glide.c.P(e1Var.get(str)));
            }
        }
        k0 k0Var = (k0) this.f23560c;
        k(d(k0Var.f1385b, ((p) this.f23561d).f1436l, hashMap, k0Var.f1384a));
    }

    public final void j(Uri uri, String str) {
        k(d(2, str, h1.i("Accept", "application/sdp"), uri));
    }

    public final void k(k0 k0Var) {
        String c13 = k0Var.f1386c.c("CSeq");
        c13.getClass();
        int parseInt = Integer.parseInt(c13);
        bf.b.t(((p) this.f23561d).f1431g.get(parseInt) == null);
        ((p) this.f23561d).f1431g.append(parseInt, k0Var);
        v2 h10 = j0.h(k0Var);
        p.L((p) this.f23561d, h10);
        ((p) this.f23561d).f1434j.c(h10);
        this.f23560c = k0Var;
    }

    public final androidx.appcompat.widget.a m(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i13 = this.f23559b;
        Intrinsics.checkNotNullParameter(name, "name");
        androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a();
        aVar.f16504c = name;
        int intValue = ((Number) pe.i.J(new zd2.e(i13, aVar), a.a.p(new StringBuilder("get '"), (String) aVar.f16504c, "' uniform location"))).intValue();
        aVar.f16502a = intValue;
        aVar.f16503b = intValue >= 0;
        return aVar;
    }

    public final void n(u62.c model) {
        List split$default;
        List split$default2;
        Intrinsics.checkNotNullParameter(model, "model");
        CutoutEditorView cutoutEditorView = (CutoutEditorView) this.f23560c;
        String imageAspectRatio = model.f120829b;
        cutoutEditorView.getClass();
        Intrinsics.checkNotNullParameter(imageAspectRatio, "imageAspectRatio");
        split$default = StringsKt__StringsKt.split$default(imageAspectRatio, new String[]{","}, false, 0, 6, null);
        split$default2 = StringsKt__StringsKt.split$default((CharSequence) split$default.get(1), new String[]{":"}, false, 0, 6, null);
        cutoutEditorView.f51944c = Integer.parseInt((String) split$default2.get(0));
        cutoutEditorView.f51945d = Integer.parseInt((String) split$default2.get(1));
        cutoutEditorView.requestLayout();
        MaskedImageView a13 = cutoutEditorView.a();
        ve.h.Y(a13, model.f120832e, Integer.valueOf(this.f23559b), l.f120845i, null, new yv1.i(this, 21), 342);
        a13.f2(model.f120833f, false, model.f120834g);
        boolean d2 = Intrinsics.d(model.f120830c, u62.h.f120839a);
        v vVar = cutoutEditorView.f51943b;
        if (d2) {
            Object value = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ShimmerView) value).setVisibility(0);
        } else {
            Object value2 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ShimmerView) value2).setVisibility(8);
        }
    }

    public final String toString() {
        switch (this.f23558a) {
            case 17:
                return c();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i13, int i14, Object obj, String str) {
        this.f23558a = i14;
        this.f23559b = i13;
        this.f23560c = obj;
        this.f23561d = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(p pVar, int i13) {
        this(pVar);
        this.f23558a = 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r rVar) {
        this(405, 7, rVar, "");
        this.f23558a = 7;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i13, int i14) {
        this.f23558a = i14;
        this.f23560c = obj;
        this.f23561d = obj2;
        this.f23559b = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, List list, int i13) {
        this(str, i13, list);
        this.f23558a = 15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(x xVar, int i13) {
        this(i13, xVar);
        this.f23558a = 10;
    }

    public a(String id3, int i13, List labels) {
        this.f23558a = 15;
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.f23560c = id3;
        this.f23559b = i13;
        this.f23561d = labels;
    }

    public a(zd2.d vertexShader, zd2.d fragmentShader) {
        this.f23558a = 16;
        Intrinsics.checkNotNullParameter(vertexShader, "vertexShader");
        Intrinsics.checkNotNullParameter(fragmentShader, "fragmentShader");
        this.f23560c = vertexShader;
        this.f23561d = fragmentShader;
        int glCreateProgram = GLES20.glCreateProgram();
        this.f23559b = glCreateProgram;
        if (glCreateProgram > 0) {
            pe.i.J(new zd2.a(this, 0), "program: attach vertex shader");
            pe.i.J(new zd2.a(this, 1), "program: attach fragment shader");
            pe.i.J(new zd2.a(this, 2), "program: link");
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f23559b, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return;
            }
            String b13 = kotlin.text.t.b("\n                        error linking program: \n                            " + GLES20.glGetProgramInfoLog(this.f23559b) + "\n                        vertex shader code:\n                            " + ((zd2.d) this.f23560c).f141786a + "\n                        fragment shader code:\n                            " + ((zd2.d) this.f23561d).f141786a + "\n                    ");
            GLES20.glDeleteProgram(this.f23559b);
            throw new IllegalStateException(b13.toString());
        }
        throw new IllegalStateException("failed to create gl program".toString());
    }

    public a(CutoutEditorView cutoutEditorView, Function1 onEvent) {
        this.f23558a = 14;
        Intrinsics.checkNotNullParameter(cutoutEditorView, "cutoutEditorView");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        this.f23560c = cutoutEditorView;
        this.f23561d = onEvent;
        cutoutEditorView.a().setOnTouchListener(new m2(this, 19));
        this.f23559b = ((CutoutEditorView) this.f23560c).getResources().getDimensionPixelSize(u62.v.cutout_editor_corner_radius);
        MaskedImageView a13 = ((CutoutEditorView) this.f23560c).a();
        int i13 = this.f23559b;
        a13.f51979a = i13;
        y62.e eVar = a13.f51980b;
        if (eVar != null) {
            eVar.f137921c = i13;
        }
    }

    public a(MediaMuxer muxer, do2.j flowCollector) {
        this.f23558a = 0;
        Intrinsics.checkNotNullParameter(muxer, "muxer");
        Intrinsics.checkNotNullParameter(flowCollector, "flowCollector");
        this.f23560c = muxer;
        this.f23561d = flowCollector;
        this.f23559b = -1;
    }

    public a(r rVar, int i13, o0 o0Var) {
        this.f23558a = 5;
        this.f23560c = rVar;
        this.f23559b = i13;
        this.f23561d = o0Var;
    }

    public a(w.l lVar) {
        this.f23558a = 1;
        this.f23560c = new Object();
        this.f23561d = lVar;
        this.f23559b = 0;
    }

    public a(int i13, l0 l0Var, v2 v2Var) {
        this.f23558a = 6;
        this.f23559b = i13;
        this.f23560c = l0Var;
        this.f23561d = c1.r(v2Var);
    }

    public a(int i13, x xVar) {
        this.f23558a = 10;
        this.f23560c = xVar;
        this.f23559b = i13;
        this.f23561d = new t0(1);
    }

    public a(p pVar) {
        this.f23558a = 4;
        this.f23561d = pVar;
    }

    public a(e4 e4Var) {
        this.f23558a = 3;
        this.f23560c = e4Var;
    }
}
