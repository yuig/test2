package he2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.pinterest.shuffles.scene.composer.w;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kv0.p;
import xk2.q;
import xk2.r;

/* loaded from: classes4.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68966i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f68967j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(0);
        this.f68966i = i13;
        this.f68967j = fVar;
    }

    public final Bitmap b() {
        Object m13;
        ByteBuffer allocateDirect;
        yd2.j jVar;
        int i13 = this.f68966i;
        f fVar = this.f68967j;
        switch (i13) {
            case 1:
                int width = fVar.f54675a.getWidth();
                int height = fVar.f54675a.getHeight();
                try {
                    q qVar = xk2.s.f135225b;
                    allocateDirect = ByteBuffer.allocateDirect(width * height * 4);
                    jVar = fVar.f68977e;
                } catch (OutOfMemoryError e13) {
                    q qVar2 = xk2.s.f135225b;
                    m13 = ue.c.m(e13);
                }
                if (jVar == null) {
                    Intrinsics.r("frameBuffer");
                    throw null;
                }
                ae2.d colorTexture = fVar.f68980h;
                if (colorTexture == null) {
                    Intrinsics.r("postProcessingTexture");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(colorTexture, "colorTexture");
                yd2.e readAttachments = new yd2.e(colorTexture);
                Intrinsics.checkNotNullParameter(readAttachments, "readAttachments");
                jVar.f138808c = readAttachments;
                jVar.f138807b = yd2.b.READ;
                jVar.a();
                pe.i.J(d.f68968j, "set read pixel alignment to 1 byte");
                pe.i.J(new w(width, height, allocateDirect, 2), "copy offscreen color texture to byte buffer");
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(allocateDirect);
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f, -1.0f);
                m13 = Bitmap.createBitmap(createBitmap, 0, 0, width, height, matrix, true);
                Intrinsics.checkNotNullExpressionValue(m13, "let(...)");
                Throwable a13 = xk2.s.a(m13);
                if (a13 == null) {
                    return (Bitmap) m13;
                }
                throw new Throwable("Bitmap is too large to allocate", a13);
            default:
                fVar.getClass();
                c block = new c(fVar, 1);
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block, "block");
                Intrinsics.checkNotNullParameter("", "tag");
                Intrinsics.checkNotNullParameter(block, "block");
                return (Bitmap) block.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f68966i) {
            case 0:
                m146invoke();
                break;
            case 1:
                break;
            case 2:
                m146invoke();
                break;
            case 3:
                break;
            case 4:
                m146invoke();
                break;
            case 5:
                m146invoke();
                break;
            case 6:
                m146invoke();
                break;
            default:
                m146invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m146invoke() {
        r rVar;
        r rVar2;
        int i13 = 5;
        int i14 = 4;
        int i15 = 3;
        switch (this.f68966i) {
            case 0:
                f fVar = this.f68967j;
                GLES20.glViewport(0, 0, fVar.f54675a.getWidth(), fVar.f54675a.getHeight());
                yd2.j jVar = fVar.f68977e;
                if (jVar != null) {
                    ae2.d dVar = fVar.f68978f;
                    if (dVar != null) {
                        ae2.d[] dVarArr = new ae2.d[1];
                        ae2.d dVar2 = fVar.f68979g;
                        if (dVar2 != null) {
                            dVarArr[0] = dVar2;
                            jVar.b(new yd2.c(dVar, dVarArr));
                            jVar.a();
                            id2.c cVar = fVar.f68975c.f79315g;
                            GLES30.glClearBufferfv(6144, 0, new float[]{cVar.f72190a, cVar.f72191b, cVar.f72192c, cVar.f72193d}, 0);
                            GLES30.glClearBufferfv(6144, 1, new float[]{0.0f, 0.0f, 0.0f, 0.0f}, 0);
                            return;
                        }
                        Intrinsics.r("indexTexture");
                        throw null;
                    }
                    Intrinsics.r("colorTexture");
                    throw null;
                }
                Intrinsics.r("frameBuffer");
                throw null;
            case 1:
            case 3:
            default:
                f fVar2 = this.f68967j;
                ae2.d dVar3 = fVar2.f68979g;
                if (dVar3 == null) {
                    Intrinsics.r("indexTexture");
                    throw null;
                }
                synchronized (dVar3) {
                    yd2.j jVar2 = fVar2.f68977e;
                    if (jVar2 != null) {
                        ae2.d colorTexture = fVar2.f68979g;
                        if (colorTexture != null) {
                            Intrinsics.checkNotNullParameter(colorTexture, "colorTexture");
                            yd2.e readAttachments = new yd2.e(colorTexture);
                            Intrinsics.checkNotNullParameter(readAttachments, "readAttachments");
                            jVar2.f138808c = readAttachments;
                            jVar2.f138807b = yd2.b.READ;
                            jVar2.a();
                            int width = fVar2.f54675a.getWidth();
                            int height = fVar2.f54675a.getHeight();
                            pe.i.J(d.f68970l, "set read pixel alignment to 1 byte");
                            pe.i.J(new w(width, height, fVar2, i15), "copy offscreen index texture to hit-tester data");
                            fVar2.f68983k.f68962a.rewind();
                            fVar2.f68984l = true;
                            Unit unit = Unit.f80348a;
                        } else {
                            Intrinsics.r("indexTexture");
                            throw null;
                        }
                    } else {
                        Intrinsics.r("frameBuffer");
                        throw null;
                    }
                }
                return;
            case 2:
                f fVar3 = this.f68967j;
                fVar3.getClass();
                int[] iArr = new int[2];
                GLES20.glGetIntegerv(33307, iArr, 0);
                GLES20.glGetIntegerv(33308, iArr, 1);
                int i16 = iArr[0];
                int i17 = iArr[1];
                if (i16 <= 3 && (i16 != 3 || i17 < 0)) {
                    throw new IllegalStateException(("\n                OpenGL 3.0 isn't supported on this device.\n                Maximum supported version is " + i16 + '.' + i17 + ".\n                Bye\n            ").toString());
                }
                fVar3.f68977e = new yd2.j();
                fVar3.f68982j = new ce2.b();
                kd2.i iVar = kd2.i.f79272h;
                if (iVar != null) {
                    if (iVar.f79279g) {
                        int glCreateShader = GLES20.glCreateShader(35633);
                        GLES20.glShaderSource(glCreateShader, "attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n    gl_Position = vPosition;\n    textureCoordinate = inputTextureCoordinate;\n}");
                        GLES20.glCompileShader(glCreateShader);
                        int glCreateShader2 = GLES20.glCreateShader(35632);
                        GLES20.glShaderSource(glCreateShader2, "precision mediump float;\nvarying vec2 textureCoordinate;\nuniform sampler2D s_texture;\nvoid main() {\n    gl_FragColor = texture2D(s_texture, textureCoordinate);\n}");
                        GLES20.glCompileShader(glCreateShader2);
                        int glCreateProgram = GLES20.glCreateProgram();
                        GLES20.glAttachShader(glCreateProgram, glCreateShader);
                        GLES20.glAttachShader(glCreateProgram, glCreateShader2);
                        GLES20.glLinkProgram(glCreateProgram);
                        fVar3.f68985m = glCreateProgram;
                    }
                    Iterator it = ((List) ((p) fVar3.f68987o.f56383d).f80994a).iterator();
                    while (it.hasNext()) {
                        ((ee2.e) it.next()).f58824a.f58816a = false;
                    }
                    return;
                }
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            case 4:
                f fVar4 = this.f68967j;
                yd2.j jVar3 = fVar4.f68977e;
                if (jVar3 != null) {
                    ae2.d colorTexture2 = fVar4.f68980h;
                    if (colorTexture2 != null) {
                        Intrinsics.checkNotNullParameter(colorTexture2, "colorTexture");
                        yd2.e readAttachments2 = new yd2.e(colorTexture2);
                        Intrinsics.checkNotNullParameter(readAttachments2, "readAttachments");
                        jVar3.f138808c = readAttachments2;
                        jVar3.f138807b = yd2.b.READ;
                        jVar3.a();
                        return;
                    }
                    Intrinsics.r("postProcessingTexture");
                    throw null;
                }
                Intrinsics.r("frameBuffer");
                throw null;
            case 5:
                f fVar5 = this.f68967j;
                int width2 = fVar5.f54675a.getWidth();
                int height2 = fVar5.f54675a.getHeight();
                kd2.i iVar2 = kd2.i.f79272h;
                if (iVar2 != null) {
                    boolean z13 = iVar2.f79279g;
                    if (!z13) {
                        if (z13) {
                            return;
                        }
                        GLES30.glBlitFramebuffer(0, 0, width2, height2, 0, 0, width2, height2, 16384, 9728);
                        return;
                    }
                    int i18 = fVar5.f68985m;
                    ByteBuffer tempBuffer = fVar5.f68986n;
                    ae2.d sourceTexture = fVar5.f68980h;
                    if (sourceTexture != null) {
                        Intrinsics.checkNotNullParameter(tempBuffer, "tempBuffer");
                        Intrinsics.checkNotNullParameter(sourceTexture, "sourceTexture");
                        if (i18 == 0) {
                            return;
                        }
                        tempBuffer.clear();
                        GLES20.glReadPixels(0, 0, width2, height2, 6408, 5121, tempBuffer);
                        GLES20.glBindTexture(3553, sourceTexture.f15063b);
                        GLES20.glTexSubImage2D(3553, 0, 0, 0, width2, height2, 6408, 5121, tempBuffer);
                        GLES20.glUseProgram(i18);
                        int glGetUniformLocation = GLES20.glGetUniformLocation(i18, "s_texture");
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, sourceTexture.f15063b);
                        GLES20.glUniform1i(glGetUniformLocation, 0);
                        try {
                            q qVar = xk2.s.f135225b;
                            float[] fArr = k.f68996a;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
                            allocateDirect.order(ByteOrder.nativeOrder());
                            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                            asFloatBuffer.put(fArr);
                            asFloatBuffer.position(0);
                            rVar = asFloatBuffer;
                        } catch (OutOfMemoryError e13) {
                            q qVar2 = xk2.s.f135225b;
                            rVar = ue.c.m(e13);
                        }
                        if (xk2.s.a(rVar) == null) {
                            Intrinsics.checkNotNullExpressionValue(rVar, "getOrElse(...)");
                            FloatBuffer floatBuffer = (FloatBuffer) rVar;
                            try {
                                float[] fArr2 = k.f68997b;
                                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
                                allocateDirect2.order(ByteOrder.nativeOrder());
                                FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
                                asFloatBuffer2.put(fArr2);
                                asFloatBuffer2.position(0);
                                rVar2 = asFloatBuffer2;
                            } catch (OutOfMemoryError e14) {
                                q qVar3 = xk2.s.f135225b;
                                rVar2 = ue.c.m(e14);
                            }
                            if (xk2.s.a(rVar2) == null) {
                                Intrinsics.checkNotNullExpressionValue(rVar2, "getOrElse(...)");
                                FloatBuffer floatBuffer2 = (FloatBuffer) rVar2;
                                int glGetAttribLocation = GLES20.glGetAttribLocation(i18, "vPosition");
                                int glGetAttribLocation2 = GLES20.glGetAttribLocation(i18, "inputTextureCoordinate");
                                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                                GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) floatBuffer);
                                GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 0, (Buffer) floatBuffer2);
                                GLES20.glDrawArrays(5, 0, 4);
                                GLES20.glDisableVertexAttribArray(glGetAttribLocation);
                                GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Intrinsics.r("postProcessingTexture");
                    throw null;
                }
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            case 6:
                pe.i.J(d.f68969k, "bind screen draw buffer");
                f fVar6 = this.f68967j;
                pe.i.J(new c(fVar6, i14), "bind read buffer to draw");
                pe.i.J(new c(fVar6, i13), "copy offscreen color texture to view surface");
                return;
        }
    }
}
