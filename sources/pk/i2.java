package pk;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public class i2 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f100422a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f100423b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f100424c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f100425d;

    public i2(AbstractMap abstractMap, AbstractMap abstractMap2, AbstractMap abstractMap3, AbstractMap abstractMap4) {
        this.f100422a = bf.b.b(abstractMap);
        this.f100423b = bf.b.b(abstractMap2);
        this.f100424c = bf.b.b(abstractMap3);
        this.f100425d = bf.b.b(abstractMap4);
    }

    @Override // pk.c2
    public Map a() {
        return this.f100423b;
    }

    @Override // pk.c2
    public Map b() {
        return this.f100422a;
    }

    @Override // pk.c2
    public Map c() {
        return this.f100425d;
    }

    @Override // pk.c2
    public Map d() {
        return this.f100424c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return b().equals(c2Var.b()) && a().equals(c2Var.a()) && d().equals(c2Var.d()) && c().equals(c2Var.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a(), d(), c()});
    }

    public final String toString() {
        Map map = this.f100422a;
        boolean isEmpty = map.isEmpty();
        Map map2 = this.f100425d;
        Map map3 = this.f100423b;
        if (isEmpty && map3.isEmpty() && map2.isEmpty()) {
            return "equal";
        }
        StringBuilder sb3 = new StringBuilder("not equal");
        if (!map.isEmpty()) {
            sb3.append(": only on left=");
            sb3.append(map);
        }
        if (!map3.isEmpty()) {
            sb3.append(": only on right=");
            sb3.append(map3);
        }
        if (!map2.isEmpty()) {
            sb3.append(": value differences=");
            sb3.append(map2);
        }
        return sb3.toString();
    }
}
