package x0;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.v2;
import c0.z;
import com.bumptech.glide.d;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kh2.m0;
import net.quikkly.android.utils.BitmapUtils;
import r0.m;
import y0.e;
import y0.f;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f131266a;

    /* renamed from: b, reason: collision with root package name */
    public static final v2 f131267b;

    static {
        HashMap hashMap = new HashMap();
        f131266a = hashMap;
        f131267b = v2.UPTIME;
        HashMap hashMap2 = new HashMap();
        f fVar = f.f136330d;
        hashMap2.put(1, fVar);
        f fVar2 = f.f136332f;
        hashMap2.put(2, fVar2);
        f fVar3 = f.f136333g;
        hashMap2.put(4096, fVar3);
        hashMap2.put(8192, fVar3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, fVar);
        hashMap3.put(2, fVar2);
        hashMap3.put(4096, fVar3);
        hashMap3.put(8192, fVar3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, fVar);
        hashMap4.put(4, fVar2);
        hashMap4.put(4096, fVar3);
        hashMap4.put(16384, fVar3);
        hashMap4.put(2, fVar);
        hashMap4.put(8, fVar2);
        hashMap4.put(8192, fVar3);
        hashMap4.put(32768, fVar3);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER), fVar2);
        hashMap5.put(Integer.valueOf(BitmapUtils.BITMAP_TO_JPEG_SIZE), f.f136331e);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    public static f a(int i13, String str) {
        f fVar;
        Map map = (Map) f131266a.get(str);
        if (map != null && (fVar = (f) map.get(Integer.valueOf(i13))) != null) {
            return fVar;
        }
        m0.X0("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i13)));
        return f.f136330d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e b(a aVar, v2 v2Var, m mVar, Size size, z zVar, Range range) {
        c cVar;
        androidx.camera.core.impl.f fVar = aVar.f131265c;
        if (fVar != null) {
            jf2.c cVar2 = new jf2.c();
            cVar2.f75872a = aVar.f131263a;
            cVar2.f75873b = v2Var;
            cVar2.f75874c = mVar;
            cVar2.f75875d = size;
            cVar2.f75876e = fVar;
            cVar2.f75877f = zVar;
            cVar2.f75878g = range;
            cVar = cVar2;
        } else {
            cVar = new c(aVar.f131263a, v2Var, mVar, size, zVar, range);
        }
        return (e) cVar.get();
    }

    public static a c(r0.e eVar, z zVar, t0.a aVar) {
        d.v("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + zVar + "]", zVar.b());
        int i13 = eVar.f105511c;
        String str = "video/avc";
        String str2 = i13 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        int i14 = zVar.f24407a;
        if (aVar != null) {
            Set set = (Set) z0.b.f140509b.get(Integer.valueOf(i14));
            if (set == null) {
                set = Collections.emptySet();
            }
            Set set2 = (Set) z0.b.f140508a.get(Integer.valueOf(zVar.f24408b));
            if (set2 == null) {
                set2 = Collections.emptySet();
            }
            for (androidx.camera.core.impl.f fVar : aVar.f115659d) {
                if (set.contains(Integer.valueOf(fVar.f16837j)) && set2.contains(Integer.valueOf(fVar.f16835h))) {
                    String str3 = fVar.f16829b;
                    if (str2.equals(str3)) {
                        m0.p("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + "]");
                    } else if (i13 == -1) {
                        m0.p("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + zVar + "]");
                    }
                    str2 = str3;
                    break;
                }
            }
        }
        fVar = null;
        if (fVar == null) {
            if (i13 == -1) {
                if (i14 != 1) {
                    if (i14 == 3 || i14 == 4 || i14 == 5) {
                        str = "video/hevc";
                    } else {
                        if (i14 != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + zVar + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (aVar == null) {
                m0.p("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + zVar + "]");
            } else {
                m0.p("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + zVar + "]");
            }
        }
        if (str2 != null) {
            return new a(str2, -1, fVar != null ? fVar : null);
        }
        throw new NullPointerException("Null mimeType");
    }

    public static int d(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24, Range range) {
        Rational rational = new Rational(i14, i15);
        Rational rational2 = new Rational(i16, i17);
        int doubleValue = (int) (new Rational(i23, i24).doubleValue() * new Rational(i18, i19).doubleValue() * rational2.doubleValue() * rational.doubleValue() * i13);
        String format = m0.G0(3, "VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(i23), Integer.valueOf(i24), Integer.valueOf(doubleValue)) : "";
        if (!m.f105605f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            int intValue = num.intValue();
            if (m0.G0(3, "VideoConfigUtil")) {
                format = format.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
            doubleValue = intValue;
        }
        m0.p("VideoConfigUtil", format);
        return doubleValue;
    }

    public static e e(androidx.camera.core.impl.f fVar) {
        y0.d d2 = e.d();
        String str = fVar.f16829b;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        d2.f136303a = str;
        d2.f136304b = Integer.valueOf(fVar.f16834g);
        d2.f136306d = new Size(fVar.f16832e, fVar.f16833f);
        d2.f136309g = Integer.valueOf(fVar.f16831d);
        d2.f136311i = Integer.valueOf(fVar.f16830c);
        v2 v2Var = f131267b;
        if (v2Var == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        d2.f136305c = v2Var;
        return d2.a();
    }
}
