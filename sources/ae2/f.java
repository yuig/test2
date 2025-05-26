package ae2;

import android.opengl.GLES20;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import pe.i;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f15061d = z0.g(new Pair(10241, 9729), new Pair(10240, 9729), new Pair(10242, 33071), new Pair(10243, 33071));

    /* renamed from: a, reason: collision with root package name */
    public final c f15062a;

    /* renamed from: b, reason: collision with root package name */
    public int f15063b;

    /* renamed from: c, reason: collision with root package name */
    public int f15064c;

    public f(c cVar) {
        this.f15062a = cVar;
        int[] iArr = new int[1];
        i.J(new nd2.a(iArr, 5), "generate texture");
        int i13 = iArr[0];
        if (i13 <= 0) {
            throw new IllegalStateException("failed to generate new OpenGL texture".toString());
        }
        this.f15063b = i13;
        GLES20.glEnable(cVar.getGlslType());
        a();
        for (Map.Entry entry : f15061d.entrySet()) {
            GLES20.glTexParameteri(this.f15062a.getGlslType(), ((Number) entry.getKey()).intValue(), ((Number) entry.getValue()).intValue());
        }
    }

    public final void a() {
        if (this.f15063b <= 0) {
            throw new IllegalStateException("texture is released".toString());
        }
        GLES20.glActiveTexture(this.f15064c + 33984);
        GLES20.glBindTexture(this.f15062a.getGlslType(), this.f15063b);
    }

    public final void b() {
        int i13 = this.f15063b;
        if (i13 <= 0) {
            return;
        }
        GLES20.glDeleteTextures(1, new int[]{i13}, 0);
        this.f15063b = 0;
    }
}
