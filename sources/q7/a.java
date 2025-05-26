package q7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f102594a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102595b;

    /* renamed from: c, reason: collision with root package name */
    public final List f102596c;

    /* renamed from: d, reason: collision with root package name */
    public final List f102597d;

    /* renamed from: e, reason: collision with root package name */
    public final List f102598e;

    /* renamed from: f, reason: collision with root package name */
    public final List f102599f;

    public a(long j13, int i13, ArrayList arrayList, List list, List list2, List list3) {
        this.f102594a = j13;
        this.f102595b = i13;
        this.f102596c = Collections.unmodifiableList(arrayList);
        this.f102597d = Collections.unmodifiableList(list);
        this.f102598e = Collections.unmodifiableList(list2);
        this.f102599f = Collections.unmodifiableList(list3);
    }
}
