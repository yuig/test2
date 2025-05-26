package ch;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class j implements com.google.android.gms.common.api.b {

    /* renamed from: b, reason: collision with root package name */
    public static final j f27724b;

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f27725a;

    static {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey("accountTypes")) {
            bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
        }
        f27724b = new j(bundle);
    }

    public /* synthetic */ j(Bundle bundle) {
        this.f27725a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        Bundle bundle = new Bundle(this.f27725a);
        jVar.getClass();
        Bundle bundle2 = new Bundle(jVar.f27725a);
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str) || !com.bumptech.glide.c.x(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundle = new Bundle(this.f27725a);
        int size = bundle.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(bundle.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            String str = (String) arrayList2.get(i13);
            arrayList.add(str);
            arrayList.add(bundle.get(str));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }
}
