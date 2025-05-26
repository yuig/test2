package eb;

import com.bugsnag.android.ErrorType;
import com.bugsnag.android.y0;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.k0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.e0;
import kotlin.text.z;

/* loaded from: classes3.dex */
public final class d implements zb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58185a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d() {
        this(6);
        this.f58185a = 6;
    }

    public static gc.a f(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new gc.a(httpURLConnection);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6.f29247l, java.lang.Boolean.TRUE) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bugsnag.android.y0 h(java.lang.Object r8, java.lang.String r9, hd.h r10) {
        /*
            eb.d r0 = com.bugsnag.android.y0.f29694f
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r3 = r0.toString()
            long r4 = java.lang.System.currentTimeMillis()
            boolean r0 = r8 instanceof com.bugsnag.android.x0
            if (r0 == 0) goto L1b
            r9 = r8
            com.bugsnag.android.x0 r9 = (com.bugsnag.android.x0) r9
            com.bugsnag.android.z0 r9 = r9.f29685a
            java.lang.String r9 = r9.f29723h
        L19:
            r2 = r9
            goto L26
        L1b:
            if (r9 == 0) goto L23
            int r1 = r9.length()
            if (r1 != 0) goto L19
        L23:
            java.lang.String r9 = r10.f68809a
            goto L19
        L26:
            com.bugsnag.android.y0 r9 = new com.bugsnag.android.y0
            r10 = 0
            java.lang.String r1 = "startupcrash"
            if (r0 == 0) goto L48
            r6 = r8
            com.bugsnag.android.x0 r6 = (com.bugsnag.android.x0) r6
            com.bugsnag.android.z0 r6 = r6.f29685a
            com.bugsnag.android.h r6 = r6.f29724i
            if (r6 == 0) goto L42
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Boolean r6 = r6.f29247l
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L48
        L40:
            r6 = r1
            goto L54
        L42:
            java.lang.String r8 = "app"
            kotlin.jvm.internal.Intrinsics.r(r8)
            throw r10
        L48:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r6)
            if (r10 == 0) goto L51
            goto L40
        L51:
            java.lang.String r10 = ""
            r6 = r10
        L54:
            if (r0 == 0) goto L60
            com.bugsnag.android.x0 r8 = (com.bugsnag.android.x0) r8
            com.bugsnag.android.z0 r8 = r8.f29685a
            java.util.LinkedHashSet r8 = r8.a()
        L5e:
            r7 = r8
            goto L67
        L60:
            com.bugsnag.android.ErrorType r8 = com.bugsnag.android.ErrorType.C
            java.util.Set r8 = kotlin.collections.g1.b(r8)
            goto L5e
        L67:
            r1 = r9
            r1.<init>(r2, r3, r4, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.d.h(java.lang.Object, java.lang.String, hd.h):com.bugsnag.android.y0");
    }

    public static ConcurrentHashMap j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k0.u(((Map) it.next()).keySet(), arrayList);
        }
        Set<String> J0 = CollectionsKt.J0(arrayList);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            for (String str : J0) {
                Object obj = concurrentHashMap.get(str);
                Object obj2 = map.get(str);
                if (obj2 != null) {
                    if ((obj instanceof Map) && (obj2 instanceof Map)) {
                        concurrentHashMap.put(str, j(f0.j((Map) obj, (Map) obj2)));
                    } else {
                        concurrentHashMap.put(str, obj2);
                    }
                } else if (obj != null) {
                    concurrentHashMap.put(str, obj);
                }
            }
        }
        return concurrentHashMap;
    }

    @Override // zb.b
    public final boolean a(float f13) {
        throw new IllegalStateException("not implemented");
    }

    @Override // zb.b
    public final kc.a b() {
        throw new IllegalStateException("not implemented");
    }

    @Override // zb.b
    public final boolean c(float f13) {
        return false;
    }

    @Override // zb.b
    public final float d() {
        return 0.0f;
    }

    @Override // zb.b
    public final float e() {
        return 1.0f;
    }

    public final long g(File file) {
        String C;
        switch (this.f58185a) {
            case 18:
                Long h03 = StringsKt.h0(StringsKt.e0(il2.m.h(file), "_", "-1"));
                if (h03 == null) {
                    return -1L;
                }
                return h03.longValue();
            default:
                String name = file.getName();
                if (z.h(file.getName(), "_v3.json", false)) {
                    String name2 = file.getName();
                    name = StringsKt.Z('_', name2, name2);
                }
                String name3 = file.getName();
                if (z.h(file.getName(), "_v3.json", false)) {
                    String name4 = file.getName();
                    name3 = StringsKt.Z('_', name4, name4);
                }
                if (name3.length() < 36) {
                    name3 = null;
                }
                String str = "";
                if (name3 != null && (C = e0.C(36, name3)) != null) {
                    str = C;
                }
                String y13 = e0.y(str.length(), name);
                Long h04 = StringsKt.h0(StringsKt.d0('_', y13, y13));
                if (h04 == null) {
                    return -1L;
                }
                return h04.longValue();
        }
    }

    public final y0 i(File file, hd.h hVar) {
        String str;
        Set set;
        List split$default;
        String S = StringsKt.S("_startupcrash.json", file.getName());
        int i13 = 0;
        int L = StringsKt.L(S, "_", 0, false, 6) + 1;
        int L2 = StringsKt.L(S, "_", L, false, 4);
        if (L == 0 || L2 == -1 || L2 <= L) {
            str = null;
        } else {
            str = S.substring(L, L2);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        String str2 = str == null ? hVar.f68809a : str;
        long g13 = g(file);
        String h10 = il2.m.h(file);
        String substring = h10.substring(StringsKt.N(h10, "_", 0, 6) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        if (!Intrinsics.d(substring, "startupcrash") && !Intrinsics.d(substring, "not-jvm")) {
            substring = "";
        }
        String str3 = substring;
        String name = file.getName();
        int N = StringsKt.N(name, "_", StringsKt.N(name, "_", 0, 6) - 1, 4);
        int N2 = StringsKt.N(name, "_", N - 1, 4) + 1;
        if (N2 < N) {
            String substring2 = name.substring(N2, N);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            split$default = StringsKt__StringsKt.split$default(substring2, new String[]{","}, false, 0, 6, null);
            ErrorType[] values = ErrorType.values();
            ArrayList arrayList = new ArrayList();
            int length = values.length;
            while (i13 < length) {
                ErrorType errorType = values[i13];
                i13++;
                if (split$default.contains(errorType.getDesc())) {
                    arrayList.add(errorType);
                }
            }
            set = CollectionsKt.J0(arrayList);
        } else {
            set = s0.f80394a;
        }
        return new y0(str2, "", g13, str3, set);
    }

    @Override // zb.b
    public final boolean isEmpty() {
        return true;
    }

    public /* synthetic */ d(int i13) {
        this.f58185a = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13, int i14) {
        this(0);
        this.f58185a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
            case 7:
            default:
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
