package zd2;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.t;
import pe.i;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f141786a;

    /* renamed from: b, reason: collision with root package name */
    public final int f141787b;

    public d(c type, String shaderCode) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(shaderCode, "shaderCode");
        this.f141786a = shaderCode;
        int glCreateShader = GLES20.glCreateShader(type.getGlType());
        this.f141787b = glCreateShader;
        if (glCreateShader == 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i13 = 0;
        i.J(new b(this, 0), "shader source");
        i.J(new b(this, 1), "shader compile");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr[0] != 0) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("\n                    error compiling shader: \n                        ");
        sb3.append(GLES20.glGetShaderInfoLog(glCreateShader));
        sb3.append("\n                    shader code:\n                        ");
        Intrinsics.checkNotNullParameter(shaderCode, "<this>");
        List O = StringsKt.O(shaderCode);
        ArrayList arrayList = new ArrayList(g0.q(O, 10));
        for (Object obj : O) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            String format = String.format("% 3d: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i14), (String) obj}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            arrayList.add(format);
            i13 = i14;
        }
        sb3.append(CollectionsKt.Z(arrayList, "\n", null, null, 0, null, null, 62));
        sb3.append("\n                ");
        String b13 = t.b(sb3.toString());
        GLES20.glDeleteShader(this.f141787b);
        throw new IllegalStateException(b13.toString());
    }
}
