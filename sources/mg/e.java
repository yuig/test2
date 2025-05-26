package mg;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final tb.e f87143a;

    /* renamed from: b, reason: collision with root package name */
    public final c f87144b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f87145c;

    public e(Context context, c cVar) {
        tb.e eVar = new tb.e();
        eVar.f116964b = null;
        eVar.f116963a = context;
        this.f87145c = new HashMap();
        this.f87143a = eVar;
        this.f87144b = cVar;
    }

    public final synchronized g a(String str) {
        if (this.f87145c.containsKey(str)) {
            return (g) this.f87145c.get(str);
        }
        CctBackendFactory c13 = this.f87143a.c(str);
        if (c13 == null) {
            return null;
        }
        c cVar = this.f87144b;
        g create = c13.create(b.a(cVar.f87136a, cVar.f87137b, cVar.f87138c, str));
        this.f87145c.put(str, create);
        return create;
    }
}
