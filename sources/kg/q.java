package kg;

import android.content.Context;
import android.os.Parcelable;
import b3.f0;
import b3.u;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static f0 f79377a;

    /* renamed from: b, reason: collision with root package name */
    public static u f79378b;

    /* renamed from: c, reason: collision with root package name */
    public static d3.c f79379c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f79380d = 0;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r1.m6().intValue() == v22.c.APP_STORE_TRIGGER.getValue()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(com.pinterest.api.model.f30 r1, boolean r2) {
        /*
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto L4e
            java.lang.String r2 = r1.M5()
            if (r2 == 0) goto L4e
            boolean r2 = kotlin.text.z.j(r2)
            if (r2 == 0) goto L14
            goto L4e
        L14:
            java.lang.String r2 = r1.M5()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r0 = "parse(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            boolean r2 = df.j1.f1(r2)
            if (r2 == 0) goto L4e
            boolean r2 = r1.n6()
            if (r2 == 0) goto L3d
            java.lang.Integer r2 = r1.m6()
            v22.c r0 = v22.c.APP_STORE_TRIGGER
            int r0 = r0.getValue()
            int r2 = r2.intValue()
            if (r2 != r0) goto L4c
        L3d:
            java.lang.Boolean r1 = r1.b5()
            java.lang.String r2 = "getIsPremiere(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4e
        L4c:
            r1 = 1
            goto L4f
        L4e:
            r1 = 0
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.q.b(com.pinterest.api.model.f30, boolean):boolean");
    }

    public static final Map c(Map map) {
        if (map == null) {
            return z0.d();
        }
        List<Map.Entry> y03 = CollectionsKt.y0(map.entrySet(), 10);
        int a13 = y0.a(g0.q(y03, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (Map.Entry entry : y03) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "null";
            } else if (!(value instanceof Parcelable) && !(value instanceof Serializable)) {
                value = "not serializable";
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this instanceof s62.g) {
            return ((s62.g) this).f111254e;
        }
        if (!(this instanceof s62.h)) {
            if (this instanceof s62.f) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        s62.h hVar = (s62.h) this;
        Object[] objArr = hVar.f111256f;
        String string = context.getString(hVar.f111255e, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
