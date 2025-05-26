package q7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f102639a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102640b;

    /* renamed from: c, reason: collision with root package name */
    public final List f102641c;

    /* renamed from: d, reason: collision with root package name */
    public final List f102642d;

    /* renamed from: e, reason: collision with root package name */
    public final f f102643e;

    public h(String str, long j13, ArrayList arrayList, List list, f fVar) {
        this.f102639a = str;
        this.f102640b = j13;
        this.f102641c = Collections.unmodifiableList(arrayList);
        this.f102642d = Collections.unmodifiableList(list);
        this.f102643e = fVar;
    }

    public final int a() {
        List list = this.f102641c;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((a) list.get(i13)).f102595b == 2) {
                return i13;
            }
        }
        return -1;
    }
}
