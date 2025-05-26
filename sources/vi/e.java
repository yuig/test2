package vi;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.q0;
import wi.e0;

/* loaded from: classes3.dex */
public final class e extends dj.e implements d {

    /* renamed from: m, reason: collision with root package name */
    public final a f125866m;

    /* renamed from: n, reason: collision with root package name */
    public final List f125867n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f125868o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f125869p;

    public e(String str, String str2, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, Bundle bundle, HashSet hashSet, HashSet hashSet2, LinkedHashMap linkedHashMap2, String str3, q0 q0Var) {
        super(str, str2, linkedHashSet, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, str3);
        this.f125866m = null;
        this.f125867n = q0Var;
        this.f125868o = null;
        this.f125869p = false;
    }

    @Override // vi.d
    public final e0 c() {
        return this.f125868o;
    }

    @Override // vi.d
    public final boolean g() {
        return this.f125869p;
    }

    @Override // vi.d
    public final List h() {
        return this.f125867n;
    }

    @Override // vi.d
    public final a k() {
        return this.f125866m;
    }
}
