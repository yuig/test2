package i4;

import android.os.LocaleList;
import bk.f;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public LocaleList f71499a;

    /* renamed from: b, reason: collision with root package name */
    public c f71500b;

    /* renamed from: c, reason: collision with root package name */
    public final f f71501c = new f();

    public final c a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f71501c) {
            c cVar = this.f71500b;
            if (cVar != null && localeList == this.f71499a) {
                return cVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.add(new b(localeList.get(i13)));
            }
            c cVar2 = new c(arrayList);
            this.f71499a = localeList;
            this.f71500b = cVar2;
            return cVar2;
        }
    }
}
