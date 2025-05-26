package t51;

import java.util.HashMap;
import java.util.List;
import qb0.b;
import u51.x;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f116436a = new HashMap();

    public static String a(x xVar) {
        List list = (List) f116436a.get(xVar);
        return b.p(list) ? (String) list.get(0) : "";
    }
}
