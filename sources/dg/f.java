package dg;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f extends e {

    /* renamed from: d, reason: collision with root package name */
    public final String f54914d;

    public f(String str, a[] aVarArr) {
        super(aVarArr);
        this.f54914d = str;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[Missing: ");
        sb3.append(this.f54914d);
        sb3.append(" Guards: ");
        return a.c.j(sb3, Arrays.asList(this.f54912a), "]");
    }
}
