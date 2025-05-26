package com.bugsnag.android;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class r {
    public Set A;
    public final EnumSet B;
    public Set C;
    public final c2 D;
    public final HashSet E;

    /* renamed from: a, reason: collision with root package name */
    public final String f29427a;

    /* renamed from: g, reason: collision with root package name */
    public String f29433g;

    /* renamed from: r, reason: collision with root package name */
    public b0 f29444r;

    /* renamed from: z, reason: collision with root package name */
    public final kotlin.collections.s0 f29452z;

    /* renamed from: b, reason: collision with root package name */
    public final a4 f29428b = new a4(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    public final m f29429c = new m();

    /* renamed from: d, reason: collision with root package name */
    public final y1 f29430d = new y1(new x1(0));

    /* renamed from: e, reason: collision with root package name */
    public final j1 f29431e = new j1(new k1());

    /* renamed from: f, reason: collision with root package name */
    public Integer f29432f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final v3 f29434h = v3.ALWAYS;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f29435i = true;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f29436j = true;

    /* renamed from: k, reason: collision with root package name */
    public final long f29437k = 5000;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29438l = true;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f29439m = true;

    /* renamed from: n, reason: collision with root package name */
    public final w0 f29440n = new w0(true, true, true, true);

    /* renamed from: o, reason: collision with root package name */
    public final boolean f29441o = true;

    /* renamed from: p, reason: collision with root package name */
    public final String f29442p = "android";

    /* renamed from: q, reason: collision with root package name */
    public u1 f29443q = a0.f29139a;

    /* renamed from: s, reason: collision with root package name */
    public final q7.w f29445s = new q7.w();

    /* renamed from: t, reason: collision with root package name */
    public int f29446t = 100;

    /* renamed from: u, reason: collision with root package name */
    public final int f29447u = 32;

    /* renamed from: v, reason: collision with root package name */
    public final int f29448v = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;

    /* renamed from: w, reason: collision with root package name */
    public final int f29449w = 200;

    /* renamed from: x, reason: collision with root package name */
    public final long f29450x = 5000;

    /* renamed from: y, reason: collision with root package name */
    public final int f29451y = 10000;

    public r(String str) {
        this.f29427a = str;
        kotlin.collections.s0 s0Var = kotlin.collections.s0.f80394a;
        this.f29452z = s0Var;
        this.B = EnumSet.of(p3.INTERNAL_ERRORS, p3.USAGE);
        this.C = s0Var;
        this.D = new c2("Android Bugsnag Notifier", "6.12.1", "https://bugsnag.com");
        this.E = new HashSet();
    }

    public static String a(ArrayList arrayList) {
        String Z;
        if (arrayList == null) {
            return "";
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toString());
        }
        List w03 = CollectionsKt.w0(arrayList2);
        return (w03 == null || (Z = CollectionsKt.Z(w03, ",", null, null, 0, null, null, 62)) == null) ? "" : Z;
    }
}
