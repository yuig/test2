package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17861a;

    public u() {
        new SparseIntArray();
        this.f17861a = new HashMap();
    }

    public final void a(int i13, t tVar) {
        HashMap hashMap = this.f17861a;
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i13));
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i13), hashSet);
        }
        hashSet.add(new WeakReference(tVar));
    }
}
