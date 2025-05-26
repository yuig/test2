package vi;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import wi.e0;
import wi.h;

/* loaded from: classes3.dex */
public final class c extends h implements d {

    /* renamed from: l, reason: collision with root package name */
    public final a f125862l;

    /* renamed from: m, reason: collision with root package name */
    public final List f125863m;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f125864n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f125865o;

    public c(String str, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, Bundle bundle, HashSet hashSet, HashSet hashSet2, LinkedHashMap linkedHashMap2, String str2, a aVar, List list) {
        super(str, linkedHashSet, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, str2);
        this.f125862l = aVar;
        this.f125863m = list;
        this.f125864n = null;
        this.f125865o = false;
    }

    @Override // vi.d
    public final e0 c() {
        return this.f125864n;
    }

    @Override // vi.d
    public final boolean g() {
        return this.f125865o;
    }

    @Override // vi.d
    public final List h() {
        return this.f125863m;
    }

    @Override // vi.d
    public final a k() {
        return this.f125862l;
    }
}
