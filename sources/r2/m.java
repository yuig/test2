package r2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f106056a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f106057b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f106058c;

    public m(Map map, Function1 function1) {
        this.f106056a = function1;
        this.f106057b = map != null ? z0.r(map) : new LinkedHashMap();
        this.f106058c = new LinkedHashMap();
    }

    @Override // r2.k
    public final boolean b(Object obj) {
        return ((Boolean) this.f106056a.invoke(obj)).booleanValue();
    }

    @Override // r2.k
    public final Map c() {
        LinkedHashMap r13 = z0.r(this.f106057b);
        for (Map.Entry entry : this.f106058c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object invoke = ((Function0) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else {
                    if (!b(invoke)) {
                        throw new IllegalStateException(so.a.c(invoke).toString());
                    }
                    r13.put(str, f0.d(invoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i13 = 0; i13 < size; i13++) {
                    Object invoke2 = ((Function0) list.get(i13)).invoke();
                    if (invoke2 != null && !b(invoke2)) {
                        throw new IllegalStateException(so.a.c(invoke2).toString());
                    }
                    arrayList.add(invoke2);
                }
                r13.put(str, arrayList);
            }
        }
        return r13;
    }

    @Override // r2.k
    public final Object d(String str) {
        LinkedHashMap linkedHashMap = this.f106057b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // r2.k
    public final l f(Function0 function0, String str) {
        int length = str.length();
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                z13 = true;
                break;
            }
            if (!CharsKt.c(str.charAt(i13))) {
                break;
            }
            i13++;
        }
        if (!(!z13)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        LinkedHashMap linkedHashMap = this.f106058c;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(str, obj);
        }
        ((List) obj).add(function0);
        return new l(this, str, function0);
    }
}
