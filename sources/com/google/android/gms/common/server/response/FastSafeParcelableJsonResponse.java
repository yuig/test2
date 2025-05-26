package com.google.android.gms.common.server.response;

import android.util.Base64;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kh2.c3;
import mh.a;

/* loaded from: classes3.dex */
public abstract class FastSafeParcelableJsonResponse implements SafeParcelable {
    public static final Object h(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        a aVar = fastJsonResponse$Field.f31027p;
        if (aVar == null) {
            return obj;
        }
        StringToIntConverter stringToIntConverter = (StringToIntConverter) aVar;
        String str = (String) stringToIntConverter.f31011h.get(((Integer) obj).intValue());
        return (str == null && stringToIntConverter.f31010g.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public static final void i(StringBuilder sb3, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        int i13 = fastJsonResponse$Field.f31018g;
        if (i13 == 11) {
            Class cls = fastJsonResponse$Field.f31024m;
            d.t(cls);
            sb3.append(((FastSafeParcelableJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i13 != 7) {
                sb3.append(obj);
                return;
            }
            sb3.append("\"");
            sb3.append(oh.d.a((String) obj));
            sb3.append("\"");
        }
    }

    public abstract Map a();

    public Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        String str = fastJsonResponse$Field.f31022k;
        if (fastJsonResponse$Field.f31024m == null) {
            return d();
        }
        if (d() != null) {
            throw new IllegalStateException("Concrete field shouldn't be value object: " + fastJsonResponse$Field.f31022k);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e13) {
            throw new RuntimeException(e13);
        }
    }

    public Object d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.f31020i != 11) {
            return f();
        }
        if (fastJsonResponse$Field.f31021j) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = (FastSafeParcelableJsonResponse) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : a().values()) {
            if (e(fastJsonResponse$Field)) {
                if (!fastSafeParcelableJsonResponse.e(fastJsonResponse$Field) || !c.x(b(fastJsonResponse$Field), fastSafeParcelableJsonResponse.b(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (fastSafeParcelableJsonResponse.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return false;
    }

    @Override // 
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        Map a13 = a();
        StringBuilder sb3 = new StringBuilder(100);
        for (String str : a13.keySet()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) a13.get(str);
            if (e(fastJsonResponse$Field)) {
                Object h10 = h(fastJsonResponse$Field, b(fastJsonResponse$Field));
                if (sb3.length() == 0) {
                    sb3.append("{");
                } else {
                    sb3.append(",");
                }
                sb3.append("\"");
                sb3.append(str);
                sb3.append("\":");
                if (h10 != null) {
                    switch (fastJsonResponse$Field.f31020i) {
                        case 8:
                            sb3.append("\"");
                            sb3.append(Base64.encodeToString((byte[]) h10, 0));
                            sb3.append("\"");
                            break;
                        case 9:
                            sb3.append("\"");
                            sb3.append(Base64.encodeToString((byte[]) h10, 10));
                            sb3.append("\"");
                            break;
                        case 10:
                            c3.x0(sb3, (HashMap) h10);
                            break;
                        default:
                            if (fastJsonResponse$Field.f31019h) {
                                ArrayList arrayList = (ArrayList) h10;
                                sb3.append("[");
                                int size = arrayList.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    if (i13 > 0) {
                                        sb3.append(",");
                                    }
                                    Object obj = arrayList.get(i13);
                                    if (obj != null) {
                                        i(sb3, fastJsonResponse$Field, obj);
                                    }
                                }
                                sb3.append("]");
                                break;
                            } else {
                                i(sb3, fastJsonResponse$Field, h10);
                                break;
                            }
                    }
                } else {
                    sb3.append("null");
                }
            }
        }
        if (sb3.length() > 0) {
            sb3.append("}");
        } else {
            sb3.append("{}");
        }
        return sb3.toString();
    }

    public final int hashCode() {
        int i13 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : a().values()) {
            if (e(fastJsonResponse$Field)) {
                Object b13 = b(fastJsonResponse$Field);
                d.t(b13);
                i13 = (i13 * 31) + b13.hashCode();
            }
        }
        return i13;
    }
}
