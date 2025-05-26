package a8;

import android.net.Uri;
import androidx.media3.common.ParserException;
import c0.x0;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pk.c1;
import pk.e1;
import pk.n3;
import pk.u0;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public abstract class j0 {

    /* renamed from: a */
    public static final Pattern f1371a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b */
    public static final Pattern f1372b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c */
    public static final Pattern f1373c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d */
    public static final Pattern f1374d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e */
    public static final Pattern f1375e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f */
    public static final Pattern f1376f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g */
    public static final String f1377g = new String(new byte[]{10});

    /* renamed from: h */
    public static final String f1378h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static v2 b(String str) {
        if (str == null) {
            y0 y0Var = c1.f100372b;
            return v2.f100502e;
        }
        pk.a0.C(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i13 = d7.n0.f53866a;
        int i14 = 0;
        for (String str2 : str.split(",\\s?", -1)) {
            int a13 = a(str2);
            if (a13 != 0) {
                Integer valueOf = Integer.valueOf(a13);
                int i15 = i14 + 1;
                int d2 = u0.d(objArr.length, i15);
                if (d2 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i14] = valueOf;
                i14 = i15;
            }
        }
        return c1.l(i14, objArr);
    }

    public static bn0.a c(List list) {
        Matcher matcher = f1372b.matcher((CharSequence) list.get(0));
        bf.b.i(matcher.matches());
        String group = matcher.group(1);
        group.getClass();
        int parseInt = Integer.parseInt(group);
        int indexOf = list.indexOf("");
        bf.b.i(indexOf > 0);
        List subList = list.subList(1, indexOf);
        q qVar = new q();
        qVar.d(subList);
        return new bn0.a(parseInt, 7, new r(qVar), z.a.n(f1378h).l(list.subList(indexOf + 1, list.size())));
    }

    public static x0 d(String str) {
        long parseInt;
        Matcher matcher = f1374d.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.b(str, null);
        }
        String group = matcher.group(1);
        group.getClass();
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e13) {
                throw ParserException.b(str, e13);
            }
        } else {
            parseInt = 60000;
        }
        return new x0(group, parseInt);
    }

    public static q7.w e(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i13 = d7.n0.f53866a;
        String[] split = userInfo.split(":", 2);
        return new q7.w(split[0], split[1], 1);
    }

    public static k0.a f(String str) {
        Matcher matcher = f1375e.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            return new k0.a(group, 2, group2, group3 != null ? group3 : "");
        }
        Matcher matcher2 = f1376f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new k0.a(group4, 1, "", "");
        }
        throw ParserException.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri g(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String encodedAuthority = uri.getEncodedAuthority();
        encodedAuthority.getClass();
        bf.b.i(encodedAuthority.contains("@"));
        int i13 = d7.n0.f53866a;
        return uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
    }

    public static v2 h(k0 k0Var) {
        bf.b.i(k0Var.f1386c.c("CSeq") != null);
        pk.x0 x0Var = new pk.x0();
        x0Var.g(d7.n0.p("%s %s %s", j(k0Var.f1385b), k0Var.f1384a, "RTSP/1.0"));
        e1 a13 = k0Var.f1386c.a();
        n3 it = a13.h().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c1 c1Var = a13.get(str);
            for (int i13 = 0; i13 < c1Var.size(); i13++) {
                x0Var.g(d7.n0.p("%s: %s", str, c1Var.get(i13)));
            }
        }
        x0Var.g("");
        x0Var.g(k0Var.f1387d);
        return x0Var.i();
    }

    public static v2 i(bn0.a aVar) {
        String str;
        bf.b.i(((r) aVar.f23560c).c("CSeq") != null);
        pk.x0 x0Var = new pk.x0();
        Object[] objArr = new Object[3];
        objArr[0] = "RTSP/1.0";
        objArr[1] = Integer.valueOf(aVar.f23559b);
        int i13 = aVar.f23559b;
        if (i13 == 200) {
            str = "OK";
        } else if (i13 == 461) {
            str = "Unsupported Transport";
        } else if (i13 == 500) {
            str = "Internal Server Error";
        } else if (i13 == 505) {
            str = "RTSP Version Not Supported";
        } else if (i13 == 301) {
            str = "Move Permanently";
        } else if (i13 == 302) {
            str = "Move Temporarily";
        } else if (i13 == 400) {
            str = "Bad Request";
        } else if (i13 == 401) {
            str = "Unauthorized";
        } else if (i13 == 404) {
            str = "Not Found";
        } else if (i13 != 405) {
            switch (i13) {
                case 454:
                    str = "Session Not Found";
                    break;
                case 455:
                    str = "Method Not Valid In This State";
                    break;
                case 456:
                    str = "Header Field Not Valid";
                    break;
                case 457:
                    str = "Invalid Range";
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            str = "Method Not Allowed";
        }
        objArr[2] = str;
        x0Var.g(d7.n0.p("%s %s %s", objArr));
        e1 a13 = ((r) aVar.f23560c).a();
        n3 it = a13.h().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            c1 c1Var = a13.get(str2);
            for (int i14 = 0; i14 < c1Var.size(); i14++) {
                x0Var.g(d7.n0.p("%s: %s", str2, c1Var.get(i14)));
            }
        }
        x0Var.g("");
        x0Var.g((String) aVar.f23561d);
        return x0Var.i();
    }

    public static String j(int i13) {
        switch (i13) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
