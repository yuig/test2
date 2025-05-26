package androidx.camera.core.impl;

import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class o2 {

    /* renamed from: j, reason: collision with root package name */
    public static final List f16930j = Arrays.asList(1, 5, 3);

    /* renamed from: a, reason: collision with root package name */
    public final List f16931a;

    /* renamed from: b, reason: collision with root package name */
    public final h f16932b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16933c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16934d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16935e;

    /* renamed from: f, reason: collision with root package name */
    public final k2 f16936f;

    /* renamed from: g, reason: collision with root package name */
    public final s0 f16937g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16938h;

    /* renamed from: i, reason: collision with root package name */
    public final InputConfiguration f16939i;

    public o2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, s0 s0Var, k2 k2Var, InputConfiguration inputConfiguration, int i13, h hVar) {
        this.f16931a = arrayList;
        this.f16933c = Collections.unmodifiableList(arrayList2);
        this.f16934d = Collections.unmodifiableList(arrayList3);
        this.f16935e = Collections.unmodifiableList(arrayList4);
        this.f16936f = k2Var;
        this.f16937g = s0Var;
        this.f16939i = inputConfiguration;
        this.f16938h = i13;
        this.f16932b = hVar;
    }

    public static o2 a() {
        return new o2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new v.c1().e(), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (h hVar : this.f16931a) {
            arrayList.add(hVar.f16844a);
            Iterator it = hVar.f16845b.iterator();
            while (it.hasNext()) {
                arrayList.add((z0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
