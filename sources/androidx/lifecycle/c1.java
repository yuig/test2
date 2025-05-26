package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import do2.t2;
import do2.y1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f18600f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f18601a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f18602b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f18603c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f18604d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f18605e;

    public c1(HashMap initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f18601a = linkedHashMap;
        this.f18602b = new LinkedHashMap();
        this.f18603c = new LinkedHashMap();
        this.f18604d = new LinkedHashMap();
        this.f18605e = new b1(this, 1);
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(c1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : kotlin.collections.z0.n(this$0.f18602b).entrySet()) {
            this$0.c(((ma.f) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = this$0.f18601a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return e0.t.j(new Pair("keys", arrayList), new Pair("values", arrayList2));
    }

    public final ma.f b() {
        return this.f18605e;
    }

    public final void c(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            Class[] clsArr = f18600f;
            for (int i13 = 0; i13 < 29; i13++) {
                Class cls = clsArr[i13];
                Intrinsics.f(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f18603c.get(key);
        l0 l0Var = obj2 instanceof l0 ? (l0) obj2 : null;
        if (l0Var != null) {
            l0Var.k(obj);
        } else {
            this.f18601a.put(key, obj);
        }
        y1 y1Var = (y1) this.f18604d.get(key);
        if (y1Var == null) {
            return;
        }
        ((t2) y1Var).i(obj);
    }

    public c1() {
        this.f18601a = new LinkedHashMap();
        this.f18602b = new LinkedHashMap();
        this.f18603c = new LinkedHashMap();
        this.f18604d = new LinkedHashMap();
        this.f18605e = new b1(this, 0);
    }
}
