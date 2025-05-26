package z9;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f141242b;

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f141243c;

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f141245e;

    /* renamed from: g, reason: collision with root package name */
    public static final i0 f141247g;

    /* renamed from: i, reason: collision with root package name */
    public static final i0 f141249i;

    /* renamed from: j, reason: collision with root package name */
    public static final i0 f141250j;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f141253a;

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f141244d = new i0(4);

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f141246f = new i0(6);

    /* renamed from: h, reason: collision with root package name */
    public static final i0 f141248h = new i0(2);

    /* renamed from: k, reason: collision with root package name */
    public static final i0 f141251k = new i0(10);

    /* renamed from: l, reason: collision with root package name */
    public static final i0 f141252l = new i0(9);

    static {
        int i13 = 0;
        f141242b = new i0(5, i13);
        f141243c = new i0(8, i13);
        f141245e = new i0(7, i13);
        f141247g = new i0(3, i13);
        f141249i = new i0(1, i13);
        f141250j = new i0(i13);
    }

    public o0(boolean z13) {
        this.f141253a = z13;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String value, Object obj) {
        Intrinsics.checkNotNullParameter(value, "value");
        return c(value);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
