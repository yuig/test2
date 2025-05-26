package tc;

import com.apollographql.apollo3.exception.JsonDataException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kh2.n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Map f117194a;

    /* renamed from: b, reason: collision with root package name */
    public final List f117195b;

    /* renamed from: c, reason: collision with root package name */
    public e f117196c;

    /* renamed from: d, reason: collision with root package name */
    public Object f117197d;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f117198e;

    /* renamed from: f, reason: collision with root package name */
    public final Map[] f117199f;

    /* renamed from: g, reason: collision with root package name */
    public final Iterator[] f117200g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f117201h;

    /* renamed from: i, reason: collision with root package name */
    public int f117202i;

    public i(List pathRoot, Map root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(pathRoot, "pathRoot");
        this.f117194a = root;
        this.f117195b = pathRoot;
        this.f117198e = new Object[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        this.f117199f = new Map[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        this.f117200g = new Iterator[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        this.f117201h = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        this.f117196c = e.BEGIN_OBJECT;
        this.f117197d = root;
    }

    public static e c(Object obj) {
        if (obj == null) {
            return e.NULL;
        }
        if (obj instanceof List) {
            return e.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return e.BEGIN_OBJECT;
        }
        if (obj instanceof Integer) {
            return e.NUMBER;
        }
        if (obj instanceof Long) {
            return e.LONG;
        }
        if (!(obj instanceof Double) && !(obj instanceof d)) {
            return obj instanceof String ? e.STRING : obj instanceof Boolean ? e.BOOLEAN : e.ANY;
        }
        return e.NUMBER;
    }

    @Override // tc.f
    public final void B1() {
        if (this.f117196c == e.NULL) {
            a();
            return;
        }
        throw new JsonDataException("Expected NULL but was " + this.f117196c + " at path " + d());
    }

    @Override // tc.f
    public final void E() {
        a();
    }

    @Override // tc.f
    public final boolean R0() {
        if (this.f117196c == e.BOOLEAN) {
            Object obj = this.f117197d;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
            a();
            return ((Boolean) obj).booleanValue();
        }
        throw new JsonDataException("Expected BOOLEAN but was " + this.f117196c + " at path " + d());
    }

    @Override // tc.f
    public final d U1() {
        d dVar;
        int i13 = h.f117193a[this.f117196c.ordinal()];
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new JsonDataException("Expected a Number but was " + this.f117196c + " at path " + d());
        }
        Object obj = this.f117197d;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) {
            dVar = new d(obj.toString());
        } else if (obj instanceof String) {
            dVar = new d((String) obj);
        } else {
            if (!(obj instanceof d)) {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
            dVar = (d) obj;
        }
        a();
        return dVar;
    }

    @Override // tc.f
    public final int V1(List names) {
        Intrinsics.checkNotNullParameter(names, "names");
        while (hasNext()) {
            String k03 = k0();
            int i13 = this.f117202i - 1;
            int[] iArr = this.f117201h;
            int i14 = iArr[i13];
            if (i14 >= names.size() || !Intrinsics.d(names.get(i14), k03)) {
                i14 = names.indexOf(k03);
                if (i14 != -1) {
                    iArr[this.f117202i - 1] = i14 + 1;
                }
            } else {
                int i15 = this.f117202i - 1;
                iArr[i15] = iArr[i15] + 1;
            }
            if (i14 != -1) {
                return i14;
            }
            a();
        }
        return -1;
    }

    @Override // tc.f
    public final long W1() {
        long parseLong;
        int i13 = h.f117193a[this.f117196c.ordinal()];
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new JsonDataException("Expected a Long but was " + this.f117196c + " at path " + d());
        }
        Object obj = this.f117197d;
        if (obj instanceof Integer) {
            parseLong = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            parseLong = n.b(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseLong = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof d)) {
                throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
            }
            parseLong = Long.parseLong(((d) obj).f117192a);
        }
        a();
        return parseLong;
    }

    @Override // tc.f
    public final String Y0() {
        int i13 = h.f117193a[this.f117196c.ordinal()];
        if (i13 == 3 || i13 == 4 || i13 == 5) {
            Object obj = this.f117197d;
            Intrinsics.f(obj);
            String obj2 = obj.toString();
            a();
            return obj2;
        }
        throw new JsonDataException("Expected a String but was " + this.f117196c + " at path " + d());
    }

    public final void a() {
        int i13 = this.f117202i;
        if (i13 == 0) {
            this.f117196c = e.END_DOCUMENT;
            return;
        }
        Iterator it = this.f117200g[i13 - 1];
        Intrinsics.f(it);
        int i14 = this.f117202i - 1;
        Object[] objArr = this.f117198e;
        Object obj = objArr[i14];
        if (obj instanceof Integer) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i14] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.f117196c = objArr[this.f117202i + (-1)] instanceof Integer ? e.END_ARRAY : e.END_OBJECT;
            return;
        }
        Object next = it.next();
        this.f117197d = next;
        this.f117196c = next instanceof Map.Entry ? e.NAME : c(next);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String d() {
        return CollectionsKt.Z(r(), ".", null, null, 0, null, null, 62);
    }

    @Override // tc.f
    public final boolean hasNext() {
        int i13 = h.f117193a[this.f117196c.ordinal()];
        return (i13 == 1 || i13 == 2) ? false : true;
    }

    @Override // tc.f
    public final String k0() {
        if (this.f117196c != e.NAME) {
            throw new JsonDataException("Expected NAME but was " + this.f117196c + " at path " + d());
        }
        Object obj = this.f117197d;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
        Map.Entry entry = (Map.Entry) obj;
        this.f117198e[this.f117202i - 1] = entry.getKey();
        this.f117197d = entry.getValue();
        this.f117196c = c(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // tc.f
    public final int o0() {
        int parseInt;
        int i13 = h.f117193a[this.f117196c.ordinal()];
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new JsonDataException("Expected an Int but was " + this.f117196c + " at path " + d());
        }
        Object obj = this.f117197d;
        if (obj instanceof Integer) {
            parseInt = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseInt = n.d(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseInt = n.a(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseInt = Integer.parseInt((String) obj);
        } else {
            if (!(obj instanceof d)) {
                throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
            }
            parseInt = Integer.parseInt(((d) obj).f117192a);
        }
        a();
        return parseInt;
    }

    @Override // tc.f
    public final e peek() {
        return this.f117196c;
    }

    @Override // tc.f
    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f117195b);
        int i13 = this.f117202i;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = this.f117198e[i14];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // tc.f
    public final f s() {
        if (this.f117196c != e.BEGIN_OBJECT) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + this.f117196c + " at path " + d());
        }
        int i13 = this.f117202i;
        if (i13 >= 256) {
            throw new IllegalStateException("Nesting too deep".toString());
        }
        this.f117202i = i13 + 1;
        Object obj = this.f117197d;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map[] mapArr = this.f117199f;
        mapArr[i13] = (Map) obj;
        int i14 = this.f117202i - 1;
        Map map = mapArr[i14];
        this.f117198e[i14] = null;
        Intrinsics.f(map);
        this.f117200g[i14] = map.entrySet().iterator();
        this.f117201h[this.f117202i - 1] = 0;
        a();
        return this;
    }

    @Override // tc.f
    public final double s1() {
        double parseDouble;
        int i13 = h.f117193a[this.f117196c.ordinal()];
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new JsonDataException("Expected a Double but was " + this.f117196c + " at path " + d());
        }
        Object obj = this.f117197d;
        if (obj instanceof Integer) {
            parseDouble = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseDouble = n.c(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            parseDouble = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof d)) {
                throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
            }
            parseDouble = Double.parseDouble(((d) obj).f117192a);
        }
        a();
        return parseDouble;
    }

    @Override // tc.f
    public final f t() {
        if (this.f117196c != e.END_ARRAY) {
            throw new JsonDataException("Expected END_ARRAY but was " + this.f117196c + " at path " + d());
        }
        int i13 = this.f117202i - 1;
        this.f117202i = i13;
        this.f117200g[i13] = null;
        this.f117198e[i13] = null;
        a();
        return this;
    }

    @Override // tc.f
    public final f u() {
        if (this.f117196c != e.BEGIN_ARRAY) {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + this.f117196c + " at path " + d());
        }
        Object obj = this.f117197d;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        int i13 = this.f117202i;
        if (i13 >= 256) {
            throw new IllegalStateException("Nesting too deep".toString());
        }
        this.f117202i = i13 + 1;
        this.f117198e[i13] = -1;
        this.f117200g[this.f117202i - 1] = list.iterator();
        a();
        return this;
    }

    @Override // tc.f
    public final f v() {
        int i13 = this.f117202i - 1;
        this.f117202i = i13;
        this.f117200g[i13] = null;
        this.f117198e[i13] = null;
        this.f117199f[i13] = null;
        a();
        return this;
    }

    public i(Map map) {
        this(q0.f80391a, map);
    }
}
