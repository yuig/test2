package hd;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kh2.p2;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Map f68835a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f68836b;

    /* renamed from: c, reason: collision with root package name */
    public int f68837c;

    /* renamed from: d, reason: collision with root package name */
    public int f68838d;

    /* renamed from: e, reason: collision with root package name */
    public int f68839e;

    /* renamed from: f, reason: collision with root package name */
    public int f68840f;

    public j(Map map) {
        if (map == null) {
            this.f68835a = new HashMap();
            this.f68836b = new HashMap();
            return;
        }
        Map u13 = dl2.b.u(map.get("config"));
        this.f68835a = u13 == null ? new HashMap() : u13;
        Map u14 = dl2.b.u(map.get("callbacks"));
        this.f68836b = u14 == null ? new HashMap() : u14;
        Map u15 = dl2.b.u(map.get("system"));
        if (u15 != null) {
            Number number = (Number) u15.get("stringsTruncated");
            this.f68837c = number == null ? 0 : number.intValue();
            Number number2 = (Number) u15.get("stringCharsTruncated");
            this.f68838d = number2 == null ? 0 : number2.intValue();
            Number number3 = (Number) u15.get("breadcrumbsRemovedCount");
            this.f68839e = number3 == null ? 0 : number3.intValue();
            Number number4 = (Number) u15.get("breadcrumbBytesRemoved");
            this.f68840f = number4 != null ? number4.intValue() : 0;
        }
    }

    @Override // hd.i
    public final Map C() {
        Map map;
        Map map2;
        Integer num;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f68836b);
        Method method = p2.f79644d;
        if (method != null) {
            Object invoke = method.invoke(p2.f79641a, new Object[0]);
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
            }
            map = (Map) invoke;
        } else {
            map = null;
        }
        if (map != null && (num = (Integer) map.get("ndkOnError")) != null) {
            hashMap.put("ndkOnError", num);
        }
        Method method2 = p2.f79645e;
        if (method2 != null) {
            Object invoke2 = method2.invoke(p2.f79641a, new Object[0]);
            if (invoke2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
            }
            map2 = (Map) invoke2;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        Pair[] elements = new Pair[4];
        int i13 = this.f68837c;
        elements[0] = i13 > 0 ? new Pair("stringsTruncated", Integer.valueOf(i13)) : null;
        int i14 = this.f68838d;
        elements[1] = i14 > 0 ? new Pair("stringCharsTruncated", Integer.valueOf(i14)) : null;
        int i15 = this.f68839e;
        elements[2] = i15 > 0 ? new Pair("breadcrumbsRemoved", Integer.valueOf(i15)) : null;
        int i16 = this.f68840f;
        elements[3] = i16 > 0 ? new Pair("breadcrumbBytesRemoved", Integer.valueOf(i16)) : null;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Map m13 = z0.m(c0.A(elements));
        Pair[] elements2 = new Pair[3];
        Map map3 = this.f68835a;
        elements2[0] = map3.isEmpty() ^ true ? new Pair("config", map3) : null;
        elements2[1] = hashMap.isEmpty() ^ true ? new Pair("callbacks", hashMap) : null;
        elements2[2] = m13.isEmpty() ^ true ? new Pair("system", m13) : null;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return z0.m(c0.A(elements2));
    }

    @Override // hd.i
    public final void F(HashMap hashMap) {
        Map map = this.f68836b;
        map.clear();
        map.putAll(hashMap);
        Method method = p2.f79646f;
        if (method != null) {
            method.invoke(p2.f79641a, hashMap);
        }
    }

    @Override // hd.i
    public final void M() {
        Map map = this.f68836b;
        Integer num = (Integer) map.get("onError");
        int intValue = (num == null ? 0 : num.intValue()) + 1;
        map.put("onError", Integer.valueOf(intValue >= 0 ? intValue : 0));
        Method method = p2.f79647g;
        if (method != null) {
            method.invoke(p2.f79641a, "onError");
        }
    }

    @Override // hd.i
    public final void l(int i13, int i14) {
        this.f68837c = i13;
        this.f68838d = i14;
    }

    @Override // hd.i
    public final void t(Map map) {
        Map map2 = this.f68835a;
        map2.clear();
        map2.putAll(map);
        Map b13 = y0.b(new Pair("config", map2));
        Method method = p2.f79643c;
        if (method != null) {
            method.invoke(p2.f79641a, b13);
        }
    }

    @Override // hd.i
    public final void y(int i13, int i14) {
        this.f68839e = i13;
        this.f68840f = i14;
    }
}
