package or0;

import java.util.Map;
import uj2.q;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final rr0.a f97248a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f97249b;

    /* renamed from: c, reason: collision with root package name */
    public int f97250c;

    /* renamed from: d, reason: collision with root package name */
    public final qo1.b f97251d;

    /* renamed from: e, reason: collision with root package name */
    public String f97252e;

    public b(rr0.a aVar, boolean z13) {
        this.f97248a = aVar;
        this.f97249b = z13;
        this.f97251d = new qo1.b(z13);
    }

    public abstract q a(Map map);

    public abstract q b(String str);
}
