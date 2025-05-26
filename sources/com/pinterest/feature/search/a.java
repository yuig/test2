package com.pinterest.feature.search;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.j;
import kv0.p;
import rg0.n;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p f47615a;

    /* renamed from: b, reason: collision with root package name */
    public final n f47616b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47617c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f47618d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f47619e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47620f;

    /* renamed from: g, reason: collision with root package name */
    public te0.c f47621g;

    public a(p searchDelightDisplayData, n experience) {
        Intrinsics.checkNotNullParameter(searchDelightDisplayData, "searchDelightDisplayData");
        Intrinsics.checkNotNullParameter(experience, "experience");
        this.f47615a = searchDelightDisplayData;
        this.f47616b = experience;
        this.f47617c = ((String) searchDelightDisplayData.f80996c) != null;
        List list = (List) searchDelightDisplayData.f80995b;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
        }
        this.f47618d = arrayList;
        this.f47619e = this.f47617c ? Integer.valueOf(Color.parseColor((String) this.f47615a.f80996c)) : null;
    }

    public static int a(CharSequence charSequence, String str) {
        IntRange a13;
        j b13 = new Regex("\\b" + ((Object) str) + "\\b", kotlin.text.p.IGNORE_CASE).b(0, charSequence);
        if (b13 == null || (a13 = b13.a()) == null) {
            return -1;
        }
        return a13.f80453a;
    }
}
