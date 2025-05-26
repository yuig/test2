package oe2;

import com.squareup.moshi.JsonDataException;

/* loaded from: classes4.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f94371a = new f(5);

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f94372b = new j0(1);

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f94373c = new j0(2);

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f94374d = new j0(3);

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f94375e = new j0(4);

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f94376f = new j0(5);

    /* renamed from: g, reason: collision with root package name */
    public static final j0 f94377g = new j0(6);

    /* renamed from: h, reason: collision with root package name */
    public static final j0 f94378h = new j0(7);

    /* renamed from: i, reason: collision with root package name */
    public static final j0 f94379i = new j0(8);

    /* renamed from: j, reason: collision with root package name */
    public static final j0 f94380j = new j0(0);

    public static int a(v vVar, String str, int i13, int i14) {
        int o03 = vVar.o0();
        if (o03 >= i13 && o03 <= i14) {
            return o03;
        }
        String f13 = vVar.f();
        StringBuilder v13 = a.a.v("Expected ", str, " but was ", o03, " at path ");
        v13.append(f13);
        throw new JsonDataException(v13.toString());
    }
}
