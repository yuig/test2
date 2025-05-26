package pq2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.MediaType;

/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f101113y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f101114z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a, reason: collision with root package name */
    public final d1 f101115a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f101116b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f101117c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[] f101118d;

    /* renamed from: e, reason: collision with root package name */
    public final Annotation[][] f101119e;

    /* renamed from: f, reason: collision with root package name */
    public final Type[] f101120f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f101121g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f101122h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f101123i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f101124j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f101125k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f101126l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f101127m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f101128n;

    /* renamed from: o, reason: collision with root package name */
    public String f101129o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f101130p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f101131q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f101132r;

    /* renamed from: s, reason: collision with root package name */
    public String f101133s;

    /* renamed from: t, reason: collision with root package name */
    public Headers f101134t;

    /* renamed from: u, reason: collision with root package name */
    public MediaType f101135u;

    /* renamed from: v, reason: collision with root package name */
    public LinkedHashSet f101136v;

    /* renamed from: w, reason: collision with root package name */
    public k1[] f101137w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f101138x;

    public y0(d1 d1Var, Class cls, Method method) {
        this.f101115a = d1Var;
        this.f101116b = cls;
        this.f101117c = method;
        this.f101118d = method.getAnnotations();
        this.f101120f = method.getGenericParameterTypes();
        this.f101119e = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final Headers b(String[] strArr, boolean z13) {
        Headers.Builder builder = new Headers.Builder();
        for (String str : strArr) {
            int indexOf = str.indexOf(58);
            Method method = this.f101117c;
            if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                throw k1.m(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
            String substring = str.substring(0, indexOf);
            String trim = str.substring(indexOf + 1).trim();
            if ("Content-Type".equalsIgnoreCase(substring)) {
                try {
                    MediaType.f95651d.getClass();
                    this.f101135u = MediaType.Companion.a(trim);
                } catch (IllegalArgumentException e13) {
                    throw k1.m(method, e13, "Malformed content type: %s", trim);
                }
            } else if (z13) {
                builder.d(substring, trim);
            } else {
                builder.a(substring, trim);
            }
        }
        return builder.e();
    }

    public final void c(String str, String str2, boolean z13) {
        String str3 = this.f101129o;
        Method method = this.f101117c;
        if (str3 != null) {
            throw k1.m(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f101129o = str;
        this.f101130p = z13;
        if (str2.isEmpty()) {
            return;
        }
        int indexOf = str2.indexOf(63);
        Pattern pattern = f101113y;
        if (indexOf != -1 && indexOf < str2.length() - 1) {
            String substring = str2.substring(indexOf + 1);
            if (pattern.matcher(substring).find()) {
                throw k1.m(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
            }
        }
        this.f101133s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f101136v = linkedHashSet;
    }

    public final void d(int i13, Type type) {
        if (k1.i(type)) {
            throw k1.n(this.f101117c, i13, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
