package androidx.camera.core.impl;

import android.opengl.GLES20;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Serializable;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r1 implements u1 {

    /* renamed from: a */
    public int f16957a = GLES20.glCreateProgram();

    /* renamed from: b */
    public Object f16958b;

    /* renamed from: c */
    public boolean f16959c;

    /* renamed from: d */
    public Object f16960d;

    /* renamed from: e */
    public Serializable f16961e;

    /* renamed from: f */
    public Object f16962f;

    /* JADX WARN: Type inference failed for: r2v13, types: [d7.m[], java.io.Serializable] */
    public r1(String str, String str2) {
        byte[] bArr;
        byte[] bArr2;
        d7.n.d();
        b(this.f16957a, 35633, str);
        b(this.f16957a, 35632, str2);
        GLES20.glLinkProgram(this.f16957a);
        int i13 = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.f16957a, 35714, iArr, 0);
        int i14 = 1;
        d7.n.e("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(this.f16957a), iArr[0] == 1);
        GLES20.glUseProgram(this.f16957a);
        this.f16958b = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(this.f16957a, 35721, iArr2, 0);
        this.f16960d = new d7.l[iArr2[0]];
        int i15 = 0;
        while (i15 < iArr2[0]) {
            int i16 = this.f16957a;
            int[] iArr3 = new int[i14];
            GLES20.glGetProgramiv(i16, 35722, iArr3, 0);
            int i17 = iArr3[0];
            byte[] bArr3 = new byte[i17];
            GLES20.glGetActiveAttrib(i16, i15, i17, new int[i14], 0, new int[i14], 0, new int[i14], 0, bArr3, 0);
            int i18 = 0;
            while (true) {
                if (i18 >= i17) {
                    bArr2 = bArr3;
                    i18 = i17;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i18] == 0) {
                        break;
                    }
                    i18++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i18);
            d7.l lVar = new d7.l(str3, GLES20.glGetAttribLocation(i16, str3));
            ((d7.l[]) this.f16960d)[i15] = lVar;
            ((Map) this.f16958b).put(str3, lVar);
            i15++;
            i14 = 1;
        }
        this.f16962f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f16957a, 35718, iArr4, 0);
        this.f16961e = new d7.m[iArr4[0]];
        for (int i19 = 0; i19 < iArr4[i13]; i19++) {
            int i23 = this.f16957a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i23, 35719, iArr5, i13);
            int[] iArr6 = new int[1];
            int i24 = iArr5[i13];
            byte[] bArr4 = new byte[i24];
            GLES20.glGetActiveUniform(i23, i19, i24, new int[1], 0, new int[1], 0, iArr6, 0, bArr4, 0);
            int i25 = 0;
            while (true) {
                if (i25 >= i24) {
                    bArr = bArr4;
                    i25 = i24;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i25] == 0) {
                        break;
                    }
                    i25++;
                    bArr4 = bArr;
                }
            }
            i13 = 0;
            String str4 = new String(bArr, 0, i25);
            d7.m mVar = new d7.m(str4, GLES20.glGetUniformLocation(i23, str4), iArr6[0]);
            ((d7.m[]) this.f16961e)[i19] = mVar;
            ((Map) this.f16962f).put(str4, mVar);
        }
        d7.n.d();
    }

    public static void b(int i13, int i14, String str) {
        int glCreateShader = GLES20.glCreateShader(i14);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        d7.n.e(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i13, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        d7.n.d();
    }

    public static r1 r(Object obj) {
        r1 r1Var = new r1();
        r1Var.f16960d = new Object();
        r1Var.f16957a = 0;
        r1Var.f16959c = false;
        r1Var.f16958b = new HashMap();
        r1Var.f16962f = new CopyOnWriteArraySet();
        r1Var.f16961e = new AtomicReference(obj);
        return r1Var;
    }

    @Override // androidx.camera.core.impl.u1
    public final void a(t1 t1Var, Executor executor) {
        q2 q2Var;
        synchronized (this.f16960d) {
            i(t1Var);
            q2Var = new q2((AtomicReference) this.f16961e, executor, t1Var);
            ((Map) this.f16958b).put(t1Var, q2Var);
            ((CopyOnWriteArraySet) this.f16962f).add(q2Var);
        }
        q2Var.a(0);
    }

    @Override // androidx.camera.core.impl.u1
    public final com.google.common.util.concurrent.c0 c() {
        Object obj = ((AtomicReference) this.f16961e).get();
        return obj instanceof i ? new g0.n(((i) obj).f16871a) : g0.m.e(obj);
    }

    public final void d() {
        for (d7.l lVar : (d7.l[]) this.f16960d) {
            FloatBuffer floatBuffer = lVar.f53851b;
            bf.b.o(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(lVar.f53850a, lVar.f53852c, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(lVar.f53850a);
            d7.n.d();
        }
        for (d7.m mVar : (d7.m[]) this.f16961e) {
            boolean z13 = this.f16959c;
            int[] iArr = mVar.f53856d;
            int i13 = mVar.f53853a;
            int i14 = mVar.f53854b;
            if (i14 != 5124) {
                float[] fArr = mVar.f53855c;
                if (i14 == 5126) {
                    GLES20.glUniform1fv(i13, 1, fArr, 0);
                    d7.n.d();
                } else if (i14 == 35678 || i14 == 35815 || i14 == 36198) {
                    if (mVar.f53857e == 0) {
                        throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                    }
                    GLES20.glActiveTexture(mVar.f53858f + 33984);
                    d7.n.d();
                    d7.n.b(i14 == 35678 ? 3553 : 36197, mVar.f53857e, (i14 == 35678 || !z13) ? 9729 : 9728);
                    if (i14 == 35678) {
                        if (mVar.f53859g == 9987) {
                            GLES20.glGenerateMipmap(3553);
                            d7.n.d();
                        }
                        GLES20.glTexParameteri(3553, 10241, mVar.f53859g);
                        d7.n.d();
                    }
                    GLES20.glUniform1i(i13, mVar.f53858f);
                    d7.n.d();
                } else {
                    switch (i14) {
                        case 35664:
                            GLES20.glUniform2fv(i13, 1, fArr, 0);
                            d7.n.d();
                            break;
                        case 35665:
                            GLES20.glUniform3fv(i13, 1, fArr, 0);
                            d7.n.d();
                            break;
                        case 35666:
                            GLES20.glUniform4fv(i13, 1, fArr, 0);
                            d7.n.d();
                            break;
                        case 35667:
                            GLES20.glUniform2iv(i13, 1, iArr, 0);
                            d7.n.d();
                            break;
                        case 35668:
                            GLES20.glUniform3iv(i13, 1, iArr, 0);
                            d7.n.d();
                            break;
                        case 35669:
                            GLES20.glUniform4iv(i13, 1, iArr, 0);
                            d7.n.d();
                            break;
                        default:
                            switch (i14) {
                                case 35675:
                                    GLES20.glUniformMatrix3fv(i13, 1, false, fArr, 0);
                                    d7.n.d();
                                    break;
                                case 35676:
                                    GLES20.glUniformMatrix4fv(i13, 1, false, fArr, 0);
                                    d7.n.d();
                                    break;
                                default:
                                    throw new IllegalStateException(a.a.d("Unexpected uniform type: ", i14));
                            }
                    }
                }
            } else {
                GLES20.glUniform1iv(i13, 1, iArr, 0);
                d7.n.d();
            }
        }
    }

    public final GetSignInIntentRequest e() {
        return new GetSignInIntentRequest((String) this.f16960d, (String) this.f16961e, (String) this.f16958b, (String) this.f16962f, this.f16959c, this.f16957a);
    }

    @Override // androidx.camera.core.impl.u1
    public final void f(t1 t1Var) {
        synchronized (this.f16960d) {
            i(t1Var);
        }
    }

    public final int g(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f16957a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        d7.n.d();
        return glGetAttribLocation;
    }

    public final void h(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        hi.i iVar = (hi.i) cVar;
        li.a aVar = new li.a(taskCompletionSource);
        zzbd zzbdVar = (zzbd) this.f16958b;
        com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f16962f;
        synchronized (iVar.f69235f) {
            iVar.f69235f.b(zzbdVar, lVar, aVar);
        }
    }

    public final void i(t1 t1Var) {
        q2 q2Var = (q2) ((Map) this.f16958b).remove(t1Var);
        if (q2Var != null) {
            q2Var.f16951c.set(false);
            ((CopyOnWriteArraySet) this.f16962f).remove(q2Var);
        }
    }

    public final void j() {
        synchronized (this.f16960d) {
            try {
                Iterator it = new HashSet(((Map) this.f16958b).keySet()).iterator();
                while (it.hasNext()) {
                    i((t1) it.next());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(float[] fArr) {
        d7.l lVar = (d7.l) ((Map) this.f16958b).get("aFramePosition");
        lVar.getClass();
        lVar.f53851b = d7.n.h(fArr);
        lVar.f53852c = 4;
    }

    public final void l(String str, float[] fArr) {
        d7.m mVar = (d7.m) ((Map) this.f16962f).get(str);
        mVar.getClass();
        System.arraycopy(fArr, 0, mVar.f53855c, 0, fArr.length);
    }

    public final void m(float[] fArr) {
        d7.m mVar = (d7.m) ((Map) this.f16962f).get("uRgbMatrix");
        if (mVar == null) {
            return;
        }
        System.arraycopy(fArr, 0, mVar.f53855c, 0, fArr.length);
    }

    public final void n(int i13, String str) {
        d7.m mVar = (d7.m) ((Map) this.f16962f).get(str);
        mVar.getClass();
        mVar.f53856d[0] = i13;
    }

    public final void o(int i13, int i14) {
        d7.m mVar = (d7.m) ((Map) this.f16962f).get("uTexSampler");
        mVar.getClass();
        mVar.f53857e = i13;
        mVar.f53858f = 0;
        mVar.f53859g = i14;
    }

    public final void p(Object obj) {
        Iterator it;
        int i13;
        synchronized (this.f16960d) {
            try {
                if (Objects.equals(((AtomicReference) this.f16961e).getAndSet(obj), obj)) {
                    return;
                }
                int i14 = this.f16957a + 1;
                this.f16957a = i14;
                if (this.f16959c) {
                    return;
                }
                this.f16959c = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.f16962f).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((q2) it2.next()).a(i14);
                    } else {
                        synchronized (this.f16960d) {
                            try {
                                if (this.f16957a == i14) {
                                    this.f16959c = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.f16962f).iterator();
                                    i13 = this.f16957a;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i14 = i13;
                    }
                }
            } finally {
            }
        }
    }

    public final void q() {
        GLES20.glUseProgram(this.f16957a);
        d7.n.d();
    }

    public final void s(String str) {
        this.f16958b = str;
    }
}
