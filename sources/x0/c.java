package x0;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.v2;
import c0.p1;
import c0.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kh2.m0;
import p5.f;
import r0.m;
import y0.d;
import y0.e;

/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final Size f131268g = new Size(1280, 720);

    /* renamed from: h, reason: collision with root package name */
    public static final Range f131269h = new Range(1, 60);

    /* renamed from: a, reason: collision with root package name */
    public final String f131270a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f131271b;

    /* renamed from: c, reason: collision with root package name */
    public final m f131272c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f131273d;

    /* renamed from: e, reason: collision with root package name */
    public final z f131274e;

    /* renamed from: f, reason: collision with root package name */
    public final Range f131275f;

    public c(String str, v2 v2Var, m mVar, Size size, z zVar, Range range) {
        this.f131270a = str;
        this.f131271b = v2Var;
        this.f131272c = mVar;
        this.f131273d = size;
        this.f131274e = zVar;
        this.f131275f = range;
    }

    @Override // p5.f
    public final Object get() {
        Integer num;
        Range range = p1.f24298p;
        Range range2 = this.f131275f;
        int intValue = !Objects.equals(range2, range) ? ((Integer) f131269h.clamp((Integer) range2.getUpper())).intValue() : 30;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(intValue);
        boolean equals = Objects.equals(range2, range);
        Object obj = range2;
        if (!equals) {
            obj = "<UNSPECIFIED>";
        }
        objArr[1] = obj;
        m0.p("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", objArr));
        m0.p("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + intValue + "fps");
        Range range3 = this.f131272c.f105609c;
        m0.p("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        z zVar = this.f131274e;
        int i13 = zVar.f24408b;
        Size size = this.f131273d;
        int width = size.getWidth();
        Size size2 = f131268g;
        int d2 = b.d(14000000, i13, 8, intValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range3);
        HashMap hashMap = z0.b.f140512e;
        String str = this.f131270a;
        Map map = (Map) hashMap.get(str);
        int intValue2 = (map == null || (num = (Integer) map.get(zVar)) == null) ? -1 : num.intValue();
        y0.f a13 = b.a(intValue2, str);
        d d13 = e.d();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        d13.f136303a = str;
        v2 v2Var = this.f131271b;
        if (v2Var == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        d13.f136305c = v2Var;
        d13.f136306d = size;
        d13.f136311i = Integer.valueOf(d2);
        d13.f136309g = Integer.valueOf(intValue);
        d13.f136304b = Integer.valueOf(intValue2);
        d13.f136308f = a13;
        return d13.a();
    }
}
