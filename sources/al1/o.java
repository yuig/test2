package al1;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Map f15495a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f15496b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f15497c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f15498d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f15499e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f15500f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f15501g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f15502h;

    public o() {
        LinkedHashMap booleans = new LinkedHashMap();
        LinkedHashMap booleanArrays = new LinkedHashMap();
        LinkedHashMap strings = new LinkedHashMap();
        LinkedHashMap stringArrays = new LinkedHashMap();
        LinkedHashMap ints = new LinkedHashMap();
        LinkedHashMap intArrays = new LinkedHashMap();
        LinkedHashMap floats = new LinkedHashMap();
        LinkedHashMap floatArrays = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(booleans, "booleans");
        Intrinsics.checkNotNullParameter(booleanArrays, "booleanArrays");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(stringArrays, "stringArrays");
        Intrinsics.checkNotNullParameter(ints, "ints");
        Intrinsics.checkNotNullParameter(intArrays, "intArrays");
        Intrinsics.checkNotNullParameter(floats, "floats");
        Intrinsics.checkNotNullParameter(floatArrays, "floatArrays");
        this.f15495a = booleans;
        this.f15496b = booleanArrays;
        this.f15497c = strings;
        this.f15498d = stringArrays;
        this.f15499e = ints;
        this.f15500f = intArrays;
        this.f15501g = floats;
        this.f15502h = floatArrays;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f15495a.entrySet()) {
            bundle.putBoolean((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
        }
        Map map = this.f15496b;
        for (Map.Entry entry2 : map.entrySet()) {
            String key = (String) entry2.getKey();
            List value = (List) entry2.getValue();
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            map.put(key, value);
        }
        for (Map.Entry entry3 : this.f15497c.entrySet()) {
            bundle.putString((String) entry3.getKey(), (String) entry3.getValue());
        }
        for (Map.Entry entry4 : this.f15498d.entrySet()) {
            bundle.putStringArray((String) entry4.getKey(), (String[]) ((List) entry4.getValue()).toArray(new String[0]));
        }
        for (Map.Entry entry5 : this.f15499e.entrySet()) {
            bundle.putInt((String) entry5.getKey(), ((Number) entry5.getValue()).intValue());
        }
        Map map2 = this.f15500f;
        for (Map.Entry entry6 : map2.entrySet()) {
            String key2 = (String) entry6.getKey();
            List value2 = (List) entry6.getValue();
            Intrinsics.checkNotNullParameter(key2, "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            map2.put(key2, value2);
        }
        for (Map.Entry entry7 : this.f15501g.entrySet()) {
            bundle.putFloat((String) entry7.getKey(), ((Number) entry7.getValue()).floatValue());
        }
        Map map3 = this.f15502h;
        for (Map.Entry entry8 : map3.entrySet()) {
            String key3 = (String) entry8.getKey();
            List value3 = (List) entry8.getValue();
            Intrinsics.checkNotNullParameter(key3, "key");
            Intrinsics.checkNotNullParameter(value3, "value");
            map3.put(key3, value3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f15495a, oVar.f15495a) && Intrinsics.d(this.f15496b, oVar.f15496b) && Intrinsics.d(this.f15497c, oVar.f15497c) && Intrinsics.d(this.f15498d, oVar.f15498d) && Intrinsics.d(this.f15499e, oVar.f15499e) && Intrinsics.d(this.f15500f, oVar.f15500f) && Intrinsics.d(this.f15501g, oVar.f15501g) && Intrinsics.d(this.f15502h, oVar.f15502h);
    }

    public final int hashCode() {
        return this.f15502h.hashCode() + a.c.e(this.f15501g, a.c.e(this.f15500f, a.c.e(this.f15499e, a.c.e(this.f15498d, a.c.e(this.f15497c, a.c.e(this.f15496b, this.f15495a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ScreenResultBundle(booleans=" + this.f15495a + ", booleanArrays=" + this.f15496b + ", strings=" + this.f15497c + ", stringArrays=" + this.f15498d + ", ints=" + this.f15499e + ", intArrays=" + this.f15500f + ", floats=" + this.f15501g + ", floatArrays=" + this.f15502h + ")";
    }
}
