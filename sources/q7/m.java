package q7;

import d7.n0;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pk.c1;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.b f102657a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f102658b;

    /* renamed from: c, reason: collision with root package name */
    public final long f102659c;

    /* renamed from: d, reason: collision with root package name */
    public final List f102660d;

    /* renamed from: e, reason: collision with root package name */
    public final List f102661e;

    /* renamed from: f, reason: collision with root package name */
    public final List f102662f;

    /* renamed from: g, reason: collision with root package name */
    public final j f102663g;

    public m(androidx.media3.common.b bVar, c1 c1Var, s sVar, ArrayList arrayList, List list, List list2) {
        bf.b.i(!c1Var.isEmpty());
        this.f102657a = bVar;
        this.f102658b = c1.r(c1Var);
        this.f102660d = Collections.unmodifiableList(arrayList);
        this.f102661e = list;
        this.f102662f = list2;
        this.f102663g = sVar.a(this);
        int i13 = n0.f53866a;
        this.f102659c = n0.g0(sVar.f102679b, 1000000L, sVar.f102678a, RoundingMode.DOWN);
    }

    public abstract String k();

    public abstract p7.k l();

    public abstract j m();

    public final j n() {
        return this.f102663g;
    }
}
