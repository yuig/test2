package pq2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.Response;

/* loaded from: classes2.dex */
public abstract class e1 {
    public static w a(d1 d1Var, Class cls, Method method) {
        Method method2;
        Type genericReturnType;
        boolean z13;
        boolean z14;
        d1 d1Var2;
        boolean z15;
        Annotation[][] annotationArr;
        int i13;
        String str;
        int i14;
        Type type;
        k1[] k1VarArr;
        int i15;
        k1 k1Var;
        int i16;
        Type type2;
        k1[] k1VarArr2;
        int i17;
        String str2;
        Annotation[] annotationArr2;
        int i18;
        k1 k1Var2;
        k1 s0Var;
        i0 b13;
        int i19 = 0;
        int i23 = 1;
        y0 y0Var = new y0(d1Var, cls, method);
        Annotation[] annotationArr3 = y0Var.f101118d;
        int length = annotationArr3.length;
        int i24 = 0;
        while (true) {
            String str3 = "HEAD";
            Method method3 = y0Var.f101117c;
            if (i24 >= length) {
                if (y0Var.f101129o == null) {
                    throw k1.m(method3, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!y0Var.f101130p) {
                    if (y0Var.f101132r) {
                        throw k1.m(method3, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (y0Var.f101131q) {
                        throw k1.m(method3, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr4 = y0Var.f101119e;
                int length2 = annotationArr4.length;
                y0Var.f101137w = new k1[length2];
                int i25 = length2 - 1;
                int i26 = 0;
                while (i26 < length2) {
                    k1[] k1VarArr3 = y0Var.f101137w;
                    Type type3 = y0Var.f101120f[i26];
                    Annotation[] annotationArr5 = annotationArr4[i26];
                    int i27 = i26 == i25 ? i23 : i19;
                    if (annotationArr5 != null) {
                        int length3 = annotationArr5.length;
                        k1Var = null;
                        while (i19 < length3) {
                            Annotation annotation = annotationArr5[i19];
                            Annotation[][] annotationArr6 = annotationArr4;
                            int i28 = length2;
                            int i29 = length3;
                            if (annotation instanceof sq2.y) {
                                y0Var.d(i26, type3);
                                if (y0Var.f101128n) {
                                    throw k1.n(method3, i26, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (y0Var.f101124j) {
                                    throw k1.n(method3, i26, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (y0Var.f101125k) {
                                    throw k1.n(method3, i26, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (y0Var.f101126l) {
                                    throw k1.n(method3, i26, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (y0Var.f101127m) {
                                    throw k1.n(method3, i26, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (y0Var.f101133s != null) {
                                    throw k1.n(method3, i26, "@Url cannot be used with @%s URL", y0Var.f101129o);
                                }
                                y0Var.f101128n = true;
                                if (type3 != HttpUrl.class && type3 != String.class && type3 != URI.class && (!(type3 instanceof Class) || !"android.net.Uri".equals(((Class) type3).getName()))) {
                                    throw k1.n(method3, i26, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                i18 = i19;
                                k1Var2 = new r0(i26, method3);
                                str2 = str3;
                                i16 = i25;
                                annotationArr2 = annotationArr5;
                                type2 = type3;
                                k1VarArr2 = k1VarArr3;
                                i17 = i26;
                            } else {
                                boolean z16 = annotation instanceof sq2.s;
                                i16 = i25;
                                d1 d1Var3 = y0Var.f101115a;
                                if (z16) {
                                    y0Var.d(i26, type3);
                                    if (y0Var.f101125k) {
                                        throw k1.n(method3, i26, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (y0Var.f101126l) {
                                        throw k1.n(method3, i26, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (y0Var.f101127m) {
                                        throw k1.n(method3, i26, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (y0Var.f101128n) {
                                        throw k1.n(method3, i26, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (y0Var.f101133s == null) {
                                        throw k1.n(method3, i26, "@Path can only be used with relative url on @%s", y0Var.f101129o);
                                    }
                                    y0Var.f101124j = true;
                                    sq2.s sVar = (sq2.s) annotation;
                                    String value = sVar.value();
                                    if (!y0.f101114z.matcher(value).matches()) {
                                        throw k1.n(method3, i26, "@Path parameter name must match %s. Found: %s", y0.f101113y.pattern(), value);
                                    }
                                    if (!y0Var.f101136v.contains(value)) {
                                        throw k1.n(method3, i26, "URL \"%s\" does not contain \"{%s}\".", y0Var.f101133s, value);
                                    }
                                    k1VarArr2 = k1VarArr3;
                                    i18 = i19;
                                    annotationArr2 = annotationArr5;
                                    k1Var2 = new o0(y0Var.f101117c, i26, value, d1Var3.f(type3, annotationArr5), sVar.encoded());
                                    i17 = i26;
                                    str2 = str3;
                                    type2 = type3;
                                } else {
                                    type2 = type3;
                                    k1VarArr2 = k1VarArr3;
                                    i17 = i26;
                                    Annotation[] annotationArr7 = annotationArr5;
                                    str2 = str3;
                                    if (annotation instanceof sq2.t) {
                                        y0Var.d(i17, type2);
                                        sq2.t tVar = (sq2.t) annotation;
                                        String value2 = tVar.value();
                                        boolean encoded = tVar.encoded();
                                        Class g13 = k1.g(type2);
                                        y0Var.f101125k = true;
                                        if (Iterable.class.isAssignableFrom(g13)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw k1.n(method3, i17, g13.getSimpleName() + " must include generic type (e.g., " + g13.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            b13 = new k0(value2, d1Var3.f(k1.f(0, (ParameterizedType) type2), annotationArr7), encoded, 2).l();
                                        } else if (g13.isArray()) {
                                            b13 = new k0(value2, d1Var3.f(y0.a(g13.getComponentType()), annotationArr7), encoded, 2).b();
                                        } else {
                                            i18 = i19;
                                            k1Var2 = new k0(value2, d1Var3.f(type2, annotationArr7), encoded, 2);
                                            annotationArr2 = annotationArr7;
                                        }
                                        k1Var2 = b13;
                                        i18 = i19;
                                        annotationArr2 = annotationArr7;
                                    } else if (annotation instanceof sq2.v) {
                                        y0Var.d(i17, type2);
                                        boolean encoded2 = ((sq2.v) annotation).encoded();
                                        Class g14 = k1.g(type2);
                                        y0Var.f101126l = true;
                                        if (Iterable.class.isAssignableFrom(g14)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw k1.n(method3, i17, g14.getSimpleName() + " must include generic type (e.g., " + g14.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            b13 = new p0(d1Var3.f(k1.f(0, (ParameterizedType) type2), annotationArr7), encoded2).l();
                                        } else if (g14.isArray()) {
                                            b13 = new p0(d1Var3.f(y0.a(g14.getComponentType()), annotationArr7), encoded2).b();
                                        } else {
                                            i18 = i19;
                                            k1Var2 = new p0(d1Var3.f(type2, annotationArr7), encoded2);
                                            annotationArr2 = annotationArr7;
                                        }
                                        k1Var2 = b13;
                                        i18 = i19;
                                        annotationArr2 = annotationArr7;
                                    } else if (annotation instanceof sq2.u) {
                                        y0Var.d(i17, type2);
                                        Class g15 = k1.g(type2);
                                        y0Var.f101127m = true;
                                        if (!Map.class.isAssignableFrom(g15)) {
                                            throw k1.n(method3, i17, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type h10 = k1.h(type2, g15);
                                        if (!(h10 instanceof ParameterizedType)) {
                                            throw k1.n(method3, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType = (ParameterizedType) h10;
                                        Type f13 = k1.f(0, parameterizedType);
                                        if (String.class != f13) {
                                            throw k1.n(method3, i17, "@QueryMap keys must be of type String: " + f13, new Object[0]);
                                        }
                                        k1Var2 = new l0(y0Var.f101117c, i17, d1Var3.f(k1.f(1, parameterizedType), annotationArr7), ((sq2.u) annotation).encoded(), 2);
                                        i18 = i19;
                                        annotationArr2 = annotationArr7;
                                    } else {
                                        annotationArr2 = annotationArr7;
                                        if (annotation instanceof sq2.i) {
                                            y0Var.d(i17, type2);
                                            sq2.i iVar = (sq2.i) annotation;
                                            String value3 = iVar.value();
                                            Class g16 = k1.g(type2);
                                            if (Iterable.class.isAssignableFrom(g16)) {
                                                if (!(type2 instanceof ParameterizedType)) {
                                                    throw k1.n(method3, i17, g16.getSimpleName() + " must include generic type (e.g., " + g16.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                k1Var2 = new k0(value3, d1Var3.f(k1.f(0, (ParameterizedType) type2), annotationArr2), iVar.allowUnsafeNonAsciiValues(), 1).l();
                                            } else if (g16.isArray()) {
                                                k1Var2 = new k0(value3, d1Var3.f(y0.a(g16.getComponentType()), annotationArr2), iVar.allowUnsafeNonAsciiValues(), 1).b();
                                            } else {
                                                i18 = i19;
                                                k1Var2 = new k0(value3, d1Var3.f(type2, annotationArr2), iVar.allowUnsafeNonAsciiValues(), 1);
                                            }
                                            i18 = i19;
                                        } else {
                                            if (annotation instanceof sq2.j) {
                                                if (type2 == Headers.class) {
                                                    k1Var2 = new m0(i17, method3);
                                                } else {
                                                    y0Var.d(i17, type2);
                                                    Class g17 = k1.g(type2);
                                                    if (!Map.class.isAssignableFrom(g17)) {
                                                        throw k1.n(method3, i17, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type h13 = k1.h(type2, g17);
                                                    if (!(h13 instanceof ParameterizedType)) {
                                                        throw k1.n(method3, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) h13;
                                                    Type f14 = k1.f(0, parameterizedType2);
                                                    if (String.class != f14) {
                                                        throw k1.n(method3, i17, "@HeaderMap keys must be of type String: " + f14, new Object[0]);
                                                    }
                                                    k1Var2 = new l0(y0Var.f101117c, i17, d1Var3.f(k1.f(1, parameterizedType2), annotationArr2), ((sq2.j) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof sq2.c) {
                                                y0Var.d(i17, type2);
                                                if (!y0Var.f101131q) {
                                                    throw k1.n(method3, i17, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                sq2.c cVar = (sq2.c) annotation;
                                                String value4 = cVar.value();
                                                boolean encoded3 = cVar.encoded();
                                                y0Var.f101121g = true;
                                                Class g18 = k1.g(type2);
                                                if (Iterable.class.isAssignableFrom(g18)) {
                                                    if (!(type2 instanceof ParameterizedType)) {
                                                        throw k1.n(method3, i17, g18.getSimpleName() + " must include generic type (e.g., " + g18.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    k1Var2 = new k0(value4, d1Var3.f(k1.f(0, (ParameterizedType) type2), annotationArr2), encoded3, 0).l();
                                                } else if (g18.isArray()) {
                                                    k1Var2 = new k0(value4, d1Var3.f(y0.a(g18.getComponentType()), annotationArr2), encoded3, 0).b();
                                                } else {
                                                    i18 = i19;
                                                    k1Var2 = new k0(value4, d1Var3.f(type2, annotationArr2), encoded3, 0);
                                                }
                                            } else if (annotation instanceof sq2.d) {
                                                y0Var.d(i17, type2);
                                                if (!y0Var.f101131q) {
                                                    throw k1.n(method3, i17, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class g19 = k1.g(type2);
                                                if (!Map.class.isAssignableFrom(g19)) {
                                                    throw k1.n(method3, i17, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type h14 = k1.h(type2, g19);
                                                if (!(h14 instanceof ParameterizedType)) {
                                                    throw k1.n(method3, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) h14;
                                                Type f15 = k1.f(0, parameterizedType3);
                                                if (String.class != f15) {
                                                    throw k1.n(method3, i17, "@FieldMap keys must be of type String: " + f15, new Object[0]);
                                                }
                                                p f16 = d1Var3.f(k1.f(1, parameterizedType3), annotationArr2);
                                                y0Var.f101121g = true;
                                                k1Var2 = new l0(y0Var.f101117c, i17, f16, ((sq2.d) annotation).encoded(), 0);
                                            } else {
                                                i18 = i19;
                                                if (annotation instanceof sq2.q) {
                                                    y0Var.d(i17, type2);
                                                    if (!y0Var.f101132r) {
                                                        throw k1.n(method3, i17, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    sq2.q qVar = (sq2.q) annotation;
                                                    y0Var.f101122h = true;
                                                    String value5 = qVar.value();
                                                    Class g23 = k1.g(type2);
                                                    if (value5.isEmpty()) {
                                                        boolean isAssignableFrom = Iterable.class.isAssignableFrom(g23);
                                                        q0 q0Var = q0.f101076c;
                                                        if (isAssignableFrom) {
                                                            if (!(type2 instanceof ParameterizedType)) {
                                                                throw k1.n(method3, i17, g23.getSimpleName() + " must include generic type (e.g., " + g23.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            if (!MultipartBody.Part.class.isAssignableFrom(k1.g(k1.f(0, (ParameterizedType) type2)))) {
                                                                throw k1.n(method3, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            s0Var = q0Var.l();
                                                        } else if (g23.isArray()) {
                                                            if (!MultipartBody.Part.class.isAssignableFrom(g23.getComponentType())) {
                                                                throw k1.n(method3, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            s0Var = q0Var.b();
                                                        } else {
                                                            if (!MultipartBody.Part.class.isAssignableFrom(g23)) {
                                                                throw k1.n(method3, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            k1Var2 = q0Var;
                                                        }
                                                        k1Var2 = s0Var;
                                                    } else {
                                                        String[] strArr = {"Content-Disposition", a.a.k("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", qVar.encoding()};
                                                        Headers.f95626b.getClass();
                                                        Headers d2 = Headers.Companion.d(strArr);
                                                        if (Iterable.class.isAssignableFrom(g23)) {
                                                            if (!(type2 instanceof ParameterizedType)) {
                                                                throw k1.n(method3, i17, g23.getSimpleName() + " must include generic type (e.g., " + g23.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            Type f17 = k1.f(0, (ParameterizedType) type2);
                                                            if (MultipartBody.Part.class.isAssignableFrom(k1.g(f17))) {
                                                                throw k1.n(method3, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            k1Var2 = new n0(method3, i17, d2, d1Var3.d(f17, annotationArr2, annotationArr3)).l();
                                                        } else if (g23.isArray()) {
                                                            Class a13 = y0.a(g23.getComponentType());
                                                            if (MultipartBody.Part.class.isAssignableFrom(a13)) {
                                                                throw k1.n(method3, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            k1Var2 = new n0(method3, i17, d2, d1Var3.d(a13, annotationArr2, annotationArr3)).b();
                                                        } else {
                                                            if (MultipartBody.Part.class.isAssignableFrom(g23)) {
                                                                throw k1.n(method3, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            k1Var2 = new n0(method3, i17, d2, d1Var3.d(type2, annotationArr2, annotationArr3));
                                                        }
                                                    }
                                                } else {
                                                    if (annotation instanceof sq2.r) {
                                                        y0Var.d(i17, type2);
                                                        if (!y0Var.f101132r) {
                                                            throw k1.n(method3, i17, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        y0Var.f101122h = true;
                                                        Class g24 = k1.g(type2);
                                                        if (!Map.class.isAssignableFrom(g24)) {
                                                            throw k1.n(method3, i17, "@PartMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type h15 = k1.h(type2, g24);
                                                        if (!(h15 instanceof ParameterizedType)) {
                                                            throw k1.n(method3, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType4 = (ParameterizedType) h15;
                                                        Type f18 = k1.f(0, parameterizedType4);
                                                        if (String.class != f18) {
                                                            throw k1.n(method3, i17, "@PartMap keys must be of type String: " + f18, new Object[0]);
                                                        }
                                                        Type f19 = k1.f(1, parameterizedType4);
                                                        if (MultipartBody.Part.class.isAssignableFrom(k1.g(f19))) {
                                                            throw k1.n(method3, i17, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                        }
                                                        s0Var = new n0(method3, i17, d1Var3.d(f19, annotationArr2, annotationArr3), ((sq2.r) annotation).encoding());
                                                    } else if (annotation instanceof sq2.a) {
                                                        y0Var.d(i17, type2);
                                                        if (y0Var.f101131q || y0Var.f101132r) {
                                                            throw k1.n(method3, i17, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                        }
                                                        if (y0Var.f101123i) {
                                                            throw k1.n(method3, i17, "Multiple @Body method annotations found.", new Object[0]);
                                                        }
                                                        try {
                                                            p d13 = d1Var3.d(type2, annotationArr2, annotationArr3);
                                                            y0Var.f101123i = true;
                                                            s0Var = new j0(method3, i17, d13);
                                                        } catch (RuntimeException e13) {
                                                            throw k1.o(method3, e13, i17, "Unable to create @Body converter for %s", type2);
                                                        }
                                                    } else if (annotation instanceof sq2.x) {
                                                        y0Var.d(i17, type2);
                                                        Class g25 = k1.g(type2);
                                                        for (int i33 = i17 - 1; i33 >= 0; i33--) {
                                                            k1 k1Var3 = y0Var.f101137w[i33];
                                                            if ((k1Var3 instanceof s0) && ((s0) k1Var3).f101082c.equals(g25)) {
                                                                throw k1.n(method3, i17, "@Tag type " + g25.getName() + " is duplicate of " + t0.f101085b.g0(i33, method3) + " and would always overwrite its value.", new Object[0]);
                                                            }
                                                        }
                                                        s0Var = new s0(g25);
                                                    } else {
                                                        k1Var2 = null;
                                                    }
                                                    k1Var2 = s0Var;
                                                }
                                            }
                                            i18 = i19;
                                        }
                                    }
                                }
                            }
                            if (k1Var2 != null) {
                                if (k1Var != null) {
                                    throw k1.n(method3, i17, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                k1Var = k1Var2;
                            }
                            i19 = i18 + 1;
                            annotationArr5 = annotationArr2;
                            i26 = i17;
                            type3 = type2;
                            annotationArr4 = annotationArr6;
                            length2 = i28;
                            length3 = i29;
                            i25 = i16;
                            k1VarArr3 = k1VarArr2;
                            str3 = str2;
                        }
                        annotationArr = annotationArr4;
                        i13 = length2;
                        str = str3;
                        i14 = i25;
                        type = type3;
                        k1VarArr = k1VarArr3;
                        i15 = i26;
                    } else {
                        annotationArr = annotationArr4;
                        i13 = length2;
                        str = str3;
                        i14 = i25;
                        type = type3;
                        k1VarArr = k1VarArr3;
                        i15 = i26;
                        k1Var = null;
                    }
                    if (k1Var == null) {
                        if (i27 != 0) {
                            try {
                                if (k1.g(type) == bl2.c.class) {
                                    y0Var.f101138x = true;
                                    k1Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw k1.n(method3, i15, "No Retrofit annotation found.", new Object[0]);
                    }
                    k1VarArr[i15] = k1Var;
                    i26 = i15 + 1;
                    i23 = 1;
                    annotationArr4 = annotationArr;
                    length2 = i13;
                    i25 = i14;
                    str3 = str;
                    i19 = 0;
                }
                String str4 = str3;
                if (y0Var.f101133s == null && !y0Var.f101128n) {
                    throw k1.m(method3, null, "Missing either @%s URL or @Url parameter.", y0Var.f101129o);
                }
                boolean z17 = y0Var.f101131q;
                if (!z17 && !y0Var.f101132r && !y0Var.f101130p && y0Var.f101123i) {
                    throw k1.m(method3, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z17 && !y0Var.f101121g) {
                    throw k1.m(method3, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (y0Var.f101132r && !y0Var.f101122h) {
                    throw k1.m(method3, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                z0 z0Var = new z0(y0Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (k1.i(genericReturnType2)) {
                    throw k1.m(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw k1.m(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z18 = z0Var.f101152l;
                if (z18) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type type4 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type4 instanceof WildcardType) {
                        type4 = ((WildcardType) type4).getLowerBounds()[0];
                    }
                    if (k1.g(type4) == a1.class && (type4 instanceof ParameterizedType)) {
                        type4 = k1.f(0, (ParameterizedType) type4);
                        z14 = false;
                        z15 = true;
                    } else {
                        if (k1.g(type4) == i.class) {
                            throw k1.m(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", k1.f(0, (ParameterizedType) type4));
                        }
                        z14 = k1.k(type4);
                        z15 = false;
                    }
                    genericReturnType = new i1(null, i.class, type4);
                    if (!k1.j(annotations, f1.class)) {
                        Annotation[] annotationArr8 = new Annotation[annotations.length + 1];
                        annotationArr8[0] = g1.f101035a;
                        System.arraycopy(annotations, 0, annotationArr8, 1, annotations.length);
                        annotations = annotationArr8;
                    }
                    d1Var2 = d1Var;
                    method2 = method;
                    z13 = z15;
                } else {
                    method2 = method;
                    genericReturnType = method.getGenericReturnType();
                    z13 = false;
                    z14 = false;
                    d1Var2 = d1Var;
                }
                try {
                    k a14 = d1Var2.a(genericReturnType, annotations);
                    Type b14 = a14.b();
                    if (b14 == Response.class) {
                        throw k1.m(method2, null, "'" + k1.g(b14).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (b14 == a1.class) {
                        throw k1.m(method2, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (z0Var.f101144d.equals(str4) && !Void.class.equals(b14) && !k1.k(b14)) {
                        throw k1.m(method2, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        p e14 = d1Var2.e(b14, method.getAnnotations());
                        Call.Factory factory = d1Var2.f101010b;
                        return !z18 ? new t(z0Var, factory, e14, a14) : z13 ? new v(z0Var, factory, e14, a14) : new u(z0Var, factory, e14, a14, z14);
                    } catch (RuntimeException e15) {
                        throw k1.m(method2, e15, "Unable to create converter for %s", b14);
                    }
                } catch (RuntimeException e16) {
                    throw k1.m(method2, e16, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr3[i24];
            if (annotation2 instanceof sq2.b) {
                y0Var.c("DELETE", ((sq2.b) annotation2).value(), false);
            } else if (annotation2 instanceof sq2.f) {
                y0Var.c("GET", ((sq2.f) annotation2).value(), false);
            } else if (annotation2 instanceof sq2.g) {
                y0Var.c("HEAD", ((sq2.g) annotation2).value(), false);
            } else if (annotation2 instanceof sq2.n) {
                y0Var.c("PATCH", ((sq2.n) annotation2).value(), true);
            } else if (annotation2 instanceof sq2.o) {
                y0Var.c("POST", ((sq2.o) annotation2).value(), true);
            } else if (annotation2 instanceof sq2.p) {
                y0Var.c("PUT", ((sq2.p) annotation2).value(), true);
            } else if (annotation2 instanceof sq2.m) {
                y0Var.c("OPTIONS", ((sq2.m) annotation2).value(), false);
            } else if (annotation2 instanceof sq2.h) {
                sq2.h hVar = (sq2.h) annotation2;
                y0Var.c(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation2 instanceof sq2.k) {
                sq2.k kVar = (sq2.k) annotation2;
                String[] value6 = kVar.value();
                if (value6.length == 0) {
                    throw k1.m(method3, null, "@Headers annotation is empty.", new Object[0]);
                }
                y0Var.f101134t = y0Var.b(value6, kVar.allowUnsafeNonAsciiValues());
            } else if (annotation2 instanceof sq2.l) {
                if (y0Var.f101131q) {
                    throw k1.m(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                y0Var.f101132r = true;
            } else if (!(annotation2 instanceof sq2.e)) {
                continue;
            } else {
                if (y0Var.f101132r) {
                    throw k1.m(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                y0Var.f101131q = true;
            }
            i24++;
        }
    }
}
