package xe1;

import com.pinterest.api.model.xk;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class z implements uo0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xo0.o f134828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xk f134829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f134830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f134831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f134832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f134833f;

    public z(int i13, xk xkVar, xo0.o oVar, String str, HashMap hashMap, Function2 function2) {
        this.f134828a = oVar;
        this.f134829b = xkVar;
        this.f134830c = i13;
        this.f134831d = hashMap;
        this.f134832e = function2;
        this.f134833f = str;
    }

    @Override // uo0.c
    public final h32.r a() {
        xk xkVar = this.f134829b;
        this.f134828a.b(this.f134830c, xkVar);
        return null;
    }

    @Override // uo0.c
    public final h32.r b() {
        this.f134828a.a(this.f134829b);
        return null;
    }

    @Override // uo0.c
    public final void c() {
        xk xkVar = this.f134829b;
        HashMap hashMap = this.f134831d;
        if (hashMap != null) {
            hashMap.put("grid_container_item_position", String.valueOf(this.f134830c));
            String n13 = xkVar.n();
            if (n13 == null || n13.length() == 0) {
                String str = this.f134833f;
                if (str != null && str.length() != 0) {
                    hashMap.put("grid_container_item_title", str);
                }
            } else {
                hashMap.put("grid_container_item_title", xkVar.n());
            }
        }
        this.f134832e.invoke(xkVar, hashMap);
    }
}
