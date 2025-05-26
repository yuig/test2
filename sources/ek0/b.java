package ek0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f59163a;

    public /* synthetic */ b(int i13) {
        this.f59163a = i13;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f59163a) {
            case 0:
                String name = (String) obj;
                Intrinsics.checkNotNullParameter(name, "name");
                return new bk0.c(name, null);
            case 1:
                return ((ri2.e) obj).f108404b;
            case 2:
                return ((Map.Entry) obj).getValue().toString();
            case 3:
                return (String) ((Map.Entry) obj).getValue();
            case 4:
                return new ConcurrentHashMap();
            case 5:
                return new ConcurrentHashMap();
            case 6:
                return new ConcurrentHashMap();
            case 7:
                return new ConcurrentHashMap();
            case 8:
                int i13 = fj2.c.f62261c;
                kj2.b bVar = new kj2.b();
                new HashMap();
                return bVar;
            case 9:
                ((jj2.a) obj).getClass();
                return null;
            default:
                return ri2.e.a(qi2.c.STRING_ARRAY, (String) obj);
        }
    }
}
