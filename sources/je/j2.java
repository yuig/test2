package je;

import android.graphics.Canvas;
import android.graphics.Picture;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a */
    public k1 f75668a;

    /* renamed from: b */
    public za.c f75669b;

    /* renamed from: c */
    public HashMap f75670c;

    /* JADX WARN: Multi-variable type inference failed */
    public static p1 c(n1 n1Var, String str) {
        p1 c13;
        p1 p1Var = (p1) n1Var;
        if (str.equals(p1Var.f75734c)) {
            return p1Var;
        }
        for (Object obj : n1Var.getChildren()) {
            if (obj instanceof p1) {
                p1 p1Var2 = (p1) obj;
                if (str.equals(p1Var2.f75734c)) {
                    return p1Var2;
                }
                if ((obj instanceof n1) && (c13 = c((n1) obj, str)) != null) {
                    return c13;
                }
            }
        }
        return null;
    }

    public static j2 d(String str) {
        return new f3().f(new ByteArrayInputStream(str.getBytes()));
    }

    public final z a() {
        g2 g2Var;
        g2 g2Var2;
        g2 g2Var3;
        g2 g2Var4;
        float f13;
        g2 g2Var5;
        k1 k1Var = this.f75668a;
        m0 m0Var = k1Var.f75673r;
        m0 m0Var2 = k1Var.f75674s;
        if (m0Var == null || m0Var.j() || (g2Var2 = m0Var.f75695b) == (g2Var = g2.percent) || g2Var2 == (g2Var3 = g2.em) || g2Var2 == (g2Var4 = g2.ex)) {
            return new z(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float a13 = m0Var.a(96.0f);
        if (m0Var2 == null) {
            z zVar = this.f75668a.f75802o;
            f13 = zVar != null ? (zVar.f75826d * a13) / zVar.f75825c : a13;
        } else {
            if (m0Var2.j() || (g2Var5 = m0Var2.f75695b) == g2Var || g2Var5 == g2Var3 || g2Var5 == g2Var4) {
                return new z(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f13 = m0Var2.a(96.0f);
        }
        return new z(0.0f, 0.0f, a13, f13);
    }

    public final p1 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f75668a.f75734c)) {
            return this.f75668a;
        }
        HashMap hashMap = this.f75670c;
        if (hashMap.containsKey(str)) {
            return (p1) hashMap.get(str);
        }
        p1 c13 = c(this.f75668a, str);
        hashMap.put(str, c13);
        return c13;
    }

    public final void e(Canvas canvas) {
        x xVar = new x();
        xVar.f75811e = new z(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        new t2(canvas).J(this, xVar);
    }

    public final Picture f(int i13, int i14, x xVar) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i13, i14);
        if (xVar == null || xVar.f75811e == null) {
            if (xVar == null) {
                xVar = new x();
            } else {
                x xVar2 = new x();
                xVar2.f75807a = null;
                xVar2.f75808b = null;
                xVar2.f75809c = null;
                xVar2.f75810d = null;
                xVar2.f75811e = null;
                xVar2.f75807a = xVar.f75807a;
                xVar2.f75808b = xVar.f75808b;
                xVar2.f75809c = xVar.f75809c;
                xVar2.f75810d = xVar.f75810d;
                xVar2.f75811e = xVar.f75811e;
                xVar = xVar2;
            }
            xVar.f75811e = new z(0.0f, 0.0f, i13, i14);
        }
        new t2(beginRecording).J(this, xVar);
        picture.endRecording();
        return picture;
    }

    public final p1 g(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        return b(replace.substring(1));
    }
}
