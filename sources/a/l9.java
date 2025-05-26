package a;

import ads_mobile_sdk.jc0;
import ads_mobile_sdk.oo;
import android.net.Uri;
import android.text.Layout;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class l9 {

    /* renamed from: a */
    public static final h f80a = new h(2);

    /* renamed from: b */
    public static final h f81b = new h(3);

    /* renamed from: c */
    public static final h f82c = new h(4);

    /* renamed from: d */
    public static final h f83d = new h(5);

    /* renamed from: e */
    public static final h f84e = new h(6);

    /* renamed from: f */
    public static final h f85f = new h(7);

    /* renamed from: g */
    public static final h f86g = new h(8);

    /* renamed from: h */
    public static final h f87h = new h(9);

    /* renamed from: i */
    public static final h f88i = new h(10);

    /* renamed from: j */
    public static final h f89j = new h(11);

    /* renamed from: k */
    public static final h f90k = new h(12);

    /* renamed from: l */
    public static final h f91l = new h(13);

    /* renamed from: m */
    public static final h f92m = new h(14);

    /* renamed from: n */
    public static final h f93n = new h(15);

    /* renamed from: o */
    public static final h f94o = new h(16);

    /* renamed from: p */
    public static final h f95p = new h(17);

    /* renamed from: q */
    public static final d6 f96q = new d6();

    /* renamed from: r */
    public static final h f97r = new h(18);

    /* renamed from: s */
    public static final h f98s = new h(19);

    /* renamed from: t */
    public static final h f99t = new h(20);

    /* renamed from: u */
    public static final h f100u = new h(21);

    /* renamed from: v */
    public static final h f101v = new h(22);

    /* renamed from: w */
    public static final h f102w = new h(23);

    /* renamed from: x */
    public static final h f103x = new h(24);

    /* renamed from: y */
    public static final h f104y = new h(25);

    /* renamed from: z */
    public static final h f105z = new h(26);
    public static final h A = new h(27);
    public static final h B = new h(28);
    public static final h C = new h(29);

    public static final long a(int i13) {
        long j13 = (i13 << 32) | (0 & 4294967295L);
        int i14 = l3.a.f81492n;
        return j13;
    }

    public static jc0 b() {
        String str;
        ClassLoader classLoader = l9.class.getClassLoader();
        if (jc0.class.equals(jc0.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!jc0.class.getPackage().equals(l9.class.getPackage())) {
                throw new IllegalArgumentException(jc0.class.getName());
            }
            str = a.C(jc0.class.getPackage().getName(), ".BlazeGeneratedjc0Loader");
        }
        try {
            try {
                try {
                    if (Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(e14);
                }
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(e16);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(l9.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e17) {
                    Logger.getLogger(oo.class.getName()).log(Level.SEVERE, "Unable to load jc0", (Throwable) e17);
                }
            }
            if (arrayList.size() == 1) {
                return (jc0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (jc0) jc0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e18) {
                throw new IllegalStateException(e18);
            } catch (NoSuchMethodException e19) {
                throw new IllegalStateException(e19);
            } catch (InvocationTargetException e23) {
                throw new IllegalStateException(e23);
            }
        }
    }

    public static LinkedHashMap c(int i13) {
        return new LinkedHashMap(i13 < 3 ? i13 + 1 : i13 < 1073741824 ? (int) ((i13 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static boolean d(List list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    public static final boolean e(b4.q0 q0Var) {
        b4.x xVar;
        b4.z zVar = q0Var.f21650c;
        b4.k kVar = (zVar == null || (xVar = zVar.f21680b) == null) ? null : new b4.k(xVar.f21677b);
        boolean z13 = false;
        if (kVar != null && kVar.f21599a == 1) {
            z13 = true;
        }
        return !z13;
    }

    public static List f(int i13) {
        return i13 == 0 ? Collections.emptyList() : new ArrayList(i13);
    }

    public static boolean g(char c13, char[] cArr) {
        for (char c14 : cArr) {
            if (c14 == c13) {
                return true;
            }
        }
        return false;
    }

    public static final int h(Layout layout, int i13, boolean z13) {
        if (i13 <= 0) {
            return 0;
        }
        if (i13 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i13);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i13 || layout.getLineEnd(lineForOffset) == i13) ? lineStart == i13 ? z13 ? lineForOffset - 1 : lineForOffset : z13 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }

    public static final boolean i(b4.g gVar) {
        int length = gVar.f21571a.length();
        List list = gVar.f21574d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            b4.e eVar = (b4.e) list.get(i13);
            if ((eVar.b() instanceof b4.n) && b4.h.c(0, length, eVar.c(), eVar.a())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int j(String str) {
        char c13;
        if (str == null) {
            return -1;
        }
        String r13 = a7.o0.r(str);
        r13.getClass();
        switch (r13.hashCode()) {
            case -2123537834:
                if (r13.equals("audio/eac3-joc")) {
                    c13 = 0;
                    break;
                }
                c13 = 65535;
                break;
            case -1662384011:
                if (r13.equals("video/mp2p")) {
                    c13 = 1;
                    break;
                }
                c13 = 65535;
                break;
            case -1662384007:
                if (r13.equals("video/mp2t")) {
                    c13 = 2;
                    break;
                }
                c13 = 65535;
                break;
            case -1662095187:
                if (r13.equals("video/webm")) {
                    c13 = 3;
                    break;
                }
                c13 = 65535;
                break;
            case -1606874997:
                if (r13.equals("audio/amr-wb")) {
                    c13 = 4;
                    break;
                }
                c13 = 65535;
                break;
            case -1487656890:
                if (r13.equals("image/avif")) {
                    c13 = 5;
                    break;
                }
                c13 = 65535;
                break;
            case -1487464693:
                if (r13.equals("image/heic")) {
                    c13 = 6;
                    break;
                }
                c13 = 65535;
                break;
            case -1487464690:
                if (r13.equals("image/heif")) {
                    c13 = 7;
                    break;
                }
                c13 = 65535;
                break;
            case -1487394660:
                if (r13.equals("image/jpeg")) {
                    c13 = '\b';
                    break;
                }
                c13 = 65535;
                break;
            case -1487018032:
                if (r13.equals("image/webp")) {
                    c13 = '\t';
                    break;
                }
                c13 = 65535;
                break;
            case -1248337486:
                if (r13.equals("application/mp4")) {
                    c13 = '\n';
                    break;
                }
                c13 = 65535;
                break;
            case -1079884372:
                if (r13.equals("video/x-msvideo")) {
                    c13 = 11;
                    break;
                }
                c13 = 65535;
                break;
            case -1004728940:
                if (r13.equals("text/vtt")) {
                    c13 = '\f';
                    break;
                }
                c13 = 65535;
                break;
            case -879272239:
                if (r13.equals("image/bmp")) {
                    c13 = '\r';
                    break;
                }
                c13 = 65535;
                break;
            case -879258763:
                if (r13.equals("image/png")) {
                    c13 = 14;
                    break;
                }
                c13 = 65535;
                break;
            case -387023398:
                if (r13.equals("audio/x-matroska")) {
                    c13 = 15;
                    break;
                }
                c13 = 65535;
                break;
            case -43467528:
                if (r13.equals("application/webm")) {
                    c13 = 16;
                    break;
                }
                c13 = 65535;
                break;
            case 13915911:
                if (r13.equals("video/x-flv")) {
                    c13 = 17;
                    break;
                }
                c13 = 65535;
                break;
            case 187078296:
                if (r13.equals("audio/ac3")) {
                    c13 = 18;
                    break;
                }
                c13 = 65535;
                break;
            case 187078297:
                if (r13.equals("audio/ac4")) {
                    c13 = 19;
                    break;
                }
                c13 = 65535;
                break;
            case 187078669:
                if (r13.equals("audio/amr")) {
                    c13 = 20;
                    break;
                }
                c13 = 65535;
                break;
            case 187090232:
                if (r13.equals("audio/mp4")) {
                    c13 = 21;
                    break;
                }
                c13 = 65535;
                break;
            case 187091926:
                if (r13.equals("audio/ogg")) {
                    c13 = 22;
                    break;
                }
                c13 = 65535;
                break;
            case 187099443:
                if (r13.equals("audio/wav")) {
                    c13 = 23;
                    break;
                }
                c13 = 65535;
                break;
            case 1331848029:
                if (r13.equals("video/mp4")) {
                    c13 = 24;
                    break;
                }
                c13 = 65535;
                break;
            case 1503095341:
                if (r13.equals("audio/3gpp")) {
                    c13 = 25;
                    break;
                }
                c13 = 65535;
                break;
            case 1504578661:
                if (r13.equals("audio/eac3")) {
                    c13 = 26;
                    break;
                }
                c13 = 65535;
                break;
            case 1504619009:
                if (r13.equals("audio/flac")) {
                    c13 = 27;
                    break;
                }
                c13 = 65535;
                break;
            case 1504824762:
                if (r13.equals("audio/midi")) {
                    c13 = 28;
                    break;
                }
                c13 = 65535;
                break;
            case 1504831518:
                if (r13.equals("audio/mpeg")) {
                    c13 = 29;
                    break;
                }
                c13 = 65535;
                break;
            case 1505118770:
                if (r13.equals("audio/webm")) {
                    c13 = 30;
                    break;
                }
                c13 = 65535;
                break;
            case 2039520277:
                if (r13.equals("video/x-matroska")) {
                    c13 = 31;
                    break;
                }
                c13 = 65535;
                break;
            default:
                c13 = 65535;
                break;
        }
        switch (c13) {
        }
        return -1;
    }

    public static int k(Map map) {
        List list = (List) map.get("Content-Type");
        return j((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int l(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static String m(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        return (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) ? "" : replaceFirst.startsWith("base-") ? replaceFirst.replace("base-", "config.") : replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }
}
