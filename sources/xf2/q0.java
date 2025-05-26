package xf2;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f134889a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134890b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f134891c;

    public /* synthetic */ q0(c0 c0Var) {
        this(c0Var, "");
    }

    public abstract Map a();

    public q0(c0 c0Var, String str) {
        this.f134889a = c0Var;
        this.f134890b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c0Var.a() != r0.DEFAULT) {
            linkedHashMap.put(sh2.h.f112969r.f134855a, c0Var.a().name());
        }
        this.f134891c = linkedHashMap;
    }
}
