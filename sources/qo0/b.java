package qo0;

import java.util.HashMap;
import nx.f0;

/* loaded from: classes5.dex */
public final class b extends a {

    /* renamed from: j, reason: collision with root package name */
    public final String f104524j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f104525k;

    public b(String str, String str2, HashMap hashMap, f0 f0Var) {
        super(str, str2, f0Var);
        this.f104524j = str;
        this.f104525k = hashMap;
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            f63135d0 = new HashMap();
        }
        HashMap hashMap = this.f104525k;
        if (hashMap != null) {
            f63135d0.putAll(hashMap);
        }
        String str = this.f104524j;
        if (str != null) {
            f63135d0.put("pin_id", str);
        }
        return f63135d0;
    }
}
