package lb0;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import uj2.a0;
import xk2.v;

/* loaded from: classes.dex */
public final class m implements SharedPreferences.Editor {

    /* renamed from: d, reason: collision with root package name */
    public static final v f82718d = xk2.m.b(k.f82712j);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f82719a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f82720b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f82721c;

    public m(SharedPreferences.Editor editor, Map appliedButUncommittedChanges) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        Intrinsics.checkNotNullParameter(appliedButUncommittedChanges, "appliedButUncommittedChanges");
        this.f82719a = editor;
        this.f82720b = appliedButUncommittedChanges;
        this.f82721c = new LinkedHashMap();
    }

    public final void a(Object obj, String str) {
        b.q();
        LinkedHashMap linkedHashMap = this.f82721c;
        if (obj == null) {
            linkedHashMap.put(str, j.f82711a);
        } else {
            linkedHashMap.put(str, obj);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        LinkedHashMap linkedHashMap = this.f82721c;
        this.f82720b.putAll(linkedHashMap);
        linkedHashMap.clear();
        new fk2.g(new f00.c(this, 2), 1).l((a0) f82718d.getValue()).i(new vy.c(4), new mc.h(29, l.f82717i));
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        Map map = this.f82720b;
        Iterator it = CollectionsKt.F0(map.keySet()).iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), j.f82711a);
        }
        this.f82721c.clear();
        this.f82719a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        LinkedHashMap linkedHashMap = this.f82721c;
        this.f82720b.putAll(linkedHashMap);
        linkedHashMap.clear();
        return this.f82719a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z13) {
        a(Boolean.valueOf(z13), str);
        this.f82719a.putBoolean(str, z13);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f13) {
        a(Float.valueOf(f13), str);
        this.f82719a.putFloat(str, f13);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i13) {
        a(Integer.valueOf(i13), str);
        this.f82719a.putInt(str, i13);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j13) {
        a(Long.valueOf(j13), str);
        this.f82719a.putLong(str, j13);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str2, str);
        this.f82719a.putString(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(set, str);
        this.f82719a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        a(null, str);
        this.f82719a.remove(str);
        return this;
    }
}
