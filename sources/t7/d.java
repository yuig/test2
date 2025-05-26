package t7;

import a7.o0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class d implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f116468d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a, reason: collision with root package name */
    public l9.j f116469a = new bk.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f116470b;

    /* renamed from: c, reason: collision with root package name */
    public int f116471c;

    public static void a(int i13, ArrayList arrayList) {
        if (d7.b.a0(i13, 0, 7, f116468d) == -1 || arrayList.contains(Integer.valueOf(i13))) {
            return;
        }
        arrayList.add(Integer.valueOf(i13));
    }

    public final androidx.media3.common.b b(androidx.media3.common.b bVar) {
        String str;
        if (!this.f116470b || !this.f116469a.r(bVar)) {
            return bVar;
        }
        a7.q a13 = bVar.a();
        a13.f1181n = o0.r("application/x-media3-cues");
        a13.f1167J = this.f116469a.h(bVar);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(bVar.f18765o);
        String str2 = bVar.f18761k;
        if (str2 != null) {
            str = " " + str2;
        } else {
            str = "";
        }
        sb3.append(str);
        a13.f1177j = sb3.toString();
        a13.f1186s = Long.MAX_VALUE;
        return a13.a();
    }
}
